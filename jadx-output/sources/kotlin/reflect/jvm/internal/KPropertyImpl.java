package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 >*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004=>?@B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\n\u00104\u001a\u0004\u0018\u00010\u0017H\u0004J\u0013\u00105\u001a\u00020)2\b\u00106\u001a\u0004\u0018\u00010\nH\u0096\u0002J\u001e\u00107\u001a\u0004\u0018\u00010\n2\b\u00108\u001a\u0004\u0018\u00010\u00172\b\u00109\u001a\u0004\u0018\u00010\nH\u0004J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u00102¨\u0006A"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "R", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "_descriptor", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "_javaField", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Ljava/lang/reflect/Field;", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", "", "()Z", "isConst", "isLateinit", "isSuspend", "javaField", "getJavaField", "()Ljava/lang/reflect/Field;", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateField", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "getDelegate", "field", "receiver", "hashCode", "", "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public abstract class KPropertyImpl<R> extends kotlin.reflect.jvm.internal.KCallableImpl<R> implements kotlin.reflect.KProperty<R> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.reflect.jvm.internal.KPropertyImpl.Companion INSTANCE = new kotlin.reflect.jvm.internal.KPropertyImpl.Companion(null);
    private static final java.lang.Object EXTENSION_PROPERTY_DELEGATE = new java.lang.Object();
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> _descriptor;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<java.lang.reflect.Field> _javaField;
    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl container;
    private final java.lang.String name;
    private final java.lang.Object rawBoundReceiver;
    private final java.lang.String signature;

    public abstract kotlin.reflect.jvm.internal.KPropertyImpl.Getter<R> getGetter();

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getSignature() {
        return this.signature;
    }

    private KPropertyImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor, java.lang.Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        kotlin.reflect.jvm.internal.ReflectProperties.LazyVal<java.lang.reflect.Field> lazyValLazy = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<java.lang.reflect.Field>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_javaField$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.lang.reflect.Field invoke() {
                java.lang.Class<?> enclosingClass;
                kotlin.reflect.jvm.internal.JvmPropertySignature jvmPropertySignatureMapPropertySignature = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature(this.this$0.getDescriptor());
                if (jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) {
                    kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty kotlinProperty = (kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
                    kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor = kotlinProperty.getDescriptor();
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field jvmFieldSignature$default = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.getJvmFieldSignature$default(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE, kotlinProperty.getProto(), kotlinProperty.getNameResolver(), kotlinProperty.getTypeTable(), false, 8, null);
                    if (jvmFieldSignature$default == null) {
                        return null;
                    }
                    if (kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isPropertyWithBackingFieldInOuterClass(descriptor) || kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(kotlinProperty.getProto())) {
                        enclosingClass = this.this$0.getContainer().getJClass().getEnclosingClass();
                    } else {
                        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                        enclosingClass = containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration) : this.this$0.getContainer().getJClass();
                    }
                    if (enclosingClass == null) {
                        return null;
                    }
                    try {
                        return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
                    } catch (java.lang.NoSuchFieldException unused) {
                        return null;
                    }
                }
                if (jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) {
                    return ((kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) jvmPropertySignatureMapPropertySignature).getField();
                }
                if ((jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty) || (jvmPropertySignatureMapPropertySignature instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.MappedKotlinProperty)) {
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazyValLazy, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this._javaField = lazyValLazy;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> lazySoftValLazySoft = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(propertyDescriptor, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$_descriptor$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor invoke() {
                return this.this$0.getContainer().findPropertyDescriptor(this.this$0.getName(), this.this$0.getSignature());
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(lazySoftValLazySoft, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this._descriptor = lazySoftValLazySoft;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        java.lang.String strAsString = descriptor.getName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "descriptor.name.asString()");
        this(container, strAsString, kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor).getString(), descriptor, kotlin.jvm.internal.CallableReference.NO_RECEIVER);
    }

    public final java.lang.Object getBoundReceiver() {
        return kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.coerceToExpectedReceiverType(this.rawBoundReceiver, getDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean isBound() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(this.rawBoundReceiver, kotlin.jvm.internal.CallableReference.NO_RECEIVER);
    }

    public final java.lang.reflect.Field getJavaField() {
        return this._javaField.invoke();
    }

    protected final java.lang.reflect.Field computeDelegateField() {
        if (getDescriptor().isDelegated()) {
            return getJavaField();
        }
        return null;
    }

    protected final java.lang.Object getDelegate(java.lang.reflect.Field field, java.lang.Object receiver) throws kotlin.reflect.full.IllegalPropertyDelegateAccessException {
        try {
            if (receiver == EXTENSION_PROPERTY_DELEGATE && getDescriptor().getExtensionReceiverParameter() == null) {
                throw new java.lang.RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (field != null) {
                return field.get(receiver);
            }
            return null;
        } catch (java.lang.IllegalAccessException e) {
            throw new kotlin.reflect.full.IllegalPropertyDelegateAccessException(e);
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getDescriptor() {
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptorInvoke = this._descriptor.invoke();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(propertyDescriptorInvoke, "_descriptor()");
        return propertyDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.calls.Caller<?> getCaller() {
        return getGetter().getCaller();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.calls.Caller<?> getDefaultCaller() {
        return getGetter().getDefaultCaller();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return getDescriptor().isLateInit();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return getDescriptor().isConst();
    }

    public boolean equals(java.lang.Object other) {
        kotlin.reflect.jvm.internal.KPropertyImpl<?> kPropertyImplAsKPropertyImpl = kotlin.reflect.jvm.internal.UtilKt.asKPropertyImpl(other);
        return kPropertyImplAsKPropertyImpl != null && kotlin.jvm.internal.Intrinsics.areEqual(getContainer(), kPropertyImplAsKPropertyImpl.getContainer()) && kotlin.jvm.internal.Intrinsics.areEqual(getName(), kPropertyImplAsKPropertyImpl.getName()) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, kPropertyImplAsKPropertyImpl.signature) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawBoundReceiver, kPropertyImplAsKPropertyImpl.rawBoundReceiver);
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderProperty(getDescriptor());
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static abstract class Accessor<PropertyType, ReturnType> extends kotlin.reflect.jvm.internal.KCallableImpl<ReturnType> implements kotlin.reflect.KFunction<ReturnType>, kotlin.reflect.KProperty.Accessor<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public kotlin.reflect.jvm.internal.calls.Caller<?> getDefaultCaller() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public abstract kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor getDescriptor();

        public abstract kotlin.reflect.jvm.internal.KPropertyImpl<PropertyType> getProperty();

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public kotlin.reflect.jvm.internal.KDeclarationContainerImpl getContainer() {
            return getProperty().getContainer();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public boolean isBound() {
            return getProperty().isBound();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInline() {
            return getDescriptor().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isExternal() {
            return getDescriptor().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isOperator() {
            return getDescriptor().isOperator();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInfix() {
            return getDescriptor().isInfix();
        }

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return getDescriptor().isSuspend();
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static abstract class Getter<R> extends kotlin.reflect.jvm.internal.KPropertyImpl.Accessor<R, R> implements kotlin.reflect.KProperty.Getter<R> {
        static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPropertyImpl.Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPropertyImpl.Getter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal descriptor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$descriptor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getter = this.this$0.getProperty().getDescriptor().getGetter();
                return getter != null ? getter : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultGetter(this.this$0.getProperty().getDescriptor(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
            }
        });

        /* JADX INFO: renamed from: caller$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal caller = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.calls.Caller<?>>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Getter$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.calls.Caller<?> invoke() {
                return kotlin.reflect.jvm.internal.KPropertyImplKt.computeCallerForAccessor(this.this$0, true);
            }
        });

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public kotlin.reflect.jvm.internal.calls.Caller<?> getCaller() {
            return (kotlin.reflect.jvm.internal.calls.Caller) this.caller.getValue(this, $$delegatedProperties[1]);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.jvm.internal.KCallableImpl
        public kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getDescriptor() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) this.descriptor.getValue(this, $$delegatedProperties[0]);
        }

        @Override // kotlin.reflect.KCallable
        public java.lang.String getName() {
            return "<get-" + getProperty().getName() + kotlin.text.Typography.greater;
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static abstract class Setter<R> extends kotlin.reflect.jvm.internal.KPropertyImpl.Accessor<R, kotlin.Unit> implements kotlin.reflect.KMutableProperty.Setter<R> {
        static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPropertyImpl.Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KPropertyImpl.Setter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal descriptor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$descriptor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = this.this$0.getProperty().getDescriptor().getSetter();
                return setter != null ? setter : kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultSetter(this.this$0.getProperty().getDescriptor(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY());
            }
        });

        /* JADX INFO: renamed from: caller$delegate, reason: from kotlin metadata */
        private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal caller = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.calls.Caller<?>>() { // from class: kotlin.reflect.jvm.internal.KPropertyImpl$Setter$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.calls.Caller<?> invoke() {
                return kotlin.reflect.jvm.internal.KPropertyImplKt.computeCallerForAccessor(this.this$0, false);
            }
        });

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public kotlin.reflect.jvm.internal.calls.Caller<?> getCaller() {
            return (kotlin.reflect.jvm.internal.calls.Caller) this.caller.getValue(this, $$delegatedProperties[1]);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.jvm.internal.KCallableImpl
        public kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor getDescriptor() {
            return (kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor) this.descriptor.getValue(this, $$delegatedProperties[0]);
        }

        @Override // kotlin.reflect.KCallable
        public java.lang.String getName() {
            return "<set-" + getProperty().getName() + kotlin.text.Typography.greater;
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.lang.Object getEXTENSION_PROPERTY_DELEGATE() {
            return kotlin.reflect.jvm.internal.KPropertyImpl.EXTENSION_PROPERTY_DELEGATE;
        }
    }
}
