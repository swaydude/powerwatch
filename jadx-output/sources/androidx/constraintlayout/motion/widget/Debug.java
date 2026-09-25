package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class Debug {
    public static void logStack(java.lang.String str, java.lang.String str2, int i) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        int iMin = java.lang.Math.min(i, stackTrace.length - 1);
        java.lang.String str3 = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
            str3 = str3 + " ";
            android.util.Log.v(str, str2 + str3 + (".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") ") + str3);
        }
    }

    public static java.lang.String getName(android.view.View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (java.lang.Exception unused) {
            return "UNKNOWN";
        }
    }

    public static java.lang.String getName(android.content.Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (java.lang.Exception unused) {
            }
        }
        return "UNKNOWN";
    }

    public static java.lang.String getName(android.content.Context context, int[] iArr) {
        int i = 0;
        java.lang.String str = "";
        while (i < iArr.length) {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(i == 0 ? "" : " ");
                str = sb.toString() + context.getResources().getResourceEntryName(iArr[i]);
                i++;
            } catch (java.lang.Exception unused) {
                return "UNKNOWN";
            }
        }
        return str;
    }

    public static java.lang.String getState(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        return i == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i);
    }

    public static java.lang.String getActionType(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (java.lang.reflect.Field field : android.view.MotionEvent.class.getFields()) {
            try {
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getType().equals(java.lang.Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static java.lang.String getLocation() {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static java.lang.String getCallFrom(int i) {
        java.lang.StackTraceElement stackTraceElement = new java.lang.Throwable().getStackTrace()[i + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }
}
