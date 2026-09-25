package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.DataHolder> CREATOR = new com.google.android.gms.common.data.zac();
    private static final com.google.android.gms.common.data.DataHolder.Builder zamb = new com.google.android.gms.common.data.zab(new java.lang.String[0], null);
    private boolean mClosed;
    private final int zali;
    private final java.lang.String[] zalt;
    private android.os.Bundle zalu;
    private final android.database.CursorWindow[] zalv;
    private final int zalw;
    private final android.os.Bundle zalx;
    private int[] zaly;
    private int zalz;
    private boolean zama;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class zaa extends java.lang.RuntimeException {
        public zaa(java.lang.String str) {
            super(str);
        }
    }

    DataHolder(int i, java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i2, android.os.Bundle bundle) {
        this.mClosed = false;
        this.zama = true;
        this.zali = i;
        this.zalt = strArr;
        this.zalv = cursorWindowArr;
        this.zalw = i2;
        this.zalx = bundle;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class Builder {
        private final java.lang.String[] zalt;
        private final java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> zamc;
        private final java.lang.String zamd;
        private final java.util.HashMap<java.lang.Object, java.lang.Integer> zame;
        private boolean zamf;
        private java.lang.String zamg;

        private Builder(java.lang.String[] strArr, java.lang.String str) {
            this.zalt = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
            this.zamc = new java.util.ArrayList<>();
            this.zamd = str;
            this.zame = new java.util.HashMap<>();
            this.zamf = false;
            this.zamg = null;
        }

        public com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap<java.lang.String, java.lang.Object> map) {
            java.lang.Object obj;
            int iIntValue;
            com.google.android.gms.common.internal.Asserts.checkNotNull(map);
            java.lang.String str = this.zamd;
            if (str == null || (obj = map.get(str)) == null) {
                iIntValue = -1;
            } else {
                java.lang.Integer num = this.zame.get(obj);
                if (num == null) {
                    this.zame.put(obj, java.lang.Integer.valueOf(this.zamc.size()));
                    iIntValue = -1;
                } else {
                    iIntValue = num.intValue();
                }
            }
            if (iIntValue == -1) {
                this.zamc.add(map);
            } else {
                this.zamc.remove(iIntValue);
                this.zamc.add(iIntValue, map);
            }
            this.zamf = false;
            return this;
        }

        public com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues contentValues) {
            com.google.android.gms.common.internal.Asserts.checkNotNull(contentValues);
            java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>(contentValues.size());
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public com.google.android.gms.common.data.DataHolder build(int i) {
            return new com.google.android.gms.common.data.DataHolder(this, i, (android.os.Bundle) null, (com.google.android.gms.common.data.zab) (0 == true ? 1 : 0));
        }

        public com.google.android.gms.common.data.DataHolder build(int i, android.os.Bundle bundle) {
            return new com.google.android.gms.common.data.DataHolder(this, i, bundle, -1, (com.google.android.gms.common.data.zab) null);
        }

        /* synthetic */ Builder(java.lang.String[] strArr, java.lang.String str, com.google.android.gms.common.data.zab zabVar) {
            this(strArr, null);
        }
    }

    public DataHolder(java.lang.String[] strArr, android.database.CursorWindow[] cursorWindowArr, int i, android.os.Bundle bundle) {
        this.mClosed = false;
        this.zama = true;
        this.zali = 1;
        this.zalt = (java.lang.String[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        this.zalv = (android.database.CursorWindow[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(cursorWindowArr);
        this.zalw = i;
        this.zalx = bundle;
        zaby();
    }

    private DataHolder(com.google.android.gms.common.sqlite.CursorWrapper cursorWrapper, int i, android.os.Bundle bundle) {
        this(cursorWrapper.getColumnNames(), zaa(cursorWrapper), i, bundle);
    }

    public DataHolder(android.database.Cursor cursor, int i, android.os.Bundle bundle) {
        this(new com.google.android.gms.common.sqlite.CursorWrapper(cursor), i, bundle);
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder.Builder builder, int i, android.os.Bundle bundle) {
        this(builder.zalt, zaa(builder, -1), i, (android.os.Bundle) null);
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder.Builder builder, int i, android.os.Bundle bundle, int i2) {
        this(builder.zalt, zaa(builder, -1), i, bundle);
    }

    public final void zaby() {
        this.zalu = new android.os.Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            java.lang.String[] strArr = this.zalt;
            if (i2 >= strArr.length) {
                break;
            }
            this.zalu.putInt(strArr[i2], i2);
            i2++;
        }
        this.zaly = new int[this.zalv.length];
        int numRows = 0;
        while (true) {
            android.database.CursorWindow[] cursorWindowArr = this.zalv;
            if (i < cursorWindowArr.length) {
                this.zaly[i] = numRows;
                numRows += this.zalv[i].getNumRows() - (numRows - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.zalz = numRows;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 1, this.zalt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zalv, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final int getStatusCode() {
        return this.zalw;
    }

    public final android.os.Bundle getMetadata() {
        return this.zalx;
    }

    private static android.database.CursorWindow[] zaa(com.google.android.gms.common.sqlite.CursorWrapper cursorWrapper) {
        int startPosition;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int count = cursorWrapper.getCount();
            android.database.CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                android.database.CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new android.database.CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            return (android.database.CursorWindow[]) arrayList.toArray(new android.database.CursorWindow[arrayList.size()]);
        } catch (java.lang.Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private static android.database.CursorWindow[] zaa(com.google.android.gms.common.data.DataHolder.Builder builder, int i) {
        if (builder.zalt.length == 0) {
            return new android.database.CursorWindow[0];
        }
        java.util.List listSubList = (i < 0 || i >= builder.zamc.size()) ? builder.zamc : builder.zamc.subList(0, i);
        int size = listSubList.size();
        android.database.CursorWindow cursorWindow = new android.database.CursorWindow(false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zalt.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    android.util.Log.d("DataHolder", sb.toString());
                    cursorWindow = new android.database.CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zalt.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        android.util.Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow);
                        return (android.database.CursorWindow[]) arrayList.toArray(new android.database.CursorWindow[arrayList.size()]);
                    }
                }
                java.util.Map map = (java.util.Map) listSubList.get(i2);
                boolean zPutDouble = true;
                for (int i3 = 0; i3 < builder.zalt.length && zPutDouble; i3++) {
                    java.lang.String str = builder.zalt[i3];
                    java.lang.Object obj = map.get(str);
                    if (obj == null) {
                        zPutDouble = cursorWindow.putNull(i2, i3);
                    } else if (obj instanceof java.lang.String) {
                        zPutDouble = cursorWindow.putString((java.lang.String) obj, i2, i3);
                    } else if (obj instanceof java.lang.Long) {
                        zPutDouble = cursorWindow.putLong(((java.lang.Long) obj).longValue(), i2, i3);
                    } else if (obj instanceof java.lang.Integer) {
                        zPutDouble = cursorWindow.putLong(((java.lang.Integer) obj).intValue(), i2, i3);
                    } else if (obj instanceof java.lang.Boolean) {
                        zPutDouble = cursorWindow.putLong(((java.lang.Boolean) obj).booleanValue() ? 1L : 0L, i2, i3);
                    } else if (obj instanceof byte[]) {
                        zPutDouble = cursorWindow.putBlob((byte[]) obj, i2, i3);
                    } else if (obj instanceof java.lang.Double) {
                        zPutDouble = cursorWindow.putDouble(((java.lang.Double) obj).doubleValue(), i2, i3);
                    } else if (obj instanceof java.lang.Float) {
                        zPutDouble = cursorWindow.putDouble(((java.lang.Float) obj).floatValue(), i2, i3);
                    } else {
                        java.lang.String strValueOf = java.lang.String.valueOf(obj);
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32 + java.lang.String.valueOf(strValueOf).length());
                        sb2.append("Unsupported object for column ");
                        sb2.append(str);
                        sb2.append(": ");
                        sb2.append(strValueOf);
                        throw new java.lang.IllegalArgumentException(sb2.toString());
                    }
                }
                if (zPutDouble) {
                    z = false;
                } else {
                    if (z) {
                        throw new com.google.android.gms.common.data.DataHolder.zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i2);
                    sb3.append(" - allocating new window.");
                    android.util.Log.d("DataHolder", sb3.toString());
                    cursorWindow.freeLastRow();
                    cursorWindow = new android.database.CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zalt.length);
                    arrayList.add(cursorWindow);
                    i2--;
                    z = true;
                }
                i2++;
            } catch (java.lang.RuntimeException e) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((android.database.CursorWindow) arrayList.get(i4)).close();
                }
                throw e;
            }
        }
        return (android.database.CursorWindow[]) arrayList.toArray(new android.database.CursorWindow[arrayList.size()]);
    }

    private final void zaa(java.lang.String str, int i) {
        android.os.Bundle bundle = this.zalu;
        if (bundle == null || !bundle.containsKey(str)) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "No such column: ".concat(strValueOf) : new java.lang.String("No such column: "));
        }
        if (isClosed()) {
            throw new java.lang.IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.zalz) {
            throw new android.database.CursorIndexOutOfBoundsException(i, this.zalz);
        }
    }

    public final boolean hasColumn(java.lang.String str) {
        return this.zalu.containsKey(str);
    }

    public final long getLong(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return this.zalv[i2].getLong(i, this.zalu.getInt(str));
    }

    public final int getInteger(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return this.zalv[i2].getInt(i, this.zalu.getInt(str));
    }

    public final java.lang.String getString(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return this.zalv[i2].getString(i, this.zalu.getInt(str));
    }

    public final boolean getBoolean(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return java.lang.Long.valueOf(this.zalv[i2].getLong(i, this.zalu.getInt(str))).longValue() == 1;
    }

    public final float zaa(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return this.zalv[i2].getFloat(i, this.zalu.getInt(str));
    }

    public final double zab(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return this.zalv[i2].getDouble(i, this.zalu.getInt(str));
    }

    public final byte[] getByteArray(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return this.zalv[i2].getBlob(i, this.zalu.getInt(str));
    }

    public final void zaa(java.lang.String str, int i, int i2, android.database.CharArrayBuffer charArrayBuffer) {
        zaa(str, i);
        this.zalv[i2].copyStringToBuffer(i, this.zalu.getInt(str), charArrayBuffer);
    }

    public final boolean hasNull(java.lang.String str, int i, int i2) {
        zaa(str, i);
        return this.zalv[i2].isNull(i, this.zalu.getInt(str));
    }

    public final int getCount() {
        return this.zalz;
    }

    public final int getWindowIndex(int i) {
        int[] iArr;
        int i2 = 0;
        com.google.android.gms.common.internal.Preconditions.checkState(i >= 0 && i < this.zalz);
        while (true) {
            iArr = this.zaly;
            if (i2 >= iArr.length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == iArr.length ? i2 - 1 : i2;
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                int i = 0;
                while (true) {
                    android.database.CursorWindow[] cursorWindowArr = this.zalv;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            if (this.zama && this.zalv.length > 0 && !isClosed()) {
                close();
                java.lang.String string = toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                android.util.Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.common.data.DataHolder.Builder builder(java.lang.String[] strArr) {
        return new com.google.android.gms.common.data.DataHolder.Builder(strArr, null, 0 == true ? 1 : 0);
    }

    public static com.google.android.gms.common.data.DataHolder empty(int i) {
        return new com.google.android.gms.common.data.DataHolder(zamb, i, (android.os.Bundle) null);
    }

    /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder builder, int i, android.os.Bundle bundle, com.google.android.gms.common.data.zab zabVar) {
        this(builder, i, (android.os.Bundle) null);
    }

    /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder builder, int i, android.os.Bundle bundle, int i2, com.google.android.gms.common.data.zab zabVar) {
        this(builder, i, bundle, -1);
    }
}
