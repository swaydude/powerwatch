package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class GmsClientEventManager implements android.os.Handler.Callback {
    private final android.os.Handler mHandler;
    private final com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState zaov;
    private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> zaow = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks> zaox = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener> zaoy = new java.util.ArrayList<>();
    private volatile boolean zaoz = false;
    private final java.util.concurrent.atomic.AtomicInteger zapa = new java.util.concurrent.atomic.AtomicInteger(0);
    private boolean zapb = false;
    private final java.lang.Object mLock = new java.lang.Object();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface GmsClientEventState {
        android.os.Bundle getConnectionHint();

        boolean isConnected();
    }

    public GmsClientEventManager(android.os.Looper looper, com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState gmsClientEventState) {
        this.zaov = gmsClientEventState;
        this.mHandler = new com.google.android.gms.internal.base.zar(looper, this);
    }

    public final void disableCallbacks() {
        this.zaoz = false;
        this.zapa.incrementAndGet();
    }

    public final void enableCallbacks() {
        this.zaoz = true;
    }

    protected final void onConnectionSuccess() {
        synchronized (this.mLock) {
            onConnectionSuccess(this.zaov.getConnectionHint());
        }
    }

    public final void onConnectionSuccess(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.mHandler, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.mLock) {
            boolean z = true;
            com.google.android.gms.common.internal.Preconditions.checkState(!this.zapb);
            this.mHandler.removeMessages(1);
            this.zapb = true;
            if (this.zaox.size() != 0) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z);
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zaow);
            int i = this.zapa.get();
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object obj = arrayList2.get(i2);
                i2++;
                com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.zaoz || !this.zaov.isConnected() || this.zapa.get() != i) {
                    break;
                } else if (!this.zaox.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.zaox.clear();
            this.zapb = false;
        }
    }

    public final void onUnintentionalDisconnection(int i) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.mHandler, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        synchronized (this.mLock) {
            this.zapb = true;
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zaow);
            int i2 = this.zapa.get();
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                java.lang.Object obj = arrayList2.get(i3);
                i3++;
                com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.zaoz || this.zapa.get() != i2) {
                    break;
                } else if (this.zaow.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.zaox.clear();
            this.zapb = false;
        }
    }

    public final void onConnectionFailure(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.mHandler, "onConnectionFailure must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        synchronized (this.mLock) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.zaoy);
            int i = this.zapa.get();
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                java.lang.Object obj = arrayList2.get(i2);
                i2++;
                com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) obj;
                if (this.zaoz && this.zapa.get() == i) {
                    if (this.zaoy.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                return;
            }
        }
    }

    public final void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (this.zaow.contains(connectionCallbacks)) {
                java.lang.String strValueOf = java.lang.String.valueOf(connectionCallbacks);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                android.util.Log.w("GmsClientEvents", sb.toString());
            } else {
                this.zaow.add(connectionCallbacks);
            }
        }
        if (this.zaov.isConnected()) {
            android.os.Handler handler = this.mHandler;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean zContains;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            zContains = this.zaow.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.mLock) {
            if (!this.zaow.remove(connectionCallbacks)) {
                java.lang.String strValueOf = java.lang.String.valueOf(connectionCallbacks);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(strValueOf);
                sb.append(" not found");
                android.util.Log.w("GmsClientEvents", sb.toString());
            } else if (this.zapb) {
                this.zaox.add(connectionCallbacks);
            }
        }
    }

    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (this.zaoy.contains(onConnectionFailedListener)) {
                java.lang.String strValueOf = java.lang.String.valueOf(onConnectionFailedListener);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(strValueOf);
                sb.append(" is already registered");
                android.util.Log.w("GmsClientEvents", sb.toString());
            } else {
                this.zaoy.add(onConnectionFailedListener);
            }
        }
    }

    public final boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            zContains = this.zaoy.contains(onConnectionFailedListener);
        }
        return zContains;
    }

    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.mLock) {
            if (!this.zaoy.remove(onConnectionFailedListener)) {
                java.lang.String strValueOf = java.lang.String.valueOf(onConnectionFailedListener);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(strValueOf);
                sb.append(" not found");
                android.util.Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.mLock) {
                if (this.zaoz && this.zaov.isConnected() && this.zaow.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(this.zaov.getConnectionHint());
                }
            }
            return true;
        }
        int i = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        android.util.Log.wtf("GmsClientEvents", sb.toString(), new java.lang.Exception());
        return false;
    }

    public final boolean areCallbacksEnabled() {
        return this.zaoz;
    }
}
