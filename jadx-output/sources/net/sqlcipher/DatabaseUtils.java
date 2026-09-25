package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public class DatabaseUtils {
    private static final boolean DEBUG = false;
    private static final boolean LOCAL_LOGV = false;
    private static final java.lang.String TAG = "DatabaseUtils";
    private static final java.lang.String[] countProjection = {"count(*)"};
    private static final char[] HEX_DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static java.text.Collator mColl = null;

    public static final void writeExceptionToParcel(android.os.Parcel parcel, java.lang.Exception exc) {
        boolean z;
        int i = 1;
        if (exc instanceof java.io.FileNotFoundException) {
            z = false;
        } else if (exc instanceof java.lang.IllegalArgumentException) {
            z = true;
            i = 2;
        } else if (exc instanceof java.lang.UnsupportedOperationException) {
            z = true;
            i = 3;
        } else if (exc instanceof net.sqlcipher.database.SQLiteAbortException) {
            z = true;
            i = 4;
        } else if (exc instanceof net.sqlcipher.database.SQLiteConstraintException) {
            z = true;
            i = 5;
        } else if (exc instanceof net.sqlcipher.database.SQLiteDatabaseCorruptException) {
            z = true;
            i = 6;
        } else if (exc instanceof net.sqlcipher.database.SQLiteFullException) {
            z = true;
            i = 7;
        } else if (exc instanceof net.sqlcipher.database.SQLiteDiskIOException) {
            z = true;
            i = 8;
        } else if (exc instanceof net.sqlcipher.database.SQLiteException) {
            z = true;
            i = 9;
        } else if (!(exc instanceof android.content.OperationApplicationException)) {
            parcel.writeException(exc);
            android.util.Log.e(TAG, "Writing exception to parcel", exc);
            return;
        } else {
            z = true;
            i = 10;
        }
        parcel.writeInt(i);
        parcel.writeString(exc.getMessage());
        if (z) {
            android.util.Log.e(TAG, "Writing exception to parcel", exc);
        }
    }

    public static final void readExceptionFromParcel(android.os.Parcel parcel) {
        int i = parcel.readInt();
        if (i == 0) {
            return;
        }
        readExceptionFromParcel(parcel, parcel.readString(), i);
    }

    public static void readExceptionWithFileNotFoundExceptionFromParcel(android.os.Parcel parcel) throws java.io.FileNotFoundException {
        int i = parcel.readInt();
        if (i == 0) {
            return;
        }
        java.lang.String string = parcel.readString();
        if (i == 1) {
            throw new java.io.FileNotFoundException(string);
        }
        readExceptionFromParcel(parcel, string, i);
    }

    public static void readExceptionWithOperationApplicationExceptionFromParcel(android.os.Parcel parcel) throws android.content.OperationApplicationException {
        int i = parcel.readInt();
        if (i == 0) {
            return;
        }
        java.lang.String string = parcel.readString();
        if (i == 10) {
            throw new android.content.OperationApplicationException(string);
        }
        readExceptionFromParcel(parcel, string, i);
    }

    private static final void readExceptionFromParcel(android.os.Parcel parcel, java.lang.String str, int i) {
        switch (i) {
            case 2:
                throw new java.lang.IllegalArgumentException(str);
            case 3:
                throw new java.lang.UnsupportedOperationException(str);
            case 4:
                throw new net.sqlcipher.database.SQLiteAbortException(str);
            case 5:
                throw new net.sqlcipher.database.SQLiteConstraintException(str);
            case 6:
                throw new net.sqlcipher.database.SQLiteDatabaseCorruptException(str);
            case 7:
                throw new net.sqlcipher.database.SQLiteFullException(str);
            case 8:
                throw new net.sqlcipher.database.SQLiteDiskIOException(str);
            case 9:
                throw new net.sqlcipher.database.SQLiteException(str);
            default:
                parcel.readException(i, str);
                return;
        }
    }

    public static void bindObjectToProgram(net.sqlcipher.database.SQLiteProgram sQLiteProgram, int i, java.lang.Object obj) {
        if (obj == null) {
            sQLiteProgram.bindNull(i);
            return;
        }
        if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Float)) {
            sQLiteProgram.bindDouble(i, ((java.lang.Number) obj).doubleValue());
            return;
        }
        if (obj instanceof java.lang.Number) {
            sQLiteProgram.bindLong(i, ((java.lang.Number) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                sQLiteProgram.bindLong(i, 1L);
                return;
            } else {
                sQLiteProgram.bindLong(i, 0L);
                return;
            }
        }
        if (obj instanceof byte[]) {
            sQLiteProgram.bindBlob(i, (byte[]) obj);
        } else {
            sQLiteProgram.bindString(i, obj.toString());
        }
    }

    public static int getTypeOfObject(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
            return 2;
        }
        return ((obj instanceof java.lang.Long) || (obj instanceof java.lang.Integer)) ? 1 : 3;
    }

    public static void appendEscapedSQLString(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '\'') {
                    sb.append('\'');
                }
                sb.append(cCharAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }

    public static java.lang.String sqlEscapeString(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        appendEscapedSQLString(sb, str);
        return sb.toString();
    }

    public static final void appendValueToSql(java.lang.StringBuilder sb, java.lang.Object obj) {
        if (obj == null) {
            sb.append("NULL");
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                sb.append('1');
                return;
            } else {
                sb.append('0');
                return;
            }
        }
        appendEscapedSQLString(sb, obj.toString());
    }

    public static java.lang.String concatenateWhere(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str2;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        return "(" + str + ") AND (" + str2 + ")";
    }

    public static java.lang.String getCollationKey(java.lang.String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        try {
            return new java.lang.String(collationKeyInBytes, 0, getKeyLen(collationKeyInBytes), "ISO8859_1");
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String getHexCollationKey(java.lang.String str) {
        byte[] collationKeyInBytes = getCollationKeyInBytes(str);
        return new java.lang.String(encodeHex(collationKeyInBytes, HEX_DIGITS_LOWER), 0, getKeyLen(collationKeyInBytes) * 2);
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr2[i] = cArr[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr2[i3] = cArr[bArr[i2] & 15];
        }
        return cArr2;
    }

    private static int getKeyLen(byte[] bArr) {
        if (bArr[bArr.length - 1] != 0) {
            return bArr.length;
        }
        return bArr.length - 1;
    }

    private static byte[] getCollationKeyInBytes(java.lang.String str) {
        if (mColl == null) {
            java.text.Collator collator = java.text.Collator.getInstance();
            mColl = collator;
            collator.setStrength(0);
        }
        return mColl.getCollationKey(str).toByteArray();
    }

    public static void dumpCursor(net.sqlcipher.Cursor cursor) {
        dumpCursor(cursor, java.lang.System.out);
    }

    public static void dumpCursor(net.sqlcipher.Cursor cursor, java.io.PrintStream printStream) {
        printStream.println(">>>>> Dumping cursor " + cursor);
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, printStream);
            }
            cursor.moveToPosition(position);
        }
        printStream.println("<<<<<");
    }

    public static void dumpCursor(net.sqlcipher.Cursor cursor, java.lang.StringBuilder sb) {
        sb.append(">>>>> Dumping cursor " + cursor + "\n");
        if (cursor != null) {
            int position = cursor.getPosition();
            cursor.moveToPosition(-1);
            while (cursor.moveToNext()) {
                dumpCurrentRow(cursor, sb);
            }
            cursor.moveToPosition(position);
        }
        sb.append("<<<<<\n");
    }

    public static java.lang.String dumpCursorToString(net.sqlcipher.Cursor cursor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        dumpCursor(cursor, sb);
        return sb.toString();
    }

    public static void dumpCurrentRow(net.sqlcipher.Cursor cursor) {
        dumpCurrentRow(cursor, java.lang.System.out);
    }

    public static void dumpCurrentRow(net.sqlcipher.Cursor cursor, java.io.PrintStream printStream) {
        java.lang.String string;
        java.lang.String[] columnNames = cursor.getColumnNames();
        printStream.println("" + cursor.getPosition() + " {");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                string = cursor.getString(i);
            } catch (net.sqlcipher.database.SQLiteException unused) {
                string = "<unprintable>";
            }
            printStream.println("   " + columnNames[i] + '=' + string);
        }
        printStream.println("}");
    }

    public static void dumpCurrentRow(net.sqlcipher.Cursor cursor, java.lang.StringBuilder sb) {
        java.lang.String string;
        java.lang.String[] columnNames = cursor.getColumnNames();
        sb.append("" + cursor.getPosition() + " {\n");
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            try {
                string = cursor.getString(i);
            } catch (net.sqlcipher.database.SQLiteException unused) {
                string = "<unprintable>";
            }
            sb.append("   " + columnNames[i] + '=' + string + "\n");
        }
        sb.append("}\n");
    }

    public static java.lang.String dumpCurrentRowToString(net.sqlcipher.Cursor cursor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        dumpCurrentRow(cursor, sb);
        return sb.toString();
    }

    public static void cursorStringToContentValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorStringToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorStringToInsertHelper(net.sqlcipher.Cursor cursor, java.lang.String str, net.sqlcipher.DatabaseUtils.InsertHelper insertHelper, int i) {
        insertHelper.bind(i, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorStringToContentValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        contentValues.put(str2, cursor.getString(cursor.getColumnIndexOrThrow(str)));
    }

    public static void cursorIntToContentValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorIntToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorIntToContentValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Integer) null);
        }
    }

    public static void cursorLongToContentValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorLongToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorLongToContentValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Long.valueOf(cursor.getLong(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Long) null);
        }
    }

    public static void cursorDoubleToCursorValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues) {
        cursorDoubleToContentValues(cursor, str, contentValues, str);
    }

    public static void cursorDoubleToContentValues(net.sqlcipher.Cursor cursor, java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (!cursor.isNull(columnIndex)) {
            contentValues.put(str2, java.lang.Double.valueOf(cursor.getDouble(columnIndex)));
        } else {
            contentValues.put(str2, (java.lang.Double) null);
        }
    }

    public static void cursorRowToContentValues(net.sqlcipher.Cursor cursor, android.content.ContentValues contentValues) {
        net.sqlcipher.AbstractWindowedCursor abstractWindowedCursor = cursor instanceof net.sqlcipher.AbstractWindowedCursor ? (net.sqlcipher.AbstractWindowedCursor) cursor : null;
        java.lang.String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (abstractWindowedCursor != null && abstractWindowedCursor.isBlob(i)) {
                contentValues.put(columnNames[i], cursor.getBlob(i));
            } else {
                contentValues.put(columnNames[i], cursor.getString(i));
            }
        }
    }

    public static long queryNumEntries(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        net.sqlcipher.Cursor cursorQuery = sQLiteDatabase.query(str, countProjection, null, null, null, null, null);
        try {
            cursorQuery.moveToFirst();
            return cursorQuery.getLong(0);
        } finally {
            cursorQuery.close();
        }
    }

    public static long longForQuery(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) {
        net.sqlcipher.database.SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return longForQuery(sQLiteStatementCompileStatement, strArr);
        } finally {
            sQLiteStatementCompileStatement.close();
        }
    }

    public static long longForQuery(net.sqlcipher.database.SQLiteStatement sQLiteStatement, java.lang.String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForLong();
    }

    public static java.lang.String stringForQuery(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) {
        net.sqlcipher.database.SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return stringForQuery(sQLiteStatementCompileStatement, strArr);
        } finally {
            sQLiteStatementCompileStatement.close();
        }
    }

    public static java.lang.String stringForQuery(net.sqlcipher.database.SQLiteStatement sQLiteStatement, java.lang.String[] strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bindObjectToProgram(sQLiteStatement, i2, strArr[i]);
                i = i2;
            }
        }
        return sQLiteStatement.simpleQueryForString();
    }

    public static void cursorStringToContentValuesIfPresent(net.sqlcipher.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, cursor.getString(columnIndexOrThrow));
    }

    public static void cursorLongToContentValuesIfPresent(net.sqlcipher.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, java.lang.Long.valueOf(cursor.getLong(columnIndexOrThrow)));
    }

    public static void cursorShortToContentValuesIfPresent(net.sqlcipher.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, java.lang.Short.valueOf(cursor.getShort(columnIndexOrThrow)));
    }

    public static void cursorIntToContentValuesIfPresent(net.sqlcipher.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, java.lang.Integer.valueOf(cursor.getInt(columnIndexOrThrow)));
    }

    public static void cursorFloatToContentValuesIfPresent(net.sqlcipher.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, java.lang.Float.valueOf(cursor.getFloat(columnIndexOrThrow)));
    }

    public static void cursorDoubleToContentValuesIfPresent(net.sqlcipher.Cursor cursor, android.content.ContentValues contentValues, java.lang.String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (cursor.isNull(columnIndexOrThrow)) {
            return;
        }
        contentValues.put(str, java.lang.Double.valueOf(cursor.getDouble(columnIndexOrThrow)));
    }

    public static class InsertHelper {
        public static final int TABLE_INFO_PRAGMA_COLUMNNAME_INDEX = 1;
        public static final int TABLE_INFO_PRAGMA_DEFAULT_INDEX = 4;
        private java.util.HashMap<java.lang.String, java.lang.Integer> mColumns;
        private final net.sqlcipher.database.SQLiteDatabase mDb;
        private final java.lang.String mTableName;
        private java.lang.String mInsertSQL = null;
        private net.sqlcipher.database.SQLiteStatement mInsertStatement = null;
        private net.sqlcipher.database.SQLiteStatement mReplaceStatement = null;
        private net.sqlcipher.database.SQLiteStatement mPreparedStatement = null;

        public InsertHelper(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
            this.mDb = sQLiteDatabase;
            this.mTableName = str;
        }

        private void buildSQL() throws net.sqlcipher.SQLException {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
            sb.append("INSERT INTO ");
            sb.append(this.mTableName);
            sb.append(" (");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(128);
            sb2.append("VALUES (");
            net.sqlcipher.Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = this.mDb.rawQuery("PRAGMA table_info(" + this.mTableName + ")", (java.lang.String[]) null);
                this.mColumns = new java.util.HashMap<>(cursorRawQuery.getCount());
                int i = 1;
                while (cursorRawQuery.moveToNext()) {
                    java.lang.String string = cursorRawQuery.getString(1);
                    java.lang.String string2 = cursorRawQuery.getString(4);
                    this.mColumns.put(string, java.lang.Integer.valueOf(i));
                    sb.append("'");
                    sb.append(string);
                    sb.append("'");
                    if (string2 == null) {
                        sb2.append("?");
                    } else {
                        sb2.append("COALESCE(?, ");
                        sb2.append(string2);
                        sb2.append(")");
                    }
                    sb.append(i == cursorRawQuery.getCount() ? ") " : ", ");
                    sb2.append(i == cursorRawQuery.getCount() ? ");" : ", ");
                    i++;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                sb.append((java.lang.CharSequence) sb2);
                this.mInsertSQL = sb.toString();
            } catch (java.lang.Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        }

        private net.sqlcipher.database.SQLiteStatement getStatement(boolean z) throws net.sqlcipher.SQLException {
            if (z) {
                if (this.mReplaceStatement == null) {
                    if (this.mInsertSQL == null) {
                        buildSQL();
                    }
                    this.mReplaceStatement = this.mDb.compileStatement("INSERT OR REPLACE" + this.mInsertSQL.substring(6));
                }
                return this.mReplaceStatement;
            }
            if (this.mInsertStatement == null) {
                if (this.mInsertSQL == null) {
                    buildSQL();
                }
                this.mInsertStatement = this.mDb.compileStatement(this.mInsertSQL);
            }
            return this.mInsertStatement;
        }

        private synchronized long insertInternal(android.content.ContentValues contentValues, boolean z) {
            net.sqlcipher.database.SQLiteStatement statement;
            try {
                statement = getStatement(z);
                statement.clearBindings();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : contentValues.valueSet()) {
                    net.sqlcipher.DatabaseUtils.bindObjectToProgram(statement, getColumnIndex(entry.getKey()), entry.getValue());
                }
            } catch (net.sqlcipher.SQLException e) {
                android.util.Log.e(net.sqlcipher.DatabaseUtils.TAG, "Error inserting " + contentValues + " into table  " + this.mTableName, e);
                return -1L;
            }
            return statement.executeInsert();
        }

        public int getColumnIndex(java.lang.String str) {
            getStatement(false);
            java.lang.Integer num = this.mColumns.get(str);
            if (num == null) {
                throw new java.lang.IllegalArgumentException("column '" + str + "' is invalid");
            }
            return num.intValue();
        }

        public void bind(int i, double d) {
            this.mPreparedStatement.bindDouble(i, d);
        }

        public void bind(int i, float f) {
            this.mPreparedStatement.bindDouble(i, f);
        }

        public void bind(int i, long j) {
            this.mPreparedStatement.bindLong(i, j);
        }

        public void bind(int i, int i2) {
            this.mPreparedStatement.bindLong(i, i2);
        }

        public void bind(int i, boolean z) {
            this.mPreparedStatement.bindLong(i, z ? 1L : 0L);
        }

        public void bindNull(int i) {
            this.mPreparedStatement.bindNull(i);
        }

        public void bind(int i, byte[] bArr) {
            if (bArr == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindBlob(i, bArr);
            }
        }

        public void bind(int i, java.lang.String str) {
            if (str == null) {
                this.mPreparedStatement.bindNull(i);
            } else {
                this.mPreparedStatement.bindString(i, str);
            }
        }

        public long insert(android.content.ContentValues contentValues) {
            return insertInternal(contentValues, false);
        }

        public long execute() {
            net.sqlcipher.database.SQLiteStatement sQLiteStatement = this.mPreparedStatement;
            if (sQLiteStatement == null) {
                throw new java.lang.IllegalStateException("you must prepare this inserter before calling execute");
            }
            try {
                return sQLiteStatement.executeInsert();
            } catch (net.sqlcipher.SQLException e) {
                android.util.Log.e(net.sqlcipher.DatabaseUtils.TAG, "Error executing InsertHelper with table " + this.mTableName, e);
                return -1L;
            } finally {
                this.mPreparedStatement = null;
            }
        }

        public void prepareForInsert() {
            net.sqlcipher.database.SQLiteStatement statement = getStatement(false);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public void prepareForReplace() {
            net.sqlcipher.database.SQLiteStatement statement = getStatement(true);
            this.mPreparedStatement = statement;
            statement.clearBindings();
        }

        public long replace(android.content.ContentValues contentValues) {
            return insertInternal(contentValues, true);
        }

        public void close() {
            net.sqlcipher.database.SQLiteStatement sQLiteStatement = this.mInsertStatement;
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
                this.mInsertStatement = null;
            }
            net.sqlcipher.database.SQLiteStatement sQLiteStatement2 = this.mReplaceStatement;
            if (sQLiteStatement2 != null) {
                sQLiteStatement2.close();
                this.mReplaceStatement = null;
            }
            this.mInsertSQL = null;
            this.mColumns = null;
        }
    }

    public static void cursorFillWindow(net.sqlcipher.Cursor cursor, int i, android.database.CursorWindow cursorWindow) {
        boolean zPutNull;
        if (i < 0 || i >= cursor.getCount()) {
            return;
        }
        int position = cursor.getPosition();
        int columnCount = cursor.getColumnCount();
        cursorWindow.clear();
        cursorWindow.setStartPosition(i);
        cursorWindow.setNumColumns(columnCount);
        if (cursor.moveToPosition(i)) {
            while (cursorWindow.allocRow()) {
                for (int i2 = 0; i2 < columnCount; i2++) {
                    int type = cursor.getType(i2);
                    if (type == 0) {
                        zPutNull = cursorWindow.putNull(i, i2);
                    } else if (type == 1) {
                        zPutNull = cursorWindow.putLong(cursor.getLong(i2), i, i2);
                    } else if (type == 2) {
                        zPutNull = cursorWindow.putDouble(cursor.getDouble(i2), i, i2);
                    } else if (type == 4) {
                        byte[] blob = cursor.getBlob(i2);
                        if (blob != null) {
                            zPutNull = cursorWindow.putBlob(blob, i, i2);
                        } else {
                            zPutNull = cursorWindow.putNull(i, i2);
                        }
                    } else {
                        java.lang.String string = cursor.getString(i2);
                        if (string != null) {
                            zPutNull = cursorWindow.putString(string, i, i2);
                        } else {
                            zPutNull = cursorWindow.putNull(i, i2);
                        }
                    }
                    if (!zPutNull) {
                        cursorWindow.freeLastRow();
                        break;
                    }
                }
                i++;
                if (!cursor.moveToNext()) {
                    break;
                }
            }
        }
        cursor.moveToPosition(position);
    }
}
