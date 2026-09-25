package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class e {
    private android.content.Context a;
    private java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> b = null;
    private com.baidu.lbsapi.auth.e.a<java.lang.String> c = null;

    interface a<Result> {
        void a(Result result);
    }

    protected e(android.content.Context context) {
        this.a = context;
    }

    private java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> a(java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (strArr == null || strArr.length <= 0) {
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.Iterator<java.lang.String> it = map.keySet().iterator();
            while (it.hasNext()) {
                java.lang.String string = it.next().toString();
                map2.put(string, map.get(string));
            }
            arrayList.add(map2);
        } else {
            for (java.lang.String str : strArr) {
                java.util.HashMap map3 = new java.util.HashMap();
                java.util.Iterator<java.lang.String> it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    java.lang.String string2 = it2.next().toString();
                    map3.put(string2, map.get(string2));
                }
                map3.put("mcode", str);
                arrayList.add(map3);
            }
        }
        return arrayList;
    }

    private void a(java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (str == null) {
            str = "";
        }
        try {
            jSONObject = new org.json.JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
        } catch (org.json.JSONException unused) {
            jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("status", -1);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
        }
        com.baidu.lbsapi.auth.e.a<java.lang.String> aVar = this.c;
        if (aVar != null) {
            aVar.a(jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.util.List<java.util.HashMap<java.lang.String, java.lang.String>> list) throws java.lang.Throwable {
        int i;
        com.baidu.lbsapi.auth.a.a("syncConnect start Thread id = " + java.lang.String.valueOf(java.lang.Thread.currentThread().getId()));
        if (list == null || list.size() == 0) {
            com.baidu.lbsapi.auth.a.c("syncConnect failed,params list is null or size is 0");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            com.baidu.lbsapi.auth.a.a("syncConnect resuest " + i2 + "  start!!!");
            java.util.HashMap<java.lang.String, java.lang.String> map = list.get(i2);
            com.baidu.lbsapi.auth.g gVar = new com.baidu.lbsapi.auth.g(this.a);
            if (gVar.a()) {
                java.lang.String strA = gVar.a(map);
                if (strA == null) {
                    strA = "";
                }
                com.baidu.lbsapi.auth.a.a("syncConnect resuest " + i2 + "  result:" + strA);
                arrayList.add(strA);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(strA);
                    if (jSONObject.has("status") && jSONObject.getInt("status") == 0) {
                        com.baidu.lbsapi.auth.a.a("auth end and break");
                        a(strA);
                        return;
                    }
                } catch (org.json.JSONException unused) {
                    com.baidu.lbsapi.auth.a.a("continue-------------------------------");
                }
            } else {
                com.baidu.lbsapi.auth.a.a("Current network is not available.");
                arrayList.add(com.baidu.lbsapi.auth.ErrorMessage.a("Current network is not available."));
            }
            com.baidu.lbsapi.auth.a.a("syncConnect end");
            i2++;
        }
        com.baidu.lbsapi.auth.a.a("--iiiiii:" + i2 + "<><>paramList.size():" + list.size() + "<><>authResults.size():" + arrayList.size());
        if (list.size() <= 0 || i2 != list.size() || arrayList.size() <= 0 || i2 != arrayList.size() || (i = i2 - 1) <= 0) {
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject((java.lang.String) arrayList.get(i));
            if (!jSONObject2.has("status") || jSONObject2.getInt("status") == 0) {
                return;
            }
            com.baidu.lbsapi.auth.a.a("i-1 result is not 0,return first result");
            a((java.lang.String) arrayList.get(0));
        } catch (org.json.JSONException e) {
            a(com.baidu.lbsapi.auth.ErrorMessage.a("JSONException:" + e.getMessage()));
        }
    }

    protected void a(java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String[] strArr, com.baidu.lbsapi.auth.e.a<java.lang.String> aVar) {
        this.b = a(map, strArr);
        this.c = aVar;
        new java.lang.Thread(new com.baidu.lbsapi.auth.f(this)).start();
    }
}
