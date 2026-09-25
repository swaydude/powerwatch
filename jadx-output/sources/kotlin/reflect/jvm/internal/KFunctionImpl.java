package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KFunctionImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B)\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0012J&\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000304032\n\u00105\u001a\u0006\u0012\u0002\b\u0003042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00106\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002072\u0006\u00105\u001a\u000208H\u0002J\u0013\u0010;\u001a\u00020)2\b\u0010<\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010=\u001a\u00020\u0014H\u0016J\b\u0010>\u001a\u00020\tH\u0016R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R!\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010*R\u0014\u0010+\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u0010/\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010*R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "arity", "", "getArity", "()I", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "getName", "()Ljava/lang/String;", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "member", "createInstanceMethodCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Ljava/lang/reflect/Method;", "createJvmStaticInObjectCaller", "createStaticMethodCaller", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class KFunctionImpl extends kotlin.reflect.jvm.internal.KCallableImpl<java.lang.Object> implements kotlin.jvm.internal.FunctionBase<java.lang.Object>, kotlin.reflect.KFunction<java.lang.Object>, kotlin.reflect.jvm.internal.FunctionWithAllInvokes {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KFunctionImpl.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.KFunctionImpl.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* JADX INFO: renamed from: caller$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal caller;
    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: defaultCaller$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazyVal defaultCaller;

    /* JADX INFO: renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal descriptor;
    private final java.lang.Object rawBoundReceiver;
    private final java.lang.String signature;

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.calls.Caller<?> getCaller() {
        return (kotlin.reflect.jvm.internal.calls.Caller) this.caller.getValue(this, $$delegatedProperties[1]);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.calls.Caller<?> getDefaultCaller() {
        return (kotlin.reflect.jvm.internal.calls.Caller) this.defaultCaller.getValue(this, $$delegatedProperties[2]);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getDescriptor() {
        return (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) this.descriptor.getValue(this, $$delegatedProperties[0]);
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function7
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.jvm.functions.Function8
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.jvm.functions.Function9
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kotlin.jvm.functions.Function10
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.jvm.functions.Function11
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // kotlin.jvm.functions.Function12
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.jvm.functions.Function13
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.jvm.functions.Function14
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // kotlin.jvm.functions.Function15
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // kotlin.jvm.functions.Function16
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // kotlin.jvm.functions.Function17
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // kotlin.jvm.functions.Function18
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // kotlin.jvm.functions.Function19
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // kotlin.jvm.functions.Function20
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // kotlin.jvm.functions.Function21
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // kotlin.jvm.functions.Function22
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21, java.lang.Object obj22) {
        return kotlin.reflect.jvm.internal.FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public kotlin.reflect.jvm.internal.KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    /* synthetic */ KFunctionImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kDeclarationContainerImpl, str, str2, functionDescriptor, (i & 16) != 0 ? kotlin.jvm.internal.CallableReference.NO_RECEIVER : obj);
    }

    private KFunctionImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, final java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(functionDescriptor, new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor invoke() {
                return this.this$0.getContainer().findFunctionDescriptor(str, this.this$0.signature);
            }
        });
        this.caller = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.calls.Caller<? extends java.lang.reflect.Member>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$caller$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.calls.Caller<? extends java.lang.reflect.Member> invoke() {
                java.lang.reflect.Constructor<?> constructor;
                kotlin.reflect.jvm.internal.calls.CallerImpl.Method methodCreateJvmStaticInObjectCaller;
                kotlin.reflect.jvm.internal.calls.CallerImpl.Method methodCreateConstructorCaller;
                kotlin.reflect.jvm.internal.JvmFunctionSignature jvmFunctionSignatureMapSignature = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
                if (jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) {
                    if (this.this$0.isAnnotationConstructor()) {
                        java.lang.Class<?> jClass = this.this$0.getContainer().getJClass();
                        java.util.List<kotlin.reflect.KParameter> parameters = this.this$0.getParameters();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameters, 10));
                        java.util.Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            java.lang.String name = ((kotlin.reflect.KParameter) it.next()).getName();
                            if (name == null) {
                                kotlin.jvm.internal.Intrinsics.throwNpe();
                            }
                            arrayList.add(name);
                        }
                        return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass, arrayList, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                    }
                    constructor = this.this$0.getContainer().findConstructorBySignature(((kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureMapSignature).getConstructorDesc());
                } else if (jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) {
                    kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction kotlinFunction = (kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature;
                    constructor = this.this$0.getContainer().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc());
                } else if (jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod) {
                    constructor = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod) jvmFunctionSignatureMapSignature).getMethod();
                } else {
                    if (!(jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor)) {
                        if (!(jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.util.List<java.lang.reflect.Method> methods = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureMapSignature).getMethods();
                        java.lang.Class<?> jClass2 = this.this$0.getContainer().getJClass();
                        java.util.List<java.lang.reflect.Method> list = methods;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (java.lang.reflect.Method it2 : list) {
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                            arrayList2.add(it2.getName());
                        }
                        return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass2, arrayList2, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA, methods);
                    }
                    constructor = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureMapSignature).getConstructor();
                }
                if (constructor instanceof java.lang.reflect.Constructor) {
                    kotlin.reflect.jvm.internal.KFunctionImpl kFunctionImpl = this.this$0;
                    methodCreateConstructorCaller = kFunctionImpl.createConstructorCaller((java.lang.reflect.Constructor) constructor, kFunctionImpl.getDescriptor());
                } else if (constructor instanceof java.lang.reflect.Method) {
                    java.lang.reflect.Method method = (java.lang.reflect.Method) constructor;
                    if (!java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
                        methodCreateJvmStaticInObjectCaller = this.this$0.createInstanceMethodCaller(method);
                    } else {
                        methodCreateJvmStaticInObjectCaller = this.this$0.getDescriptor().getAnnotations().mo1263findAnnotation(kotlin.reflect.jvm.internal.UtilKt.getJVM_STATIC()) != null ? this.this$0.createJvmStaticInObjectCaller(method) : this.this$0.createStaticMethodCaller(method);
                    }
                    methodCreateConstructorCaller = methodCreateJvmStaticInObjectCaller;
                } else {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Could not compute caller for function: " + this.this$0.getDescriptor() + " (member = " + constructor + ')');
                }
                return kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded$default(methodCreateConstructorCaller, this.this$0.getDescriptor(), false, 2, null);
            }
        });
        this.defaultCaller = kotlin.reflect.jvm.internal.ReflectProperties.lazy(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.calls.Caller<? extends java.lang.reflect.Member>>() { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$defaultCaller$2
            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:45:0x014f  */
            @Override // kotlin.jvm.functions.Function0
            public final kotlin.reflect.jvm.internal.calls.Caller<? extends java.lang.reflect.Member> invoke() {
                java.lang.reflect.Constructor<?> constructorFindDefaultConstructor;
                kotlin.reflect.jvm.internal.calls.CallerImpl.Method methodCreateConstructorCaller;
                kotlin.reflect.jvm.internal.calls.CallerImpl.Method methodCreateStaticMethodCaller;
                kotlin.reflect.jvm.internal.JvmFunctionSignature jvmFunctionSignatureMapSignature = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
                if (jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) {
                    kotlin.reflect.jvm.internal.KDeclarationContainerImpl container = this.this$0.getContainer();
                    kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction kotlinFunction = (kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature;
                    java.lang.String methodName = kotlinFunction.getMethodName();
                    java.lang.String methodDesc = kotlinFunction.getMethodDesc();
                    java.lang.reflect.Member memberMo1260getMember = this.this$0.getCaller().mo1260getMember();
                    if (memberMo1260getMember == null) {
                        kotlin.jvm.internal.Intrinsics.throwNpe();
                    }
                    constructorFindDefaultConstructor = container.findDefaultMethod(methodName, methodDesc, !java.lang.reflect.Modifier.isStatic(memberMo1260getMember.getModifiers()));
                } else if (jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) {
                    if (this.this$0.isAnnotationConstructor()) {
                        java.lang.Class<?> jClass = this.this$0.getContainer().getJClass();
                        java.util.List<kotlin.reflect.KParameter> parameters = this.this$0.getParameters();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameters, 10));
                        java.util.Iterator<T> it = parameters.iterator();
                        while (it.hasNext()) {
                            java.lang.String name = ((kotlin.reflect.KParameter) it.next()).getName();
                            if (name == null) {
                                kotlin.jvm.internal.Intrinsics.throwNpe();
                            }
                            arrayList.add(name);
                        }
                        return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass, arrayList, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                    }
                    constructorFindDefaultConstructor = this.this$0.getContainer().findDefaultConstructor(((kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureMapSignature).getConstructorDesc());
                } else {
                    if (jvmFunctionSignatureMapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                        java.util.List<java.lang.reflect.Method> methods = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureMapSignature).getMethods();
                        java.lang.Class<?> jClass2 = this.this$0.getContainer().getJClass();
                        java.util.List<java.lang.reflect.Method> list = methods;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (java.lang.reflect.Method it2 : list) {
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it2, "it");
                            arrayList2.add(it2.getName());
                        }
                        return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass2, arrayList2, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA, methods);
                    }
                    constructorFindDefaultConstructor = null;
                }
                if (constructorFindDefaultConstructor instanceof java.lang.reflect.Constructor) {
                    kotlin.reflect.jvm.internal.KFunctionImpl kFunctionImpl = this.this$0;
                    methodCreateConstructorCaller = kFunctionImpl.createConstructorCaller((java.lang.reflect.Constructor) constructorFindDefaultConstructor, kFunctionImpl.getDescriptor());
                } else if (constructorFindDefaultConstructor instanceof java.lang.reflect.Method) {
                    if (this.this$0.getDescriptor().getAnnotations().mo1263findAnnotation(kotlin.reflect.jvm.internal.UtilKt.getJVM_STATIC()) == null) {
                        methodCreateStaticMethodCaller = this.this$0.createStaticMethodCaller((java.lang.reflect.Method) constructorFindDefaultConstructor);
                    } else {
                        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = this.this$0.getDescriptor().getContainingDeclaration();
                        if (containingDeclaration == null) {
                            throw new kotlin.TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        }
                        if (!((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).isCompanionObject()) {
                            methodCreateStaticMethodCaller = this.this$0.createJvmStaticInObjectCaller((java.lang.reflect.Method) constructorFindDefaultConstructor);
                        } else {
                            methodCreateStaticMethodCaller = this.this$0.createStaticMethodCaller((java.lang.reflect.Method) constructorFindDefaultConstructor);
                        }
                    }
                    methodCreateConstructorCaller = methodCreateStaticMethodCaller;
                } else {
                    methodCreateConstructorCaller = null;
                }
                if (methodCreateConstructorCaller != null) {
                    return kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(methodCreateConstructorCaller, this.this$0.getDescriptor(), true);
                }
                return null;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(name, "name");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl container, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(container, "container");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(descriptor, "descriptor");
        java.lang.String strAsString = descriptor.getName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "descriptor.name.asString()");
        this(container, strAsString, kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(descriptor).get_signature(), descriptor, null, 16, null);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean isBound() {
        return !kotlin.jvm.internal.Intrinsics.areEqual(this.rawBoundReceiver, kotlin.jvm.internal.CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.reflect.KCallable
    public java.lang.String getName() {
        java.lang.String strAsString = getDescriptor().getName().asString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strAsString, "descriptor.name.asString()");
        return strAsString;
    }

    private final java.lang.Object getBoundReceiver() {
        return kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt.coerceToExpectedReceiverType(this.rawBoundReceiver, getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.CallerImpl.Method createStaticMethodCaller(java.lang.reflect.Method member) {
        return isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic(member, getBoundReceiver()) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.CallerImpl.Method createJvmStaticInObjectCaller(java.lang.reflect.Method member) {
        return isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject(member) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.CallerImpl.Method createInstanceMethodCaller(java.lang.reflect.Method member) {
        return isBound() ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(member, getBoundReceiver()) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> createConstructorCaller(java.lang.reflect.Constructor<?> member, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor) {
        if (kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt.shouldHideConstructorDueToInlineClassTypeValueParameters(descriptor)) {
            if (isBound()) {
                return new kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenBoundConstructor(member, getBoundReceiver());
            }
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenConstructor(member);
        }
        if (isBound()) {
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.BoundConstructor(member, getBoundReceiver());
        }
        return new kotlin.reflect.jvm.internal.calls.CallerImpl.Constructor(member);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return kotlin.reflect.jvm.internal.calls.CallerKt.getArity(getCaller());
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

    public boolean equals(java.lang.Object other) {
        kotlin.reflect.jvm.internal.KFunctionImpl kFunctionImplAsKFunctionImpl = kotlin.reflect.jvm.internal.UtilKt.asKFunctionImpl(other);
        return kFunctionImplAsKFunctionImpl != null && kotlin.jvm.internal.Intrinsics.areEqual(getContainer(), kFunctionImplAsKFunctionImpl.getContainer()) && kotlin.jvm.internal.Intrinsics.areEqual(getName(), kFunctionImplAsKFunctionImpl.getName()) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, kFunctionImplAsKFunctionImpl.signature) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawBoundReceiver, kFunctionImplAsKFunctionImpl.rawBoundReceiver);
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderFunction(getDescriptor());
    }
}
