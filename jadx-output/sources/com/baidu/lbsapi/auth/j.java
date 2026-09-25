package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class j implements java.lang.Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ java.util.Hashtable e;
    final /* synthetic */ com.baidu.lbsapi.auth.LBSAuthManager f;

    j(com.baidu.lbsapi.auth.LBSAuthManager lBSAuthManager, int i, boolean z, java.lang.String str, java.lang.String str2, java.util.Hashtable hashtable) {
        this.f = lBSAuthManager;
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = hashtable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.baidu.lbsapi.auth.a.a("status = " + this.a + "; forced = " + this.b + "checkAK = " + this.f.b(this.c));
        int i = this.a;
        if (i != 601 && !this.b && i != -1 && !this.f.b(this.c)) {
            if (602 == this.a) {
                com.baidu.lbsapi.auth.a.a("authenticate wait ");
                if (com.baidu.lbsapi.auth.LBSAuthManager.d != null) {
                    com.baidu.lbsapi.auth.LBSAuthManager.d.b();
                }
            } else {
                com.baidu.lbsapi.auth.a.a("authenticate else");
            }
            this.f.a((java.lang.String) null, this.c);
            return;
        }
        com.baidu.lbsapi.auth.a.a("authenticate sendAuthRequest");
        java.lang.String[] strArrB = com.baidu.lbsapi.auth.b.b(com.baidu.lbsapi.auth.LBSAuthManager.a);
        com.baidu.lbsapi.auth.a.a("authStrings.length:" + strArrB.length);
        if (strArrB == null || strArrB.length <= 1) {
            this.f.a(this.b, this.d, this.e, this.c);
            return;
        }
        com.baidu.lbsapi.auth.a.a("more sha1 auth");
        this.f.a(this.b, this.d, (java.util.Hashtable<java.lang.String, java.lang.String>) this.e, strArrB, this.c);
    }
}
