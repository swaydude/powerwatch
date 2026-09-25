package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class SendException extends java.lang.Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int zza;

    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    SendException(java.lang.String str) {
        super(str);
        int i = 4;
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
            lowerCase.hashCode();
            switch (lowerCase) {
                case "service_not_available":
                    i = 3;
                    break;
                case "toomanymessages":
                    break;
                case "invalid_parameters":
                case "missing_to":
                    i = 1;
                    break;
                case "messagetoobig":
                    i = 2;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 0;
        }
        this.zza = i;
    }

    public final int getErrorCode() {
        return this.zza;
    }
}
