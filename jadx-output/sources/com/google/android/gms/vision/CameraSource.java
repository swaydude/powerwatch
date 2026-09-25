package com.google.android.gms.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class CameraSource {
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    private int facing;
    private int rotation;
    private android.content.Context zze;
    private final java.lang.Object zzf;
    private android.hardware.Camera zzg;
    private com.google.android.gms.common.images.Size zzh;
    private float zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private java.lang.String zzm;
    private android.graphics.SurfaceTexture zzn;
    private boolean zzo;
    private java.lang.Thread zzp;
    private com.google.android.gms.vision.CameraSource.zzb zzq;
    private java.util.Map<byte[], java.nio.ByteBuffer> zzr;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public interface PictureCallback {
        void onPictureTaken(byte[] bArr);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public interface ShutterCallback {
        void onShutter();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    class zza implements android.hardware.Camera.PreviewCallback {
        private zza() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
            com.google.android.gms.vision.CameraSource.this.zzq.zza(bArr, camera);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static class zzc implements android.hardware.Camera.ShutterCallback {
        private com.google.android.gms.vision.CameraSource.ShutterCallback zzaa;

        private zzc() {
        }

        @Override // android.hardware.Camera.ShutterCallback
        public final void onShutter() {
            com.google.android.gms.vision.CameraSource.ShutterCallback shutterCallback = this.zzaa;
            if (shutterCallback != null) {
                shutterCallback.onShutter();
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    class zzd implements android.hardware.Camera.PictureCallback {
        private com.google.android.gms.vision.CameraSource.PictureCallback zzab;

        private zzd() {
        }

        @Override // android.hardware.Camera.PictureCallback
        public final void onPictureTaken(byte[] bArr, android.hardware.Camera camera) {
            com.google.android.gms.vision.CameraSource.PictureCallback pictureCallback = this.zzab;
            if (pictureCallback != null) {
                pictureCallback.onPictureTaken(bArr);
            }
            synchronized (com.google.android.gms.vision.CameraSource.this.zzf) {
                if (com.google.android.gms.vision.CameraSource.this.zzg != null) {
                    com.google.android.gms.vision.CameraSource.this.zzg.startPreview();
                }
            }
        }
    }

    public void release() {
        synchronized (this.zzf) {
            stop();
            this.zzq.release();
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    static class zze {
        private com.google.android.gms.common.images.Size zzac;
        private com.google.android.gms.common.images.Size zzad;

        public zze(android.hardware.Camera.Size size, @javax.annotation.Nullable android.hardware.Camera.Size size2) {
            this.zzac = new com.google.android.gms.common.images.Size(size.width, size.height);
            if (size2 != null) {
                this.zzad = new com.google.android.gms.common.images.Size(size2.width, size2.height);
            }
        }

        public final com.google.android.gms.common.images.Size zzb() {
            return this.zzac;
        }

        @javax.annotation.Nullable
        public final com.google.android.gms.common.images.Size zzc() {
            return this.zzad;
        }
    }

    public com.google.android.gms.vision.CameraSource start() throws java.io.IOException {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            this.zzg = zza();
            android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(100);
            this.zzn = surfaceTexture;
            this.zzg.setPreviewTexture(surfaceTexture);
            this.zzo = true;
            this.zzg.startPreview();
            java.lang.Thread thread = new java.lang.Thread(this.zzq);
            this.zzp = thread;
            thread.setName("gms.vision.CameraSource");
            this.zzq.setActive(true);
            this.zzp.start();
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    class zzb implements java.lang.Runnable {
        private com.google.android.gms.vision.Detector<?> zzt;
        private long zzx;
        private java.nio.ByteBuffer zzz;
        private long zzv = android.os.SystemClock.elapsedRealtime();
        private final java.lang.Object lock = new java.lang.Object();
        private boolean zzw = true;
        private int zzy = 0;

        zzb(com.google.android.gms.vision.Detector<?> detector) {
            this.zzt = detector;
        }

        final void release() {
            this.zzt.release();
            this.zzt = null;
        }

        final void setActive(boolean z) {
            synchronized (this.lock) {
                this.zzw = z;
                this.lock.notifyAll();
            }
        }

        final void zza(byte[] bArr, android.hardware.Camera camera) {
            synchronized (this.lock) {
                java.nio.ByteBuffer byteBuffer = this.zzz;
                if (byteBuffer != null) {
                    camera.addCallbackBuffer(byteBuffer.array());
                    this.zzz = null;
                }
                if (!com.google.android.gms.vision.CameraSource.this.zzr.containsKey(bArr)) {
                    android.util.Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                this.zzx = android.os.SystemClock.elapsedRealtime() - this.zzv;
                this.zzy++;
                this.zzz = (java.nio.ByteBuffer) com.google.android.gms.vision.CameraSource.this.zzr.get(bArr);
                this.lock.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            com.google.android.gms.vision.Frame frameBuild;
            java.nio.ByteBuffer byteBuffer;
            while (true) {
                synchronized (this.lock) {
                    while (true) {
                        z = this.zzw;
                        if (!z || this.zzz != null) {
                            break;
                        }
                        try {
                            this.lock.wait();
                        } catch (java.lang.InterruptedException e) {
                            android.util.Log.d("CameraSource", "Frame processing loop terminated.", e);
                            return;
                        }
                    }
                    if (!z) {
                        return;
                    }
                    frameBuild = new com.google.android.gms.vision.Frame.Builder().setImageData(this.zzz, com.google.android.gms.vision.CameraSource.this.zzh.getWidth(), com.google.android.gms.vision.CameraSource.this.zzh.getHeight(), 17).setId(this.zzy).setTimestampMillis(this.zzx).setRotation(com.google.android.gms.vision.CameraSource.this.rotation).build();
                    byteBuffer = this.zzz;
                    this.zzz = null;
                }
                try {
                    try {
                        this.zzt.receiveFrame(frameBuild);
                        com.google.android.gms.vision.CameraSource.this.zzg.addCallbackBuffer(byteBuffer.array());
                    } catch (java.lang.Throwable th) {
                        com.google.android.gms.vision.CameraSource.this.zzg.addCallbackBuffer(byteBuffer.array());
                        throw th;
                    }
                } catch (java.lang.Exception e2) {
                    android.util.Log.e("CameraSource", "Exception thrown from receiver.", e2);
                    com.google.android.gms.vision.CameraSource.this.zzg.addCallbackBuffer(byteBuffer.array());
                }
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
    public static class Builder {
        private final com.google.android.gms.vision.Detector<?> zzt;
        private com.google.android.gms.vision.CameraSource zzu;

        public Builder(android.content.Context context, com.google.android.gms.vision.Detector<?> detector) {
            com.google.android.gms.vision.CameraSource cameraSource = new com.google.android.gms.vision.CameraSource();
            this.zzu = cameraSource;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("No context supplied.");
            }
            if (detector == null) {
                throw new java.lang.IllegalArgumentException("No detector supplied.");
            }
            this.zzt = detector;
            cameraSource.zze = context;
        }

        public com.google.android.gms.vision.CameraSource.Builder setRequestedFps(float f) {
            if (f <= 0.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
                sb.append("Invalid fps: ");
                sb.append(f);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.zzu.zzi = f;
            return this;
        }

        public com.google.android.gms.vision.CameraSource.Builder setRequestedPreviewSize(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(45);
                sb.append("Invalid preview size: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.zzu.zzj = i;
            this.zzu.zzk = i2;
            return this;
        }

        public com.google.android.gms.vision.CameraSource.Builder setFacing(int i) {
            if (i != 0 && i != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(27);
                sb.append("Invalid camera: ");
                sb.append(i);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.zzu.facing = i;
            return this;
        }

        public com.google.android.gms.vision.CameraSource.Builder setAutoFocusEnabled(boolean z) {
            this.zzu.zzl = z;
            return this;
        }

        public com.google.android.gms.vision.CameraSource.Builder setFocusMode(java.lang.String str) {
            if (!str.equals("continuous-video") && !str.equals("continuous-picture")) {
                android.util.Log.w("CameraSource", java.lang.String.format("FocusMode %s is not supported for now.", str));
                str = null;
            }
            this.zzu.zzm = str;
            return this;
        }

        public com.google.android.gms.vision.CameraSource build() {
            com.google.android.gms.vision.CameraSource cameraSource = this.zzu;
            cameraSource.getClass();
            cameraSource.zzq = cameraSource.new zzb(this.zzt);
            return this.zzu;
        }
    }

    public com.google.android.gms.vision.CameraSource start(android.view.SurfaceHolder surfaceHolder) throws java.io.IOException {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                return this;
            }
            android.hardware.Camera cameraZza = zza();
            this.zzg = cameraZza;
            cameraZza.setPreviewDisplay(surfaceHolder);
            this.zzg.startPreview();
            this.zzp = new java.lang.Thread(this.zzq);
            this.zzq.setActive(true);
            this.zzp.start();
            this.zzo = false;
            return this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x000e, B:10:0x0019, B:11:0x001b, B:13:0x001f, B:14:0x0027, B:16:0x002b, B:21:0x005c, B:17:0x0031, B:20:0x0038, B:22:0x0063, B:23:0x0068, B:9:0x0012), top: B:33:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002b A[Catch: Exception -> 0x0037, all -> 0x006a, TryCatch #1 {Exception -> 0x0037, blocks: (B:14:0x0027, B:16:0x002b, B:17:0x0031), top: B:31:0x0027, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: Exception -> 0x0037, all -> 0x006a, TRY_LEAVE, TryCatch #1 {Exception -> 0x0037, blocks: (B:14:0x0027, B:16:0x002b, B:17:0x0031), top: B:31:0x0027, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[Catch: all -> 0x006a, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x000e, B:10:0x0019, B:11:0x001b, B:13:0x001f, B:14:0x0027, B:16:0x002b, B:21:0x005c, B:17:0x0031, B:20:0x0038, B:22:0x0063, B:23:0x0068, B:9:0x0012), top: B:33:0x0003, inners: #0, #1 }] */
    public void stop() {
        android.hardware.Camera camera;
        synchronized (this.zzf) {
            this.zzq.setActive(false);
            java.lang.Thread thread = this.zzp;
            if (thread != null) {
                try {
                    thread.join();
                } catch (java.lang.InterruptedException unused) {
                    android.util.Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.zzp = null;
                camera = this.zzg;
                if (camera != null) {
                    camera.stopPreview();
                    this.zzg.setPreviewCallbackWithBuffer(null);
                    try {
                        if (this.zzo) {
                            this.zzg.setPreviewTexture(null);
                        } else {
                            this.zzg.setPreviewDisplay(null);
                        }
                    } catch (java.lang.Exception e) {
                        java.lang.String strValueOf = java.lang.String.valueOf(e);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 32);
                        sb.append("Failed to clear camera preview: ");
                        sb.append(strValueOf);
                        android.util.Log.e("CameraSource", sb.toString());
                    }
                    this.zzg.release();
                    this.zzg = null;
                    this.zzr.clear();
                } else {
                    this.zzr.clear();
                }
            } else {
                camera = this.zzg;
                if (camera != null) {
                    camera.stopPreview();
                    this.zzg.setPreviewCallbackWithBuffer(null);
                    if (this.zzo) {
                        this.zzg.setPreviewTexture(null);
                    } else {
                        this.zzg.setPreviewDisplay(null);
                    }
                    this.zzg.release();
                    this.zzg = null;
                    this.zzr.clear();
                } else {
                    this.zzr.clear();
                }
            }
            throw th;
        }
    }

    public com.google.android.gms.common.images.Size getPreviewSize() {
        return this.zzh;
    }

    public int getCameraFacing() {
        return this.facing;
    }

    public void takePicture(com.google.android.gms.vision.CameraSource.ShutterCallback shutterCallback, com.google.android.gms.vision.CameraSource.PictureCallback pictureCallback) {
        synchronized (this.zzf) {
            if (this.zzg != null) {
                com.google.android.gms.vision.CameraSource.zzc zzcVar = new com.google.android.gms.vision.CameraSource.zzc();
                zzcVar.zzaa = shutterCallback;
                com.google.android.gms.vision.CameraSource.zzd zzdVar = new com.google.android.gms.vision.CameraSource.zzd();
                zzdVar.zzab = pictureCallback;
                this.zzg.takePicture(zzcVar, null, null, zzdVar);
            }
        }
    }

    private CameraSource() {
        this.zzf = new java.lang.Object();
        this.facing = 0;
        this.zzi = 30.0f;
        this.zzj = 1024;
        this.zzk = 768;
        this.zzl = false;
        this.zzr = new java.util.HashMap();
    }

    private final android.hardware.Camera zza() throws java.io.IOException {
        int i;
        int i2;
        int i3;
        int i4 = this.facing;
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        int i5 = 0;
        while (true) {
            if (i5 >= android.hardware.Camera.getNumberOfCameras()) {
                i5 = -1;
                break;
            }
            android.hardware.Camera.getCameraInfo(i5, cameraInfo);
            if (cameraInfo.facing == i4) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            throw new java.io.IOException("Could not find requested camera.");
        }
        android.hardware.Camera cameraOpen = android.hardware.Camera.open(i5);
        int i6 = this.zzj;
        int i7 = this.zzk;
        android.hardware.Camera.Parameters parameters = cameraOpen.getParameters();
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        java.util.List<android.hardware.Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.hardware.Camera.Size size : supportedPreviewSizes) {
            float f = size.width / size.height;
            for (android.hardware.Camera.Size size2 : supportedPictureSizes) {
                if (java.lang.Math.abs(f - (size2.width / size2.height)) < 0.01f) {
                    arrayList.add(new com.google.android.gms.vision.CameraSource.zze(size, size2));
                    break;
                }
            }
        }
        if (arrayList.size() == 0) {
            android.util.Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            java.util.Iterator<android.hardware.Camera.Size> it = supportedPreviewSizes.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.google.android.gms.vision.CameraSource.zze(it.next(), null));
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        int size3 = arrayList2.size();
        int i8 = Integer.MAX_VALUE;
        com.google.android.gms.vision.CameraSource.zze zzeVar = null;
        int i9 = 0;
        int i10 = Integer.MAX_VALUE;
        while (i9 < size3) {
            java.lang.Object obj = arrayList2.get(i9);
            i9++;
            com.google.android.gms.vision.CameraSource.zze zzeVar2 = (com.google.android.gms.vision.CameraSource.zze) obj;
            com.google.android.gms.common.images.Size sizeZzb = zzeVar2.zzb();
            int iAbs = java.lang.Math.abs(sizeZzb.getWidth() - i6) + java.lang.Math.abs(sizeZzb.getHeight() - i7);
            if (iAbs < i10) {
                zzeVar = zzeVar2;
                i10 = iAbs;
            }
        }
        if (zzeVar == null) {
            throw new java.io.IOException("Could not find suitable preview size.");
        }
        com.google.android.gms.common.images.Size sizeZzc = zzeVar.zzc();
        this.zzh = zzeVar.zzb();
        int i11 = (int) (this.zzi * 1000.0f);
        int[] iArr = null;
        for (int[] iArr2 : cameraOpen.getParameters().getSupportedPreviewFpsRange()) {
            int iAbs2 = java.lang.Math.abs(i11 - iArr2[0]) + java.lang.Math.abs(i11 - iArr2[1]);
            if (iAbs2 < i8) {
                iArr = iArr2;
                i8 = iAbs2;
            }
        }
        if (iArr == null) {
            throw new java.io.IOException("Could not find suitable preview frames per second range.");
        }
        android.hardware.Camera.Parameters parameters2 = cameraOpen.getParameters();
        if (sizeZzc != null) {
            parameters2.setPictureSize(sizeZzc.getWidth(), sizeZzc.getHeight());
        }
        parameters2.setPreviewSize(this.zzh.getWidth(), this.zzh.getHeight());
        parameters2.setPreviewFpsRange(iArr[0], iArr[1]);
        parameters2.setPreviewFormat(17);
        int rotation = ((android.view.WindowManager) this.zze.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            i = 0;
        } else if (rotation == 1) {
            i = 90;
        } else if (rotation == 2) {
            i = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightDefault;
        } else if (rotation != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
            sb.append("Bad rotation value: ");
            sb.append(rotation);
            android.util.Log.e("CameraSource", sb.toString());
            i = 0;
        } else {
            i = powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricHeightMax;
        }
        android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
        android.hardware.Camera.getCameraInfo(i5, cameraInfo2);
        if (cameraInfo2.facing == 1) {
            i2 = (cameraInfo2.orientation + i) % 360;
            i3 = (360 - i2) % 360;
        } else {
            i2 = ((cameraInfo2.orientation - i) + 360) % 360;
            i3 = i2;
        }
        this.rotation = i2 / 90;
        cameraOpen.setDisplayOrientation(i3);
        parameters2.setRotation(i2);
        if (this.zzm != null) {
            if (parameters2.getSupportedFocusModes().contains(this.zzm)) {
                parameters2.setFocusMode(this.zzm);
            } else {
                android.util.Log.w("CameraSource", java.lang.String.format("FocusMode %s is not supported on this device.", this.zzm));
                this.zzm = null;
            }
        }
        if (this.zzm == null && this.zzl) {
            if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                parameters2.setFocusMode("continuous-video");
                this.zzm = "continuous-video";
            } else {
                android.util.Log.i("CameraSource", "Camera auto focus is not supported on this device.");
            }
        }
        cameraOpen.setParameters(parameters2);
        cameraOpen.setPreviewCallbackWithBuffer(new com.google.android.gms.vision.CameraSource.zza());
        cameraOpen.addCallbackBuffer(zza(this.zzh));
        cameraOpen.addCallbackBuffer(zza(this.zzh));
        cameraOpen.addCallbackBuffer(zza(this.zzh));
        cameraOpen.addCallbackBuffer(zza(this.zzh));
        return cameraOpen;
    }

    private final byte[] zza(com.google.android.gms.common.images.Size size) {
        byte[] bArr = new byte[((int) java.lang.Math.ceil(((double) ((size.getHeight() * size.getWidth()) * android.graphics.ImageFormat.getBitsPerPixel(17))) / 8.0d)) + 1];
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        if (!byteBufferWrap.hasArray() || byteBufferWrap.array() != bArr) {
            throw new java.lang.IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.zzr.put(bArr, byteBufferWrap);
        return bArr;
    }
}
