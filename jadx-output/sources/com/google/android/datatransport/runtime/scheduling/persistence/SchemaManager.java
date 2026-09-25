package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class SchemaManager extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final java.lang.String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final java.lang.String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final java.lang.String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
    private static final java.lang.String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final java.lang.String DB_NAME = "com.google.android.datatransport.events";
    private static final java.lang.String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
    private static final java.lang.String DROP_EVENTS_SQL = "DROP TABLE events";
    private static final java.lang.String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
    private static final java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration> INCREMENTAL_MIGRATIONS;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V1;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V2;
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration MIGRATE_TO_V3;
    static int SCHEMA_VERSION = 3;
    private boolean configured;
    private final int schemaVersion;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public interface Migration {
        void upgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase);
    }

    static {
        com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration migration = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$1.instance;
        MIGRATE_TO_V1 = migration;
        com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration migration2 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2.instance;
        MIGRATE_TO_V2 = migration2;
        com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration migration3 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$3.instance;
        MIGRATE_TO_V3 = migration3;
        INCREMENTAL_MIGRATIONS = java.util.Arrays.asList(migration, migration2, migration3);
    }

    static /* synthetic */ void lambda$static$0(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_EVENTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_METADATA_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_BACKEND_INDEX_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1);
    }

    static /* synthetic */ void lambda$static$1(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    @javax.inject.Inject
    SchemaManager(android.content.Context context, @javax.inject.Named("SCHEMA_VERSION") int i) {
        super(context, DB_NAME, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, i);
        this.configured = false;
        this.schemaVersion = i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.configured = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new java.lang.String[0]).close();
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    private void ensureConfigured(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (this.configured) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, 0, this.schemaVersion);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ensureConfigured(sQLiteDatabase);
        upgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(DROP_EVENTS_SQL);
        sQLiteDatabase.execSQL(DROP_EVENT_METADATA_SQL);
        sQLiteDatabase.execSQL(DROP_CONTEXTS_SQL);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        ensureConfigured(sQLiteDatabase);
    }

    private void upgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        java.util.List<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration> list = INCREMENTAL_MIGRATIONS;
        if (i2 <= list.size()) {
            while (i < i2) {
                INCREMENTAL_MIGRATIONS.get(i).upgrade(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
