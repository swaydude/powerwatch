package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Ljava/lang/reflect/Member;", "invoke"}, k = 3, mv = {1, 1, 15})
final /* synthetic */ class ReflectJavaClass$fields$1 extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function1<java.lang.reflect.Member, java.lang.Boolean> {
    public static final kotlin.reflect.jvm.internal.structure.ReflectJavaClass$fields$1 INSTANCE = new kotlin.reflect.jvm.internal.structure.ReflectJavaClass$fields$1();

    ReflectJavaClass$fields$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final java.lang.String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final kotlin.reflect.KDeclarationContainer getOwner() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.reflect.Member.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final java.lang.String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.reflect.Member member) {
        return java.lang.Boolean.valueOf(invoke2(member));
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final boolean invoke2(java.lang.reflect.Member p1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
        return p1.isSynthetic();
    }
}
