package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaConstructor;", "member", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getMember", "()Ljava/lang/reflect/Constructor;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaConstructor extends kotlin.reflect.jvm.internal.structure.ReflectJavaMember implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor {
    private final java.lang.reflect.Constructor<?> member;

    public ReflectJavaConstructor(java.lang.reflect.Constructor<?> member) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(member, "member");
        this.member = member;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaMember
    public java.lang.reflect.Constructor<?> getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    public java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters() {
        java.lang.reflect.Type[] realTypes = getMember().getGenericParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(realTypes, "types");
        if (realTypes.length == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.Class<?> klass = getMember().getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(klass, "klass");
        if (klass.getDeclaringClass() != null && !java.lang.reflect.Modifier.isStatic(klass.getModifiers())) {
            realTypes = (java.lang.reflect.Type[]) kotlin.collections.ArraysKt.copyOfRange(realTypes, 1, realTypes.length);
        }
        java.lang.annotation.Annotation[][] realAnnotations = getMember().getParameterAnnotations();
        java.lang.annotation.Annotation[][] annotationArr = realAnnotations;
        if (annotationArr.length < realTypes.length) {
            throw new java.lang.IllegalStateException("Illegal generic signature: " + getMember());
        }
        if (annotationArr.length > realTypes.length) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(realAnnotations, "annotations");
            realAnnotations = (java.lang.annotation.Annotation[][]) kotlin.collections.ArraysKt.copyOfRange(annotationArr, annotationArr.length - realTypes.length, annotationArr.length);
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(realTypes, "realTypes");
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(realAnnotations, "realAnnotations");
        return getValueParameters(realTypes, realAnnotations, getMember().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>>[] typeParameters = getMember().getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "member.typeParameters");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }
}
