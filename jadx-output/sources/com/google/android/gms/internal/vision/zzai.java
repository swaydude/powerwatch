package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzai extends com.google.android.gms.internal.vision.zzn<com.google.android.gms.internal.vision.zzy> {
    private final com.google.android.gms.internal.vision.zzah zzef;

    public zzai(android.content.Context context, com.google.android.gms.internal.vision.zzah zzahVar) {
        super(context, "TextNativeHandle", "ocr");
        this.zzef = zzahVar;
        zzp();
    }

    public final com.google.android.gms.internal.vision.zzac[] zza(android.graphics.Bitmap bitmap, com.google.android.gms.internal.vision.zzp zzpVar, com.google.android.gms.internal.vision.zzae zzaeVar) {
        if (!isOperational()) {
            return new com.google.android.gms.internal.vision.zzac[0];
        }
        try {
            return zzp().zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(bitmap), zzpVar, zzaeVar);
        } catch (android.os.RemoteException e) {
            android.util.Log.e("TextNativeHandle", "Error calling native text recognizer", e);
            return new com.google.android.gms.internal.vision.zzac[0];
        }
    }

    @Override // com.google.android.gms.internal.vision.zzn
    protected final void zzn() throws android.os.RemoteException {
        zzp().zzq();
    }

    @Override // com.google.android.gms.internal.vision.zzn
    protected final /* synthetic */ com.google.android.gms.internal.vision.zzy zza(com.google.android.gms.dynamite.DynamiteModule dynamiteModule, android.content.Context context) throws android.os.RemoteException, com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        com.google.android.gms.internal.vision.zzaa zzzVar;
        android.os.IBinder iBinderInstantiate = dynamiteModule.instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator");
        if (iBinderInstantiate == null) {
            zzzVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.vision.zzaa) {
                zzzVar = (com.google.android.gms.internal.vision.zzaa) iInterfaceQueryLocalInterface;
            } else {
                zzzVar = new com.google.android.gms.internal.vision.zzz(iBinderInstantiate);
            }
        }
        if (zzzVar == null) {
            return null;
        }
        return zzzVar.zza(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), this.zzef);
    }
}
