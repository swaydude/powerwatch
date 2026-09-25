package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: KotlinReflectionInternalError.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;", "Ljava/lang/Error;", "Lkotlin/Error;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "(Ljava/lang/String;)V", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class KotlinReflectionInternalError extends java.lang.Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinReflectionInternalError(java.lang.String message) {
        super(message);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
    }
}
