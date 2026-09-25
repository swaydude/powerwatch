package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001an\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\u000b*\u00020\f\"\b\b\u0001\u0010\n*\u00020\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u0002H\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001d\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\n0\u0017¢\u0006\u0002\b\u0019H\u0000¢\u0006\u0002\u0010\u001a\u001a.\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002\u001a(\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010!\u001a\u00020\"H\u0002\u001a\"\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H&0(H\u0080\b¢\u0006\u0002\u0010)\u001a\u0014\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010,H\u0000\u001a\u0010\u0010-\u001a\u0004\u0018\u00010.*\u0004\u0018\u00010,H\u0000\u001a\u0014\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u000100*\u0004\u0018\u00010,H\u0000\u001a\u0012\u00101\u001a\b\u0012\u0004\u0012\u00020302*\u000204H\u0000\u001a\u000e\u00105\u001a\u0004\u0018\u000103*\u000206H\u0002\u001a\u0012\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e*\u000208H\u0000\u001a\u000e\u00109\u001a\u0004\u0018\u00010:*\u00020;H\u0000\u001a\u001a\u0010<\u001a\u0004\u0018\u00010,*\u0006\u0012\u0002\b\u00030=2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006>"}, d2 = {"JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "instanceReceiverParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "deserializeToDescriptor", "D", "M", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "moduleAnchor", "Ljava/lang/Class;", "proto", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "metadataVersion", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "createDescriptor", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "loadClass", "classLoader", "Ljava/lang/ClassLoader;", "packageName", "", "className", "arrayDimensions", "", "kotlinClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "reflectionCall", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "asKCallableImpl", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "asKFunctionImpl", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKPropertyImpl", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "computeAnnotations", "", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "toAnnotationInstance", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toJavaClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "toKVisibility", "Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "toRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class UtilKt {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName JVM_STATIC = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.JvmStatic");

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJVM_STATIC() {
        return JVM_STATIC;
    }

    public static final java.lang.Class<?> toJavaClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor toJavaClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(toJavaClass, "$this$toJavaClass");
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = toJavaClass.getSource();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(source, "source");
        if (source instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass binaryClass = ((kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) source).getBinaryClass();
            if (binaryClass != null) {
                return ((kotlin.reflect.jvm.internal.components.ReflectKotlinClass) binaryClass).getKlass();
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.components.ReflectKotlinClass");
        }
        if (source instanceof kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory.RuntimeSourceElement) {
            kotlin.reflect.jvm.internal.structure.ReflectJavaElement javaElement = ((kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            if (javaElement != null) {
                return ((kotlin.reflect.jvm.internal.structure.ReflectJavaClass) javaElement).getElement();
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.structure.ReflectJavaClass");
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(toJavaClass);
        if (classId != null) {
            return loadClass(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getSafeClassLoader(toJavaClass.getClass()), classId, 0);
        }
        return null;
    }

    static /* synthetic */ java.lang.Class loadClass$default(java.lang.ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.ClassId classId, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return loadClass(classLoader, classId, i);
    }

    private static final java.lang.Class<?> loadClass(java.lang.ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.ClassId classId, int i) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(unsafe, "kotlinClassId.asSingleFqName().toUnsafe()");
        kotlin.reflect.jvm.internal.impl.name.ClassId classIdMapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
        if (classIdMapKotlinToJava != null) {
            classId = classIdMapKotlinToJava;
        }
        java.lang.String strAsString = classId.getPackageFqName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "javaClassId.packageFqName.asString()");
        java.lang.String strAsString2 = classId.getRelativeClassName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString2, "javaClassId.relativeClassName.asString()");
        return loadClass(classLoader, strAsString, strAsString2, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final java.lang.Class<?> loadClass(java.lang.ClassLoader classLoader, java.lang.String str, java.lang.String str2, int i) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return java.lang.Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        java.lang.String str3 = str + '.' + kotlin.text.StringsKt.replace$default(str2, '.', kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null);
        for (int i2 = 0; i2 < i; i2++) {
            str3 = '[' + str3;
        }
        return kotlin.reflect.jvm.internal.components.ReflectJavaClassFinderKt.tryLoadClass(classLoader, str3);
    }

    public static final kotlin.reflect.KVisibility toKVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibility toKVisibility) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(toKVisibility, "$this$toKVisibility");
        if (kotlin.jvm.internal.Intrinsics.areEqual(toKVisibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC)) {
            return kotlin.reflect.KVisibility.PUBLIC;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(toKVisibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PROTECTED)) {
            return kotlin.reflect.KVisibility.PROTECTED;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(toKVisibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INTERNAL)) {
            return kotlin.reflect.KVisibility.INTERNAL;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(toKVisibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE) || kotlin.jvm.internal.Intrinsics.areEqual(toKVisibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE_TO_THIS)) {
            return kotlin.reflect.KVisibility.PRIVATE;
        }
        return null;
    }

    public static final java.util.List<java.lang.annotation.Annotation> computeAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated computeAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeAnnotations, "$this$computeAnnotations");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = computeAnnotations.getAnnotations();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor : annotations) {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = annotationDescriptor.getSource();
            java.lang.annotation.Annotation annotationInstance = null;
            if (source instanceof kotlin.reflect.jvm.internal.components.ReflectAnnotationSource) {
                annotationInstance = ((kotlin.reflect.jvm.internal.components.ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory.RuntimeSourceElement) {
                kotlin.reflect.jvm.internal.structure.ReflectJavaElement javaElement = ((kotlin.reflect.jvm.internal.components.RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                if (!(javaElement instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation)) {
                    javaElement = null;
                }
                kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation reflectJavaAnnotation = (kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation) javaElement;
                if (reflectJavaAnnotation != null) {
                    annotationInstance = reflectJavaAnnotation.getAnnotation();
                }
            } else {
                annotationInstance = toAnnotationInstance(annotationDescriptor);
            }
            if (annotationInstance != null) {
                arrayList.add(annotationInstance);
            }
        }
        return arrayList;
    }

    private static final java.lang.annotation.Annotation toAnnotationInstance(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        java.lang.Class<?> javaClass = annotationClass != null ? toJavaClass(annotationClass) : null;
        if (!(javaClass instanceof java.lang.Class)) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> setEntrySet = annotationDescriptor.getAllValueArguments().entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            kotlin.reflect.jvm.internal.impl.name.Name name = (kotlin.reflect.jvm.internal.impl.name.Name) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue constantValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) entry.getValue();
            java.lang.ClassLoader classLoader = javaClass.getClassLoader();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(classLoader, "annotationClass.classLoader");
            java.lang.Object runtimeValue = toRuntimeValue(constantValue, classLoader);
            kotlin.Pair pair = runtimeValue != null ? kotlin.TuplesKt.to(name.asString(), runtimeValue) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (java.lang.annotation.Annotation) kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance$default(javaClass, kotlin.collections.MapsKt.toMap(arrayList), null, 4, null);
    }

    private static final java.lang.Object toRuntimeValue(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue, java.lang.ClassLoader classLoader) {
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) {
            return toAnnotationInstance(((kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) constantValue).getValue());
        }
        if (!(constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue)) {
            if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) {
                kotlin.Pair<? extends kotlin.reflect.jvm.internal.impl.name.ClassId, ? extends kotlin.reflect.jvm.internal.impl.name.Name> value = ((kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) constantValue).getValue();
                kotlin.reflect.jvm.internal.impl.name.ClassId classIdComponent1 = value.component1();
                kotlin.reflect.jvm.internal.impl.name.Name nameComponent2 = value.component2();
                java.lang.Class clsLoadClass$default = loadClass$default(classLoader, classIdComponent1, 0, 4, null);
                if (clsLoadClass$default == null) {
                    return null;
                }
                if (clsLoadClass$default != null) {
                    return kotlin.reflect.jvm.internal.Util.getEnumConstantByName(clsLoadClass$default, nameComponent2.asString());
                }
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
            }
            if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) {
                kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value value2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) constantValue).getValue();
                if (value2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) {
                    kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass normalClass = (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) value2;
                    return loadClass(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
                }
                if (!(value2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) value2).getType().getConstructor().mo1268getDeclarationDescriptor();
                if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                    classifierDescriptorMo1268getDeclarationDescriptor = null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor;
                if (classDescriptor != null) {
                    return toJavaClass(classDescriptor);
                }
                return null;
            }
            if ((constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue) || (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue)) {
                return null;
            }
            return constantValue.getValue();
        }
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> value3 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) constantValue).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(value3, 10));
        java.util.Iterator<T> it = value3.iterator();
        while (it.hasNext()) {
            arrayList.add(toRuntimeValue((kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) it.next(), classLoader));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.Object[0]);
        if (array != null) {
            return array;
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final kotlin.reflect.jvm.internal.KFunctionImpl asKFunctionImpl(java.lang.Object obj) {
        kotlin.reflect.jvm.internal.KFunctionImpl kFunctionImpl = (kotlin.reflect.jvm.internal.KFunctionImpl) (!(obj instanceof kotlin.reflect.jvm.internal.KFunctionImpl) ? null : obj);
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        if (!(obj instanceof kotlin.jvm.internal.FunctionReference)) {
            obj = null;
        }
        kotlin.jvm.internal.FunctionReference functionReference = (kotlin.jvm.internal.FunctionReference) obj;
        kotlin.reflect.KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        return (kotlin.reflect.jvm.internal.KFunctionImpl) (kCallableCompute instanceof kotlin.reflect.jvm.internal.KFunctionImpl ? kCallableCompute : null);
    }

    public static final kotlin.reflect.jvm.internal.KPropertyImpl<?> asKPropertyImpl(java.lang.Object obj) {
        kotlin.reflect.jvm.internal.KPropertyImpl<?> kPropertyImpl = (kotlin.reflect.jvm.internal.KPropertyImpl) (!(obj instanceof kotlin.reflect.jvm.internal.KPropertyImpl) ? null : obj);
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        if (!(obj instanceof kotlin.jvm.internal.PropertyReference)) {
            obj = null;
        }
        kotlin.jvm.internal.PropertyReference propertyReference = (kotlin.jvm.internal.PropertyReference) obj;
        kotlin.reflect.KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        return (kotlin.reflect.jvm.internal.KPropertyImpl) (kCallableCompute instanceof kotlin.reflect.jvm.internal.KPropertyImpl ? kCallableCompute : null);
    }

    public static final kotlin.reflect.jvm.internal.KCallableImpl<?> asKCallableImpl(java.lang.Object obj) {
        kotlin.reflect.jvm.internal.KFunctionImpl kFunctionImplAsKFunctionImpl = (kotlin.reflect.jvm.internal.KCallableImpl) (!(obj instanceof kotlin.reflect.jvm.internal.KCallableImpl) ? null : obj);
        if (kFunctionImplAsKFunctionImpl == null) {
            kFunctionImplAsKFunctionImpl = asKFunctionImpl(obj);
        }
        return kFunctionImplAsKFunctionImpl != null ? kFunctionImplAsKFunctionImpl : asKPropertyImpl(obj);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getInstanceReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor instanceReceiverParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(instanceReceiverParameter, "$this$instanceReceiverParameter");
        if (instanceReceiverParameter.getDispatchReceiverParameter() == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = instanceReceiverParameter.getContainingDeclaration();
        if (containingDeclaration != null) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> D deserializeToDescriptor(java.lang.Class<?> moduleAnchor, M proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion metadataVersion, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(createDescriptor, "createDescriptor");
        kotlin.reflect.jvm.internal.components.RuntimeModuleData orCreateModule = kotlin.reflect.jvm.internal.ModuleByClassLoaderKt.getOrCreateModule(moduleAnchor);
        if (proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            typeParameterList = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) proto).getTypeParameterList();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameters = typeParameterList;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserialization = orCreateModule.getDeserialization();
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module = orCreateModule.getModule();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable empty = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.getEMPTY();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "typeParameters");
        return createDescriptor.invoke(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext(deserialization, nameResolver, module, typeTable, empty, metadataVersion, null, null, typeParameters)), proto);
    }
}
