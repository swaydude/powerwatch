package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzl extends com.google.android.gms.internal.measurement.zzc implements com.google.android.gms.internal.measurement.zzm {
    public zzl() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static com.google.android.gms.internal.measurement.zzm asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzm) {
            return (com.google.android.gms.internal.measurement.zzm) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.measurement.zzo(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.measurement.zzn zzpVar;
        com.google.android.gms.internal.measurement.zzn zznVar;
        com.google.android.gms.internal.measurement.zzn zzpVar2 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar3 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar4 = null;
        com.google.android.gms.internal.measurement.zzs zzuVar = null;
        com.google.android.gms.internal.measurement.zzs zzuVar2 = null;
        com.google.android.gms.internal.measurement.zzs zzuVar3 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar5 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar6 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar7 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar8 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar9 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar10 = null;
        com.google.android.gms.internal.measurement.zzt zzwVar = null;
        com.google.android.gms.internal.measurement.zzn zzpVar11 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar12 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar13 = null;
        com.google.android.gms.internal.measurement.zzn zzpVar14 = null;
        switch (i) {
            case 1:
                initialize(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (com.google.android.gms.internal.measurement.zzv) com.google.android.gms.internal.measurement.zzb.zza(parcel, com.google.android.gms.internal.measurement.zzv.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcel, android.os.Bundle.CREATOR), com.google.android.gms.internal.measurement.zzb.zza(parcel), com.google.android.gms.internal.measurement.zzb.zza(parcel), parcel.readLong());
                break;
            case 3:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zznVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface;
                    } else {
                        zzpVar = new com.google.android.gms.internal.measurement.zzp(strongBinder);
                    }
                    zznVar = zzpVar;
                }
                logEventAndBundle(string, string2, bundle, zznVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.internal.measurement.zzb.zza(parcel), parcel.readLong());
                break;
            case 5:
                java.lang.String string3 = parcel.readString();
                java.lang.String string4 = parcel.readString();
                boolean zZza = com.google.android.gms.internal.measurement.zzb.zza(parcel);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar2 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface2;
                    } else {
                        zzpVar2 = new com.google.android.gms.internal.measurement.zzp(strongBinder2);
                    }
                }
                getUserProperties(string3, string4, zZza, zzpVar2);
                break;
            case 6:
                java.lang.String string5 = parcel.readString();
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar14 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface3;
                    } else {
                        zzpVar14 = new com.google.android.gms.internal.measurement.zzp(strongBinder3);
                    }
                }
                getMaxUserProperties(string5, zzpVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcel, android.os.Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcel, android.os.Bundle.CREATOR));
                break;
            case 10:
                java.lang.String string6 = parcel.readString();
                java.lang.String string7 = parcel.readString();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar13 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface4;
                    } else {
                        zzpVar13 = new com.google.android.gms.internal.measurement.zzp(strongBinder4);
                    }
                }
                getConditionalUserProperties(string6, string7, zzpVar13);
                break;
            case 11:
                setMeasurementEnabled(com.google.android.gms.internal.measurement.zzb.zza(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar12 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface5;
                    } else {
                        zzpVar12 = new com.google.android.gms.internal.measurement.zzp(strongBinder5);
                    }
                }
                getCurrentScreenName(zzpVar12);
                break;
            case 17:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar11 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface6;
                    } else {
                        zzpVar11 = new com.google.android.gms.internal.measurement.zzp(strongBinder6);
                    }
                }
                getCurrentScreenClass(zzpVar11);
                break;
            case 18:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (iInterfaceQueryLocalInterface7 instanceof com.google.android.gms.internal.measurement.zzt) {
                        zzwVar = (com.google.android.gms.internal.measurement.zzt) iInterfaceQueryLocalInterface7;
                    } else {
                        zzwVar = new com.google.android.gms.internal.measurement.zzw(strongBinder7);
                    }
                }
                setInstanceIdProvider(zzwVar);
                break;
            case 19:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface8 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar10 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface8;
                    } else {
                        zzpVar10 = new com.google.android.gms.internal.measurement.zzp(strongBinder8);
                    }
                }
                getCachedAppInstanceId(zzpVar10);
                break;
            case 20:
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface9 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar9 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface9;
                    } else {
                        zzpVar9 = new com.google.android.gms.internal.measurement.zzp(strongBinder9);
                    }
                }
                getAppInstanceId(zzpVar9);
                break;
            case 21:
                android.os.IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface10 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar8 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface10;
                    } else {
                        zzpVar8 = new com.google.android.gms.internal.measurement.zzp(strongBinder10);
                    }
                }
                getGmpAppId(zzpVar8);
                break;
            case 22:
                android.os.IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface11 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar7 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface11;
                    } else {
                        zzpVar7 = new com.google.android.gms.internal.measurement.zzp(strongBinder11);
                    }
                }
                generateEventId(zzpVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcel, android.os.Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                android.os.IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface12 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar6 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface12;
                    } else {
                        zzpVar6 = new com.google.android.gms.internal.measurement.zzp(strongBinder12);
                    }
                }
                onActivitySaveInstanceState(iObjectWrapperAsInterface, zzpVar6, parcel.readLong());
                break;
            case 32:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzb.zza(parcel, android.os.Bundle.CREATOR);
                android.os.IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface13 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar5 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface13;
                    } else {
                        zzpVar5 = new com.google.android.gms.internal.measurement.zzp(strongBinder13);
                    }
                }
                performAction(bundle2, zzpVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                break;
            case 34:
                android.os.IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface14 instanceof com.google.android.gms.internal.measurement.zzs) {
                        zzuVar3 = (com.google.android.gms.internal.measurement.zzs) iInterfaceQueryLocalInterface14;
                    } else {
                        zzuVar3 = new com.google.android.gms.internal.measurement.zzu(strongBinder14);
                    }
                }
                setEventInterceptor(zzuVar3);
                break;
            case 35:
                android.os.IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface15 instanceof com.google.android.gms.internal.measurement.zzs) {
                        zzuVar2 = (com.google.android.gms.internal.measurement.zzs) iInterfaceQueryLocalInterface15;
                    } else {
                        zzuVar2 = new com.google.android.gms.internal.measurement.zzu(strongBinder15);
                    }
                }
                registerOnMeasurementEventListener(zzuVar2);
                break;
            case 36:
                android.os.IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (iInterfaceQueryLocalInterface16 instanceof com.google.android.gms.internal.measurement.zzs) {
                        zzuVar = (com.google.android.gms.internal.measurement.zzs) iInterfaceQueryLocalInterface16;
                    } else {
                        zzuVar = new com.google.android.gms.internal.measurement.zzu(strongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(zzuVar);
                break;
            case 37:
                initForTests(com.google.android.gms.internal.measurement.zzb.zzb(parcel));
                break;
            case 38:
                android.os.IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface17 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar4 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface17;
                    } else {
                        zzpVar4 = new com.google.android.gms.internal.measurement.zzp(strongBinder17);
                    }
                }
                getTestFlag(zzpVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(com.google.android.gms.internal.measurement.zzb.zza(parcel));
                break;
            case 40:
                android.os.IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (iInterfaceQueryLocalInterface18 instanceof com.google.android.gms.internal.measurement.zzn) {
                        zzpVar3 = (com.google.android.gms.internal.measurement.zzn) iInterfaceQueryLocalInterface18;
                    } else {
                        zzpVar3 = new com.google.android.gms.internal.measurement.zzp(strongBinder18);
                    }
                }
                isDataCollectionEnabled(zzpVar3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
