package com.baidu.mapapi.utils.poi;

/* JADX INFO: loaded from: classes.dex */
final class a implements com.baidu.platform.comapi.pano.a.InterfaceC0014a<com.baidu.platform.comapi.pano.c> {
    final /* synthetic */ android.content.Context a;

    a(android.content.Context context) {
        this.a = context;
    }

    @Override // com.baidu.platform.comapi.pano.a.InterfaceC0014a
    public void a(com.baidu.mapapi.http.HttpClient.HttpStateError httpStateError) {
        java.lang.String str;
        int i = com.baidu.mapapi.utils.poi.b.b[httpStateError.ordinal()];
        if (i == 1) {
            str = "current network is not available";
        } else if (i != 2) {
            return;
        } else {
            str = "network inner error, please check network";
        }
        android.util.Log.d("baidumapsdk", str);
    }

    @Override // com.baidu.platform.comapi.pano.a.InterfaceC0014a
    public void a(com.baidu.platform.comapi.pano.c cVar) {
        java.lang.String str;
        if (cVar == null) {
            android.util.Log.d("baidumapsdk", "pano info is null");
            return;
        }
        int i = com.baidu.mapapi.utils.poi.b.a[cVar.a().ordinal()];
        if (i == 1) {
            str = "pano uid is error, please check param poi uid";
        } else if (i == 2) {
            str = "pano id not found for this poi point";
        } else if (i == 3) {
            str = "please check ak for permission";
        } else {
            if (i != 4) {
                return;
            }
            if (cVar.c() == 1) {
                try {
                    com.baidu.mapapi.utils.poi.BaiduMapPoiSearch.b(cVar.b(), this.a);
                    return;
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            str = "this point do not support for pano show";
        }
        android.util.Log.d("baidumapsdk", str);
    }
}
