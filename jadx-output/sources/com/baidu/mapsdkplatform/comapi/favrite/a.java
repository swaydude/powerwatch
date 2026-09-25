package com.baidu.mapsdkplatform.comapi.favrite;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static com.baidu.mapsdkplatform.comapi.favrite.a b;
    private com.baidu.mapsdkplatform.comjni.map.favorite.a a = null;
    private boolean c = false;
    private boolean d = false;
    private java.util.Vector<java.lang.String> e = null;
    private java.util.Vector<java.lang.String> f = null;
    private boolean g = false;
    private com.baidu.mapsdkplatform.comapi.favrite.a.c h;
    private com.baidu.mapsdkplatform.comapi.favrite.a.b i;

    /* JADX INFO: renamed from: com.baidu.mapsdkplatform.comapi.favrite.a$a, reason: collision with other inner class name */
    class C0011a implements java.util.Comparator<java.lang.String> {
        C0011a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.lang.String str, java.lang.String str2) {
            return str2.compareTo(str);
        }
    }

    private class b {
        private long b;
        private long c;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.b = java.lang.System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.c = java.lang.System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return this.c - this.b > 1000;
        }
    }

    private class c {
        private java.lang.String b;
        private long c;
        private long d;

        private c() {
            this.c = 5000L;
            this.d = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.lang.String a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(java.lang.String str) {
            this.b = str;
            this.d = java.lang.System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return android.text.TextUtils.isEmpty(this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return true;
        }
    }

    private a() {
        this.h = new com.baidu.mapsdkplatform.comapi.favrite.a.c();
        this.i = new com.baidu.mapsdkplatform.comapi.favrite.a.b();
    }

    public static com.baidu.mapsdkplatform.comapi.favrite.a a() {
        if (b == null) {
            synchronized (com.baidu.mapsdkplatform.comapi.favrite.a.class) {
                if (b == null) {
                    com.baidu.mapsdkplatform.comapi.favrite.a aVar = new com.baidu.mapsdkplatform.comapi.favrite.a();
                    b = aVar;
                    aVar.h();
                }
            }
        }
        return b;
    }

    public static boolean g() {
        com.baidu.mapsdkplatform.comjni.map.favorite.a aVar;
        com.baidu.mapsdkplatform.comapi.favrite.a aVar2 = b;
        return (aVar2 == null || (aVar = aVar2.a) == null || !aVar.d()) ? false : true;
    }

    private boolean h() {
        if (this.a == null) {
            com.baidu.mapsdkplatform.comjni.map.favorite.a aVar = new com.baidu.mapsdkplatform.comjni.map.favorite.a();
            this.a = aVar;
            if (aVar.a() == 0) {
                this.a = null;
                return false;
            }
            j();
            i();
        }
        return true;
    }

    private boolean i() {
        if (this.a == null) {
            return false;
        }
        java.lang.String str = com.baidu.mapapi.common.SysOSUtil.getModuleFileName() + "/";
        this.a.a(1);
        return this.a.a(str, "fav_poi", "fifo", 10, com.baidu.mapapi.UIMsg.d_ResultType.VERSION_CHECK, -1);
    }

    private void j() {
        this.c = false;
        this.d = false;
    }

    public synchronized int a(java.lang.String str, com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoi) {
        if (this.a == null) {
            return 0;
        }
        if (str != null && !str.equals("") && favSyncPoi != null) {
            j();
            java.util.ArrayList<java.lang.String> arrayListE = e();
            if ((arrayListE != null ? arrayListE.size() : 0) + 1 > 500) {
                return -2;
            }
            if (arrayListE != null && arrayListE.size() > 0) {
                java.util.Iterator<java.lang.String> it = arrayListE.iterator();
                while (it.hasNext()) {
                    com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoiB = b(it.next());
                    if (favSyncPoiB != null && str.equals(favSyncPoiB.b)) {
                        return -1;
                    }
                }
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                favSyncPoi.b = str;
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                java.lang.String str2 = strValueOf + io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR + favSyncPoi.hashCode();
                favSyncPoi.h = strValueOf;
                favSyncPoi.a = str2;
                jSONObject.put("bdetail", favSyncPoi.i);
                jSONObject.put("uspoiname", favSyncPoi.b);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("x", favSyncPoi.c.getmPtx());
                jSONObject2.put("y", favSyncPoi.c.getmPty());
                jSONObject.put("pt", jSONObject2);
                jSONObject.put("ncityid", favSyncPoi.e);
                jSONObject.put("npoitype", favSyncPoi.g);
                jSONObject.put("uspoiuid", favSyncPoi.f);
                jSONObject.put("addr", favSyncPoi.d);
                jSONObject.put("addtimesec", favSyncPoi.h);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("Fav_Sync", jSONObject);
                jSONObject3.put("Fav_Content", favSyncPoi.j);
                if (!this.a.a(str2, jSONObject3.toString())) {
                    g();
                    return 0;
                }
                j();
                g();
                return 1;
            } catch (org.json.JSONException unused) {
                g();
                return 0;
            } catch (java.lang.Throwable th) {
                g();
                throw th;
            }
        }
        return -1;
    }

    public synchronized boolean a(java.lang.String str) {
        if (this.a == null) {
            return false;
        }
        if (str != null && !str.equals("")) {
            if (!c(str)) {
                return false;
            }
            j();
            return this.a.a(str);
        }
        return false;
    }

    public com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi b(java.lang.String str) {
        if (this.a != null && str != null && !str.equals("")) {
            try {
                if (!c(str)) {
                    return null;
                }
                com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoi = new com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi();
                java.lang.String strB = this.a.b(str);
                if (strB != null && !strB.equals("")) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(strB);
                    org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("Fav_Sync");
                    java.lang.String strOptString = jSONObject.optString("Fav_Content");
                    favSyncPoi.b = jSONObjectOptJSONObject.optString("uspoiname");
                    org.json.JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("pt");
                    favSyncPoi.c = new com.baidu.mapapi.model.inner.Point(jSONObjectOptJSONObject2.optInt("x"), jSONObjectOptJSONObject2.optInt("y"));
                    favSyncPoi.e = jSONObjectOptJSONObject.optString("ncityid");
                    favSyncPoi.f = jSONObjectOptJSONObject.optString("uspoiuid");
                    favSyncPoi.g = jSONObjectOptJSONObject.optInt("npoitype");
                    favSyncPoi.d = jSONObjectOptJSONObject.optString("addr");
                    favSyncPoi.h = jSONObjectOptJSONObject.optString("addtimesec");
                    favSyncPoi.i = jSONObjectOptJSONObject.optBoolean("bdetail");
                    favSyncPoi.j = strOptString;
                    favSyncPoi.a = str;
                    return favSyncPoi;
                }
                return null;
            } catch (java.lang.NullPointerException e) {
                e.printStackTrace();
            } catch (org.json.JSONException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public void b() {
        com.baidu.mapsdkplatform.comapi.favrite.a aVar = b;
        if (aVar != null) {
            com.baidu.mapsdkplatform.comjni.map.favorite.a aVar2 = aVar.a;
            if (aVar2 != null) {
                aVar2.b();
                b.a = null;
            }
            b = null;
        }
    }

    public synchronized boolean b(java.lang.String str, com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi favSyncPoi) {
        boolean z = false;
        if (this.a != null && str != null && !str.equals("") && favSyncPoi != null) {
            if (!c(str)) {
                return false;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("uspoiname", favSyncPoi.b);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("x", favSyncPoi.c.getmPtx());
                jSONObject2.put("y", favSyncPoi.c.getmPty());
                jSONObject.put("pt", jSONObject2);
                jSONObject.put("ncityid", favSyncPoi.e);
                jSONObject.put("npoitype", favSyncPoi.g);
                jSONObject.put("uspoiuid", favSyncPoi.f);
                jSONObject.put("addr", favSyncPoi.d);
                favSyncPoi.h = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                jSONObject.put("addtimesec", favSyncPoi.h);
                jSONObject.put("bdetail", false);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("Fav_Sync", jSONObject);
                jSONObject3.put("Fav_Content", favSyncPoi.j);
                j();
                com.baidu.mapsdkplatform.comjni.map.favorite.a aVar = this.a;
                if (aVar != null && aVar.b(str, jSONObject3.toString())) {
                    z = true;
                }
                return z;
            } catch (org.json.JSONException unused) {
                return false;
            }
        }
        return false;
    }

    public synchronized boolean c() {
        if (this.a == null) {
            return false;
        }
        j();
        boolean zC = this.a.c();
        g();
        return zC;
    }

    public boolean c(java.lang.String str) {
        return (this.a == null || str == null || str.equals("") || !this.a.c(str)) ? false : true;
    }

    public java.util.ArrayList<java.lang.String> d() {
        java.lang.String strB;
        if (this.a == null) {
            return null;
        }
        if (this.d && this.f != null) {
            return new java.util.ArrayList<>(this.f);
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            this.a.a(bundle);
            java.lang.String[] stringArray = bundle.getStringArray("rstString");
            if (stringArray != null) {
                java.util.Vector<java.lang.String> vector = this.f;
                if (vector == null) {
                    this.f = new java.util.Vector<>();
                } else {
                    vector.clear();
                }
                for (int i = 0; i < stringArray.length; i++) {
                    if (!stringArray[i].equals("data_version") && (strB = this.a.b(stringArray[i])) != null && !strB.equals("")) {
                        this.f.add(stringArray[i]);
                    }
                }
                if (this.f.size() > 0) {
                    try {
                        java.util.Collections.sort(this.f, new com.baidu.mapsdkplatform.comapi.favrite.a.C0011a());
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                    this.d = true;
                }
            } else {
                java.util.Vector<java.lang.String> vector2 = this.f;
                if (vector2 != null) {
                    vector2.clear();
                    this.f = null;
                }
            }
            java.util.Vector<java.lang.String> vector3 = this.f;
            if (vector3 != null && !vector3.isEmpty()) {
                return new java.util.ArrayList<>(this.f);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.util.ArrayList<java.lang.String> e() {
        if (this.a == null) {
            return null;
        }
        if (this.c && this.e != null) {
            return new java.util.ArrayList<>(this.e);
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            this.a.a(bundle);
            java.lang.String[] stringArray = bundle.getStringArray("rstString");
            if (stringArray != null) {
                java.util.Vector<java.lang.String> vector = this.e;
                if (vector == null) {
                    this.e = new java.util.Vector<>();
                } else {
                    vector.clear();
                }
                for (java.lang.String str : stringArray) {
                    if (!str.equals("data_version")) {
                        this.e.add(str);
                    }
                }
                if (this.e.size() > 0) {
                    try {
                        java.util.Collections.sort(this.e, new com.baidu.mapsdkplatform.comapi.favrite.a.C0011a());
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                    this.c = true;
                }
            } else {
                java.util.Vector<java.lang.String> vector2 = this.e;
                if (vector2 != null) {
                    vector2.clear();
                    this.e = null;
                }
            }
            java.util.Vector<java.lang.String> vector3 = this.e;
            if (vector3 == null || vector3.size() == 0) {
                return null;
            }
            return new java.util.ArrayList<>(this.e);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String f() {
        java.lang.String strB;
        if (this.i.c() && !this.h.c() && !this.h.b()) {
            return this.h.a();
        }
        this.i.a();
        if (this.a == null) {
            return null;
        }
        java.util.ArrayList<java.lang.String> arrayListD = d();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (arrayListD != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                int i = 0;
                for (java.lang.String str : arrayListD) {
                    if (str != null && !str.equals("data_version") && (strB = this.a.b(str)) != null && !strB.equals("")) {
                        org.json.JSONObject jSONObjectOptJSONObject = new org.json.JSONObject(strB).optJSONObject("Fav_Sync");
                        jSONObjectOptJSONObject.put("key", str);
                        jSONArray.put(i, jSONObjectOptJSONObject);
                        i++;
                    }
                }
                if (i > 0) {
                    jSONObject.put("favcontents", jSONArray);
                    jSONObject.put("favpoinum", i);
                }
            } catch (org.json.JSONException unused) {
                return null;
            }
        }
        this.i.b();
        this.h.a(jSONObject.toString());
        return this.h.a();
    }
}
