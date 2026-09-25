package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "p1", "Ljava/lang/reflect/Method;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "member", "invoke"}, k = 3, mv = {1, 1, 15})
final /* synthetic */ class ReflectJavaClass$methods$2 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<java.lang.reflect.Method, kotlin.reflect.jvm.internal.structure.ReflectJavaMethod> {
    public static final kotlin.reflect.jvm.internal.structure.ReflectJavaClass$methods$2 INSTANCE = new kotlin.reflect.jvm.internal.structure.ReflectJavaClass$methods$2();

    ReflectJavaClass$methods$2() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final java.lang.String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KDeclarationContainer getOwner() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.structure.ReflectJavaMethod.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final java.lang.String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final kotlin.reflect.jvm.internal.structure.ReflectJavaMethod invoke(java.lang.reflect.Method p1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
        return new kotlin.reflect.jvm.internal.structure.ReflectJavaMethod(p1);
    }
}
