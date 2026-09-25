package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class TypedReleasableReferenceManagerDecorator<M extends java.lang.annotation.Annotation> implements bleshadow.dagger.releasablereferences.TypedReleasableReferenceManager<M> {
    private final bleshadow.dagger.releasablereferences.ReleasableReferenceManager delegate;
    private final M metadata;

    public TypedReleasableReferenceManagerDecorator(bleshadow.dagger.releasablereferences.ReleasableReferenceManager delegate, M metadata) {
        this.delegate = (bleshadow.dagger.releasablereferences.ReleasableReferenceManager) bleshadow.dagger.internal.Preconditions.checkNotNull(delegate);
        this.metadata = (M) bleshadow.dagger.internal.Preconditions.checkNotNull(metadata);
    }

    @Override // bleshadow.dagger.releasablereferences.ReleasableReferenceManager
    public java.lang.Class<? extends java.lang.annotation.Annotation> scope() {
        return this.delegate.scope();
    }

    @Override // bleshadow.dagger.releasablereferences.TypedReleasableReferenceManager
    public M metadata() {
        return this.metadata;
    }

    @Override // bleshadow.dagger.releasablereferences.ReleasableReferenceManager
    public void releaseStrongReferences() {
        this.delegate.releaseStrongReferences();
    }

    @Override // bleshadow.dagger.releasablereferences.ReleasableReferenceManager
    public void restoreStrongReferences() {
        this.delegate.restoreStrongReferences();
    }
}
