package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes2.dex */
final class p implements com.google.android.play.core.splitinstall.SplitInstallManager {
    private final com.google.android.play.core.splitinstall.r a;
    private final com.google.android.play.core.splitinstall.n b;
    private final com.google.android.play.core.splitinstall.l c;
    private final com.google.android.play.core.splitinstall.aj d;
    private final android.os.Handler e;

    p(com.google.android.play.core.splitinstall.r rVar, android.content.Context context) {
        this(rVar, context, context.getPackageName());
    }

    private p(com.google.android.play.core.splitinstall.r rVar, android.content.Context context, java.lang.String str) {
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
        this.c = new com.google.android.play.core.splitinstall.l(context, str);
        this.a = rVar;
        this.b = com.google.android.play.core.splitinstall.n.a(context);
        this.d = new com.google.android.play.core.splitinstall.aj(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.List<java.lang.String> b(java.util.List<java.util.Locale> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.util.Locale locale : list) {
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                arrayList.add(locale.toLanguageTag());
            }
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> cancelInstall(int i) {
        return this.a.b(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredInstall(java.util.List<java.lang.String> list) {
        return this.a.b(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageInstall(java.util.List<java.util.Locale> list) {
        return android.os.Build.VERSION.SDK_INT < 21 ? com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5)) : this.a.c(b(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredLanguageUninstall(java.util.List<java.util.Locale> list) {
        return android.os.Build.VERSION.SDK_INT < 21 ? com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5)) : this.a.d(b(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Void> deferredUninstall(java.util.List<java.lang.String> list) {
        this.d.a(list);
        return this.a.a(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledLanguages() {
        java.util.Set<java.lang.String> setB = this.c.b();
        return setB == null ? java.util.Collections.emptySet() : setB;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final java.util.Set<java.lang.String> getInstalledModules() {
        return this.c.a();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<com.google.android.play.core.splitinstall.SplitInstallSessionState> getSessionState(int i) {
        return this.a.a(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.util.List<com.google.android.play.core.splitinstall.SplitInstallSessionState>> getSessionStates() {
        return this.a.a();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void registerListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.b.a((com.google.android.play.core.listener.StateUpdatedListener) splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState, android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        activity.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i, null, 0, 0, 0);
        return true;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest splitInstallRequest) {
        boolean zContainsAll;
        if (!splitInstallRequest.getLanguages().isEmpty() && android.os.Build.VERSION.SDK_INT < 21) {
            return com.google.android.play.core.tasks.Tasks.a((java.lang.Exception) new com.google.android.play.core.splitinstall.SplitInstallException(-5));
        }
        java.util.List<java.util.Locale> languages = splitInstallRequest.getLanguages();
        java.util.Set<java.lang.String> setB = this.c.b();
        if (setB == null) {
            zContainsAll = true;
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<java.util.Locale> it = languages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            zContainsAll = setB.containsAll(hashSet);
        }
        if (zContainsAll) {
            if (getInstalledModules().containsAll(splitInstallRequest.getModuleNames()) && (android.os.Build.VERSION.SDK_INT < 21 || java.util.Collections.disjoint(splitInstallRequest.getModuleNames(), this.d.a()))) {
                this.e.post(new com.google.android.play.core.splitinstall.o(this, splitInstallRequest));
                return com.google.android.play.core.tasks.Tasks.a(0);
            }
        }
        return this.a.a(splitInstallRequest.getModuleNames(), b(splitInstallRequest.getLanguages()));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void unregisterListener(com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.b.b(splitInstallStateUpdatedListener);
    }
}
