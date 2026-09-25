package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.BitmapTeleporter> CREATOR = new com.google.android.gms.common.data.zaa();
    private final int mType;
    private final int zali;
    private android.os.ParcelFileDescriptor zalj;
    private android.graphics.Bitmap zalk;
    private boolean zall;
    private java.io.File zalm;

    BitmapTeleporter(int i, android.os.ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.zali = i;
        this.zalj = parcelFileDescriptor;
        this.mType = i2;
        this.zalk = null;
        this.zall = false;
    }

    public BitmapTeleporter(android.graphics.Bitmap bitmap) {
        this.zali = 1;
        this.zalj = null;
        this.mType = 0;
        this.zalk = bitmap;
        this.zall = true;
    }

    public android.graphics.Bitmap get() {
        if (!this.zall) {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.zalj));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    android.graphics.Bitmap.Config configValueOf = android.graphics.Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    zaa(dataInputStream);
                    java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, configValueOf);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                    this.zalk = bitmapCreateBitmap;
                    this.zall = true;
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (java.lang.Throwable th) {
                zaa(dataInputStream);
                throw th;
            }
        }
        return this.zalk;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.zalj == null) {
            android.graphics.Bitmap bitmap = this.zalk;
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(zabx()));
            try {
                try {
                    dataOutputStream.writeInt(bArrArray.length);
                    dataOutputStream.writeInt(bitmap.getWidth());
                    dataOutputStream.writeInt(bitmap.getHeight());
                    dataOutputStream.writeUTF(bitmap.getConfig().toString());
                    dataOutputStream.write(bArrArray);
                    zaa(dataOutputStream);
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("Could not write into unlinked file", e);
                }
            } catch (java.lang.Throwable th) {
                zaa(dataOutputStream);
                throw th;
            }
        }
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zalj, i | 1, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.mType);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.zalj = null;
    }

    public void release() {
        if (this.zall) {
            return;
        }
        try {
            this.zalj.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("BitmapTeleporter", "Could not close PFD", e);
        }
    }

    public void setTempDir(java.io.File file) {
        java.util.Objects.requireNonNull(file, "Cannot set null temp directory");
        this.zalm = file;
    }

    private final java.io.FileOutputStream zabx() {
        java.io.File file = this.zalm;
        if (file == null) {
            throw new java.lang.IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            java.io.File fileCreateTempFile = java.io.File.createTempFile("teleporter", ".tmp", file);
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                this.zalj = android.os.ParcelFileDescriptor.open(fileCreateTempFile, net.sqlcipher.database.SQLiteDatabase.CREATE_IF_NECESSARY);
                fileCreateTempFile.delete();
                return fileOutputStream;
            } catch (java.io.FileNotFoundException unused) {
                throw new java.lang.IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Could not create temporary file", e);
        }
    }

    private static void zaa(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }
}
