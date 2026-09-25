package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapDescriptor {
    android.graphics.Bitmap a;
    private android.os.Bundle b;

    BitmapDescriptor(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            this.a = a(bitmap, bitmap.getWidth(), bitmap.getHeight());
        }
    }

    private android.graphics.Bitmap a(android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    byte[] a() {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(this.a.getWidth() * this.a.getHeight() * 4);
        this.a.copyPixelsToBuffer(byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    android.os.Bundle b() {
        if (this.a == null) {
            throw new java.lang.IllegalStateException("BDMapSDKException: the bitmap has been recycled! you can not use it again");
        }
        if (this.b == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("image_width", this.a.getWidth());
            bundle.putInt("image_height", this.a.getHeight());
            byte[] bArrA = a();
            bundle.putByteArray("image_data", bArrA);
            java.security.MessageDigest messageDigest = null;
            try {
                messageDigest = java.security.MessageDigest.getInstance("MD5");
            } catch (java.security.NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            if (messageDigest != null) {
                messageDigest.update(bArrA, 0, bArrA.length);
                byte[] bArrDigest = messageDigest.digest();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("");
                for (byte b : bArrDigest) {
                    sb.append(java.lang.Integer.toString((b & kotlin.UByte.MAX_VALUE) + 256, 16).substring(1));
                }
                bundle.putString("image_hashcode", sb.toString());
            }
            this.b = bundle;
        }
        return this.b;
    }

    public android.graphics.Bitmap getBitmap() {
        return this.a;
    }

    public void recycle() {
        android.graphics.Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.a.recycle();
        this.a = null;
    }
}
