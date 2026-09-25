package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
class e implements com.google.android.play.core.splitinstall.d {
    final /* synthetic */ com.google.android.play.core.splitinstall.SplitInstallSessionState a;
    final /* synthetic */ android.content.Intent b;
    final /* synthetic */ android.content.Context c;
    final /* synthetic */ com.google.android.play.core.splitinstall.n d;

    e(com.google.android.play.core.splitinstall.n nVar, com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.content.Intent intent, android.content.Context context) {
        this.d = nVar;
        this.a = splitInstallSessionState;
        this.b = intent;
        this.c = context;
    }

    @Override // com.google.android.play.core.splitinstall.d
    public void a() {
        this.d.a(this.a, 5, 0);
    }

    @Override // com.google.android.play.core.splitinstall.d
    public void a(int i) {
        this.d.a(this.a, 6, i);
    }

    @Override // com.google.android.play.core.splitinstall.d
    public void b() {
        if (this.b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.d.a.d("Splits copied and verified more than once.", new java.lang.Object[0]);
        } else {
            this.b.putExtra("triggered_from_app_after_verification", true);
            this.c.sendBroadcast(this.b);
        }
    }
}
