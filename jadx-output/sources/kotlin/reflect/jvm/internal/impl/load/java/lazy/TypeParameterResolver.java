package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: resolvers.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface TypeParameterResolver {
    kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter);

    /* JADX INFO: compiled from: resolvers.kt */
    public static final class EMPTY implements kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver {
        public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver.EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        public kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaTypeParameter, "javaTypeParameter");
            return null;
        }

        private EMPTY() {
        }
    }
}
