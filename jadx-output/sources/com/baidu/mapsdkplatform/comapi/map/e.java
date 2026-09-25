package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class e implements com.baidu.mapsdkplatform.comjni.map.basemap.b {
    private static int O;
    private static int P;
    private static java.util.List<com.baidu.mapsdkplatform.comjni.map.basemap.JNIBaseMap> as;
    private com.baidu.mapsdkplatform.comapi.map.al B;
    private com.baidu.mapsdkplatform.comapi.map.ak C;
    private android.content.Context D;
    private java.util.List<com.baidu.mapsdkplatform.comapi.map.d> E;
    private java.util.HashMap<com.baidu.mapapi.map.MapLayer, com.baidu.mapsdkplatform.comapi.map.d> F;
    private com.baidu.mapsdkplatform.comapi.map.z G;
    private com.baidu.mapsdkplatform.comapi.map.g H;
    private com.baidu.mapsdkplatform.comapi.map.ag I;
    private com.baidu.mapsdkplatform.comapi.map.aj J;
    private com.baidu.mapsdkplatform.comapi.map.p K;
    private com.baidu.mapsdkplatform.comapi.map.a L;
    private com.baidu.mapsdkplatform.comapi.map.q M;
    private com.baidu.mapsdkplatform.comapi.map.ah N;
    private int Q;
    private int R;
    private int S;
    private android.view.VelocityTracker U;
    private long V;
    private long W;
    private long X;
    private long Y;
    private int Z;
    private float aa;
    private float ab;
    private boolean ac;
    private long ad;
    private long ae;
    private float ah;
    private float ai;
    private float aj;
    private float ak;
    private com.baidu.mapsdkplatform.comapi.map.f an;
    private java.lang.String ao;
    private int ap;
    private com.baidu.mapsdkplatform.comapi.map.b aq;
    private com.baidu.mapsdkplatform.comapi.map.c ar;
    com.baidu.mapsdkplatform.comjni.map.basemap.a i;
    long j;
    boolean k;
    int l;
    boolean n;
    boolean o;
    boolean p;
    private boolean s;
    private boolean t;
    private static final java.lang.String r = com.baidu.mapsdkplatform.comapi.map.l.class.getSimpleName();
    public static float d = 1096.0f;
    static long m = 0;
    public float a = 21.0f;
    public float b = 4.0f;
    public float c = 21.0f;
    private boolean u = true;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private boolean y = true;
    boolean e = true;
    boolean f = true;
    boolean g = false;
    private boolean z = true;
    private boolean A = false;
    private com.baidu.mapsdkplatform.comapi.map.l.a T = new com.baidu.mapsdkplatform.comapi.map.l.a();
    private boolean af = false;
    private boolean ag = false;
    private long al = 0;
    private long am = 0;
    private boolean at = false;
    private java.util.Queue<com.baidu.mapsdkplatform.comapi.map.e.a> au = new java.util.LinkedList();
    public com.baidu.mapapi.map.MapStatusUpdate q = null;
    private boolean av = false;
    private boolean aw = false;
    java.util.List<com.baidu.mapsdkplatform.comapi.map.n> h = new java.util.ArrayList();

    public static class a {
        public long a;
        public int b;
        public int c;
        public int d;
        public android.os.Bundle e;

        public a(long j, int i, int i2, int i3) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        public a(android.os.Bundle bundle) {
            this.e = bundle;
        }
    }

    public e(android.content.Context context, java.lang.String str, int i) {
        this.D = context;
        this.ao = str;
        this.ap = i;
    }

    private void R() {
        if (!this.w && !this.t && !this.s && !this.x) {
            this.a = this.c;
            return;
        }
        if (this.a > 20.0f) {
            this.a = 20.0f;
        }
        if (E().a > 20.0f) {
            com.baidu.mapsdkplatform.comapi.map.ad adVarE = E();
            adVarE.a = 20.0f;
            a(adVarE);
        }
    }

    private void S() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = false;
        java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
        if (list != null) {
            for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
                if (nVar != null) {
                    nVar.a(E());
                }
            }
        }
    }

    private boolean T() {
        if (this.i == null || !this.k) {
            return true;
        }
        this.ag = false;
        if (!this.e) {
            return false;
        }
        float f = this.am - this.al;
        float fAbs = (java.lang.Math.abs(this.aj - this.ah) * 1000.0f) / f;
        float fAbs2 = (java.lang.Math.abs(this.ak - this.ai) * 1000.0f) / f;
        float fSqrt = (float) java.lang.Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        if (fSqrt <= 500.0f) {
            return false;
        }
        A();
        a(34, (int) (fSqrt * 0.6f), (((int) this.ak) << 16) | ((int) this.aj));
        M();
        return true;
    }

    private android.app.Activity a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return a(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private void a(com.baidu.mapsdkplatform.comapi.map.d dVar) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        dVar.a = aVar.a(dVar.c, dVar.d, dVar.b);
        this.E.add(dVar);
    }

    private void a(java.lang.String str, java.lang.String str2, long j) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            cls.getMethod(str2, java.lang.Long.TYPE).invoke(cls.newInstance(), java.lang.Long.valueOf(j));
        } catch (java.lang.Exception unused) {
        }
    }

    private void b(android.view.MotionEvent motionEvent) {
        if (this.T.e) {
            return;
        }
        long downTime = motionEvent.getDownTime();
        this.ae = downTime;
        if (downTime - this.ad < 400) {
            downTime = (java.lang.Math.abs(motionEvent.getX() - this.aa) >= 120.0f || java.lang.Math.abs(motionEvent.getY() - this.ab) >= 120.0f) ? this.ae : 0L;
        }
        this.ad = downTime;
        this.aa = motionEvent.getX();
        this.ab = motionEvent.getY();
        a(4, 0, (((int) motionEvent.getY()) << 16) | ((int) motionEvent.getX()));
        this.ac = true;
    }

    private void b(java.lang.String str, android.os.Bundle bundle) {
        if (this.i == null) {
            return;
        }
        this.H.a(str);
        this.H.a(bundle);
        this.i.b(this.H.a);
    }

    private boolean c(android.view.MotionEvent motionEvent) {
        if (this.T.e || java.lang.System.currentTimeMillis() - m < 300) {
            return true;
        }
        if (this.p) {
            java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
            if (list != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
                    com.baidu.mapapi.model.inner.GeoPoint geoPointB = b((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (nVar != null) {
                        nVar.d(geoPointB);
                    }
                }
            }
            return true;
        }
        float fAbs = java.lang.Math.abs(motionEvent.getX() - this.aa);
        float fAbs2 = java.lang.Math.abs(motionEvent.getY() - this.ab);
        double density = com.baidu.mapapi.common.SysOSUtil.getDensity();
        double density2 = com.baidu.mapapi.common.SysOSUtil.getDensity();
        if (density > 1.5d) {
            density2 *= 1.5d;
        }
        float f = (float) density2;
        if (this.ac && fAbs / f <= 3.0f && fAbs2 / f <= 3.0f) {
            return true;
        }
        this.ac = false;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        if (this.e) {
            com.baidu.mapapi.map.BaiduMap.mapStatusReason = 1 | com.baidu.mapapi.map.BaiduMap.mapStatusReason;
            S();
            a(3, 0, (y << 16) | x);
        }
        return false;
    }

    private boolean d(android.view.MotionEvent motionEvent) {
        if (this.p) {
            java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
            if (list != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
                    com.baidu.mapapi.model.inner.GeoPoint geoPointB = b((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (nVar != null) {
                        nVar.e(geoPointB);
                    }
                }
            }
            this.p = false;
            return true;
        }
        boolean z = !this.T.e && motionEvent.getEventTime() - this.ae < 400 && java.lang.Math.abs(motionEvent.getX() - this.aa) < 10.0f && java.lang.Math.abs(motionEvent.getY() - this.ab) < 10.0f;
        M();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (z) {
            return false;
        }
        if (x < 0) {
            x = 0;
        }
        if (y < 0) {
            y = 0;
        }
        a(5, 0, (y << 16) | x);
        return true;
    }

    private boolean e(float f, float f2) {
        if (this.i == null || !this.k) {
            return true;
        }
        this.af = false;
        com.baidu.mapapi.model.inner.GeoPoint geoPointB = b((int) f, (int) f2);
        if (geoPointB != null) {
            java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
            if (list != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
                    if (nVar != null) {
                        nVar.b(geoPointB);
                    }
                }
            }
            if (this.f) {
                com.baidu.mapsdkplatform.comapi.map.ad adVarE = E();
                adVarE.a += 1.0f;
                adVarE.d = geoPointB.getLongitudeE6();
                adVarE.e = geoPointB.getLatitudeE6();
                a(adVarE, 300);
                m = java.lang.System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    private boolean e(android.os.Bundle bundle) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return false;
        }
        return aVar.d(bundle);
    }

    private boolean f(android.os.Bundle bundle) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar;
        if (bundle == null || (aVar = this.i) == null) {
            return false;
        }
        boolean zC = aVar.c(bundle);
        if (zC) {
            f(zC);
            this.i.b(this.B.a);
        }
        return zC;
    }

    private void g(android.os.Bundle bundle) {
        int i;
        int i2;
        if (bundle.get("param") == null ? (i = bundle.getInt("type")) != com.baidu.mapsdkplatform.comapi.map.j.ground.ordinal() && i < com.baidu.mapsdkplatform.comapi.map.j.arc.ordinal() : (i2 = (bundle = (android.os.Bundle) bundle.get("param")).getInt("type")) != com.baidu.mapsdkplatform.comapi.map.j.ground.ordinal() && i2 < com.baidu.mapsdkplatform.comapi.map.j.arc.ordinal()) {
            com.baidu.mapsdkplatform.comapi.map.j.popup.ordinal();
        }
        bundle.putLong("layer_addr", this.J.a);
    }

    static void m(boolean z) {
        java.util.List<com.baidu.mapsdkplatform.comjni.map.basemap.JNIBaseMap> listB = com.baidu.mapsdkplatform.comjni.map.basemap.a.b();
        as = listB;
        if (listB == null || listB.size() == 0) {
            com.baidu.mapsdkplatform.comjni.map.basemap.a.c(0L, z);
            return;
        }
        com.baidu.mapsdkplatform.comjni.map.basemap.a.c(as.get(0).a, z);
        for (com.baidu.mapsdkplatform.comjni.map.basemap.JNIBaseMap jNIBaseMap : as) {
            if (jNIBaseMap != null) {
                jNIBaseMap.ClearLayer(jNIBaseMap.a, -1L);
            }
        }
    }

    void A() {
        if (this.n || this.o) {
            return;
        }
        this.o = true;
        java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
        if (list == null) {
            return;
        }
        for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
            if (nVar != null) {
                nVar.a(E());
            }
        }
    }

    void B() {
        this.o = false;
        this.n = false;
        java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
        if (list == null) {
            return;
        }
        for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
            if (nVar != null) {
                nVar.c(E());
            }
        }
    }

    public boolean C() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar != null) {
            return aVar.a(this.I.a);
        }
        return false;
    }

    public boolean D() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar != null) {
            return aVar.a(this.ar.a);
        }
        return false;
    }

    public com.baidu.mapsdkplatform.comapi.map.ad E() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return null;
        }
        android.os.Bundle bundleH = aVar.h();
        com.baidu.mapsdkplatform.comapi.map.ad adVar = new com.baidu.mapsdkplatform.comapi.map.ad();
        adVar.a(bundleH);
        return adVar;
    }

    public com.baidu.mapapi.model.LatLngBounds F() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return null;
        }
        android.os.Bundle bundleI = aVar.i();
        com.baidu.mapapi.model.LatLngBounds.Builder builder = new com.baidu.mapapi.model.LatLngBounds.Builder();
        builder.include(com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(bundleI.getInt("minCoory"), bundleI.getInt("maxCoorx")))).include(com.baidu.mapapi.model.CoordUtil.mc2ll(new com.baidu.mapapi.model.inner.GeoPoint(bundleI.getInt("maxCoory"), bundleI.getInt("minCoorx"))));
        return builder.build();
    }

    public com.baidu.mapapi.map.MapStatusUpdate G() {
        return this.q;
    }

    public int H() {
        return this.Q;
    }

    public int I() {
        return this.R;
    }

    com.baidu.mapsdkplatform.comapi.map.ad J() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return null;
        }
        android.os.Bundle bundleJ = aVar.j();
        com.baidu.mapsdkplatform.comapi.map.ad adVar = new com.baidu.mapsdkplatform.comapi.map.ad();
        adVar.a(bundleJ);
        return adVar;
    }

    public double K() {
        return E().m;
    }

    void L() {
        java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list;
        this.n = false;
        if (this.o || (list = this.h) == null) {
            return;
        }
        for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
            if (nVar != null) {
                nVar.c(E());
            }
        }
    }

    void M() {
        this.S = 0;
        this.T.e = false;
        this.T.h = 0.0d;
    }

    public float[] N() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return null;
        }
        return aVar.u();
    }

    public float[] O() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return null;
        }
        return aVar.v();
    }

    public java.util.Queue<com.baidu.mapsdkplatform.comapi.map.e.a> P() {
        return this.au;
    }

    public void Q() {
        if (this.au.isEmpty()) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.e.a aVarPoll = this.au.poll();
        if (aVarPoll.e == null) {
            com.baidu.mapsdkplatform.comjni.map.basemap.a.a(aVarPoll.a, aVarPoll.b, aVarPoll.c, aVarPoll.d);
        } else if (this.i != null) {
            A();
            this.i.a(aVarPoll.e, true);
        }
    }

    public float a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (!this.k) {
            return 12.0f;
        }
        if (this.i == null) {
            return 0.0f;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("left", i);
        bundle.putInt("right", i3);
        bundle.putInt("bottom", i4);
        bundle.putInt("top", i2);
        bundle.putInt("hasHW", 1);
        bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_WIDTH_KEY, i5);
        bundle.putInt(io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY, i6);
        return this.i.b(bundle);
    }

    int a(int i, int i2, int i3) {
        if (!this.at) {
            return com.baidu.mapsdkplatform.comjni.map.basemap.a.a(this.j, i, i2, i3);
        }
        this.au.add(new com.baidu.mapsdkplatform.comapi.map.e.a(this.j, i, i2, i3));
        return 0;
    }

    @Override // com.baidu.mapsdkplatform.comjni.map.basemap.b
    public int a(android.os.Bundle bundle, long j, int i, android.os.Bundle bundle2) {
        if (j == this.H.a) {
            bundle.putString("jsondata", this.H.a());
            bundle.putBundle("param", this.H.b());
            return this.H.g;
        }
        if (j == this.G.a) {
            bundle.putString("jsondata", this.G.a());
            bundle.putBundle("param", this.G.b());
            return this.G.g;
        }
        if (j == this.K.a) {
            bundle.putBundle("param", this.M.a(bundle2.getInt("x"), bundle2.getInt("y"), bundle2.getInt("zoom")));
            return this.K.g;
        }
        if (j != this.B.a) {
            return 0;
        }
        bundle.putBundle("param", this.C.a(bundle2.getInt("x"), bundle2.getInt("y"), bundle2.getInt("zoom"), this.D));
        return this.B.g;
    }

    public android.graphics.Point a(com.baidu.mapapi.model.inner.GeoPoint geoPoint) {
        return this.N.a(geoPoint);
    }

    void a() {
        this.E = new java.util.ArrayList();
        this.F = new java.util.HashMap<>();
        com.baidu.mapsdkplatform.comapi.map.f fVar = new com.baidu.mapsdkplatform.comapi.map.f();
        this.an = fVar;
        a(fVar);
        com.baidu.mapsdkplatform.comapi.map.b bVar = new com.baidu.mapsdkplatform.comapi.map.b();
        this.aq = bVar;
        a(bVar);
        com.baidu.mapsdkplatform.comapi.map.p pVar = new com.baidu.mapsdkplatform.comapi.map.p();
        this.K = pVar;
        a(pVar);
        com.baidu.mapsdkplatform.comapi.map.a aVar = new com.baidu.mapsdkplatform.comapi.map.a();
        this.L = aVar;
        a(aVar);
        a(new com.baidu.mapsdkplatform.comapi.map.r());
        com.baidu.mapsdkplatform.comapi.map.ag agVar = new com.baidu.mapsdkplatform.comapi.map.ag();
        this.I = agVar;
        a(agVar);
        this.F.put(com.baidu.mapapi.map.MapLayer.MAP_LAYER_POI_MARKER, this.I);
        com.baidu.mapsdkplatform.comapi.map.c cVar = new com.baidu.mapsdkplatform.comapi.map.c();
        this.ar = cVar;
        a(cVar);
        this.F.put(com.baidu.mapapi.map.MapLayer.MAP_LAYER_INDOOR_POI, this.ar);
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar2 = this.i;
        if (aVar2 != null) {
            aVar2.e(false);
        }
        com.baidu.mapsdkplatform.comapi.map.aj ajVar = new com.baidu.mapsdkplatform.comapi.map.aj();
        this.J = ajVar;
        a(ajVar);
        this.F.put(com.baidu.mapapi.map.MapLayer.MAP_LAYER_OVERLAY, this.J);
        com.baidu.mapsdkplatform.comapi.map.g gVar = new com.baidu.mapsdkplatform.comapi.map.g();
        this.H = gVar;
        a(gVar);
        com.baidu.mapsdkplatform.comapi.map.z zVar = new com.baidu.mapsdkplatform.comapi.map.z();
        this.G = zVar;
        a(zVar);
        this.F.put(com.baidu.mapapi.map.MapLayer.MAP_LAYER_LOCATION, this.G);
    }

    public void a(float f, float f2) {
        this.a = f;
        this.c = f;
        this.b = f2;
    }

    void a(int i) {
        int i2;
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = new com.baidu.mapsdkplatform.comjni.map.basemap.a();
        this.i = aVar;
        aVar.a(i);
        long jA = this.i.a();
        this.j = jA;
        a("com.baidu.platform.comapi.wnplatform.walkmap.WNaviBaiduMap", "setId", jA);
        if (com.baidu.mapapi.common.SysOSUtil.getDensityDpi() < 180) {
            i2 = 18;
        } else if (com.baidu.mapapi.common.SysOSUtil.getDensityDpi() < 240) {
            i2 = 25;
        } else {
            i2 = com.baidu.mapapi.common.SysOSUtil.getDensityDpi() < 320 ? 37 : 50;
        }
        this.l = i2;
        java.lang.String moduleFileName = com.baidu.mapapi.common.SysOSUtil.getModuleFileName();
        java.lang.String appSDCardPath = com.baidu.mapapi.common.EnvironmentUtilities.getAppSDCardPath();
        java.lang.String appCachePath = com.baidu.mapapi.common.EnvironmentUtilities.getAppCachePath();
        java.lang.String appSecondCachePath = com.baidu.mapapi.common.EnvironmentUtilities.getAppSecondCachePath();
        int mapTmpStgMax = com.baidu.mapapi.common.EnvironmentUtilities.getMapTmpStgMax();
        int domTmpStgMax = com.baidu.mapapi.common.EnvironmentUtilities.getDomTmpStgMax();
        int itsTmpStgMax = com.baidu.mapapi.common.EnvironmentUtilities.getItsTmpStgMax();
        java.lang.String str = com.baidu.mapapi.common.SysOSUtil.getDensityDpi() >= 180 ? "/h/" : "/l/";
        java.lang.String str2 = moduleFileName + "/cfg";
        java.lang.String str3 = appSDCardPath + "/vmp";
        java.lang.String str4 = str2 + "/a/";
        java.lang.String str5 = str2 + "/a/";
        java.lang.String str6 = str2 + "/idrres/";
        java.lang.String str7 = str3 + str;
        java.lang.String str8 = str3 + str;
        java.lang.String str9 = appCachePath + "/tmp/";
        java.lang.String str10 = appSecondCachePath + "/tmp/";
        android.app.Activity activityA = a(this.D);
        if (activityA == null) {
            throw new java.lang.RuntimeException("BDMapSDKException: Please give the right context.");
        }
        android.view.Display defaultDisplay = activityA.getWindowManager().getDefaultDisplay();
        this.i.a(str4, str7, str9, str10, str8, str5, this.ao, this.ap, str6, defaultDisplay.getWidth(), defaultDisplay.getHeight(), com.baidu.mapapi.common.SysOSUtil.getDensityDpi(), mapTmpStgMax, domTmpStgMax, itsTmpStgMax, 0);
    }

    void a(int i, int i2) {
        this.Q = i;
        this.R = i2;
    }

    public void a(long j, long j2, long j3, long j4, boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.a(j, j2, j3, j4, z);
    }

    public void a(android.graphics.Bitmap bitmap) {
        android.os.Bundle bundle;
        if (this.i == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject.put("type", 0);
            jSONObject2.put("x", O);
            jSONObject2.put("y", P);
            jSONObject2.put("hidetime", 1000);
            jSONArray.put(jSONObject2);
            jSONObject.put("data", jSONArray);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        if (bitmap == null) {
            bundle = null;
        } else {
            android.os.Bundle bundle2 = new android.os.Bundle();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.baidu.mapapi.model.ParcelItem parcelItem = new com.baidu.mapapi.model.ParcelItem();
            android.os.Bundle bundle3 = new android.os.Bundle();
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            bundle3.putByteArray("imgdata", byteBufferAllocate.array());
            bundle3.putInt("imgindex", bitmap.hashCode());
            bundle3.putInt("imgH", bitmap.getHeight());
            bundle3.putInt("imgW", bitmap.getWidth());
            bundle3.putInt("hasIcon", 1);
            parcelItem.setBundle(bundle3);
            arrayList.add(parcelItem);
            if (arrayList.size() > 0) {
                com.baidu.mapapi.model.ParcelItem[] parcelItemArr = new com.baidu.mapapi.model.ParcelItem[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    parcelItemArr[i] = (com.baidu.mapapi.model.ParcelItem) arrayList.get(i);
                }
                bundle2.putParcelableArray("icondata", parcelItemArr);
            }
            bundle = bundle2;
        }
        b(jSONObject.toString(), bundle);
        this.i.b(this.H.a);
    }

    void a(android.os.Handler handler) {
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(com.baidu.mapapi.UIMsg.m_AppUI.MSG_APP_SAVESCREEN, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(39, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(41, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(49, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(65289, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(50, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT, handler);
        com.baidu.mapsdkplatform.comjni.map.basemap.BaseMapCallback.addLayerDataInterface(this.j, this);
    }

    public void a(com.baidu.mapapi.map.MapLayer mapLayer, com.baidu.mapapi.map.MapLayer mapLayer2) {
        if (this.i == null) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.d dVar = this.F.get(mapLayer);
        com.baidu.mapsdkplatform.comapi.map.d dVar2 = this.F.get(mapLayer2);
        if (dVar == null || dVar2 == null) {
            return;
        }
        this.i.a(dVar.a, dVar2.a);
    }

    public void a(com.baidu.mapapi.map.MapLayer mapLayer, boolean z) {
        com.baidu.mapsdkplatform.comapi.map.d dVar;
        if (this.i == null || (dVar = this.F.get(mapLayer)) == null) {
            return;
        }
        this.i.b(dVar.a, z);
    }

    public void a(com.baidu.mapapi.map.MapStatusUpdate mapStatusUpdate) {
        this.q = mapStatusUpdate;
    }

    public void a(com.baidu.mapapi.model.LatLngBounds latLngBounds) {
        if (latLngBounds == null || this.i == null) {
            return;
        }
        com.baidu.mapapi.model.LatLng latLng = latLngBounds.northeast;
        com.baidu.mapapi.model.LatLng latLng2 = latLngBounds.southwest;
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng);
        com.baidu.mapapi.model.inner.GeoPoint geoPointLl2mc2 = com.baidu.mapapi.model.CoordUtil.ll2mc(latLng2);
        int longitudeE6 = (int) geoPointLl2mc.getLongitudeE6();
        int latitudeE6 = (int) geoPointLl2mc2.getLatitudeE6();
        int longitudeE7 = (int) geoPointLl2mc2.getLongitudeE6();
        int latitudeE7 = (int) geoPointLl2mc.getLatitudeE6();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("maxCoorx", longitudeE6);
        bundle.putInt("minCoory", latitudeE6);
        bundle.putInt("minCoorx", longitudeE7);
        bundle.putInt("maxCoory", latitudeE7);
        this.i.a(bundle);
    }

    void a(com.baidu.mapsdkplatform.comapi.map.ab abVar) {
        new com.baidu.mapsdkplatform.comapi.map.ad();
        if (abVar == null) {
            abVar = new com.baidu.mapsdkplatform.comapi.map.ab();
        }
        com.baidu.mapsdkplatform.comapi.map.ad adVar = abVar.a;
        this.y = abVar.f;
        this.z = abVar.d;
        this.e = abVar.e;
        this.f = abVar.g;
        this.i.a(adVar.a(this), false);
        this.i.c(com.baidu.mapsdkplatform.comapi.map.aa.DEFAULT.ordinal());
        this.u = abVar.b;
        if (abVar.b) {
            O = (int) (com.baidu.mapapi.common.SysOSUtil.getDensity() * 40.0f);
            P = (int) (com.baidu.mapapi.common.SysOSUtil.getDensity() * 40.0f);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("x", O);
                jSONObject2.put("y", P);
                jSONObject2.put("hidetime", 1000);
                jSONArray.put(jSONObject2);
                jSONObject.put("data", jSONArray);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
            this.H.a(jSONObject.toString());
            this.i.a(this.H.a, true);
        } else {
            this.i.a(this.H.a, false);
        }
        int i = abVar.c;
        if (i == 2) {
            a(true);
        }
        if (i == 3) {
            this.i.a(this.an.a, false);
            this.i.a(this.ar.a, false);
            this.i.a(this.I.a, false);
            this.i.e(false);
        }
    }

    public void a(com.baidu.mapsdkplatform.comapi.map.ad adVar) {
        if (this.i == null || adVar == null) {
            return;
        }
        android.os.Bundle bundleA = adVar.a(this);
        bundleA.putInt("animation", 0);
        bundleA.putInt("animatime", 0);
        this.i.a(bundleA, true);
    }

    public void a(com.baidu.mapsdkplatform.comapi.map.ad adVar, int i) {
        if (this.i == null || adVar == null) {
            return;
        }
        android.os.Bundle bundleA = adVar.a(this);
        bundleA.putInt("animation", 1);
        bundleA.putInt("animatime", i);
        if (this.at) {
            this.au.add(new com.baidu.mapsdkplatform.comapi.map.e.a(bundleA));
        } else {
            A();
            this.i.a(bundleA, false);
        }
    }

    public void a(com.baidu.mapsdkplatform.comapi.map.ak akVar) {
        this.C = akVar;
    }

    public void a(com.baidu.mapsdkplatform.comapi.map.n nVar) {
        java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list;
        if (nVar == null || (list = this.h) == null) {
            return;
        }
        list.add(nVar);
    }

    public void a(com.baidu.mapsdkplatform.comapi.map.q qVar) {
        this.M = qVar;
    }

    public void a(java.lang.String str, int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.a(str, i);
    }

    public void a(java.lang.String str, android.os.Bundle bundle) {
        if (this.i == null) {
            return;
        }
        this.G.a(str);
        this.G.a(bundle);
        this.i.b(this.G.a);
    }

    public void a(java.util.List<android.os.Bundle> list) {
        if (this.i == null || list == null) {
            return;
        }
        int size = list.size();
        android.os.Bundle[] bundleArr = new android.os.Bundle[list.size()];
        for (int i = 0; i < size; i++) {
            g(list.get(i));
            bundleArr[i] = list.get(i);
        }
        this.i.a(bundleArr);
    }

    public void a(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        if (!aVar.a(this.an.a)) {
            this.i.a(this.an.a, true);
        }
        this.t = z;
        R();
        this.i.a(this.t);
    }

    public boolean a(float f, float f2, float f3, float f4) {
        boolean z;
        int i;
        int i2;
        int i3 = this.R;
        float f5 = i3 - f2;
        float f6 = i3 - f4;
        if (this.T.e) {
            if (this.S == 0) {
                if ((this.T.c - f5 <= 0.0f || this.T.d - f6 <= 0.0f) && (this.T.c - f5 >= 0.0f || this.T.d - f6 >= 0.0f)) {
                    z = true;
                    this.S = 2;
                } else {
                    float f7 = f6 - f5;
                    float f8 = f3 - f;
                    double dAtan2 = java.lang.Math.atan2(f7, f8) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                    double dSqrt = java.lang.Math.sqrt((f8 * f8) + (f7 * f7)) / this.T.h;
                    int iLog = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                    int i4 = (int) ((dAtan2 * 180.0d) / 3.1416d);
                    if ((dSqrt <= 0.0d || (iLog <= 3000 && iLog >= -3000)) && java.lang.Math.abs(i4) < 10) {
                        z = true;
                        this.S = 1;
                    } else {
                        this.S = 2;
                        z = true;
                    }
                }
                if (this.S == 0) {
                    return z;
                }
            } else {
                z = true;
            }
            int i5 = this.S;
            if (i5 == z && this.y) {
                if (this.T.c - f5 > 0.0f && this.T.d - f6 > 0.0f) {
                    S();
                    i2 = 83;
                } else if (this.T.c - f5 < 0.0f && this.T.d - f6 < 0.0f) {
                    S();
                    i2 = 87;
                }
                a(1, i2, 0);
            } else if (i5 == 2 || i5 == 4 || i5 == 3) {
                float f9 = f6 - f5;
                float f10 = f3 - f;
                double dAtan3 = java.lang.Math.atan2(f9, f10) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                double dSqrt2 = java.lang.Math.sqrt((f10 * f10) + (f9 * f9)) / this.T.h;
                int iLog2 = (int) ((java.lang.Math.log(dSqrt2) / java.lang.Math.log(2.0d)) * 10000.0d);
                double dAtan4 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                double dSqrt3 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                double d2 = dAtan4 + dAtan3;
                float fCos = (float) ((java.lang.Math.cos(d2) * dSqrt3 * dSqrt2) + ((double) f));
                float fSin = (float) ((dSqrt3 * java.lang.Math.sin(d2) * dSqrt2) + ((double) f5));
                int i6 = (int) ((dAtan3 * 180.0d) / 3.1416d);
                if (dSqrt2 > 0.0d && (3 == this.S || (java.lang.Math.abs(iLog2) > 2000 && 2 == this.S))) {
                    this.S = 3;
                    float f11 = E().a;
                    if (this.f) {
                        if (dSqrt2 <= 1.0d) {
                            i = 3;
                            if (f11 <= this.b) {
                                return false;
                            }
                            S();
                        } else {
                            if (f11 >= this.a) {
                                return false;
                            }
                            S();
                            i = 3;
                        }
                        a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, i, iLog2);
                    }
                } else if (i6 != 0 && (4 == this.S || (java.lang.Math.abs(i6) > 10 && 2 == this.S))) {
                    this.S = 4;
                    if (this.z) {
                        com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                        S();
                        a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i6);
                    }
                }
                this.T.f = fCos;
                this.T.g = fSin;
            }
        }
        if (2 != this.S) {
            this.T.c = f5;
            this.T.d = f6;
            this.T.a = f;
            this.T.b = f3;
        }
        if (this.T.e) {
            return true;
        }
        this.T.f = this.Q / 2;
        this.T.g = this.R / 2;
        this.T.e = true;
        if (0.0d != this.T.h) {
            return true;
        }
        this.T.h = java.lang.Math.sqrt(((this.T.b - this.T.a) * (this.T.b - this.T.a)) + ((this.T.d - this.T.c) * (this.T.d - this.T.c)));
        return true;
    }

    @Override // com.baidu.mapsdkplatform.comjni.map.basemap.b
    public boolean a(long j) {
        java.util.Iterator<com.baidu.mapsdkplatform.comapi.map.d> it = this.E.iterator();
        while (it.hasNext()) {
            if (it.next().a == j) {
                return true;
            }
        }
        return false;
    }

    public boolean a(android.graphics.Point point) {
        if (point == null || this.i == null || point.x < 0 || point.y < 0) {
            return false;
        }
        O = point.x;
        P = point.y;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("x", O);
            jSONObject2.put("y", P);
            jSONObject2.put("hidetime", 1000);
            jSONArray.put(jSONObject2);
            jSONObject.put("data", jSONArray);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        this.H.a(jSONObject.toString());
        this.i.b(this.H.a);
        return true;
    }

    public boolean a(android.os.Bundle bundle) {
        if (this.i == null) {
            return false;
        }
        com.baidu.mapsdkplatform.comapi.map.al alVar = new com.baidu.mapsdkplatform.comapi.map.al();
        this.B = alVar;
        long jA = this.i.a(alVar.c, this.B.d, this.B.b);
        if (jA != 0) {
            this.B.a = jA;
            this.E.add(this.B);
            bundle.putLong("sdktileaddr", jA);
            if (e(bundle) && f(bundle)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0231  */
    /* JADX WARN: Code duplicated, block: B:104:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:128:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0342  */
    /* JADX WARN: Code duplicated, block: B:137:0x035a  */
    /* JADX WARN: Code duplicated, block: B:139:0x036a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0372  */
    /* JADX WARN: Code duplicated, block: B:146:0x038a  */
    /* JADX WARN: Code duplicated, block: B:148:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x0152  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e8  */
    boolean a(android.view.MotionEvent motionEvent) {
        int i;
        android.view.ViewConfiguration viewConfiguration;
        int scaledMaximumFlingVelocity;
        int minimumFlingVelocity;
        float xVelocity;
        float f;
        float f2;
        boolean z;
        int i2;
        double dSqrt;
        int i3;
        com.baidu.mapsdkplatform.comapi.map.e eVar;
        int i4;
        int i5;
        int i6;
        com.baidu.mapsdkplatform.comapi.map.ad adVarE;
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount == 2 && (!c((int) motionEvent.getX(0), (int) motionEvent.getY(0)) || !c((int) motionEvent.getX(1), (int) motionEvent.getY(1)))) {
            pointerCount = 1;
        }
        if (pointerCount != 2) {
            int action = motionEvent.getAction();
            if (action == 0) {
                b(motionEvent);
            } else {
                if (action == 1) {
                    return d(motionEvent);
                }
                if (action != 2) {
                    return false;
                }
                c(motionEvent);
            }
            return true;
        }
        float y = this.R - motionEvent.getY(0);
        float y2 = this.R - motionEvent.getY(1);
        float x = motionEvent.getX(0);
        float x2 = motionEvent.getX(1);
        int action2 = motionEvent.getAction();
        if (action2 != 5) {
            if (action2 != 6) {
                if (action2 == 261) {
                    this.V = motionEvent.getEventTime();
                } else if (action2 == 262) {
                    this.X = motionEvent.getEventTime();
                }
                if (this.U == null) {
                    this.U = android.view.VelocityTracker.obtain();
                }
                this.U.addMovement(motionEvent);
                viewConfiguration = android.view.ViewConfiguration.get(com.baidu.mapapi.JNIInitializer.getCachedContext());
                if (viewConfiguration == null) {
                    minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                    scaledMaximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                } else {
                    int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    minimumFlingVelocity = scaledMinimumFlingVelocity;
                }
                this.U.computeCurrentVelocity(1000, scaledMaximumFlingVelocity);
                xVelocity = this.U.getXVelocity(1);
                float yVelocity = this.U.getYVelocity(1);
                float xVelocity2 = this.U.getXVelocity(2);
                float yVelocity2 = this.U.getYVelocity(2);
                f = minimumFlingVelocity;
                if (java.lang.Math.abs(xVelocity) <= f || java.lang.Math.abs(yVelocity) > f || java.lang.Math.abs(xVelocity2) > f || java.lang.Math.abs(yVelocity2) > f) {
                    if (this.T.e) {
                        if (this.S == 0) {
                            if ((this.T.c - y > 0.0f || this.T.d - y2 <= 0.0f) && (this.T.c - y >= 0.0f || this.T.d - y2 >= 0.0f)) {
                                f2 = y2;
                                z = true;
                                this.S = 2;
                            } else {
                                float f3 = y2 - y;
                                float f4 = x2 - x;
                                f2 = y2;
                                double dAtan2 = java.lang.Math.atan2(f3, f4) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                                double dSqrt2 = java.lang.Math.sqrt((f4 * f4) + (f3 * f3)) / this.T.h;
                                int iLog = (int) ((java.lang.Math.log(dSqrt2) / java.lang.Math.log(2.0d)) * 10000.0d);
                                int i7 = (int) ((dAtan2 * 180.0d) / 3.1416d);
                                if ((dSqrt2 <= 0.0d || (iLog <= 3000 && iLog >= -3000)) && java.lang.Math.abs(i7) < 10) {
                                    z = true;
                                    this.S = 1;
                                } else {
                                    this.S = 2;
                                    z = true;
                                }
                            }
                            if (this.S == 0) {
                                return z;
                            }
                        } else {
                            f2 = y2;
                            z = true;
                        }
                        i2 = this.S;
                        if (i2 == z || !this.y) {
                            if (i2 != 2 || i2 == 4 || i2 == 3) {
                                float f5 = f2 - y;
                                float f6 = x2 - x;
                                double dAtan3 = java.lang.Math.atan2(f5, f6) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                                dSqrt = java.lang.Math.sqrt((f6 * f6) + (f5 * f5)) / this.T.h;
                                int iLog2 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                                double dAtan4 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                                double dSqrt3 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                                double d2 = dAtan4 + dAtan3;
                                float fCos = (float) ((java.lang.Math.cos(d2) * dSqrt3 * dSqrt) + ((double) x));
                                float fSin = (float) ((dSqrt3 * java.lang.Math.sin(d2) * dSqrt) + ((double) y));
                                i3 = (int) ((dAtan3 * 180.0d) / 3.1416d);
                                eVar = this;
                                if (dSqrt <= 0.0d && (3 == eVar.S || (java.lang.Math.abs(iLog2) > 2000 && 2 == eVar.S))) {
                                    eVar.S = 3;
                                    float f7 = E().a;
                                    if (eVar.f) {
                                        if (dSqrt <= 1.0d) {
                                            i4 = 3;
                                            if (f7 <= eVar.b) {
                                                return false;
                                            }
                                            com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                                            S();
                                        } else {
                                            if (f7 >= eVar.a) {
                                                return false;
                                            }
                                            com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                                            S();
                                            i4 = 3;
                                        }
                                        eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, i4, iLog2);
                                    }
                                } else if (i3 != 0 && (4 == eVar.S || (java.lang.Math.abs(i3) > 10 && 2 == eVar.S))) {
                                    eVar.S = 4;
                                    if (eVar.z) {
                                        S();
                                        eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                                    }
                                }
                                eVar.T.f = fCos;
                                eVar.T.g = fSin;
                            }
                            if (2 != eVar.S) {
                                eVar.T.c = y;
                                eVar.T.d = f2;
                                eVar.T.a = x;
                                eVar.T.b = x2;
                            }
                            if (eVar.T.e) {
                                return true;
                            }
                            eVar.T.f = eVar.Q / 2;
                            eVar.T.g = eVar.R / 2;
                            eVar.T.e = true;
                            if (0.0d != eVar.T.h) {
                                return true;
                            }
                            eVar.T.h = java.lang.Math.sqrt(((eVar.T.b - eVar.T.a) * (eVar.T.b - eVar.T.a)) + ((eVar.T.d - eVar.T.c) * (eVar.T.d - eVar.T.c)));
                            return true;
                        }
                        if (this.T.c - y > 0.0f && this.T.d - f2 > 0.0f) {
                            i5 = 1;
                            com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                            S();
                            i6 = 83;
                        } else if (this.T.c - y < 0.0f && this.T.d - f2 < 0.0f) {
                            i5 = 1;
                            com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                            S();
                            i6 = 87;
                        }
                        a(i5, i6, 0);
                    }
                    eVar = this;
                    if (2 != eVar.S) {
                        eVar.T.c = y;
                        eVar.T.d = f2;
                        eVar.T.a = x;
                        eVar.T.b = x2;
                    }
                    if (eVar.T.e) {
                        return true;
                    }
                    eVar.T.f = eVar.Q / 2;
                    eVar.T.g = eVar.R / 2;
                    eVar.T.e = true;
                    if (0.0d != eVar.T.h) {
                        return true;
                    }
                    eVar.T.h = java.lang.Math.sqrt(((eVar.T.b - eVar.T.a) * (eVar.T.b - eVar.T.a)) + ((eVar.T.d - eVar.T.c) * (eVar.T.d - eVar.T.c)));
                    return true;
                }
                if (this.S == 0 && this.Z == 0) {
                    long j = this.X;
                    long j2 = this.Y;
                    if (j <= j2) {
                        j = j2;
                    }
                    this.X = j;
                    long j3 = this.V;
                    long j4 = this.W;
                    if (j3 < j4) {
                        j3 = j4;
                    }
                    this.V = j3;
                    if (j - j3 < 200 && this.f && (adVarE = E()) != null) {
                        adVarE.a -= 1.0f;
                        com.baidu.mapapi.map.BaiduMap.mapStatusReason |= 1;
                        a(adVarE, 300);
                    }
                }
                f2 = y2;
                eVar = this;
                if (2 != eVar.S) {
                    eVar.T.c = y;
                    eVar.T.d = f2;
                    eVar.T.a = x;
                    eVar.T.b = x2;
                }
                if (eVar.T.e) {
                    return true;
                }
                eVar.T.f = eVar.Q / 2;
                eVar.T.g = eVar.R / 2;
                eVar.T.e = true;
                if (0.0d != eVar.T.h) {
                    return true;
                }
                eVar.T.h = java.lang.Math.sqrt(((eVar.T.b - eVar.T.a) * (eVar.T.b - eVar.T.a)) + ((eVar.T.d - eVar.T.c) * (eVar.T.d - eVar.T.c)));
                return true;
            }
            this.Y = motionEvent.getEventTime();
            i = this.Z + 1;
            this.Z = i;
            if (this.U == null) {
                this.U = android.view.VelocityTracker.obtain();
            }
            this.U.addMovement(motionEvent);
            viewConfiguration = android.view.ViewConfiguration.get(com.baidu.mapapi.JNIInitializer.getCachedContext());
            if (viewConfiguration == null) {
                minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                scaledMaximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
            } else {
                int scaledMinimumFlingVelocity2 = viewConfiguration.getScaledMinimumFlingVelocity();
                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                minimumFlingVelocity = scaledMinimumFlingVelocity2;
            }
            this.U.computeCurrentVelocity(1000, scaledMaximumFlingVelocity);
            xVelocity = this.U.getXVelocity(1);
            float yVelocity3 = this.U.getYVelocity(1);
            float xVelocity3 = this.U.getXVelocity(2);
            float yVelocity4 = this.U.getYVelocity(2);
            f = minimumFlingVelocity;
            if (java.lang.Math.abs(xVelocity) <= f) {
                if (this.T.e) {
                    if (this.S == 0) {
                        if (this.T.c - y > 0.0f) {
                            f2 = y2;
                            z = true;
                            this.S = 2;
                        } else {
                            f2 = y2;
                            z = true;
                            this.S = 2;
                        }
                        if (this.S == 0) {
                            return z;
                        }
                    } else {
                        f2 = y2;
                        z = true;
                    }
                    i2 = this.S;
                    if (i2 == z) {
                        if (i2 != 2) {
                        }
                        float f8 = f2 - y;
                        float f9 = x2 - x;
                        double dAtan5 = java.lang.Math.atan2(f8, f9) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                        dSqrt = java.lang.Math.sqrt((f9 * f9) + (f8 * f8)) / this.T.h;
                        int iLog3 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                        double dAtan6 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                        double dSqrt4 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                        double d3 = dAtan6 + dAtan5;
                        float fCos2 = (float) ((java.lang.Math.cos(d3) * dSqrt4 * dSqrt) + ((double) x));
                        float fSin2 = (float) ((dSqrt4 * java.lang.Math.sin(d3) * dSqrt) + ((double) y));
                        i3 = (int) ((dAtan5 * 180.0d) / 3.1416d);
                        eVar = this;
                        if (dSqrt <= 0.0d) {
                            if (i3 != 0) {
                                eVar.S = 4;
                                if (eVar.z) {
                                    S();
                                    eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                                }
                            }
                        } else if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                        eVar.T.f = fCos2;
                        eVar.T.g = fSin2;
                    } else {
                        if (i2 != 2) {
                        }
                        float f10 = f2 - y;
                        float f11 = x2 - x;
                        double dAtan7 = java.lang.Math.atan2(f10, f11) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                        dSqrt = java.lang.Math.sqrt((f11 * f11) + (f10 * f10)) / this.T.h;
                        int iLog4 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                        double dAtan8 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                        double dSqrt5 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                        double d4 = dAtan8 + dAtan7;
                        float fCos3 = (float) ((java.lang.Math.cos(d4) * dSqrt5 * dSqrt) + ((double) x));
                        float fSin3 = (float) ((dSqrt5 * java.lang.Math.sin(d4) * dSqrt) + ((double) y));
                        i3 = (int) ((dAtan7 * 180.0d) / 3.1416d);
                        eVar = this;
                        if (dSqrt <= 0.0d) {
                            if (i3 != 0) {
                                eVar.S = 4;
                                if (eVar.z) {
                                    S();
                                    eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                                }
                            }
                        } else if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                        eVar.T.f = fCos3;
                        eVar.T.g = fSin3;
                    }
                } else {
                    f2 = y2;
                }
                eVar = this;
            } else {
                if (this.T.e) {
                    if (this.S == 0) {
                        if (this.T.c - y > 0.0f) {
                            f2 = y2;
                            z = true;
                            this.S = 2;
                        } else {
                            f2 = y2;
                            z = true;
                            this.S = 2;
                        }
                        if (this.S == 0) {
                            return z;
                        }
                    } else {
                        f2 = y2;
                        z = true;
                    }
                    i2 = this.S;
                    if (i2 == z) {
                        if (i2 != 2) {
                        }
                        float f12 = f2 - y;
                        float f13 = x2 - x;
                        double dAtan9 = java.lang.Math.atan2(f12, f13) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                        dSqrt = java.lang.Math.sqrt((f13 * f13) + (f12 * f12)) / this.T.h;
                        int iLog5 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                        double dAtan10 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                        double dSqrt6 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                        double d5 = dAtan10 + dAtan9;
                        float fCos4 = (float) ((java.lang.Math.cos(d5) * dSqrt6 * dSqrt) + ((double) x));
                        float fSin4 = (float) ((dSqrt6 * java.lang.Math.sin(d5) * dSqrt) + ((double) y));
                        i3 = (int) ((dAtan9 * 180.0d) / 3.1416d);
                        eVar = this;
                        if (dSqrt <= 0.0d) {
                            if (i3 != 0) {
                                eVar.S = 4;
                                if (eVar.z) {
                                    S();
                                    eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                                }
                            }
                        } else if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                        eVar.T.f = fCos4;
                        eVar.T.g = fSin4;
                    } else {
                        if (i2 != 2) {
                        }
                        float f14 = f2 - y;
                        float f15 = x2 - x;
                        double dAtan11 = java.lang.Math.atan2(f14, f15) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                        dSqrt = java.lang.Math.sqrt((f15 * f15) + (f14 * f14)) / this.T.h;
                        int iLog6 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                        double dAtan12 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                        double dSqrt7 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                        double d6 = dAtan12 + dAtan11;
                        float fCos5 = (float) ((java.lang.Math.cos(d6) * dSqrt7 * dSqrt) + ((double) x));
                        float fSin5 = (float) ((dSqrt7 * java.lang.Math.sin(d6) * dSqrt) + ((double) y));
                        i3 = (int) ((dAtan11 * 180.0d) / 3.1416d);
                        eVar = this;
                        if (dSqrt <= 0.0d) {
                            if (i3 != 0) {
                                eVar.S = 4;
                                if (eVar.z) {
                                    S();
                                    eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                                }
                            }
                        } else if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                        eVar.T.f = fCos5;
                        eVar.T.g = fSin5;
                    }
                } else {
                    f2 = y2;
                }
                eVar = this;
            }
            if (2 != eVar.S) {
                eVar.T.c = y;
                eVar.T.d = f2;
                eVar.T.a = x;
                eVar.T.b = x2;
            }
            if (eVar.T.e) {
                return true;
            }
            eVar.T.f = eVar.Q / 2;
            eVar.T.g = eVar.R / 2;
            eVar.T.e = true;
            if (0.0d != eVar.T.h) {
                return true;
            }
            eVar.T.h = java.lang.Math.sqrt(((eVar.T.b - eVar.T.a) * (eVar.T.b - eVar.T.a)) + ((eVar.T.d - eVar.T.c) * (eVar.T.d - eVar.T.c)));
            return true;
        }
        this.W = motionEvent.getEventTime();
        i = this.Z - 1;
        this.Z = i;
        if (this.U == null) {
            this.U = android.view.VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        viewConfiguration = android.view.ViewConfiguration.get(com.baidu.mapapi.JNIInitializer.getCachedContext());
        if (viewConfiguration == null) {
            minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
            scaledMaximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
        } else {
            int scaledMinimumFlingVelocity3 = viewConfiguration.getScaledMinimumFlingVelocity();
            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
            minimumFlingVelocity = scaledMinimumFlingVelocity3;
        }
        this.U.computeCurrentVelocity(1000, scaledMaximumFlingVelocity);
        xVelocity = this.U.getXVelocity(1);
        float yVelocity5 = this.U.getYVelocity(1);
        float xVelocity4 = this.U.getXVelocity(2);
        float yVelocity6 = this.U.getYVelocity(2);
        f = minimumFlingVelocity;
        if (java.lang.Math.abs(xVelocity) <= f) {
            if (this.T.e) {
                if (this.S == 0) {
                    if (this.T.c - y > 0.0f) {
                        f2 = y2;
                        z = true;
                        this.S = 2;
                    } else {
                        f2 = y2;
                        z = true;
                        this.S = 2;
                    }
                    if (this.S == 0) {
                        return z;
                    }
                } else {
                    f2 = y2;
                    z = true;
                }
                i2 = this.S;
                if (i2 == z) {
                    if (i2 != 2) {
                    }
                    float f16 = f2 - y;
                    float f17 = x2 - x;
                    double dAtan13 = java.lang.Math.atan2(f16, f17) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                    dSqrt = java.lang.Math.sqrt((f17 * f17) + (f16 * f16)) / this.T.h;
                    int iLog7 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                    double dAtan14 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                    double dSqrt8 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                    double d7 = dAtan14 + dAtan13;
                    float fCos6 = (float) ((java.lang.Math.cos(d7) * dSqrt8 * dSqrt) + ((double) x));
                    float fSin6 = (float) ((dSqrt8 * java.lang.Math.sin(d7) * dSqrt) + ((double) y));
                    i3 = (int) ((dAtan13 * 180.0d) / 3.1416d);
                    eVar = this;
                    if (dSqrt <= 0.0d) {
                        if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                    } else if (i3 != 0) {
                        eVar.S = 4;
                        if (eVar.z) {
                            S();
                            eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                        }
                    }
                    eVar.T.f = fCos6;
                    eVar.T.g = fSin6;
                } else {
                    if (i2 != 2) {
                    }
                    float f18 = f2 - y;
                    float f19 = x2 - x;
                    double dAtan15 = java.lang.Math.atan2(f18, f19) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                    dSqrt = java.lang.Math.sqrt((f19 * f19) + (f18 * f18)) / this.T.h;
                    int iLog8 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                    double dAtan16 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                    double dSqrt9 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                    double d8 = dAtan16 + dAtan15;
                    float fCos7 = (float) ((java.lang.Math.cos(d8) * dSqrt9 * dSqrt) + ((double) x));
                    float fSin7 = (float) ((dSqrt9 * java.lang.Math.sin(d8) * dSqrt) + ((double) y));
                    i3 = (int) ((dAtan15 * 180.0d) / 3.1416d);
                    eVar = this;
                    if (dSqrt <= 0.0d) {
                        if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                    } else if (i3 != 0) {
                        eVar.S = 4;
                        if (eVar.z) {
                            S();
                            eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                        }
                    }
                    eVar.T.f = fCos7;
                    eVar.T.g = fSin7;
                }
            } else {
                f2 = y2;
            }
            eVar = this;
        } else {
            if (this.T.e) {
                if (this.S == 0) {
                    if (this.T.c - y > 0.0f) {
                        f2 = y2;
                        z = true;
                        this.S = 2;
                    } else {
                        f2 = y2;
                        z = true;
                        this.S = 2;
                    }
                    if (this.S == 0) {
                        return z;
                    }
                } else {
                    f2 = y2;
                    z = true;
                }
                i2 = this.S;
                if (i2 == z) {
                    if (i2 != 2) {
                    }
                    float f110 = f2 - y;
                    float f111 = x2 - x;
                    double dAtan17 = java.lang.Math.atan2(f110, f111) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                    dSqrt = java.lang.Math.sqrt((f111 * f111) + (f110 * f110)) / this.T.h;
                    int iLog9 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                    double dAtan18 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                    double dSqrt10 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                    double d9 = dAtan18 + dAtan17;
                    float fCos8 = (float) ((java.lang.Math.cos(d9) * dSqrt10 * dSqrt) + ((double) x));
                    float fSin8 = (float) ((dSqrt10 * java.lang.Math.sin(d9) * dSqrt) + ((double) y));
                    i3 = (int) ((dAtan17 * 180.0d) / 3.1416d);
                    eVar = this;
                    if (dSqrt <= 0.0d) {
                        if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                    } else if (i3 != 0) {
                        eVar.S = 4;
                        if (eVar.z) {
                            S();
                            eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                        }
                    }
                    eVar.T.f = fCos8;
                    eVar.T.g = fSin8;
                } else {
                    if (i2 != 2) {
                    }
                    float f112 = f2 - y;
                    float f113 = x2 - x;
                    double dAtan19 = java.lang.Math.atan2(f112, f113) - java.lang.Math.atan2(this.T.d - this.T.c, this.T.b - this.T.a);
                    dSqrt = java.lang.Math.sqrt((f113 * f113) + (f112 * f112)) / this.T.h;
                    int iLog10 = (int) ((java.lang.Math.log(dSqrt) / java.lang.Math.log(2.0d)) * 10000.0d);
                    double dAtan110 = java.lang.Math.atan2(this.T.g - this.T.c, this.T.f - this.T.a);
                    double dSqrt11 = java.lang.Math.sqrt(((this.T.f - this.T.a) * (this.T.f - this.T.a)) + ((this.T.g - this.T.c) * (this.T.g - this.T.c)));
                    double d10 = dAtan110 + dAtan19;
                    float fCos9 = (float) ((java.lang.Math.cos(d10) * dSqrt11 * dSqrt) + ((double) x));
                    float fSin9 = (float) ((dSqrt11 * java.lang.Math.sin(d10) * dSqrt) + ((double) y));
                    i3 = (int) ((dAtan19 * 180.0d) / 3.1416d);
                    eVar = this;
                    if (dSqrt <= 0.0d) {
                        if (i3 != 0) {
                            eVar.S = 4;
                            if (eVar.z) {
                                S();
                                eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                            }
                        }
                    } else if (i3 != 0) {
                        eVar.S = 4;
                        if (eVar.z) {
                            S();
                            eVar.a(com.baidu.mapapi.UIMsg.k_event.V_WM_ROTATE, 1, i3);
                        }
                    }
                    eVar.T.f = fCos9;
                    eVar.T.g = fSin9;
                }
            } else {
                f2 = y2;
            }
            eVar = this;
        }
        if (2 != eVar.S) {
            eVar.T.c = y;
            eVar.T.d = f2;
            eVar.T.a = x;
            eVar.T.b = x2;
        }
        if (eVar.T.e) {
            return true;
        }
        eVar.T.f = eVar.Q / 2;
        eVar.T.g = eVar.R / 2;
        eVar.T.e = true;
        if (0.0d != eVar.T.h) {
            return true;
        }
        eVar.T.h = java.lang.Math.sqrt(((eVar.T.b - eVar.T.a) * (eVar.T.b - eVar.T.a)) + ((eVar.T.d - eVar.T.c) * (eVar.T.d - eVar.T.c)));
        return true;
    }

    public boolean a(java.lang.String str, java.lang.String str2) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return false;
        }
        return aVar.a(str, str2);
    }

    public com.baidu.mapapi.model.inner.GeoPoint b(int i, int i2) {
        return this.N.a(i, i2);
    }

    void b(float f, float f2) {
        if (this.T.e) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.ae = jCurrentTimeMillis;
        if (jCurrentTimeMillis - this.ad >= 400) {
            this.ad = jCurrentTimeMillis;
        } else if (java.lang.Math.abs(f - this.aa) >= 120.0f || java.lang.Math.abs(f2 - this.ab) >= 120.0f) {
            jCurrentTimeMillis = this.ae;
            this.ad = jCurrentTimeMillis;
        } else {
            this.ad = 0L;
            this.af = true;
        }
        this.aa = f;
        this.ab = f2;
        a(4, 0, ((int) f) | (((int) f2) << 16));
        this.ac = true;
    }

    public void b(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.f(i);
    }

    public void b(android.os.Bundle bundle) {
        if (this.i == null) {
            return;
        }
        g(bundle);
        this.i.e(bundle);
    }

    void b(android.os.Handler handler) {
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(com.baidu.mapapi.UIMsg.m_AppUI.MSG_APP_SAVESCREEN, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(41, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(49, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(39, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(65289, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(50, handler);
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT, handler);
        com.baidu.mapsdkplatform.comjni.map.basemap.BaseMapCallback.removeLayerDataInterface(this.j);
    }

    public void b(boolean z) {
        this.A = z;
    }

    public boolean b() {
        return this.A;
    }

    public void c() {
        if (this.i == null) {
            return;
        }
        java.util.Iterator<com.baidu.mapsdkplatform.comapi.map.d> it = this.E.iterator();
        while (it.hasNext()) {
            this.i.a(it.next().a, false);
        }
    }

    void c(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar != null) {
            aVar.b(i);
            this.i = null;
        }
    }

    public void c(android.os.Bundle bundle) {
        if (this.i == null) {
            return;
        }
        g(bundle);
        this.i.f(bundle);
    }

    public void c(boolean z) {
        boolean z2;
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        if (z) {
            if (this.av) {
                return;
            }
            aVar.a(this.aq.a, this.J.a);
            z2 = true;
        } else {
            if (!this.av) {
                return;
            }
            aVar.a(this.J.a, this.aq.a);
            z2 = false;
        }
        this.av = z2;
    }

    boolean c(float f, float f2) {
        if (this.T.e || java.lang.System.currentTimeMillis() - m < 300) {
            return true;
        }
        if (this.p) {
            java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
            if (list != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
                    com.baidu.mapapi.model.inner.GeoPoint geoPointB = b((int) f, (int) f2);
                    if (nVar != null) {
                        nVar.d(geoPointB);
                    }
                }
            }
            return true;
        }
        float fAbs = java.lang.Math.abs(f - this.aa);
        float fAbs2 = java.lang.Math.abs(f2 - this.ab);
        double density = com.baidu.mapapi.common.SysOSUtil.getDensity();
        double density2 = com.baidu.mapapi.common.SysOSUtil.getDensity();
        if (density > 1.5d) {
            density2 *= 1.5d;
        }
        float f3 = (float) density2;
        if (this.ac && fAbs / f3 <= 3.0f && fAbs2 / f3 <= 3.0f) {
            return true;
        }
        this.ac = false;
        int i = (int) f;
        int i2 = (int) f2;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (this.e) {
            this.ah = this.aj;
            this.ai = this.ak;
            this.aj = f;
            this.ak = f2;
            this.al = this.am;
            this.am = java.lang.System.currentTimeMillis();
            this.ag = true;
            S();
            a(3, 0, (i2 << 16) | i);
        }
        return false;
    }

    boolean c(int i, int i2) {
        return i >= 0 && i <= this.Q + 0 && i2 >= 0 && i2 <= this.R + 0;
    }

    public void d() {
        if (this.i == null) {
            return;
        }
        for (com.baidu.mapsdkplatform.comapi.map.d dVar : this.E) {
            if ((dVar instanceof com.baidu.mapsdkplatform.comapi.map.z) || (dVar instanceof com.baidu.mapsdkplatform.comapi.map.a) || (dVar instanceof com.baidu.mapsdkplatform.comapi.map.p)) {
                this.i.a(dVar.a, false);
            } else {
                this.i.a(dVar.a, true);
            }
        }
        this.i.c(false);
    }

    public void d(android.os.Bundle bundle) {
        if (this.i == null) {
            return;
        }
        g(bundle);
        this.i.g(bundle);
    }

    public void d(boolean z) {
        boolean z2;
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        if (z) {
            if (this.aw) {
                return;
            }
            aVar.a(this.J.a, this.G.a);
            z2 = true;
        } else {
            if (!this.aw) {
                return;
            }
            aVar.a(this.G.a, this.J.a);
            z2 = false;
        }
        this.aw = z2;
    }

    boolean d(float f, float f2) {
        if (this.p) {
            java.util.List<com.baidu.mapsdkplatform.comapi.map.n> list = this.h;
            if (list != null) {
                for (com.baidu.mapsdkplatform.comapi.map.n nVar : list) {
                    com.baidu.mapapi.model.inner.GeoPoint geoPointB = b((int) f, (int) f2);
                    if (nVar != null) {
                        nVar.e(geoPointB);
                    }
                }
            }
            this.p = false;
            return true;
        }
        if (!this.T.e) {
            if (this.af) {
                return e(f, f2);
            }
            if (this.ag) {
                return T();
            }
            if (java.lang.System.currentTimeMillis() - this.ae < 400 && java.lang.Math.abs(f - this.aa) < 10.0f && java.lang.Math.abs(f2 - this.ab) < 10.0f) {
                M();
                return true;
            }
        }
        M();
        int i = (int) f;
        int i2 = (int) f2;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        a(5, 0, i | (i2 << 16));
        return true;
    }

    public void e(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.a(this.H.a, z);
    }

    public boolean e() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar;
        com.baidu.mapsdkplatform.comapi.map.al alVar = this.B;
        if (alVar == null || (aVar = this.i) == null) {
            return false;
        }
        return aVar.c(alVar.a);
    }

    void f() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        this.N = new com.baidu.mapsdkplatform.comapi.map.ah(aVar);
    }

    public void f(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.a(this.B.a, z);
    }

    public void g(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.a(this.an.a, z);
    }

    public boolean g() {
        return this.s;
    }

    public java.lang.String h() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return null;
        }
        return aVar.e(this.H.a);
    }

    public void h(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        this.x = z;
        aVar.b(z);
    }

    public void i(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        this.s = z;
        aVar.c(z);
    }

    public boolean i() {
        return this.x;
    }

    public void j(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.d(z);
    }

    public boolean j() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return false;
        }
        return aVar.k();
    }

    public void k(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        this.u = z;
        aVar.a(this.H.a, z);
    }

    public boolean k() {
        return this.t;
    }

    public void l(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        float f = z ? 22.0f : 21.0f;
        this.a = f;
        this.c = f;
        aVar.e(z);
        this.i.d(this.aq.a);
        this.i.d(this.ar.a);
    }

    public boolean l() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return false;
        }
        return aVar.a(this.an.a);
    }

    public boolean m() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return false;
        }
        return aVar.o();
    }

    public void n() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.d(this.J.a);
    }

    public void n(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.f(z);
    }

    public void o() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.p();
        this.i.b(this.K.a);
    }

    public void o(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        this.v = z;
        aVar.a(this.G.a, z);
    }

    public com.baidu.mapapi.map.MapBaseIndoorMapInfo p() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return null;
        }
        return aVar.q();
    }

    public void p(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        this.w = z;
        aVar.a(this.K.a, z);
    }

    public void q(boolean z) {
        this.e = z;
    }

    public boolean q() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return false;
        }
        return aVar.r();
    }

    public void r(boolean z) {
        this.f = z;
    }

    public boolean r() {
        return this.u;
    }

    public void s(boolean z) {
        this.g = z;
    }

    public boolean s() {
        return this.v;
    }

    public void t() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.b(this.K.a);
    }

    public void t(boolean z) {
        this.z = z;
    }

    void u() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.e();
    }

    public void u(boolean z) {
        this.y = z;
    }

    void v() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    public void v(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar != null) {
            aVar.a(this.I.a, z);
        }
    }

    public void w(boolean z) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.i;
        if (aVar != null) {
            aVar.a(this.ar.a, z);
        }
    }

    public boolean w() {
        return this.e;
    }

    public void x(boolean z) {
        this.at = z;
    }

    public boolean x() {
        return this.f;
    }

    public boolean y() {
        return this.z;
    }

    public boolean z() {
        return this.y;
    }
}
