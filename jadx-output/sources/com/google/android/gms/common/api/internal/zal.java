package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zal implements java.lang.Runnable {
    private final com.google.android.gms.common.api.internal.zam zadk;
    final /* synthetic */ com.google.android.gms.common.api.internal.zak zadl;

    zal(com.google.android.gms.common.api.internal.zak zakVar, com.google.android.gms.common.api.internal.zam zamVar) {
        this.zadl = zakVar;
        this.zadk = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zadl.zadh) {
            com.google.android.gms.common.ConnectionResult connectionResult = this.zadk.getConnectionResult();
            if (connectionResult.hasResolution()) {
                this.zadl.mLifecycleFragment.startActivityForResult(com.google.android.gms.common.api.GoogleApiActivity.zaa(this.zadl.getActivity(), connectionResult.getResolution(), this.zadk.zap(), false), 1);
                return;
            }
            if (this.zadl.zace.isUserResolvableError(connectionResult.getErrorCode())) {
                this.zadl.zace.zaa(this.zadl.getActivity(), this.zadl.mLifecycleFragment, connectionResult.getErrorCode(), 2, this.zadl);
            } else if (connectionResult.getErrorCode() == 18) {
                this.zadl.zace.zaa(this.zadl.getActivity().getApplicationContext(), new com.google.android.gms.common.api.internal.zan(this, com.google.android.gms.common.GoogleApiAvailability.zaa(this.zadl.getActivity(), this.zadl)));
            } else {
                this.zadl.zaa(connectionResult, this.zadk.zap());
            }
        }
    }
}
