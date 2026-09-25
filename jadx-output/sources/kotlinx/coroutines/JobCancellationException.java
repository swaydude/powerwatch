package kotlinx.coroutines;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0010\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "fillInStackTrace", "hashCode", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class JobCancellationException extends java.util.concurrent.CancellationException {
    public final kotlinx.coroutines.Job job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobCancellationException(java.lang.String message, java.lang.Throwable th, kotlinx.coroutines.Job job) {
        super(message);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(message, "message");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(job, "job");
        this.job = job;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        if (kotlinx.coroutines.DebugKt.DEBUG) {
            java.lang.Throwable thFillInStackTrace = super.fillInStackTrace();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(thFillInStackTrace, "super.fillInStackTrace()");
            return thFillInStackTrace;
        }
        return this;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return super.toString() + "; job=" + this.job;
    }

    public boolean equals(java.lang.Object other) {
        if (other != this) {
            if (other instanceof kotlinx.coroutines.JobCancellationException) {
                kotlinx.coroutines.JobCancellationException jobCancellationException = (kotlinx.coroutines.JobCancellationException) other;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.job, this.job) || !kotlin.jvm.internal.Intrinsics.areEqual(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        java.lang.String message = getMessage();
        if (message == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        int iHashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        java.lang.Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }
}
