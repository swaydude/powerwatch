package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailability extends com.google.android.gms.common.GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private java.lang.String zaap;
    private static final java.lang.Object mLock = new java.lang.Object();
    private static final com.google.android.gms.common.GoogleApiAvailability zaao = new com.google.android.gms.common.GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static com.google.android.gms.common.GoogleApiAvailability getInstance() {
        return zaao;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(android.app.Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (iIsGooglePlayServicesAvailable == 0) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.android.gms.common.api.internal.zabt zabtVarZac = com.google.android.gms.common.api.internal.zabt.zac(activity);
        zabtVarZac.zab(new com.google.android.gms.common.ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zabtVarZac.getTask();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private class zaa extends com.google.android.gms.internal.base.zar {
        private final android.content.Context zaas;

        public zaa(android.content.Context context) {
            super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper());
            this.zaas = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            if (message.what == 1) {
                int iIsGooglePlayServicesAvailable = com.google.android.gms.common.GoogleApiAvailability.this.isGooglePlayServicesAvailable(this.zaas);
                if (com.google.android.gms.common.GoogleApiAvailability.this.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
                    com.google.android.gms.common.GoogleApiAvailability.this.showErrorNotification(this.zaas, iIsGooglePlayServicesAvailable);
                    return;
                }
                return;
            }
            int i = message.what;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            android.util.Log.w("GoogleApiAvailability", sb.toString());
        }
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, null);
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, com.google.android.gms.common.internal.DialogRedirect.getInstance(activity, getErrorResolutionIntent(activity, i, "d"), i2), onCancelListener);
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    public final boolean zaa(android.app.Activity activity, com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialogZaa = zaa(activity, i, com.google.android.gms.common.internal.DialogRedirect.getInstance(lifecycleFragment, getErrorResolutionIntent(activity, i, "d"), 2), onCancelListener);
        if (dialogZaa == null) {
            return false;
        }
        zaa(activity, dialogZaa, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zaa(activity, errorDialog, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void showErrorNotification(android.content.Context context, int i) {
        zaa(context, i, (java.lang.String) null, getErrorResolutionPendingIntent(context, i, 0, "n"));
    }

    public void showErrorNotification(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        zaa(context, connectionResult.getErrorCode(), (java.lang.String) null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public final boolean zaa(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        android.app.PendingIntent errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult);
        if (errorResolutionPendingIntent == null) {
            return false;
        }
        zaa(context, connectionResult.getErrorCode(), (java.lang.String) null, com.google.android.gms.common.api.GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i));
        return true;
    }

    public static android.app.Dialog zaa(android.app.Activity activity, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorMessage(activity, 18));
        builder.setPositiveButton("", (android.content.DialogInterface.OnClickListener) null);
        android.app.AlertDialog alertDialogCreate = builder.create();
        zaa(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final com.google.android.gms.common.api.internal.zabq zaa(android.content.Context context, com.google.android.gms.common.api.internal.zabp zabpVar) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.google.android.gms.common.api.internal.zabq zabqVar = new com.google.android.gms.common.api.internal.zabq(zabpVar);
        context.registerReceiver(zabqVar, intentFilter);
        zabqVar.zac(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabqVar;
        }
        zabpVar.zas();
        zabqVar.unregister();
        return null;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.HasApiKey<?> hasApiKey, com.google.android.gms.common.api.HasApiKey<?>... hasApiKeyArr) {
        return zaa(hasApiKey, hasApiKeyArr).onSuccessTask(com.google.android.gms.common.zab.zaar);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.GoogleApi<?>... googleApiArr) {
        return zaa(googleApi, googleApiArr).continueWith(new com.google.android.gms.common.zaa(this));
    }

    private static com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, java.lang.String>> zaa(com.google.android.gms.common.api.HasApiKey<?> hasApiKey, com.google.android.gms.common.api.HasApiKey<?>... hasApiKeyArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (com.google.android.gms.common.api.HasApiKey<?> hasApiKey2 : hasApiKeyArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(java.util.Arrays.asList(hasApiKeyArr));
        return com.google.android.gms.common.api.internal.GoogleApiManager.zaba().zaa(arrayList);
    }

    private final java.lang.String zag() {
        java.lang.String str;
        synchronized (mLock) {
            str = this.zaap;
        }
        return str;
    }

    public void setDefaultNotificationChannelId(android.content.Context context, java.lang.String str) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.NotificationManager) context.getSystemService("notification")).getNotificationChannel(str));
        }
        synchronized (mLock) {
            this.zaap = str;
        }
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.content.Intent getErrorResolutionIntent(android.content.Context context, int i, java.lang.String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(android.content.Context context) {
        return super.getClientVersion(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final java.lang.String getErrorString(int i) {
        return super.getErrorString(i);
    }

    static android.app.Dialog zaa(android.content.Context context, int i, com.google.android.gms.common.internal.DialogRedirect dialogRedirect, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorMessage(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        java.lang.String errorDialogButtonMessage = com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorDialogButtonMessage(context, i);
        if (errorDialogButtonMessage != null) {
            builder.setPositiveButton(errorDialogButtonMessage, dialogRedirect);
        }
        java.lang.String errorTitle = com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorTitle(context, i);
        if (errorTitle != null) {
            builder.setTitle(errorTitle);
        }
        return builder.create();
    }

    static void zaa(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            com.google.android.gms.common.SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), str);
        } else {
            com.google.android.gms.common.ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
        }
    }

    private final void zaa(android.content.Context context, int i, java.lang.String str, android.app.PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            zaa(context);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        java.lang.String errorNotificationTitle = com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorNotificationTitle(context, i);
        java.lang.String errorNotificationMessage = com.google.android.gms.common.internal.ConnectionErrorMessages.getErrorNotificationMessage(context, i);
        android.content.res.Resources resources = context.getResources();
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        androidx.core.app.NotificationCompat.Builder style = new androidx.core.app.NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(errorNotificationTitle).setStyle(new androidx.core.app.NotificationCompat.BigTextStyle().bigText(errorNotificationMessage));
        if (com.google.android.gms.common.util.DeviceProperties.isWearable(context)) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch());
            style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
            if (com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context)) {
                style.addAction(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
            } else {
                style.setContentIntent(pendingIntent);
            }
        } else {
            style.setSmallIcon(android.R.drawable.stat_sys_warning).setTicker(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).setWhen(java.lang.System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(errorNotificationMessage);
        }
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastO());
            java.lang.String strZag = zag();
            if (strZag == null) {
                strZag = "com.google.android.gms.availability";
                android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                java.lang.String defaultNotificationChannelName = com.google.android.gms.common.internal.ConnectionErrorMessages.getDefaultNotificationChannelName(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.google.android.gms.availability", defaultNotificationChannelName, 4));
                } else if (!defaultNotificationChannelName.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(defaultNotificationChannelName);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            style.setChannelId(strZag);
        }
        android.app.Notification notificationBuild = style.build();
        if (i == 1 || i == 2 || i == 3) {
            i2 = 10436;
            com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationBuild);
    }

    final void zaa(android.content.Context context) {
        new com.google.android.gms.common.GoogleApiAvailability.zaa(context).sendEmptyMessageDelayed(1, 120000L);
    }
}
