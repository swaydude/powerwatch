package kotlinx.coroutines;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class DispatchException extends java.lang.RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DispatchException(java.lang.String message, java.lang.Throwable cause) {
        super(message, cause);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(cause, "cause");
    }
}
