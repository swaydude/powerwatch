package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class x1 {
    private final java.util.concurrent.Executor a = java.util.concurrent.Executors.newSingleThreadExecutor();

    public interface a {
        void a(java.util.List<android.view.View> list);
    }

    private class b implements java.lang.Runnable {
        private android.view.View a;
        private com.bugfender.sdk.x1.a b;

        public b(android.view.View view, com.bugfender.sdk.x1.a aVar) {
            this.a = view;
            this.b = aVar;
        }

        private java.util.List<android.view.View> a(android.view.View view) {
            if (!(view instanceof android.view.ViewGroup) || (view instanceof android.widget.AdapterView)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                return arrayList;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList2.addAll(a(viewGroup.getChildAt(i)));
            }
            return arrayList2;
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.List<android.view.View> listA = a(this.a);
            com.bugfender.sdk.x1.a aVar = this.b;
            if (aVar != null) {
                aVar.a(listA);
            }
            this.b = null;
        }
    }

    public void a(android.view.View view, com.bugfender.sdk.x1.a aVar) {
        this.a.execute(new com.bugfender.sdk.x1.b(view, aVar));
    }
}
