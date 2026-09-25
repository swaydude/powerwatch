package com.crashlytics.android.answers;

/* JADX INFO: loaded from: classes.dex */
public class Answers extends io.fabric.sdk.android.Kit<java.lang.Boolean> {
    static final java.lang.String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    public static final java.lang.String TAG = "Answers";
    com.crashlytics.android.answers.SessionAnalyticsManager analyticsManager;
    boolean firebaseEnabled = false;

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getVersion() {
        return "1.4.7.32";
    }

    public static com.crashlytics.android.answers.Answers getInstance() {
        return (com.crashlytics.android.answers.Answers) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.answers.Answers.class);
    }

    public void logCustom(com.crashlytics.android.answers.CustomEvent customEvent) {
        java.util.Objects.requireNonNull(customEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logCustom");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onCustom(customEvent);
        }
    }

    public void logPurchase(com.crashlytics.android.answers.PurchaseEvent purchaseEvent) {
        java.util.Objects.requireNonNull(purchaseEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logPurchase");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(purchaseEvent);
        }
    }

    public void logLogin(com.crashlytics.android.answers.LoginEvent loginEvent) {
        java.util.Objects.requireNonNull(loginEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLogin");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(loginEvent);
        }
    }

    public void logShare(com.crashlytics.android.answers.ShareEvent shareEvent) {
        java.util.Objects.requireNonNull(shareEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logShare");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(shareEvent);
        }
    }

    public void logInvite(com.crashlytics.android.answers.InviteEvent inviteEvent) {
        java.util.Objects.requireNonNull(inviteEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logInvite");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(inviteEvent);
        }
    }

    public void logSignUp(com.crashlytics.android.answers.SignUpEvent signUpEvent) {
        java.util.Objects.requireNonNull(signUpEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSignUp");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(signUpEvent);
        }
    }

    public void logLevelStart(com.crashlytics.android.answers.LevelStartEvent levelStartEvent) {
        java.util.Objects.requireNonNull(levelStartEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelStart");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(levelStartEvent);
        }
    }

    public void logLevelEnd(com.crashlytics.android.answers.LevelEndEvent levelEndEvent) {
        java.util.Objects.requireNonNull(levelEndEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelEnd");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(levelEndEvent);
        }
    }

    public void logAddToCart(com.crashlytics.android.answers.AddToCartEvent addToCartEvent) {
        java.util.Objects.requireNonNull(addToCartEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logAddToCart");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(addToCartEvent);
        }
    }

    public void logStartCheckout(com.crashlytics.android.answers.StartCheckoutEvent startCheckoutEvent) {
        java.util.Objects.requireNonNull(startCheckoutEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logStartCheckout");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(startCheckoutEvent);
        }
    }

    public void logRating(com.crashlytics.android.answers.RatingEvent ratingEvent) {
        java.util.Objects.requireNonNull(ratingEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logRating");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(ratingEvent);
        }
    }

    public void logContentView(com.crashlytics.android.answers.ContentViewEvent contentViewEvent) {
        java.util.Objects.requireNonNull(contentViewEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logContentView");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(contentViewEvent);
        }
    }

    public void logSearch(com.crashlytics.android.answers.SearchEvent searchEvent) {
        java.util.Objects.requireNonNull(searchEvent, "event must not be null");
        if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSearch");
            return;
        }
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onPredefined(searchEvent);
        }
    }

    public void onException(io.fabric.sdk.android.services.common.Crash.LoggedException loggedException) {
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onError(loggedException.getSessionId());
        }
    }

    public void onException(io.fabric.sdk.android.services.common.Crash.FatalException fatalException) {
        com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onCrash(fatalException.getSessionId(), fatalException.getExceptionName());
        }
    }

    @Override // io.fabric.sdk.android.Kit
    protected boolean onPreExecute() {
        long jLastModified;
        try {
            android.content.Context context = getContext();
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.lang.String packageName = context.getPackageName();
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            java.lang.String string = java.lang.Integer.toString(packageInfo.versionCode);
            java.lang.String str = packageInfo.versionName == null ? io.fabric.sdk.android.services.common.IdManager.DEFAULT_VERSION_NAME : packageInfo.versionName;
            if (android.os.Build.VERSION.SDK_INT >= 9) {
                jLastModified = packageInfo.firstInstallTime;
            } else {
                jLastModified = new java.io.File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            com.crashlytics.android.answers.SessionAnalyticsManager sessionAnalyticsManagerBuild = com.crashlytics.android.answers.SessionAnalyticsManager.build(this, context, getIdManager(), string, str, jLastModified);
            this.analyticsManager = sessionAnalyticsManagerBuild;
            sessionAnalyticsManagerBuild.enable();
            this.firebaseEnabled = new io.fabric.sdk.android.services.common.FirebaseInfo().isFirebaseCrashlyticsEnabled(context);
            return true;
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Error retrieving app properties", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.fabric.sdk.android.Kit
    public java.lang.Boolean doInBackground() {
        if (!io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(getContext()).isDataCollectionEnabled()) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Analytics collection disabled, because data collection is disabled by Firebase.");
            this.analyticsManager.disable();
            return false;
        }
        try {
            io.fabric.sdk.android.services.settings.SettingsData settingsDataAwaitSettingsData = io.fabric.sdk.android.services.settings.Settings.getInstance().awaitSettingsData();
            if (settingsDataAwaitSettingsData == null) {
                io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Failed to retrieve settings");
                return false;
            }
            if (settingsDataAwaitSettingsData.featuresData.collectAnalytics) {
                io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Analytics collection enabled");
                this.analyticsManager.setAnalyticsSettingsData(settingsDataAwaitSettingsData.analyticsSettingsData, getOverridenSpiEndpoint());
                return true;
            }
            io.fabric.sdk.android.Fabric.getLogger().d(TAG, "Analytics collection disabled");
            this.analyticsManager.disable();
            return false;
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().e(TAG, "Error dealing with settings", e);
            return false;
        }
    }

    java.lang.String getOverridenSpiEndpoint() {
        return io.fabric.sdk.android.services.common.CommonUtils.getStringsFileValue(getContext(), CRASHLYTICS_API_ENDPOINT);
    }

    private void logFirebaseModeEnabledWarning(java.lang.String str) {
        io.fabric.sdk.android.Fabric.getLogger().w(TAG, "Method " + str + " is not supported when using Crashlytics through Firebase.");
    }
}
