package com.google.android.play.core.splitinstall.testing;

/* JADX INFO: loaded from: classes2.dex */
public class FakeSplitInstallManager implements com.google.android.play.core.splitinstall.SplitInstallManager {
    private static final long b = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);
    private static final java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitinstall.SplitInstallSessionState> k = new java.util.concurrent.atomic.AtomicReference<>(com.google.android.play.core.splitinstall.SplitInstallSessionState.create(0, 0, 0, 0, 0, new java.util.ArrayList(), new java.util.ArrayList()));
    private final android.os.Handler a;
    private final android.content.Context c;
    private final com.google.android.play.core.internal.ac d;
    private final com.google.android.play.core.splitinstall.l e;
    private final com.google.android.play.core.internal.bh f;
    private final com.google.android.play.core.internal.q<com.google.android.play.core.splitinstall.SplitInstallSessionState> g;
    private final java.util.concurrent.Executor h;
    private final com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.a i;
    private final java.io.File j;
    private final java.util.Set<java.lang.String> l;
    private final java.util.Set<java.lang.String> m;
    private final java.util.concurrent.atomic.AtomicBoolean n;

    interface a {
        default a() {
        }

        default void a() {
            android.os.SystemClock.sleep(com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.b);
        }
    }

    FakeSplitInstallManager(android.content.Context context, java.io.File file) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        this(context, file, new com.google.android.play.core.splitinstall.j(), new com.google.android.play.core.splitinstall.l(context, context.getPackageName()), new com.google.android.play.core.internal.bh(context), new com.google.android.play.core.internal.ba(context, new com.google.android.play.core.splitcompat.c(context), new com.google.android.play.core.internal.ag()), new com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.a(), com.google.android.play.core.splitcompat.a.a());
    }

    private FakeSplitInstallManager(android.content.Context context, java.io.File file, com.google.android.play.core.splitinstall.j jVar, com.google.android.play.core.splitinstall.l lVar, com.google.android.play.core.internal.bh bhVar, com.google.android.play.core.internal.ba baVar, com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager.a aVar, java.util.concurrent.Executor executor) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        this.a = new android.os.Handler(android.os.Looper.getMainLooper());
        this.l = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.m = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.n = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.i = aVar;
        this.g = new com.google.android.play.core.internal.q<>();
        this.c = context;
        this.j = file;
        this.e = lVar;
        this.f = bhVar;
        com.google.android.play.core.splitcompat.c cVar = new com.google.android.play.core.splitcompat.c(context);
        this.h = executor;
        this.d = new com.google.android.play.core.internal.ac(context, executor, baVar, cVar, jVar);
    }

    private static java.lang.String a(java.io.File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().substring(0, file.getName().length() - 4).replace("base-", "config.").replace("-", ".config.").replace(".config.master", "");
        }
        throw new java.lang.IllegalArgumentException("Non-apk found in splits directory.");
    }

    private static java.lang.String a(java.lang.String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    private final void a(int i, int i2) {
        a(i, i2, null, null, null, null);
    }

    private final void a(int i, int i2, java.lang.Long l, java.lang.Long l2, java.util.List<java.lang.String> list, java.lang.Integer num) {
        java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitinstall.SplitInstallSessionState> atomicReference = k;
        com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState = atomicReference.get();
        atomicReference.set(com.google.android.play.core.splitinstall.SplitInstallSessionState.create((num == null ? java.lang.Integer.valueOf(splitInstallSessionState.sessionId()) : num).intValue(), i, i2, (l == null ? java.lang.Long.valueOf(splitInstallSessionState.bytesDownloaded()) : l).longValue(), (l2 == null ? java.lang.Long.valueOf(splitInstallSessionState.totalBytesToDownload()) : l2).longValue(), list == null ? splitInstallSessionState.moduleNames() : list, new java.util.ArrayList(getInstalledModules())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.util.List<java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.io.File file : list) {
            java.lang.String strA = a(file);
            android.net.Uri uriFromFile = android.net.Uri.fromFile(file);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, this.c.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", a(strA));
            intent.putExtra("split_id", strA);
            arrayList.add(intent);
            arrayList2.add(a(a(file)));
        }
        this.h.execute(new com.google.android.play.core.splitinstall.testing.d(this, k.get().totalBytesToDownload(), arrayList, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.util.List<android.content.Intent> list, java.util.List<java.lang.String> list2, long j) {
        a(list, list2, j, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.util.List<android.content.Intent> list, java.util.List<java.lang.String> list2, long j, boolean z) {
        this.d.b(list, new com.google.android.play.core.splitinstall.testing.c(this, list2, j, z, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i, int i2) {
        a(i, i2);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int i, int i2, java.lang.Long l, java.lang.Long l2, java.util.List<java.lang.String> list, java.lang.Integer num) {
        a(i, i2, l, l2, list, num);
        c();
    }

    private final void c() {
        this.a.post(new com.google.android.play.core.splitinstall.testing.a(this));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<java.lang.Void> cancelInstall(int i) {
        java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitinstall.SplitInstallSessionState> atomicReference = k;
        int iStatus = atomicReference.get().status();
        if (i != atomicReference.get().sessionId() || iStatus != 1) {
            return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-3));
        }
        b(7, atomicReference.get().errorCode());
        return com.google.android.play.core.tasks.Tasks.a((java.lang.Object) null);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> list) {
        return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> list) {
        return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> list) {
        return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> list) {
        return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public java.util.Set<java.lang.String> getInstalledLanguages() {
        return new java.util.HashSet(this.m);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public java.util.Set<java.lang.String> getInstalledModules() {
        return new java.util.HashSet(this.l);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int i) {
        return com.google.android.play.core.tasks.Tasks.a(k.get());
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
        return com.google.android.play.core.tasks.Tasks.a(java.util.Arrays.asList(k.get()));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.g.a(splitInstallStateUpdatedListener);
    }

    public void setShouldNetworkError(boolean z) {
        this.n.set(z);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x017f  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01cf A[SYNTHETIC] */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest) {
        java.io.File[] fileArr;
        int i;
        boolean z;
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> mapA;
        java.util.Iterator<java.util.Locale> it;
        boolean z2;
        java.util.Locale next;
        java.util.concurrent.atomic.AtomicReference<com.google.android.play.core.splitinstall.SplitInstallSessionState> atomicReference = k;
        if (!atomicReference.get().hasTerminalStatus()) {
            a(6, -1);
            return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-1));
        }
        int i2 = 1;
        int iSessionId = atomicReference.get().sessionId() + 1;
        b(0, 0, 0L, null, new java.util.ArrayList(), java.lang.Integer.valueOf(iSessionId));
        b(1, 0, 0L, null, splitInstallRequest.getModuleNames(), java.lang.Integer.valueOf(iSessionId));
        java.util.Iterator<java.util.Locale> it2 = splitInstallRequest.getLanguages().iterator();
        while (it2.hasNext()) {
            this.m.add(it2.next().getLanguage());
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] fileArrListFiles = this.j.listFiles();
        if (fileArrListFiles == null) {
            android.util.Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
            b(6, -5);
            return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5));
        }
        int length = fileArrListFiles.length;
        char c = 0;
        long totalSpace = 0;
        int i3 = 0;
        while (i3 < length) {
            java.io.File file = fileArrListFiles[i3];
            java.lang.String strA = a(file);
            if (splitInstallRequest.getModuleNames().contains(a(strA))) {
                java.lang.String strA2 = a(strA);
                java.util.HashSet<java.lang.String> hashSet2 = new java.util.HashSet(this.f.a());
                com.google.android.play.core.splitinstall.f fVarC = this.e.c();
                fileArr = fileArrListFiles;
                java.lang.String[] strArr = new java.lang.String[i2];
                strArr[c] = strA2;
                java.util.Map<java.lang.String, java.util.Set<java.lang.String>> mapA2 = fVarC.a(java.util.Arrays.asList(strArr));
                java.util.HashSet hashSet3 = new java.util.HashSet();
                java.util.Iterator<java.util.Set<java.lang.String>> it3 = mapA2.values().iterator();
                while (it3.hasNext()) {
                    hashSet3.addAll(it3.next());
                }
                java.util.HashSet hashSet4 = new java.util.HashSet();
                for (java.lang.String str : hashSet2) {
                    if (str.contains(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR)) {
                        str = str.split(io.fabric.sdk.android.services.events.EventsFilesManager.ROLL_OVER_FILE_NAME_SEPARATOR, -1)[0];
                    }
                    hashSet4.add(str);
                    length = length;
                }
                i = length;
                hashSet4.addAll(this.m);
                java.util.HashSet hashSet5 = new java.util.HashSet();
                for (java.util.Map.Entry<java.lang.String, java.util.Set<java.lang.String>> entry : mapA2.entrySet()) {
                    if (hashSet4.contains(entry.getKey())) {
                        hashSet5.addAll(entry.getValue());
                    }
                }
                z = !hashSet3.contains(strA) || hashSet5.contains(strA);
                if (z) {
                    totalSpace += file.getTotalSpace();
                    hashSet.add(a(file));
                    arrayList.add(file);
                } else {
                    java.util.List<java.util.Locale> languages = splitInstallRequest.getLanguages();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(this.l);
                    arrayList2.addAll(java.util.Arrays.asList("", "base"));
                    mapA = this.e.c().a(arrayList2);
                    it = languages.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        next = it.next();
                        if (!mapA.containsKey(next.getLanguage()) && mapA.get(next.getLanguage()).contains(strA)) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        totalSpace += file.getTotalSpace();
                        hashSet.add(a(file));
                        arrayList.add(file);
                    }
                }
                i3++;
                fileArrListFiles = fileArr;
                length = i;
                c = 0;
                i2 = 1;
            } else {
                fileArr = fileArrListFiles;
                i = length;
            }
            if (z) {
                java.util.List<java.util.Locale> languages2 = splitInstallRequest.getLanguages();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(this.l);
                arrayList3.addAll(java.util.Arrays.asList("", "base"));
                mapA = this.e.c().a(arrayList3);
                it = languages2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    next = it.next();
                    if (!mapA.containsKey(next.getLanguage())) {
                    }
                }
                if (z2) {
                    totalSpace += file.getTotalSpace();
                    hashSet.add(a(file));
                    arrayList.add(file);
                }
            } else {
                totalSpace += file.getTotalSpace();
                hashSet.add(a(file));
                arrayList.add(file);
            }
            i3++;
            fileArrListFiles = fileArr;
            length = i;
            c = 0;
            i2 = 1;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(hashSet);
        java.lang.String strValueOf2 = java.lang.String.valueOf(splitInstallRequest.getModuleNames());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 21 + java.lang.String.valueOf(strValueOf2).length());
        sb.append("availableSplits");
        sb.append(strValueOf);
        sb.append(" want ");
        sb.append(strValueOf2);
        android.util.Log.i("FakeSplitInstallManager", sb.toString());
        if (!hashSet.containsAll(new java.util.HashSet(splitInstallRequest.getModuleNames()))) {
            b(6, -2);
            return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-2));
        }
        b(1, 0, 0L, java.lang.Long.valueOf(totalSpace), splitInstallRequest.getModuleNames(), java.lang.Integer.valueOf(iSessionId));
        this.h.execute(new com.google.android.play.core.splitinstall.testing.b(this, arrayList));
        return com.google.android.play.core.tasks.Tasks.a(java.lang.Integer.valueOf(iSessionId));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.g.b(splitInstallStateUpdatedListener);
    }
}
