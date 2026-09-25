.class public Lcom/bugfender/sdk/Bugfender;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Bugfender"

.field private static apiUrl:Ljava/lang/String; = null

.field private static baseUrl:Ljava/lang/String; = null

.field private static debug:Z = false

.field private static deviceName:Ljava/lang/String; = null

.field private static isCheckBugfenderInitializerLogPrinted:Z = false

.field private static isUIEventLoggingEnabled:Z = false

.field private static logcatManager:Lcom/bugfender/sdk/i1;

.field private static loggerManager:Lcom/bugfender/sdk/k1;

.field private static mainThread:Lcom/bugfender/sdk/m1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static disableReflection(Z)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0}, Lcom/bugfender/sdk/k1;->a(Z)V

    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static enableCrashReporting()V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0}, Lcom/bugfender/sdk/k1;->b()V

    :cond_0
    return-void
.end method

.method public static enableLogcatLogging()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/bugfender/sdk/Bugfender;->enableLogcatLogging(Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V

    return-void
.end method

.method public static enableLogcatLogging(Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p0, :cond_0

    new-instance p0, Lcom/bugfender/sdk/logcat/DefaultLogcatInterceptor;

    invoke-direct {p0}, Lcom/bugfender/sdk/logcat/DefaultLogcatInterceptor;-><init>()V

    :cond_0
    sget-object v0, Lcom/bugfender/sdk/Bugfender;->logcatManager:Lcom/bugfender/sdk/i1;

    invoke-interface {v0, p0}, Lcom/bugfender/sdk/i1;->a(Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V

    :cond_1
    return-void
.end method

.method public static enableUIEventLogging(Landroid/app/Application;)V
    .locals 5

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/bugfender/sdk/Bugfender;->isUIEventLoggingEnabled:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/bugfender/sdk/Bugfender;->isUIEventLoggingEnabled:Z

    new-instance v0, Lcom/bugfender/sdk/b;

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    sget-object v2, Lcom/bugfender/sdk/Bugfender;->mainThread:Lcom/bugfender/sdk/m1;

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v3

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/bugfender/sdk/b;-><init>(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/m1;ZZ)V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static forceSendOnce()V
    .locals 2

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0}, Lcom/bugfender/sdk/k1;->p()V

    sget-boolean v0, Lcom/bugfender/sdk/Bugfender;->debug:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v1, "Synchronizing all the logs and issues"

    invoke-static {v0, v1}, Lcom/bugfender/sdk/d1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static getDeviceUrl()Ljava/net/URL;
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0}, Lcom/bugfender/sdk/k1;->s()Ljava/net/URL;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static getProcessName(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    const-string v1, "activity"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    invoke-virtual {p0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v2, v0, :cond_0

    iget-object p0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getSessionUrl()Ljava/net/URL;
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0}, Lcom/bugfender/sdk/k1;->w()Ljava/net/URL;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getUserFeedbackActivityIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v6}, Lcom/bugfender/sdk/Bugfender;->getUserFeedbackActivityIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/ui/FeedbackStyle;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getUserFeedbackActivityIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/ui/FeedbackStyle;)Landroid/content/Intent;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/bugfender/sdk/ui/FeedbackActivity;->getIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/ui/FeedbackStyle;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static declared-synchronized init(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    const-class v11, Lcom/bugfender/sdk/Bugfender;

    monitor-enter v11

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lcom/bugfender/sdk/Bugfender;->logcatManager:Lcom/bugfender/sdk/i1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    :try_start_1
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v12, 0x0

    invoke-virtual {v0, v12, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-static/range {p0 .. p0}, Lcom/bugfender/sdk/Bugfender;->isMainProcess(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    sput-boolean p2, Lcom/bugfender/sdk/Bugfender;->debug:Z

    new-instance v13, Lcom/bugfender/sdk/j0;

    invoke-direct {v13}, Lcom/bugfender/sdk/j0;-><init>()V

    new-instance v14, Lcom/bugfender/sdk/i0;

    invoke-direct {v14}, Lcom/bugfender/sdk/i0;-><init>()V

    invoke-virtual {v13}, Lcom/bugfender/sdk/j0;->b()Lcom/bugfender/sdk/g1;

    move-result-object v3

    invoke-virtual {v13, v3}, Lcom/bugfender/sdk/j0;->a(Lcom/bugfender/sdk/g1;)Lcom/bugfender/sdk/f1;

    move-result-object v4

    invoke-virtual {v13}, Lcom/bugfender/sdk/j0;->e()Lcom/bugfender/sdk/n2;

    move-result-object v5

    invoke-virtual {v13, v5}, Lcom/bugfender/sdk/j0;->a(Lcom/bugfender/sdk/n2;)Lcom/bugfender/sdk/l2;

    move-result-object v6

    invoke-virtual {v13}, Lcom/bugfender/sdk/j0;->a()Lcom/bugfender/sdk/x0;

    move-result-object v7

    invoke-virtual {v13, v7}, Lcom/bugfender/sdk/j0;->a(Lcom/bugfender/sdk/x0;)Lcom/bugfender/sdk/v0;

    move-result-object v8

    invoke-virtual {v13}, Lcom/bugfender/sdk/j0;->d()Lcom/bugfender/sdk/c0;

    move-result-object v15

    move-object v1, v13

    move-object/from16 v2, p0

    move-object v9, v15

    invoke-virtual/range {v1 .. v9}, Lcom/bugfender/sdk/j0;->a(Landroid/content/Context;Lcom/bugfender/sdk/g1;Lcom/bugfender/sdk/f1;Lcom/bugfender/sdk/n2;Lcom/bugfender/sdk/l2;Lcom/bugfender/sdk/x0;Lcom/bugfender/sdk/v0;Lcom/bugfender/sdk/c0;)Lcom/bugfender/sdk/r1;

    move-result-object v3

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->apiUrl:Ljava/lang/String;

    const v2, 0x1348cba

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v1, v2, v10}, Lcom/bugfender/sdk/i0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/q2;

    move-result-object v1

    sput-object v12, Lcom/bugfender/sdk/Bugfender;->apiUrl:Ljava/lang/String;

    new-instance v5, Lcom/bugfender/sdk/o1;

    invoke-direct {v5, v1}, Lcom/bugfender/sdk/o1;-><init>(Lcom/bugfender/sdk/q2;)V

    invoke-virtual {v13, v0}, Lcom/bugfender/sdk/j0;->c(Landroid/content/Context;)Lcom/bugfender/sdk/a2;

    move-result-object v7

    invoke-virtual {v13, v0}, Lcom/bugfender/sdk/j0;->b(Landroid/content/Context;)Lcom/bugfender/sdk/z1;

    move-result-object v1

    invoke-virtual {v13, v0}, Lcom/bugfender/sdk/j0;->d(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-virtual {v13, v0, v1, v2}, Lcom/bugfender/sdk/j0;->a(Landroid/content/Context;Lcom/bugfender/sdk/z1;Landroid/content/SharedPreferences;)Lcom/bugfender/sdk/x2;

    move-result-object v8

    invoke-virtual {v13, v0}, Lcom/bugfender/sdk/j0;->a(Landroid/content/Context;)Lcom/bugfender/sdk/x;

    move-result-object v6

    new-instance v14, Lcom/bugfender/sdk/k1;

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->baseUrl:Ljava/lang/String;

    invoke-virtual {v13, v10, v1}, Lcom/bugfender/sdk/j0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/e3;

    move-result-object v9

    sget-object v16, Lcom/bugfender/sdk/Bugfender;->deviceName:Ljava/lang/String;

    move-object v1, v14

    move-object/from16 v2, p1

    move-object v4, v15

    move-object/from16 v10, v16

    invoke-direct/range {v1 .. v10}, Lcom/bugfender/sdk/k1;-><init>(Ljava/lang/String;Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/c0;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/a2;Lcom/bugfender/sdk/x2;Lcom/bugfender/sdk/e3;Ljava/lang/String;)V

    sput-object v14, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    sput-object v12, Lcom/bugfender/sdk/Bugfender;->baseUrl:Ljava/lang/String;

    const-wide/32 v1, 0x500000

    invoke-virtual {v14, v1, v2}, Lcom/bugfender/sdk/k1;->a(J)V

    new-instance v1, Lcom/bugfender/sdk/j1;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/bugfender/sdk/j1;-><init>(Ljava/lang/String;Lcom/bugfender/sdk/k1;Ljava/util/concurrent/ExecutorService;)V

    sput-object v1, Lcom/bugfender/sdk/Bugfender;->logcatManager:Lcom/bugfender/sdk/i1;

    invoke-virtual {v13}, Lcom/bugfender/sdk/j0;->c()Lcom/bugfender/sdk/m1;

    move-result-object v0

    sput-object v0, Lcom/bugfender/sdk/Bugfender;->mainThread:Lcom/bugfender/sdk/m1;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_1
    monitor-exit v11

    return-void

    :cond_2
    :goto_0
    :try_start_2
    sget-object v0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v1, "WARNING: The Bugfender sdk is not initialized. The context or application token provided is null."

    invoke-static {v0, v1}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v11

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v11

    throw v0
.end method

.method private static isBugfenderInitialized()Z
    .locals 2

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/bugfender/sdk/Bugfender;->isCheckBugfenderInitializerLogPrinted:Z

    if-nez v0, :cond_0

    sput-boolean v1, Lcom/bugfender/sdk/Bugfender;->isCheckBugfenderInitializerLogPrinted:Z

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v1, "WARNING: Bugfender SDK is not initialized. You should call first to the method Bugfender.init()"

    invoke-static {v0, v1}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v1
.end method

.method private static isMainProcess(Landroid/content/Context;)Z
    .locals 3

    invoke-static {p0}, Lcom/bugfender/sdk/Bugfender;->getProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v2, "WARNING: Bugfender SDK couldn\'t be initialized."

    invoke-static {v1, v2}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static isRelease()Z
    .locals 1

    sget-boolean v0, Lcom/bugfender/sdk/Bugfender;->debug:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static isValidUrl(Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method

.method public static log(ILjava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/LogLevel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender$1;->$SwitchMap$com$bugfender$sdk$LogLevel:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {p4, p5}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p4, p5}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    invoke-static {p4, p5}, Lcom/bugfender/sdk/d1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    invoke-static {p4, p5}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-static {p3}, Lcom/bugfender/sdk/e1$c;->a(Lcom/bugfender/sdk/LogLevel;)Lcom/bugfender/sdk/e1$c;

    move-result-object v5

    move v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/bugfender/sdk/k1;->a(ILjava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static overrideDeviceName(Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v0, "WARNING: deviceName can not be empty or null. Bugfender.overrideDeviceName() is ignored"

    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sput-object p0, Lcom/bugfender/sdk/Bugfender;->deviceName:Ljava/lang/String;

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v0, "WARNING: Bugfender.overrideDeviceName() must be called before the method Bugfender.init(), ignoring this call"

    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static removeDeviceKey(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0}, Lcom/bugfender/sdk/k1;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static sendCrash(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v1}, Lcom/bugfender/sdk/k1;->p()V

    sget-boolean v1, Lcom/bugfender/sdk/Bugfender;->debug:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reported crash with Title: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and Message: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static sendIssue(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v1}, Lcom/bugfender/sdk/k1;->p()V

    sget-boolean v1, Lcom/bugfender/sdk/Bugfender;->debug:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reported issue with Title: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and Message: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static sendUserFeedback(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 4

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v1}, Lcom/bugfender/sdk/k1;->p()V

    sget-boolean v1, Lcom/bugfender/sdk/Bugfender;->debug:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reported feedback with Title: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " and Message: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static setApiUrl(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v0, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()"

    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/bugfender/sdk/Bugfender;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sput-object p0, Lcom/bugfender/sdk/Bugfender;->apiUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v0, "The custom URL you have passed is malformed. Using default one."

    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static setBaseUrl(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v0, "WARNING: Bugfender SDK is already initialized. You should call this method before Bugfender.init()"

    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/bugfender/sdk/Bugfender;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sput-object p0, Lcom/bugfender/sdk/Bugfender;->baseUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    const-string v0, "The custom URL you have passed is malformed. Using default one."

    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static setDeviceBoolean(Ljava/lang/String;Z)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/bugfender/sdk/z0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {p0, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/z0;)V

    :cond_0
    return-void
.end method

.method public static setDeviceFloat(Ljava/lang/String;Ljava/lang/Float;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/bugfender/sdk/z0;

    invoke-direct {v0, p0, p1}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {p0, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/z0;)V

    :cond_0
    return-void
.end method

.method public static setDeviceInteger(Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/bugfender/sdk/z0;

    invoke-direct {v0, p0, p1}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {p0, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/z0;)V

    :cond_0
    return-void
.end method

.method public static setDeviceString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/bugfender/sdk/z0;

    invoke-direct {v0, p0, p1}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {p0, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/z0;)V

    :cond_0
    return-void
.end method

.method public static setForceEnabled(Z)V
    .locals 3

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0}, Lcom/bugfender/sdk/k1;->b(Z)V

    sget-boolean v0, Lcom/bugfender/sdk/Bugfender;->debug:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Force enable: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lcom/bugfender/sdk/d1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static setMaximumLocalStorageSize(J)V
    .locals 3

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->a(J)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The maximum size should be a positive number"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method private static shouldPrintLogcatLog()Z
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isRelease()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static shouldSendBugfenderLog()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static t(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->isBugfenderInitialized()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldPrintLogcatLog()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {p0, v0}, Lcom/bugfender/sdk/d1;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/bugfender/sdk/Bugfender;->shouldSendBugfenderLog()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/bugfender/sdk/Bugfender;->loggerManager:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, p0, p1}, Lcom/bugfender/sdk/k1;->k(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
