package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes2.dex */
final class SubtypePathNode {
    private final kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode previous;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType type;

    public SubtypePathNode(kotlin.reflect.jvm.internal.impl.types.KotlinType type, kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode subtypePathNode) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
        this.type = type;
        this.previous = subtypePathNode;
    }

    public final kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode getPrevious() {
        return this.previous;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this.type;
    }
}
