package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteClosable {
    private int mReferenceCount = 1;
    private java.lang.Object mLock = new java.lang.Object();

    protected abstract void onAllReferencesReleased();

    protected void onAllReferencesReleasedFromContainer() {
    }

    public void acquireReference() {
        synchronized (this.mLock) {
            int i = this.mReferenceCount;
            if (i <= 0) {
                throw new java.lang.IllegalStateException("attempt to re-open an already-closed object: " + getObjInfo());
            }
            this.mReferenceCount = i + 1;
        }
    }

    public void releaseReference() {
        synchronized (this.mLock) {
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i == 0) {
                onAllReferencesReleased();
            }
        }
    }

    public void releaseReferenceFromContainer() {
        synchronized (this.mLock) {
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i == 0) {
                onAllReferencesReleasedFromContainer();
            }
        }
    }

    private java.lang.String getObjInfo() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(" (");
        if (this instanceof net.sqlcipher.database.SQLiteDatabase) {
            sb.append("database = ");
            sb.append(((net.sqlcipher.database.SQLiteDatabase) this).getPath());
        } else if ((this instanceof net.sqlcipher.database.SQLiteProgram) || (this instanceof net.sqlcipher.database.SQLiteStatement) || (this instanceof net.sqlcipher.database.SQLiteQuery)) {
            sb.append("mSql = ");
            sb.append(((net.sqlcipher.database.SQLiteProgram) this).mSql);
        }
        sb.append(") ");
        return sb.toString();
    }
}
