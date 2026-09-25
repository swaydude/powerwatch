package com.google.android.gms.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class AppMeasurement {
    public static final java.lang.String CRASH_ORIGIN = "crash";
    public static final java.lang.String FCM_ORIGIN = "fcm";
    public static final java.lang.String FIAM_ORIGIN = "fiam";
    private static volatile com.google.android.gms.measurement.AppMeasurement zza;
    private final com.google.android.gms.measurement.internal.zzgo zzb;
    private final com.google.android.gms.measurement.internal.zzio zzc;
    private final boolean zzd;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public java.lang.String mAppId;
        public long mCreationTimestamp;
        public java.lang.String mExpiredEventName;
        public android.os.Bundle mExpiredEventParams;
        public java.lang.String mName;
        public java.lang.String mOrigin;
        public long mTimeToLive;
        public java.lang.String mTimedOutEventName;
        public android.os.Bundle mTimedOutEventParams;
        public java.lang.String mTriggerEventName;
        public long mTriggerTimeout;
        public java.lang.String mTriggeredEventName;
        public android.os.Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public java.lang.Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            java.lang.Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                java.lang.Object objZza = com.google.android.gms.measurement.internal.zziu.zza(obj);
                this.mValue = objZza;
                if (objZza == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new android.os.Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new android.os.Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new android.os.Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }

        private ConditionalUserProperty(android.os.Bundle bundle) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
            this.mAppId = (java.lang.String) com.google.android.gms.measurement.internal.zzhk.zza(bundle, "app_id", java.lang.String.class, null);
            this.mOrigin = (java.lang.String) com.google.android.gms.measurement.internal.zzhk.zza(bundle, "origin", java.lang.String.class, null);
            this.mName = (java.lang.String) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, java.lang.String.class, null);
            this.mValue = com.google.android.gms.measurement.internal.zzhk.zza(bundle, "value", java.lang.Object.class, null);
            this.mTriggerEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, java.lang.String.class, null);
            this.mTriggerTimeout = ((java.lang.Long) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.class, 0L)).longValue();
            this.mTimedOutEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, java.lang.String.class, null);
            this.mTimedOutEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, android.os.Bundle.class, null);
            this.mTriggeredEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, java.lang.String.class, null);
            this.mTriggeredEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, android.os.Bundle.class, null);
            this.mTimeToLive = ((java.lang.Long) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.class, 0L)).longValue();
            this.mExpiredEventName = (java.lang.String) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, java.lang.String.class, null);
            this.mExpiredEventParams = (android.os.Bundle) com.google.android.gms.measurement.internal.zzhk.zza(bundle, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, android.os.Bundle.class, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.os.Bundle zza() {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            java.lang.String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            java.lang.String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
            }
            java.lang.Object obj = this.mValue;
            if (obj != null) {
                com.google.android.gms.measurement.internal.zzhk.zza(bundle, obj);
            }
            java.lang.String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str4);
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, this.mTriggerTimeout);
            java.lang.String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str5);
            }
            android.os.Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            java.lang.String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str6);
            }
            android.os.Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, this.mTimeToLive);
            java.lang.String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str7);
            }
            android.os.Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
            }
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, this.mCreationTimestamp);
            bundle.putBoolean(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, this.mActive);
            bundle.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, this.mTriggeredTimestamp);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public static final class Event extends com.google.android.gms.measurement.internal.zzhj {
        public static final java.lang.String AD_REWARD = "_ar";
        public static final java.lang.String APP_EXCEPTION = "_ae";

        private Event() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public interface EventInterceptor extends com.google.android.gms.measurement.internal.zzho {
        @Override // com.google.android.gms.measurement.internal.zzho
        void interceptEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public interface OnEventListener extends com.google.android.gms.measurement.internal.zzhn {
        @Override // com.google.android.gms.measurement.internal.zzhn
        void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public static final class Param extends com.google.android.gms.measurement.internal.zzhm {
        public static final java.lang.String FATAL = "fatal";
        public static final java.lang.String TIMESTAMP = "timestamp";
        public static final java.lang.String TYPE = "type";

        private Param() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
    public static final class UserProperty extends com.google.android.gms.measurement.internal.zzhl {
        public static final java.lang.String FIREBASE_LAST_NOTIFICATION = "_ln";

        private UserProperty() {
        }
    }

    @java.lang.Deprecated
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context context) {
        return zza(context, null, null);
    }

    private static com.google.android.gms.measurement.AppMeasurement zza(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (zza == null) {
            synchronized (com.google.android.gms.measurement.AppMeasurement.class) {
                if (zza == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVarZzb = zzb(context, null);
                    if (zzioVarZzb != null) {
                        zza = new com.google.android.gms.measurement.AppMeasurement(zzioVarZzb);
                    } else {
                        zza = new com.google.android.gms.measurement.AppMeasurement(com.google.android.gms.measurement.internal.zzgo.zza(context, null, null, null));
                    }
                }
            }
        }
        return zza;
    }

    public static com.google.android.gms.measurement.AppMeasurement zza(android.content.Context context, android.os.Bundle bundle) {
        if (zza == null) {
            synchronized (com.google.android.gms.measurement.AppMeasurement.class) {
                if (zza == null) {
                    com.google.android.gms.measurement.internal.zzio zzioVarZzb = zzb(context, bundle);
                    if (zzioVarZzb != null) {
                        zza = new com.google.android.gms.measurement.AppMeasurement(zzioVarZzb);
                    } else {
                        zza = new com.google.android.gms.measurement.AppMeasurement(com.google.android.gms.measurement.internal.zzgo.zza(context, null, null, bundle));
                    }
                }
            }
        }
        return zza;
    }

    private static com.google.android.gms.measurement.internal.zzio zzb(android.content.Context context, android.os.Bundle bundle) {
        try {
            return (com.google.android.gms.measurement.internal.zzio) java.lang.Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", android.content.Context.class, android.os.Bundle.class).invoke(null, context, bundle);
        } catch (java.lang.ClassNotFoundException | java.lang.Exception unused) {
            return null;
        }
    }

    @java.lang.Deprecated
    public void setMeasurementEnabled(boolean z) {
        if (this.zzd) {
            this.zzc.zza(z);
        } else {
            this.zzb.zzh().zza(z);
        }
    }

    public final void zza(boolean z) {
        if (this.zzd) {
            this.zzc.zzb(z);
        } else {
            this.zzb.zzh().zzb(z);
        }
    }

    private AppMeasurement(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgoVar);
        this.zzb = zzgoVar;
        this.zzc = null;
        this.zzd = false;
    }

    private AppMeasurement(com.google.android.gms.measurement.internal.zzio zzioVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzioVar);
        this.zzc = zzioVar;
        this.zzb = null;
        this.zzd = true;
    }

    public void logEventInternal(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (this.zzd) {
            this.zzc.zza(str, str2, bundle);
        } else {
            this.zzb.zzh().zza(str, str2, bundle);
        }
    }

    public void logEventInternalNoInterceptor(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        if (this.zzd) {
            this.zzc.zza(str, str2, bundle, j);
        } else {
            this.zzb.zzh().zza(str, str2, bundle, true, false, j);
        }
    }

    public void setUserPropertyInternal(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        if (this.zzd) {
            this.zzc.zza(str, str2, obj);
        } else {
            this.zzb.zzh().zza(str, str2, obj, true);
        }
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(boolean z) {
        if (this.zzd) {
            return this.zzc.zza((java.lang.String) null, (java.lang.String) null, z);
        }
        java.util.List<com.google.android.gms.measurement.internal.zzkz> listZzc = this.zzb.zzh().zzc(z);
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(listZzc.size());
        for (com.google.android.gms.measurement.internal.zzkz zzkzVar : listZzc) {
            arrayMap.put(zzkzVar.zza, zzkzVar.zza());
        }
        return arrayMap;
    }

    public void setEventInterceptor(com.google.android.gms.measurement.AppMeasurement.EventInterceptor eventInterceptor) {
        if (this.zzd) {
            this.zzc.zza(eventInterceptor);
        } else {
            this.zzb.zzh().zza(eventInterceptor);
        }
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        if (this.zzd) {
            this.zzc.zza(onEventListener);
        } else {
            this.zzb.zzh().zza(onEventListener);
        }
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.AppMeasurement.OnEventListener onEventListener) {
        if (this.zzd) {
            this.zzc.zzb(onEventListener);
        } else {
            this.zzb.zzh().zzb(onEventListener);
        }
    }

    public java.lang.String getCurrentScreenName() {
        if (this.zzd) {
            return this.zzc.zza();
        }
        return this.zzb.zzh().zzaj();
    }

    public java.lang.String getCurrentScreenClass() {
        if (this.zzd) {
            return this.zzc.zzb();
        }
        return this.zzb.zzh().zzak();
    }

    public java.lang.String getAppInstanceId() {
        if (this.zzd) {
            return this.zzc.zzc();
        }
        return this.zzb.zzh().zzah();
    }

    public java.lang.String getGmpAppId() {
        if (this.zzd) {
            return this.zzc.zzd();
        }
        return this.zzb.zzh().zzal();
    }

    public long generateEventId() {
        if (this.zzd) {
            return this.zzc.zze();
        }
        return this.zzb.zzi().zzg();
    }

    public void beginAdUnitExposure(java.lang.String str) {
        if (this.zzd) {
            this.zzc.zza(str);
        } else {
            this.zzb.zzz().zza(str, this.zzb.zzm().elapsedRealtime());
        }
    }

    public void endAdUnitExposure(java.lang.String str) {
        if (this.zzd) {
            this.zzc.zzb(str);
        } else {
            this.zzb.zzz().zzb(str, this.zzb.zzm().elapsedRealtime());
        }
    }

    public void setConditionalUserProperty(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        if (this.zzd) {
            this.zzc.zza(conditionalUserProperty.zza());
        } else {
            this.zzb.zzh().zza(conditionalUserProperty.zza());
        }
    }

    protected void setConditionalUserPropertyAs(com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(conditionalUserProperty);
        if (!this.zzd) {
            this.zzb.zzh().zzb(conditionalUserProperty.zza());
            return;
        }
        throw new java.lang.IllegalStateException("Unexpected call on client side");
    }

    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (this.zzd) {
            this.zzc.zzb(str, str2, bundle);
        } else {
            this.zzb.zzh().zzc(str, str2, bundle);
        }
    }

    protected void clearConditionalUserPropertyAs(java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        if (this.zzd) {
            throw new java.lang.IllegalStateException("Unexpected call on client side");
        }
        this.zzb.zzh().zza(str, str2, str3, bundle);
    }

    protected java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String str, java.lang.String str2, boolean z) {
        if (this.zzd) {
            return this.zzc.zza(str, str2, z);
        }
        return this.zzb.zzh().zza(str, str2, z);
    }

    protected java.util.Map<java.lang.String, java.lang.Object> getUserPropertiesAs(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (this.zzd) {
            throw new java.lang.IllegalStateException("Unexpected call on client side");
        }
        return this.zzb.zzh().zza(str, str2, str3, z);
    }

    public java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        java.util.List<android.os.Bundle> listZza;
        if (this.zzd) {
            listZza = this.zzc.zza(str, str2);
        } else {
            listZza = this.zzb.zzh().zza(str, str2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(listZza == null ? 0 : listZza.size());
        java.util.Iterator<android.os.Bundle> it = listZza.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    protected java.util.List<com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty> getConditionalUserPropertiesAs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.zzd) {
            throw new java.lang.IllegalStateException("Unexpected call on client side");
        }
        java.util.ArrayList<android.os.Bundle> arrayListZza = this.zzb.zzh().zza(str, str2, str3);
        int i = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(arrayListZza == null ? 0 : arrayListZza.size());
        java.util.ArrayList<android.os.Bundle> arrayList2 = arrayListZza;
        int size = arrayList2.size();
        while (i < size) {
            android.os.Bundle bundle = arrayList2.get(i);
            i++;
            arrayList.add(new com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    public int getMaxUserProperties(java.lang.String str) {
        if (this.zzd) {
            return this.zzc.zzc(str);
        }
        this.zzb.zzh();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return 25;
    }

    public java.lang.Boolean getBoolean() {
        if (this.zzd) {
            return (java.lang.Boolean) this.zzc.zza(4);
        }
        return this.zzb.zzh().zzac();
    }

    public java.lang.String getString() {
        if (this.zzd) {
            return (java.lang.String) this.zzc.zza(0);
        }
        return this.zzb.zzh().zzad();
    }

    public java.lang.Long getLong() {
        if (this.zzd) {
            return (java.lang.Long) this.zzc.zza(1);
        }
        return this.zzb.zzh().zzae();
    }

    public java.lang.Integer getInteger() {
        if (this.zzd) {
            return (java.lang.Integer) this.zzc.zza(3);
        }
        return this.zzb.zzh().zzaf();
    }

    public java.lang.Double getDouble() {
        if (this.zzd) {
            return (java.lang.Double) this.zzc.zza(2);
        }
        return this.zzb.zzh().zzag();
    }
}
