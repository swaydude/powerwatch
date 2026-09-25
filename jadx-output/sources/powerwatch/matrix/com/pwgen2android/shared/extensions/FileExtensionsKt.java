package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: FileExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0010"}, d2 = {"createFromAssets", "Ljava/io/File;", "context", "Landroid/content/Context;", "assetsName", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "deleteFile", "", "path", "loadFromAssets", "", "readFile", "Lkotlin/Pair;", "writeContentToFile", com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FileExtensionsKt {
    public static final boolean deleteFile(java.lang.String path, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return new java.io.File(context.getExternalFilesDir(null) + ((java.lang.Object) java.io.File.separator) + path + ".bin").delete();
    }

    public static final kotlin.Pair<java.lang.String, byte[]> readFile(java.lang.String path, android.content.Context context) throws java.lang.Throwable {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.FileInputStream fileInputStream;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                byte[] bArr = new byte[4096];
                fileInputStream = new java.io.FileInputStream(new java.io.File(context.getExternalFilesDir(null) + ((java.lang.Object) java.io.File.separator) + path + ".bin"));
                try {
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    while (true) {
                        try {
                            try {
                                int i = fileInputStream.read(bArr);
                                if (i != -1) {
                                    byteArrayOutputStream.write(bArr, 0, i);
                                } else {
                                    byteArrayOutputStream.flush();
                                    kotlin.Pair<java.lang.String, byte[]> pair = new kotlin.Pair<>(path, byteArrayOutputStream.toByteArray());
                                    fileInputStream.close();
                                    byteArrayOutputStream.close();
                                    return pair;
                                }
                            } catch (java.io.IOException unused) {
                                kotlin.Pair<java.lang.String, byte[]> pair2 = new kotlin.Pair<>(path, null);
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                return pair2;
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                        }
                        th = th;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } catch (java.io.IOException unused2) {
                    byteArrayOutputStream = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                }
            } catch (java.io.IOException unused3) {
                byteArrayOutputStream = null;
                fileInputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                fileInputStream = null;
            }
        } catch (java.io.IOException unused4) {
            return new kotlin.Pair<>(path, null);
        }
    }

    public static final java.io.File writeContentToFile(byte[] content, java.lang.String path, android.content.Context context) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.io.ByteArrayInputStream byteArrayInputStream;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            java.io.File file = new java.io.File(context.getExternalFilesDir(null) + ((java.lang.Object) java.io.File.separator) + path + ".bin");
            try {
                byte[] bArr = new byte[4096];
                byteArrayInputStream = new java.io.ByteArrayInputStream(content);
                try {
                    fileOutputStream = new java.io.FileOutputStream(file);
                    while (true) {
                        try {
                            int i = byteArrayInputStream.read(bArr);
                            if (i != -1) {
                                fileOutputStream.write(bArr, 0, i);
                            } else {
                                fileOutputStream.flush();
                                byteArrayInputStream.close();
                                fileOutputStream.close();
                                return file;
                            }
                        } catch (java.io.IOException unused) {
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return null;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            if (byteArrayInputStream != null) {
                                byteArrayInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    }
                } catch (java.io.IOException unused2) {
                    fileOutputStream = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (java.io.IOException unused3) {
                fileOutputStream = null;
                byteArrayInputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                fileOutputStream = null;
                byteArrayInputStream = null;
            }
        } catch (java.io.IOException unused4) {
        }
    }

    public static final java.io.File createFromAssets(android.content.Context context, java.lang.String assetsName, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetsName, "assetsName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        try {
            java.io.File fileCreateTempFile = java.io.File.createTempFile(name, "", context.getCacheDir());
            java.io.InputStream inputStreamOpen = context.getAssets().open(assetsName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(assetsName)");
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i > 0) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    fileOutputStream.close();
                    inputStreamOpen.close();
                    return fileCreateTempFile;
                }
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static final byte[] loadFromAssets(android.content.Context context, java.lang.String assetsName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetsName, "assetsName");
        byte[] bArr = new byte[0];
        try {
            java.io.InputStream inputStreamOpen = context.getAssets().open(assetsName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(assetsName)");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr2);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                    try {
                        byteArrayOutputStream.close();
                        inputStreamOpen.close();
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray2, "outputStream.toByteArray()");
                        return byteArray2;
                    } catch (java.io.IOException unused) {
                        return byteArray;
                    }
                }
            }
        } catch (java.io.IOException unused2) {
            return bArr;
        }
    }
}
