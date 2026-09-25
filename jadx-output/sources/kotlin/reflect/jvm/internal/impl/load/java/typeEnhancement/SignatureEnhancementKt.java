package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SignatureEnhancementKt {
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers createJavaTypeQualifiers(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        if (!z2 || nullabilityQualifier != kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) {
            return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, false, z);
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, true, z);
    }

    public static final <T> T select(java.util.Set<? extends T> select, T low, T high, T t, boolean z) {
        java.util.Set<? extends T> set;
        T t2;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "$this$select");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(low, "low");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(high, "high");
        if (z) {
            if (select.contains(low)) {
                t2 = low;
            } else {
                t2 = select.contains(high) ? high : null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(t2, low) && kotlin.jvm.internal.Intrinsics.areEqual(t, high)) {
                return null;
            }
            return t != null ? t : t2;
        }
        if (t != null && (set = kotlin.collections.CollectionsKt.toSet(kotlin.collections.SetsKt.plus(select, t))) != null) {
            select = set;
        }
        return (T) kotlin.collections.CollectionsKt.singleOrNull(select);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier select(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier> select, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier nullabilityQualifier, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(select, "$this$select");
        if (nullabilityQualifier == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY) {
            return kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY;
        }
        return (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) select(select, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }
}
