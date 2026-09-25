package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: InvalidModuleException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InvalidModuleException extends java.lang.IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(java.lang.String message) {
        super(message);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
    }
}
