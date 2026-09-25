package kotlin.reflect.jvm;

/* JADX INFO: compiled from: ReflectJvmMapping.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010%\u001a\u0004\u0018\u00010&*\u00020'H\u0002\"/\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00038F¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\b\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"-\u0010\u001d\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001e*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001b\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010!\"\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n*\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"javaConstructor", "Ljava/lang/reflect/Constructor;", "T", "Lkotlin/reflect/KFunction;", "javaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "getJavaConstructor", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "javaField", "Ljava/lang/reflect/Field;", "Lkotlin/reflect/KProperty;", "getJavaField", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaGetter", "Ljava/lang/reflect/Method;", "getJavaGetter", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaMethod", "getJavaMethod", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KMutableProperty;", "getJavaSetter", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "kotlinFunction", "", "getKotlinFunction", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/KFunction;", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;", "kotlinProperty", "getKotlinProperty", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/KProperty;", "getKPackage", "Lkotlin/reflect/KDeclarationContainer;", "Ljava/lang/reflect/Member;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class ReflectJvmMapping {

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
        }
    }

    public static /* synthetic */ void javaConstructor$annotations(kotlin.reflect.KFunction kFunction) {
    }

    public static final java.lang.reflect.Field getJavaField(kotlin.reflect.KProperty<?> javaField) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaField, "$this$javaField");
        kotlin.reflect.jvm.internal.KPropertyImpl<?> kPropertyImplAsKPropertyImpl = kotlin.reflect.jvm.internal.UtilKt.asKPropertyImpl(javaField);
        if (kPropertyImplAsKPropertyImpl != null) {
            return kPropertyImplAsKPropertyImpl.getJavaField();
        }
        return null;
    }

    public static final java.lang.reflect.Method getJavaGetter(kotlin.reflect.KProperty<?> javaGetter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaGetter, "$this$javaGetter");
        return getJavaMethod(javaGetter.getGetter());
    }

    public static final java.lang.reflect.Method getJavaSetter(kotlin.reflect.KMutableProperty<?> javaSetter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaSetter, "$this$javaSetter");
        return getJavaMethod(javaSetter.getSetter());
    }

    public static final java.lang.reflect.Method getJavaMethod(kotlin.reflect.KFunction<?> javaMethod) {
        kotlin.reflect.jvm.internal.calls.Caller<?> caller;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaMethod, "$this$javaMethod");
        kotlin.reflect.jvm.internal.KCallableImpl<?> kCallableImplAsKCallableImpl = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(javaMethod);
        java.lang.reflect.Member memberMo1260getMember = (kCallableImplAsKCallableImpl == null || (caller = kCallableImplAsKCallableImpl.getCaller()) == null) ? null : caller.mo1260getMember();
        return (java.lang.reflect.Method) (memberMo1260getMember instanceof java.lang.reflect.Method ? memberMo1260getMember : null);
    }

    public static final <T> java.lang.reflect.Constructor<T> getJavaConstructor(kotlin.reflect.KFunction<? extends T> javaConstructor) {
        kotlin.reflect.jvm.internal.calls.Caller<?> caller;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaConstructor, "$this$javaConstructor");
        kotlin.reflect.jvm.internal.KCallableImpl<?> kCallableImplAsKCallableImpl = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(javaConstructor);
        java.lang.reflect.Member memberMo1260getMember = (kCallableImplAsKCallableImpl == null || (caller = kCallableImplAsKCallableImpl.getCaller()) == null) ? null : caller.mo1260getMember();
        return (java.lang.reflect.Constructor) (memberMo1260getMember instanceof java.lang.reflect.Constructor ? memberMo1260getMember : null);
    }

    public static final java.lang.reflect.Type getJavaType(kotlin.reflect.KType javaType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaType, "$this$javaType");
        return ((kotlin.reflect.jvm.internal.KTypeImpl) javaType).getJavaType$kotlin_reflection();
    }

    public static final kotlin.reflect.KProperty<?> getKotlinProperty(java.lang.reflect.Field kotlinProperty) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinProperty, "$this$kotlinProperty");
        java.lang.Object obj = null;
        if (kotlinProperty.isSynthetic()) {
            return null;
        }
        kotlin.reflect.KDeclarationContainer kPackage = getKPackage(kotlinProperty);
        if (kPackage != null) {
            java.util.Collection<kotlin.reflect.KCallable<?>> members = kPackage.getMembers();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : members) {
                if (obj2 instanceof kotlin.reflect.KProperty) {
                    arrayList.add(obj2);
                }
            }
            for (java.lang.Object obj3 : arrayList) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(getJavaField((kotlin.reflect.KProperty) obj3), kotlinProperty)) {
                    obj = obj3;
                    break;
                }
            }
            return (kotlin.reflect.KProperty) obj;
        }
        java.lang.Class<?> declaringClass = kotlinProperty.getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "declaringClass");
        for (java.lang.Object obj4 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass))) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(getJavaField((kotlin.reflect.KProperty1) obj4), kotlinProperty)) {
                obj = obj4;
                break;
            }
        }
        return (kotlin.reflect.KProperty) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final kotlin.reflect.KDeclarationContainer getKPackage(java.lang.reflect.Member member) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader classHeader;
        kotlin.reflect.jvm.internal.components.ReflectKotlinClass.Companion companion = kotlin.reflect.jvm.internal.components.ReflectKotlinClass.INSTANCE;
        java.lang.Class<?> declaringClass = member.getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "declaringClass");
        kotlin.reflect.jvm.internal.components.ReflectKotlinClass reflectKotlinClassCreate = companion.create(declaringClass);
        java.lang.String str = null;
        java.lang.Object[] objArr = 0;
        kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind kind = (reflectKotlinClassCreate == null || (classHeader = reflectKotlinClassCreate.getClassHeader()) == null) ? null : classHeader.getKind();
        if (kind == null) {
            return null;
        }
        int i = kotlin.reflect.jvm.ReflectJvmMapping.WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        int i2 = 2;
        if (i != 1 && i != 2 && i != 3) {
            return null;
        }
        java.lang.Class<?> declaringClass2 = member.getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass2, "declaringClass");
        return new kotlin.reflect.jvm.internal.KPackageImpl(declaringClass2, str, i2, objArr == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    public static final kotlin.reflect.KFunction<?> getKotlinFunction(java.lang.reflect.Method kotlinFunction) {
        java.lang.Object next;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinFunction, "$this$kotlinFunction");
        java.lang.Object obj = null;
        if (java.lang.reflect.Modifier.isStatic(kotlinFunction.getModifiers())) {
            kotlin.reflect.KDeclarationContainer kPackage = getKPackage(kotlinFunction);
            if (kPackage != null) {
                java.util.Collection<kotlin.reflect.KCallable<?>> members = kPackage.getMembers();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : members) {
                    if (obj2 instanceof kotlin.reflect.KFunction) {
                        arrayList.add(obj2);
                    }
                }
                for (java.lang.Object obj3 : arrayList) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(getJavaMethod((kotlin.reflect.KFunction) obj3), kotlinFunction)) {
                        obj = obj3;
                        break;
                    }
                }
                return (kotlin.reflect.KFunction) obj;
            }
            java.lang.Class<?> declaringClass = kotlinFunction.getDeclaringClass();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "declaringClass");
            kotlin.reflect.KClass<?> companionObject = kotlin.reflect.full.KClasses.getCompanionObject(kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass));
            if (companionObject != null) {
                java.util.Iterator<T> it = kotlin.reflect.full.KClasses.getFunctions(companionObject).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    java.lang.reflect.Method javaMethod = getJavaMethod((kotlin.reflect.KFunction) next);
                    if (javaMethod == null || !kotlin.jvm.internal.Intrinsics.areEqual(javaMethod.getName(), kotlinFunction.getName())) {
                        z = false;
                    } else {
                        java.lang.Class<?>[] parameterTypes = javaMethod.getParameterTypes();
                        if (parameterTypes == null) {
                            kotlin.jvm.internal.Intrinsics.throwNpe();
                        }
                        java.lang.Class<?>[] parameterTypes2 = kotlinFunction.getParameterTypes();
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterTypes2, "this.parameterTypes");
                        if (java.util.Arrays.equals(parameterTypes, parameterTypes2) && kotlin.jvm.internal.Intrinsics.areEqual(javaMethod.getReturnType(), kotlinFunction.getReturnType())) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                } while (!z);
                kotlin.reflect.KFunction<?> kFunction = (kotlin.reflect.KFunction) next;
                if (kFunction != null) {
                    return kFunction;
                }
            }
        }
        java.lang.Class<?> declaringClass2 = kotlinFunction.getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass2, "declaringClass");
        for (java.lang.Object obj4 : kotlin.reflect.full.KClasses.getFunctions(kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass2))) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(getJavaMethod((kotlin.reflect.KFunction) obj4), kotlinFunction)) {
                obj = obj4;
                break;
            }
        }
        return (kotlin.reflect.KFunction) obj;
    }

    public static final <T> kotlin.reflect.KFunction<T> getKotlinFunction(java.lang.reflect.Constructor<T> kotlinFunction) {
        T next;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kotlinFunction, "$this$kotlinFunction");
        java.lang.Class<T> declaringClass = kotlinFunction.getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaringClass, "declaringClass");
        java.util.Iterator<T> it = kotlin.jvm.JvmClassMappingKt.getKotlinClass(declaringClass).getConstructors().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(getJavaConstructor((kotlin.reflect.KFunction) next), kotlinFunction)) {
                return (kotlin.reflect.KFunction) next;
            }
        }
        next = null;
        return (kotlin.reflect.KFunction) next;
    }
}
