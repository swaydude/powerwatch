package com.google.firebase.installations;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInstallations implements com.google.firebase.installations.FirebaseInstallationsApi {
    private static final java.lang.String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30;
    private static final java.lang.String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private final java.util.concurrent.ExecutorService backgroundExecutor;
    private final com.google.firebase.installations.RandomFidGenerator fidGenerator;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.installations.local.IidStore iidStore;
    private final java.util.List<com.google.firebase.installations.StateListener> listeners;
    private final java.lang.Object lock;
    private final java.util.concurrent.ExecutorService networkExecutor;
    private final com.google.firebase.installations.local.PersistedInstallation persistedInstallation;
    private final com.google.firebase.installations.remote.FirebaseInstallationServiceClient serviceClient;
    private final com.google.firebase.installations.Utils utils;
    private static final java.lang.Object lockGenerateFid = new java.lang.Object();
    private static final java.util.concurrent.ThreadFactory THREAD_FACTORY = new java.util.concurrent.ThreadFactory() { // from class: com.google.firebase.installations.FirebaseInstallations.1
        private final java.util.concurrent.atomic.AtomicInteger mCount = new java.util.concurrent.atomic.AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new java.lang.Thread(runnable, java.lang.String.format("firebase-installations-executor-%d", java.lang.Integer.valueOf(this.mCount.getAndIncrement())));
        }
    };

    FirebaseInstallations(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.platforminfo.UserAgentPublisher userAgentPublisher, com.google.firebase.heartbeatinfo.HeartBeatInfo heartBeatInfo) {
        this(new java.util.concurrent.ThreadPoolExecutor(0, 1, KEEP_ALIVE_TIME_IN_SECONDS, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), THREAD_FACTORY), firebaseApp, new com.google.firebase.installations.remote.FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), userAgentPublisher, heartBeatInfo), new com.google.firebase.installations.local.PersistedInstallation(firebaseApp), new com.google.firebase.installations.Utils(), new com.google.firebase.installations.local.IidStore(firebaseApp), new com.google.firebase.installations.RandomFidGenerator());
    }

    FirebaseInstallations(java.util.concurrent.ExecutorService executorService, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.remote.FirebaseInstallationServiceClient firebaseInstallationServiceClient, com.google.firebase.installations.local.PersistedInstallation persistedInstallation, com.google.firebase.installations.Utils utils, com.google.firebase.installations.local.IidStore iidStore, com.google.firebase.installations.RandomFidGenerator randomFidGenerator) {
        this.lock = new java.lang.Object();
        this.listeners = new java.util.ArrayList();
        this.firebaseApp = firebaseApp;
        this.serviceClient = firebaseInstallationServiceClient;
        this.persistedInstallation = persistedInstallation;
        this.utils = utils;
        this.iidStore = iidStore;
        this.fidGenerator = randomFidGenerator;
        this.backgroundExecutor = executorService;
        this.networkExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, KEEP_ALIVE_TIME_IN_SECONDS, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), THREAD_FACTORY);
    }

    private void preConditionChecks() {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(getApplicationId());
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(getProjectIdentifier());
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(getApiKey());
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.firebase.installations.Utils.isValidAppIdFormat(getApplicationId()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.firebase.installations.Utils.isValidApiKeyFormat(getApiKey()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    java.lang.String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    public static com.google.firebase.installations.FirebaseInstallations getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    public static com.google.firebase.installations.FirebaseInstallations getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (com.google.firebase.installations.FirebaseInstallations) firebaseApp.get(com.google.firebase.installations.FirebaseInstallationsApi.class);
    }

    java.lang.String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    java.lang.String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    java.lang.String getName() {
        return this.firebaseApp.getName();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<java.lang.String> getId() {
        preConditionChecks();
        com.google.android.gms.tasks.Task<java.lang.String> taskAddGetIdListener = addGetIdListener();
        this.backgroundExecutor.execute(com.google.firebase.installations.FirebaseInstallations$$Lambda$1.lambdaFactory$(this));
        return taskAddGetIdListener;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> getToken(boolean z) {
        preConditionChecks();
        com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> taskAddGetAuthTokenListener = addGetAuthTokenListener();
        if (z) {
            this.backgroundExecutor.execute(com.google.firebase.installations.FirebaseInstallations$$Lambda$2.lambdaFactory$(this));
        } else {
            this.backgroundExecutor.execute(com.google.firebase.installations.FirebaseInstallations$$Lambda$3.lambdaFactory$(this));
        }
        return taskAddGetAuthTokenListener;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    public com.google.android.gms.tasks.Task<java.lang.Void> delete() {
        return com.google.android.gms.tasks.Tasks.call(this.backgroundExecutor, com.google.firebase.installations.FirebaseInstallations$$Lambda$4.lambdaFactory$(this));
    }

    private com.google.android.gms.tasks.Task<java.lang.String> addGetIdListener() {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.firebase.installations.GetIdListener getIdListener = new com.google.firebase.installations.GetIdListener(taskCompletionSource);
        synchronized (this.lock) {
            this.listeners.add(getIdListener);
        }
        return taskCompletionSource.getTask();
    }

    private com.google.android.gms.tasks.Task<com.google.firebase.installations.InstallationTokenResult> addGetAuthTokenListener() {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.firebase.installations.GetAuthTokenListener getAuthTokenListener = new com.google.firebase.installations.GetAuthTokenListener(this.utils, taskCompletionSource);
        synchronized (this.lock) {
            this.listeners.add(getAuthTokenListener);
        }
        return taskCompletionSource.getTask();
    }

    private void triggerOnStateReached(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.lock) {
            java.util.Iterator<com.google.firebase.installations.StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onStateReached(persistedInstallationEntry)) {
                    it.remove();
                }
            }
        }
    }

    private void triggerOnException(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry, java.lang.Exception exc) {
        synchronized (this.lock) {
            java.util.Iterator<com.google.firebase.installations.StateListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                if (it.next().onException(persistedInstallationEntry, exc)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doGetId() {
        doRegistrationInternal(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doGetAuthTokenWithoutForceRefresh() {
        doRegistrationInternal(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doGetAuthTokenForceRefresh() {
        doRegistrationInternal(true);
    }

    private final void doRegistrationInternal(boolean z) {
        com.google.firebase.installations.local.PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        if (z) {
            prefsWithGeneratedIdMultiProcessSafe = prefsWithGeneratedIdMultiProcessSafe.withClearedAuthToken();
        }
        triggerOnStateReached(prefsWithGeneratedIdMultiProcessSafe);
        this.networkExecutor.execute(com.google.firebase.installations.FirebaseInstallations$$Lambda$5.lambdaFactory$(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doNetworkCall(boolean z) {
        com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntryRegisterFidWithServer;
        com.google.firebase.installations.local.PersistedInstallationEntry prefsWithGeneratedIdMultiProcessSafe = getPrefsWithGeneratedIdMultiProcessSafe();
        try {
            if (prefsWithGeneratedIdMultiProcessSafe.isErrored() || prefsWithGeneratedIdMultiProcessSafe.isUnregistered()) {
                persistedInstallationEntryRegisterFidWithServer = registerFidWithServer(prefsWithGeneratedIdMultiProcessSafe);
            } else {
                if (!z && !this.utils.isAuthTokenExpired(prefsWithGeneratedIdMultiProcessSafe)) {
                    return;
                }
                persistedInstallationEntryRegisterFidWithServer = fetchAuthTokenFromServer(prefsWithGeneratedIdMultiProcessSafe);
            }
            insertOrUpdatePrefs(persistedInstallationEntryRegisterFidWithServer);
            if (persistedInstallationEntryRegisterFidWithServer.isErrored()) {
                triggerOnException(persistedInstallationEntryRegisterFidWithServer, new com.google.firebase.installations.FirebaseInstallationsException(com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG));
            } else if (persistedInstallationEntryRegisterFidWithServer.isNotGenerated()) {
                triggerOnException(persistedInstallationEntryRegisterFidWithServer, new java.io.IOException("cleared fid due to auth error"));
            } else {
                triggerOnStateReached(persistedInstallationEntryRegisterFidWithServer);
            }
        } catch (java.io.IOException e) {
            triggerOnException(prefsWithGeneratedIdMultiProcessSafe, e);
        }
    }

    private void insertOrUpdatePrefs(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (lockGenerateFid) {
            com.google.firebase.installations.CrossProcessLock crossProcessLockAcquire = com.google.firebase.installations.CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            try {
                this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
                if (crossProcessLockAcquire != null) {
                    crossProcessLockAcquire.releaseAndClose();
                }
            } catch (java.lang.Throwable th) {
                if (crossProcessLockAcquire != null) {
                    crossProcessLockAcquire.releaseAndClose();
                }
                throw th;
            }
        }
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (lockGenerateFid) {
            com.google.firebase.installations.CrossProcessLock crossProcessLockAcquire = com.google.firebase.installations.CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), LOCKFILE_NAME_GENERATE_FID);
            try {
                persistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
                if (persistedInstallationEntryValue.isNotGenerated()) {
                    persistedInstallationEntryValue = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(readExistingIidOrCreateFid(persistedInstallationEntryValue)));
                }
                if (crossProcessLockAcquire != null) {
                    crossProcessLockAcquire.releaseAndClose();
                }
            } catch (java.lang.Throwable th) {
                if (crossProcessLockAcquire != null) {
                    crossProcessLockAcquire.releaseAndClose();
                }
                throw th;
            }
        }
        return persistedInstallationEntryValue;
    }

    private java.lang.String readExistingIidOrCreateFid(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.firebaseApp.getName().equals(CHIME_FIREBASE_APP_NAME) && !this.firebaseApp.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.fidGenerator.createRandomFid();
        }
        java.lang.String iid = this.iidStore.readIid();
        return android.text.TextUtils.isEmpty(iid) ? this.fidGenerator.createRandomFid() : iid;
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry registerFidWithServer(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) throws java.io.IOException {
        com.google.firebase.installations.remote.InstallationResponse installationResponseCreateFirebaseInstallation = this.serviceClient.createFirebaseInstallation(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), getApplicationId(), persistedInstallationEntry.getFirebaseInstallationId().length() == 11 ? this.iidStore.readToken() : null);
        int i = com.google.firebase.installations.FirebaseInstallations.AnonymousClass2.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[installationResponseCreateFirebaseInstallation.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withRegisteredFid(installationResponseCreateFirebaseInstallation.getFid(), installationResponseCreateFirebaseInstallation.getRefreshToken(), this.utils.currentTimeInSecs(), installationResponseCreateFirebaseInstallation.getAuthToken().getToken(), installationResponseCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        throw new java.io.IOException();
    }

    private com.google.firebase.installations.local.PersistedInstallationEntry fetchAuthTokenFromServer(com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntry) throws java.io.IOException {
        com.google.firebase.installations.remote.TokenResult tokenResultGenerateAuthToken = this.serviceClient.generateAuthToken(getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntry.getRefreshToken());
        int i = com.google.firebase.installations.FirebaseInstallations.AnonymousClass2.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[tokenResultGenerateAuthToken.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withAuthToken(tokenResultGenerateAuthToken.getToken(), tokenResultGenerateAuthToken.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        if (i == 3) {
            return persistedInstallationEntry.withNoGeneratedFid();
        }
        throw new java.io.IOException();
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.FirebaseInstallations$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;

        static {
            int[] iArr = new int[com.google.firebase.installations.remote.TokenResult.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = iArr;
            try {
                iArr[com.google.firebase.installations.remote.TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values().length];
            $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = iArr2;
            try {
                iArr2[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Void deleteFirebaseInstallationId() throws java.io.IOException, com.google.firebase.installations.FirebaseInstallationsException {
        com.google.firebase.installations.local.PersistedInstallationEntry persistedInstallationEntryValue = this.persistedInstallation.readPersistedInstallationEntryValue();
        if (persistedInstallationEntryValue.isRegistered()) {
            try {
                this.serviceClient.deleteFirebaseInstallation(getApiKey(), persistedInstallationEntryValue.getFirebaseInstallationId(), getProjectIdentifier(), persistedInstallationEntryValue.getRefreshToken());
            } catch (com.google.firebase.FirebaseException unused) {
                throw new com.google.firebase.installations.FirebaseInstallationsException("Failed to delete a Firebase Installation.", com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG);
            }
        }
        insertOrUpdatePrefs(persistedInstallationEntryValue.withNoGeneratedFid());
        return null;
    }
}
