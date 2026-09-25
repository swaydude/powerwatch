package bleshadow.dagger.releasablereferences;

/* JADX INFO: loaded from: classes.dex */
public interface ReleasableReferenceManager {
    void releaseStrongReferences();

    void restoreStrongReferences();

    java.lang.Class<? extends java.lang.annotation.Annotation> scope();
}
