package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes.dex */
public interface IObjectWrapper extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IObjectWrapper {

        public static class zza extends com.google.android.gms.internal.common.zza implements com.google.android.gms.dynamic.IObjectWrapper {
            zza(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static com.google.android.gms.dynamic.IObjectWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamic.IObjectWrapper) {
                return (com.google.android.gms.dynamic.IObjectWrapper) iInterfaceQueryLocalInterface;
            }
            return new com.google.android.gms.dynamic.IObjectWrapper.Stub.zza(iBinder);
        }
    }
}
