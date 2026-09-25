package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class v0 implements com.bugfender.sdk.a<java.io.File, java.util.List<com.bugfender.sdk.u0>> {
    private final com.bugfender.sdk.x0 a;

    public v0(com.bugfender.sdk.x0 x0Var) {
        this.a = x0Var;
    }

    private java.util.List<com.bugfender.sdk.u0> a(java.io.File file) throws java.io.IOException {
        java.util.Scanner scanner = new java.util.Scanner(new java.io.BufferedReader(new java.io.FileReader(file)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (scanner.hasNextLine()) {
            try {
                com.bugfender.sdk.u0 u0VarA = this.a.a(scanner.nextLine());
                if (u0VarA != null) {
                    arrayList.add(u0VarA);
                }
            } finally {
                scanner.close();
            }
        }
        return arrayList;
    }

    @Override // com.bugfender.sdk.a
    public java.io.File a(java.util.List<com.bugfender.sdk.u0> list) {
        throw new java.lang.UnsupportedOperationException("from(List<Issue> value) not supported");
    }

    @Override // com.bugfender.sdk.a
    public java.util.List<com.bugfender.sdk.u0> b(java.io.File file) {
        try {
            return a(file);
        } catch (java.io.IOException unused) {
            return java.util.Collections.emptyList();
        }
    }
}
