package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0019\u0010\u0002\u001a\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "p1", "Ljava/lang/reflect/Constructor;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "member", "invoke"}, k = 3, mv = {1, 1, 15})
final /* synthetic */ class ReflectJavaClass$constructors$2 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<java.lang.reflect.Constructor<?>, kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor> {
    public static final kotlin.reflect.jvm.internal.structure.ReflectJavaClass$constructors$2 INSTANCE = new kotlin.reflect.jvm.internal.structure.ReflectJavaClass$constructors$2();

    ReflectJavaClass$constructors$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final java.lang.String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KDeclarationContainer getOwner() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final java.lang.String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor invoke(java.lang.reflect.Constructor<?> p1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
        return new kotlin.reflect.jvm.internal.structure.ReflectJavaConstructor(p1);
    }
}
