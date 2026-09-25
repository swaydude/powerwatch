package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zacm extends com.google.android.gms.internal.base.zar {
    private final /* synthetic */ com.google.android.gms.common.api.internal.zack zaky;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacm(com.google.android.gms.common.api.internal.zack zackVar, android.os.Looper looper) {
        super(looper);
        this.zaky = zackVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            com.google.android.gms.common.api.PendingResult<?> pendingResult = (com.google.android.gms.common.api.PendingResult) message.obj;
            synchronized (this.zaky.zadp) {
                try {
                    if (pendingResult != null) {
                        if (!(pendingResult instanceof com.google.android.gms.common.api.internal.zacc)) {
                            this.zaky.zaks.zaa(pendingResult);
                        } else {
                            this.zaky.zaks.zad(((com.google.android.gms.common.api.internal.zacc) pendingResult).getStatus());
                        }
                    } else {
                        this.zaky.zaks.zad(new com.google.android.gms.common.api.Status(13, "Transform returned null"));
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (i == 1) {
            java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) message.obj;
            java.lang.String strValueOf = java.lang.String.valueOf(runtimeException.getMessage());
            android.util.Log.e("TransformedResultImpl", strValueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(strValueOf) : new java.lang.String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
        int i2 = message.what;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(70);
        sb.append("TransformationResultHandler received unknown message type: ");
        sb.append(i2);
        android.util.Log.e("TransformedResultImpl", sb.toString());
    }
}
