package androidx.room.migration;

/* JADX INFO: loaded from: classes.dex */
public interface AutoMigrationSpec {

    /* JADX INFO: renamed from: androidx.room.migration.AutoMigrationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onPostMigrate(androidx.room.migration.AutoMigrationSpec autoMigrationSpec, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    void onPostMigrate(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase);
}
