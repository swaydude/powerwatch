package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface SessionsApi {
    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> insertSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.SessionReadResult> readSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.request.SessionReadRequest sessionReadRequest);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> registerForSessions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> startSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.fitness.data.Session session);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.fitness.result.SessionStopResult> stopSession(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str);

    com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> unregisterForSessions(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent);

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    public static class ViewIntentBuilder {
        private final android.content.Context zzhy;
        private java.lang.String zzid;
        private com.google.android.gms.fitness.data.Session zzii;
        private boolean zzij = false;

        public ViewIntentBuilder(android.content.Context context) {
            this.zzhy = context;
        }

        public com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder setSession(com.google.android.gms.fitness.data.Session session) {
            this.zzii = session;
            return this;
        }

        public com.google.android.gms.fitness.SessionsApi.ViewIntentBuilder setPreferredApplication(java.lang.String str) {
            this.zzid = str;
            this.zzij = true;
            return this;
        }

        public android.content.Intent build() {
            android.content.Intent intent;
            android.content.pm.ResolveInfo resolveInfoResolveActivity;
            com.google.android.gms.common.internal.Preconditions.checkState(this.zzii != null, "Session must be set");
            android.content.Intent intent2 = new android.content.Intent(com.google.android.gms.fitness.Fitness.ACTION_VIEW);
            intent2.setType(com.google.android.gms.fitness.data.Session.getMimeType(this.zzii.getActivity()));
            com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToIntentExtra(this.zzii, intent2, com.google.android.gms.fitness.data.Session.EXTRA_SESSION);
            if (!this.zzij) {
                this.zzid = this.zzii.getAppPackageName();
            }
            if (this.zzid == null || (resolveInfoResolveActivity = this.zzhy.getPackageManager().resolveActivity((intent = new android.content.Intent(intent2).setPackage(this.zzid)), 0)) == null) {
                return intent2;
            }
            intent.setComponent(new android.content.ComponentName(this.zzid, resolveInfoResolveActivity.activityInfo.name));
            return intent;
        }
    }
}
