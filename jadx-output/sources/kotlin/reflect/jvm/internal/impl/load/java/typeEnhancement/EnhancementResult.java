package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
final class EnhancementResult<T> {
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations enhancementAnnotations;
    private final T result;

    public final T component1() {
        return this.result;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations component2() {
        return this.enhancementAnnotations;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult enhancementResult = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.result, enhancementResult.result) && kotlin.jvm.internal.Intrinsics.areEqual(this.enhancementAnnotations, enhancementResult.enhancementAnnotations);
    }

    public int hashCode() {
        T t = this.result;
        int iHashCode = (t != null ? t.hashCode() : 0) * 31;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = this.enhancementAnnotations;
        return iHashCode + (annotations != null ? annotations.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "EnhancementResult(result=" + this.result + ", enhancementAnnotations=" + this.enhancementAnnotations + ")";
    }

    public EnhancementResult(T t, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations) {
        this.result = t;
        this.enhancementAnnotations = annotations;
    }
}
