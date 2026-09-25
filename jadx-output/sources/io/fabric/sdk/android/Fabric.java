package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public class Fabric {
    static final java.lang.String ANSWERS_KIT_IDENTIFIER = "com.crashlytics.sdk.android:answers";
    static final java.lang.String CRASHLYTICS_KIT_IDENTIFIER = "com.crashlytics.sdk.android:crashlytics";
    static final boolean DEFAULT_DEBUGGABLE = false;
    static final io.fabric.sdk.android.Logger DEFAULT_LOGGER = new io.fabric.sdk.android.DefaultLogger();
    static final java.lang.String ROOT_DIR = ".Fabric";
    public static final java.lang.String TAG = "Fabric";
    static volatile io.fabric.sdk.android.Fabric singleton;
    private java.lang.ref.WeakReference<android.app.Activity> activity;
    private io.fabric.sdk.android.ActivityLifecycleManager activityLifecycleManager;
    private final android.content.Context context;
    final boolean debuggable;
    private final java.util.concurrent.ExecutorService executorService;
    private final io.fabric.sdk.android.services.common.IdManager idManager;
    private final io.fabric.sdk.android.InitializationCallback<io.fabric.sdk.android.Fabric> initializationCallback;
    private java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final io.fabric.sdk.android.InitializationCallback<?> kitInitializationCallback;
    private final java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> kits;
    final io.fabric.sdk.android.Logger logger;
    private final android.os.Handler mainHandler;

    public java.lang.String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public java.lang.String getVersion() {
        return "1.4.8.32";
    }

    public static class Builder {
        private java.lang.String appIdentifier;
        private java.lang.String appInstallIdentifier;
        private final android.content.Context context;
        private boolean debuggable;
        private android.os.Handler handler;
        private io.fabric.sdk.android.InitializationCallback<io.fabric.sdk.android.Fabric> initializationCallback;
        private io.fabric.sdk.android.Kit[] kits;
        private io.fabric.sdk.android.Logger logger;
        private io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor threadPoolExecutor;

        @java.lang.Deprecated
        public io.fabric.sdk.android.Fabric.Builder executorService(java.util.concurrent.ExecutorService executorService) {
            return this;
        }

        @java.lang.Deprecated
        public io.fabric.sdk.android.Fabric.Builder handler(android.os.Handler handler) {
            return this;
        }

        public Builder(android.content.Context context) {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context must not be null.");
            }
            this.context = context;
        }

        public io.fabric.sdk.android.Fabric.Builder kits(io.fabric.sdk.android.Kit... kitArr) {
            if (this.kits != null) {
                throw new java.lang.IllegalStateException("Kits already set.");
            }
            if (!io.fabric.sdk.android.services.common.DataCollectionArbiter.getInstance(this.context).isDataCollectionEnabled()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = false;
                for (io.fabric.sdk.android.Kit kit : kitArr) {
                    java.lang.String identifier = kit.getIdentifier();
                    identifier.hashCode();
                    if (identifier.equals(io.fabric.sdk.android.Fabric.ANSWERS_KIT_IDENTIFIER) || identifier.equals(io.fabric.sdk.android.Fabric.CRASHLYTICS_KIT_IDENTIFIER)) {
                        arrayList.add(kit);
                    } else if (!z) {
                        io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                        z = true;
                    }
                }
                kitArr = (io.fabric.sdk.android.Kit[]) arrayList.toArray(new io.fabric.sdk.android.Kit[0]);
            }
            this.kits = kitArr;
            return this;
        }

        public io.fabric.sdk.android.Fabric.Builder threadPoolExecutor(io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor priorityThreadPoolExecutor) {
            if (priorityThreadPoolExecutor == null) {
                throw new java.lang.IllegalArgumentException("PriorityThreadPoolExecutor must not be null.");
            }
            if (this.threadPoolExecutor != null) {
                throw new java.lang.IllegalStateException("PriorityThreadPoolExecutor already set.");
            }
            this.threadPoolExecutor = priorityThreadPoolExecutor;
            return this;
        }

        public io.fabric.sdk.android.Fabric.Builder logger(io.fabric.sdk.android.Logger logger) {
            if (logger == null) {
                throw new java.lang.IllegalArgumentException("Logger must not be null.");
            }
            if (this.logger != null) {
                throw new java.lang.IllegalStateException("Logger already set.");
            }
            this.logger = logger;
            return this;
        }

        public io.fabric.sdk.android.Fabric.Builder appIdentifier(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("appIdentifier must not be null.");
            }
            if (this.appIdentifier != null) {
                throw new java.lang.IllegalStateException("appIdentifier already set.");
            }
            this.appIdentifier = str;
            return this;
        }

        public io.fabric.sdk.android.Fabric.Builder appInstallIdentifier(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalArgumentException("appInstallIdentifier must not be null.");
            }
            if (this.appInstallIdentifier != null) {
                throw new java.lang.IllegalStateException("appInstallIdentifier already set.");
            }
            this.appInstallIdentifier = str;
            return this;
        }

        public io.fabric.sdk.android.Fabric.Builder debuggable(boolean z) {
            this.debuggable = z;
            return this;
        }

        public io.fabric.sdk.android.Fabric.Builder initializationCallback(io.fabric.sdk.android.InitializationCallback<io.fabric.sdk.android.Fabric> initializationCallback) {
            if (initializationCallback == null) {
                throw new java.lang.IllegalArgumentException("initializationCallback must not be null.");
            }
            if (this.initializationCallback != null) {
                throw new java.lang.IllegalStateException("initializationCallback already set.");
            }
            this.initializationCallback = initializationCallback;
            return this;
        }

        public io.fabric.sdk.android.Fabric build() {
            java.util.Map kitMap;
            if (this.threadPoolExecutor == null) {
                this.threadPoolExecutor = io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor.create();
            }
            if (this.handler == null) {
                this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            if (this.logger == null) {
                if (this.debuggable) {
                    this.logger = new io.fabric.sdk.android.DefaultLogger(3);
                } else {
                    this.logger = new io.fabric.sdk.android.DefaultLogger();
                }
            }
            if (this.appIdentifier == null) {
                this.appIdentifier = this.context.getPackageName();
            }
            if (this.initializationCallback == null) {
                this.initializationCallback = io.fabric.sdk.android.InitializationCallback.EMPTY;
            }
            io.fabric.sdk.android.Kit[] kitArr = this.kits;
            if (kitArr != null) {
                kitMap = io.fabric.sdk.android.Fabric.getKitMap(java.util.Arrays.asList(kitArr));
            } else {
                kitMap = new java.util.HashMap();
            }
            java.util.Map map = kitMap;
            android.content.Context applicationContext = this.context.getApplicationContext();
            return new io.fabric.sdk.android.Fabric(applicationContext, map, this.threadPoolExecutor, this.handler, this.logger, this.debuggable, this.initializationCallback, new io.fabric.sdk.android.services.common.IdManager(applicationContext, this.appIdentifier, this.appInstallIdentifier, map.values()), io.fabric.sdk.android.Fabric.extractActivity(this.context));
        }
    }

    static io.fabric.sdk.android.Fabric singleton() {
        if (singleton == null) {
            throw new java.lang.IllegalStateException("Must Initialize Fabric before using singleton()");
        }
        return singleton;
    }

    Fabric(android.content.Context context, java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> map, io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor priorityThreadPoolExecutor, android.os.Handler handler, io.fabric.sdk.android.Logger logger, boolean z, io.fabric.sdk.android.InitializationCallback initializationCallback, io.fabric.sdk.android.services.common.IdManager idManager, android.app.Activity activity) {
        this.context = context;
        this.kits = map;
        this.executorService = priorityThreadPoolExecutor;
        this.mainHandler = handler;
        this.logger = logger;
        this.debuggable = z;
        this.initializationCallback = initializationCallback;
        this.kitInitializationCallback = createKitInitializationCallback(map.size());
        this.idManager = idManager;
        setCurrentActivity(activity);
    }

    public static io.fabric.sdk.android.Fabric with(android.content.Context context, io.fabric.sdk.android.Kit... kitArr) {
        if (singleton == null) {
            synchronized (io.fabric.sdk.android.Fabric.class) {
                if (singleton == null) {
                    setFabric(new io.fabric.sdk.android.Fabric.Builder(context).kits(kitArr).build());
                }
            }
        }
        return singleton;
    }

    public static io.fabric.sdk.android.Fabric with(io.fabric.sdk.android.Fabric fabric) {
        if (singleton == null) {
            synchronized (io.fabric.sdk.android.Fabric.class) {
                if (singleton == null) {
                    setFabric(fabric);
                }
            }
        }
        return singleton;
    }

    private static void setFabric(io.fabric.sdk.android.Fabric fabric) {
        singleton = fabric;
        fabric.init();
    }

    public io.fabric.sdk.android.Fabric setCurrentActivity(android.app.Activity activity) {
        this.activity = new java.lang.ref.WeakReference<>(activity);
        return this;
    }

    public android.app.Activity getCurrentActivity() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.activity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void init() {
        io.fabric.sdk.android.ActivityLifecycleManager activityLifecycleManager = new io.fabric.sdk.android.ActivityLifecycleManager(this.context);
        this.activityLifecycleManager = activityLifecycleManager;
        activityLifecycleManager.registerCallbacks(new io.fabric.sdk.android.ActivityLifecycleManager.Callbacks() { // from class: io.fabric.sdk.android.Fabric.1
            @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
            public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                io.fabric.sdk.android.Fabric.this.setCurrentActivity(activity);
            }

            @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
            public void onActivityStarted(android.app.Activity activity) {
                io.fabric.sdk.android.Fabric.this.setCurrentActivity(activity);
            }

            @Override // io.fabric.sdk.android.ActivityLifecycleManager.Callbacks
            public void onActivityResumed(android.app.Activity activity) {
                io.fabric.sdk.android.Fabric.this.setCurrentActivity(activity);
            }
        });
        initializeKits(this.context);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void initializeKits(android.content.Context context) {
        java.lang.StringBuilder sb;
        java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo>> kitsFinderFuture = getKitsFinderFuture(context);
        java.util.Collection<io.fabric.sdk.android.Kit> kits = getKits();
        io.fabric.sdk.android.Onboarding onboarding = new io.fabric.sdk.android.Onboarding(kitsFinderFuture, kits);
        java.util.ArrayList<io.fabric.sdk.android.Kit> arrayList = new java.util.ArrayList(kits);
        java.util.Collections.sort(arrayList);
        onboarding.injectParameters(context, this, io.fabric.sdk.android.InitializationCallback.EMPTY, this.idManager);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((io.fabric.sdk.android.Kit) it.next()).injectParameters(context, this, this.kitInitializationCallback, this.idManager);
        }
        onboarding.initialize();
        if (getLogger().isLoggable(TAG, 3)) {
            sb = new java.lang.StringBuilder("Initializing ");
            sb.append(getIdentifier());
            sb.append(" [Version: ");
            sb.append(getVersion());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (io.fabric.sdk.android.Kit kit : arrayList) {
            kit.initializationTask.addDependency(onboarding.initializationTask);
            addAnnotatedDependencies(this.kits, kit);
            kit.initialize();
            if (sb != null) {
                sb.append(kit.getIdentifier());
                sb.append(" [Version: ");
                sb.append(kit.getVersion());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            getLogger().d(TAG, sb.toString());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void addAnnotatedDependencies(java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> map, io.fabric.sdk.android.Kit kit) {
        io.fabric.sdk.android.services.concurrency.DependsOn dependsOn = kit.dependsOnAnnotation;
        if (dependsOn != null) {
            for (java.lang.Class<?> cls : dependsOn.value()) {
                if (cls.isInterface()) {
                    for (io.fabric.sdk.android.Kit kit2 : map.values()) {
                        if (cls.isAssignableFrom(kit2.getClass())) {
                            kit.initializationTask.addDependency(kit2.initializationTask);
                        }
                    }
                } else {
                    if (map.get(cls) == null) {
                        throw new io.fabric.sdk.android.services.concurrency.UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                    }
                    kit.initializationTask.addDependency(map.get(cls).initializationTask);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.app.Activity extractActivity(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }

    public io.fabric.sdk.android.ActivityLifecycleManager getActivityLifecycleManager() {
        return this.activityLifecycleManager;
    }

    public java.util.concurrent.ExecutorService getExecutorService() {
        return this.executorService;
    }

    public android.os.Handler getMainHandler() {
        return this.mainHandler;
    }

    public java.util.Collection<io.fabric.sdk.android.Kit> getKits() {
        return this.kits.values();
    }

    public static <T extends io.fabric.sdk.android.Kit> T getKit(java.lang.Class<T> cls) {
        return (T) singleton().kits.get(cls);
    }

    public static io.fabric.sdk.android.Logger getLogger() {
        if (singleton == null) {
            return DEFAULT_LOGGER;
        }
        return singleton.logger;
    }

    public static boolean isDebuggable() {
        if (singleton == null) {
            return false;
        }
        return singleton.debuggable;
    }

    public static boolean isInitialized() {
        return singleton != null && singleton.initialized.get();
    }

    public java.lang.String getAppIdentifier() {
        return this.idManager.getAppIdentifier();
    }

    public java.lang.String getAppInstallIdentifier() {
        return this.idManager.getAppInstallIdentifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> getKitMap(java.util.Collection<? extends io.fabric.sdk.android.Kit> collection) {
        java.util.HashMap map = new java.util.HashMap(collection.size());
        addToKitMap(map, collection);
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addToKitMap(java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> map, java.util.Collection<? extends io.fabric.sdk.android.Kit> collection) {
        for (java.lang.Object obj : collection) {
            map.put(obj.getClass(), obj);
            if (obj instanceof io.fabric.sdk.android.KitGroup) {
                addToKitMap(map, ((io.fabric.sdk.android.KitGroup) obj).getKits());
            }
        }
    }

    io.fabric.sdk.android.InitializationCallback<?> createKitInitializationCallback(int i) {
        return new io.fabric.sdk.android.InitializationCallback(i) { // from class: io.fabric.sdk.android.Fabric.2
            final java.util.concurrent.CountDownLatch kitInitializedLatch;
            final /* synthetic */ int val$size;

            {
                this.val$size = i;
                this.kitInitializedLatch = new java.util.concurrent.CountDownLatch(i);
            }

            @Override // io.fabric.sdk.android.InitializationCallback
            public void success(java.lang.Object obj) {
                this.kitInitializedLatch.countDown();
                if (this.kitInitializedLatch.getCount() == 0) {
                    io.fabric.sdk.android.Fabric.this.initialized.set(true);
                    io.fabric.sdk.android.Fabric.this.initializationCallback.success(io.fabric.sdk.android.Fabric.this);
                }
            }

            @Override // io.fabric.sdk.android.InitializationCallback
            public void failure(java.lang.Exception exc) {
                io.fabric.sdk.android.Fabric.this.initializationCallback.failure(exc);
            }
        };
    }

    java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.KitInfo>> getKitsFinderFuture(android.content.Context context) {
        return getExecutorService().submit(new io.fabric.sdk.android.FabricKitsFinder(context.getPackageCodePath()));
    }
}
