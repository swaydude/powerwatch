package com.baidu.mapsdkvi;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public java.lang.String a;
    public int b;
    public int c;

    public c(android.net.NetworkInfo networkInfo) {
        this.a = networkInfo.getTypeName();
        this.b = networkInfo.getType();
        int i = com.baidu.mapsdkvi.d.a[networkInfo.getState().ordinal()];
        if (i == 1) {
            this.c = 2;
        } else if (i != 2) {
            this.c = 0;
        } else {
            this.c = 1;
        }
    }
}
