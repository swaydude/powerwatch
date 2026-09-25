package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class s2 extends com.bugfender.sdk.n {
    private android.view.View e;

    private class b implements android.widget.AdapterView.OnItemSelectedListener {
        private final android.widget.AdapterView.OnItemSelectedListener a;

        private b(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.a = onItemSelectedListener;
        }

        private int a(android.view.View view) {
            if (view != null) {
                return view.getId();
            }
            return -1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
            com.bugfender.sdk.s2.this.a("OnItemSelected in Spinner with { id: " + a(view) + ", position: " + i + " }");
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.a;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelected(adapterView, view, i, j);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
            android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.a;
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onNothingSelected(adapterView);
            }
        }
    }

    public s2(com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
        super(k1Var, z, z2);
    }

    @Override // com.bugfender.sdk.n, com.bugfender.sdk.f3
    public void a() {
        ((android.widget.Spinner) this.e).setOnItemSelectedListener(null);
        this.e = null;
        super.a();
    }

    @Override // com.bugfender.sdk.f3
    public <T extends android.view.View> void a(T t) {
        this.e = t;
        ((android.widget.Spinner) t).setOnItemSelectedListener(new com.bugfender.sdk.s2.b(com.bugfender.sdk.c1.c(t)));
    }
}
