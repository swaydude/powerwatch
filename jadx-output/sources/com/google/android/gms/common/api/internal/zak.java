package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zak extends com.google.android.gms.common.api.internal.LifecycleCallback implements android.content.DialogInterface.OnCancelListener {
    protected final com.google.android.gms.common.GoogleApiAvailability zace;
    protected volatile boolean zadh;
    protected final java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.zam> zadi;
    private final android.os.Handler zadj;

    protected zak(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, com.google.android.gms.common.GoogleApiAvailability.getInstance());
    }

    protected abstract void zaa(com.google.android.gms.common.ConnectionResult connectionResult, int i);

    protected abstract void zam();

    private zak(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, com.google.android.gms.common.GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zadi = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.zadj = new com.google.android.gms.internal.base.zar(android.os.Looper.getMainLooper());
        this.zace = googleApiAvailability;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        zaa(new com.google.android.gms.common.ConnectionResult(13, null), zaa(this.zadi.get()));
        zao();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zadi.set(bundle.getBoolean("resolving_error", false) ? new com.google.android.gms.common.api.internal.zam(new com.google.android.gms.common.ConnectionResult(bundle.getInt("failed_status"), (android.app.PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.google.android.gms.common.api.internal.zam zamVar = this.zadi.get();
        if (zamVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zamVar.zap());
            bundle.putInt("failed_status", zamVar.getConnectionResult().getErrorCode());
            bundle.putParcelable("failed_resolution", zamVar.getConnectionResult().getResolution());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zadh = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        com.google.android.gms.common.api.internal.zam zamVar = this.zadi.get();
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else {
                int iIsGooglePlayServicesAvailable = this.zace.isGooglePlayServicesAvailable(getActivity());
                z = iIsGooglePlayServicesAvailable == 0;
                if (zamVar == null) {
                    return;
                }
                if (zamVar.getConnectionResult().getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                    return;
                }
            }
        } else if (i2 != -1) {
            if (i2 == 0) {
                com.google.android.gms.common.api.internal.zam zamVar2 = new com.google.android.gms.common.api.internal.zam(new com.google.android.gms.common.ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.getConnectionResult().toString()), zaa(zamVar));
                this.zadi.set(zamVar2);
                zamVar = zamVar2;
            }
            z = false;
        }
        if (z) {
            zao();
        } else if (zamVar != null) {
            zaa(zamVar.getConnectionResult(), zamVar.zap());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zadh = false;
    }

    protected final void zao() {
        this.zadi.set(null);
        zam();
    }

    public final void zab(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        com.google.android.gms.common.api.internal.zam zamVar = new com.google.android.gms.common.api.internal.zam(connectionResult, i);
        if (this.zadi.compareAndSet(null, zamVar)) {
            this.zadj.post(new com.google.android.gms.common.api.internal.zal(this, zamVar));
        }
    }

    private static int zaa(com.google.android.gms.common.api.internal.zam zamVar) {
        if (zamVar == null) {
            return -1;
        }
        return zamVar.zap();
    }
}
