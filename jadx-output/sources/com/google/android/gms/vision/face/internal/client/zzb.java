package com.google.android.gms.vision.face.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb extends com.google.android.gms.internal.vision.zzn<com.google.android.gms.vision.face.internal.client.zzh> {
    private final com.google.android.gms.vision.face.internal.client.zzf zzcy;

    public zzb(android.content.Context context, com.google.android.gms.vision.face.internal.client.zzf zzfVar) {
        super(context, "FaceNativeHandle", "face");
        com.google.android.gms.internal.vision.zzbe.init(context);
        this.zzcy = zzfVar;
        zzp();
    }

    public final com.google.android.gms.vision.face.Face[] zzb(java.nio.ByteBuffer byteBuffer, com.google.android.gms.internal.vision.zzp zzpVar) {
        com.google.android.gms.vision.face.Landmark[] landmarkArr;
        com.google.android.gms.vision.face.internal.client.FaceParcel[] faceParcelArr;
        com.google.android.gms.vision.face.Face[] faceArr;
        com.google.android.gms.vision.face.Contour[] contourArr;
        int i = 0;
        if (!isOperational()) {
            return new com.google.android.gms.vision.face.Face[0];
        }
        try {
            com.google.android.gms.vision.face.internal.client.FaceParcel[] faceParcelArrZzc = zzp().zzc(com.google.android.gms.dynamic.ObjectWrapper.wrap(byteBuffer), zzpVar);
            com.google.android.gms.vision.face.Face[] faceArr2 = new com.google.android.gms.vision.face.Face[faceParcelArrZzc.length];
            int i2 = 0;
            while (i2 < faceParcelArrZzc.length) {
                com.google.android.gms.vision.face.internal.client.FaceParcel faceParcel = faceParcelArrZzc[i2];
                int i3 = faceParcel.id;
                android.graphics.PointF pointF = new android.graphics.PointF(faceParcel.centerX, faceParcel.centerY);
                float f = faceParcel.width;
                float f2 = faceParcel.height;
                float f3 = faceParcel.zzcz;
                float f4 = faceParcel.zzda;
                float f5 = faceParcel.zzdb;
                com.google.android.gms.vision.face.internal.client.LandmarkParcel[] landmarkParcelArr = faceParcel.zzdc;
                if (landmarkParcelArr == null) {
                    faceParcelArr = faceParcelArrZzc;
                    faceArr = faceArr2;
                    landmarkArr = new com.google.android.gms.vision.face.Landmark[i];
                } else {
                    landmarkArr = new com.google.android.gms.vision.face.Landmark[landmarkParcelArr.length];
                    int i4 = 0;
                    while (i4 < landmarkParcelArr.length) {
                        com.google.android.gms.vision.face.internal.client.LandmarkParcel landmarkParcel = landmarkParcelArr[i4];
                        landmarkArr[i4] = new com.google.android.gms.vision.face.Landmark(new android.graphics.PointF(landmarkParcel.x, landmarkParcel.y), landmarkParcel.type);
                        i4++;
                        faceParcelArrZzc = faceParcelArrZzc;
                        faceArr2 = faceArr2;
                        landmarkParcelArr = landmarkParcelArr;
                    }
                    faceParcelArr = faceParcelArrZzc;
                    faceArr = faceArr2;
                }
                com.google.android.gms.vision.face.internal.client.zza[] zzaVarArr = faceParcel.zzdd;
                if (zzaVarArr == null) {
                    contourArr = new com.google.android.gms.vision.face.Contour[0];
                } else {
                    com.google.android.gms.vision.face.Contour[] contourArr2 = new com.google.android.gms.vision.face.Contour[zzaVarArr.length];
                    for (int i5 = 0; i5 < zzaVarArr.length; i5++) {
                        com.google.android.gms.vision.face.internal.client.zza zzaVar = zzaVarArr[i5];
                        contourArr2[i5] = new com.google.android.gms.vision.face.Contour(zzaVar.zzcx, zzaVar.type);
                    }
                    contourArr = contourArr2;
                }
                faceArr[i2] = new com.google.android.gms.vision.face.Face(i3, pointF, f, f2, f3, f4, f5, landmarkArr, contourArr, faceParcel.zzce, faceParcel.zzcf, faceParcel.zzcg, faceParcel.zzch);
                i2++;
                faceParcelArrZzc = faceParcelArr;
                faceArr2 = faceArr;
                i = 0;
            }
            return faceArr2;
        } catch (android.os.RemoteException e) {
            android.util.Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new com.google.android.gms.vision.face.Face[0];
        }
    }

    public final boolean zzd(int i) {
        if (!isOperational()) {
            return false;
        }
        try {
            return zzp().zzd(i);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzn
    protected final void zzn() throws android.os.RemoteException {
        zzp().zzm();
    }

    @Override // com.google.android.gms.internal.vision.zzn
    protected final /* synthetic */ com.google.android.gms.vision.face.internal.client.zzh zza(com.google.android.gms.dynamite.DynamiteModule dynamiteModule, android.content.Context context) throws android.os.RemoteException, com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.vision.face.internal.client.zzi zziVarAsInterface;
        if (com.google.android.gms.internal.vision.zzr.zza(context, "com.google.android.gms.vision.dynamite.face")) {
            zziVarAsInterface = com.google.android.gms.vision.face.internal.client.zzl.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator"));
        } else {
            zziVarAsInterface = com.google.android.gms.vision.face.internal.client.zzl.asInterface(dynamiteModule.instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
        }
        if (zziVarAsInterface == null) {
            return null;
        }
        return zziVarAsInterface.newFaceDetector(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzcy);
    }
}
