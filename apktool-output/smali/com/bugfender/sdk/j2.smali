.class public Lcom/bugfender/sdk/j2;
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
.field private final a:Lcom/bugfender/sdk/o1;

.field private final b:Lcom/bugfender/sdk/r1;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/bugfender/sdk/g2;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/k2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/r1;Ljava/lang/String;Lcom/bugfender/sdk/g2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/j2;->a:Lcom/bugfender/sdk/o1;

    iput-object p2, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    iput-object p3, p0, Lcom/bugfender/sdk/j2;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/bugfender/sdk/j2;->d:Lcom/bugfender/sdk/g2;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/bugfender/sdk/j2;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/r1;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/o1;",
            "Lcom/bugfender/sdk/r1;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/k2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/j2;->a:Lcom/bugfender/sdk/o1;

    iput-object p2, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    iput-object p3, p0, Lcom/bugfender/sdk/j2;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/bugfender/sdk/j2;->d:Lcom/bugfender/sdk/g2;

    iput-object p4, p0, Lcom/bugfender/sdk/j2;->e:Ljava/util/List;

    return-void
.end method

.method private a(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/e0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/k2;",
            ")",
            "Lcom/bugfender/sdk/e0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    invoke-interface {v0, p1}, Lcom/bugfender/sdk/r1;->c(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/t1;->b()Lcom/bugfender/sdk/e0;

    move-result-object p1
    :try_end_0
    .catch Lcom/bugfender/sdk/u1; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Lcom/bugfender/sdk/e0;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/bugfender/sdk/e0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private static a(Lcom/bugfender/sdk/k2;I)Z
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0}, Lcom/bugfender/sdk/k2;->m()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sub-long/2addr v2, p0

    cmp-long p0, v2, v0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private b(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/e0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/k2;",
            ")",
            "Lcom/bugfender/sdk/e0<",
            "Lcom/bugfender/sdk/u0;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    invoke-interface {v0, p1}, Lcom/bugfender/sdk/r1;->a(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/t1;->b()Lcom/bugfender/sdk/e0;

    move-result-object p1
    :try_end_0
    .catch Lcom/bugfender/sdk/u1; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Lcom/bugfender/sdk/e0;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/bugfender/sdk/e0;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method private b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/k2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/j2;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/j2;->e:Ljava/util/List;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    invoke-interface {v0}, Lcom/bugfender/sdk/r1;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/q1;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0}, Lcom/bugfender/sdk/j2;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/bugfender/sdk/k2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v6, 0x1e

    :try_start_1
    invoke-static {v4, v6}, Lcom/bugfender/sdk/j2;->a(Lcom/bugfender/sdk/k2;I)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v5, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    :goto_1
    invoke-virtual {v4}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v6

    goto :goto_2

    :cond_1
    iget-object v6, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    invoke-interface {v6, v4}, Lcom/bugfender/sdk/r1;->b(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/t1;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/bugfender/sdk/t1;->a(I)Lcom/bugfender/sdk/e0;

    move-result-object v7

    invoke-direct {p0, v4}, Lcom/bugfender/sdk/j2;->b(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/e0;

    move-result-object v8

    invoke-direct {p0, v4}, Lcom/bugfender/sdk/j2;->a(Lcom/bugfender/sdk/k2;)Lcom/bugfender/sdk/e0;

    move-result-object v9

    invoke-virtual {v7}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v8}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v9}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v10

    if-nez v10, :cond_2

    iget-object v5, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    goto :goto_1

    :goto_2
    invoke-interface {v5, v6, v7}, Lcom/bugfender/sdk/r1;->a(J)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Lcom/bugfender/sdk/k2;->k()J

    move-result-wide v10

    const-wide/16 v12, 0x0

    cmp-long v14, v10, v12

    if-gtz v14, :cond_3

    iget-object v10, p0, Lcom/bugfender/sdk/j2;->a:Lcom/bugfender/sdk/o1;

    invoke-virtual {v10, v4}, Lcom/bugfender/sdk/o1;->a(Lcom/bugfender/sdk/k2;)J

    move-result-wide v10

    invoke-virtual {v4, v10, v11}, Lcom/bugfender/sdk/k2;->a(J)V

    iget-object v12, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    invoke-virtual {v4}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v13

    invoke-interface {v12, v13, v14, v10, v11}, Lcom/bugfender/sdk/r1;->a(JJ)V

    :cond_3
    invoke-virtual {v8}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v8}, Lcom/bugfender/sdk/e0;->a()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/bugfender/sdk/u0;

    invoke-virtual {v4}, Lcom/bugfender/sdk/k2;->k()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Lcom/bugfender/sdk/u0;->a(J)V

    new-instance v11, Lcom/bugfender/sdk/e;

    iget-object v12, p0, Lcom/bugfender/sdk/j2;->c:Ljava/lang/String;

    invoke-direct {v11, v12}, Lcom/bugfender/sdk/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v11}, Lcom/bugfender/sdk/u0;->a(Lcom/bugfender/sdk/e;)V

    iget-object v11, p0, Lcom/bugfender/sdk/j2;->a:Lcom/bugfender/sdk/o1;

    invoke-virtual {v11, v10, v4}, Lcom/bugfender/sdk/o1;->a(Lcom/bugfender/sdk/u0;Lcom/bugfender/sdk/k2;)V

    goto :goto_3

    :cond_4
    :goto_4
    invoke-virtual {v7}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, p0, Lcom/bugfender/sdk/j2;->a:Lcom/bugfender/sdk/o1;

    invoke-virtual {v7}, Lcom/bugfender/sdk/e0;->a()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v8, v10, v4}, Lcom/bugfender/sdk/o1;->a(Ljava/util/List;Lcom/bugfender/sdk/k2;)V

    invoke-virtual {v7}, Lcom/bugfender/sdk/e0;->b()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/bugfender/sdk/t1;->a(Ljava/util/List;)Z

    invoke-virtual {v6, v5}, Lcom/bugfender/sdk/t1;->a(I)Lcom/bugfender/sdk/e0;

    move-result-object v7

    goto :goto_4

    :cond_5
    invoke-virtual {v9}, Lcom/bugfender/sdk/e0;->c()Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, p0, Lcom/bugfender/sdk/j2;->d:Lcom/bugfender/sdk/g2;

    if-eqz v5, :cond_6

    invoke-virtual {v9}, Lcom/bugfender/sdk/e0;->a()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Lcom/bugfender/sdk/g2;->a(Lcom/bugfender/sdk/k2;Ljava/util/List;)Lcom/bugfender/sdk/q1;

    :cond_6
    iget-object v5, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    invoke-virtual {v4}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v6

    invoke-interface {v5, v6, v7}, Lcom/bugfender/sdk/r1;->a(J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :catch_0
    move-exception v5

    :try_start_2
    const-string v6, "Bugfender-SDK"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "There was a problem sending the old session "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v6, v5, Lcom/bugfender/sdk/k;

    if-nez v6, :cond_0

    instance-of v5, v5, Lcom/bugfender/sdk/p1;

    if-nez v5, :cond_0

    iget-object v5, p0, Lcom/bugfender/sdk/j2;->b:Lcom/bugfender/sdk/r1;

    invoke-virtual {v4}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v6

    invoke-interface {v5, v6, v7}, Lcom/bugfender/sdk/r1;->a(J)Z

    goto/16 :goto_0

    :cond_7
    new-instance v1, Lcom/bugfender/sdk/q1;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_8

    if-lez v3, :cond_9

    :cond_8
    const/4 v2, 0x1

    :cond_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v1

    :catch_1
    move-exception v0

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

    invoke-virtual {p0}, Lcom/bugfender/sdk/j2;->a()Lcom/bugfender/sdk/q1;

    move-result-object v0

    return-object v0
.end method
