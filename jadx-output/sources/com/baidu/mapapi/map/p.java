package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class p<T extends com.baidu.mapapi.map.p.a> {
    private final com.baidu.mapapi.map.h a;
    private final int b;
    private java.util.List<T> c;
    private java.util.List<com.baidu.mapapi.map.p<T>> d;

    static abstract class a {
        a() {
        }

        abstract android.graphics.Point a();
    }

    private p(double d, double d2, double d3, double d4, int i) {
        this(new com.baidu.mapapi.map.h(d, d2, d3, d4), i);
    }

    public p(com.baidu.mapapi.map.h hVar) {
        this(hVar, 0);
    }

    private p(com.baidu.mapapi.map.h hVar, int i) {
        this.d = null;
        this.a = hVar;
        this.b = i;
    }

    private void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        this.d = arrayList;
        arrayList.add(new com.baidu.mapapi.map.p(this.a.a, this.a.e, this.a.b, this.a.f, this.b + 1));
        this.d.add(new com.baidu.mapapi.map.p<>(this.a.e, this.a.c, this.a.b, this.a.f, this.b + 1));
        this.d.add(new com.baidu.mapapi.map.p<>(this.a.a, this.a.e, this.a.f, this.a.d, this.b + 1));
        this.d.add(new com.baidu.mapapi.map.p<>(this.a.e, this.a.c, this.a.f, this.a.d, this.b + 1));
        java.util.List<T> list = this.c;
        this.c = null;
        for (T t : list) {
            a(t.a().x, t.a().y, t);
        }
    }

    private void a(double d, double d2, T t) {
        java.util.List<com.baidu.mapapi.map.p<T>> list;
        int i;
        if (this.d == null) {
            if (this.c == null) {
                this.c = new java.util.ArrayList();
            }
            this.c.add(t);
            if (this.c.size() <= 40 || this.b >= 40) {
                return;
            }
            a();
            return;
        }
        double d3 = this.a.f;
        double d4 = this.a.e;
        if (d2 < d3) {
            list = this.d;
            i = d < d4 ? 0 : 1;
        } else {
            list = this.d;
            i = d < d4 ? 2 : 3;
        }
        list.get(i).a(d, d2, t);
    }

    private void a(com.baidu.mapapi.map.h hVar, java.util.Collection<T> collection) {
        if (this.a.a(hVar)) {
            java.util.List<com.baidu.mapapi.map.p<T>> list = this.d;
            if (list != null) {
                java.util.Iterator<com.baidu.mapapi.map.p<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().a(hVar, collection);
                }
            } else if (this.c != null) {
                if (hVar.b(this.a)) {
                    collection.addAll(this.c);
                    return;
                }
                for (T t : this.c) {
                    if (hVar.a(t.a())) {
                        collection.add(t);
                    }
                }
            }
        }
    }

    public java.util.Collection<T> a(com.baidu.mapapi.map.h hVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(hVar, arrayList);
        return arrayList;
    }

    public void a(T t) {
        android.graphics.Point pointA = t.a();
        if (this.a.a(pointA.x, pointA.y)) {
            a(pointA.x, pointA.y, t);
        }
    }
}
