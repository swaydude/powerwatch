package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteContentHelper {
    public static android.content.res.AssetFileDescriptor getBlobColumnAsAssetFile(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) throws java.io.FileNotFoundException {
        android.os.ParcelFileDescriptor parcelFileDescriptor;
        try {
            android.os.MemoryFile memoryFileSimpleQueryForBlobMemoryFile = simpleQueryForBlobMemoryFile(sQLiteDatabase, str, strArr);
            if (memoryFileSimpleQueryForBlobMemoryFile == null) {
                throw new java.io.FileNotFoundException("No results.");
            }
            try {
                java.lang.reflect.Method declaredMethod = memoryFileSimpleQueryForBlobMemoryFile.getClass().getDeclaredMethod("getParcelFileDescriptor", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                parcelFileDescriptor = (android.os.ParcelFileDescriptor) declaredMethod.invoke(memoryFileSimpleQueryForBlobMemoryFile, new java.lang.Object[0]);
            } catch (java.lang.Exception e) {
                android.util.Log.i("SQLiteContentHelper", "SQLiteCursor.java: " + e);
                parcelFileDescriptor = null;
            }
            return new android.content.res.AssetFileDescriptor(parcelFileDescriptor, 0L, memoryFileSimpleQueryForBlobMemoryFile.length());
        } catch (java.io.IOException e2) {
            throw new java.io.FileNotFoundException(e2.toString());
        }
    }

    private static android.os.MemoryFile simpleQueryForBlobMemoryFile(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr) throws java.io.IOException {
        net.sqlcipher.Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str, strArr);
        if (cursorRawQuery == null) {
            return null;
        }
        try {
            if (!cursorRawQuery.moveToFirst()) {
                return null;
            }
            byte[] blob = cursorRawQuery.getBlob(0);
            if (blob == null) {
                return null;
            }
            android.os.MemoryFile memoryFile = new android.os.MemoryFile(null, blob.length);
            memoryFile.writeBytes(blob, 0, 0, blob.length);
            return memoryFile;
        } finally {
            cursorRawQuery.close();
        }
    }
}
