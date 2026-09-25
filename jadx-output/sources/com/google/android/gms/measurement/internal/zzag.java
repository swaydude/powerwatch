package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzag {
    private static java.util.Set<java.lang.String> zza(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            java.util.Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    static void zza(com.google.android.gms.measurement.internal.zzfk zzfkVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) throws android.database.sqlite.SQLiteException {
        if (zzfkVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        if (!zza(zzfkVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            if (zzfkVar == null) {
                throw new java.lang.IllegalArgumentException("Monitor must not be null");
            }
            java.util.Set<java.lang.String> setZza = zza(sQLiteDatabase, str);
            for (java.lang.String str4 : str3.split(",")) {
                if (!setZza.remove(str4)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 35 + java.lang.String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new android.database.sqlite.SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!setZza.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (setZza.isEmpty()) {
                return;
            }
            zzfkVar.zzi().zza("Table has extra columns. table, columns", str, android.text.TextUtils.join(", ", setZza));
        } catch (android.database.sqlite.SQLiteException e) {
            zzfkVar.zzf().zza("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    private static boolean zza(com.google.android.gms.measurement.internal.zzfk zzfkVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        if (zzfkVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new java.lang.String[]{com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME}, "name=?", new java.lang.String[]{str}, null, null, null);
            return cursorQuery.moveToFirst();
        } catch (android.database.sqlite.SQLiteException e) {
            zzfkVar.zzi().zza("Error querying for table", str, e);
            return false;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    static void zza(com.google.android.gms.measurement.internal.zzfk zzfkVar, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (zzfkVar == null) {
            throw new java.lang.IllegalArgumentException("Monitor must not be null");
        }
        java.io.File file = new java.io.File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzfkVar.zzi().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzfkVar.zzi().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzfkVar.zzi().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzfkVar.zzi().zza("Failed to turn on database write permission for owner");
    }
}
