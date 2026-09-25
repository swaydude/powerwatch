package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Kit<Result> implements java.lang.Comparable<io.fabric.sdk.android.Kit> {
    android.content.Context context;
    io.fabric.sdk.android.Fabric fabric;
    io.fabric.sdk.android.services.common.IdManager idManager;
    io.fabric.sdk.android.InitializationCallback<Result> initializationCallback;
    io.fabric.sdk.android.InitializationTask<Result> initializationTask = new io.fabric.sdk.android.InitializationTask<>(this);
    final io.fabric.sdk.android.services.concurrency.DependsOn dependsOnAnnotation = (io.fabric.sdk.android.services.concurrency.DependsOn) getClass().getAnnotation(io.fabric.sdk.android.services.concurrency.DependsOn.class);

    protected abstract Result doInBackground();

    public abstract java.lang.String getIdentifier();

    public abstract java.lang.String getVersion();

    protected void onCancelled(Result result) {
    }

    protected void onPostExecute(Result result) {
    }

    protected boolean onPreExecute() {
        return true;
    }

    void injectParameters(android.content.Context context, io.fabric.sdk.android.Fabric fabric, io.fabric.sdk.android.InitializationCallback<Result> initializationCallback, io.fabric.sdk.android.services.common.IdManager idManager) {
        this.fabric = fabric;
        this.context = new io.fabric.sdk.android.FabricContext(context, getIdentifier(), getPath());
        this.initializationCallback = initializationCallback;
        this.idManager = idManager;
    }

    final void initialize() {
        this.initializationTask.executeOnExecutor(this.fabric.getExecutorService(), (java.lang.Object[]) new java.lang.Void[]{(java.lang.Void) null});
    }

    protected io.fabric.sdk.android.services.common.IdManager getIdManager() {
        return this.idManager;
    }

    public android.content.Context getContext() {
        return this.context;
    }

    public io.fabric.sdk.android.Fabric getFabric() {
        return this.fabric;
    }

    public java.lang.String getPath() {
        return ".Fabric" + java.io.File.separator + getIdentifier();
    }

    @Override // java.lang.Comparable
    public int compareTo(io.fabric.sdk.android.Kit kit) {
        if (containsAnnotatedDependency(kit)) {
            return 1;
        }
        if (kit.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (!hasAnnotatedDependency() || kit.hasAnnotatedDependency()) {
            return (hasAnnotatedDependency() || !kit.hasAnnotatedDependency()) ? 0 : -1;
        }
        return 1;
    }

    boolean containsAnnotatedDependency(io.fabric.sdk.android.Kit kit) {
        if (hasAnnotatedDependency()) {
            for (java.lang.Class<?> cls : this.dependsOnAnnotation.value()) {
                if (cls.isAssignableFrom(kit.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    protected java.util.Collection<io.fabric.sdk.android.services.concurrency.Task> getDependencies() {
        return this.initializationTask.getDependencies();
    }
}
