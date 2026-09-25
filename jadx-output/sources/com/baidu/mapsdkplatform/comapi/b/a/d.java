package com.baidu.mapsdkplatform.comapi.b.a;

/* JADX INFO: loaded from: classes.dex */
class d implements java.lang.Runnable {
    final /* synthetic */ com.baidu.mapsdkplatform.comapi.b.a.c a;

    d(com.baidu.mapsdkplatform.comapi.b.a.c cVar) {
        this.a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File[] fileArrListFiles;
        if (com.baidu.mapsdkplatform.comapi.util.g.a().b() == null) {
            return;
        }
        java.io.File file = new java.io.File(com.baidu.mapsdkplatform.comapi.b.a.c.a);
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        try {
            java.util.Arrays.sort(fileArrListFiles, new com.baidu.mapsdkplatform.comapi.b.a.e());
        } catch (java.lang.Exception unused) {
        }
        int length = fileArrListFiles.length;
        if (length > 10) {
            length = 10;
        }
        for (int i = 0; i < length; i++) {
            java.io.File file2 = fileArrListFiles[i];
            if (!file2.isDirectory() && file2.exists() && file2.isFile() && file2.getName().contains(com.baidu.mapsdkplatform.comapi.b.a.c.b) && (file2.getName().endsWith(".txt") || (file2.getName().endsWith(".zip") && file2.exists()))) {
                this.a.a(file2);
            }
        }
        if (fileArrListFiles.length > 10) {
            this.a.a(fileArrListFiles);
        }
    }
}
