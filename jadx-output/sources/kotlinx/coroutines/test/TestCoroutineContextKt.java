package kotlinx.coroutines.test;

/* JADX INFO: compiled from: TestCoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¨\u0006\u0007"}, d2 = {"withTestContext", "", "testContext", "Lkotlinx/coroutines/test/TestCoroutineContext;", "testBody", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class TestCoroutineContextKt {
    public static /* synthetic */ void withTestContext$default(kotlinx.coroutines.test.TestCoroutineContext testCoroutineContext, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            testCoroutineContext = new kotlinx.coroutines.test.TestCoroutineContext(null, 1, null);
        }
        withTestContext(testCoroutineContext, function1);
    }

    public static final void withTestContext(kotlinx.coroutines.test.TestCoroutineContext testContext, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.test.TestCoroutineContext, kotlin.Unit> testBody) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(testContext, "testContext");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(testBody, "testBody");
        testBody.invoke(testContext);
        java.util.List<java.lang.Throwable> exceptions = testContext.getExceptions();
        boolean z = true;
        if (!(exceptions instanceof java.util.Collection) || !exceptions.isEmpty()) {
            java.util.Iterator<T> it = exceptions.iterator();
            while (it.hasNext()) {
                if (!(((java.lang.Throwable) it.next()) instanceof java.util.concurrent.CancellationException)) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        throw new java.lang.AssertionError("Coroutine encountered unhandled exceptions:\n" + testContext.getExceptions());
    }
}
