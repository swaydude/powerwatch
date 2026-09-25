package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class p extends com.bugfender.sdk.n {
    private android.view.View e;
    private com.bugfender.sdk.p.b f;

    private class b implements android.view.View.OnClickListener {
        private android.view.View.OnClickListener a;

        private b(android.view.View.OnClickListener onClickListener) {
            this.a = onClickListener;
        }

        public void a() {
            this.a = null;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.bugfender.sdk.p.this.a("OnClick in Button with { id: " + view.getId() + ", text: " + ((java.lang.Object) ((android.widget.Button) view).getText()) + " }");
            android.view.View.OnClickListener onClickListener = this.a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public p(com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
        super(k1Var, z, z2);
    }

    @Override // com.bugfender.sdk.n, com.bugfender.sdk.f3
    public void a() {
        this.e.setOnClickListener(null);
        this.e = null;
        com.bugfender.sdk.p.b bVar = this.f;
        if (bVar != null) {
            bVar.a();
            this.f = null;
        }
        super.a();
    }

    @Override // com.bugfender.sdk.f3
    public <T extends android.view.View> void a(T t) {
        this.e = t;
        if (t.isClickable()) {
            com.bugfender.sdk.p.b bVar = new com.bugfender.sdk.p.b(com.bugfender.sdk.c1.b(t));
            this.f = bVar;
            t.setOnClickListener(bVar);
        }
    }
}
