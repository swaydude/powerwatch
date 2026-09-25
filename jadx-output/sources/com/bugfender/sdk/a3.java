package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class a3 {
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("(.)/(.*?)\\s*\\(([\\d\\s]+)\\):\\s(.*)");
    private final com.bugfender.sdk.b3 a;
    private final java.lang.String b;
    private final java.lang.String c;

    public a3(com.bugfender.sdk.b3 b3Var, java.lang.String str, java.lang.String str2) {
        this.a = b3Var;
        this.b = str;
        this.c = str2;
    }

    public static com.bugfender.sdk.a3 a(java.lang.String str, int i) throws com.bugfender.sdk.s0 {
        java.util.regex.Matcher matcher = d.matcher(str);
        if (!matcher.find()) {
            throw new com.bugfender.sdk.s0("The trace is not valid");
        }
        if (matcher.groupCount() < 4) {
            throw new com.bugfender.sdk.s0("The trace is not valid");
        }
        java.lang.String strGroup = matcher.group(1);
        java.lang.String strGroup2 = matcher.group(2);
        java.lang.String strGroup3 = matcher.group(3);
        java.lang.String strGroup4 = matcher.group(4);
        try {
            if (java.lang.Integer.valueOf(!android.text.TextUtils.isEmpty(strGroup3) ? strGroup3.trim() : "").intValue() == i) {
                return new com.bugfender.sdk.a3(com.bugfender.sdk.b3.a(strGroup.charAt(0)), strGroup2, strGroup4);
            }
            throw new com.bugfender.sdk.s0("The trace is not valid");
        } catch (java.lang.NumberFormatException unused) {
            throw new com.bugfender.sdk.s0("The trace is not valid");
        }
    }

    public com.bugfender.sdk.b3 a() {
        return this.a;
    }

    public java.lang.String b() {
        return this.c;
    }

    public java.lang.String c() {
        return this.b;
    }
}
