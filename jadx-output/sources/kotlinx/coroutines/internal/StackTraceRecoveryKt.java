package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a9\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u0002H\u00052\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\nH\u0002¢\u0006\u0002\u0010\f\u001a\u001e\u0010\r\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\n2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002\u001a1\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\u00142\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\nH\u0002¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a+\u0010\u001a\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u00052\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001c\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u00052\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0000¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u00020!\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0002¢\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00060\u0001j\u0002`\u000b2\n\u0010$\u001a\u00060\u0001j\u0002`\u000bH\u0007\u001a\u001f\u0010%\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0000¢\u0006\u0002\u0010\u001d\u001a1\u0010&\u001a\u0018\u0012\u0004\u0012\u0002H\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\u00140'\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u0002H\u0005H\u0002¢\u0006\u0002\u0010(\u001a\u001c\u0010)\u001a\u00020!*\u00060\u0001j\u0002`\u000b2\n\u0010*\u001a\u00060\u0001j\u0002`\u000bH\u0002\u001a#\u0010+\u001a\u00020,*\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020!*\u00060\u0001j\u0002`\u000bH\u0000\u001a\u001b\u00100\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u0002H\u0005H\u0002¢\u0006\u0002\u0010\u001d*\f\b\u0000\u00101\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u00102\"\u00020\u00012\u00020\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"artificialFrame", "Ljava/lang/StackTraceElement;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "Lkotlinx/coroutines/internal/StackTraceElement;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "recoveryDisabled", "", "(Ljava/lang/Throwable;)Z", "sanitize", "element", "unwrap", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", com.baidu.mapsdkplatform.comapi.e.a, "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class StackTraceRecoveryKt {
    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E exception) {
        java.lang.Throwable thTryCopyException;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        return (recoveryDisabled(exception) || (thTryCopyException = kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException(exception)) == null) ? exception : (E) sanitizeStackTrace(thTryCopyException);
    }

    private static final <E extends java.lang.Throwable> E sanitizeStackTrace(E e) {
        java.lang.StackTraceElement stackTraceElementArtificialFrame;
        java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(stackTrace, "stackTrace");
        int iFrameIndex = frameIndex(stackTrace, "kotlinx.coroutines.internal.StackTraceRecoveryKt");
        int i = iFrameIndex + 1;
        int iFrameIndex2 = frameIndex(stackTrace, "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        int i2 = (length - iFrameIndex) - (iFrameIndex2 == -1 ? 0 : length - iFrameIndex2);
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElementArtificialFrame = artificialFrame("Coroutine boundary");
            } else {
                stackTraceElementArtificialFrame = stackTrace[(i + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElementArtificialFrame;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E exception, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(continuation, "continuation");
        return (recoveryDisabled(exception) || !(continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) ? exception : (E) recoverFromStackFrame(exception, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends java.lang.Throwable> E recoverFromStackFrame(E e, kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        kotlin.Pair pairCauseAndStacktrace = causeAndStacktrace(e);
        java.lang.Throwable th = (java.lang.Throwable) pairCauseAndStacktrace.component1();
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) pairCauseAndStacktrace.component2();
        java.lang.Throwable thTryCopyException = kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException(th);
        if (thTryCopyException == null) {
            return e;
        }
        java.util.ArrayDeque<java.lang.StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(coroutineStackFrame);
        if (arrayDequeCreateStackTrace.isEmpty()) {
            return e;
        }
        if (th != e) {
            mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
        }
        return (E) createFinalException(th, thTryCopyException, arrayDequeCreateStackTrace);
    }

    private static final <E extends java.lang.Throwable> E createFinalException(E e, E e2, java.util.ArrayDeque<java.lang.StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(artificialFrame("Coroutine boundary"));
        java.lang.StackTraceElement[] causeTrace = e.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(causeTrace, "causeTrace");
        int iFrameIndex = frameIndex(causeTrace, "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        int i = 0;
        if (iFrameIndex == -1) {
            java.util.ArrayDeque<java.lang.StackTraceElement> arrayDeque2 = arrayDeque;
            if (arrayDeque2 == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
            }
            java.lang.Object[] array = arrayDeque2.toArray(new java.lang.StackTraceElement[0]);
            if (array == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            e2.setStackTrace((java.lang.StackTraceElement[]) array);
            return e2;
        }
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[arrayDeque.size() + iFrameIndex];
        for (int i2 = 0; i2 < iFrameIndex; i2++) {
            stackTraceElementArr[i2] = causeTrace[i2];
        }
        java.util.Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[iFrameIndex + i] = (java.lang.StackTraceElement) it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    private static final <E extends java.lang.Throwable> kotlin.Pair<E, java.lang.StackTraceElement[]> causeAndStacktrace(E e) {
        boolean z;
        java.lang.Throwable cause = e.getCause();
        if (cause != null && kotlin.jvm.internal.Intrinsics.areEqual(cause.getClass(), e.getClass())) {
            java.lang.StackTraceElement[] currentTrace = e.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(currentTrace, "currentTrace");
            for (java.lang.StackTraceElement it : currentTrace) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                if (isArtificial(it)) {
                    z = true;
                    if (z) {
                        return kotlin.TuplesKt.to(cause, currentTrace);
                    }
                    return kotlin.TuplesKt.to(e, new java.lang.StackTraceElement[0]);
                }
            }
            z = false;
            if (z) {
                return kotlin.TuplesKt.to(cause, currentTrace);
            }
            return kotlin.TuplesKt.to(e, new java.lang.StackTraceElement[0]);
        }
        return kotlin.TuplesKt.to(e, new java.lang.StackTraceElement[0]);
    }

    public static final java.lang.Object recoverAndThrow(java.lang.Throwable th, kotlin.coroutines.Continuation<?> continuation) throws java.lang.Throwable {
        if (recoveryDisabled(th) || !(continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            throw th;
        }
        throw recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
    }

    private static final java.lang.Object recoverAndThrow$$forInline(java.lang.Throwable th, kotlin.coroutines.Continuation continuation) throws java.lang.Throwable {
        if (recoveryDisabled(th)) {
            throw th;
        }
        kotlin.jvm.internal.InlineMarker.mark(0);
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            throw recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        }
        throw th;
    }

    public static final <E extends java.lang.Throwable> E unwrap(E exception) {
        java.lang.Throwable cause;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(exception, "exception");
        if (recoveryDisabled(exception) || (cause = exception.getCause()) == null) {
            return exception;
        }
        boolean z = true;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(cause.getClass(), exception.getClass())) {
            return exception;
        }
        java.lang.StackTraceElement[] stackTrace = exception.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(stackTrace, "exception.stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            java.lang.StackTraceElement it = stackTrace[i];
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
            if (isArtificial(it)) {
                break;
            }
            i++;
        }
        if (!z) {
            return exception;
        }
        java.lang.Throwable cause2 = exception.getCause();
        if (!(cause2 instanceof java.lang.Throwable)) {
            cause2 = null;
        }
        return cause2 != null ? (E) cause2 : exception;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends java.lang.Throwable> boolean recoveryDisabled(E e) {
        return !kotlinx.coroutines.DebugKt.RECOVER_STACKTRACES || !kotlinx.coroutines.DebugKt.DEBUG || (e instanceof java.util.concurrent.CancellationException) || (e instanceof kotlinx.coroutines.internal.NonRecoverableThrowable);
    }

    private static final java.util.ArrayDeque<java.lang.StackTraceElement> createStackTrace(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        java.util.ArrayDeque<java.lang.StackTraceElement> arrayDeque = new java.util.ArrayDeque<>();
        java.lang.StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(sanitize(stackTraceElement));
        }
        while (true) {
            if (!(coroutineStackFrame instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                coroutineStackFrame = null;
            }
            if (coroutineStackFrame == null || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                break;
            }
            java.lang.StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(sanitize(stackTraceElement2));
            }
        }
        return arrayDeque;
    }

    public static final java.lang.StackTraceElement sanitize(java.lang.StackTraceElement element) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");
        java.lang.String className = element.getClassName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(className, "element.className");
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) className, '/', false, 2, (java.lang.Object) null)) {
            return element;
        }
        java.lang.String className2 = element.getClassName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(className2, "element.className");
        return new java.lang.StackTraceElement(kotlin.text.StringsKt.replace$default(className2, '/', '.', false, 4, (java.lang.Object) null), element.getMethodName(), element.getFileName(), element.getLineNumber());
    }

    public static final java.lang.StackTraceElement artificialFrame(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
        return new java.lang.StackTraceElement("\b\b\b(" + message, "\b", "\b", -1);
    }

    public static final boolean isArtificial(java.lang.StackTraceElement receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        java.lang.String className = receiver$0.getClassName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(className, "className");
        return kotlin.text.StringsKt.startsWith$default(className, "\b\b\b", false, 2, (java.lang.Object) null);
    }

    private static final boolean elementWiseEquals(java.lang.StackTraceElement stackTraceElement, java.lang.StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final void mergeRecoveredTraces(java.lang.StackTraceElement[] stackTraceElementArr, java.util.ArrayDeque<java.lang.StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 < i2) {
            return;
        }
        while (true) {
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[length2];
            java.lang.StackTraceElement last = arrayDeque.getLast();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(last, "result.last");
            if (elementWiseEquals(stackTraceElement, last)) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            } else {
                length2--;
            }
        }
    }

    private static final int frameIndex(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
