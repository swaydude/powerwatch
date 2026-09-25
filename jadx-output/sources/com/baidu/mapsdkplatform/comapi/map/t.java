package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private static final java.lang.String a = "t";
    private static com.baidu.mapsdkplatform.comapi.map.t c;
    private com.baidu.mapsdkplatform.comjni.map.basemap.a b;
    private com.baidu.mapsdkplatform.comapi.map.y d;
    private android.os.Handler e;

    private t() {
    }

    public static com.baidu.mapsdkplatform.comapi.map.t a() throws java.lang.Throwable {
        if (c == null) {
            com.baidu.mapsdkplatform.comapi.map.t tVar = new com.baidu.mapsdkplatform.comapi.map.t();
            c = tVar;
            tVar.g();
        }
        return c;
    }

    private void g() throws java.lang.Throwable {
        h();
        this.d = new com.baidu.mapsdkplatform.comapi.map.y();
        com.baidu.mapsdkplatform.comapi.map.u uVar = new com.baidu.mapsdkplatform.comapi.map.u(this);
        this.e = uVar;
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.registMessage(65289, uVar);
    }

    private void h() throws java.lang.Throwable {
        android.content.Context context = com.baidu.mapapi.BMapManager.getContext();
        com.baidu.mapapi.common.EnvironmentUtilities.initAppDirectory(context);
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = new com.baidu.mapsdkplatform.comjni.map.basemap.a();
        this.b = aVar;
        aVar.a(context.hashCode());
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
        java.lang.String str4 = str3 + str;
        java.lang.String str5 = str3 + str;
        java.lang.String str6 = appCachePath + "/tmp/";
        this.b.a(str2 + "/a/", str4, str6, appSecondCachePath + "/tmp/", str5, str2 + "/a/", null, 0, str2 + "/idrres/", com.baidu.mapapi.common.SysOSUtil.getScreenSizeX(), com.baidu.mapapi.common.SysOSUtil.getScreenSizeY(), com.baidu.mapapi.common.SysOSUtil.getDensityDpi(), mapTmpStgMax, domTmpStgMax, itsTmpStgMax, 0);
        this.b.d();
    }

    public java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> a(java.lang.String str) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar;
        org.json.JSONArray jSONArrayOptJSONArray;
        if (!str.equals("") && (aVar = this.b) != null) {
            java.lang.String strA = aVar.a(str);
            if (strA == null || strA.equals("")) {
                return null;
            }
            java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayList = new java.util.ArrayList<>();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(strA);
                if (jSONObject.length() == 0 || (jSONArrayOptJSONArray = jSONObject.optJSONArray("dataset")) == null) {
                    return null;
                }
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    com.baidu.mapsdkplatform.comapi.map.s sVar = new com.baidu.mapsdkplatform.comapi.map.s();
                    org.json.JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    int iOptInt = jSONObject2.optInt("id");
                    if (iOptInt <= 2000 || iOptInt == 2912 || iOptInt == 2911 || iOptInt == 9000) {
                        sVar.a = iOptInt;
                        sVar.b = jSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                        sVar.c = jSONObject2.optInt("mapsize");
                        sVar.d = jSONObject2.optInt("cty");
                        if (jSONObject2.has("child")) {
                            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("child");
                            java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayList2 = new java.util.ArrayList<>();
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                com.baidu.mapsdkplatform.comapi.map.s sVar2 = new com.baidu.mapsdkplatform.comapi.map.s();
                                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i2);
                                sVar2.a = jSONObjectOptJSONObject.optInt("id");
                                sVar2.b = jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                                sVar2.c = jSONObjectOptJSONObject.optInt("mapsize");
                                sVar2.d = jSONObjectOptJSONObject.optInt("cty");
                                arrayList2.add(sVar2);
                            }
                            sVar.a(arrayList2);
                        }
                        arrayList.add(sVar);
                    }
                }
                return arrayList;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public void a(com.baidu.mapsdkplatform.comapi.map.x xVar) {
        com.baidu.mapsdkplatform.comapi.map.y yVar = this.d;
        if (yVar != null) {
            yVar.a(xVar);
        }
    }

    public boolean a(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null || i < 0) {
            return false;
        }
        if (i <= 2000 || i == 2912 || i == 2911 || i == 9000) {
            return aVar.d(i);
        }
        return false;
    }

    public boolean a(boolean z, boolean z2) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null) {
            return false;
        }
        return aVar.a(z, z2);
    }

    public void b() {
        com.baidu.mapsdkplatform.comapi.map.MessageCenter.unregistMessage(65289, this.e);
        this.b.b(com.baidu.mapapi.BMapManager.getContext().hashCode());
        c = null;
    }

    public void b(com.baidu.mapsdkplatform.comapi.map.x xVar) {
        com.baidu.mapsdkplatform.comapi.map.y yVar = this.d;
        if (yVar != null) {
            yVar.b(xVar);
        }
    }

    public boolean b(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null || i < 0) {
            return false;
        }
        if (i <= 2000 || i == 2912 || i == 2911 || i == 9000) {
            return aVar.a(i, false, 0);
        }
        return false;
    }

    public java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> c() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        java.lang.String strM = aVar.m();
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayList = new java.util.ArrayList<>();
        try {
            org.json.JSONArray jSONArrayOptJSONArray = new org.json.JSONObject(strM).optJSONArray("dataset");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                com.baidu.mapsdkplatform.comapi.map.s sVar = new com.baidu.mapsdkplatform.comapi.map.s();
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                sVar.a = jSONObjectOptJSONObject.optInt("id");
                sVar.b = jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                sVar.c = jSONObjectOptJSONObject.optInt("mapsize");
                sVar.d = jSONObjectOptJSONObject.optInt("cty");
                if (jSONObjectOptJSONObject.has("child")) {
                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("child");
                    java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayList2 = new java.util.ArrayList<>();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        com.baidu.mapsdkplatform.comapi.map.s sVar2 = new com.baidu.mapsdkplatform.comapi.map.s();
                        org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                        sVar2.a = jSONObjectOptJSONObject2.optInt("id");
                        sVar2.b = jSONObjectOptJSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                        sVar2.c = jSONObjectOptJSONObject2.optInt("mapsize");
                        sVar2.d = jSONObjectOptJSONObject2.optInt("cty");
                        arrayList2.add(sVar2);
                    }
                    sVar.a(arrayList2);
                }
                arrayList.add(sVar);
            }
            return arrayList;
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean c(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null || i < 0) {
            return false;
        }
        return aVar.b(i, false, 0);
    }

    public java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> d() {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayList = null;
        if (aVar == null) {
            return null;
        }
        java.lang.String strA = aVar.a("");
        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayList2 = new java.util.ArrayList<>();
        try {
            org.json.JSONArray jSONArrayOptJSONArray = new org.json.JSONObject(strA).optJSONArray("dataset");
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                com.baidu.mapsdkplatform.comapi.map.s sVar = new com.baidu.mapsdkplatform.comapi.map.s();
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                int iOptInt = jSONObjectOptJSONObject.optInt("id");
                if (iOptInt <= 2000 || iOptInt == 2912 || iOptInt == 2911 || iOptInt == 9000) {
                    sVar.a = iOptInt;
                    sVar.b = jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    sVar.c = jSONObjectOptJSONObject.optInt("mapsize");
                    sVar.d = jSONObjectOptJSONObject.optInt("cty");
                    if (jSONObjectOptJSONObject.has("child")) {
                        org.json.JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("child");
                        java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.s> arrayList3 = new java.util.ArrayList<>();
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            com.baidu.mapsdkplatform.comapi.map.s sVar2 = new com.baidu.mapsdkplatform.comapi.map.s();
                            org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                            try {
                                sVar2.a = jSONObjectOptJSONObject2.optInt("id");
                                sVar2.b = jSONObjectOptJSONObject2.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                                sVar2.c = jSONObjectOptJSONObject2.optInt("mapsize");
                                sVar2.d = jSONObjectOptJSONObject2.optInt("cty");
                                arrayList3.add(sVar2);
                                i2++;
                                arrayList = null;
                            } catch (org.json.JSONException unused) {
                                return null;
                            } catch (java.lang.Exception unused2) {
                                return null;
                            }
                        }
                        sVar.a(arrayList3);
                    }
                    arrayList2.add(sVar);
                }
                i++;
                arrayList = null;
            }
            return arrayList2;
        } catch (org.json.JSONException unused3) {
            return arrayList;
        } catch (java.lang.Exception unused4) {
            return arrayList;
        }
    }

    public boolean d(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null) {
            return false;
        }
        return aVar.b(0, true, i);
    }

    public java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.w> e() {
        java.lang.String strL;
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar != null && (strL = aVar.l()) != null && !strL.equals("")) {
            java.util.ArrayList<com.baidu.mapsdkplatform.comapi.map.w> arrayList = new java.util.ArrayList<>();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(strL);
                if (jSONObject.length() == 0) {
                    return null;
                }
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dataset");
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    com.baidu.mapsdkplatform.comapi.map.w wVar = new com.baidu.mapsdkplatform.comapi.map.w();
                    com.baidu.mapsdkplatform.comapi.map.v vVar = new com.baidu.mapsdkplatform.comapi.map.v();
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    vVar.a = jSONObjectOptJSONObject.optInt("id");
                    vVar.b = jSONObjectOptJSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    vVar.c = jSONObjectOptJSONObject.optString("pinyin");
                    vVar.h = jSONObjectOptJSONObject.optInt("mapoldsize");
                    vVar.i = jSONObjectOptJSONObject.optInt("ratio");
                    vVar.l = jSONObjectOptJSONObject.optInt("status");
                    vVar.g = new com.baidu.mapapi.model.inner.GeoPoint(jSONObjectOptJSONObject.optInt("y"), jSONObjectOptJSONObject.optInt("x"));
                    boolean z = true;
                    if (jSONObjectOptJSONObject.optInt("up") != 1) {
                        z = false;
                    }
                    vVar.j = z;
                    vVar.e = jSONObjectOptJSONObject.optInt("lev");
                    if (vVar.j) {
                        vVar.k = jSONObjectOptJSONObject.optInt("mapsize");
                    } else {
                        vVar.k = 0;
                    }
                    wVar.a(vVar);
                    arrayList.add(wVar);
                }
                return arrayList;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public boolean e(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null || i < 0) {
            return false;
        }
        return aVar.b(i, false);
    }

    public boolean f(int i) {
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar == null || i < 0) {
            return false;
        }
        if (i <= 2000 || i == 2912 || i == 2911 || i == 9000) {
            return aVar.a(i, false);
        }
        return false;
    }

    public com.baidu.mapsdkplatform.comapi.map.w g(int i) {
        java.lang.String strE;
        com.baidu.mapsdkplatform.comjni.map.basemap.a aVar = this.b;
        if (aVar != null && i >= 0 && (strE = aVar.e(i)) != null && !strE.equals("")) {
            com.baidu.mapsdkplatform.comapi.map.w wVar = new com.baidu.mapsdkplatform.comapi.map.w();
            com.baidu.mapsdkplatform.comapi.map.v vVar = new com.baidu.mapsdkplatform.comapi.map.v();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(strE);
                if (jSONObject.length() == 0) {
                    return null;
                }
                int iOptInt = jSONObject.optInt("id");
                if (iOptInt > 2000 && iOptInt != 2912 && iOptInt != 2911 && iOptInt != 9000) {
                    return null;
                }
                vVar.a = iOptInt;
                vVar.b = jSONObject.optString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                vVar.c = jSONObject.optString("pinyin");
                vVar.d = jSONObject.optString("headchar");
                vVar.h = jSONObject.optInt("mapoldsize");
                vVar.i = jSONObject.optInt("ratio");
                vVar.l = jSONObject.optInt("status");
                vVar.g = new com.baidu.mapapi.model.inner.GeoPoint(jSONObject.optInt("y"), jSONObject.optInt("x"));
                boolean z = true;
                if (jSONObject.optInt("up") != 1) {
                    z = false;
                }
                vVar.j = z;
                vVar.e = jSONObject.optInt("lev");
                if (vVar.j) {
                    vVar.k = jSONObject.optInt("mapsize");
                } else {
                    vVar.k = 0;
                }
                vVar.f = jSONObject.optInt("ver");
                wVar.a(vVar);
                return wVar;
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
