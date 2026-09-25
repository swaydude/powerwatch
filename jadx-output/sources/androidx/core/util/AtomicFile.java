package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class AtomicFile {
    private final java.io.File mBackupName;
    private final java.io.File mBaseName;

    public AtomicFile(java.io.File file) {
        this.mBaseName = file;
        this.mBackupName = new java.io.File(file.getPath() + ".bak");
    }

    public java.io.File getBaseFile() {
        return this.mBaseName;
    }

    public void delete() {
        this.mBaseName.delete();
        this.mBackupName.delete();
    }

    public java.io.FileOutputStream startWrite() throws java.io.IOException {
        if (this.mBaseName.exists()) {
            if (!this.mBackupName.exists()) {
                if (!this.mBaseName.renameTo(this.mBackupName)) {
                    android.util.Log.w("AtomicFile", "Couldn't rename file " + this.mBaseName + " to backup file " + this.mBackupName);
                }
            } else {
                this.mBaseName.delete();
            }
        }
        try {
            return new java.io.FileOutputStream(this.mBaseName);
        } catch (java.io.FileNotFoundException unused) {
            if (!this.mBaseName.getParentFile().mkdirs()) {
                throw new java.io.IOException("Couldn't create directory " + this.mBaseName);
            }
            try {
                return new java.io.FileOutputStream(this.mBaseName);
            } catch (java.io.FileNotFoundException unused2) {
                throw new java.io.IOException("Couldn't create " + this.mBaseName);
            }
        }
    }

    public void finishWrite(java.io.FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBackupName.delete();
            } catch (java.io.IOException e) {
                android.util.Log.w("AtomicFile", "finishWrite: Got exception:", e);
            }
        }
    }

    public void failWrite(java.io.FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBaseName.delete();
                this.mBackupName.renameTo(this.mBaseName);
            } catch (java.io.IOException e) {
                android.util.Log.w("AtomicFile", "failWrite: Got exception:", e);
            }
        }
    }

    public java.io.FileInputStream openRead() throws java.io.FileNotFoundException {
        if (this.mBackupName.exists()) {
            this.mBaseName.delete();
            this.mBackupName.renameTo(this.mBaseName);
        }
        return new java.io.FileInputStream(this.mBaseName);
    }

    public byte[] readFully() throws java.io.IOException {
        java.io.FileInputStream fileInputStreamOpenRead = openRead();
        try {
            byte[] bArr = new byte[fileInputStreamOpenRead.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamOpenRead.read(bArr, i, bArr.length - i);
                if (i2 > 0) {
                    i += i2;
                    int iAvailable = fileInputStreamOpenRead.available();
                    if (iAvailable > bArr.length - i) {
                        byte[] bArr2 = new byte[iAvailable + i];
                        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                } else {
                    fileInputStreamOpenRead.close();
                    return bArr;
                }
            }
        } catch (java.lang.Throwable th) {
            fileInputStreamOpenRead.close();
            throw th;
        }
    }

    private static boolean sync(java.io.FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }
}
