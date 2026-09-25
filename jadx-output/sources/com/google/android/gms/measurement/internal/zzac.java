package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzac extends com.google.android.gms.measurement.internal.zzkp {
    private static final java.lang.String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final java.lang.String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final java.lang.String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final java.lang.String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final java.lang.String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final java.lang.String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final java.lang.String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final java.lang.String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final com.google.android.gms.measurement.internal.zzad zzj;
    private final com.google.android.gms.measurement.internal.zzkl zzk;

    zzac(com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzksVar);
        this.zzk = new com.google.android.gms.measurement.internal.zzkl(zzm());
        this.zzj = new com.google.android.gms.measurement.internal.zzad(this, zzn(), "google_app_measurement.db");
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        return false;
    }

    public final void zzf() {
        zzak();
        c_().beginTransaction();
    }

    public final void b_() {
        zzak();
        c_().setTransactionSuccessful();
    }

    public final void zzh() {
        zzak();
        c_().endTransaction();
    }

    private final long zzb(java.lang.String str, java.lang.String[] strArr) {
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorRawQuery = c_().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j = cursorRawQuery.getLong(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return j;
                }
                throw new android.database.sqlite.SQLiteException("Database returned empty set");
            } catch (android.database.sqlite.SQLiteException e) {
                zzr().zzf().zza("Database error", str, e);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zza(java.lang.String str, java.lang.String[] strArr, long j) {
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = c_().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (android.database.sqlite.SQLiteException e) {
                zzr().zzf().zza("Database error", str, e);
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    final android.database.sqlite.SQLiteDatabase c_() {
        zzd();
        try {
            return this.zzj.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzi().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    public final com.google.android.gms.measurement.internal.zzaj zza(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        android.database.Cursor cursor;
        java.lang.Boolean boolValueOf;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        boolean zZze = zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzbn);
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling"));
        if (zZze) {
            arrayList.add("current_session_count");
        }
        android.database.Cursor cursor2 = null;
        try {
            cursorQuery = c_().query("events", (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                long j = cursorQuery.getLong(0);
                long j2 = cursorQuery.getLong(1);
                long j3 = cursorQuery.getLong(2);
                long j4 = 0;
                long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                java.lang.Long lValueOf = cursorQuery.isNull(4) ? null : java.lang.Long.valueOf(cursorQuery.getLong(4));
                java.lang.Long lValueOf2 = cursorQuery.isNull(5) ? null : java.lang.Long.valueOf(cursorQuery.getLong(5));
                java.lang.Long lValueOf3 = cursorQuery.isNull(6) ? null : java.lang.Long.valueOf(cursorQuery.getLong(6));
                if (cursorQuery.isNull(7)) {
                    boolValueOf = null;
                } else {
                    try {
                        try {
                            boolValueOf = java.lang.Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        } catch (android.database.sqlite.SQLiteException e) {
                            e = e;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor2 = cursorQuery;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                if (zZze && !cursorQuery.isNull(8)) {
                    j4 = cursorQuery.getLong(8);
                }
                cursor = cursorQuery;
                try {
                    com.google.android.gms.measurement.internal.zzaj zzajVar = new com.google.android.gms.measurement.internal.zzaj(str, str2, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursor.moveToNext()) {
                        zzr().zzf().zza("Got multiple records for event aggregates, expected one. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzajVar;
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    cursorQuery = cursor;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (android.database.sqlite.SQLiteException e3) {
                e = e3;
            } catch (java.lang.Throwable th3) {
                th = th3;
                cursor = cursorQuery;
            }
        } catch (android.database.sqlite.SQLiteException e4) {
            e = e4;
            cursorQuery = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        zzr().zzf().zza("Error querying events. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zza(str2), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void zza(com.google.android.gms.measurement.internal.zzaj zzajVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzajVar);
        zzd();
        zzak();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", zzajVar.zza);
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzajVar.zzb);
        contentValues.put("lifetime_count", java.lang.Long.valueOf(zzajVar.zzc));
        contentValues.put("current_bundle_count", java.lang.Long.valueOf(zzajVar.zzd));
        contentValues.put("last_fire_timestamp", java.lang.Long.valueOf(zzajVar.zzf));
        contentValues.put("last_bundled_timestamp", java.lang.Long.valueOf(zzajVar.zzg));
        contentValues.put("last_bundled_day", zzajVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzajVar.zzi);
        contentValues.put("last_sampling_rate", zzajVar.zzj);
        if (zzt().zze(zzajVar.zza, com.google.android.gms.measurement.internal.zzap.zzbn)) {
            contentValues.put("current_session_count", java.lang.Long.valueOf(zzajVar.zze));
        }
        contentValues.put("last_exempt_from_sampling", (zzajVar.zzk == null || !zzajVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (c_().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update event aggregates (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(zzajVar.zza));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing event aggregates. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzajVar.zza), e);
        }
    }

    public final void zzb(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        try {
            int iDelete = c_().delete("user_attributes", "app_id=? and name=?", new java.lang.String[]{str, str2});
            if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zza.zzb().zze(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                return;
            }
            zzr().zzx().zza("Deleted user attribute rows", java.lang.Integer.valueOf(iDelete));
        } catch (android.database.sqlite.SQLiteException e) {
            if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zza.zzb().zze(str, com.google.android.gms.measurement.internal.zzap.zzcz)) {
                zzr().zzf().zza("Error deleting user property. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zzc(str2), e);
            } else {
                zzr().zzf().zza("Error deleting user attribute. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zzc(str2), e);
            }
        }
    }

    public final boolean zza(com.google.android.gms.measurement.internal.zzlb zzlbVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlbVar);
        zzd();
        zzak();
        if (zzc(zzlbVar.zza, zzlbVar.zzc) == null) {
            if (com.google.android.gms.measurement.internal.zzla.zza(zzlbVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{zzlbVar.zza}) >= zzt().zzc(zzlbVar.zza)) {
                    return false;
                }
            } else if (zzt().zze(zzlbVar.zza, com.google.android.gms.measurement.internal.zzap.zzbc)) {
                if (!"_npa".equals(zzlbVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new java.lang.String[]{zzlbVar.zza, zzlbVar.zzb}) >= 25) {
                    return false;
                }
            } else if (zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new java.lang.String[]{zzlbVar.zza, zzlbVar.zzb}) >= 25) {
                return false;
            }
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", zzlbVar.zza);
        contentValues.put("origin", zzlbVar.zzb);
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzlbVar.zzc);
        contentValues.put("set_timestamp", java.lang.Long.valueOf(zzlbVar.zzd));
        zza(contentValues, "value", zzlbVar.zze);
        try {
            if (c_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update user property (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(zzlbVar.zza));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing user property. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzlbVar.zza), e);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    public final com.google.android.gms.measurement.internal.zzlb zzc(java.lang.String str, java.lang.String str2) {
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        android.database.Cursor cursor = null;
        try {
            cursorQuery = c_().query("user_attributes", new java.lang.String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    try {
                        com.google.android.gms.measurement.internal.zzlb zzlbVar = new com.google.android.gms.measurement.internal.zzlb(str, cursorQuery.getString(2), str2, cursorQuery.getLong(0), zza(cursorQuery, 1));
                        if (cursorQuery.moveToNext()) {
                            zzr().zzf().zza("Got multiple records for user property, expected one. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzlbVar;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        zzr().zzf().zza("Error querying user property. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zzc(str2), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (android.database.sqlite.SQLiteException e2) {
                e = e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        zzr().zzf().zza("Error querying user property. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zzc(str2), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final java.util.List<com.google.android.gms.measurement.internal.zzlb> zza(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            cursorQuery = c_().query("user_attributes", new java.lang.String[]{com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", "value"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", "1000");
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return arrayList;
                    }
                    do {
                        java.lang.String string = cursorQuery.getString(0);
                        java.lang.String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        java.lang.String str2 = string2;
                        long j = cursorQuery.getLong(2);
                        java.lang.Object objZza = zza(cursorQuery, 3);
                        if (objZza == null) {
                            zzr().zzf().zza("Read invalid user property value, ignoring it. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                        } else {
                            arrayList.add(new com.google.android.gms.measurement.internal.zzlb(str, str2, string, j, objZza));
                        }
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzr().zzf().zza("Error querying user properties. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    public final java.util.List<com.google.android.gms.measurement.internal.zzlb> zza(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        java.lang.String str4;
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            try {
                try {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
                    try {
                        arrayList2.add(str);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
                        if (android.text.TextUtils.isEmpty(str2)) {
                            str4 = str2;
                        } else {
                            str4 = str2;
                            try {
                                arrayList2.add(str4);
                                sb.append(" and origin=?");
                            } catch (android.database.sqlite.SQLiteException e) {
                                e = e;
                                cursorQuery = null;
                            }
                        }
                        if (!android.text.TextUtils.isEmpty(str3)) {
                            arrayList2.add(java.lang.String.valueOf(str3).concat("*"));
                            sb.append(" and name glob ?");
                        }
                        cursorQuery = c_().query("user_attributes", new java.lang.String[]{com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "set_timestamp", "value", "origin"}, sb.toString(), (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]), null, null, "rowid", "1001");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                            while (true) {
                                if (arrayList.size() >= 1000) {
                                    zzr().zzf().zza("Read more than the max allowed user properties, ignoring excess", 1000);
                                    break;
                                }
                                java.lang.String string = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                try {
                                    java.lang.Object objZza = zza(cursorQuery, 2);
                                    java.lang.String string2 = cursorQuery.getString(3);
                                    if (objZza == null) {
                                        try {
                                            zzr().zzf().zza("(2)Read invalid user property value, ignoring it", com.google.android.gms.measurement.internal.zzfk.zza(str), string2, str3);
                                        } catch (android.database.sqlite.SQLiteException e2) {
                                            e = e2;
                                            str4 = string2;
                                        }
                                    } else {
                                        arrayList.add(new com.google.android.gms.measurement.internal.zzlb(str, string2, string, j, objZza));
                                    }
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str4 = string2;
                                } catch (android.database.sqlite.SQLiteException e3) {
                                    e = e3;
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        } catch (android.database.sqlite.SQLiteException e4) {
                            e = e4;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteException e5) {
                        e = e5;
                        str4 = str2;
                        cursorQuery = null;
                        zzr().zzf().zza("(2)Error querying user properties", com.google.android.gms.measurement.internal.zzfk.zza(str), str4, e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (android.database.sqlite.SQLiteException e6) {
                e = e6;
            }
            zzr().zzf().zza("(2)Error querying user properties", com.google.android.gms.measurement.internal.zzfk.zza(str), str4, e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public final boolean zza(com.google.android.gms.measurement.internal.zzv zzvVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzvVar);
        zzd();
        zzak();
        if (zzc(zzvVar.zza, zzvVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new java.lang.String[]{zzvVar.zza}) >= 1000) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", zzvVar.zza);
        contentValues.put("origin", zzvVar.zzb);
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzvVar.zzc.zza);
        zza(contentValues, "value", zzvVar.zzc.zza());
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, java.lang.Boolean.valueOf(zzvVar.zze));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzvVar.zzf);
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.valueOf(zzvVar.zzh));
        zzp();
        contentValues.put("timed_out_event", com.google.android.gms.measurement.internal.zzla.zza((android.os.Parcelable) zzvVar.zzg));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, java.lang.Long.valueOf(zzvVar.zzd));
        zzp();
        contentValues.put("triggered_event", com.google.android.gms.measurement.internal.zzla.zza((android.os.Parcelable) zzvVar.zzi));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, java.lang.Long.valueOf(zzvVar.zzc.zzb));
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.valueOf(zzvVar.zzj));
        zzp();
        contentValues.put("expired_event", com.google.android.gms.measurement.internal.zzla.zza((android.os.Parcelable) zzvVar.zzk));
        try {
            if (c_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update conditional user property (got -1)", com.google.android.gms.measurement.internal.zzfk.zza(zzvVar.zza));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing conditional user property", com.google.android.gms.measurement.internal.zzfk.zza(zzvVar.zza), e);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0125  */
    public final com.google.android.gms.measurement.internal.zzv zzd(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        android.database.Cursor cursor = null;
        try {
            try {
                cursorQuery = c_().query("conditional_properties", new java.lang.String[]{"origin", "value", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new java.lang.String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    java.lang.String string = cursorQuery.getString(0);
                    try {
                        java.lang.Object objZza = zza(cursorQuery, 1);
                        boolean z = cursorQuery.getInt(2) != 0;
                        com.google.android.gms.measurement.internal.zzv zzvVar = new com.google.android.gms.measurement.internal.zzv(str, string, new com.google.android.gms.measurement.internal.zzkz(str2, cursorQuery.getLong(8), objZza, string), cursorQuery.getLong(6), z, cursorQuery.getString(3), (com.google.android.gms.measurement.internal.zzan) zzg().zza(cursorQuery.getBlob(5), com.google.android.gms.measurement.internal.zzan.CREATOR), cursorQuery.getLong(4), (com.google.android.gms.measurement.internal.zzan) zzg().zza(cursorQuery.getBlob(7), com.google.android.gms.measurement.internal.zzan.CREATOR), cursorQuery.getLong(9), (com.google.android.gms.measurement.internal.zzan) zzg().zza(cursorQuery.getBlob(10), com.google.android.gms.measurement.internal.zzan.CREATOR));
                        if (cursorQuery.moveToNext()) {
                            zzr().zzf().zza("Got multiple records for conditional property, expected one", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zzc(str2));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzvVar;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        zzr().zzf().zza("Error querying conditional property", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zzc(str2), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final int zze(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        try {
            return c_().delete("conditional_properties", "app_id=? and name=?", new java.lang.String[]{str, str2});
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error deleting conditional property", com.google.android.gms.measurement.internal.zzfk.zza(str), zzo().zzc(str2), e);
            return 0;
        }
    }

    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zzb(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("app_id=?");
        if (!android.text.TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            arrayList.add(java.lang.String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0124 A[FINALLY_INSNS] */
    public final java.util.List<com.google.android.gms.measurement.internal.zzv> zza(java.lang.String str, java.lang.String[] strArr) {
        zzd();
        zzak();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c_().query("conditional_properties", new java.lang.String[]{"app_id", "origin", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "value", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    return arrayList;
                }
                do {
                    if (arrayList.size() >= 1000) {
                        zzr().zzf().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                    java.lang.String string = cursorQuery.getString(0);
                    java.lang.String string2 = cursorQuery.getString(1);
                    java.lang.String string3 = cursorQuery.getString(2);
                    java.lang.Object objZza = zza(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    java.lang.String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    com.google.android.gms.measurement.internal.zzan zzanVar = (com.google.android.gms.measurement.internal.zzan) zzg().zza(cursorQuery.getBlob(7), com.google.android.gms.measurement.internal.zzan.CREATOR);
                    arrayList.add(new com.google.android.gms.measurement.internal.zzv(string, string2, new com.google.android.gms.measurement.internal.zzkz(string3, cursorQuery.getLong(10), objZza, string2), cursorQuery.getLong(8), z, string4, zzanVar, j, (com.google.android.gms.measurement.internal.zzan) zzg().zza(cursorQuery.getBlob(9), com.google.android.gms.measurement.internal.zzan.CREATOR), cursorQuery.getLong(11), (com.google.android.gms.measurement.internal.zzan) zzg().zza(cursorQuery.getBlob(12), com.google.android.gms.measurement.internal.zzan.CREATOR)));
                } while (cursorQuery.moveToNext());
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e) {
                zzr().zzf().zza("Error querying conditional user property value", e);
                return java.util.Collections.emptyList();
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0219  */
    /* JADX WARN: Code duplicated, block: B:74:0x0221  */
    public final com.google.android.gms.measurement.internal.zzg zzb(java.lang.String str) {
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        android.database.Cursor cursor = null;
        try {
            boolean z = true;
            cursorQuery = c_().query("apps", new java.lang.String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    try {
                        com.google.android.gms.measurement.internal.zzg zzgVar = new com.google.android.gms.measurement.internal.zzg(this.zza.zzs(), str);
                        zzgVar.zza(cursorQuery.getString(0));
                        zzgVar.zzb(cursorQuery.getString(1));
                        zzgVar.zze(cursorQuery.getString(2));
                        zzgVar.zzg(cursorQuery.getLong(3));
                        zzgVar.zza(cursorQuery.getLong(4));
                        zzgVar.zzb(cursorQuery.getLong(5));
                        zzgVar.zzg(cursorQuery.getString(6));
                        zzgVar.zzh(cursorQuery.getString(7));
                        zzgVar.zzd(cursorQuery.getLong(8));
                        zzgVar.zze(cursorQuery.getLong(9));
                        zzgVar.zza(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzgVar.zzj(cursorQuery.getLong(11));
                        zzgVar.zzk(cursorQuery.getLong(12));
                        zzgVar.zzl(cursorQuery.getLong(13));
                        zzgVar.zzm(cursorQuery.getLong(14));
                        zzgVar.zzh(cursorQuery.getLong(15));
                        zzgVar.zzi(cursorQuery.getLong(16));
                        zzgVar.zzc(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        zzgVar.zzf(cursorQuery.getString(18));
                        zzgVar.zzo(cursorQuery.getLong(19));
                        zzgVar.zzn(cursorQuery.getLong(20));
                        zzgVar.zzi(cursorQuery.getString(21));
                        long j = 0;
                        zzgVar.zzp(cursorQuery.isNull(22) ? 0L : cursorQuery.getLong(22));
                        zzgVar.zzb(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        if (!cursorQuery.isNull(24) && cursorQuery.getInt(24) == 0) {
                            z = false;
                        }
                        zzgVar.zzc(z);
                        zzgVar.zzc(cursorQuery.getString(25));
                        if (!cursorQuery.isNull(26)) {
                            j = cursorQuery.getLong(26);
                        }
                        zzgVar.zzf(j);
                        if (!cursorQuery.isNull(27)) {
                            zzgVar.zza(java.util.Arrays.asList(cursorQuery.getString(27).split(",", -1)));
                        }
                        if (com.google.android.gms.internal.measurement.zzll.zzb() && zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzch)) {
                            zzgVar.zzd(cursorQuery.getString(28));
                        }
                        zzgVar.zzb();
                        if (cursorQuery.moveToNext()) {
                            zzr().zzf().zza("Got multiple records for app, expected one. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return zzgVar;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        zzr().zzf().zza("Error querying app. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (android.database.sqlite.SQLiteException e2) {
                e = e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        zzr().zzf().zza("Error querying app. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void zza(com.google.android.gms.measurement.internal.zzg zzgVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgVar);
        zzd();
        zzak();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", zzgVar.zzc());
        contentValues.put("app_instance_id", zzgVar.zzd());
        contentValues.put("gmp_app_id", zzgVar.zze());
        contentValues.put("resettable_device_id_hash", zzgVar.zzh());
        contentValues.put("last_bundle_index", java.lang.Long.valueOf(zzgVar.zzs()));
        contentValues.put("last_bundle_start_timestamp", java.lang.Long.valueOf(zzgVar.zzj()));
        contentValues.put("last_bundle_end_timestamp", java.lang.Long.valueOf(zzgVar.zzk()));
        contentValues.put("app_version", zzgVar.zzl());
        contentValues.put("app_store", zzgVar.zzn());
        contentValues.put("gmp_version", java.lang.Long.valueOf(zzgVar.zzo()));
        contentValues.put("dev_cert_hash", java.lang.Long.valueOf(zzgVar.zzp()));
        contentValues.put("measurement_enabled", java.lang.Boolean.valueOf(zzgVar.zzr()));
        contentValues.put("day", java.lang.Long.valueOf(zzgVar.zzw()));
        contentValues.put("daily_public_events_count", java.lang.Long.valueOf(zzgVar.zzx()));
        contentValues.put("daily_events_count", java.lang.Long.valueOf(zzgVar.zzy()));
        contentValues.put("daily_conversions_count", java.lang.Long.valueOf(zzgVar.zzz()));
        contentValues.put("config_fetched_time", java.lang.Long.valueOf(zzgVar.zzt()));
        contentValues.put("failed_config_fetch_time", java.lang.Long.valueOf(zzgVar.zzu()));
        contentValues.put("app_version_int", java.lang.Long.valueOf(zzgVar.zzm()));
        contentValues.put("firebase_instance_id", zzgVar.zzi());
        contentValues.put("daily_error_events_count", java.lang.Long.valueOf(zzgVar.zzab()));
        contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(zzgVar.zzaa()));
        contentValues.put("health_monitor_sample", zzgVar.zzac());
        contentValues.put("android_id", java.lang.Long.valueOf(zzgVar.zzae()));
        contentValues.put("adid_reporting_enabled", java.lang.Boolean.valueOf(zzgVar.zzaf()));
        contentValues.put("ssaid_reporting_enabled", java.lang.Boolean.valueOf(zzgVar.zzag()));
        contentValues.put("admob_app_id", zzgVar.zzf());
        contentValues.put("dynamite_version", java.lang.Long.valueOf(zzgVar.zzq()));
        if (zzgVar.zzai() != null) {
            if (zzgVar.zzai().size() == 0) {
                zzr().zzi().zza("Safelisted events should not be an empty list. appId", zzgVar.zzc());
            } else {
                contentValues.put("safelisted_events", android.text.TextUtils.join(",", zzgVar.zzai()));
            }
        }
        if (com.google.android.gms.internal.measurement.zzll.zzb() && zzt().zze(zzgVar.zzc(), com.google.android.gms.measurement.internal.zzap.zzch)) {
            contentValues.put("ga_app_id", zzgVar.zzg());
        }
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
            if (sQLiteDatabaseC_.update("apps", contentValues, "app_id = ?", new java.lang.String[]{zzgVar.zzc()}) == 0 && sQLiteDatabaseC_.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzr().zzf().zza("Failed to insert/update app (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(zzgVar.zzc()));
            }
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing app. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzgVar.zzc()), e);
        }
    }

    public final long zzc(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        try {
            return c_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new java.lang.String[]{str, java.lang.String.valueOf(java.lang.Math.max(0, java.lang.Math.min(kotlin.time.DurationKt.NANOS_IN_MILLIS, zzt().zzb(str, com.google.android.gms.measurement.internal.zzap.zzo))))});
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error deleting over the limit events. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            return 0L;
        }
    }

    public final com.google.android.gms.measurement.internal.zzab zza(long j, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zza(j, str, 1L, false, false, z3, false, z5);
    }

    public final com.google.android.gms.measurement.internal.zzab zza(long j, java.lang.String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        java.lang.String[] strArr = {str};
        com.google.android.gms.measurement.internal.zzab zzabVar = new com.google.android.gms.measurement.internal.zzab();
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
                android.database.Cursor cursorQuery = sQLiteDatabaseC_.query("apps", new java.lang.String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzr().zzi().zza("Not updating daily counts, app is not known. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return zzabVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    zzabVar.zzb = cursorQuery.getLong(1);
                    zzabVar.zza = cursorQuery.getLong(2);
                    zzabVar.zzc = cursorQuery.getLong(3);
                    zzabVar.zzd = cursorQuery.getLong(4);
                    zzabVar.zze = cursorQuery.getLong(5);
                }
                if (z) {
                    zzabVar.zzb += j2;
                }
                if (z2) {
                    zzabVar.zza += j2;
                }
                if (z3) {
                    zzabVar.zzc += j2;
                }
                if (z4) {
                    zzabVar.zzd += j2;
                }
                if (z5) {
                    zzabVar.zze += j2;
                }
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("day", java.lang.Long.valueOf(j));
                contentValues.put("daily_public_events_count", java.lang.Long.valueOf(zzabVar.zza));
                contentValues.put("daily_events_count", java.lang.Long.valueOf(zzabVar.zzb));
                contentValues.put("daily_conversions_count", java.lang.Long.valueOf(zzabVar.zzc));
                contentValues.put("daily_error_events_count", java.lang.Long.valueOf(zzabVar.zzd));
                contentValues.put("daily_realtime_events_count", java.lang.Long.valueOf(zzabVar.zze));
                sQLiteDatabaseC_.update("apps", contentValues, "app_id=?", strArr);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return zzabVar;
            } catch (android.database.sqlite.SQLiteException e) {
                zzr().zzf().zza("Error updating daily counts. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return zzabVar;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final byte[] zzd(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzd();
        zzak();
        android.database.Cursor cursor = null;
        try {
            cursorQuery = c_().query("apps", new java.lang.String[]{"remote_config"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    byte[] blob = cursorQuery.getBlob(0);
                    if (cursorQuery.moveToNext()) {
                        zzr().zzf().zza("Got multiple records for app config, expected one. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return blob;
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzr().zzf().zza("Error querying remote config. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    public final boolean zza(com.google.android.gms.internal.measurement.zzbr.zzg zzgVar, boolean z) {
        zzd();
        zzak();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzgVar.zzx());
        com.google.android.gms.common.internal.Preconditions.checkState(zzgVar.zzk());
        zzv();
        long jCurrentTimeMillis = zzm().currentTimeMillis();
        if (zzgVar.zzl() < jCurrentTimeMillis - com.google.android.gms.measurement.internal.zzx.zzj() || zzgVar.zzl() > com.google.android.gms.measurement.internal.zzx.zzj() + jCurrentTimeMillis) {
            zzr().zzi().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", com.google.android.gms.measurement.internal.zzfk.zza(zzgVar.zzx()), java.lang.Long.valueOf(jCurrentTimeMillis), java.lang.Long.valueOf(zzgVar.zzl()));
        }
        try {
            byte[] bArrZzc = zzg().zzc(zzgVar.zzbi());
            zzr().zzx().zza("Saving bundle, size", java.lang.Integer.valueOf(bArrZzc.length));
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("app_id", zzgVar.zzx());
            contentValues.put("bundle_end_timestamp", java.lang.Long.valueOf(zzgVar.zzl()));
            contentValues.put("data", bArrZzc);
            contentValues.put("has_realtime", java.lang.Integer.valueOf(z ? 1 : 0));
            if (zzgVar.zzaz()) {
                contentValues.put("retry_count", java.lang.Integer.valueOf(zzgVar.zzba()));
            }
            try {
                if (c_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzr().zzf().zza("Failed to insert bundle (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(zzgVar.zzx()));
                return false;
            } catch (android.database.sqlite.SQLiteException e) {
                zzr().zzf().zza("Error storing bundle. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzgVar.zzx()), e);
                return false;
            }
        } catch (java.io.IOException e2) {
            zzr().zzf().zza("Data loss. Failed to serialize bundle. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzgVar.zzx()), e2);
            return false;
        }
    }

    public final java.lang.String d_() throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.Cursor cursorRawQuery;
        try {
            cursorRawQuery = c_().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return null;
                    }
                    java.lang.String string = cursorRawQuery.getString(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return string;
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzr().zzf().zza("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursorRawQuery = null;
        }
        th = th2;
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final boolean zzk() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (java.lang.String[]) null) != 0;
    }

    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzg, java.lang.Long>> zza(java.lang.String str, int i, int i2) {
        zzd();
        zzak();
        com.google.android.gms.common.internal.Preconditions.checkArgument(i > 0);
        com.google.android.gms.common.internal.Preconditions.checkArgument(i2 > 0);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = c_().query("queue", new java.lang.String[]{"rowid", "data", "retry_count"}, "app_id=?", new java.lang.String[]{str}, null, null, "rowid", java.lang.String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzg, java.lang.Long>> listEmptyList = java.util.Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = 0;
                do {
                    long j = cursorQuery.getLong(0);
                    try {
                        byte[] bArrZzb = zzg().zzb(cursorQuery.getBlob(1));
                        if (!arrayList.isEmpty() && bArrZzb.length + length > i2) {
                            break;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzbr.zzg.zza zzaVar = (com.google.android.gms.internal.measurement.zzbr.zzg.zza) com.google.android.gms.measurement.internal.zzkw.zza(com.google.android.gms.internal.measurement.zzbr.zzg.zzbf(), bArrZzb);
                            if (!cursorQuery.isNull(2)) {
                                zzaVar.zzi(cursorQuery.getInt(2));
                            }
                            length += bArrZzb.length;
                            arrayList.add(android.util.Pair.create((com.google.android.gms.internal.measurement.zzbr.zzg) ((com.google.android.gms.internal.measurement.zzfd) zzaVar.zzu()), java.lang.Long.valueOf(j)));
                        } catch (java.io.IOException e) {
                            zzr().zzf().zza("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                        }
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                    } catch (java.io.IOException e2) {
                        zzr().zzf().zza("Failed to unzip queued bundle. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e2);
                    }
                } while (length <= i2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (android.database.sqlite.SQLiteException e3) {
                zzr().zzf().zza("Error querying bundles. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e3);
                java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzg, java.lang.Long>> listEmptyList2 = java.util.Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return listEmptyList2;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final void zzv() {
        int iDelete;
        zzd();
        zzak();
        if (zzam()) {
            long jZza = zzs().zzf.zza();
            long jElapsedRealtime = zzm().elapsedRealtime();
            if (java.lang.Math.abs(jElapsedRealtime - jZza) > com.google.android.gms.measurement.internal.zzap.zzx.zza(null).longValue()) {
                zzs().zzf.zza(jElapsedRealtime);
                zzd();
                zzak();
                if (!zzam() || (iDelete = c_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new java.lang.String[]{java.lang.String.valueOf(zzm().currentTimeMillis()), java.lang.String.valueOf(com.google.android.gms.measurement.internal.zzx.zzj())})) <= 0) {
                    return;
                }
                zzr().zzx().zza("Deleted stale rows. rowsDeleted", java.lang.Integer.valueOf(iDelete));
            }
        }
    }

    final void zza(java.util.List<java.lang.Long> list) {
        zzd();
        zzak();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        com.google.android.gms.common.internal.Preconditions.checkNotZero(list.size());
        if (zzam()) {
            java.lang.String strJoin = android.text.TextUtils.join(",", list);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            java.lang.String string = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzb(sb2.toString(), (java.lang.String[]) null) > 0) {
                zzr().zzi().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + kotlinx.coroutines.scheduling.WorkQueueKt.MASK);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseC_.execSQL(sb3.toString());
            } catch (android.database.sqlite.SQLiteException e) {
                zzr().zzf().zza("Error incrementing retry count. error", e);
            }
        }
    }

    private final boolean zza(java.lang.String str, int i, com.google.android.gms.internal.measurement.zzbj.zzb zzbVar) {
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbVar);
        if (android.text.TextUtils.isEmpty(zzbVar.zzc())) {
            zzr().zzi().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.zzfk.zza(str), java.lang.Integer.valueOf(i), java.lang.String.valueOf(zzbVar.zza() ? java.lang.Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] bArrZzbi = zzbVar.zzbi();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", java.lang.Integer.valueOf(i));
        contentValues.put("filter_id", zzbVar.zza() ? java.lang.Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzc());
        if (zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzbm)) {
            contentValues.put("session_scoped", zzbVar.zzj() ? java.lang.Boolean.valueOf(zzbVar.zzk()) : null);
        }
        contentValues.put("data", bArrZzbi);
        try {
            if (c_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzr().zzf().zza("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
            return true;
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            return false;
        }
    }

    private final boolean zza(java.lang.String str, int i, com.google.android.gms.internal.measurement.zzbj.zze zzeVar) {
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzeVar);
        if (android.text.TextUtils.isEmpty(zzeVar.zzc())) {
            zzr().zzi().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", com.google.android.gms.measurement.internal.zzfk.zza(str), java.lang.Integer.valueOf(i), java.lang.String.valueOf(zzeVar.zza() ? java.lang.Integer.valueOf(zzeVar.zzb()) : null));
            return false;
        }
        byte[] bArrZzbi = zzeVar.zzbi();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", java.lang.Integer.valueOf(i));
        contentValues.put("filter_id", zzeVar.zza() ? java.lang.Integer.valueOf(zzeVar.zzb()) : null);
        contentValues.put("property_name", zzeVar.zzc());
        if (zzt().zze(str, com.google.android.gms.measurement.internal.zzap.zzbm)) {
            contentValues.put("session_scoped", zzeVar.zzg() ? java.lang.Boolean.valueOf(zzeVar.zzh()) : null);
        }
        contentValues.put("data", bArrZzbi);
        try {
            if (c_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzr().zzf().zza("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> zzf(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        ?? r9 = 0;
        try {
            try {
                cursorQuery = c_().query("event_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new java.lang.String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> mapEmptyMap = java.util.Collections.emptyMap();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            com.google.android.gms.internal.measurement.zzbj.zzb zzbVar = (com.google.android.gms.internal.measurement.zzbj.zzb) ((com.google.android.gms.internal.measurement.zzfd) ((com.google.android.gms.internal.measurement.zzbj.zzb.zza) com.google.android.gms.measurement.internal.zzkw.zza(com.google.android.gms.internal.measurement.zzbj.zzb.zzl(), cursorQuery.getBlob(1))).zzu());
                            int i = cursorQuery.getInt(0);
                            java.util.List arrayList = (java.util.List) arrayMap.get(java.lang.Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                                arrayMap.put(java.lang.Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(zzbVar);
                        } catch (java.io.IOException e) {
                            zzr().zzf().zza("Failed to merge filter. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayMap;
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    zzr().zzf().zza("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r9 = str2;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
    }

    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> zze(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        android.database.Cursor cursor = null;
        try {
            try {
                android.database.Cursor cursorQuery = c_().query("event_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> mapEmptyMap = java.util.Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.zzbj.zzb zzbVar = (com.google.android.gms.internal.measurement.zzbj.zzb) ((com.google.android.gms.internal.measurement.zzfd) ((com.google.android.gms.internal.measurement.zzbj.zzb.zza) com.google.android.gms.measurement.internal.zzkw.zza(com.google.android.gms.internal.measurement.zzbj.zzb.zzl(), cursorQuery.getBlob(1))).zzu());
                        if (zzbVar.zzf()) {
                            int i = cursorQuery.getInt(0);
                            java.util.List arrayList = (java.util.List) arrayMap.get(java.lang.Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                                arrayMap.put(java.lang.Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(zzbVar);
                        }
                    } catch (java.io.IOException e) {
                        zzr().zzf().zza("Failed to merge filter. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayMap;
            } catch (java.lang.Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            zzr().zzf().zza("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e2);
            java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> mapEmptyMap2 = java.util.Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return mapEmptyMap2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zze>> zzg(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        ?? r9 = 0;
        try {
            try {
                cursorQuery = c_().query("property_filters", new java.lang.String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new java.lang.String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zze>> mapEmptyMap = java.util.Collections.emptyMap();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return mapEmptyMap;
                    }
                    do {
                        try {
                            com.google.android.gms.internal.measurement.zzbj.zze zzeVar = (com.google.android.gms.internal.measurement.zzbj.zze) ((com.google.android.gms.internal.measurement.zzfd) ((com.google.android.gms.internal.measurement.zzbj.zze.zza) com.google.android.gms.measurement.internal.zzkw.zza(com.google.android.gms.internal.measurement.zzbj.zze.zzi(), cursorQuery.getBlob(1))).zzu());
                            int i = cursorQuery.getInt(0);
                            java.util.List arrayList = (java.util.List) arrayMap.get(java.lang.Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                                arrayMap.put(java.lang.Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(zzeVar);
                        } catch (java.io.IOException e) {
                            zzr().zzf().zza("Failed to merge filter", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayMap;
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    zzr().zzf().zza("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r9 = str2;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
    }

    final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zza(java.lang.String str, java.util.List<java.lang.String> list) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        if (list.isEmpty()) {
            return arrayMap;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("app_id=? AND property_name in (");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("?");
        }
        sb.append(")");
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        arrayList.add(0, str);
        android.database.Cursor cursor = null;
        try {
            cursorQuery = c_().query("property_filters", new java.lang.String[]{"audience_id", "filter_id"}, sb.toString(), (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return arrayMap;
                    }
                    do {
                        int i2 = cursorQuery.getInt(0);
                        java.util.List arrayList2 = (java.util.List) arrayMap.get(java.lang.Integer.valueOf(i2));
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                            arrayMap.put(java.lang.Integer.valueOf(i2), arrayList2);
                        }
                        arrayList2.add(java.lang.Integer.valueOf(cursorQuery.getInt(1)));
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayMap;
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzr().zzf().zza("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> zzf(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
        ?? r2 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseC_.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new java.lang.String[]{str, str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mapEmptyMap = java.util.Collections.emptyMap();
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return mapEmptyMap;
                    }
                    do {
                        int i = cursorRawQuery.getInt(0);
                        java.util.List arrayList = (java.util.List) arrayMap.get(java.lang.Integer.valueOf(i));
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                            arrayMap.put(java.lang.Integer.valueOf(i), arrayList);
                        }
                        arrayList.add(java.lang.Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return arrayMap;
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzr().zzf().zza("Database error querying scoped filters. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r2 = sQLiteDatabaseC_;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    private final boolean zzc(java.lang.String str, java.util.List<java.lang.Integer> list) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzak();
        zzd();
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
        try {
            long jZzb = zzb("select count(1) from audience_filter_values where app_id=?", new java.lang.String[]{str});
            int iMax = java.lang.Math.max(0, java.lang.Math.min(2000, zzt().zzb(str, com.google.android.gms.measurement.internal.zzap.zzae)));
            if (jZzb <= iMax) {
                return false;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < list.size(); i++) {
                java.lang.Integer num = list.get(i);
                if (num == null || !(num instanceof java.lang.Integer)) {
                    return false;
                }
                arrayList.add(java.lang.Integer.toString(num.intValue()));
            }
            java.lang.String strJoin = android.text.TextUtils.join(",", arrayList);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            java.lang.String string = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 140);
            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(string);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseC_.delete("audience_filter_values", sb2.toString(), new java.lang.String[]{str, java.lang.Integer.toString(iMax)}) > 0;
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Database error querying filters. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> zzg(java.lang.String str) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
        ?? r8 = 0;
        try {
            try {
                cursorQuery = sQLiteDatabaseC_.query("audience_filter_values", new java.lang.String[]{"audience_id", "current_results"}, "app_id=?", new java.lang.String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                    do {
                        int i = cursorQuery.getInt(0);
                        try {
                            arrayMap.put(java.lang.Integer.valueOf(i), (com.google.android.gms.internal.measurement.zzbr.zzi) ((com.google.android.gms.internal.measurement.zzfd) ((com.google.android.gms.internal.measurement.zzbr.zzi.zza) com.google.android.gms.measurement.internal.zzkw.zza(com.google.android.gms.internal.measurement.zzbr.zzi.zzi(), cursorQuery.getBlob(1))).zzu()));
                        } catch (java.io.IOException e) {
                            zzr().zzf().zza("Failed to merge filter results. appId, audienceId, error", com.google.android.gms.measurement.internal.zzfk.zza(str), java.lang.Integer.valueOf(i), e);
                        }
                    } while (cursorQuery.moveToNext());
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayMap;
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    zzr().zzf().zza("Database error querying filter results. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r8 = sQLiteDatabaseC_;
                if (r8 != 0) {
                    r8.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r8 != 0) {
                r8.close();
            }
            throw th;
        }
    }

    private static void zza(android.content.ContentValues contentValues, java.lang.String str, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        if (obj instanceof java.lang.String) {
            contentValues.put(str, (java.lang.String) obj);
        } else if (obj instanceof java.lang.Long) {
            contentValues.put(str, (java.lang.Long) obj);
        } else {
            if (obj instanceof java.lang.Double) {
                contentValues.put(str, (java.lang.Double) obj);
                return;
            }
            throw new java.lang.IllegalArgumentException("Invalid value type");
        }
    }

    private final java.lang.Object zza(android.database.Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzr().zzf().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return java.lang.Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return java.lang.Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type == 4) {
            zzr().zzf().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
        zzr().zzf().zza("Loaded invalid unknown value type, ignoring it", java.lang.Integer.valueOf(type));
        return null;
    }

    public final long zzw() {
        return zza("select max(bundle_end_timestamp) from queue", (java.lang.String[]) null, 0L);
    }

    protected final long zzh(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzd();
        zzak();
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
        sQLiteDatabaseC_.beginTransaction();
        long j = 0;
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    long jZza = zza(sb.toString(), new java.lang.String[]{str}, -1L);
                    if (jZza == -1) {
                        android.content.ContentValues contentValues = new android.content.ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (java.lang.Integer) 0);
                        contentValues.put("previous_install_count", (java.lang.Integer) 0);
                        if (sQLiteDatabaseC_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            zzr().zzf().zza("Failed to insert column (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(str), str2);
                            sQLiteDatabaseC_.endTransaction();
                            return -1L;
                        }
                        jZza = 0;
                        zzr().zzf().zza("Error inserting column. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), str2, e);
                        sQLiteDatabaseC_.endTransaction();
                        return j;
                    }
                    try {
                        android.content.ContentValues contentValues2 = new android.content.ContentValues();
                        contentValues2.put("app_id", str);
                        contentValues2.put(str2, java.lang.Long.valueOf(1 + jZza));
                        if (sQLiteDatabaseC_.update("app2", contentValues2, "app_id = ?", new java.lang.String[]{str}) == 0) {
                            zzr().zzf().zza("Failed to update column (got 0). appId", com.google.android.gms.measurement.internal.zzfk.zza(str), str2);
                            sQLiteDatabaseC_.endTransaction();
                            return -1L;
                        }
                        sQLiteDatabaseC_.setTransactionSuccessful();
                        sQLiteDatabaseC_.endTransaction();
                        return jZza;
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        j = jZza;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabaseC_.endTransaction();
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final long zzx() {
        return zza("select max(timestamp) from raw_events", (java.lang.String[]) null, 0L);
    }

    public final long zza(com.google.android.gms.internal.measurement.zzbr.zzg zzgVar) throws java.io.IOException {
        zzd();
        zzak();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzgVar.zzx());
        byte[] bArrZzbi = zzgVar.zzbi();
        long jZza = zzg().zza(bArrZzbi);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", zzgVar.zzx());
        contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(jZza));
        contentValues.put("metadata", bArrZzbi);
        try {
            c_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jZza;
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing raw event metadata. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzgVar.zzx()), e);
            throw e;
        }
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from raw_events", (java.lang.String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (java.lang.String[]) null) != 0;
    }

    public final long zzh(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new java.lang.String[]{str}, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    public final java.lang.String zza(long j) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        zzd();
        zzak();
        ?? r0 = 0;
        try {
            try {
                cursorRawQuery = c_().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new java.lang.String[]{java.lang.String.valueOf((long) j)});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        zzr().zzx().zza("No expired configs for apps with pending events");
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return null;
                    }
                    java.lang.String string = cursorRawQuery.getString(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return string;
                } catch (android.database.sqlite.SQLiteException e) {
                    e = e;
                    zzr().zzf().zza("Error selecting expired configs", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                r0 = j;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    public final long zzaa() {
        android.database.Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = c_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
            if (cursorRawQuery.moveToFirst()) {
                return cursorRawQuery.getLong(0);
            }
            return -1L;
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error querying raw events", e);
            return -1L;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzc, java.lang.Long> zza(java.lang.String str, java.lang.Long l) throws java.lang.Throwable {
        android.database.Cursor cursorRawQuery;
        android.database.Cursor cursor;
        zzd();
        zzak();
        android.database.Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = c_().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new java.lang.String[]{str, java.lang.String.valueOf(l)});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        zzr().zzx().zza("Main event not found");
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return null;
                    }
                    try {
                        android.util.Pair<com.google.android.gms.internal.measurement.zzbr.zzc, java.lang.Long> pairCreate = android.util.Pair.create((com.google.android.gms.internal.measurement.zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) ((com.google.android.gms.internal.measurement.zzbr.zzc.zza) com.google.android.gms.measurement.internal.zzkw.zza(com.google.android.gms.internal.measurement.zzbr.zzc.zzj(), cursorRawQuery.getBlob(0))).zzu()), java.lang.Long.valueOf(cursorRawQuery.getLong(1)));
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return pairCreate;
                    } catch (java.io.IOException e) {
                        zzr().zzf().zza("Failed to merge main event. appId, eventId", com.google.android.gms.measurement.internal.zzfk.zza(str), l, e);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        return null;
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    zzr().zzf().zza("Error selecting main event", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (android.database.sqlite.SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final boolean zza(java.lang.String str, java.lang.Long l, long j, com.google.android.gms.internal.measurement.zzbr.zzc zzcVar) {
        zzd();
        zzak();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzcVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(l);
        byte[] bArrZzbi = zzcVar.zzbi();
        zzr().zzx().zza("Saving complex main event, appId, data size", zzo().zza(str), java.lang.Integer.valueOf(bArrZzbi.length));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", java.lang.Long.valueOf(j));
        contentValues.put("main_event", bArrZzbi);
        try {
            if (c_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzr().zzf().zza("Failed to insert complex main event (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
            return false;
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing complex main event. appId", com.google.android.gms.measurement.internal.zzfk.zza(str), e);
            return false;
        }
    }

    public final boolean zza(com.google.android.gms.measurement.internal.zzak zzakVar, long j, boolean z) {
        zzd();
        zzak();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzakVar);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzakVar.zza);
        com.google.android.gms.internal.measurement.zzbr.zzc.zza zzaVarZzb = com.google.android.gms.internal.measurement.zzbr.zzc.zzj().zzb(zzakVar.zzd);
        for (java.lang.String str : zzakVar.zze) {
            com.google.android.gms.internal.measurement.zzbr.zze.zza zzaVarZza = com.google.android.gms.internal.measurement.zzbr.zze.zzk().zza(str);
            zzg().zza(zzaVarZza, zzakVar.zze.zza(str));
            zzaVarZzb.zza(zzaVarZza);
        }
        byte[] bArrZzbi = ((com.google.android.gms.internal.measurement.zzbr.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzb.zzu())).zzbi();
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zze(zzakVar.zza, com.google.android.gms.measurement.internal.zzap.zzcz)) {
            zzr().zzx().zza("Saving event, name, data size", zzo().zza(zzakVar.zzb), java.lang.Integer.valueOf(bArrZzbi.length));
        }
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("app_id", zzakVar.zza);
        contentValues.put(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzakVar.zzb);
        contentValues.put("timestamp", java.lang.Long.valueOf(zzakVar.zzc));
        contentValues.put("metadata_fingerprint", java.lang.Long.valueOf(j));
        contentValues.put("data", bArrZzbi);
        contentValues.put("realtime", java.lang.Integer.valueOf(z ? 1 : 0));
        try {
            if (c_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzr().zzf().zza("Failed to insert raw event (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(zzakVar.zza));
            return false;
        } catch (android.database.sqlite.SQLiteException e) {
            zzr().zzf().zza("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzfk.zza(zzakVar.zza), e);
            return false;
        }
    }

    final void zzb(java.lang.String str, java.util.List<com.google.android.gms.internal.measurement.zzbj.zza> list) {
        boolean z;
        boolean z2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.measurement.zzbj.zza.C0026zza c0026zzaZzbm = list.get(i).zzbm();
            if (c0026zzaZzbm.zzb() != 0) {
                for (int i2 = 0; i2 < c0026zzaZzbm.zzb(); i2++) {
                    com.google.android.gms.internal.measurement.zzbj.zzb.zza zzaVarZzbm = c0026zzaZzbm.zzb(i2).zzbm();
                    com.google.android.gms.internal.measurement.zzbj.zzb.zza zzaVar = (com.google.android.gms.internal.measurement.zzbj.zzb.zza) ((com.google.android.gms.internal.measurement.zzfd.zzb) zzaVarZzbm.clone());
                    java.lang.String strZzb = com.google.android.gms.measurement.internal.zzhj.zzb(zzaVarZzbm.zza());
                    if (strZzb != null) {
                        zzaVar.zza(strZzb);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzaVarZzbm.zzb(); i3++) {
                        com.google.android.gms.internal.measurement.zzbj.zzc zzcVarZza = zzaVarZzbm.zza(i3);
                        java.lang.String strZza = com.google.android.gms.measurement.internal.zzhm.zza(zzcVarZza.zzh());
                        if (strZza != null) {
                            zzaVar.zza(i3, (com.google.android.gms.internal.measurement.zzbj.zzc) ((com.google.android.gms.internal.measurement.zzfd) zzcVarZza.zzbm().zza(strZza).zzu()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        c0026zzaZzbm = c0026zzaZzbm.zza(i2, zzaVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzbj.zza) ((com.google.android.gms.internal.measurement.zzfd) c0026zzaZzbm.zzu()));
                    }
                }
            }
            if (c0026zzaZzbm.zza() != 0) {
                for (int i4 = 0; i4 < c0026zzaZzbm.zza(); i4++) {
                    com.google.android.gms.internal.measurement.zzbj.zze zzeVarZza = c0026zzaZzbm.zza(i4);
                    java.lang.String strZza2 = com.google.android.gms.measurement.internal.zzhl.zza(zzeVarZza.zzc());
                    if (strZza2 != null) {
                        c0026zzaZzbm = c0026zzaZzbm.zza(i4, zzeVarZza.zzbm().zza(strZza2));
                        list.set(i, (com.google.android.gms.internal.measurement.zzbj.zza) ((com.google.android.gms.internal.measurement.zzfd) c0026zzaZzbm.zzu()));
                    }
                }
            }
        }
        zzak();
        zzd();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_ = c_();
        sQLiteDatabaseC_.beginTransaction();
        try {
            zzak();
            zzd();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_2 = c_();
            sQLiteDatabaseC_2.delete("property_filters", "app_id=?", new java.lang.String[]{str});
            sQLiteDatabaseC_2.delete("event_filters", "app_id=?", new java.lang.String[]{str});
            for (com.google.android.gms.internal.measurement.zzbj.zza zzaVar2 : list) {
                zzak();
                zzd();
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zza()) {
                    zzr().zzi().zza("Audience with no ID. appId", com.google.android.gms.measurement.internal.zzfk.zza(str));
                } else {
                    int iZzb = zzaVar2.zzb();
                    java.util.Iterator<com.google.android.gms.internal.measurement.zzbj.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zza()) {
                                zzr().zzi().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzfk.zza(str), java.lang.Integer.valueOf(iZzb));
                                break;
                            }
                        } else {
                            java.util.Iterator<com.google.android.gms.internal.measurement.zzbj.zze> it2 = zzaVar2.zzc().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zza()) {
                                        zzr().zzi().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzfk.zza(str), java.lang.Integer.valueOf(iZzb));
                                        break;
                                    }
                                } else {
                                    java.util.Iterator<com.google.android.gms.internal.measurement.zzbj.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, iZzb, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        java.util.Iterator<com.google.android.gms.internal.measurement.zzbj.zze> it4 = zzaVar2.zzc().iterator();
                                        while (it4.hasNext()) {
                                            if (!zza(str, iZzb, it4.next())) {
                                                z = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        zzak();
                                        zzd();
                                        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
                                        android.database.sqlite.SQLiteDatabase sQLiteDatabaseC_3 = c_();
                                        sQLiteDatabaseC_3.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(iZzb)});
                                        sQLiteDatabaseC_3.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{str, java.lang.String.valueOf(iZzb)});
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.google.android.gms.internal.measurement.zzbj.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zza() ? java.lang.Integer.valueOf(zzaVar3.zzb()) : null);
            }
            zzc(str, arrayList);
            sQLiteDatabaseC_.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseC_.endTransaction();
        }
    }

    private final boolean zzam() {
        return zzn().getDatabasePath("google_app_measurement.db").exists();
    }
}
