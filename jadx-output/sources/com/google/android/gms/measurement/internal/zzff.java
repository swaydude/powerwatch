package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzff extends android.database.sqlite.SQLiteOpenHelper {
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzfg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzff(com.google.android.gms.measurement.internal.zzfg zzfgVar, android.content.Context context, java.lang.String str) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzfgVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() throws android.database.sqlite.SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
            throw e;
        } catch (android.database.sqlite.SQLiteException unused) {
            this.zza.zzr().zzf().zza("Opening the local database failed, dropping and recreating it");
            if (!this.zza.zzn().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.zza.zzr().zzf().zza("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (android.database.sqlite.SQLiteException e2) {
                this.zza.zzr().zzf().zza("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (android.os.Build.VERSION.SDK_INT < 15) {
            android.database.Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
                cursorRawQuery.moveToFirst();
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (java.lang.Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }
        com.google.android.gms.measurement.internal.zzag.zza(this.zza.zzr(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.gms.measurement.internal.zzag.zza(this.zza.zzr(), sQLiteDatabase);
    }
}
