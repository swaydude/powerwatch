.class public Lcom/bugfender/sdk/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/b1$b;,
        Lcom/bugfender/sdk/b1$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ThreadPoolExecutor;

.field private final b:I

.field private final c:I

.field private d:Z

.field private e:I

.field private final f:Lcom/bugfender/sdk/b1$c;

.field private final g:Lcom/bugfender/sdk/b1$b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ThreadPoolExecutor;IILcom/bugfender/sdk/b1$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bugfender/sdk/b1;->d:Z

    iput-object p1, p0, Lcom/bugfender/sdk/b1;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    iput p2, p0, Lcom/bugfender/sdk/b1;->b:I

    iput p3, p0, Lcom/bugfender/sdk/b1;->c:I

    iput-object p4, p0, Lcom/bugfender/sdk/b1;->f:Lcom/bugfender/sdk/b1$c;

    new-instance p1, Lcom/bugfender/sdk/b1$b;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/bugfender/sdk/b1$b;-><init>(Lcom/bugfender/sdk/b1$a;)V

    iput-object p1, p0, Lcom/bugfender/sdk/b1;->g:Lcom/bugfender/sdk/b1$b;

    return-void
.end method

.method private a()F
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->g:Lcom/bugfender/sdk/b1$b;

    invoke-virtual {v0}, Lcom/bugfender/sdk/b1$b;->b()V

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->g:Lcom/bugfender/sdk/b1$b;

    invoke-virtual {v0}, Lcom/bugfender/sdk/b1$b;->a()F

    move-result v0

    return v0
.end method

.method private c()V
    .locals 4

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget-boolean v1, p0, Lcom/bugfender/sdk/b1;->d:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/bugfender/sdk/b1;->b:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/bugfender/sdk/b1;->a()F

    move-result v1

    iget v3, p0, Lcom/bugfender/sdk/b1;->c:I

    int-to-float v3, v3

    cmpg-float v1, v1, v3

    if-gez v1, :cond_0

    iput v0, p0, Lcom/bugfender/sdk/b1;->e:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bugfender/sdk/b1;->d:Z

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->f:Lcom/bugfender/sdk/b1$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/bugfender/sdk/b1;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/bugfender/sdk/b1;->d:Z

    if-nez v1, :cond_1

    iget v1, p0, Lcom/bugfender/sdk/b1;->e:I

    div-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_1

    iput-boolean v2, p0, Lcom/bugfender/sdk/b1;->d:Z

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->g:Lcom/bugfender/sdk/b1$b;

    invoke-virtual {v0}, Lcom/bugfender/sdk/b1$b;->c()V

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->f:Lcom/bugfender/sdk/b1$c;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/bugfender/sdk/b1;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    iget-boolean v3, p0, Lcom/bugfender/sdk/b1;->d:Z

    xor-int/2addr v2, v3

    :goto_0
    invoke-interface {v0, v1, v2}, Lcom/bugfender/sdk/b1$c;->a(Ljava/util/concurrent/ThreadPoolExecutor;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/bugfender/sdk/b1;->c()V

    iget-boolean v0, p0, Lcom/bugfender/sdk/b1;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/b1;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :cond_0
    return-void
.end method
