package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public class MatrixCursor extends net.sqlcipher.AbstractCursor {
    private final int columnCount;
    private final java.lang.String[] columnNames;
    private java.lang.Object[] data;
    private int rowCount;

    public MatrixCursor(java.lang.String[] strArr, int i) {
        this.rowCount = 0;
        this.columnNames = strArr;
        int length = strArr.length;
        this.columnCount = length;
        this.data = new java.lang.Object[length * (i < 1 ? 1 : i)];
    }

    public MatrixCursor(java.lang.String[] strArr) {
        this(strArr, 16);
    }

    private java.lang.Object get(int i) {
        if (i < 0 || i >= this.columnCount) {
            throw new net.sqlcipher.CursorIndexOutOfBoundsException("Requested column: " + i + ", # of columns: " + this.columnCount);
        }
        if (this.mPos < 0) {
            throw new net.sqlcipher.CursorIndexOutOfBoundsException("Before first row.");
        }
        if (this.mPos >= this.rowCount) {
            throw new net.sqlcipher.CursorIndexOutOfBoundsException("After last row.");
        }
        return this.data[(this.mPos * this.columnCount) + i];
    }

    public net.sqlcipher.MatrixCursor.RowBuilder newRow() {
        int i = this.rowCount + 1;
        this.rowCount = i;
        int i2 = i * this.columnCount;
        ensureCapacity(i2);
        return new net.sqlcipher.MatrixCursor.RowBuilder(i2 - this.columnCount, i2);
    }

    public void addRow(java.lang.Object[] objArr) {
        int length = objArr.length;
        int i = this.columnCount;
        if (length != i) {
            throw new java.lang.IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + objArr.length);
        }
        int i2 = this.rowCount;
        this.rowCount = i2 + 1;
        int i3 = i2 * i;
        ensureCapacity(i + i3);
        java.lang.System.arraycopy(objArr, 0, this.data, i3, this.columnCount);
    }

    public void addRow(java.lang.Iterable<?> iterable) {
        int i = this.rowCount;
        int i2 = this.columnCount;
        int i3 = i * i2;
        int i4 = i2 + i3;
        ensureCapacity(i4);
        if (iterable instanceof java.util.ArrayList) {
            addRow((java.util.ArrayList) iterable, i3);
            return;
        }
        java.lang.Object[] objArr = this.data;
        for (java.lang.Object obj : iterable) {
            if (i3 == i4) {
                throw new java.lang.IllegalArgumentException("columnValues.size() > columnNames.length");
            }
            objArr[i3] = obj;
            i3++;
        }
        if (i3 != i4) {
            throw new java.lang.IllegalArgumentException("columnValues.size() < columnNames.length");
        }
        this.rowCount++;
    }

    private void addRow(java.util.ArrayList<?> arrayList, int i) {
        int size = arrayList.size();
        if (size != this.columnCount) {
            throw new java.lang.IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.size() = " + size);
        }
        this.rowCount++;
        java.lang.Object[] objArr = this.data;
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = arrayList.get(i2);
        }
    }

    private void ensureCapacity(int i) {
        java.lang.Object[] objArr = this.data;
        if (i > objArr.length) {
            int length = objArr.length * 2;
            if (length >= i) {
                i = length;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[i];
            this.data = objArr2;
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    public class RowBuilder {
        private final int endIndex;
        private int index;

        RowBuilder(int i, int i2) {
            this.index = i;
            this.endIndex = i2;
        }

        public net.sqlcipher.MatrixCursor.RowBuilder add(java.lang.Object obj) {
            if (this.index != this.endIndex) {
                java.lang.Object[] objArr = net.sqlcipher.MatrixCursor.this.data;
                int i = this.index;
                this.index = i + 1;
                objArr[i] = obj;
                return this;
            }
            throw new net.sqlcipher.CursorIndexOutOfBoundsException("No more columns left.");
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.rowCount;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.columnNames;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String getString(int i) {
        java.lang.Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public short getShort(int i) {
        java.lang.Object obj = get(i);
        if (obj == null) {
            return (short) 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).shortValue() : java.lang.Short.parseShort(obj.toString());
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getInt(int i) {
        java.lang.Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public long getLong(int i) {
        java.lang.Object obj = get(i);
        if (obj == null) {
            return 0L;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).longValue() : java.lang.Long.parseLong(obj.toString());
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public float getFloat(int i) {
        java.lang.Object obj = get(i);
        if (obj == null) {
            return 0.0f;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public double getDouble(int i) {
        java.lang.Object obj = get(i);
        if (obj == null) {
            return 0.0d;
        }
        return obj instanceof java.lang.Number ? ((java.lang.Number) obj).doubleValue() : java.lang.Double.parseDouble(obj.toString());
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, net.sqlcipher.Cursor
    public int getType(int i) {
        return net.sqlcipher.DatabaseUtils.getTypeOfObject(get(i));
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean isNull(int i) {
        return get(i) == null;
    }
}
