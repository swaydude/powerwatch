package com.crashlytics.android;

/* JADX INFO: loaded from: classes.dex */
public class Crashlytics extends io.fabric.sdk.android.Kit<java.lang.Void> implements io.fabric.sdk.android.KitGroup {
    public static final java.lang.String TAG = "Crashlytics";
    public final com.crashlytics.android.answers.Answers answers;
    public final com.crashlytics.android.beta.Beta beta;
    public final com.crashlytics.android.core.CrashlyticsCore core;
    public final java.util.Collection<? extends io.fabric.sdk.android.Kit> kits;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.fabric.sdk.android.Kit
    public java.lang.Void doInBackground() {
        return null;
    }

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    @Override // io.fabric.sdk.android.Kit
    public java.lang.String getVersion() {
        return "2.10.1.34";
    }

    public Crashlytics() {
        this(new com.crashlytics.android.answers.Answers(), new com.crashlytics.android.beta.Beta(), new com.crashlytics.android.core.CrashlyticsCore());
    }

    Crashlytics(com.crashlytics.android.answers.Answers answers, com.crashlytics.android.beta.Beta beta, com.crashlytics.android.core.CrashlyticsCore crashlyticsCore) {
        this.answers = answers;
        this.beta = beta;
        this.core = crashlyticsCore;
        this.kits = java.util.Collections.unmodifiableCollection(java.util.Arrays.asList(answers, beta, crashlyticsCore));
    }

    public static class Builder {
        private com.crashlytics.android.answers.Answers answers;
        private com.crashlytics.android.beta.Beta beta;
        private com.crashlytics.android.core.CrashlyticsCore core;
        private com.crashlytics.android.core.CrashlyticsCore.Builder coreBuilder;

        @java.lang.Deprecated
        public com.crashlytics.android.Crashlytics.Builder delay(float f) {
            getCoreBuilder().delay(f);
            return this;
        }

        @java.lang.Deprecated
        public com.crashlytics.android.Crashlytics.Builder listener(com.crashlytics.android.core.CrashlyticsListener crashlyticsListener) {
            getCoreBuilder().listener(crashlyticsListener);
            return this;
        }

        @java.lang.Deprecated
        public com.crashlytics.android.Crashlytics.Builder pinningInfo(com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider) {
            getCoreBuilder().pinningInfo(pinningInfoProvider);
            return this;
        }

        @java.lang.Deprecated
        public com.crashlytics.android.Crashlytics.Builder disabled(boolean z) {
            getCoreBuilder().disabled(z);
            return this;
        }

        public com.crashlytics.android.Crashlytics.Builder answers(com.crashlytics.android.answers.Answers answers) {
            java.util.Objects.requireNonNull(answers, "Answers Kit must not be null.");
            if (this.answers != null) {
                throw new java.lang.IllegalStateException("Answers Kit already set.");
            }
            this.answers = answers;
            return this;
        }

        public com.crashlytics.android.Crashlytics.Builder beta(com.crashlytics.android.beta.Beta beta) {
            java.util.Objects.requireNonNull(beta, "Beta Kit must not be null.");
            if (this.beta != null) {
                throw new java.lang.IllegalStateException("Beta Kit already set.");
            }
            this.beta = beta;
            return this;
        }

        public com.crashlytics.android.Crashlytics.Builder core(com.crashlytics.android.core.CrashlyticsCore crashlyticsCore) {
            java.util.Objects.requireNonNull(crashlyticsCore, "CrashlyticsCore Kit must not be null.");
            if (this.core != null) {
                throw new java.lang.IllegalStateException("CrashlyticsCore Kit already set.");
            }
            this.core = crashlyticsCore;
            return this;
        }

        public com.crashlytics.android.Crashlytics build() {
            com.crashlytics.android.core.CrashlyticsCore.Builder builder = this.coreBuilder;
            if (builder != null) {
                if (this.core != null) {
                    throw new java.lang.IllegalStateException("Must not use Deprecated methods delay(), disabled(), listener(), pinningInfoProvider() with core()");
                }
                this.core = builder.build();
            }
            if (this.answers == null) {
                this.answers = new com.crashlytics.android.answers.Answers();
            }
            if (this.beta == null) {
                this.beta = new com.crashlytics.android.beta.Beta();
            }
            if (this.core == null) {
                this.core = new com.crashlytics.android.core.CrashlyticsCore();
            }
            return new com.crashlytics.android.Crashlytics(this.answers, this.beta, this.core);
        }

