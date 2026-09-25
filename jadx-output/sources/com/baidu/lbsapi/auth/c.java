package com.baidu.lbsapi.auth;

/* JADX INFO: loaded from: classes.dex */
class c {
    private android.content.Context a;
    private java.util.HashMap<java.lang.String, java.lang.String> b = null;
    private com.baidu.lbsapi.auth.c.a<java.lang.String> c = null;

    interface a<Result> {
        void a(Result result);
    }

    protected c(android.content.Context context) {
        this.a = context;
    }

    private java.util.HashMap<java.lang.String, java.lang.String> a(java.util.HashMap<java.lang.String, java.lang.String> map) {
        java.util.HashMap<java.lang.String, java.lang.String> map2 = new java.util.HashMap<>();
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String string = it.next().toString();
            map2.put(string, map.get(string));
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
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
        com.baidu.lbsapi.auth.c.a<java.lang.String> aVar = this.c;
        if (aVar != null) {
            aVar.a(jSONObject.toString());
        }
    }

    protected void a(java.util.HashMap<java.lang.String, java.lang.String> map, com.baidu.lbsapi.auth.c.a<java.lang.String> aVar) {
        this.b = a(map);
        this.c = aVar;
        new java.lang.Thread(new com.baidu.lbsapi.auth.d(this)).start();
    }
}
