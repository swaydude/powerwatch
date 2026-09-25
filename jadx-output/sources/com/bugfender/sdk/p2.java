package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class p2 implements com.bugfender.sdk.x<java.lang.String> {
    private static final java.lang.String b = ".copy";
    private static final java.lang.String c = "first.time.boolean.key";
    private static final java.lang.String d = "resend.keys.boolean.key";
    private final android.content.SharedPreferences a;

    public p2(android.content.Context context) {
        this.a = context.getSharedPreferences("bugfender.device.key", 0);
    }

    private android.content.SharedPreferences.Editor a() {
        return this.a.edit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> boolean a(java.lang.String str, T t) {
        try {
            java.lang.String strC = c(str);
            if (this.a.contains(strC)) {
                if (t instanceof java.lang.Boolean) {
                    java.lang.Boolean bool = (java.lang.Boolean) t;
                    return bool.equals(java.lang.Boolean.valueOf(this.a.getBoolean(strC, bool.booleanValue())));
                }
                if (t instanceof java.lang.Integer) {
                    java.lang.Integer num = (java.lang.Integer) t;
                    return num.equals(java.lang.Integer.valueOf(this.a.getInt(strC, num.intValue())));
                }
                if (t instanceof java.lang.Float) {
                    java.lang.Float f = (java.lang.Float) t;
                    return f.equals(java.lang.Float.valueOf(this.a.getFloat(strC, f.floatValue())));
                }
                if (!(t instanceof java.lang.String)) {
                    throw new java.lang.IllegalArgumentException("value type is not supported. Use Boolean, Integer, Float or String");
                }
                java.lang.String str2 = (java.lang.String) t;
                return str2.equals(this.a.getString(strC, str2));
            }
        } catch (java.lang.ClassCastException unused) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> boolean a(java.lang.String str, T t, android.content.SharedPreferences.Editor editor) {
        if (t instanceof java.lang.Boolean) {
            java.lang.Boolean bool = (java.lang.Boolean) t;
            editor.putBoolean(str, bool.booleanValue());
            editor.putBoolean(c(str), bool.booleanValue());
        } else if (t instanceof java.lang.Integer) {
            java.lang.Integer num = (java.lang.Integer) t;
            editor.putInt(str, num.intValue());
            editor.putInt(c(str), num.intValue());
        } else if (t instanceof java.lang.Float) {
            java.lang.Float f = (java.lang.Float) t;
            editor.putFloat(str, f.floatValue());
            editor.putFloat(c(str), f.floatValue());
        } else {
            if (!(t instanceof java.lang.String)) {
                throw new java.lang.IllegalArgumentException("value type is not supported. Use Boolean, Integer, Float or String");
            }
            java.lang.String str2 = (java.lang.String) t;
            editor.putString(str, str2);
            editor.putString(c(str), str2);
        }
        return editor.commit();
    }

    private boolean b() {
        boolean z = this.a.getBoolean(d, true);
        if (z) {
            android.content.SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putBoolean(d, false);
            editorEdit.apply();
        }
        return z;
    }

    private boolean b(java.lang.String str) {
        return str.contains(b);
    }

    private <T> boolean b(java.lang.String str, T t) {
        if (a(str, t)) {
            return true;
        }
        return a(str, t, a());
    }

    private java.lang.String c(java.lang.String str) {
        return str + b;
    }

    private boolean d(java.lang.String str) {
        return str.equalsIgnoreCase(c) || str.equalsIgnoreCase(d);
    }

    @Override // com.bugfender.sdk.x
    public java.util.Map<java.lang.String, ?> a(boolean z) {
        java.util.HashMap map = new java.util.HashMap();
        java.util.Map<java.lang.String, ?> all = this.a.getAll();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        for (java.lang.String str : all.keySet()) {
            java.lang.Object obj = all.get(str);
            if (d(str)) {
                map2.put(str, obj);
            } else if (b(str)) {
                map3.put(str.replace(b, ""), obj);
            } else {
                map.put(str, obj);
            }
        }
        if (z || b()) {
            map.putAll(map3);
        }
        return map;
    }

    @Override // com.bugfender.sdk.x
    public boolean a(java.lang.String str) {
        android.content.SharedPreferences.Editor editorA = a();
        editorA.remove(str);
        editorA.remove(c(str));
        return editorA.commit();
    }

    @Override // com.bugfender.sdk.x
    public boolean a(java.lang.String str, java.lang.Boolean bool) {
        return b(str, bool);
    }

    @Override // com.bugfender.sdk.x
    public boolean a(java.lang.String str, java.lang.Float f) {
        return b(str, f);
    }

    @Override // com.bugfender.sdk.x
    public boolean a(java.lang.String str, java.lang.Integer num) {
        return b(str, num);
    }

    @Override // com.bugfender.sdk.x
    public boolean a(java.lang.String str, java.lang.String str2) {
        return b(str, str2);
    }

    @Override // com.bugfender.sdk.x
    public java.util.Map<java.lang.String, ?> getAll() {
        return a(false);
    }

    @Override // com.bugfender.sdk.x
    public boolean remove(java.lang.String str) {
        android.content.SharedPreferences.Editor editorA = a();
        editorA.remove(str);
        return editorA.commit();
    }
}
