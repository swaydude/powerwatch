package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class af implements com.google.android.play.core.internal.ad {
    af() {
    }

    static java.lang.Object a(java.lang.ClassLoader classLoader) {
        return com.google.android.play.core.internal.ba.a(classLoader, "pathList", java.lang.Object.class).a();
    }

    static boolean a(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z, com.google.android.play.core.internal.aj ajVar, java.lang.String str, com.google.android.play.core.internal.ak akVar) {
        java.util.ArrayList<java.io.IOException> arrayList = new java.util.ArrayList<>();
        java.lang.Object objA = a(classLoader);
        com.google.android.play.core.internal.ax axVarB = com.google.android.play.core.internal.ba.b(objA, "dexElements", java.lang.Object.class);
        java.util.List listAsList = java.util.Arrays.asList((java.lang.Object[]) axVarB.a());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.io.File) com.google.android.play.core.internal.ba.a(it.next(), str, java.io.File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        int i = 0;
        if (!z && !akVar.a(objA, file2, file)) {
            java.lang.String strValueOf = java.lang.String.valueOf(file2.getPath());
            android.util.Log.w("SplitCompat", strValueOf.length() != 0 ? "Should be optimized ".concat(strValueOf) : new java.lang.String("Should be optimized "));
            return false;
        }
        axVarB.a(ajVar.a(objA, new java.util.ArrayList<>(java.util.Collections.singleton(file2)), file, arrayList));
        if (arrayList.isEmpty()) {
            return true;
        }
        com.google.android.play.core.internal.aa aaVar = new com.google.android.play.core.internal.aa("DexPathList.makeDexElement failed");
        java.util.ArrayList<java.io.IOException> arrayList3 = arrayList;
        int size = arrayList3.size();
        while (i < size) {
            java.io.IOException iOException = arrayList3.get(i);
            i++;
            java.io.IOException iOException2 = iOException;
            android.util.Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException2);
            com.google.android.play.core.internal.bj.a(aaVar, iOException2);
        }
        com.google.android.play.core.internal.ba.b(objA, "dexElementsSuppressedExceptions", java.io.IOException.class).a((java.util.Collection) arrayList);
        throw aaVar;
    }

    static void b(java.lang.ClassLoader classLoader, java.util.Set<java.io.File> set) {
        if (set.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.io.File file : set) {
            java.lang.String strValueOf = java.lang.String.valueOf(file.getParentFile().getAbsolutePath());
            android.util.Log.d("Splitcompat", strValueOf.length() != 0 ? "Adding native library parent directory: ".concat(strValueOf) : new java.lang.String("Adding native library parent directory: "));
            hashSet.add(file.getParentFile());
        }
        com.google.android.play.core.internal.ax axVarB = com.google.android.play.core.internal.ba.b(a(classLoader), "nativeLibraryDirectories", java.io.File.class);
        hashSet.removeAll(java.util.Arrays.asList((java.io.File[]) axVarB.a()));
        int size = hashSet.size();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append("Adding directories ");
        sb.append(size);
        android.util.Log.d("Splitcompat", sb.toString());
        axVarB.b(hashSet);
    }

    @Override // com.google.android.play.core.internal.ad
    public final void a(java.lang.ClassLoader classLoader, java.util.Set<java.io.File> set) {
        b(classLoader, set);
    }

    @Override // com.google.android.play.core.internal.ad
    public final boolean a(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z) {
        return a(classLoader, file, file2, z, new com.google.android.play.core.internal.ai(), "zip", new com.google.android.play.core.internal.ah());
    }
}
