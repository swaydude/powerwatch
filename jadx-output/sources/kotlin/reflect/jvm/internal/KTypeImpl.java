package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006(²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "isMarkedNullable", "", "()Z", "javaType", "getJavaType$kotlin_reflection", "()Ljava/lang/reflect/Type;", "javaType$delegate", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "", "kotlin-reflection", "parameterizedTypeArguments"}, k = 1, mv = {1, 1, 15})
public final class KTypeImpl implements kotlin.reflect.KType {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KTypeImpl.class), "javaType", "getJavaType$kotlin_reflection()Ljava/lang/reflect/Type;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;")), kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KTypeImpl.class), "parameterizedTypeArguments", "<v#0>"))};

    /* JADX INFO: renamed from: arguments$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal arguments;

    /* JADX INFO: renamed from: classifier$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal classifier;

    /* JADX INFO: renamed from: javaType$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal javaType;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType type;

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    @Override // kotlin.reflect.KType
    public java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
        return (java.util.List) this.arguments.getValue(this, $$delegatedProperties[2]);
    }

    @Override // kotlin.reflect.KType
    public kotlin.reflect.KClassifier getClassifier() {
        return (kotlin.reflect.KClassifier) this.classifier.getValue(this, $$delegatedProperties[1]);
    }

    public final java.lang.reflect.Type getJavaType$kotlin_reflection() {
        return (java.lang.reflect.Type) this.javaType.getValue(this, $$delegatedProperties[0]);
    }

    public KTypeImpl(kotlin.reflect.jvm.internal.impl.types.KotlinType type, kotlin.jvm.functions.Function0<? extends java.lang.reflect.Type> computeJavaType) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeJavaType, "computeJavaType");
        this.type = type;
        this.javaType = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(computeJavaType);
        this.classifier = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.KClassifier>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$classifier$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.KClassifier invoke() {
                kotlin.reflect.jvm.internal.KTypeImpl kTypeImpl = this.this$0;
                return kTypeImpl.convert(kTypeImpl.getType());
            }
        });
        this.arguments = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.reflect.jvm.internal.KTypeImpl$arguments$2(this));
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.KClassifier convert(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type2;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = type.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor);
            if (javaClass == null) {
                return null;
            }
            if (javaClass.isArray()) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) type.getArguments());
                if (typeProjection == null || (type2 = typeProjection.getType()) == null) {
                    return new kotlin.reflect.jvm.internal.KClassImpl(javaClass);
                }
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type2, "type.arguments.singleOrN…return KClassImpl(jClass)");
                kotlin.reflect.KClassifier kClassifierConvert = convert(type2);
                if (kClassifierConvert == null) {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
                }
                return new kotlin.reflect.jvm.internal.KClassImpl(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.createArrayType(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kotlin.reflect.jvm.KTypesJvm.getJvmErasure(kClassifierConvert))));
            }
            if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(type)) {
                java.lang.Class<?> primitiveByWrapper = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getPrimitiveByWrapper(javaClass);
                if (primitiveByWrapper != null) {
                    javaClass = primitiveByWrapper;
                }
                return new kotlin.reflect.jvm.internal.KClassImpl(javaClass);
            }
            return new kotlin.reflect.jvm.internal.KClassImpl(javaClass);
        }
        if (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return new kotlin.reflect.jvm.internal.KTypeParameterImpl((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) classifierDescriptorMo1268getDeclarationDescriptor);
        }
        if (!(classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor)) {
            return null;
        }
        throw new kotlin.NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.type.isMarkedNullable();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return kotlin.reflect.jvm.internal.UtilKt.computeAnnotations(this.type);
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.KTypeImpl) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((kotlin.reflect.jvm.internal.KTypeImpl) other).type);
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderType(this.type);
    }
}
