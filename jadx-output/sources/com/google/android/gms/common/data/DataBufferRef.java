package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataBufferRef {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected int mDataRow;
    private int zalp;

    public DataBufferRef(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        this.mDataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataHolder);
        zag(i);
    }

    protected int getDataRow() {
        return this.mDataRow;
    }

    protected final void zag(int i) {
        com.google.android.gms.common.internal.Preconditions.checkState(i >= 0 && i < this.mDataHolder.getCount());
        this.mDataRow = i;
        this.zalp = this.mDataHolder.getWindowIndex(i);
    }

    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    public boolean hasColumn(java.lang.String str) {
        return this.mDataHolder.hasColumn(str);
    }

    protected long getLong(java.lang.String str) {
        return this.mDataHolder.getLong(str, this.mDataRow, this.zalp);
    }

    protected int getInteger(java.lang.String str) {
        return this.mDataHolder.getInteger(str, this.mDataRow, this.zalp);
    }

    protected boolean getBoolean(java.lang.String str) {
        return this.mDataHolder.getBoolean(str, this.mDataRow, this.zalp);
    }

    protected java.lang.String getString(java.lang.String str) {
        return this.mDataHolder.getString(str, this.mDataRow, this.zalp);
    }

    protected float getFloat(java.lang.String str) {
        return this.mDataHolder.zaa(str, this.mDataRow, this.zalp);
    }

    protected double getDouble(java.lang.String str) {
        return this.mDataHolder.zab(str, this.mDataRow, this.zalp);
    }

    protected byte[] getByteArray(java.lang.String str) {
        return this.mDataHolder.getByteArray(str, this.mDataRow, this.zalp);
    }

    protected android.net.Uri parseUri(java.lang.String str) {
        java.lang.String string = this.mDataHolder.getString(str, this.mDataRow, this.zalp);
        if (string == null) {
            return null;
        }
        return android.net.Uri.parse(string);
    }

    protected void copyToBuffer(java.lang.String str, android.database.CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.zaa(str, this.mDataRow, this.zalp, charArrayBuffer);
    }

    protected boolean hasNull(java.lang.String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.zalp);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.mDataRow), java.lang.Integer.valueOf(this.zalp), this.mDataHolder);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.common.data.DataBufferRef) {
            com.google.android.gms.common.data.DataBufferRef dataBufferRef = (com.google.android.gms.common.data.DataBufferRef) obj;
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(dataBufferRef.mDataRow), java.lang.Integer.valueOf(this.mDataRow)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(dataBufferRef.zalp), java.lang.Integer.valueOf(this.zalp)) && dataBufferRef.mDataHolder == this.mDataHolder) {
                return true;
            }
        }
        return false;
    }
}
