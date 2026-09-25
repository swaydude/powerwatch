package com.baidu.android.bbalbs.common.util;

/* JADX INFO: loaded from: classes.dex */
final class d {
    static java.lang.String a(android.content.Context context) {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    static java.lang.String a(android.content.Context context, java.lang.String str) {
        try {
            return android.provider.Settings.System.getString(context.getContentResolver(), str);
        } catch (java.lang.Exception e) {
            a(e);
            return null;
        }
    }

    static java.lang.String a(java.io.File file) throws java.lang.Throwable {
        java.io.FileReader fileReader;
        java.io.FileReader fileReader2 = null;
        try {
            fileReader = new java.io.FileReader(file);
            try {
                try {
                    char[] cArr = new char[8192];
                    java.io.CharArrayWriter charArrayWriter = new java.io.CharArrayWriter();
                    while (true) {
                        int i = fileReader.read(cArr);
                        if (i <= 0) {
                            break;
                        }
                        charArrayWriter.write(cArr, 0, i);
                        th = th;
                        fileReader2 = fileReader;
                        if (fileReader2 != null) {
                            try {
                                fileReader2.close();
                            } catch (java.lang.Exception e) {
                                a(e);
                            }
                        }
                        throw th;
                    }
                    java.lang.String string = charArrayWriter.toString();
                    try {
                        fileReader.close();
                    } catch (java.lang.Exception e2) {
                        a(e2);
                    }
                    return string;
                } catch (java.lang.Exception e3) {
                    e = e3;
                    a(e);
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (java.lang.Exception e4) {
                            a(e4);
                        }
                    }
                    return null;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                fileReader2 = fileReader;
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            fileReader = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    static void a(java.lang.Throwable th) {
    }

    static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            return android.provider.Settings.System.putString(context.getContentResolver(), str, str2);
        } catch (java.lang.Exception e) {
            a(e);
            return false;
        }
    }

    static boolean a(java.lang.String str, int i) {
        if (android.text.TextUtils.isEmpty(str) || i == 0) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]{1,5}$");
    }

    static boolean b(android.content.Context context) {
        return b(context, "android.permission.WRITE_SETTINGS");
    }

    static boolean b(android.content.Context context, java.lang.String str) {
        return context != null && context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }
}
