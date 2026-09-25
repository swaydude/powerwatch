package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class u2 implements com.bugfender.sdk.a<java.io.File, java.util.List<java.lang.String>> {
    private java.util.List<java.lang.String> a(java.io.File file) throws java.io.IOException {
        java.util.Scanner scanner = new java.util.Scanner(new java.io.BufferedReader(new java.io.FileReader(file)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (scanner.hasNextLine()) {
            try {
                java.lang.String strNextLine = scanner.nextLine();
                if (strNextLine != null && !strNextLine.isEmpty()) {
                    arrayList.add(strNextLine);
                }
            } finally {
                scanner.close();
            }
        }
        return arrayList;
    }

    @Override // com.bugfender.sdk.a
    public java.io.File a(java.util.List<java.lang.String> list) {
        throw new java.lang.UnsupportedOperationException("from(List<String> value) not supported");
    }

    @Override // com.bugfender.sdk.a
    public java.util.List<java.lang.String> b(java.io.File file) {
        try {
            return a(file);
        } catch (java.io.IOException unused) {
            return java.util.Collections.emptyList();
        }
    }
}
