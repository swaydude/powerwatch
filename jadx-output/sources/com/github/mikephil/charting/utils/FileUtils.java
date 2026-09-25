package com.github.mikephil.charting.utils;

/* JADX INFO: loaded from: classes.dex */
public class FileUtils {
    private static final java.lang.String LOG = "MPChart-FileUtils";

    public static java.util.List<com.github.mikephil.charting.data.Entry> loadEntriesFromFile(java.lang.String str) {
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                java.lang.String[] strArrSplit = line.split("#");
                if (strArrSplit.length <= 2) {
                    arrayList.add(new com.github.mikephil.charting.data.Entry(java.lang.Float.parseFloat(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1])));
                } else {
                    int length = strArrSplit.length - 1;
                    float[] fArr = new float[length];
                    for (int i = 0; i < length; i++) {
                        fArr[i] = java.lang.Float.parseFloat(strArrSplit[i]);
                    }
                    arrayList.add(new com.github.mikephil.charting.data.BarEntry(java.lang.Integer.parseInt(strArrSplit[strArrSplit.length - 1]), fArr));
                }
            }
        } catch (java.io.IOException e) {
            android.util.Log.e(LOG, e.toString());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [float[]] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [float] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:37:0x0088). Please report as a decompilation issue!!! */
    public static java.util.List<com.github.mikephil.charting.data.Entry> loadEntriesFromAssets(android.content.res.AssetManager assetManager, java.lang.String str) throws java.lang.Throwable {
        ?? r2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ?? r3 = 0;
        ?? r4 = 0;
        java.io.BufferedReader bufferedReader = null;
        r3 = 0;
        try {
            try {
                try {
                    java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(assetManager.open(str), io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
                    try {
                        java.lang.String line = bufferedReader2.readLine();
                        while (line != null) {
                            java.lang.String[] strArrSplit = line.split("#");
                            if (strArrSplit.length <= 2) {
                                r2 = java.lang.Float.parseFloat(strArrSplit[1]);
                                arrayList.add(new com.github.mikephil.charting.data.Entry(r2, java.lang.Float.parseFloat(strArrSplit[0])));
                            } else {
                                int length = strArrSplit.length - 1;
                                r2 = new float[length];
                                for (int i = 0; i < length; i++) {
                                    r2[i] = java.lang.Float.parseFloat(strArrSplit[i]);
                                }
                                arrayList.add(new com.github.mikephil.charting.data.BarEntry(java.lang.Integer.parseInt(strArrSplit[strArrSplit.length - 1]), (float[]) r2));
                            }
                            line = bufferedReader2.readLine();
                            r4 = r2;
                        }
                        bufferedReader2.close();
                        r3 = r4;
                    } catch (java.io.IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        android.util.Log.e(LOG, e.toString());
                        r3 = bufferedReader;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            r3 = bufferedReader;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r3 = bufferedReader2;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (java.io.IOException e2) {
                                android.util.Log.e(LOG, e2.toString());
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.io.IOException e3) {
                e = e3;
            }
        } catch (java.io.IOException e4) {
            android.util.Log.e(LOG, e4.toString());
            r3 = r3;
        }
        return arrayList;
    }

    public static void saveToSdCard(java.util.List<com.github.mikephil.charting.data.Entry> list, java.lang.String str) {
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (java.io.IOException e) {
                android.util.Log.e(LOG, e.toString());
            }
        }
        try {
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file, true));
            for (com.github.mikephil.charting.data.Entry entry : list) {
                bufferedWriter.append((java.lang.CharSequence) (entry.getY() + "#" + entry.getX()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (java.io.IOException e2) {
            android.util.Log.e(LOG, e2.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static java.util.List<com.github.mikephil.charting.data.BarEntry> loadBarEntriesFromAssets(android.content.res.AssetManager assetManager, java.lang.String str) throws java.lang.Throwable {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ?? r2 = 0;
        float f = 0.0f;
        r2 = 0;
        r2 = 0;
        try {
            try {
                try {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(assetManager.open(str), io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8));
                    try {
                        for (java.lang.String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            java.lang.String[] strArrSplit = line.split("#");
                            f = java.lang.Float.parseFloat(strArrSplit[1]);
                            arrayList.add(new com.github.mikephil.charting.data.BarEntry(f, java.lang.Float.parseFloat(strArrSplit[0])));
                        }
                        bufferedReader.close();
                        r2 = f;
                    } catch (java.io.IOException e) {
                        e = e;
                        r2 = bufferedReader;
                        android.util.Log.e(LOG, e.toString());
                        if (r2 != 0) {
                            r2.close();
                            r2 = r2;
                        }
                        return arrayList;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        r2 = bufferedReader;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (java.io.IOException e2) {
                                android.util.Log.e(LOG, e2.toString());
                            }
                        }
                        throw th;
                    }
                } catch (java.io.IOException e3) {
                    android.util.Log.e(LOG, e3.toString());
                }
            } catch (java.io.IOException e4) {
                e = e4;
            }
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