        private synchronized com.crashlytics.android.core.CrashlyticsCore.Builder getCoreBuilder() {
            if (this.coreBuilder == null) {
                this.coreBuilder = new com.crashlytics.android.core.CrashlyticsCore.Builder();
            }
            return this.coreBuilder;
        }
    }

    @Override // io.fabric.sdk.android.KitGroup
    public java.util.Collection<? extends io.fabric.sdk.android.Kit> getKits() {
        return this.kits;
    }

    public static com.crashlytics.android.Crashlytics getInstance() {
        return (com.crashlytics.android.Crashlytics) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.Crashlytics.class);
    }

    public static com.crashlytics.android.core.PinningInfoProvider getPinningInfoProvider() {
        checkInitialized();
        return getInstance().core.getPinningInfoProvider();
    }

    public static void logException(java.lang.Throwable th) {
        checkInitialized();
        getInstance().core.logException(th);
    }

    public static void log(java.lang.String str) {
        checkInitialized();
        getInstance().core.log(str);
    }

    public static void log(int i, java.lang.String str, java.lang.String str2) {
        checkInitialized();
        getInstance().core.log(i, str, str2);
    }

    public static void setUserIdentifier(java.lang.String str) {
        checkInitialized();
        getInstance().core.setUserIdentifier(str);
    }

    public static void setUserName(java.lang.String str) {
        checkInitialized();
        getInstance().core.setUserName(str);
    }

    public static void setUserEmail(java.lang.String str) {
        checkInitialized();
        getInstance().core.setUserEmail(str);
    }

    public static void setString(java.lang.String str, java.lang.String str2) {
        checkInitialized();
        getInstance().core.setString(str, str2);
    }

    public static void setBool(java.lang.String str, boolean z) {
        checkInitialized();
        getInstance().core.setBool(str, z);
    }

    public static void setDouble(java.lang.String str, double d) {
        checkInitialized();
        getInstance().core.setDouble(str, d);
    }

    public static void setFloat(java.lang.String str, float f) {
        checkInitialized();
        getInstance().core.setFloat(str, f);
    }

    public static void setInt(java.lang.String str, int i) {
        checkInitialized();
        getInstance().core.setInt(str, i);
    }

    public static void setLong(java.lang.String str, long j) {
        checkInitialized();
        getInstance().core.setLong(str, j);
    }

    private static boolean isCrashlyticsCollectionEnabled() {
        checkInitialized();
        return io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(getInstance().getContext()).isDataCollectionEnabled();
    }

    private static void setCrashlyticsCollectionEnabled(boolean z) {
        checkInitialized();
        io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(getInstance().getContext()).setCrashlyticsDataCollectionEnabled(z);
    }

    public void crash() {
        this.core.crash();
    }

    public boolean verifyPinning(java.net.URL url) {
        return this.core.verifyPinning(url);
    }

    @java.lang.Deprecated
    public synchronized void setListener(com.crashlytics.android.core.CrashlyticsListener crashlyticsListener) {
        this.core.setListener(crashlyticsListener);
    }

    @java.lang.Deprecated
    public void setDebugMode(boolean z) {
        io.fabric.sdk.android.Fabric.getLogger().w(TAG, "Use of Crashlytics.setDebugMode is deprecated.");
    }

    @java.lang.Deprecated
    public boolean getDebugMode() {
        io.fabric.sdk.android.Fabric.getLogger().w(TAG, "Use of Crashlytics.getDebugMode is deprecated.");
        getFabric();
        return io.fabric.sdk.android.Fabric.isDebuggable();
    }

    @java.lang.Deprecated
    public static void setPinningInfoProvider(com.crashlytics.android.core.PinningInfoProvider pinningInfoProvider) {
        io.fabric.sdk.android.Fabric.getLogger().w(TAG, "Use of Crashlytics.setPinningInfoProvider is deprecated");
    }

    private static void checkInitialized() {
        if (getInstance() == null) {
            throw new java.lang.IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }
}
