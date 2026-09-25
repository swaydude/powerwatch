.class public Lcom/bugfender/sdk/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bugfender/sdk/r1;

.field private final b:Lcom/bugfender/sdk/k0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/k0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/bugfender/sdk/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/p0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/bugfender/sdk/o1;

.field private final e:Ljava/util/concurrent/atomic/AtomicLong;

.field private final f:Lcom/bugfender/sdk/y;

.field private final g:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/p0;Ljava/lang/Object;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/k0;Ljava/util/concurrent/atomic/AtomicLong;Lcom/bugfender/sdk/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/r1;",
            "Lcom/bugfender/sdk/p0<",
            "TT;>;TT;",
            "Lcom/bugfender/sdk/o1;",
            "Lcom/bugfender/sdk/k0<",
            "TT;>;",
            "Ljava/util/concurrent/atomic/AtomicLong;",
            "Lcom/bugfender/sdk/y;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/d;->a:Lcom/bugfender/sdk/r1;

    iput-object p2, p0, Lcom/bugfender/sdk/d;->c:Lcom/bugfender/sdk/p0;

    iput-object p3, p0, Lcom/bugfender/sdk/d;->g:Ljava/lang/Object;

    iput-object p4, p0, Lcom/bugfender/sdk/d;->d:Lcom/bugfender/sdk/o1;

    iput-object p5, p0, Lcom/bugfender/sdk/d;->b:Lcom/bugfender/sdk/k0;

    iput-object p6, p0, Lcom/bugfender/sdk/d;->e:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p7, p0, Lcom/bugfender/sdk/d;->f:Lcom/bugfender/sdk/y;

    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/bugfender/sdk/e1;
    .locals 4

    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    new-instance v1, Lcom/bugfender/sdk/e1$b;

    invoke-direct {v1}, Lcom/bugfender/sdk/e1$b;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/bugfender/sdk/e1$b;->b(I)Lcom/bugfender/sdk/e1$b;

    move-result-object v1

    sget-object v2, Lcom/bugfender/sdk/e1$c;->d:Lcom/bugfender/sdk/e1$c;

    invoke-virtual {v2}, Lcom/bugfender/sdk/e1$c;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/bugfender/sdk/e1$b;->a(I)Lcom/bugfender/sdk/e1$b;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/d;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/bugfender/sdk/e1$b;->a(J)Lcom/bugfender/sdk/e1$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/e1$b;->a(Ljava/util/Date;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    const-string v1, "bf_disk_error"

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/e1$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/bugfender/sdk/e1$b;->f(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/bugfender/sdk/e1$b;->e(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1$b;->a()Lcom/bugfender/sdk/e1;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/d;->b:Lcom/bugfender/sdk/k0;

    iget-object v1, p0, Lcom/bugfender/sdk/d;->g:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/bugfender/sdk/k0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/d;->c:Lcom/bugfender/sdk/p0;

    invoke-interface {v1}, Lcom/bugfender/sdk/p0;->a()Lcom/bugfender/sdk/t1;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/t1;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v1, "Bugfender couldn\'t store the log on disk due to an error."

    const-string v2, "Bugfender-SDK"

    invoke-static {v2, v1}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/bugfender/sdk/d;->f:Lcom/bugfender/sdk/y;

    invoke-virtual {v2}, Lcom/bugfender/sdk/y;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Lcom/bugfender/sdk/d;->a(Ljava/lang/String;)Lcom/bugfender/sdk/e1;

    move-result-object v1

    new-instance v2, Lcom/bugfender/sdk/i2;

    iget-object v3, p0, Lcom/bugfender/sdk/d;->a:Lcom/bugfender/sdk/r1;

    iget-object v4, p0, Lcom/bugfender/sdk/d;->d:Lcom/bugfender/sdk/o1;

    invoke-direct {v2, v3, v4, v1}, Lcom/bugfender/sdk/i2;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/e1;)V

    invoke-virtual {v2}, Lcom/bugfender/sdk/i2;->a()Lcom/bugfender/sdk/q1;

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bugfender/sdk/d;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
