package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes2.dex */
class Result {
    private final int subtreeSize;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType type;
    private final boolean wereChanges;

    public Result(kotlin.reflect.jvm.internal.impl.types.KotlinType type, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        this.type = type;
        this.subtreeSize = i;
        this.wereChanges = z;
    }

    public final int getSubtreeSize() {
        return this.subtreeSize;
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this.type;
    }

    public final boolean getWereChanges() {
        return this.wereChanges;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getTypeIfChanged() {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = getType();
        if (this.wereChanges) {
            return type;
        }
        return null;
    }
}
