.class public Lcom/bugfender/sdk/i2;
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

.field private final c:Lcom/bugfender/sdk/e1;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/i2;->a:Lcom/bugfender/sdk/r1;

    iput-object p2, p0, Lcom/bugfender/sdk/i2;->b:Lcom/bugfender/sdk/o1;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/bugfender/sdk/i2;->c:Lcom/bugfender/sdk/e1;

    return-void
.end method

.method public constructor <init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/bugfender/sdk/i2;->c:Lcom/bugfender/sdk/e1;

    iput-object p1, p0, Lcom/bugfender/sdk/i2;->a:Lcom/bugfender/sdk/r1;

    iput-object p2, p0, Lcom/bugfender/sdk/i2;->b:Lcom/bugfender/sdk/o1;

    return-void
.end method

.method private a(Lcom/bugfender/sdk/t1;)Lcom/bugfender/sdk/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/t1<",
            "Lcom/bugfender/sdk/e1;",
            ">;)",
            "Lcom/bugfender/sdk/e0<",
            "Lcom/bugfender/sdk/e1;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/t1;->b(I)Lcom/bugfender/sdk/e0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/q1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/i2;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v0}, Lcom/bugfender/sdk/r1;->c()Lcom/bugfender/sdk/k2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/k2;->k()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_1

    :try_start_1
    iget-object v1, p0, Lcom/bugfender/sdk/i2;->b:Lcom/bugfender/sdk/o1;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/o1;->a(Lcom/bugfender/sdk/k2;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bugfender/sdk/k2;->a(J)V

    iget-object v3, p0, Lcom/bugfender/sdk/i2;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v3, v1, v2}, Lcom/bugfender/sdk/r1;->d(J)V
    :try_end_1
    .catch Lcom/bugfender/sdk/h; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    instance-of v1, v0, Lcom/bugfender/sdk/k;

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    :cond_0
    new-instance v1, Lcom/bugfender/sdk/q1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/bugfender/sdk/i2;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v1}, Lcom/bugfender/sdk/r1;->d()Lcom/bugfender/sdk/t1;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/bugfender/sdk/i2;->a(Lcom/bugfender/sdk/t1;)Lcom/bugfender/sdk/e0;

    move-result-object v2

    iget-object v3, p0, Lcom/bugfender/sdk/i2;->c:Lcom/bugfender/sdk/e1;

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->a()Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/bugfender/sdk/i2;->c:Lcom/bugfender/sdk/e1;

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_4

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    invoke-virtual {v1, v2}, Lcom/bugfender/sdk/t1;->a(Ljava/io/File;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/bugfender/sdk/q1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v0

    :cond_4
    const/4 v3, 0x1

    :goto_2
    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_6

    :try_start_3
    iget-object v4, p0, Lcom/bugfender/sdk/i2;->b:Lcom/bugfender/sdk/o1;

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5, v0}, Lcom/bugfender/sdk/o1;->a(Ljava/util/List;Lcom/bugfender/sdk/k2;)V

    invoke-virtual {v2}, Lcom/bugfender/sdk/e0;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bugfender/sdk/t1;->a(Ljava/util/List;)Z

    move-result v2

    and-int/2addr v3, v2

    invoke-direct {p0, v1}, Lcom/bugfender/sdk/i2;->a(Lcom/bugfender/sdk/t1;)Lcom/bugfender/sdk/e0;

    move-result-object v2
    :try_end_3
    .catch Lcom/bugfender/sdk/h; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    :try_start_4
    instance-of v1, v0, Lcom/bugfender/sdk/k;

    if-nez v1, :cond_5

    invoke-static {v0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    :cond_5
    new-instance v1, Lcom/bugfender/sdk/q1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_6
    new-instance v0, Lcom/bugfender/sdk/q1;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    instance-of v1, v0, Lcom/bugfender/sdk/k;

    if-eqz v1, :cond_7

    instance-of v1, v0, Lcom/bugfender/sdk/p1;

    if-nez v1, :cond_8

    :cond_7
    invoke-static {v0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    :cond_8
    new-instance v1, Lcom/bugfender/sdk/q1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bugfender/sdk/i2;->a()Lcom/bugfender/sdk/q1;

    move-result-object v0

    return-object v0
.end method
