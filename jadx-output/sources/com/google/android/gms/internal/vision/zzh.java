package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh extends com.google.android.gms.internal.vision.zzn<com.google.android.gms.internal.vision.zzg> {
    private final com.google.android.gms.internal.vision.zzf zzbl;

    public zzh(android.content.Context context, com.google.android.gms.internal.vision.zzf zzfVar) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.zzbl = zzfVar;
        zzp();
    }

    public final com.google.android.gms.vision.barcode.Barcode[] zza(java.nio.ByteBuffer byteBuffer, com.google.android.gms.internal.vision.zzp zzpVar) {
        if (!isOperational()) {
            return new com.google.android.gms.vision.barcode.Barcode[0];
        }
        try {
            return zzp().zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(byteBuffer), zzpVar);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new com.google.android.gms.vision.barcode.Barcode[0];
        }
    }

    public final com.google.android.gms.vision.barcode.Barcode[] zza(android.graphics.Bitmap bitmap, com.google.android.gms.internal.vision.zzp zzpVar) {
        if (!isOperational()) {
            return new com.google.android.gms.vision.barcode.Barcode[0];
        }
        try {
            return zzp().zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(bitmap), zzpVar);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new com.google.android.gms.vision.barcode.Barcode[0];
        }
    }

    @Override // com.google.android.gms.internal.vision.zzn
    protected final void zzn() throws android.os.RemoteException {
        if (isOperational()) {
            zzp().zzm();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzn
    protected final /* synthetic */ com.google.android.gms.internal.vision.zzg zza(com.google.android.gms.dynamite.DynamiteModule dynamiteModule, android.content.Context context) throws android.os.RemoteException, com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.internal.vision.zzi zzkVar;
        android.os.IBinder iBinderInstantiate = dynamiteModule.instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (iBinderInstantiate == null) {
            zzkVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.vision.zzi) {
                zzkVar = (com.google.android.gms.internal.vision.zzi) iInterfaceQueryLocalInterface;
            } else {
                zzkVar = new com.google.android.gms.internal.vision.zzk(iBinderInstantiate);
            }
        }
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzbl);
    }
}
