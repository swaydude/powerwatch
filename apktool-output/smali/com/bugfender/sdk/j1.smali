.class public Lcom/bugfender/sdk/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/i1;


# static fields
.field private static final f:I = 0x0

.field private static final g:Ljava/lang/String; = "logcat"

.field private static final h:Ljava/lang/String; = "Logcat"


# instance fields
.field private final a:Lcom/bugfender/sdk/k1;

.field private final b:Ljava/lang/String;

.field private final c:I

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private e:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bugfender/sdk/k1;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bugfender/sdk/j1;->e:Ljava/util/concurrent/Future;

    iput-object p1, p0, Lcom/bugfender/sdk/j1;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/bugfender/sdk/j1;->a:Lcom/bugfender/sdk/k1;

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    iput p1, p0, Lcom/bugfender/sdk/j1;->c:I

    iput-object p3, p0, Lcom/bugfender/sdk/j1;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/j1;)I
    .locals 0

    iget p0, p0, Lcom/bugfender/sdk/j1;->c:I

    return p0
.end method

.method static synthetic a(Lcom/bugfender/sdk/j1;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/j1;->e:Ljava/util/concurrent/Future;

    return-object p1
.end method

.method private a(Lcom/bugfender/sdk/a3;Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
    .locals 8

    invoke-virtual {p1}, Lcom/bugfender/sdk/a3;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BF/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/bugfender/sdk/logcat/InterceptedLog;

    invoke-virtual {p1}, Lcom/bugfender/sdk/a3;->a()Lcom/bugfender/sdk/b3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bugfender/sdk/b3;->b()Lcom/bugfender/sdk/LogLevel;

    move-result-object v5

    invoke-virtual {p1}, Lcom/bugfender/sdk/a3;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/bugfender/sdk/a3;->b()Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x0

    const-string v3, "logcat"

    const-string v4, "Logcat"

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/bugfender/sdk/logcat/InterceptedLog;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/LogLevel;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/bugfender/sdk/logcat/LogcatInterceptor;->intercept(Lcom/bugfender/sdk/logcat/InterceptedLog;)Lcom/bugfender/sdk/logcat/InterceptedLog;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/j1;->a(Lcom/bugfender/sdk/logcat/InterceptedLog;)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/j1;Lcom/bugfender/sdk/a3;Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/bugfender/sdk/j1;->a(Lcom/bugfender/sdk/a3;Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V

    return-void
.end method

.method private a(Lcom/bugfender/sdk/logcat/InterceptedLog;)V
    .locals 7

    iget-object v0, p0, Lcom/bugfender/sdk/j1;->a:Lcom/bugfender/sdk/k1;

    invoke-virtual {p1}, Lcom/bugfender/sdk/logcat/InterceptedLog;->getLineNumber()I

    move-result v1

    invoke-virtual {p1}, Lcom/bugfender/sdk/logcat/InterceptedLog;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/bugfender/sdk/logcat/InterceptedLog;->getFile()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/bugfender/sdk/logcat/InterceptedLog;->getLevel()Lcom/bugfender/sdk/LogLevel;

    move-result-object v4

    invoke-static {v4}, Lcom/bugfender/sdk/e1$c;->a(Lcom/bugfender/sdk/LogLevel;)Lcom/bugfender/sdk/e1$c;

    move-result-object v4

    invoke-virtual {p1}, Lcom/bugfender/sdk/logcat/InterceptedLog;->getTag()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/bugfender/sdk/logcat/InterceptedLog;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Lcom/bugfender/sdk/k1;->a(ILjava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/bugfender/sdk/j1;)Ljava/util/concurrent/Future;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/j1;->e:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method static synthetic c(Lcom/bugfender/sdk/j1;)Lcom/bugfender/sdk/k1;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/j1;->a:Lcom/bugfender/sdk/k1;

    return-object p0
.end method

.method static synthetic d(Lcom/bugfender/sdk/j1;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/j1;->d:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
    .locals 8

    new-instance v0, Lcom/bugfender/sdk/j1$a;

    invoke-direct {v0, p0, p1}, Lcom/bugfender/sdk/j1$a;-><init>(Lcom/bugfender/sdk/j1;Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V

    new-instance p1, Lcom/bugfender/sdk/h1;

    iget-object v1, p0, Lcom/bugfender/sdk/j1;->b:Ljava/lang/String;

    invoke-direct {p1, v1}, Lcom/bugfender/sdk/h1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/h1;->a(Lcom/bugfender/sdk/h1$a;)V

    iget-object v0, p0, Lcom/bugfender/sdk/j1;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/j1;->e:Ljava/util/concurrent/Future;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, Lcom/bugfender/sdk/j1$b;

    invoke-direct {v2, p0, p1}, Lcom/bugfender/sdk/j1$b;-><init>(Lcom/bugfender/sdk/j1;Lcom/bugfender/sdk/h1;)V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    const-wide/16 v5, 0x5

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
