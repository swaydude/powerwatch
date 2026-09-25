package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final com.google.android.play.core.splitcompat.c b;

    f(com.google.android.play.core.splitcompat.c cVar) throws java.io.IOException {
        this.b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Set<java.io.File> a(java.util.Set<com.google.android.play.core.splitcompat.k> set, com.google.android.play.core.splitcompat.q qVar, java.util.zip.ZipFile zipFile) throws java.io.IOException {
        java.util.HashSet hashSet = new java.util.HashSet();
        a(qVar, set, new com.google.android.play.core.splitcompat.j(hashSet, qVar, zipFile));
        return hashSet;
    }

    private static void a(com.google.android.play.core.splitcompat.q qVar, com.google.android.play.core.splitcompat.i iVar) throws java.io.IOException {
        java.lang.String str;
        java.util.zip.ZipFile zipFile = null;
        try {
            java.util.zip.ZipFile zipFile2 = new java.util.zip.ZipFile(qVar.a());
            try {
                java.lang.String strB = qVar.b();
                java.util.HashMap map = new java.util.HashMap();
                java.util.Enumeration<? extends java.util.zip.ZipEntry> enumerationEntries = zipFile2.entries();
                while (enumerationEntries.hasMoreElements()) {
                    java.util.zip.ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    java.util.regex.Matcher matcher = a.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        java.lang.String strGroup = matcher.group(1);
                        java.lang.String strGroup2 = matcher.group(2);
                        android.util.Log.d("SplitCompat", java.lang.String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup));
                        java.util.Set hashSet = (java.util.Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new java.util.HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new com.google.android.play.core.splitcompat.k(zipEntryNextElement, strGroup2));
                    }
                }
                java.util.HashMap map2 = new java.util.HashMap();
                for (java.lang.String str2 : android.os.Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str2)) {
                        android.util.Log.d("SplitCompat", java.lang.String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str2));
                        for (com.google.android.play.core.splitcompat.k kVar : (java.util.Set) map.get(str2)) {
                            if (map2.containsKey(kVar.a)) {
                                str = java.lang.String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", kVar.a, str2);
                            } else {
                                map2.put(kVar.a, kVar);
                                str = java.lang.String.format("NativeLibraryExtractor: using library %s for ABI %s", kVar.a, str2);
                            }
                            android.util.Log.d("SplitCompat", str);
                        }
                    } else {
                        android.util.Log.d("SplitCompat", java.lang.String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str2));
                    }
                }
                iVar.a(zipFile2, new java.util.HashSet(map2.values()));
                zipFile2.close();
            } catch (java.io.IOException e) {
                e = e;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (java.io.IOException e2) {
                        com.google.android.play.core.internal.bj.a(e, e2);
                    }
                }
                throw e;
            }
        } catch (java.io.IOException e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.google.android.play.core.splitcompat.q qVar, java.util.Set<com.google.android.play.core.splitcompat.k> set, com.google.android.play.core.splitcompat.l lVar) throws java.io.IOException {
        for (com.google.android.play.core.splitcompat.k kVar : set) {
            java.io.File fileA = this.b.a(qVar.b(), kVar.a);
            lVar.a(kVar, fileA, fileA.exists() && fileA.length() == kVar.b.getSize());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void b(java.util.zip.ZipFile zipFile, java.util.zip.ZipEntry zipEntry, java.io.File file) throws java.io.IOException {
        byte[] bArr = new byte[4096];
        java.io.InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        com.google.android.play.core.internal.bj.a(th, th2);
                    }
                    throw th;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.lang.Throwable th3) {
                        com.google.android.play.core.internal.bj.a(th, th3);
                    }
                }
                throw th;
            }
            fileOutputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.lang.Throwable th4) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th4;
        }
    }

    final java.util.Set<java.io.File> a() throws java.io.IOException {
        boolean z;
        android.util.Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        java.util.Set<com.google.android.play.core.splitcompat.q> setD = this.b.d();
        for (java.lang.String str : this.b.e()) {
            java.util.Iterator<com.google.android.play.core.splitcompat.q> it = setD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().b().equals(str)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                android.util.Log.i("SplitCompat", java.lang.String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                this.b.d(str);
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.google.android.play.core.splitcompat.q qVar : setD) {
            java.util.HashSet hashSet2 = new java.util.HashSet();
            a(qVar, new com.google.android.play.core.splitcompat.g(this, hashSet2, qVar));
            for (java.io.File file : this.b.e(qVar.b())) {
                if (!hashSet2.contains(file)) {
                    android.util.Log.i("SplitCompat", java.lang.String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), qVar.b(), qVar.a().getAbsolutePath()));
                    this.b.b(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    final java.util.Set<java.io.File> a(com.google.android.play.core.splitcompat.q qVar) throws java.io.IOException {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        java.util.HashSet hashSet = new java.util.HashSet();
        a(qVar, new com.google.android.play.core.splitcompat.e(this, qVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }
}
