package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMethod;", "member", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "annotationParameterDefaultValue", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "getAnnotationParameterDefaultValue", "()Lorg/jetbrains/kotlin/load/java/structure/JavaAnnotationArgument;", "getMember", "()Ljava/lang/reflect/Method;", "returnType", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReturnType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaMethod extends kotlin.reflect.jvm.internal.structure.ReflectJavaMember implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod {
    private final java.lang.reflect.Method member;

    public ReflectJavaMethod(java.lang.reflect.Method member) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(member, "member");
        this.member = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public boolean getHasAnnotationParameterDefaultValue() {
        return kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod.DefaultImpls.getHasAnnotationParameterDefaultValue(this);
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaMember
    public java.lang.reflect.Method getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters() {
        java.lang.reflect.Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericParameterTypes, "member.genericParameterTypes");
        java.lang.annotation.Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterAnnotations, "member.parameterAnnotations");
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public kotlin.reflect.jvm.internal.structure.ReflectJavaType getReturnType() {
        kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion companion = kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE;
        java.lang.reflect.Type genericReturnType = getMember().getGenericReturnType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(genericReturnType, "member.genericReturnType");
        return companion.create(genericReturnType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument getAnnotationParameterDefaultValue() {
        java.lang.Object defaultValue = getMember().getDefaultValue();
        return defaultValue != null ? kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument.INSTANCE.create(defaultValue, null) : null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = getMember().getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "member.typeParameters");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Method> typeVariable : typeParameters) {
            arrayList.add(new kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }
}
