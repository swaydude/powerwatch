package com.baidu.platform.comjni.map.cloud;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.baidu.platform.comjni.map.cloud.ICloudCenter {
    private int b;
    private com.baidu.mapapi.cloud.CloudListener c;
    private java.lang.String h;
    protected final java.util.concurrent.locks.Lock a = new java.util.concurrent.locks.ReentrantLock();
    private boolean d = true;
    private boolean e = true;
    private com.baidu.mapapi.http.AsyncHttpClient f = new com.baidu.mapapi.http.AsyncHttpClient();
    private android.os.Handler g = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        switch (this.b) {
            case 10001:
                com.baidu.mapapi.cloud.CloudSearchResult cloudSearchResult = new com.baidu.mapapi.cloud.CloudSearchResult();
                this.a.lock();
                try {
                    this.c.onGetSearchResult(cloudSearchResult, i);
                } finally {
                    this.a.unlock();
                }
                break;
            case 10002:
                com.baidu.mapapi.cloud.DetailSearchResult detailSearchResult = new com.baidu.mapapi.cloud.DetailSearchResult();
                this.a.lock();
                try {
                    this.c.onGetDetailSearchResult(detailSearchResult, i);
                } finally {
                    this.a.unlock();
                }
                break;
            case 10003:
                com.baidu.mapapi.cloud.CloudRgcResult cloudRgcResult = new com.baidu.mapapi.cloud.CloudRgcResult();
                this.a.lock();
                try {
                    this.c.onGetCloudRgcResult(cloudRgcResult, i);
                } finally {
                    this.a.unlock();
                }
                break;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    private boolean d(java.lang.String str) {
        if (str == null) {
            return false;
        }
        this.f.get(str, new com.baidu.platform.comjni.map.cloud.b(this));
        return true;
    }

    private java.lang.String e(java.lang.String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        java.lang.String authToken = com.baidu.mapapi.http.HttpClient.getAuthToken();
        if (authToken == null) {
            a(-4);
            return null;
        }
        if (this.d) {
            str = str + "&token=" + com.baidu.mapsdkplatform.comjni.util.AppMD5.encodeUrlParamsValue(authToken);
        }
        java.lang.String str2 = str + com.baidu.mapapi.http.HttpClient.getPhoneInfo();
        if (!this.e) {
            return str2;
        }
        return str2 + "&sign=" + com.baidu.mapsdkplatform.comjni.util.AppMD5.getSignMD5String(android.net.Uri.parse(str2).buildUpon().build().getEncodedQuery());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            switch (this.b) {
                case 10001:
                    com.baidu.mapapi.cloud.CloudSearchResult cloudSearchResult = new com.baidu.mapapi.cloud.CloudSearchResult();
                    try {
                        cloudSearchResult.parseFromJSON(jSONObject);
                    } catch (org.json.JSONException e) {
                        e.printStackTrace();
                    }
                    this.a.lock();
                    try {
                        this.c.onGetSearchResult(cloudSearchResult, cloudSearchResult.status);
                    } finally {
                        this.a.unlock();
                    }
                    break;
                case 10002:
                    com.baidu.mapapi.cloud.DetailSearchResult detailSearchResult = new com.baidu.mapapi.cloud.DetailSearchResult();
                    try {
                        detailSearchResult.parseFromJSON(jSONObject);
                    } catch (org.json.JSONException e2) {
                        e2.printStackTrace();
                    }
                    this.a.lock();
                    try {
                        this.c.onGetDetailSearchResult(detailSearchResult, detailSearchResult.status);
                    } finally {
                        this.a.unlock();
                    }
                    break;
                case 10003:
                    com.baidu.mapapi.cloud.CloudRgcResult cloudRgcResult = new com.baidu.mapapi.cloud.CloudRgcResult();
                    try {
                        cloudRgcResult.parseFromJSON(jSONObject);
                    } catch (org.json.JSONException e3) {
                        e3.printStackTrace();
                    }
                    this.a.lock();
                    try {
                        this.c.onGetCloudRgcResult(cloudRgcResult, cloudRgcResult.status);
                    } finally {
                        this.a.unlock();
                    }
                    break;
                default:
                    return;
            }
        } catch (org.json.JSONException e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.baidu.platform.comjni.map.cloud.ICloudCenter
    public void a(com.baidu.mapapi.cloud.CloudListener cloudListener) {
        this.a.lock();
        this.c = cloudListener;
        this.a.unlock();
    }

    @Override // com.baidu.platform.comjni.map.cloud.ICloudCenter
    public boolean a(java.lang.String str) {
        this.b = 10001;
        this.d = false;
        return d(e(str));
    }

    @Override // com.baidu.platform.comjni.map.cloud.ICloudCenter
    public boolean b(java.lang.String str) {
        this.b = 10002;
        this.d = false;
        return d(e(str));
    }

    @Override // com.baidu.platform.comjni.map.cloud.ICloudCenter
    public boolean c(java.lang.String str) {
        this.b = 10003;
        this.d = true;
        return d(e(str));
    }
}
