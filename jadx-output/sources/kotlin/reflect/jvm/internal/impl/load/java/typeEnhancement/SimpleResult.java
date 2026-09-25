package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
final class SimpleResult extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleResult(kotlin.reflect.jvm.internal.impl.types.SimpleType type, int i, boolean z) {
        super(type, i, z);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        this.type = type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getType() {
        return this.type;
    }
}
