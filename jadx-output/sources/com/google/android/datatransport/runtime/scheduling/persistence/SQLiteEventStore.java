package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@javax.inject.Singleton
public class SQLiteEventStore implements com.google.android.datatransport.runtime.scheduling.persistence.EventStore, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final java.lang.String LOG_TAG = "SQLiteEventStore";
    static final int MAX_RETRIES = 10;
    private static final com.google.android.datatransport.Encoding PROTOBUF_ENCODING = com.google.android.datatransport.Encoding.of("proto");
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig config;
    private final com.google.android.datatransport.runtime.time.Clock monotonicClock;
    private final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager;
    private final com.google.android.datatransport.runtime.time.Clock wallClock;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    interface Function<T, U> {
        U apply(T t);
    }

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    interface Producer<T> {
        T produce();
    }

    @javax.inject.Inject
    SQLiteEventStore(com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig eventStoreConfig, com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager) {
        this.schemaManager = schemaManager;
        this.wallClock = clock;
        this.monotonicClock = clock2;
        this.config = eventStoreConfig;
    }

    private android.database.sqlite.SQLiteDatabase getDb() {
        com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager = this.schemaManager;
        schemaManager.getClass();
        return (android.database.sqlite.SQLiteDatabase) retryIfDbLocked(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$1.lambdaFactory$(schemaManager), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$4.instance);
    }

    static /* synthetic */ android.database.sqlite.SQLiteDatabase lambda$getDb$0(java.lang.Throwable th) {
        throw new com.google.android.datatransport.runtime.synchronization.SynchronizationException("Timed out while trying to open db.", th);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persist(com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Storing event with priority=%s, name=%s for destination %s", transportContext.getPriority(), eventInternal.getTransportName(), transportContext.getBackendName());
        long jLongValue = ((java.lang.Long) inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$5.lambdaFactory$(this, transportContext, eventInternal))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(jLongValue, transportContext, eventInternal);
    }

    static /* synthetic */ java.lang.Long lambda$persist$1(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteEventStore.isStorageAtLimit()) {
            return -1L;
        }
        long jEnsureTransportContext = sQLiteEventStore.ensureTransportContext(sQLiteDatabase, transportContext);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("context_id", java.lang.Long.valueOf(jEnsureTransportContext));
        contentValues.put("transport_name", eventInternal.getTransportName());
        contentValues.put("timestamp_ms", java.lang.Long.valueOf(eventInternal.getEventMillis()));
        contentValues.put("uptime_ms", java.lang.Long.valueOf(eventInternal.getUptimeMillis()));
        contentValues.put("payload_encoding", eventInternal.getEncodedPayload().getEncoding().getName());
        contentValues.put("payload", eventInternal.getEncodedPayload().getBytes());
        contentValues.put("code", eventInternal.getCode());
        contentValues.put("num_attempts", (java.lang.Integer) 0);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : eventInternal.getMetadata().entrySet()) {
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put("event_id", java.lang.Long.valueOf(jInsert));
            contentValues2.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, entry.getKey());
            contentValues2.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues2);
        }
        return java.lang.Long.valueOf(jInsert);
    }

    private long ensureTransportContext(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.TransportContext transportContext) {
        java.lang.Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId != null) {
            return transportContextId.longValue();
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("backend_name", transportContext.getBackendName());
        contentValues.put("priority", java.lang.Integer.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority())));
        contentValues.put("next_request_ms", (java.lang.Integer) 0);
        if (transportContext.getExtras() != null) {
            contentValues.put("extras", android.util.Base64.encodeToString(transportContext.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private java.lang.Long getTransportContextId(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.TransportContext transportContext) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("backend_name = ? and priority = ?");
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(transportContext.getBackendName(), java.lang.String.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority()))));
        if (transportContext.getExtras() != null) {
            sb.append(" and extras = ?");
            arrayList.add(android.util.Base64.encodeToString(transportContext.getExtras(), 0));
        }
        return (java.lang.Long) tryWithCursor(sQLiteDatabase.query("transport_contexts", new java.lang.String[]{"_id"}, sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, null, null), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$6.instance);
    }

    static /* synthetic */ java.lang.Long lambda$getTransportContextId$2(android.database.Cursor cursor) {
        if (cursor.moveToNext()) {
            return java.lang.Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$7.lambdaFactory$("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + toIdList(iterable)));
        }
    }

    static /* synthetic */ java.lang.Object lambda$recordFailure$3(java.lang.String str, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            getDb().compileStatement("DELETE FROM events WHERE _id in " + toIdList(iterable)).execute();
        }
    }

    private static java.lang.String toIdList(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        java.util.Iterator<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getId());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(com.google.android.datatransport.runtime.TransportContext transportContext) {
        return ((java.lang.Long) tryWithCursor(getDb().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new java.lang.String[]{transportContext.getBackendName(), java.lang.String.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority()))}), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$8.instance)).longValue();
    }

    static /* synthetic */ java.lang.Long lambda$getNextCallTime$4(android.database.Cursor cursor) {
        if (cursor.moveToNext()) {
            return java.lang.Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(com.google.android.datatransport.runtime.TransportContext transportContext) {
        return ((java.lang.Boolean) inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$9.lambdaFactory$(this, transportContext))).booleanValue();
    }

    static /* synthetic */ java.lang.Boolean lambda$hasPendingEventsFor$5(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.TransportContext transportContext, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.Long transportContextId = sQLiteEventStore.getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId == null) {
            return false;
        }
        return (java.lang.Boolean) tryWithCursor(sQLiteEventStore.getDb().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new java.lang.String[]{transportContextId.toString()}), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$20.instance);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(com.google.android.datatransport.runtime.TransportContext transportContext, long j) {
        inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$10.lambdaFactory$(j, transportContext));
    }

    static /* synthetic */ java.lang.Object lambda$recordNextCallTime$6(long j, com.google.android.datatransport.runtime.TransportContext transportContext, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("next_request_ms", java.lang.Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new java.lang.String[]{transportContext.getBackendName(), java.lang.String.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority()))}) < 1) {
            contentValues.put("backend_name", transportContext.getBackendName());
            contentValues.put("priority", java.lang.Integer.valueOf(com.google.android.datatransport.runtime.util.PriorityMapping.toInt(transportContext.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadBatch(com.google.android.datatransport.runtime.TransportContext transportContext) {
        return (java.lang.Iterable) inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$11.lambdaFactory$(this, transportContext));
    }

    static /* synthetic */ java.util.List lambda$loadBatch$7(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.TransportContext transportContext, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> listLoadEvents = sQLiteEventStore.loadEvents(sQLiteDatabase, transportContext);
        return sQLiteEventStore.join(listLoadEvents, sQLiteEventStore.loadMetadata(sQLiteDatabase, listLoadEvents));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public java.lang.Iterable<com.google.android.datatransport.runtime.TransportContext> loadActiveContexts() {
        return (java.lang.Iterable) inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$12.instance);
    }

    static /* synthetic */ java.util.List lambda$loadActiveContexts$9(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return (java.util.List) tryWithCursor(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new java.lang.String[0]), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19.instance);
    }

    static /* synthetic */ java.util.List lambda$loadActiveContexts$8(android.database.Cursor cursor) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(cursor.getString(1)).setPriority(com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(cursor.getInt(2))).setExtras(maybeBase64Decode(cursor.getString(3))).build());
        }
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        return ((java.lang.Integer) inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$13.lambdaFactory$(this.wallClock.getTime() - this.config.getEventCleanUpAge()))).intValue();
    }

    static /* synthetic */ java.lang.Integer lambda$cleanUp$10(long j, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return java.lang.Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", new java.lang.String[]{java.lang.String.valueOf(j)}));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.schemaManager.close();
    }

    public void clearDb() {
        inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$14.instance);
    }

    static /* synthetic */ java.lang.Object lambda$clearDb$11(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new java.lang.String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new java.lang.String[0]);
        return null;
    }

    private static byte[] maybeBase64Decode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 0);
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadEvents(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.TransportContext transportContext) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Long transportContextId = getTransportContextId(sQLiteDatabase, transportContext);
        if (transportContextId == null) {
            return arrayList;
        }
        tryWithCursor(sQLiteDatabase.query("events", new java.lang.String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", new java.lang.String[]{transportContextId.toString()}, null, null, null, java.lang.String.valueOf(this.config.getLoadBatchSize())), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$15.lambdaFactory$(arrayList, transportContext));
        return arrayList;
    }

    static /* synthetic */ java.lang.Object lambda$loadEvents$12(java.util.List list, com.google.android.datatransport.runtime.TransportContext transportContext, android.database.Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            com.google.android.datatransport.runtime.EventInternal.Builder encodedPayload = com.google.android.datatransport.runtime.EventInternal.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3)).setEncodedPayload(new com.google.android.datatransport.runtime.EncodedPayload(toEncoding(cursor.getString(4)), cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                encodedPayload.setCode(java.lang.Integer.valueOf(cursor.getInt(6)));
            }
            list.add(com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(j, transportContext, encodedPayload.build()));
        }
        return null;
    }

    private static com.google.android.datatransport.Encoding toEncoding(java.lang.String str) {
        if (str == null) {
            return PROTOBUF_ENCODING;
        }
        return com.google.android.datatransport.Encoding.of(str);
    }

    private java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> loadMetadata(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> list) {
        java.util.HashMap map = new java.util.HashMap();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).getId());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        tryWithCursor(sQLiteDatabase.query("event_metadata", new java.lang.String[]{"event_id", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "value"}, sb.toString(), null, null, null, null), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$16.lambdaFactory$(map));
        return map;
    }

    static /* synthetic */ java.lang.Object lambda$loadMetadata$13(java.util.Map map, android.database.Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            java.util.Set hashSet = (java.util.Set) map.get(java.lang.Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
                map.put(java.lang.Long.valueOf(j), hashSet);
            }
            hashSet.add(new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata(cursor.getString(1), cursor.getString(2)));
        }
    }

    private java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> join(java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> list, java.util.Map<java.lang.Long, java.util.Set<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata>> map) {
        java.util.ListIterator<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent next = listIterator.next();
            if (map.containsKey(java.lang.Long.valueOf(next.getId()))) {
                com.google.android.datatransport.runtime.EventInternal.Builder builder = next.getEvent().toBuilder();
                for (com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Metadata metadata : map.get(java.lang.Long.valueOf(next.getId()))) {
                    builder.addMetadata(metadata.key, metadata.value);
                }
                listIterator.set(com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent.create(next.getId(), next.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    private <T> T retryIfDbLocked(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer<T> producer, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<java.lang.Throwable, T> function) {
        long time = this.monotonicClock.getTime();
        while (true) {
            try {
                return producer.produce();
            } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                if (this.monotonicClock.getTime() >= ((long) this.config.getCriticalSectionEnterTimeoutMs()) + time) {
                    return function.apply(e);
                }
                android.os.SystemClock.sleep(50L);
            }
        }
    }

    private void ensureBeginTransaction(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        retryIfDbLocked(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$17.lambdaFactory$(sQLiteDatabase), com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$18.instance);
    }

    static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$14(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    static /* synthetic */ java.lang.Object lambda$ensureBeginTransaction$15(java.lang.Throwable th) {
        throw new com.google.android.datatransport.runtime.synchronization.SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection<T> criticalSection) {
        android.database.sqlite.SQLiteDatabase db = getDb();
        ensureBeginTransaction(db);
        try {
            T tExecute = criticalSection.execute();
            db.setTransactionSuccessful();
            return tExecute;
        } finally {
            db.endTransaction();
        }
    }

    private <T> T inTransaction(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.sqlite.SQLiteDatabase, T> function) {
        android.database.sqlite.SQLiteDatabase db = getDb();
        db.beginTransaction();
        try {
            T tApply = function.apply(db);
            db.setTransactionSuccessful();
            return tApply;
        } finally {
            db.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    static class Metadata {
        final java.lang.String key;
        final java.lang.String value;

        private Metadata(java.lang.String str, java.lang.String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    private boolean isStorageAtLimit() {
        return getPageCount() * getPageSize() >= this.config.getMaxStorageSizeInBytes();
    }

    long getByteSize() {
        return getPageCount() * getPageSize();
    }

    private long getPageSize() {
        return getDb().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private long getPageCount() {
        return getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private static <T> T tryWithCursor(android.database.Cursor cursor, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function<android.database.Cursor, T> function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }
}
