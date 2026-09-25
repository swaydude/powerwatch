package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class al implements com.google.android.play.core.internal.ad {
    al() {
    }

    public static void a(java.lang.ClassLoader classLoader, java.util.Set<java.io.File> set, com.google.android.play.core.internal.aq aqVar) {
        if (set.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<java.io.File> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getParentFile());
        }
        java.lang.Object objA = com.google.android.play.core.internal.af.a(classLoader);
        java.util.List list = (java.util.List) com.google.android.play.core.internal.ba.a(objA, "nativeLibraryDirectories", java.util.List.class).a();
        hashSet.removeAll(list);
        list.addAll(hashSet);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArrA = aqVar.a(objA, new java.util.ArrayList(hashSet), null, arrayList);
        if (arrayList.isEmpty()) {
            com.google.android.play.core.internal.ba.b(objA, "nativeLibraryPathElements", java.lang.Object.class).b(objArrA);
            return;
        }
        com.google.android.play.core.internal.aa aaVar = new com.google.android.play.core.internal.aa("Error in makePathElements");
        java.util.ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList2.get(i);
            i++;
            com.google.android.play.core.internal.bj.a(aaVar, (java.io.IOException) obj);
        }
        throw aaVar;
    }

    public static boolean a(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z, java.lang.String str) {
        return com.google.android.play.core.internal.af.a(classLoader, file, file2, z, new com.google.android.play.core.internal.ao(), str, new com.google.android.play.core.internal.ah());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object[] b(java.lang.Object obj, java.util.List<java.io.File> list, java.io.File file, java.util.List<java.io.IOException> list2) {
        return (java.lang.Object[]) com.google.android.play.core.internal.ba.a(obj, "makePathElements", java.lang.Object[].class, java.util.List.class, list, java.io.File.class, file, java.util.List.class, list2);
    }

    @Override // com.google.android.play.core.internal.ad
    public final void a(java.lang.ClassLoader classLoader, java.util.Set<java.io.File> set) {
        a(classLoader, set, new com.google.android.play.core.internal.an());
    }

    @Override // com.google.android.play.core.internal.ad
    public final boolean a(java.lang.ClassLoader classLoader, java.io.File file, java.io.File file2, boolean z) {
        return a(classLoader, file, file2, z, "zip");
    }
}
