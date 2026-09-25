package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: SupertypeLoopChecker.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface SupertypeLoopChecker {
    java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> findLoopsInSupertypesAndDisconnect(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>> function1, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.Unit> function2);

    /* JADX INFO: compiled from: SupertypeLoopChecker.kt */
    public static final class EMPTY implements kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker {
        public static final kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY INSTANCE = new kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> findLoopsInSupertypesAndDisconnect(kotlin.reflect.jvm.internal.impl.types.TypeConstructor currentTypeConstructor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> superTypes, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.TypeConstructor, ? extends java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType>> neighbors, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.Unit> reportLoop) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(currentTypeConstructor, "currentTypeConstructor");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(superTypes, "superTypes");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(neighbors, "neighbors");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(reportLoop, "reportLoop");
            return superTypes;
        }

        private EMPTY() {
        }
    }
}
