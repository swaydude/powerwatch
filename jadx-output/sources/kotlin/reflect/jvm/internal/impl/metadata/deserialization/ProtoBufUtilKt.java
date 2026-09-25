package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: compiled from: ProtoBufUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBufUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M> getExtensionOrNull, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<M, T> extension) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getExtensionOrNull, "$this$getExtensionOrNull");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(extension, "extension");
        if (getExtensionOrNull.hasExtension(extension)) {
            return (T) getExtensionOrNull.getExtension(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage<M> getExtensionOrNull, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<M, java.util.List<T>> extension, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getExtensionOrNull, "$this$getExtensionOrNull");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(extension, "extension");
        if (i < getExtensionOrNull.getExtensionCount(extension)) {
            return (T) getExtensionOrNull.getExtension(extension, i);
        }
        return null;
    }
}
