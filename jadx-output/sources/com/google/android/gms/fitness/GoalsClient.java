package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoalsClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.GoalsApi zzhw = new com.google.android.gms.internal.fitness.zzdc();

    protected GoalsClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, com.google.android.gms.internal.fitness.zzz.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    GoalsClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, com.google.android.gms.internal.fitness.zzz.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.Goal>> readCurrentGoals(com.google.android.gms.fitness.request.GoalsReadRequest goalsReadRequest) {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzhw.readCurrentGoals(asGoogleApiClient(), goalsReadRequest), com.google.android.gms.fitness.zzi.zzho);
    }
}
