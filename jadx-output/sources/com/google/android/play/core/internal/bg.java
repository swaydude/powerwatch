package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class bg {
    private static final com.google.android.play.core.splitcompat.a a = new com.google.android.play.core.splitcompat.a("PhoneskyVerificationUtils");

    public static boolean a(android.content.Context context) {
        try {
            android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                a.c("Phonesky package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
                return false;
            }
            for (android.content.pm.Signature signature : signatureArr) {
                java.lang.String strA = com.google.android.play.core.internal.ag.a(signature.toByteArray());
                if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA) || "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                    return true;
                }
            }
            return false;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
    }
}
