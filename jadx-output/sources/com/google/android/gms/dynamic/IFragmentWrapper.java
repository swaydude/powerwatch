package com.google.android.gms.dynamic;

/* JADX INFO: loaded from: classes.dex */
public interface IFragmentWrapper extends android.os.IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static class zza extends com.google.android.gms.internal.common.zza implements com.google.android.gms.dynamic.IFragmentWrapper {
            zza(android.os.IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final com.google.android.gms.dynamic.IObjectWrapper zzae() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(2, zza());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
                parcelZza.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final android.os.Bundle getArguments() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(3, zza());
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.common.zzc.zza(parcelZza, android.os.Bundle.CREATOR);
                parcelZza.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final int getId() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(4, zza());
                int i = parcelZza.readInt();
                parcelZza.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final com.google.android.gms.dynamic.IFragmentWrapper zzaf() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(5, zza());
                com.google.android.gms.dynamic.IFragmentWrapper iFragmentWrapperAsInterface = com.google.android.gms.dynamic.IFragmentWrapper.Stub.asInterface(parcelZza.readStrongBinder());
                parcelZza.recycle();
                return iFragmentWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final com.google.android.gms.dynamic.IObjectWrapper zzag() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(6, zza());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
                parcelZza.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean getRetainInstance() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(7, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final java.lang.String getTag() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(8, zza());
                java.lang.String string = parcelZza.readString();
                parcelZza.recycle();
                return string;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final com.google.android.gms.dynamic.IFragmentWrapper zzah() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(9, zza());
                com.google.android.gms.dynamic.IFragmentWrapper iFragmentWrapperAsInterface = com.google.android.gms.dynamic.IFragmentWrapper.Stub.asInterface(parcelZza.readStrongBinder());
                parcelZza.recycle();
                return iFragmentWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final int getTargetRequestCode() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(10, zza());
                int i = parcelZza.readInt();
                parcelZza.recycle();
                return i;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean getUserVisibleHint() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(11, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final com.google.android.gms.dynamic.IObjectWrapper zzai() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(12, zza());
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
                parcelZza.recycle();
                return iObjectWrapperAsInterface;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isAdded() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(13, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isDetached() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(14, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isHidden() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(15, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isInLayout() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(16, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isRemoving() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(17, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isResumed() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(18, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final boolean isVisible() throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza(19, zza());
                boolean zZza = com.google.android.gms.internal.common.zzc.zza(parcelZza);
                parcelZza.recycle();
                return zZza;
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
                zzb(20, parcelZza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setHasOptionsMenu(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.writeBoolean(parcelZza, z);
                zzb(21, parcelZza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setMenuVisibility(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.writeBoolean(parcelZza, z);
                zzb(22, parcelZza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setRetainInstance(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.writeBoolean(parcelZza, z);
                zzb(23, parcelZza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void setUserVisibleHint(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.writeBoolean(parcelZza, z);
                zzb(24, parcelZza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void startActivity(android.content.Intent intent) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.zza(parcelZza, intent);
                zzb(25, parcelZza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void startActivityForResult(android.content.Intent intent, int i) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.zza(parcelZza, intent);
                parcelZza.writeInt(i);
                zzb(26, parcelZza);
            }

            @Override // com.google.android.gms.dynamic.IFragmentWrapper
            public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
                android.os.Parcel parcelZza = zza();
                com.google.android.gms.internal.common.zzc.zza(parcelZza, iObjectWrapper);
                zzb(27, parcelZza);
            }
        }

        public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.dynamic.IFragmentWrapper) {
                return (com.google.android.gms.dynamic.IFragmentWrapper) iInterfaceQueryLocalInterface;
            }
            return new com.google.android.gms.dynamic.IFragmentWrapper.Stub.zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            switch (i) {
                case 2:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzae = zzae();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zza(parcel2, iObjectWrapperZzae);
                    return true;
                case 3:
                    android.os.Bundle arguments = getArguments();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzb(parcel2, arguments);
                    return true;
                case 4:
                    int id = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(id);
                    return true;
                case 5:
                    com.google.android.gms.dynamic.IFragmentWrapper iFragmentWrapperZzaf = zzaf();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zza(parcel2, iFragmentWrapperZzaf);
                    return true;
                case 6:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzag = zzag();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zza(parcel2, iObjectWrapperZzag);
                    return true;
                case 7:
                    boolean retainInstance = getRetainInstance();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, retainInstance);
                    return true;
                case 8:
                    java.lang.String tag = getTag();
                    parcel2.writeNoException();
                    parcel2.writeString(tag);
                    return true;
                case 9:
                    com.google.android.gms.dynamic.IFragmentWrapper iFragmentWrapperZzah = zzah();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zza(parcel2, iFragmentWrapperZzah);
                    return true;
                case 10:
                    int targetRequestCode = getTargetRequestCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(targetRequestCode);
                    return true;
                case 11:
                    boolean userVisibleHint = getUserVisibleHint();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, userVisibleHint);
                    return true;
                case 12:
                    com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzai = zzai();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zza(parcel2, iObjectWrapperZzai);
                    return true;
                case 13:
                    boolean zIsAdded = isAdded();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, zIsAdded);
                    return true;
                case 14:
                    boolean zIsDetached = isDetached();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, zIsDetached);
                    return true;
                case 15:
                    boolean zIsHidden = isHidden();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, zIsHidden);
                    return true;
                case 16:
                    boolean zIsInLayout = isInLayout();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, zIsInLayout);
                    return true;
                case 17:
                    boolean zIsRemoving = isRemoving();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, zIsRemoving);
                    return true;
                case 18:
                    boolean zIsResumed = isResumed();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, zIsResumed);
                    return true;
                case 19:
                    boolean zIsVisible = isVisible();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.writeBoolean(parcel2, zIsVisible);
                    return true;
                case 20:
                    zza(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    setHasOptionsMenu(com.google.android.gms.internal.common.zzc.zza(parcel));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    setMenuVisibility(com.google.android.gms.internal.common.zzc.zza(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    setRetainInstance(com.google.android.gms.internal.common.zzc.zza(parcel));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    setUserVisibleHint(com.google.android.gms.internal.common.zzc.zza(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    startActivity((android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    startActivityForResult((android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    android.os.Bundle getArguments() throws android.os.RemoteException;

    int getId() throws android.os.RemoteException;

    boolean getRetainInstance() throws android.os.RemoteException;

    java.lang.String getTag() throws android.os.RemoteException;

    int getTargetRequestCode() throws android.os.RemoteException;

    boolean getUserVisibleHint() throws android.os.RemoteException;

    boolean isAdded() throws android.os.RemoteException;

    boolean isDetached() throws android.os.RemoteException;

    boolean isHidden() throws android.os.RemoteException;

    boolean isInLayout() throws android.os.RemoteException;

    boolean isRemoving() throws android.os.RemoteException;

    boolean isResumed() throws android.os.RemoteException;

    boolean isVisible() throws android.os.RemoteException;

    void setHasOptionsMenu(boolean z) throws android.os.RemoteException;

    void setMenuVisibility(boolean z) throws android.os.RemoteException;

    void setRetainInstance(boolean z) throws android.os.RemoteException;

    void setUserVisibleHint(boolean z) throws android.os.RemoteException;

    void startActivity(android.content.Intent intent) throws android.os.RemoteException;

    void startActivityForResult(android.content.Intent intent, int i) throws android.os.RemoteException;

    void zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzae() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zzaf() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzag() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IFragmentWrapper zzah() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper zzai() throws android.os.RemoteException;

    void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;
}
