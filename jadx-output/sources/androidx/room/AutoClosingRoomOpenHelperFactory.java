package androidx.room;

/* JADX INFO: loaded from: classes.dex */
final class AutoClosingRoomOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    private final androidx.room.AutoCloser mAutoCloser;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory mDelegate;

    AutoClosingRoomOpenHelperFactory(androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.AutoCloser autoCloser) {
        this.mDelegate = factory;
        this.mAutoCloser = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public androidx.room.AutoClosingRoomOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        return new androidx.room.AutoClosingRoomOpenHelper(this.mDelegate.create(configuration), this.mAutoCloser);
    }
}
