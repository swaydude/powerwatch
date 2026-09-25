package com.google.android.gms.measurement.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {
    private final com.google.android.gms.internal.measurement.zzx zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
    public static final class ConditionalUserProperty {
        public static final java.lang.String ACTIVE = "active";
        public static final java.lang.String CREATION_TIMESTAMP = "creation_timestamp";
        public static final java.lang.String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final java.lang.String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String ORIGIN = "origin";
        public static final java.lang.String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final java.lang.String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final java.lang.String TIME_TO_LIVE = "time_to_live";
        public static final java.lang.String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final java.lang.String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final java.lang.String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final java.lang.String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final java.lang.String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final java.lang.String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
    public interface EventInterceptor extends com.google.android.gms.measurement.internal.zzho {
        @Override // com.google.android.gms.measurement.internal.zzho
        void interceptEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.2.3 */
    public interface OnEventListener extends com.google.android.gms.measurement.internal.zzhn {
        @Override // com.google.android.gms.measurement.internal.zzhn
        void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j);
    }

    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context context) {
        return com.google.android.gms.internal.measurement.zzx.zza(context).zza();
    }

    public static com.google.android.gms.measurement.api.AppMeasurementSdk getInstance(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle) {
        return com.google.android.gms.internal.measurement.zzx.zza(context, str, str2, str3, bundle).zza();
    }

    public AppMeasurementSdk(com.google.android.gms.internal.measurement.zzx zzxVar) {
        this.zza = zzxVar;
    }

    public void setMeasurementEnabled(boolean z) {
        this.zza.zza(z);
    }

    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    public void logEventNoInterceptor(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza.zza(str, str2, bundle, j);
    }

    public void setUserProperty(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this.zza.zza(str, str2, obj);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getUserProperties(java.lang.String str, java.lang.String str2, boolean z) {
        return this.zza.zza(str, str2, z);
    }

    public void setConditionalUserProperty(android.os.Bundle bundle) {
        this.zza.zza(bundle);
    }

    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.zzb(str, str2, bundle);
    }

    public java.util.List<android.os.Bundle> getConditionalUserProperties(java.lang.String str, java.lang.String str2) {
        return this.zza.zzb(str, str2);
    }

    public java.lang.String getCurrentScreenName() {
        return this.zza.zzf();
    }

    public java.lang.String getCurrentScreenClass() {
        return this.zza.zzg();
    }

    public java.lang.String getAppInstanceId() {
        return this.zza.zzd();
    }

    public java.lang.String getGmpAppId() {
        return this.zza.zzc();
    }

    public long generateEventId() {
        return this.zza.zze();
    }

    public void beginAdUnitExposure(java.lang.String str) {
        this.zza.zzb(str);
    }

    public void endAdUnitExposure(java.lang.String str) {
        this.zza.zzc(str);
    }

    public void setEventInterceptor(com.google.android.gms.measurement.api.AppMeasurementSdk.EventInterceptor eventInterceptor) {
        this.zza.zza(eventInterceptor);
    }

    public void registerOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener onEventListener) {
        this.zza.zza(onEventListener);
    }

    public void unregisterOnMeasurementEventListener(com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener onEventListener) {
        this.zza.zzb(onEventListener);
    }

    public android.os.Bundle performActionWithResponse(android.os.Bundle bundle) {
        return this.zza.zza(bundle, true);
    }

    public void performAction(android.os.Bundle bundle) {
        this.zza.zza(bundle, false);
    }

    public int getMaxUserProperties(java.lang.String str) {
        return this.zza.zzd(str);
    }

    public void setCurrentScreen(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.zza.zza(activity, str, str2);
    }

    public java.lang.String getAppIdOrigin() {
        return this.zza.zzi();
    }
}
