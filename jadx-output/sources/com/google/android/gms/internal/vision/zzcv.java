package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcv {
    public static java.lang.String zzk(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str) {
        return com.google.android.gms.internal.vision.zzcp.zzk(str);
    }

    public static java.lang.String zza(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.String str, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object... objArr) {
        int iIndexOf;
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            objArr[i2] = zzc(objArr[i2]);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((java.lang.CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static java.lang.String zzc(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        try {
            return java.lang.String.valueOf(obj);
        } catch (java.lang.Exception e) {
            java.lang.String name = obj.getClass().getName();
            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 1 + java.lang.String.valueOf(hexString).length());
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            java.lang.String string = sb.toString();
            java.util.logging.Logger logger = java.util.logging.Logger.getLogger("com.google.common.base.Strings");
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.String strValueOf = java.lang.String.valueOf(string);
            logger.logp(level, "com.google.common.base.Strings", "lenientToString", strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new java.lang.String("Exception during lenientFormat for "), (java.lang.Throwable) e);
            java.lang.String name2 = e.getClass().getName();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 9 + java.lang.String.valueOf(name2).length());
            sb2.append("<");
            sb2.append(string);
            sb2.append(" threw ");
            sb2.append(name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}
