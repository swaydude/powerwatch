package kotlin.internal.jdk7;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "getSuppressed", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 5, 1})
public class JDK7PlatformImplementations extends kotlin.internal.PlatformImplementations {
    @Override // kotlin.internal.PlatformImplementations
    public void addSuppressed(java.lang.Throwable cause, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        cause.addSuppressed(exception);
    }

    @Override // kotlin.internal.PlatformImplementations
    public java.util.List<java.lang.Throwable> getSuppressed(java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        java.lang.Throwable[] suppressed = exception.getSuppressed();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(suppressed, "exception.suppressed");
        return kotlin.collections.ArraysKt.asList(suppressed);
    }
}
