package com.baidu.mapsdkplatform.comapi.map;

/* JADX INFO: loaded from: classes.dex */
class y {
    private static final java.lang.String a = "y";
    private com.baidu.mapsdkplatform.comapi.map.x b;

    y() {
    }

    void a(android.os.Message message) {
        if (message.what != 65289) {
            return;
        }
        int i = message.arg1;
        if (i != 12 && i != 101 && i != 102) {
            switch (i) {
            }
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.x xVar = this.b;
        if (xVar != null) {
            xVar.a(message.arg1, message.arg2);
        }
    }

    void a(com.baidu.mapsdkplatform.comapi.map.x xVar) {
        this.b = xVar;
    }

    void b(com.baidu.mapsdkplatform.comapi.map.x xVar) {
        this.b = null;
    }
}
