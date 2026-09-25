package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001c\u0010\r\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001H\u0002J$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002J\u001a\u0010\u0018\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0006H\u0002¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "()V", "loadClassAnnotations", "", "klass", "Ljava/lang/Class;", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "loadConstructorAnnotations", "memberVisitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "loadFieldAnnotations", "loadMethodAnnotations", "processAnnotation", "annotation", "", "processAnnotationArgumentValue", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationArgumentVisitor;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "processAnnotationArguments", "annotationType", "visitMembers", "classLiteralValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ClassLiteralValue;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
final class ReflectClassStructure {
    public static final kotlin.reflect.jvm.internal.components.ReflectClassStructure INSTANCE = new kotlin.reflect.jvm.internal.components.ReflectClassStructure();

    private ReflectClassStructure() {
    }

    public final void loadClassAnnotations(java.lang.Class<?> klass, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor visitor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(visitor, "visitor");
        for (java.lang.annotation.Annotation annotation : klass.getDeclaredAnnotations()) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation, "annotation");
            processAnnotation(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void visitMembers(java.lang.Class<?> klass, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor memberVisitor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(klass, "klass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(memberVisitor, "memberVisitor");
        loadMethodAnnotations(klass, memberVisitor);
        loadConstructorAnnotations(klass, memberVisitor);
        loadFieldAnnotations(klass, memberVisitor);
    }

    private final void loadMethodAnnotations(java.lang.Class<?> klass, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method[] methodArr;
        java.lang.reflect.Method[] declaredMethods = klass.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            java.lang.reflect.Method method = declaredMethods[i];
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(method, "method");
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(method.getName());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(method.name)");
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(nameIdentifier, kotlin.reflect.jvm.internal.components.SignatureSerializer.INSTANCE.methodDesc(method));
            if (methodAnnotationVisitorVisitMethod != null) {
                for (java.lang.annotation.Annotation annotation : method.getDeclaredAnnotations()) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation, "annotation");
                    processAnnotation(methodAnnotationVisitorVisitMethod, annotation);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterAnnotations, "method.parameterAnnotations");
                int length2 = parameterAnnotations.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    java.lang.annotation.Annotation[] annotationArr = parameterAnnotations[i2];
                    int length3 = annotationArr.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        java.lang.annotation.Annotation annotation2 = annotationArr[i3];
                        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation2));
                        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(javaClass);
                        java.lang.reflect.Method[] methodArr2 = declaredMethods;
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation2, "annotation");
                        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i2, classId, new kotlin.reflect.jvm.internal.components.ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitParameterAnnotation, annotation2, javaClass);
                        }
                        i3++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                methodAnnotationVisitorVisitMethod.visitEnd();
            } else {
                methodArr = declaredMethods;
            }
            i++;
            declaredMethods = methodArr;
        }
    }

    private final void loadConstructorAnnotations(java.lang.Class<?> klass, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Constructor<?>[] constructorArr;
        int i;
        java.lang.reflect.Constructor<?>[] declaredConstructors = klass.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            java.lang.reflect.Constructor<?> constructor = declaredConstructors[i2];
            kotlin.reflect.jvm.internal.impl.name.Name nameSpecial = kotlin.reflect.jvm.internal.impl.name.Name.special("<init>");
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameSpecial, "Name.special(\"<init>\")");
            kotlin.reflect.jvm.internal.components.SignatureSerializer signatureSerializer = kotlin.reflect.jvm.internal.components.SignatureSerializer.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(constructor, "constructor");
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(nameSpecial, signatureSerializer.constructorDesc(constructor));
            if (methodAnnotationVisitorVisitMethod != null) {
                for (java.lang.annotation.Annotation annotation : constructor.getDeclaredAnnotations()) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation, "annotation");
                    processAnnotation(methodAnnotationVisitorVisitMethod, annotation);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterAnnotations, "parameterAnnotations");
                java.lang.annotation.Annotation[][] annotationArr = parameterAnnotations;
                if (!(annotationArr.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - annotationArr.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        java.lang.annotation.Annotation[] annotationArr2 = parameterAnnotations[i3];
                        int length4 = annotationArr2.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            java.lang.annotation.Annotation annotation2 = annotationArr2[i4];
                            java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation2));
                            java.lang.reflect.Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i5 = length;
                            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(javaClass);
                            int i6 = length2;
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation2, "annotation");
                            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i3 + length2, classId, new kotlin.reflect.jvm.internal.components.ReflectAnnotationSource(annotation2));
                            if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitParameterAnnotation, annotation2, javaClass);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                            length2 = i6;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                methodAnnotationVisitorVisitMethod.visitEnd();
            } else {
                constructorArr = declaredConstructors;
                i = length;
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    private final void loadFieldAnnotations(java.lang.Class<?> klass, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws java.lang.reflect.InvocationTargetException {
        for (java.lang.reflect.Field field : klass.getDeclaredFields()) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(field, "field");
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(field.getName());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(field.name)");
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorVisitField = memberVisitor.visitField(nameIdentifier, kotlin.reflect.jvm.internal.components.SignatureSerializer.INSTANCE.fieldDesc(field), null);
            if (annotationVisitorVisitField != null) {
                for (java.lang.annotation.Annotation annotation : field.getDeclaredAnnotations()) {
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotation, "annotation");
                    processAnnotation(annotationVisitorVisitField, annotation);
                }
                annotationVisitorVisitField.visitEnd();
            }
        }
    }

    private final void processAnnotation(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor visitor, java.lang.annotation.Annotation annotation) throws java.lang.reflect.InvocationTargetException {
        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation));
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = visitor.visitAnnotation(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(javaClass), new kotlin.reflect.jvm.internal.components.ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorVisitAnnotation != null) {
            INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitAnnotation, annotation, javaClass);
        }
    }

    private final void processAnnotationArguments(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitor, java.lang.annotation.Annotation annotation, java.lang.Class<?> annotationType) throws java.lang.reflect.InvocationTargetException {
        for (java.lang.reflect.Method method : annotationType.getDeclaredMethods()) {
            try {
                java.lang.Object objInvoke = method.invoke(annotation, new java.lang.Object[0]);
                if (objInvoke == null) {
                    kotlin.jvm.internal.Intrinsics.throwNpe();
                }
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(method, "method");
                kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(method.getName());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(method.name)");
                processAnnotationArgumentValue(visitor, nameIdentifier, objInvoke);
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        visitor.visitEnd();
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue classLiteralValue(java.lang.Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Void.TYPE)) {
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FQ_NAMES.unit.toSafe());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(classId, i);
            }
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(cls.getName());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(jvmPrimitiveType, "JvmPrimitiveType.get(currentClass.name)");
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(primitiveType, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
            if (i > 0) {
                kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(primitiveType.getArrayTypeFqName());
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId2, "ClassId.topLevel(primitiveType.arrayTypeFqName)");
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(classId2, i - 1);
            }
            kotlin.reflect.jvm.internal.impl.name.ClassId classId3 = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(primitiveType.getTypeFqName());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classId3, "ClassId.topLevel(primitiveType.typeFqName)");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(classId3, i);
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classId4 = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(cls);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameAsSingleFqName = classId4.asSingleFqName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(fqNameAsSingleFqName, "javaClassId.asSingleFqName()");
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(fqNameAsSingleFqName);
        if (classIdMapJavaToKotlin != null) {
            classId4 = classIdMapJavaToKotlin;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(classId4, i);
    }

    private final void processAnnotationArgumentValue(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitor, kotlin.reflect.jvm.internal.impl.name.Name name, java.lang.Object value) throws java.lang.reflect.InvocationTargetException {
        java.lang.Class<?> enclosingClass = value.getClass();
        if (kotlin.jvm.internal.Intrinsics.areEqual(enclosingClass, java.lang.Class.class)) {
            if (value == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
            visitor.visitClassLiteral(name, classLiteralValue((java.lang.Class) value));
            return;
        }
        if (kotlin.reflect.jvm.internal.components.ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT.contains(enclosingClass)) {
            visitor.visit(name, value);
            return;
        }
        if (kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(enclosingClass, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(enclosingClass);
            if (value == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
            }
            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(((java.lang.Enum) value).name());
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier((value as Enum<*>).name)");
            visitor.visitEnum(name, classId, nameIdentifier);
            return;
        }
        if (java.lang.annotation.Annotation.class.isAssignableFrom(enclosingClass)) {
            java.lang.Class<?>[] interfaces = enclosingClass.getInterfaces();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(interfaces, "clazz.interfaces");
            java.lang.Class<?> annotationClass = (java.lang.Class) kotlin.collections.ArraysKt.single(interfaces);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(annotationClass, "annotationClass");
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = visitor.visitAnnotation(name, kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(annotationClass));
            if (annotationArgumentVisitorVisitAnnotation != null) {
                if (value == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Annotation");
                }
                processAnnotationArguments(annotationArgumentVisitorVisitAnnotation, (java.lang.annotation.Annotation) value, annotationClass);
                return;
            }
            return;
        }
        if (enclosingClass.isArray()) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorVisitArray = visitor.visitArray(name);
            if (annotationArrayArgumentVisitorVisitArray != null) {
                java.lang.Class<?> componentType = enclosingClass.getComponentType();
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(componentType, "componentType");
                int i = 0;
                if (componentType.isEnum()) {
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(componentType);
                    if (value != null) {
                        java.lang.Object[] objArr = (java.lang.Object[]) value;
                        int length = objArr.length;
                        while (i < length) {
                            java.lang.Object obj = objArr[i];
                            if (obj == null) {
                                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
                            }
                            kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(((java.lang.Enum) obj).name());
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier2, "Name.identifier((element as Enum<*>).name)");
                            annotationArrayArgumentVisitorVisitArray.visitEnum(classId2, nameIdentifier2);
                            i++;
                        }
                    } else {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(componentType, java.lang.Class.class)) {
                    if (value == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                    }
                    java.lang.Object[] objArr2 = (java.lang.Object[]) value;
                    int length2 = objArr2.length;
                    while (i < length2) {
                        java.lang.Object obj2 = objArr2[i];
                        if (obj2 == null) {
                            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
                        }
                        annotationArrayArgumentVisitorVisitArray.visitClassLiteral(classLiteralValue((java.lang.Class) obj2));
                        i++;
                    }
                } else if (value != null) {
                    java.lang.Object[] objArr3 = (java.lang.Object[]) value;
                    int length3 = objArr3.length;
                    while (i < length3) {
                        annotationArrayArgumentVisitorVisitArray.visit(objArr3[i]);
                        i++;
                    }
                } else {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                }
                annotationArrayArgumentVisitorVisitArray.visitEnd();
                return;
            }
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + value);
    }
}
