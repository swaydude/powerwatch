package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class FirelogAnalyticsEvent {
    private final java.lang.String zza;
    private final android.content.Intent zzb;

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    static class zzb implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.messaging.FirelogAnalyticsEvent> {
        zzb() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
            com.google.firebase.messaging.FirelogAnalyticsEvent firelogAnalyticsEvent = (com.google.firebase.messaging.FirelogAnalyticsEvent) obj;
            com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            android.content.Intent intentZza = firelogAnalyticsEvent.zza();
            objectEncoderContext2.add("ttl", com.google.firebase.messaging.zzr.zzf(intentZza));
            objectEncoderContext2.add(androidx.core.app.NotificationCompat.CATEGORY_EVENT, firelogAnalyticsEvent.zzb());
            objectEncoderContext2.add("instanceId", com.google.firebase.messaging.zzr.zzc());
            objectEncoderContext2.add("priority", com.google.firebase.messaging.zzr.zzm(intentZza));
            objectEncoderContext2.add("packageName", com.google.firebase.messaging.zzr.zzb());
            objectEncoderContext2.add("sdkPlatform", "ANDROID");
            objectEncoderContext2.add("messageType", com.google.firebase.messaging.zzr.zzk(intentZza));
            java.lang.String strZzj = com.google.firebase.messaging.zzr.zzj(intentZza);
            if (strZzj != null) {
                objectEncoderContext2.add("messageId", strZzj);
            }
            java.lang.String strZzl = com.google.firebase.messaging.zzr.zzl(intentZza);
            if (strZzl != null) {
                objectEncoderContext2.add("topic", strZzl);
            }
            java.lang.String strZzg = com.google.firebase.messaging.zzr.zzg(intentZza);
            if (strZzg != null) {
                objectEncoderContext2.add("collapseKey", strZzg);
            }
            if (com.google.firebase.messaging.zzr.zzi(intentZza) != null) {
                objectEncoderContext2.add("analyticsLabel", com.google.firebase.messaging.zzr.zzi(intentZza));
            }
            if (com.google.firebase.messaging.zzr.zzh(intentZza) != null) {
                objectEncoderContext2.add("composerLabel", com.google.firebase.messaging.zzr.zzh(intentZza));
            }
            java.lang.String strZzd = com.google.firebase.messaging.zzr.zzd();
            if (strZzd != null) {
                objectEncoderContext2.add("projectNumber", strZzd);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    static final class zzc implements com.google.firebase.encoders.ObjectEncoder<com.google.firebase.messaging.FirelogAnalyticsEvent.zza> {
        zzc() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
            objectEncoderContext.add("messaging_client_event", ((com.google.firebase.messaging.FirelogAnalyticsEvent.zza) obj).zza());
        }
    }

    FirelogAnalyticsEvent(java.lang.String str, android.content.Intent intent) {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "evenType must be non-null");
        this.zzb = (android.content.Intent) com.google.android.gms.common.internal.Preconditions.checkNotNull(intent, "intent must be non-null");
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    static final class zza {
        private final com.google.firebase.messaging.FirelogAnalyticsEvent zza;

        zza(com.google.firebase.messaging.FirelogAnalyticsEvent firelogAnalyticsEvent) {
            this.zza = (com.google.firebase.messaging.FirelogAnalyticsEvent) com.google.android.gms.common.internal.Preconditions.checkNotNull(firelogAnalyticsEvent);
        }

        final com.google.firebase.messaging.FirelogAnalyticsEvent zza() {
            return this.zza;
        }
    }

    final android.content.Intent zza() {
        return this.zzb;
    }

    final java.lang.String zzb() {
        return this.zza;
    }
}
