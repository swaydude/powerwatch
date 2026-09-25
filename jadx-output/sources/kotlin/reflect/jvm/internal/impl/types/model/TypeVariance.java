package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");

    private final java.lang.String presentation;

    TypeVariance(java.lang.String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.presentation;
    }
}
