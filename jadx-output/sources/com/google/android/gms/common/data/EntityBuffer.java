package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EntityBuffer<T> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private boolean zamh;
    private java.util.ArrayList<java.lang.Integer> zami;

    protected EntityBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
        this.zamh = false;
    }

    protected java.lang.String getChildDataMarkerColumn() {
        return null;
    }

    protected abstract T getEntry(int i, int i2);

    protected abstract java.lang.String getPrimaryDataMarkerColumn();

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final T get(int i) {
        int iIntValue;
        int iIntValue2;
        zabz();
        int iZah = zah(i);
        int i2 = 0;
        if (i >= 0 && i != this.zami.size()) {
            if (i == this.zami.size() - 1) {
                iIntValue = this.mDataHolder.getCount();
                iIntValue2 = this.zami.get(i).intValue();
            } else {
                iIntValue = this.zami.get(i + 1).intValue();
                iIntValue2 = this.zami.get(i).intValue();
            }
            int i3 = iIntValue - iIntValue2;
            if (i3 == 1) {
                int iZah2 = zah(i);
                int windowIndex = this.mDataHolder.getWindowIndex(iZah2);
                java.lang.String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZah2, windowIndex) != null) {
                    i2 = i3;
                }
            } else {
                i2 = i3;
            }
        }
        return getEntry(iZah, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        zabz();
        return this.zami.size();
    }

    private final void zabz() {
        synchronized (this) {
            if (!this.zamh) {
                int count = this.mDataHolder.getCount();
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                this.zami = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    java.lang.String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    java.lang.String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i = 1; i < count; i++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i);
                        java.lang.String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                        if (string2 == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(primaryDataMarkerColumn).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(primaryDataMarkerColumn);
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(windowIndex);
                            throw new java.lang.NullPointerException(sb.toString());
                        }
                        if (!string2.equals(string)) {
                            this.zami.add(java.lang.Integer.valueOf(i));
                            string = string2;
                        }
                    }
                }
                this.zamh = true;
            }
        }
    }

    private final int zah(int i) {
        if (i < 0 || i >= this.zami.size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is out of bounds for this buffer");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        return this.zami.get(i).intValue();
    }
}
