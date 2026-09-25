.class Lcom/bugfender/sdk/k1$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/k2;

.field final synthetic b:Lcom/bugfender/sdk/k1;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/k2;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    iput-object p2, p0, Lcom/bugfender/sdk/k1$f;->a:Lcom/bugfender/sdk/k2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->s(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    const-wide/16 v2, 0x3c

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/y;

    invoke-static {v1, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/y;)Lcom/bugfender/sdk/y;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/bugfender/sdk/g; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_0

    :catch_3
    move-exception v0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lcom/bugfender/sdk/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->r(Lcom/bugfender/sdk/k1;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    sget-object v1, Lcom/bugfender/sdk/y;->d:Lcom/bugfender/sdk/y;

    invoke-static {v0, v1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/y;)Lcom/bugfender/sdk/y;

    :goto_1
    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1$f;->a:Lcom/bugfender/sdk/k2;

    invoke-static {v1, v2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/k2;)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_4

    goto :goto_3

    :catch_4
    move-exception v1

    goto :goto_2

    :catch_5
    move-exception v1

    :goto_2
    invoke-static {v1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    :goto_3
    iget-object v2, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v2}, Lcom/bugfender/sdk/k1;->q(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/y;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bugfender/sdk/y;->a()I

    move-result v2

    const v3, 0x1348cba

    const-string v4, "Bugfender-SDK"

    if-ge v3, v2, :cond_1

    const-string v2, "There\'s a new Bugfender SDK version. Please check bugfender.com."

    invoke-static {v4, v2}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz v1, :cond_3

    :try_start_2
    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->b(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->c(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/a2;

    move-result-object v0

    invoke-interface {v0}, Lcom/bugfender/sdk/a2;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->q(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/y;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->d(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_6

    goto :goto_5

    :catch_6
    move-exception v0

    goto :goto_4

    :catch_7
    move-exception v0

    :goto_4
    invoke-static {v0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    :cond_2
    :goto_5
    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->i(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/z2;

    move-result-object v0

    sget-wide v1, Lcom/bugfender/sdk/z2;->b:J

    new-instance v3, Lcom/bugfender/sdk/k1$f$a;

    invoke-direct {v3, p0}, Lcom/bugfender/sdk/k1$f$a;-><init>(Lcom/bugfender/sdk/k1$f;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/bugfender/sdk/z2;->a(JLcom/bugfender/sdk/z2$c;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->l(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, Lcom/bugfender/sdk/k1$f$b;

    invoke-direct {v2, p0}, Lcom/bugfender/sdk/k1$f$b;-><init>(Lcom/bugfender/sdk/k1$f;)V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x5

    const-wide/16 v5, 0xa

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->l(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    new-instance v2, Lcom/bugfender/sdk/k1$f$c;

    invoke-direct {v2, p0}, Lcom/bugfender/sdk/k1$f$c;-><init>(Lcom/bugfender/sdk/k1$f;)V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x5

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    new-instance v0, Lcom/bugfender/sdk/z0;

    iget-object v1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v1}, Lcom/bugfender/sdk/k1;->n(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/x2;

    move-result-object v1

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->n()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$package_id"

    invoke-direct {v0, v2, v1}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/z0;)V

    new-instance v0, Lcom/bugfender/sdk/z0;

    iget-object v1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v1}, Lcom/bugfender/sdk/k1;->n(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/x2;

    move-result-object v1

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->j()Ljava/lang/String;

    move-result-object v1

    const-string v2, "$android_id"

    invoke-direct {v0, v2, v1}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/z0;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Z)Z

    goto :goto_6

    :cond_3
    iget-object v1, p0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v1, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Z)Z

    const-string v0, "Bugfender SDK initialization has failed."

    invoke-static {v4, v0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    return-void
.end method
