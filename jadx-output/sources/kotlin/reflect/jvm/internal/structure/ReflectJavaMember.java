package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0\"2\u0006\u0010&\u001a\u00020\u001bH\u0004¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;", "()V", "containingClass", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "getContainingClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "member", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "modifiers", "", "getModifiers", "()I", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "getValueParameters", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "isVararg", "([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;", "hashCode", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public abstract class ReflectJavaMember extends kotlin.reflect.jvm.internal.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner {
    public abstract java.lang.reflect.Member getMember();

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation> getAnnotations() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.getVisibility(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.isAbstract(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.isFinal(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner.DefaultImpls.isStatic(this);
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner
    public java.lang.reflect.AnnotatedElement getElement() {
        java.lang.reflect.Member member = getMember();
        if (member != null) {
            return (java.lang.reflect.AnnotatedElement) member;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return getMember().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier;
        java.lang.String name = getMember().getName();
        if (name != null && (nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name)) != null) {
            return nameIdentifier;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.name.SpecialNames.NO_NAME_PROVIDED;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name2, "SpecialNames.NO_NAME_PROVIDED");
        return name2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    public kotlin.reflect.jvm.internal.structure.ReflectJavaClass getContainingClass() {
        java.lang.Class<?> declaringClass = getMember().getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "member.declaringClass");
        return new kotlin.reflect.jvm.internal.structure.ReflectJavaClass(declaringClass);
    }

    protected final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters(java.lang.reflect.Type[] parameterTypes, java.lang.annotation.Annotation[][] parameterAnnotations, boolean isVararg) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameterAnnotations, "parameterAnnotations");
        java.util.ArrayList arrayList = new java.util.ArrayList(parameterTypes.length);
        java.util.List<java.lang.String> listLoadParameterNames = kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.INSTANCE.loadParameterNames(getMember());
        int size = listLoadParameterNames != null ? listLoadParameterNames.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            kotlin.reflect.jvm.internal.structure.ReflectJavaType reflectJavaTypeCreate = kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE.create(parameterTypes[i]);
            if (listLoadParameterNames != null) {
                str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(listLoadParameterNames, i + size);
                if (str == null) {
                    throw new java.lang.IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + reflectJavaTypeCreate + ") in " + listLoadParameterNames + "@ReflectJavaMember").toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new kotlin.reflect.jvm.internal.structure.ReflectJavaValueParameter(reflectJavaTypeCreate, parameterAnnotations[i], str, isVararg && i == kotlin.collections.ArraysKt.getLastIndex(parameterTypes)));
            i++;
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaMember) && kotlin.jvm.internal.Intrinsics.areEqual(getMember(), ((kotlin.reflect.jvm.internal.structure.ReflectJavaMember) other).getMember());
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + getMember();
    }
}
