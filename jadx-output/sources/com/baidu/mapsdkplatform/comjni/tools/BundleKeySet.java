package com.baidu.mapsdkplatform.comjni.tools;

/* JADX INFO: loaded from: classes.dex */
public class BundleKeySet {
    public java.lang.String[] getBundleKeys(android.os.Bundle bundle) {
        java.lang.String[] strArr = null;
        if (bundle == null) {
            return null;
        }
        if (!bundle.isEmpty()) {
            strArr = new java.lang.String[bundle.size()];
            int i = 0;
            java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                strArr[i] = it.next().toString();
                i++;
            }
        }
        return strArr;
    }
}
