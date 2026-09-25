package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class Sha1FileIdStrategy implements com.crashlytics.android.core.BinaryImagesConverter.FileIdStrategy {
    Sha1FileIdStrategy() {
    }

    @Override // com.crashlytics.android.core.BinaryImagesConverter.FileIdStrategy
    public java.lang.String createId(java.io.File file) throws java.io.IOException {
        return getFileSHA(file.getPath());
    }

    private static java.lang.String getFileSHA(java.lang.String str) throws java.lang.Throwable {
        java.io.BufferedInputStream bufferedInputStream = null;
        try {
            java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(str));
            try {
                java.lang.String strSha1 = io.fabric.sdk.android.services.common.CommonUtils.sha1(bufferedInputStream2);
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(bufferedInputStream2);
                return strSha1;
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(bufferedInputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
