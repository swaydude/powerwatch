package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class ResourceUnityVersionProvider implements com.crashlytics.android.core.UnityVersionProvider {
    private final android.content.Context context;
    private final com.crashlytics.android.core.UnityVersionProvider fallback;
    private boolean hasRead = false;
    private java.lang.String unityVersion;

    public ResourceUnityVersionProvider(android.content.Context context, com.crashlytics.android.core.UnityVersionProvider unityVersionProvider) {
        this.context = context;
        this.fallback = unityVersionProvider;
    }

    @Override // com.crashlytics.android.core.UnityVersionProvider
    public java.lang.String getUnityVersion() {
        if (!this.hasRead) {
            this.unityVersion = io.fabric.sdk.android.services.common.CommonUtils.resolveUnityEditorVersion(this.context);
            this.hasRead = true;
        }
        java.lang.String str = this.unityVersion;
        if (str != null) {
            return str;
        }
        com.crashlytics.android.core.UnityVersionProvider unityVersionProvider = this.fallback;
        if (unityVersionProvider != null) {
            return unityVersionProvider.getUnityVersion();
        }
        return null;
    }
}
