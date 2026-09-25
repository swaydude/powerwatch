package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    public static abstract class a implements java.util.Comparator<java.io.File> {
        private final java.util.Map<java.io.File, java.lang.Long> a;

        /* JADX INFO: renamed from: com.bugfender.sdk.h0$a$a, reason: collision with other inner class name */
        class C0016a extends java.util.HashMap<java.io.File, java.lang.Long> {
            final /* synthetic */ java.io.File[] a;

            C0016a(java.io.File[] fileArr) {
                this.a = fileArr;
                for (java.io.File file : fileArr) {
                    put(file, java.lang.Long.valueOf(file.lastModified()));
                }
            }
        }

        public a(java.io.File[] fileArr) {
            this.a = new com.bugfender.sdk.h0.a.C0016a(fileArr);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(java.io.File file, java.io.File file2) {
            return a(file, this.a.get(file), file2, this.a.get(file2));
        }

        public abstract int a(java.io.File file, java.lang.Long l, java.io.File file2, java.lang.Long l2);
    }

    public static java.lang.String a(java.io.File file) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) file.length());
        java.util.Scanner scanner = new java.util.Scanner(new java.io.BufferedReader(new java.io.FileReader(file)));
        while (scanner.hasNextLine()) {
            try {
                sb.append(scanner.nextLine());
            } catch (java.lang.Throwable th) {
                scanner.close();
                throw th;
            }
        }
        java.lang.String string = sb.toString();
        scanner.close();
        return string;
    }

    public static void a(java.io.File file, java.lang.String str, com.bugfender.sdk.c0 c0Var) throws java.lang.Throwable {
        java.io.PrintWriter printWriter;
        java.io.PrintWriter printWriter2 = null;
        try {
            try {
                c0Var.c(file.length());
                printWriter = new java.io.PrintWriter(file);
                try {
                    printWriter.println(str);
                    c0Var.a(com.bugfender.sdk.r2.b(str));
                    printWriter.close();
                } catch (java.io.FileNotFoundException e) {
                    e = e;
                    printWriter2 = printWriter;
                    com.bugfender.sdk.d1.a(e);
                    if (printWriter2 != null) {
                        printWriter2.close();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                printWriter = printWriter2;
            }
        } catch (java.io.FileNotFoundException e2) {
            e = e2;
        }
    }

    public static void a(java.io.File[] fileArr, com.bugfender.sdk.h0.a aVar) {
        java.util.Arrays.sort(fileArr, aVar);
    }

    public static boolean a(java.io.File file, com.bugfender.sdk.c0 c0Var) {
        boolean zDelete = true;
        for (java.io.File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                zDelete = a(file2, c0Var);
            } else {
                long length = file2.length();
                zDelete = file2.delete();
                if (zDelete) {
                    c0Var.c(length);
                }
            }
        }
        if (zDelete) {
            long length2 = file.length();
            zDelete = file.delete();
            if (zDelete) {
                c0Var.c(length2);
            }
        }
        return zDelete;
    }

    public static void b(java.io.File file, java.lang.String str, com.bugfender.sdk.c0 c0Var) throws java.lang.Throwable {
        java.io.PrintWriter printWriter;
        java.io.PrintWriter printWriter2 = null;
        try {
            try {
                c0Var.c(file.length());
                printWriter = new java.io.PrintWriter(file);
                try {
                    printWriter.print("");
                    printWriter.flush();
                    printWriter.println(str);
                    c0Var.a(com.bugfender.sdk.r2.b(str));
                    printWriter.close();
                } catch (java.io.FileNotFoundException e) {
                    e = e;
                    printWriter2 = printWriter;
                    com.bugfender.sdk.d1.a(e);
                    if (printWriter2 != null) {
                        printWriter2.close();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                printWriter = printWriter2;
            }
        } catch (java.io.FileNotFoundException e2) {
            e = e2;
        }
    }

    public static boolean b(java.io.File file, com.bugfender.sdk.c0 c0Var) {
        boolean zDelete = true;
        for (java.io.File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                zDelete = a(file2, c0Var);
            } else {
                long length = file2.length();
                zDelete = file2.delete();
                if (zDelete) {
                    c0Var.c(length);
                }
            }
        }
        return zDelete;
    }
}
