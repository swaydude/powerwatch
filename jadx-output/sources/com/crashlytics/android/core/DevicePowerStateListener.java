package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class DevicePowerStateListener {
    private static final android.content.IntentFilter FILTER_BATTERY_CHANGED = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static final android.content.IntentFilter FILTER_POWER_CONNECTED = new android.content.IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
    private static final android.content.IntentFilter FILTER_POWER_DISCONNECTED = new android.content.IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
    private final android.content.Context context;
    private boolean isPowerConnected;
    private final android.content.BroadcastReceiver powerConnectedReceiver = new android.content.BroadcastReceiver() { // from class: com.crashlytics.android.core.DevicePowerStateListener.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.crashlytics.android.core.DevicePowerStateListener.this.isPowerConnected = true;
        }
    };
    private final android.content.BroadcastReceiver powerDisconnectedReceiver = new android.content.BroadcastReceiver() { // from class: com.crashlytics.android.core.DevicePowerStateListener.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.crashlytics.android.core.DevicePowerStateListener.this.isPowerConnected = false;
        }
    };
    private final java.util.concurrent.atomic.AtomicBoolean receiversRegistered = new java.util.concurrent.atomic.AtomicBoolean(false);

    public DevicePowerStateListener(android.content.Context context) {
        this.context = context;
    }

    public void initialize() {
        boolean z = true;
        if (this.receiversRegistered.getAndSet(true)) {
            return;
        }
        android.content.Intent intentRegisterReceiver = this.context.registerReceiver(null, FILTER_BATTERY_CHANGED);
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        if (intExtra != 2 && intExtra != 5) {
            z = false;
        }
        this.isPowerConnected = z;
        this.context.registerReceiver(this.powerConnectedReceiver, FILTER_POWER_CONNECTED);
        this.context.registerReceiver(this.powerDisconnectedReceiver, FILTER_POWER_DISCONNECTED);
    }

    public boolean isPowerConnected() {
        return this.isPowerConnected;
    }

    public void dispose() {
        if (this.receiversRegistered.getAndSet(false)) {
            this.context.unregisterReceiver(this.powerConnectedReceiver);
            this.context.unregisterReceiver(this.powerDisconnectedReceiver);
        }
    }
}
