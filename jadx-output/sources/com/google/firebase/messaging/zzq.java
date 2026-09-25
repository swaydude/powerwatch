package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzq implements java.io.Closeable {
    private final java.net.URL zza;
    private com.google.android.gms.tasks.Task<android.graphics.Bitmap> zzb;
    private volatile java.io.InputStream zzc;

    public static com.google.firebase.messaging.zzq zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new com.google.firebase.messaging.zzq(new java.net.URL(str));
        } catch (java.net.MalformedURLException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            android.util.Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new java.lang.String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private zzq(java.net.URL url) {
        this.zza = url;
    }

    public final void zza(java.util.concurrent.Executor executor) {
        this.zzb = com.google.android.gms.tasks.Tasks.call(executor, new java.util.concurrent.Callable(this) { // from class: com.google.firebase.messaging.zzs
            private final com.google.firebase.messaging.zzq zza;

            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzb();
            }
        });
    }

    public final com.google.android.gms.tasks.Task<android.graphics.Bitmap> zza() {
        return (com.google.android.gms.tasks.Task) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzb);
    }

    public final android.graphics.Bitmap zzb() throws java.io.IOException {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(strValueOf);
        android.util.Log.i("FirebaseMessaging", sb.toString());
        byte[] bArrZzc = zzc();
        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrZzc, 0, bArrZzc.length);
        if (bitmapDecodeByteArray == null) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(this.zza);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(strValueOf2);
            throw new java.io.IOException(sb2.toString());
        }
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            java.lang.String strValueOf3 = java.lang.String.valueOf(this.zza);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf3).length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(strValueOf3);
            android.util.Log.d("FirebaseMessaging", sb3.toString());
        }
        return bitmapDecodeByteArray;
    }

    private final byte[] zzc() throws java.io.IOException {
        java.net.URLConnection uRLConnectionOpenConnection = this.zza.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new java.io.IOException("Content-Length exceeds max size of 1048576");
        }
        java.io.InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            this.zzc = inputStream;
            byte[] bArrZza = com.google.android.gms.internal.firebase_messaging.zzj.zza(com.google.android.gms.internal.firebase_messaging.zzj.zza(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (android.util.Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrZza.length;
                java.lang.String strValueOf = java.lang.String.valueOf(this.zza);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                android.util.Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArrZza.length <= 1048576) {
                return bArrZza;
            }
            throw new java.io.IOException("Image exceeds max size of 1048576");
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.firebase_messaging.zzm.zza(th, th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            com.google.android.gms.internal.firebase_messaging.zzk.zza(this.zzc);
        } catch (java.lang.NullPointerException e) {
            android.util.Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }
}
