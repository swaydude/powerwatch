package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ReferenceReleasingProviderManager implements bleshadow.dagger.releasablereferences.ReleasableReferenceManager {
    private final java.util.Queue<java.lang.ref.WeakReference<bleshadow.dagger.internal.ReferenceReleasingProvider<?>>> providers = new java.util.concurrent.ConcurrentLinkedQueue();
    private final java.lang.Class<? extends java.lang.annotation.Annotation> scope;

    private enum Operation {
        RELEASE { // from class: bleshadow.dagger.internal.ReferenceReleasingProviderManager.Operation.1
            @Override // bleshadow.dagger.internal.ReferenceReleasingProviderManager.Operation
            void execute(bleshadow.dagger.internal.ReferenceReleasingProvider<?> provider) {
                provider.releaseStrongReference();
            }
        },
        RESTORE { // from class: bleshadow.dagger.internal.ReferenceReleasingProviderManager.Operation.2
            @Override // bleshadow.dagger.internal.ReferenceReleasingProviderManager.Operation
            void execute(bleshadow.dagger.internal.ReferenceReleasingProvider<?> provider) {
                provider.restoreStrongReference();
            }
        };

        abstract void execute(bleshadow.dagger.internal.ReferenceReleasingProvider<?> provider);
    }

    public ReferenceReleasingProviderManager(java.lang.Class<? extends java.lang.annotation.Annotation> scope) {
        this.scope = (java.lang.Class) bleshadow.dagger.internal.Preconditions.checkNotNull(scope);
    }

    public void addProvider(bleshadow.dagger.internal.ReferenceReleasingProvider<?> provider) {
        this.providers.add(new java.lang.ref.WeakReference<>(provider));
    }

    @Override // bleshadow.dagger.releasablereferences.ReleasableReferenceManager
    public java.lang.Class<? extends java.lang.annotation.Annotation> scope() {
        return this.scope;
    }

    @Override // bleshadow.dagger.releasablereferences.ReleasableReferenceManager
    public void releaseStrongReferences() {
        execute(bleshadow.dagger.internal.ReferenceReleasingProviderManager.Operation.RELEASE);
    }

    @Override // bleshadow.dagger.releasablereferences.ReleasableReferenceManager
    public void restoreStrongReferences() {
        execute(bleshadow.dagger.internal.ReferenceReleasingProviderManager.Operation.RESTORE);
    }

    private void execute(bleshadow.dagger.internal.ReferenceReleasingProviderManager.Operation operation) {
        java.util.Iterator<java.lang.ref.WeakReference<bleshadow.dagger.internal.ReferenceReleasingProvider<?>>> it = this.providers.iterator();
        while (it.hasNext()) {
            bleshadow.dagger.internal.ReferenceReleasingProvider<?> referenceReleasingProvider = it.next().get();
            if (referenceReleasingProvider == null) {
                it.remove();
            } else {
                operation.execute(referenceReleasingProvider);
            }
        }
    }
}
