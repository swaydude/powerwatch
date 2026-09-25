package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KParameterImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\"H\u0016R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class KParameterImpl implements kotlin.reflect.KParameter {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: annotations$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal annotations;
    private final kotlin.reflect.jvm.internal.KCallableImpl<?> callable;

    /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal descriptor;
    private final int index;
    private final kotlin.reflect.KParameter.Kind kind;

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor getDescriptor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) this.descriptor.getValue(this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return (java.util.List) this.annotations.getValue(this, $$delegatedProperties[1]);
    }

    public KParameterImpl(kotlin.reflect.jvm.internal.KCallableImpl<?> callable, int i, kotlin.reflect.KParameter.Kind kind, kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor> computeDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(callable, "callable");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(computeDescriptor, "computeDescriptor");
        this.callable = callable;
        this.index = i;
        this.kind = kind;
        this.descriptor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(computeDescriptor);
        this.annotations = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<java.util.List<? extends java.lang.annotation.Annotation>>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$annotations$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.List<? extends java.lang.annotation.Annotation> invoke() {
                return kotlin.reflect.jvm.internal.UtilKt.computeAnnotations(this.this$0.getDescriptor());
            }
        });
    }

    public final kotlin.reflect.jvm.internal.KCallableImpl<?> getCallable() {
        return this.callable;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.KParameter
    public kotlin.reflect.KParameter.Kind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.KParameter
    public java.lang.String getName() {
        kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor descriptor = getDescriptor();
        if (!(descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor)) {
            descriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) descriptor;
        if (valueParameterDescriptor == null || valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name = valueParameterDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "valueParameter.name");
        if (name.isSpecial()) {
            return null;
        }
        return name.asString();
    }

    @Override // kotlin.reflect.KParameter
    public kotlin.reflect.KType getType() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getDescriptor().getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "descriptor.type");
        return new kotlin.reflect.jvm.internal.KTypeImpl(type, new kotlin.jvm.functions.Function0<java.lang.reflect.Type>() { // from class: kotlin.reflect.jvm.internal.KParameterImpl$type$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.reflect.Type invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor descriptor = this.this$0.getDescriptor();
                if ((descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.UtilKt.getInstanceReceiverParameter(this.this$0.getCallable().getDescriptor()), descriptor) && this.this$0.getCallable().getDescriptor().getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.this$0.getCallable().getDescriptor().getContainingDeclaration();
                    if (containingDeclaration == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                    java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration);
                    if (javaClass != null) {
                        return javaClass;
                    }
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + descriptor);
                }
                return this.this$0.getCallable().getCaller().getParameterTypes().get(this.this$0.getIndex());
            }
        });
    }

    @Override // kotlin.reflect.KParameter
    public boolean isOptional() {
        kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor descriptor = getDescriptor();
        if (!(descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor)) {
            descriptor = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) descriptor;
        if (valueParameterDescriptor != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public boolean isVararg() {
        kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor descriptor = getDescriptor();
        return (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) descriptor).getVarargElementType() != null;
    }

    public boolean equals(java.lang.Object other) {
        if (other instanceof kotlin.reflect.jvm.internal.KParameterImpl) {
            kotlin.reflect.jvm.internal.KParameterImpl kParameterImpl = (kotlin.reflect.jvm.internal.KParameterImpl) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.callable, kParameterImpl.callable) && kotlin.jvm.internal.Intrinsics.areEqual(getDescriptor(), kParameterImpl.getDescriptor())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.callable.hashCode() * 31) + getDescriptor().hashCode();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderParameter(this);
    }
}
