package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
class AdvertisingInfoServiceStrategy implements io.fabric.sdk.android.services.common.AdvertisingInfoStrategy {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_INTENT = "com.google.android.gms.ads.identifier.service.START";
    public static final java.lang.String GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME = "com.google.android.gms";
    private static final java.lang.String GOOGLE_PLAY_SERVICE_PACKAGE_NAME = "com.android.vending";
    private final android.content.Context context;

    public AdvertisingInfoServiceStrategy(android.content.Context context) {
        this.context = context.getApplicationContext();
    }

    @Override // io.fabric.sdk.android.services.common.AdvertisingInfoStrategy
    public io.fabric.sdk.android.services.common.AdvertisingInfo getAdvertisingInfo() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.context.getPackageManager().getPackageInfo("com.android.vending", 0);
            io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.AdvertisingConnection advertisingConnection = new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.AdvertisingConnection();
            android.content.Intent intent = new android.content.Intent(GOOGLE_PLAY_SERVICES_INTENT);
            intent.setPackage("com.google.android.gms");
            try {
                if (this.context.bindService(intent, advertisingConnection, 1)) {
                    try {
                        io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.AdvertisingInterface advertisingInterface = new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.AdvertisingInterface(advertisingConnection.getBinder());
                        return new io.fabric.sdk.android.services.common.AdvertisingInfo(advertisingInterface.getId(), advertisingInterface.isLimitAdTrackingEnabled());
                    } catch (java.lang.Exception e) {
                        io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        return null;
                    } finally {
                        this.context.unbindService(advertisingConnection);
                    }
                }
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Could not bind to Google Play Service to capture AdvertisingId");
            } catch (java.lang.Throwable th) {
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Could not bind to Google Play Service to capture AdvertisingId", th);
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Unable to find Google Play Services package name");
            return null;
        } catch (java.lang.Exception e2) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Unable to determine if Google Play Services is available", e2);
            return null;
        }
    }

    private static final class AdvertisingConnection implements android.content.ServiceConnection {
        private static final int QUEUE_TIMEOUT_IN_MS = 200;
        private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> queue;
        private boolean retrieved;

        private AdvertisingConnection() {
            this.retrieved = false;
            this.queue = new java.util.concurrent.LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            try {
                this.queue.put(iBinder);
            } catch (java.lang.InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            this.queue.clear();
        }

        public android.os.IBinder getBinder() {
            if (this.retrieved) {
                io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "getBinder already called");
            }
            this.retrieved = true;
            try {
                return this.queue.poll(200L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused) {
                return null;
            }
        }
    }

    private static final class AdvertisingInterface implements android.os.IInterface {
        public static final java.lang.String ADVERTISING_ID_SERVICE_INTERFACE_TOKEN = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
        private static final int AD_TRANSACTION_CODE_ID = 1;
        private static final int AD_TRANSACTION_CODE_LIMIT_AD_TRACKING = 2;
        private static final int FLAGS_NONE = 0;
        private final android.os.IBinder binder;

        public AdvertisingInterface(android.os.IBinder iBinder) {
            this.binder = iBinder;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.binder;
        }

        public java.lang.String getId() throws android.os.RemoteException {
            java.lang.String string;
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken(ADVERTISING_ID_SERVICE_INTERFACE_TOKEN);
                    this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (java.lang.Exception unused) {
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Could not get parcel from Google Play Service to capture AdvertisingId");
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    string = null;
                }
                return string;
            } catch (java.lang.Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }

        public boolean isLimitAdTrackingEnabled() throws android.os.RemoteException {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
            boolean z = false;
            try {
                parcelObtain.writeInterfaceToken(ADVERTISING_ID_SERVICE_INTERFACE_TOKEN);
                parcelObtain.writeInt(1);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z = true;
                }
            } catch (java.lang.Exception unused) {
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
            return z;
        }
    }
}
