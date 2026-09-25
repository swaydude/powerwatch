package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGmsClient<T extends android.os.IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final java.lang.String DEFAULT_ACCOUNT = "<<default account>>";
    public static final java.lang.String KEY_PENDING_INTENT = "pendingIntent";
    private final android.content.Context mContext;
    final android.os.Handler mHandler;
    private final java.lang.Object mLock;
    private int zzbu;
    private long zzbv;
    private long zzbw;
    private int zzbx;
    private long zzby;
    private com.google.android.gms.common.internal.zzh zzbz;
    private final android.os.Looper zzca;
    private final com.google.android.gms.common.internal.GmsClientSupervisor zzcb;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zzcc;
    private final java.lang.Object zzcd;
    private com.google.android.gms.common.internal.IGmsServiceBroker zzce;
    protected com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zzcf;
    private T zzcg;
    private final java.util.ArrayList<com.google.android.gms.common.internal.BaseGmsClient.zzc<?>> zzch;
    private com.google.android.gms.common.internal.BaseGmsClient.zze zzci;
    private int zzcj;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks zzck;
    private final com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener zzcl;
    private final int zzcm;
    private final java.lang.String zzcn;
    private com.google.android.gms.common.ConnectionResult zzco;
    private boolean zzcp;
    private volatile com.google.android.gms.common.internal.zzb zzcq;
    protected java.util.concurrent.atomic.AtomicInteger zzcr;
    private static final com.google.android.gms.common.Feature[] zzbt = new com.google.android.gms.common.Feature[0];
    public static final java.lang.String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface BaseConnectionCallbacks {
        void onConnected(android.os.Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult);
    }

    protected class LegacyClientCallbackAdapter implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
        public LegacyClientCallbackAdapter() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
            if (connectionResult.isSuccess()) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = com.google.android.gms.common.internal.BaseGmsClient.this;
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
            } else if (com.google.android.gms.common.internal.BaseGmsClient.this.zzcl != null) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzcl.onConnectionFailed(connectionResult);
            }
        }
    }

    public interface SignOutCallbacks {
        void onSignOutComplete();
    }

    protected abstract T createServiceInterface(android.os.IBinder iBinder);

    protected boolean enableLocalFallback() {
        return false;
    }

    public android.accounts.Account getAccount() {
        return null;
    }

    public android.os.Bundle getConnectionHint() {
        return null;
    }

    protected java.lang.String getLocalStartServiceAction() {
        return null;
    }

    protected abstract java.lang.String getServiceDescriptor();

    protected abstract java.lang.String getStartServiceAction();

    protected java.lang.String getStartServicePackage() {
        return "com.google.android.gms";
    }

    void onSetConnectState(int i, T t) {
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    protected BaseGmsClient(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this(context, looper, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(context), com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance(), i, (com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(baseConnectionCallbacks), (com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) com.google.android.gms.common.internal.Preconditions.checkNotNull(baseOnConnectionFailedListener), str);
    }

    final class zzb extends com.google.android.gms.internal.common.zze {
        public zzb(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            com.google.android.gms.common.ConnectionResult connectionResult;
            com.google.android.gms.common.ConnectionResult connectionResult2;
            if (com.google.android.gms.common.internal.BaseGmsClient.this.zzcr.get() != message.arg1) {
                if (zzb(message)) {
                    zza(message);
                    return;
                }
                return;
            }
            if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !com.google.android.gms.common.internal.BaseGmsClient.this.enableLocalFallback()) || message.what == 5)) && !com.google.android.gms.common.internal.BaseGmsClient.this.isConnecting()) {
                zza(message);
                return;
            }
            if (message.what != 4) {
                if (message.what != 5) {
                    if (message.what == 3) {
                        com.google.android.gms.common.ConnectionResult connectionResult3 = new com.google.android.gms.common.ConnectionResult(message.arg2, message.obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) message.obj : null);
                        com.google.android.gms.common.internal.BaseGmsClient.this.zzcf.onReportServiceBinding(connectionResult3);
                        com.google.android.gms.common.internal.BaseGmsClient.this.onConnectionFailed(connectionResult3);
                        return;
                    }
                    if (message.what != 6) {
                        if (message.what == 2 && !com.google.android.gms.common.internal.BaseGmsClient.this.isConnected()) {
                            zza(message);
                            return;
                        }
                        if (zzb(message)) {
                            ((com.google.android.gms.common.internal.BaseGmsClient.zzc) message.obj).zzo();
                            return;
                        }
                        int i = message.what;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(45);
                        sb.append("Don't know how to handle message: ");
                        sb.append(i);
                        android.util.Log.wtf("GmsClient", sb.toString(), new java.lang.Exception());
                        return;
                    }
                    com.google.android.gms.common.internal.BaseGmsClient.this.zza(5, (android.os.IInterface) null);
                    if (com.google.android.gms.common.internal.BaseGmsClient.this.zzck != null) {
                        com.google.android.gms.common.internal.BaseGmsClient.this.zzck.onConnectionSuspended(message.arg2);
                    }
                    com.google.android.gms.common.internal.BaseGmsClient.this.onConnectionSuspended(message.arg2);
                    com.google.android.gms.common.internal.BaseGmsClient.this.zza(5, 1, (android.os.IInterface) null);
                    return;
                }
                if (com.google.android.gms.common.internal.BaseGmsClient.this.zzco == null) {
                    connectionResult = new com.google.android.gms.common.ConnectionResult(8);
                } else {
                    connectionResult = com.google.android.gms.common.internal.BaseGmsClient.this.zzco;
                }
                com.google.android.gms.common.internal.BaseGmsClient.this.zzcf.onReportServiceBinding(connectionResult);
                com.google.android.gms.common.internal.BaseGmsClient.this.onConnectionFailed(connectionResult);
                return;
            }
            com.google.android.gms.common.internal.BaseGmsClient.this.zzco = new com.google.android.gms.common.ConnectionResult(message.arg2);
            if (com.google.android.gms.common.internal.BaseGmsClient.this.zzl() && !com.google.android.gms.common.internal.BaseGmsClient.this.zzcp) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zza(3, (android.os.IInterface) null);
                return;
            }
            if (com.google.android.gms.common.internal.BaseGmsClient.this.zzco == null) {
                connectionResult2 = new com.google.android.gms.common.ConnectionResult(8);
            } else {
                connectionResult2 = com.google.android.gms.common.internal.BaseGmsClient.this.zzco;
            }
            com.google.android.gms.common.internal.BaseGmsClient.this.zzcf.onReportServiceBinding(connectionResult2);
            com.google.android.gms.common.internal.BaseGmsClient.this.onConnectionFailed(connectionResult2);
        }

        private static void zza(android.os.Message message) {
            com.google.android.gms.common.internal.BaseGmsClient.zzc zzcVar = (com.google.android.gms.common.internal.BaseGmsClient.zzc) message.obj;
            zzcVar.zzn();
            zzcVar.unregister();
        }

        private static boolean zzb(android.os.Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }
    }

    protected final class zzg extends com.google.android.gms.common.internal.BaseGmsClient.zza {
        public zzg(int i, android.os.Bundle bundle) {
            super(i, null);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final void zza(com.google.android.gms.common.ConnectionResult connectionResult) {
            if (!com.google.android.gms.common.internal.BaseGmsClient.this.enableLocalFallback() || !com.google.android.gms.common.internal.BaseGmsClient.this.zzl()) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzcf.onReportServiceBinding(connectionResult);
                com.google.android.gms.common.internal.BaseGmsClient.this.onConnectionFailed(connectionResult);
            } else {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzb(16);
            }
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final boolean zzm() {
            com.google.android.gms.common.internal.BaseGmsClient.this.zzcf.onReportServiceBinding(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
            return true;
        }
    }

    protected abstract class zzc<TListener> {
        private TListener zzcu;
        private boolean zzcv = false;

        public zzc(TListener tlistener) {
            this.zzcu = tlistener;
        }

        protected abstract void zza(TListener tlistener);

        protected abstract void zzn();

        public final void zzo() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.zzcu;
                if (this.zzcv) {
                    java.lang.String strValueOf = java.lang.String.valueOf(this);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(strValueOf);
                    sb.append(" being reused. This is not safe.");
                    android.util.Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    zza(tlistener);
                } catch (java.lang.RuntimeException e) {
                    zzn();
                    throw e;
                }
            } else {
                zzn();
            }
            synchronized (this) {
                this.zzcv = true;
            }
            unregister();
        }

        public final void unregister() {
            removeListener();
            synchronized (com.google.android.gms.common.internal.BaseGmsClient.this.zzch) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzch.remove(this);
            }
        }

        public final void removeListener() {
            synchronized (this) {
                this.zzcu = null;
            }
        }
    }

    public static final class zzd extends com.google.android.gms.common.internal.IGmsCallbacks.zza {
        private com.google.android.gms.common.internal.BaseGmsClient zzcw;
        private final int zzcx;

        public zzd(com.google.android.gms.common.internal.BaseGmsClient baseGmsClient, int i) {
            this.zzcw = baseGmsClient;
            this.zzcx = i;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void zza(int i, android.os.Bundle bundle) {
            android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void onPostInitComplete(int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzcw, "onPostInitComplete can be called only once per call to getRemoteService");
            this.zzcw.onPostInitHandler(i, iBinder, bundle, this.zzcx);
            this.zzcw = null;
        }

        @Override // com.google.android.gms.common.internal.IGmsCallbacks
        public final void zza(int i, android.os.IBinder iBinder, com.google.android.gms.common.internal.zzb zzbVar) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzcw, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbVar);
            this.zzcw.zza(zzbVar);
            onPostInitComplete(i, iBinder, zzbVar.zzda);
        }
    }

    public final class zze implements android.content.ServiceConnection {
        private final int zzcx;

        public zze(int i) {
            this.zzcx = i;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.google.android.gms.common.internal.IGmsServiceBroker zzaVar;
            if (iBinder == null) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzb(16);
                return;
            }
            synchronized (com.google.android.gms.common.internal.BaseGmsClient.this.zzcd) {
                com.google.android.gms.common.internal.BaseGmsClient baseGmsClient = com.google.android.gms.common.internal.BaseGmsClient.this;
                if (iBinder == null) {
                    zzaVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.IGmsServiceBroker)) {
                        zzaVar = (com.google.android.gms.common.internal.IGmsServiceBroker) iInterfaceQueryLocalInterface;
                    } else {
                        zzaVar = new com.google.android.gms.common.internal.IGmsServiceBroker.Stub.zza(iBinder);
                    }
                }
                baseGmsClient.zzce = zzaVar;
            }
            com.google.android.gms.common.internal.BaseGmsClient.this.zza(0, (android.os.Bundle) null, this.zzcx);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            synchronized (com.google.android.gms.common.internal.BaseGmsClient.this.zzcd) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzce = null;
            }
            com.google.android.gms.common.internal.BaseGmsClient.this.mHandler.sendMessage(com.google.android.gms.common.internal.BaseGmsClient.this.mHandler.obtainMessage(6, this.zzcx, 1));
        }
    }

    protected final class zzf extends com.google.android.gms.common.internal.BaseGmsClient.zza {
        private final android.os.IBinder zzcy;

        public zzf(int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
            super(i, bundle);
            this.zzcy = iBinder;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final void zza(com.google.android.gms.common.ConnectionResult connectionResult) {
            if (com.google.android.gms.common.internal.BaseGmsClient.this.zzcl != null) {
                com.google.android.gms.common.internal.BaseGmsClient.this.zzcl.onConnectionFailed(connectionResult);
            }
            com.google.android.gms.common.internal.BaseGmsClient.this.onConnectionFailed(connectionResult);
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zza
        protected final boolean zzm() {
            try {
                java.lang.String interfaceDescriptor = this.zzcy.getInterfaceDescriptor();
                if (!com.google.android.gms.common.internal.BaseGmsClient.this.getServiceDescriptor().equals(interfaceDescriptor)) {
                    java.lang.String serviceDescriptor = com.google.android.gms.common.internal.BaseGmsClient.this.getServiceDescriptor();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(serviceDescriptor).length() + 34 + java.lang.String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(serviceDescriptor);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    android.util.Log.e("GmsClient", sb.toString());
                    return false;
                }
                android.os.IInterface iInterfaceCreateServiceInterface = com.google.android.gms.common.internal.BaseGmsClient.this.createServiceInterface(this.zzcy);
                if (iInterfaceCreateServiceInterface == null || !(com.google.android.gms.common.internal.BaseGmsClient.this.zza(2, 4, iInterfaceCreateServiceInterface) || com.google.android.gms.common.internal.BaseGmsClient.this.zza(3, 4, iInterfaceCreateServiceInterface))) {
                    return false;
                }
                com.google.android.gms.common.internal.BaseGmsClient.this.zzco = null;
                android.os.Bundle connectionHint = com.google.android.gms.common.internal.BaseGmsClient.this.getConnectionHint();
                if (com.google.android.gms.common.internal.BaseGmsClient.this.zzck == null) {
                    return true;
                }
                com.google.android.gms.common.internal.BaseGmsClient.this.zzck.onConnected(connectionHint);
                return true;
            } catch (android.os.RemoteException unused) {
                android.util.Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    private abstract class zza extends com.google.android.gms.common.internal.BaseGmsClient.zzc<java.lang.Boolean> {
        private final int statusCode;
        private final android.os.Bundle zzcs;

        protected zza(int i, android.os.Bundle bundle) {
            super(true);
            this.statusCode = i;
            this.zzcs = bundle;
        }

        protected abstract void zza(com.google.android.gms.common.ConnectionResult connectionResult);

        protected abstract boolean zzm();

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zzc
        protected final void zzn() {
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.zzc
        protected final /* synthetic */ void zza(java.lang.Boolean bool) {
            if (bool != null) {
                int i = this.statusCode;
                if (i == 0) {
                    if (zzm()) {
                        return;
                    }
                    com.google.android.gms.common.internal.BaseGmsClient.this.zza(1, (android.os.IInterface) null);
                    zza(new com.google.android.gms.common.ConnectionResult(8, null));
                    return;
                }
                if (i != 10) {
                    com.google.android.gms.common.internal.BaseGmsClient.this.zza(1, (android.os.IInterface) null);
                    android.os.Bundle bundle = this.zzcs;
                    zza(new com.google.android.gms.common.ConnectionResult(this.statusCode, bundle != null ? (android.app.PendingIntent) bundle.getParcelable(com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT) : null));
                    return;
                }
                com.google.android.gms.common.internal.BaseGmsClient.this.zza(1, (android.os.IInterface) null);
                throw new java.lang.IllegalStateException(java.lang.String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", getClass().getSimpleName(), com.google.android.gms.common.internal.BaseGmsClient.this.getStartServiceAction(), com.google.android.gms.common.internal.BaseGmsClient.this.getServiceDescriptor()));
            }
            com.google.android.gms.common.internal.BaseGmsClient.this.zza(1, (android.os.IInterface) null);
        }
    }

    protected BaseGmsClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener, java.lang.String str) {
        this.mLock = new java.lang.Object();
        this.zzcd = new java.lang.Object();
        this.zzch = new java.util.ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mContext = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.zzca = (android.os.Looper) com.google.android.gms.common.internal.Preconditions.checkNotNull(looper, "Looper must not be null");
        this.zzcb = (com.google.android.gms.common.internal.GmsClientSupervisor) com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzcc = (com.google.android.gms.common.GoogleApiAvailabilityLight) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.mHandler = new com.google.android.gms.common.internal.BaseGmsClient.zzb(looper);
        this.zzcm = i;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = str;
    }

    protected BaseGmsClient(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.GmsClientSupervisor gmsClientSupervisor, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        this.mLock = new java.lang.Object();
        this.zzcd = new java.lang.Object();
        this.zzch = new java.util.ArrayList<>();
        this.zzcj = 1;
        this.zzco = null;
        this.zzcp = false;
        this.zzcq = null;
        this.zzcr = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mContext = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context must not be null");
        this.mHandler = (android.os.Handler) com.google.android.gms.common.internal.Preconditions.checkNotNull(handler, "Handler must not be null");
        this.zzca = handler.getLooper();
        this.zzcb = (com.google.android.gms.common.internal.GmsClientSupervisor) com.google.android.gms.common.internal.Preconditions.checkNotNull(gmsClientSupervisor, "Supervisor must not be null");
        this.zzcc = (com.google.android.gms.common.GoogleApiAvailabilityLight) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzcm = i;
        this.zzck = baseConnectionCallbacks;
        this.zzcl = baseOnConnectionFailedListener;
        this.zzcn = null;
    }

    private final java.lang.String zzj() {
        java.lang.String str = this.zzcn;
        return str == null ? this.mContext.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(com.google.android.gms.common.internal.zzb zzbVar) {
        this.zzcq = zzbVar;
    }

    public final com.google.android.gms.common.Feature[] getAvailableFeatures() {
        com.google.android.gms.common.internal.zzb zzbVar = this.zzcq;
        if (zzbVar == null) {
            return null;
        }
        return zzbVar.zzdb;
    }

    protected void onConnectedLocked(T t) {
        this.zzbw = java.lang.System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i) {
        this.zzbu = i;
        this.zzbv = java.lang.System.currentTimeMillis();
    }

    protected void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zzbx = connectionResult.getErrorCode();
        this.zzby = java.lang.System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i, T t) {
        com.google.android.gms.common.internal.zzh zzhVar;
        com.google.android.gms.common.internal.zzh zzhVar2;
        com.google.android.gms.common.internal.Preconditions.checkArgument((i == 4) == (t != null));
        synchronized (this.mLock) {
            this.zzcj = i;
            this.zzcg = t;
            onSetConnectState(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (this.zzci != null && (zzhVar2 = this.zzbz) != null) {
                        java.lang.String strZzt = zzhVar2.zzt();
                        java.lang.String packageName = this.zzbz.getPackageName();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzt).length() + 70 + java.lang.String.valueOf(packageName).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strZzt);
                        sb.append(" on ");
                        sb.append(packageName);
                        android.util.Log.e("GmsClient", sb.toString());
                        this.zzcb.zza(this.zzbz.zzt(), this.zzbz.getPackageName(), this.zzbz.zzq(), this.zzci, zzj());
                        this.zzcr.incrementAndGet();
                    }
                    this.zzci = new com.google.android.gms.common.internal.BaseGmsClient.zze(this.zzcr.get());
                    if (this.zzcj == 3 && getLocalStartServiceAction() != null) {
                        zzhVar = new com.google.android.gms.common.internal.zzh(getContext().getPackageName(), getLocalStartServiceAction(), true, 129);
                    } else {
                        zzhVar = new com.google.android.gms.common.internal.zzh(getStartServicePackage(), getStartServiceAction(), false, 129);
                    }
                    this.zzbz = zzhVar;
                    if (!this.zzcb.zza(new com.google.android.gms.common.internal.GmsClientSupervisor.zza(zzhVar.zzt(), this.zzbz.getPackageName(), this.zzbz.zzq()), this.zzci, zzj())) {
                        java.lang.String strZzt2 = this.zzbz.zzt();
                        java.lang.String packageName2 = this.zzbz.getPackageName();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strZzt2).length() + 34 + java.lang.String.valueOf(packageName2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strZzt2);
                        sb2.append(" on ");
                        sb2.append(packageName2);
                        android.util.Log.e("GmsClient", sb2.toString());
                        zza(16, (android.os.Bundle) null, this.zzcr.get());
                    }
                } else if (i == 4) {
                    onConnectedLocked(t);
                }
            } else if (this.zzci != null) {
                this.zzcb.zza(this.zzbz.zzt(), this.zzbz.getPackageName(), this.zzbz.zzq(), this.zzci, zzj());
                this.zzci = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(int i, int i2, T t) {
        synchronized (this.mLock) {
            if (this.zzcj != i) {
                return false;
            }
            zza(i2, t);
            return true;
        }
    }

    public void checkAvailabilityAndConnect() {
        int iIsGooglePlayServicesAvailable = this.zzcc.isGooglePlayServicesAvailable(this.mContext, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable != 0) {
            zza(1, (android.os.IInterface) null);
            triggerNotAvailable(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter(), iIsGooglePlayServicesAvailable, null);
        } else {
            connect(new com.google.android.gms.common.internal.BaseGmsClient.LegacyClientCallbackAdapter());
        }
    }

    public void connect(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        this.zzcf = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        zza(2, (android.os.IInterface) null);
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.mLock) {
            int i = this.zzcj;
            z = i == 2 || i == 3;
        }
        return z;
    }

    private final boolean zzk() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcj == 3;
        }
        return z;
    }

    public void disconnect() {
        this.zzcr.incrementAndGet();
        synchronized (this.zzch) {
            int size = this.zzch.size();
            for (int i = 0; i < size; i++) {
                this.zzch.get(i).removeListener();
            }
            this.zzch.clear();
        }
        synchronized (this.zzcd) {
            this.zzce = null;
        }
        zza(1, (android.os.IInterface) null);
    }

    public void triggerConnectionSuspended(int i) {
        android.os.Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(6, this.zzcr.get(), i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(int i) {
        int i2;
        if (zzk()) {
            i2 = 5;
            this.zzcp = true;
        } else {
            i2 = 4;
        }
        android.os.Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(i2, this.zzcr.get(), 16));
    }

    protected void triggerNotAvailable(com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks, int i, android.app.PendingIntent pendingIntent) {
        this.zzcf = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        android.os.Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(3, this.zzcr.get(), i, pendingIntent));
    }

    public final android.content.Context getContext() {
        return this.mContext;
    }

    public final android.os.Looper getLooper() {
        return this.zzca;
    }

    public com.google.android.gms.common.Feature[] getApiFeatures() {
        return zzbt;
    }

    protected android.os.Bundle getGetServiceRequestExtraArgs() {
        return new android.os.Bundle();
    }

    protected void onPostInitHandler(int i, android.os.IBinder iBinder, android.os.Bundle bundle, int i2) {
        android.os.Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new com.google.android.gms.common.internal.BaseGmsClient.zzf(i, iBinder, bundle)));
    }

    protected final void zza(int i, android.os.Bundle bundle, int i2) {
        android.os.Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new com.google.android.gms.common.internal.BaseGmsClient.zzg(i, null)));
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T getService() throws android.os.DeadObjectException {
        T t;
        synchronized (this.mLock) {
            if (this.zzcj == 5) {
                throw new android.os.DeadObjectException();
            }
            checkConnected();
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzcg != null, "Client is connected but service is null");
            t = this.zzcg;
        }
        return t;
    }

    public void getRemoteService(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        android.os.Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        com.google.android.gms.common.internal.GetServiceRequest getServiceRequest = new com.google.android.gms.common.internal.GetServiceRequest(this.zzcm);
        getServiceRequest.zzy = this.mContext.getPackageName();
        getServiceRequest.zzdk = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzdj = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[set.size()]);
        }
        if (requiresSignIn()) {
            getServiceRequest.zzdl = getAccount() != null ? getAccount() : new android.accounts.Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.zzdi = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.zzdl = getAccount();
        }
        getServiceRequest.zzdm = zzbt;
        getServiceRequest.zzdn = getApiFeatures();
        try {
            synchronized (this.zzcd) {
                com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzce;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.getService(new com.google.android.gms.common.internal.BaseGmsClient.zzd(this, this.zzcr.get()), getServiceRequest);
                } else {
                    android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (android.os.DeadObjectException e) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(1);
        } catch (android.os.RemoteException e2) {
            e = e2;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzcr.get());
        } catch (java.lang.SecurityException e3) {
            throw e3;
        } catch (java.lang.RuntimeException e4) {
            e = e4;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzcr.get());
        }
    }

    public void onUserSignOut(com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.onSignOutComplete();
    }

    public android.content.Intent getSignInIntent() {
        throw new java.lang.UnsupportedOperationException("Not a sign in API");
    }

    protected java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return java.util.Collections.EMPTY_SET;
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int i;
        T t;
        com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.mLock) {
            i = this.zzcj;
            t = this.zzcg;
        }
        synchronized (this.zzcd) {
            iGmsServiceBroker = this.zzce;
        }
        printWriter.append((java.lang.CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i == 5) {
            printWriter.print("DISCONNECTING");
        } else {
            printWriter.print("UNKNOWN");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((java.lang.CharSequence) getServiceDescriptor()).append("@").append((java.lang.CharSequence) java.lang.Integer.toHexString(java.lang.System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(java.lang.Integer.toHexString(java.lang.System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.US);
        if (this.zzbw > 0) {
            java.io.PrintWriter printWriterAppend = printWriter.append((java.lang.CharSequence) str).append("lastConnectedTime=");
            long j = this.zzbw;
            java.lang.String str2 = simpleDateFormat.format(new java.util.Date(this.zzbw));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.zzbv > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzbu;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else {
                printWriter.append((java.lang.CharSequence) java.lang.String.valueOf(i2));
            }
            java.io.PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzbv;
            java.lang.String str3 = simpleDateFormat.format(new java.util.Date(this.zzbv));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzby > 0) {
            printWriter.append((java.lang.CharSequence) str).append("lastFailedStatus=").append((java.lang.CharSequence) com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(this.zzbx));
            java.io.PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzby;
            java.lang.String str4 = simpleDateFormat.format(new java.util.Date(this.zzby));
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str4).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public android.os.IBinder getServiceBrokerBinder() {
        synchronized (this.zzcd) {
            com.google.android.gms.common.internal.IGmsServiceBroker iGmsServiceBroker = this.zzce;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzl() {
        if (this.zzcp || android.text.TextUtils.isEmpty(getServiceDescriptor()) || android.text.TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            java.lang.Class.forName(getServiceDescriptor());
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    public java.lang.String getEndpointPackageName() {
        com.google.android.gms.common.internal.zzh zzhVar;
        if (isConnected() && (zzhVar = this.zzbz) != null) {
            return zzhVar.getPackageName();
        }
        throw new java.lang.RuntimeException("Failed to connect when checking package");
    }

    public int getMinApkVersion() {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
