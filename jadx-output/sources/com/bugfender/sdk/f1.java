package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class f1 implements com.bugfender.sdk.a<java.io.File, java.util.List<com.bugfender.sdk.e1>> {
    private com.bugfender.sdk.g1 a;

    public f1(com.bugfender.sdk.g1 g1Var) {
        this.a = g1Var;
    }

    private java.util.List<com.bugfender.sdk.e1> a(java.io.File file) throws java.io.IOException {
        java.util.Scanner scanner = new java.util.Scanner(new java.io.BufferedReader(new java.io.FileReader(file)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (scanner.hasNextLine()) {
            try {
                com.bugfender.sdk.e1 e1VarA = this.a.a(scanner.nextLine());
                if (e1VarA != null) {
                    arrayList.add(e1VarA);
                }
            } finally {
                scanner.close();
            }
        }
        return arrayList;
    }

    @Override // com.bugfender.sdk.a
    public java.io.File a(java.util.List<com.bugfender.sdk.e1> list) {
        throw new java.lang.UnsupportedOperationException("from(List<LogEntry> value) not supported");
    }

    @Override // com.bugfender.sdk.a
    public java.util.List<com.bugfender.sdk.e1> b(java.io.File file) {
        try {
            return a(file);
        } catch (java.io.IOException unused) {
            return java.util.Collections.emptyList();
        }
    }
}
