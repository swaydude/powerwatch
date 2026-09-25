.class Lcom/bugfender/sdk/j1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/j1;->a(Lcom/bugfender/sdk/logcat/LogcatInterceptor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/h1;

.field final synthetic b:Lcom/bugfender/sdk/j1;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/j1;Lcom/bugfender/sdk/h1;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/j1$b;->b:Lcom/bugfender/sdk/j1;

    iput-object p2, p0, Lcom/bugfender/sdk/j1$b;->a:Lcom/bugfender/sdk/h1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/bugfender/sdk/j1$b;->b:Lcom/bugfender/sdk/j1;

    invoke-static {v0}, Lcom/bugfender/sdk/j1;->b(Lcom/bugfender/sdk/j1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/j1$b;->b:Lcom/bugfender/sdk/j1;

    invoke-static {v0}, Lcom/bugfender/sdk/j1;->b(Lcom/bugfender/sdk/j1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/j1$b;->b:Lcom/bugfender/sdk/j1;

    invoke-static {v0}, Lcom/bugfender/sdk/j1;->c(Lcom/bugfender/sdk/j1;)Lcom/bugfender/sdk/k1;

    move-result-object v1

    sget-object v5, Lcom/bugfender/sdk/e1$c;->c:Lcom/bugfender/sdk/e1$c;

    const/4 v2, 0x0

    const-string v3, "logcat"

    const-string v4, "Logcat"

    const-string v6, "Bugfender-SDK"

    const-string v7, "Logcat process has exited prematurely, restarting it in 5 minutes to continue delivering the logs. During this time logs will not be collected."

    invoke-virtual/range {v1 .. v7}, Lcom/bugfender/sdk/k1;->a(ILjava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bugfender/sdk/j1$b;->b:Lcom/bugfender/sdk/j1;

    invoke-static {v0}, Lcom/bugfender/sdk/j1;->d(Lcom/bugfender/sdk/j1;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/j1$b;->a:Lcom/bugfender/sdk/h1;

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/bugfender/sdk/j1;->a(Lcom/bugfender/sdk/j1;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;

    :cond_1
    return-void
.end method
