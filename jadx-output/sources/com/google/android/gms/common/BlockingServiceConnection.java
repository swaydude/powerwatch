package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public class BlockingServiceConnection implements android.content.ServiceConnection {
    private boolean zze = false;
    private final java.util.concurrent.BlockingQueue<android.os.IBinder> zzf = new java.util.concurrent.LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.zzf.add(iBinder);
    }

    public android.os.IBinder getServiceWithTimeout(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.zze) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zze = true;
        android.os.IBinder iBinderPoll = this.zzf.poll(j, timeUnit);
        if (iBinderPoll != null) {
            return iBinderPoll;
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
    }

    public android.os.IBinder getService() throws java.lang.InterruptedException {
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if (this.zze) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.zze = true;
        return this.zzf.take();
    }
}
