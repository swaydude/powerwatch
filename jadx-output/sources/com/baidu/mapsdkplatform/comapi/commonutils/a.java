package com.baidu.mapsdkplatform.comapi.commonutils;

/* JADX INFO: loaded from: classes.dex */
public class a {
    private static final boolean a;

    static {
        a = android.os.Build.VERSION.SDK_INT >= 8;
    }

    public static android.graphics.Bitmap a(java.lang.String str, android.content.Context context) {
        try {
            java.io.InputStream inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen != null) {
                return android.graphics.BitmapFactory.decodeStream(inputStreamOpen);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return android.graphics.BitmapFactory.decodeFile(b("assets/" + str, str, context));
        }
    }

    private static void a(java.io.InputStream inputStream, java.io.FileOutputStream fileOutputStream) throws java.io.IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (java.lang.Throwable th) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused) {
                }
                try {
                    fileOutputStream.close();
                    throw th;
                } catch (java.io.IOException unused2) {
                    throw th;
                }
            }
        }
        fileOutputStream.flush();
        try {
            inputStream.close();
        } catch (java.io.IOException unused3) {
        }
        try {
            fileOutputStream.close();
        } catch (java.io.IOException unused4) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[Catch: IOException -> 0x0093, TRY_LEAVE, TryCatch #2 {IOException -> 0x0093, blocks: (B:37:0x008f, B:41:0x0097), top: B:46:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(java.lang.String str, java.lang.String str2, android.content.Context context) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.io.InputStream inputStream = null;
        java.io.FileOutputStream fileOutputStream2 = null;
        inputStream = null;
        try {
            try {
                java.io.InputStream inputStreamOpen = context.getAssets().open(str);
                if (inputStreamOpen != null) {
                    try {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        java.io.File file = new java.io.File(context.getFilesDir().getAbsolutePath() + "/" + str2);
                        if (file.exists()) {
                            file.delete();
                        }
                        file.createNewFile();
                        fileOutputStream = new java.io.FileOutputStream(file);
                        try {
                            fileOutputStream.write(bArr);
                            fileOutputStream.close();
                            fileOutputStream2 = fileOutputStream;
                        } catch (java.lang.Exception unused) {
                            inputStream = inputStreamOpen;
                            try {
                                b("assets/" + str, str2, context);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                    return;
                                }
                                return;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (java.io.IOException e) {
                                        e.printStackTrace();
                                        throw th;
                                    }
                                } else if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            inputStream = inputStreamOpen;
                            if (inputStream != null) {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception unused2) {
                        fileOutputStream = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                }
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (java.io.IOException e2) {
                e2.printStackTrace();
            }
        } catch (java.lang.Exception unused3) {
            fileOutputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private static java.lang.String b(java.lang.String str, java.lang.String str2, android.content.Context context) throws java.lang.Throwable {
        java.io.File file;
        java.io.File file2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(context.getFilesDir().getAbsolutePath());
        java.util.zip.ZipFile zipFile = null;
        try {
            try {
                try {
                    java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(a ? context.getPackageCodePath() : "");
                    try {
                        int iLastIndexOf = str2.lastIndexOf("/");
                        if (iLastIndexOf > 0) {
                            file = new java.io.File(context.getFilesDir().getAbsolutePath());
                            java.lang.String strSubstring = str2.substring(0, iLastIndexOf);
                            file2 = new java.io.File(file.getAbsolutePath() + "/" + strSubstring, str2.substring(iLastIndexOf + 1, str2.length()));
                        } else {
                            file = new java.io.File(context.getFilesDir(), "assets");
                            file2 = new java.io.File(file.getAbsolutePath(), str2);
                        }
                        file.mkdirs();
                        java.util.zip.ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            try {
                                zipFile2.close();
                            } catch (java.io.IOException unused) {
                            }
                            return null;
                        }
                        a(zipFile2.getInputStream(entry), new java.io.FileOutputStream(file2));
                        sb.append("/");
                        sb.append(str);
                        zipFile2.close();
                    } catch (java.lang.Exception e) {
                        e = e;
                        zipFile = zipFile2;
                        android.util.Log.e(com.baidu.mapsdkplatform.comapi.commonutils.a.class.getSimpleName(), "copyAssetsError", e);
                        if (zipFile != null) {
                            zipFile.close();
                        }
                        return sb.toString();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.io.IOException unused3) {
        }
        return sb.toString();
    }
}
