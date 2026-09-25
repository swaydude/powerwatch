package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public interface IGmsServiceBroker extends android.os.IInterface {
    void getService(com.google.android.gms.common.internal.IGmsCallbacks iGmsCallbacks, com.google.android.gms.common.internal.GetServiceRequest getServiceRequest) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.google.android.gms.common.internal.IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static class zza implements com.google.android.gms.common.internal.IGmsServiceBroker {
            private final android.os.IBinder zza;

            zza(android.os.IBinder iBinder) {
                this.zza = iBinder;
            }

            @Override // android.os.IInterface
            public final android.os.IBinder asBinder() {
                return this.zza;
            }

            @Override // com.google.android.gms.common.internal.IGmsServiceBroker
            public final void getService(com.google.android.gms.common.internal.IGmsCallbacks iGmsCallbacks, com.google.android.gms.common.internal.GetServiceRequest getServiceRequest) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    parcelObtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
                    if (getServiceRequest != null) {
                        parcelObtain.writeInt(1);
                        getServiceRequest.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.zza.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:66:0x00dd  */
        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            com.google.android.gms.common.internal.IGmsCallbacks zzlVar;
            if (i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzlVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.IGmsCallbacks) {
                    zzlVar = (com.google.android.gms.common.internal.IGmsCallbacks) iInterfaceQueryLocalInterface;
                } else {
                    zzlVar = new com.google.android.gms.common.internal.zzl(strongBinder);
                }
            }
            if (i == 46) {
                getService(zzlVar, parcel.readInt() != 0 ? com.google.android.gms.common.internal.GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 47) {
                if (parcel.readInt() != 0) {
                    com.google.android.gms.common.internal.zzr.CREATOR.createFromParcel(parcel);
                }
                throw new java.lang.UnsupportedOperationException();
            }
            parcel.readInt();
            if (i != 4) {
                parcel.readString();
            }
            if (i != 1) {
                if (i != 2 && i != 23 && i != 25 && i != 27) {
                    if (i != 30) {
                        if (i != 34) {
                            if (i == 41 || i == 43 || i == 37 || i == 38) {
                                if (parcel.readInt() != 0) {
                                    android.os.Bundle.CREATOR.createFromParcel(parcel);
                                }
                            } else {
                                switch (i) {
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                        if (parcel.readInt() != 0) {
                                            android.os.Bundle.CREATOR.createFromParcel(parcel);
                                        }
                                        break;
                                    case 9:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        parcel.readString();
                                        parcel.readStrongBinder();
                                        parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            android.os.Bundle.CREATOR.createFromParcel(parcel);
                                        }
                                        break;
                                    case 10:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        break;
                                    case 19:
                                        parcel.readStrongBinder();
                                        if (parcel.readInt() != 0) {
                                            android.os.Bundle.CREATOR.createFromParcel(parcel);
                                        }
                                        break;
                                    case 20:
                                        parcel.createStringArray();
                                        parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            android.os.Bundle.CREATOR.createFromParcel(parcel);
                                        }
                                        break;
                                }
                            }
                        } else {
                            parcel.readString();
                        }
                    } else {
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            android.os.Bundle.CREATOR.createFromParcel(parcel);
                        }
                    }
                } else if (parcel.readInt() != 0) {
                    android.os.Bundle.CREATOR.createFromParcel(parcel);
                }
            } else {
                parcel.readString();
                parcel.createStringArray();
                parcel.readString();
                if (parcel.readInt() != 0) {
                    android.os.Bundle.CREATOR.createFromParcel(parcel);
                }
            }
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
