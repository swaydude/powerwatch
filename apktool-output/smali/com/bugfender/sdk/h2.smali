.class public Lcom/bugfender/sdk/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/bugfender/sdk/q1<",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bugfender/sdk/r1;

.field private final b:Lcom/bugfender/sdk/o1;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/h2;->a:Lcom/bugfender/sdk/r1;

    iput-object p2, p0, Lcom/bugfender/sdk/h2;->b:Lcom/bugfender/sdk/o1;

    iput-object p3, p0, Lcom/bugfender/sdk/h2;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/q1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/h2;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v0}, Lcom/bugfender/sdk/r1;->c()Lcom/bugfender/sdk/k2;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/h2;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v1}, Lcom/bugfender/sdk/r1;->e()Lcom/bugfender/sdk/t1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bugfender/sdk/t1;->c()Lcom/bugfender/sdk/e0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lcom/bugfender/sdk/k2;->k()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-gtz v7, :cond_0

    :try_start_0
    iget-object v3, p0, Lcom/bugfender/sdk/h2;->b:Lcom/bugfender/sdk/o1;

    invoke-virtual {v3, v0}, Lcom/bugfender/sdk/o1;->a(Lcom/bugfender/sdk/k2;)J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/bugfender/sdk/k2;->a(J)V

    iget-object v5, p0, Lcom/bugfender/sdk/h2;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v5, v3, v4}, Lcom/bugfender/sdk/r1;->d(J)V
    :try_end_0
    .catch Lcom/bugfender/sdk/h; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/bugfender/sdk/q1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_0
    :goto_0
    const/4 v3, 0x0

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bugfender/sdk/u0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/k2;->k()J

    move-result-wide v5

    long-to-int v6, v5

    int-to-long v5, v6

    invoke-virtual {v3, v5, v6}, Lcom/bugfender/sdk/u0;->a(J)V

    new-instance v5, Lcom/bugfender/sdk/e;

    iget-object v6, p0, Lcom/bugfender/sdk/h2;->c:Ljava/lang/String;

    invoke-direct {v5, v6}, Lcom/bugfender/sdk/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lcom/bugfender/sdk/u0;->a(Lcom/bugfender/sdk/e;)V

    :try_start_1
    iget-object v5, p0, Lcom/bugfender/sdk/h2;->b:Lcom/bugfender/sdk/o1;

    invoke-virtual {v5, v3, v0}, Lcom/bugfender/sdk/o1;->a(Lcom/bugfender/sdk/u0;Lcom/bugfender/sdk/k2;)V
    :try_end_1
    .catch Lcom/bugfender/sdk/h; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v3, 0x1

    goto :goto_1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/bugfender/sdk/q1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/t1;->a(Ljava/util/List;)Z

    :cond_2
    new-instance v0, Lcom/bugfender/sdk/q1;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v1, v2}, Lcom/bugfender/sdk/t1;->a(Ljava/io/File;)Z

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/bugfender/sdk/q1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bugfender/sdk/h2;->a()Lcom/bugfender/sdk/q1;

    move-result-object v0

    return-object v0
.end method
