package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RemoteMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.firebase.messaging.RemoteMessage> CREATOR = new com.google.firebase.messaging.zzv();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    android.os.Bundle zza;
    private java.util.Map<java.lang.String, java.lang.String> zzb;
    private com.google.firebase.messaging.RemoteMessage.Notification zzc;

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public RemoteMessage(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    public static class Builder {
        private final android.os.Bundle zza;
        private final java.util.Map<java.lang.String, java.lang.String> zzb;

        public Builder(java.lang.String str) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.zza = bundle;
            this.zzb = new androidx.collection.ArrayMap();
            if (android.text.TextUtils.isEmpty(str)) {
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Invalid to: ".concat(strValueOf) : new java.lang.String("Invalid to: "));
            }
            bundle.putString("google.to", str);
        }

        public com.google.firebase.messaging.RemoteMessage build() {
            android.os.Bundle bundle = new android.os.Bundle();
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.zzb.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.zza);
            this.zza.remove("from");
            return new com.google.firebase.messaging.RemoteMessage(bundle);
        }

        public com.google.firebase.messaging.RemoteMessage.Builder addData(java.lang.String str, java.lang.String str2) {
            this.zzb.put(str, str2);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setData(java.util.Map<java.lang.String, java.lang.String> map) {
            this.zzb.clear();
            this.zzb.putAll(map);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder clearData() {
            this.zzb.clear();
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setMessageId(java.lang.String str) {
            this.zza.putString("google.message_id", str);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setMessageType(java.lang.String str) {
            this.zza.putString("message_type", str);
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setTtl(int i) {
            this.zza.putString("google.ttl", java.lang.String.valueOf(i));
            return this;
        }

        public com.google.firebase.messaging.RemoteMessage.Builder setCollapseKey(java.lang.String str) {
            this.zza.putString("collapse_key", str);
            return this;
        }
    }

    public final java.lang.String getFrom() {
        return this.zza.getString("from");
    }

    public final java.lang.String getSenderId() {
        return this.zza.getString("google.c.sender.id");
    }

    public final java.lang.String getTo() {
        return this.zza.getString("google.to");
    }

    public final java.util.Map<java.lang.String, java.lang.String> getData() {
        if (this.zzb == null) {
            android.os.Bundle bundle = this.zza;
            androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
            for (java.lang.String str : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof java.lang.String) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.zzb = arrayMap;
        }
        return this.zzb;
    }

    /* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
    public static class Notification {
        private final java.lang.String zza;
        private final java.lang.String zzb;
        private final java.lang.String[] zzc;
        private final java.lang.String zzd;
        private final java.lang.String zze;
        private final java.lang.String[] zzf;
        private final java.lang.String zzg;
        private final java.lang.String zzh;
        private final java.lang.String zzi;
        private final java.lang.String zzj;
        private final java.lang.String zzk;
        private final java.lang.String zzl;
        private final java.lang.String zzm;
        private final android.net.Uri zzn;
        private final java.lang.String zzo;
        private final java.lang.Integer zzp;
        private final java.lang.Integer zzq;
        private final java.lang.Integer zzr;
        private final int[] zzs;
        private final java.lang.Long zzt;
        private final boolean zzu;
        private final boolean zzv;
        private final boolean zzw;
        private final boolean zzx;
        private final boolean zzy;
        private final long[] zzz;

        private Notification(com.google.firebase.messaging.zzt zztVar) {
            this.zza = zztVar.zza("gcm.n.title");
            this.zzb = zztVar.zze("gcm.n.title");
            this.zzc = zza(zztVar, "gcm.n.title");
            this.zzd = zztVar.zza("gcm.n.body");
            this.zze = zztVar.zze("gcm.n.body");
            this.zzf = zza(zztVar, "gcm.n.body");
            this.zzg = zztVar.zza("gcm.n.icon");
            this.zzi = zztVar.zzb();
            this.zzj = zztVar.zza("gcm.n.tag");
            this.zzk = zztVar.zza("gcm.n.color");
            this.zzl = zztVar.zza("gcm.n.click_action");
            this.zzm = zztVar.zza("gcm.n.android_channel_id");
            this.zzn = zztVar.zza();
            this.zzh = zztVar.zza("gcm.n.image");
            this.zzo = zztVar.zza("gcm.n.ticker");
            this.zzp = zztVar.zzc("gcm.n.notification_priority");
            this.zzq = zztVar.zzc("gcm.n.visibility");
            this.zzr = zztVar.zzc("gcm.n.notification_count");
            this.zzu = zztVar.zzb("gcm.n.sticky");
            this.zzv = zztVar.zzb("gcm.n.local_only");
            this.zzw = zztVar.zzb("gcm.n.default_sound");
            this.zzx = zztVar.zzb("gcm.n.default_vibrate_timings");
            this.zzy = zztVar.zzb("gcm.n.default_light_settings");
            this.zzt = zztVar.zzd("gcm.n.event_time");
            this.zzs = zztVar.zzd();
            this.zzz = zztVar.zzc();
        }

        private static java.lang.String[] zza(com.google.firebase.messaging.zzt zztVar, java.lang.String str) {
            java.lang.Object[] objArrZzf = zztVar.zzf(str);
            if (objArrZzf == null) {
                return null;
            }
            java.lang.String[] strArr = new java.lang.String[objArrZzf.length];
            for (int i = 0; i < objArrZzf.length; i++) {
                strArr[i] = java.lang.String.valueOf(objArrZzf[i]);
            }
            return strArr;
        }

        public java.lang.String getTitle() {
            return this.zza;
        }

        public java.lang.String getTitleLocalizationKey() {
            return this.zzb;
        }

        public java.lang.String[] getTitleLocalizationArgs() {
            return this.zzc;
        }

        public java.lang.String getBody() {
            return this.zzd;
        }

        public java.lang.String getBodyLocalizationKey() {
            return this.zze;
        }

        public java.lang.String[] getBodyLocalizationArgs() {
            return this.zzf;
        }

        public java.lang.String getIcon() {
            return this.zzg;
        }

        public android.net.Uri getImageUrl() {
            java.lang.String str = this.zzh;
            if (str != null) {
                return android.net.Uri.parse(str);
            }
            return null;
        }

        public java.lang.String getSound() {
            return this.zzi;
        }

        public java.lang.String getTag() {
            return this.zzj;
        }

        public java.lang.String getColor() {
            return this.zzk;
        }

        public java.lang.String getClickAction() {
            return this.zzl;
        }

        public java.lang.String getChannelId() {
            return this.zzm;
        }

        public android.net.Uri getLink() {
            return this.zzn;
        }

        public java.lang.String getTicker() {
            return this.zzo;
        }

        public boolean getSticky() {
            return this.zzu;
        }

        public boolean getLocalOnly() {
            return this.zzv;
        }

        public boolean getDefaultSound() {
            return this.zzw;
        }

        public boolean getDefaultVibrateSettings() {
            return this.zzx;
        }

        public boolean getDefaultLightSettings() {
            return this.zzy;
        }

        public java.lang.Integer getNotificationPriority() {
            return this.zzp;
        }

        public java.lang.Integer getVisibility() {
            return this.zzq;
        }

        public java.lang.Integer getNotificationCount() {
            return this.zzr;
        }

        public java.lang.Long getEventTime() {
            return this.zzt;
        }

        public int[] getLightSettings() {
            return this.zzs;
        }

        public long[] getVibrateTimings() {
            return this.zzz;
        }
    }

    public final java.lang.String getCollapseKey() {
        return this.zza.getString("collapse_key");
    }

    public final java.lang.String getMessageId() {
        java.lang.String string = this.zza.getString("google.message_id");
        return string == null ? this.zza.getString("message_id") : string;
    }

    public final java.lang.String getMessageType() {
        return this.zza.getString("message_type");
    }

    public final long getSentTime() {
        java.lang.Object obj = this.zza.get("google.sent_time");
        if (obj instanceof java.lang.Long) {
            return ((java.lang.Long) obj).longValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0L;
        }
        try {
            return java.lang.Long.parseLong((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(strValueOf);
            android.util.Log.w("FirebaseMessaging", sb.toString());
            return 0L;
        }
    }

    public final int getTtl() {
        java.lang.Object obj = this.zza.get("google.ttl");
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (!(obj instanceof java.lang.String)) {
            return 0;
        }
        try {
            return java.lang.Integer.parseInt((java.lang.String) obj);
        } catch (java.lang.NumberFormatException unused) {
            java.lang.String strValueOf = java.lang.String.valueOf(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(strValueOf);
            android.util.Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    public final int getOriginalPriority() {
        java.lang.String string = this.zza.getString("google.original_priority");
        if (string == null) {
            string = this.zza.getString("google.priority");
        }
        return zza(string);
    }

    public final int getPriority() {
        java.lang.String string = this.zza.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.zza.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.zza.getString("google.priority");
        }
        return zza(string);
    }

    private static int zza(java.lang.String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public final com.google.firebase.messaging.RemoteMessage.Notification getNotification() {
        if (this.zzc == null && com.google.firebase.messaging.zzt.zza(this.zza)) {
            this.zzc = new com.google.firebase.messaging.RemoteMessage.Notification(new com.google.firebase.messaging.zzt(this.zza));
        }
        return this.zzc;
    }

    public final android.content.Intent toIntent() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(this.zza);
        return intent;
    }
}
