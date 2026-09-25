package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageManager {
    private static final java.lang.Object zamj = new java.lang.Object();
    private static java.util.HashSet<android.net.Uri> zamk = new java.util.HashSet<>();
    private static com.google.android.gms.common.images.ImageManager zaml;
    private final android.content.Context mContext;
    private final android.os.Handler mHandler = new com.google.android.gms.internal.base.zar(android.os.Looper.getMainLooper());
    private final java.util.concurrent.ExecutorService zamm = com.google.android.gms.internal.base.zan.zact().zaa(4, com.google.android.gms.internal.base.zao.zasg);
    private final com.google.android.gms.common.images.ImageManager.zaa zamn = null;
    private final com.google.android.gms.internal.base.zaj zamo = new com.google.android.gms.internal.base.zaj();
    private final java.util.Map<com.google.android.gms.common.images.zab, com.google.android.gms.common.images.ImageManager.ImageReceiver> zamp = new java.util.HashMap();
    private final java.util.Map<android.net.Uri, com.google.android.gms.common.images.ImageManager.ImageReceiver> zamq = new java.util.HashMap();
    private final java.util.Map<android.net.Uri, java.lang.Long> zamr = new java.util.HashMap();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface OnImageLoadedListener {
        void onImageLoaded(android.net.Uri uri, android.graphics.drawable.Drawable drawable, boolean z);
    }

    public static com.google.android.gms.common.images.ImageManager create(android.content.Context context) {
        if (zaml == null) {
            zaml = new com.google.android.gms.common.images.ImageManager(context, false);
        }
        return zaml;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static final class zaa extends androidx.collection.LruCache<com.google.android.gms.common.images.zaa, android.graphics.Bitmap> {
        @Override // androidx.collection.LruCache
        protected final /* synthetic */ int sizeOf(com.google.android.gms.common.images.zaa zaaVar, android.graphics.Bitmap bitmap) {
            android.graphics.Bitmap bitmap2 = bitmap;
            return bitmap2.getHeight() * bitmap2.getRowBytes();
        }

        @Override // androidx.collection.LruCache
        protected final /* synthetic */ void entryRemoved(boolean z, com.google.android.gms.common.images.zaa zaaVar, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
            super.entryRemoved(z, zaaVar, bitmap, bitmap2);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class zab implements java.lang.Runnable {
        private final com.google.android.gms.common.images.zab zamw;

        public zab(com.google.android.gms.common.images.zab zabVar) {
            this.zamw = zabVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.gms.common.internal.Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) com.google.android.gms.common.images.ImageManager.this.zamp.get(this.zamw);
            if (imageReceiver != null) {
                com.google.android.gms.common.images.ImageManager.this.zamp.remove(this.zamw);
                imageReceiver.zac(this.zamw);
            }
            com.google.android.gms.common.images.zaa zaaVar = this.zamw.zamz;
            if (zaaVar.uri == null) {
                this.zamw.zaa(com.google.android.gms.common.images.ImageManager.this.mContext, com.google.android.gms.common.images.ImageManager.this.zamo, true);
                return;
            }
            android.graphics.Bitmap bitmapZaa = com.google.android.gms.common.images.ImageManager.this.zaa(zaaVar);
            if (bitmapZaa != null) {
                this.zamw.zaa(com.google.android.gms.common.images.ImageManager.this.mContext, bitmapZaa, true);
                return;
            }
            java.lang.Long l = (java.lang.Long) com.google.android.gms.common.images.ImageManager.this.zamr.get(zaaVar.uri);
            if (l != null) {
                if (android.os.SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.zamw.zaa(com.google.android.gms.common.images.ImageManager.this.mContext, com.google.android.gms.common.images.ImageManager.this.zamo, true);
                    return;
                }
                com.google.android.gms.common.images.ImageManager.this.zamr.remove(zaaVar.uri);
            }
            this.zamw.zaa(com.google.android.gms.common.images.ImageManager.this.mContext, com.google.android.gms.common.images.ImageManager.this.zamo);
            com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver2 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) com.google.android.gms.common.images.ImageManager.this.zamq.get(zaaVar.uri);
            if (imageReceiver2 == null) {
                imageReceiver2 = com.google.android.gms.common.images.ImageManager.this.new ImageReceiver(zaaVar.uri);
                com.google.android.gms.common.images.ImageManager.this.zamq.put(zaaVar.uri, imageReceiver2);
            }
            imageReceiver2.zab(this.zamw);
            if (!(this.zamw instanceof com.google.android.gms.common.images.zac)) {
                com.google.android.gms.common.images.ImageManager.this.zamp.put(this.zamw, imageReceiver2);
            }
            synchronized (com.google.android.gms.common.images.ImageManager.zamj) {
                if (!com.google.android.gms.common.images.ImageManager.zamk.contains(zaaVar.uri)) {
                    com.google.android.gms.common.images.ImageManager.zamk.add(zaaVar.uri);
                    imageReceiver2.zacc();
                }
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class zac implements java.lang.Runnable {
        private final android.net.Uri zamt;
        private final android.os.ParcelFileDescriptor zamx;

        public zac(android.net.Uri uri, android.os.ParcelFileDescriptor parcelFileDescriptor) {
            this.zamt = uri;
            this.zamx = parcelFileDescriptor;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            android.graphics.Bitmap bitmap;
            com.google.android.gms.common.internal.Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            android.os.ParcelFileDescriptor parcelFileDescriptor = this.zamx;
            boolean z2 = false;
            android.graphics.Bitmap bitmapDecodeFileDescriptor = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmapDecodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (java.lang.OutOfMemoryError e) {
                    java.lang.String strValueOf = java.lang.String.valueOf(this.zamt);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(strValueOf);
                    android.util.Log.e("ImageManager", sb.toString(), e);
                    z2 = true;
                }
                try {
                    this.zamx.close();
                } catch (java.io.IOException e2) {
                    android.util.Log.e("ImageManager", "closed failed", e2);
                }
                z = z2;
                bitmap = bitmapDecodeFileDescriptor;
            } else {
                bitmap = null;
                z = false;
            }
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.google.android.gms.common.images.ImageManager.this.mHandler.post(com.google.android.gms.common.images.ImageManager.this.new zad(this.zamt, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(this.zamt);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(strValueOf2);
                android.util.Log.w("ImageManager", sb2.toString());
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class ImageReceiver extends android.os.ResultReceiver {
        private final android.net.Uri zamt;
        private final java.util.ArrayList<com.google.android.gms.common.images.zab> zamu;

        ImageReceiver(android.net.Uri uri) {
            super(new com.google.android.gms.internal.base.zar(android.os.Looper.getMainLooper()));
            this.zamt = uri;
            this.zamu = new java.util.ArrayList<>();
        }

        public final void zab(com.google.android.gms.common.images.zab zabVar) {
            com.google.android.gms.common.internal.Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zamu.add(zabVar);
        }

        public final void zac(com.google.android.gms.common.images.zab zabVar) {
            com.google.android.gms.common.internal.Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zamu.remove(zabVar);
        }

        public final void zacc() {
            android.content.Intent intent = new android.content.Intent(com.google.android.gms.common.internal.Constants.ACTION_LOAD_IMAGE);
            intent.putExtra(com.google.android.gms.common.internal.Constants.EXTRA_URI, this.zamt);
            intent.putExtra(com.google.android.gms.common.internal.Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(com.google.android.gms.common.internal.Constants.EXTRA_PRIORITY, 3);
            com.google.android.gms.common.images.ImageManager.this.mContext.sendBroadcast(intent);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i, android.os.Bundle bundle) {
            com.google.android.gms.common.images.ImageManager.this.zamm.execute(com.google.android.gms.common.images.ImageManager.this.new zac(this.zamt, (android.os.ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class zad implements java.lang.Runnable {
        private final android.graphics.Bitmap mBitmap;
        private final java.util.concurrent.CountDownLatch zads;
        private final android.net.Uri zamt;
        private boolean zamy;

        public zad(android.net.Uri uri, android.graphics.Bitmap bitmap, boolean z, java.util.concurrent.CountDownLatch countDownLatch) {
            this.zamt = uri;
            this.mBitmap = bitmap;
            this.zamy = z;
            this.zads = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.google.android.gms.common.internal.Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if (com.google.android.gms.common.images.ImageManager.this.zamn != null) {
                if (this.zamy) {
                    com.google.android.gms.common.images.ImageManager.this.zamn.evictAll();
                    java.lang.System.gc();
                    this.zamy = false;
                    com.google.android.gms.common.images.ImageManager.this.mHandler.post(this);
                    return;
                }
                if (z) {
                    com.google.android.gms.common.images.ImageManager.this.zamn.put(new com.google.android.gms.common.images.zaa(this.zamt), this.mBitmap);
                }
            }
            com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) com.google.android.gms.common.images.ImageManager.this.zamq.remove(this.zamt);
            if (imageReceiver != null) {
                java.util.ArrayList arrayList = imageReceiver.zamu;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    com.google.android.gms.common.images.zab zabVar = (com.google.android.gms.common.images.zab) arrayList.get(i);
                    if (z) {
                        zabVar.zaa(com.google.android.gms.common.images.ImageManager.this.mContext, this.mBitmap, false);
                    } else {
                        com.google.android.gms.common.images.ImageManager.this.zamr.put(this.zamt, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                        zabVar.zaa(com.google.android.gms.common.images.ImageManager.this.mContext, com.google.android.gms.common.images.ImageManager.this.zamo, false);
                    }
                    if (!(zabVar instanceof com.google.android.gms.common.images.zac)) {
                        com.google.android.gms.common.images.ImageManager.this.zamp.remove(zabVar);
                    }
                }
            }
            this.zads.countDown();
            synchronized (com.google.android.gms.common.images.ImageManager.zamj) {
                com.google.android.gms.common.images.ImageManager.zamk.remove(this.zamt);
            }
        }
    }

    private ImageManager(android.content.Context context, boolean z) {
        this.mContext = context.getApplicationContext();
    }

    public final void loadImage(android.widget.ImageView imageView, android.net.Uri uri) {
        zaa(new com.google.android.gms.common.images.zad(imageView, uri));
    }

    public final void loadImage(android.widget.ImageView imageView, int i) {
        zaa(new com.google.android.gms.common.images.zad(imageView, i));
    }

    public final void loadImage(android.widget.ImageView imageView, android.net.Uri uri, int i) {
        com.google.android.gms.common.images.zad zadVar = new com.google.android.gms.common.images.zad(imageView, uri);
        zadVar.zanb = i;
        zaa(zadVar);
    }

    public final void loadImage(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri) {
        zaa(new com.google.android.gms.common.images.zac(onImageLoadedListener, uri));
    }

    public final void loadImage(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri, int i) {
        com.google.android.gms.common.images.zac zacVar = new com.google.android.gms.common.images.zac(onImageLoadedListener, uri);
        zacVar.zanb = i;
        zaa(zacVar);
    }

    private final void zaa(com.google.android.gms.common.images.zab zabVar) {
        com.google.android.gms.common.internal.Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new com.google.android.gms.common.images.ImageManager.zab(zabVar).run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Bitmap zaa(com.google.android.gms.common.images.zaa zaaVar) {
        com.google.android.gms.common.images.ImageManager.zaa zaaVar2 = this.zamn;
        if (zaaVar2 == null) {
            return null;
        }
        return zaaVar2.get(zaaVar);
    }
}
