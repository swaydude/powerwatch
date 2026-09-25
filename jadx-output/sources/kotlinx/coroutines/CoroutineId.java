package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final /* data */ class CoroutineId extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.ThreadContextElement<java.lang.String> {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.CoroutineId.Companion INSTANCE = new kotlinx.coroutines.CoroutineId.Companion(null);
    private final long id;

    public static /* synthetic */ kotlinx.coroutines.CoroutineId copy$default(kotlinx.coroutines.CoroutineId coroutineId, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = coroutineId.id;
        }
        return coroutineId.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final kotlinx.coroutines.CoroutineId copy(long id) {
        return new kotlinx.coroutines.CoroutineId(id);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            if (other instanceof kotlinx.coroutines.CoroutineId) {
                if (this.id == ((kotlinx.coroutines.CoroutineId) other).id) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        return (int) (j ^ (j >>> 32));
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(operation, "operation");
        return (R) kotlinx.coroutines.ThreadContextElement.DefaultImpls.fold(this, r, operation);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return (E) kotlinx.coroutines.ThreadContextElement.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
        return kotlinx.coroutines.ThreadContextElement.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        return kotlinx.coroutines.ThreadContextElement.DefaultImpls.plus(this, context);
    }

    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.CoroutineId$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CoroutineContext.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineId> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CoroutineId(long j) {
        super(INSTANCE);
        this.id = j;
    }

    public java.lang.String toString() {
        return "CoroutineId(" + this.id + ')';
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public java.lang.String updateThreadContext(kotlin.coroutines.CoroutineContext context) {
        java.lang.String name;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) context.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(currentThread, "currentThread");
        java.lang.String oldName = currentThread.getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(oldName, "oldName");
        int iLastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) oldName, " @", 0, false, 6, (java.lang.Object) null);
        if (iLastIndexOf$default < 0) {
            iLastIndexOf$default = oldName.length();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(name.length() + iLastIndexOf$default + 10);
        java.lang.String strSubstring = oldName.substring(0, iLastIndexOf$default);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(name);
        sb.append('#');
        sb.append(this.id);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(string);
        return oldName;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(kotlin.coroutines.CoroutineContext context, java.lang.String oldState) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(oldState, "oldState");
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(threadCurrentThread, "Thread.currentThread()");
        threadCurrentThread.setName(oldState);
    }
}
