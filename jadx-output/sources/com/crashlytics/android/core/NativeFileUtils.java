package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
final class NativeFileUtils {
    private NativeFileUtils() {
    }

    static byte[] readFile(java.io.File file) throws java.lang.Throwable {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bytes = readBytes(fileInputStream);
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(fileInputStream);
                return bytes;
            } catch (java.io.FileNotFoundException unused) {
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(fileInputStream);
                return null;
            } catch (java.io.IOException unused2) {
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(fileInputStream);
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(fileInputStream2);
                throw th;
            }
        } catch (java.io.FileNotFoundException unused3) {
            fileInputStream = null;
        } catch (java.io.IOException unused4) {
            fileInputStream = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static byte[] readBytes(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static java.io.File filter(java.io.File file, java.lang.String str) {
        for (java.io.File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    static byte[] minidumpFromDirectory(java.io.File file) {
        java.io.File fileFilter = filter(file, ".dmp");
        return fileFilter == null ? new byte[0] : minidumpFromFile(fileFilter);
    }

    private static byte[] minidumpFromFile(java.io.File file) {
        return readFile(file);
    }

    static byte[] binaryImagesJsonFromDirectory(java.io.File file, android.content.Context context) throws java.io.IOException {
        java.io.File fileFilter = filter(file, ".maps");
        if (fileFilter != null) {
            return binaryImagesJsonFromMapsFile(fileFilter, context);
        }
        java.io.File fileFilter2 = filter(file, ".binary_libs");
        if (fileFilter2 != null) {
            return binaryImagesJsonFromBinaryLibsFile(fileFilter2, context);
        }
        return null;
    }

    private static byte[] binaryImagesJsonFromBinaryLibsFile(java.io.File file, android.content.Context context) throws java.lang.Throwable {
        byte[] file2 = readFile(file);
        if (file2 == null || file2.length == 0) {
            return null;
        }
        return processBinaryImages(context, new java.lang.String(file2));
    }

    private static byte[] binaryImagesJsonFromMapsFile(java.io.File file, android.content.Context context) throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader = null;
        if (!file.exists()) {
            return null;
        }
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.FileReader(file));
            try {
                byte[] bArrConvert = new com.crashlytics.android.core.BinaryImagesConverter(context, new com.crashlytics.android.core.Sha1FileIdStrategy()).convert(bufferedReader2);
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(bufferedReader2);
                return bArrConvert;
            } catch (java.lang.Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                io.fabric.sdk.android.services.common.CommonUtils.closeQuietly(bufferedReader);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    static byte[] metadataJsonFromDirectory(java.io.File file) {
        java.io.File fileFilter = filter(file, ".device_info");
        if (fileFilter == null) {
            return null;
        }
        return readFile(fileFilter);
    }

    private static byte[] processBinaryImages(android.content.Context context, java.lang.String str) throws java.io.IOException {
        return new com.crashlytics.android.core.BinaryImagesConverter(context, new com.crashlytics.android.core.Sha1FileIdStrategy()).convert(str);
    }
}
