package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaStaticScope.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyJavaStaticScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> result) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(result, "result");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c) {
        super(c);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData resolveMethodSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod method, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> methodTypeParameters, kotlin.reflect.jvm.internal.impl.types.KotlinType returnType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(methodTypeParameters, "methodTypeParameters");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(returnType, "returnType");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(valueParameters, "valueParameters");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData(returnType, null, valueParameters, methodTypeParameters, false, kotlin.collections.CollectionsKt.emptyList());
    }
}
