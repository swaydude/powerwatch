package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class c1 {
    public static android.widget.CompoundButton.OnCheckedChangeListener a(android.view.View view) {
        java.lang.String str;
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.widget.CompoundButton").getDeclaredField("mOnCheckedChangeListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return (android.widget.CompoundButton.OnCheckedChangeListener) declaredField.get(view);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            str = "Class Not Found.";
            com.bugfender.sdk.d1.b("Reflection", str);
        } catch (java.lang.IllegalAccessException unused2) {
            str = "Illegal Access.";
            com.bugfender.sdk.d1.b("Reflection", str);
        } catch (java.lang.NoSuchFieldException unused3) {
            str = "No Such Field.";
            com.bugfender.sdk.d1.b("Reflection", str);
        }
        return null;
    }

    public static android.view.View.OnClickListener b(android.view.View view) {
        java.lang.String str;
        java.lang.Object obj;
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } else {
                obj = null;
            }
            java.lang.reflect.Field declaredField2 = java.lang.Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (declaredField2 == null || obj == null) {
                return null;
            }
            return (android.view.View.OnClickListener) declaredField2.get(obj);
        } catch (java.lang.ClassNotFoundException unused) {
            str = "Class Not Found.";
            com.bugfender.sdk.d1.b("Reflection", str);
            return null;
        } catch (java.lang.IllegalAccessException unused2) {
            str = "Illegal Access.";
            com.bugfender.sdk.d1.b("Reflection", str);
            return null;
        } catch (java.lang.NoSuchFieldException unused3) {
            str = "No Such Field.";
            com.bugfender.sdk.d1.b("Reflection", str);
            return null;
        }
    }

    public static android.widget.AdapterView.OnItemSelectedListener c(android.view.View view) {
        java.lang.String str;
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.widget.AdapterView").getDeclaredField("mOnItemSelectedListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return (android.widget.AdapterView.OnItemSelectedListener) declaredField.get(view);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            str = "Class Not Found.";
            com.bugfender.sdk.d1.b("Reflection", str);
        } catch (java.lang.IllegalAccessException unused2) {
            str = "Illegal Access.";
            com.bugfender.sdk.d1.b("Reflection", str);
        } catch (java.lang.NoSuchFieldException unused3) {
            str = "No Such Field.";
            com.bugfender.sdk.d1.b("Reflection", str);
        }
        return null;
    }

    public static android.widget.SeekBar.OnSeekBarChangeListener d(android.view.View view) {
        java.lang.String str;
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.widget.SeekBar").getDeclaredField("mOnSeekBarChangeListener");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return (android.widget.SeekBar.OnSeekBarChangeListener) declaredField.get(view);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            str = "Class Not Found.";
            com.bugfender.sdk.d1.b("Reflection", str);
        } catch (java.lang.IllegalAccessException unused2) {
            str = "Illegal Access.";
            com.bugfender.sdk.d1.b("Reflection", str);
        } catch (java.lang.NoSuchFieldException unused3) {
            str = "No Such Field.";
            com.bugfender.sdk.d1.b("Reflection", str);
        }
        return null;
    }
}
