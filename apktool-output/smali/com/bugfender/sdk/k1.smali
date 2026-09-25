.class public Lcom/bugfender/sdk/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:J = 0x500000L

.field private static final B:I = 0x0

.field private static final C:I = 0x1

.field private static final D:I = 0x2

.field public static final E:Ljava/lang/String; = "$package_id"

.field public static final F:Ljava/lang/String; = "$android_id"

.field public static final G:Ljava/lang/String; = "Bugfender-SDK"

.field private static final H:Ljava/lang/Runnable;

.field private static final y:J = 0x100000L

.field private static final z:J = 0x3200000L


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Lcom/bugfender/sdk/b1;

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private final e:Ljava/util/concurrent/ExecutorService;

.field private final f:Lcom/bugfender/sdk/z2;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Lcom/bugfender/sdk/r1;

.field private final j:Lcom/bugfender/sdk/c0;

.field private final k:Lcom/bugfender/sdk/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/bugfender/sdk/a2;

.field private final m:Lcom/bugfender/sdk/x2;

.field private final n:Lcom/bugfender/sdk/o1;

.field private final o:Lcom/bugfender/sdk/e3;

.field private p:Lcom/bugfender/sdk/s;

.field private volatile q:Lcom/bugfender/sdk/y;

.field private r:Lcom/bugfender/sdk/k2;

.field private volatile s:Z

.field private volatile t:Z

.field private volatile u:Z

.field private final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/concurrent/Callable<",
            "*>;>;"
        }
    .end annotation
.end field

.field private w:J

.field private x:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/k1$e;

    invoke-direct {v0}, Lcom/bugfender/sdk/k1$e;-><init>()V

    sput-object v0, Lcom/bugfender/sdk/k1;->H:Ljava/lang/Runnable;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/c0;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/a2;Lcom/bugfender/sdk/x2;Lcom/bugfender/sdk/e3;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/bugfender/sdk/r1;",
            "Lcom/bugfender/sdk/c0;",
            "Lcom/bugfender/sdk/o1;",
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bugfender/sdk/a2;",
            "Lcom/bugfender/sdk/x2;",
            "Lcom/bugfender/sdk/e3;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bugfender/sdk/k1;->s:Z

    iput-boolean v0, p0, Lcom/bugfender/sdk/k1;->t:Z

    iput-boolean v0, p0, Lcom/bugfender/sdk/k1;->u:Z

    const-wide/32 v0, 0x500000

    iput-wide v0, p0, Lcom/bugfender/sdk/k1;->w:J

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/bugfender/sdk/k1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Lcom/bugfender/sdk/k1;->g:Ljava/lang/String;

    iput-object p2, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iput-object p3, p0, Lcom/bugfender/sdk/k1;->j:Lcom/bugfender/sdk/c0;

    iput-object p5, p0, Lcom/bugfender/sdk/k1;->k:Lcom/bugfender/sdk/x;

    iput-object p6, p0, Lcom/bugfender/sdk/k1;->l:Lcom/bugfender/sdk/a2;

    iput-object p7, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    iput-object p4, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iput-object p8, p0, Lcom/bugfender/sdk/k1;->o:Lcom/bugfender/sdk/e3;

    iput-object p9, p0, Lcom/bugfender/sdk/k1;->h:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/bugfender/sdk/k1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p3

    iput-object p3, p0, Lcom/bugfender/sdk/k1;->d:Ljava/util/concurrent/ExecutorService;

    new-instance p4, Lcom/bugfender/sdk/b1;

    check-cast p3, Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance p5, Lcom/bugfender/sdk/k1$a;

    invoke-direct {p5, p0}, Lcom/bugfender/sdk/k1$a;-><init>(Lcom/bugfender/sdk/k1;)V

    const/16 p6, 0x1388

    const/16 p7, 0x14

    invoke-direct {p4, p3, p6, p7, p5}, Lcom/bugfender/sdk/b1;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;IILcom/bugfender/sdk/b1$c;)V

    iput-object p4, p0, Lcom/bugfender/sdk/k1;->c:Lcom/bugfender/sdk/b1;

    invoke-static {p2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lcom/bugfender/sdk/z2;

    invoke-direct {p2}, Lcom/bugfender/sdk/z2;-><init>()V

    iput-object p2, p0, Lcom/bugfender/sdk/k1;->f:Lcom/bugfender/sdk/z2;

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->u()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bugfender/sdk/k1;->a:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/e1;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/k1;->b(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/e1;

    move-result-object p0

    return-object p0
.end method

.method private a(Ljava/lang/String;J)Lcom/bugfender/sdk/k2;
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/k2$a;

    invoke-direct {v0}, Lcom/bugfender/sdk/k2$a;-><init>()V

    invoke-virtual {v0, p2, p3}, Lcom/bugfender/sdk/k2$a;->b(J)Lcom/bugfender/sdk/k2$a;

    move-result-object p2

    new-instance p3, Lcom/bugfender/sdk/f;

    new-instance v0, Lcom/bugfender/sdk/e;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/e;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p1}, Lcom/bugfender/sdk/x2;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->h()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p3, v0, p1, v1}, Lcom/bugfender/sdk/f;-><init>(Lcom/bugfender/sdk/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lcom/bugfender/sdk/k2$a;->a(Lcom/bugfender/sdk/f;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->d()F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->a(F)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->q()Lcom/bugfender/sdk/w;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->a(Lcom/bugfender/sdk/w;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->o()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/bugfender/sdk/k2$a;->a(J)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->m()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->a(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->a(I)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->q()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->b(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->f()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/bugfender/sdk/k2$a;->c(J)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->c(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->s()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/bugfender/sdk/k2$a;->e(J)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {p2}, Lcom/bugfender/sdk/x2;->l()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->e(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->a(Ljava/util/Date;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bugfender/sdk/k1;->r()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p2

    invoke-static {p2}, Lcom/bugfender/sdk/c3;->b(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/k2$a;->d(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2$a;->a()Lcom/bugfender/sdk/k2;

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/s;)Lcom/bugfender/sdk/s;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1;->p:Lcom/bugfender/sdk/s;

    return-object p1
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/y;)Lcom/bugfender/sdk/y;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    return-object p1
.end method

.method private a([Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;
    .locals 4

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    array-length v0, p1

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    :goto_0
    array-length v0, p1

    if-ge v1, v0, :cond_1

    aget-object v0, p1, v1

    invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/bugfender/sdk/k1;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;
    .locals 9

    invoke-virtual {p0}, Lcom/bugfender/sdk/k1;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/bugfender/sdk/d3;->a(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-static {}, Lcom/bugfender/sdk/u0;->a()Lcom/bugfender/sdk/u0$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/u0$b;->a(Ljava/util/UUID;)Lcom/bugfender/sdk/u0$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/bugfender/sdk/u0$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/u0$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/bugfender/sdk/u0$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0$b;->a()Lcom/bugfender/sdk/u0;

    move-result-object v4

    new-instance v3, Lcom/bugfender/sdk/m0;

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    invoke-direct {v3, p1}, Lcom/bugfender/sdk/m0;-><init>(Lcom/bugfender/sdk/r1;)V

    new-instance v6, Lcom/bugfender/sdk/l0;

    invoke-direct {v6}, Lcom/bugfender/sdk/l0;-><init>()V

    new-instance p1, Lcom/bugfender/sdk/d;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v5, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iget-object v7, p0, Lcom/bugfender/sdk/k1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v8, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    move-object v1, p1

    invoke-direct/range {v1 .. v8}, Lcom/bugfender/sdk/d;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/p0;Ljava/lang/Object;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/k0;Ljava/util/concurrent/atomic/AtomicLong;Lcom/bugfender/sdk/y;)V

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/util/concurrent/Callable;)V

    sget-object p1, Lcom/bugfender/sdk/e1$c;->g:Lcom/bugfender/sdk/e1$c;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p4, p2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private a(Lcom/bugfender/sdk/e1;)Ljava/util/concurrent/Callable;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/e1;",
            ")",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v2, Lcom/bugfender/sdk/n0;

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    invoke-direct {v2, v0}, Lcom/bugfender/sdk/n0;-><init>(Lcom/bugfender/sdk/r1;)V

    new-instance v5, Lcom/bugfender/sdk/o0;

    invoke-direct {v5}, Lcom/bugfender/sdk/o0;-><init>()V

    new-instance v8, Lcom/bugfender/sdk/d;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v4, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iget-object v6, p0, Lcom/bugfender/sdk/k1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v7, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    move-object v0, v8

    move-object v3, p1

    invoke-direct/range {v0 .. v7}, Lcom/bugfender/sdk/d;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/p0;Ljava/lang/Object;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/k0;Ljava/util/concurrent/atomic/AtomicLong;Lcom/bugfender/sdk/y;)V

    return-object v8
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/e1;)Ljava/util/concurrent/Callable;
    .locals 0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1;)Ljava/util/concurrent/Callable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->j()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/k2;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->b(Lcom/bugfender/sdk/k2;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private a()V
    .locals 6

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/bugfender/sdk/a0;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->q()Lcom/bugfender/sdk/w;

    move-result-object v3

    iget-object v4, p0, Lcom/bugfender/sdk/k1;->k:Lcom/bugfender/sdk/x;

    new-instance v5, Lcom/bugfender/sdk/k1$d;

    invoke-direct {v5, p0}, Lcom/bugfender/sdk/k1$d;-><init>(Lcom/bugfender/sdk/k1;)V

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/bugfender/sdk/a0;-><init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/w;Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/q;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method private a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/k1;->b(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/e1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1;)Ljava/util/concurrent/Callable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method private a(Lcom/bugfender/sdk/k2;)V
    .locals 2

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;

    invoke-direct {v0}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;-><init>()V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->d:Ljava/util/concurrent/ExecutorService;

    check-cast v1, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/bugfender/sdk/k1$f;

    invoke-direct {v1, p0, p1}, Lcom/bugfender/sdk/k1$f;-><init>(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/k2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;J)Lcom/bugfender/sdk/k2;

    move-result-object p1

    iput-object p1, p0, Lcom/bugfender/sdk/k1;->r:Lcom/bugfender/sdk/k2;

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k2;)V

    return-void
.end method

.method private a(Ljava/util/concurrent/Callable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "*>;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/bugfender/sdk/k1;->s:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->x()V

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/k1;->c:Lcom/bugfender/sdk/b1;

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/b1;->a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x1f4

    if-le p1, v0, :cond_2

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/k1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/bugfender/sdk/k1;->s:Z

    return p1
.end method

.method private b(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/e1;
    .locals 6

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->t()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/bugfender/sdk/e1$b;

    invoke-direct {v4}, Lcom/bugfender/sdk/e1$b;-><init>()V

    invoke-virtual {v4, p2}, Lcom/bugfender/sdk/e1$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/bugfender/sdk/e1$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/bugfender/sdk/e1$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/bugfender/sdk/e1$b;->a(Ljava/util/Date;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    iget-object p3, p0, Lcom/bugfender/sdk/k1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v4

    invoke-virtual {p2, v4, v5}, Lcom/bugfender/sdk/e1$b;->a(J)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/bugfender/sdk/e1$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1$c;->a()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/bugfender/sdk/e1$b;->a(I)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/e1$b;->b(I)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/bugfender/sdk/e1$b;->f(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/bugfender/sdk/e1$b;->e(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1$b;->a()Lcom/bugfender/sdk/e1;

    move-result-object p1

    return-object p1
.end method

.method static synthetic b(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->c()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private b(Lcom/bugfender/sdk/k2;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/k2;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/bugfender/sdk/t0;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    invoke-direct {v0, v1, p1}, Lcom/bugfender/sdk/t0;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/k2;)V

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->c:Lcom/bugfender/sdk/b1;

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/b1;->a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method static synthetic c(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/a2;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->l:Lcom/bugfender/sdk/a2;

    return-object p0
.end method

.method private c()Ljava/util/concurrent/Future;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v6, Lcom/bugfender/sdk/r;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->j:Lcom/bugfender/sdk/c0;

    iget-wide v3, p0, Lcom/bugfender/sdk/k1;->w:J

    iget-object v5, p0, Lcom/bugfender/sdk/k1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/bugfender/sdk/r;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/c0;JLjava/util/concurrent/atomic/AtomicLong;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->m()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private d()V
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->f()V

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->e()V

    return-void
.end method

.method private e()V
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/u;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/u;-><init>(Lcom/bugfender/sdk/r1;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->c:Lcom/bugfender/sdk/b1;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/b1;->a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method static synthetic e(Lcom/bugfender/sdk/k1;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bugfender/sdk/k1;->t:Z

    return p0
.end method

.method static synthetic f(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->l()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private f()V
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/v;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/v;-><init>(Lcom/bugfender/sdk/r1;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->c:Lcom/bugfender/sdk/b1;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/b1;->a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method private g()Ljava/util/concurrent/Future;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/bugfender/sdk/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/bugfender/sdk/z;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->q()Lcom/bugfender/sdk/w;

    move-result-object v3

    iget-object v4, p0, Lcom/bugfender/sdk/k1;->k:Lcom/bugfender/sdk/x;

    invoke-direct {v1, v2, v3, v4}, Lcom/bugfender/sdk/z;-><init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/w;Lcom/bugfender/sdk/x;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic g(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->k()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->i()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->x()V

    :cond_0
    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->d()V

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->c()Ljava/util/concurrent/Future;

    return-void
.end method

.method static synthetic i(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/z2;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->f:Lcom/bugfender/sdk/z2;

    return-object p0
.end method

.method private i()Ljava/util/concurrent/Future;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/bugfender/sdk/f2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->k:Lcom/bugfender/sdk/x;

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->q()Lcom/bugfender/sdk/w;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/bugfender/sdk/f2;-><init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/w;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method private j()Ljava/util/concurrent/Future;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    new-instance v6, Lcom/bugfender/sdk/g2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iget-object v3, p0, Lcom/bugfender/sdk/k1;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    iget-object v5, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/bugfender/sdk/g2;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;Ljava/lang/String;Lcom/bugfender/sdk/x2;Lcom/bugfender/sdk/y;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic j(Lcom/bugfender/sdk/k1;)V
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->h()V

    return-void
.end method

.method private k()Ljava/util/concurrent/Future;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/bugfender/sdk/h2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iget-object v3, p0, Lcom/bugfender/sdk/k1;->g:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/bugfender/sdk/h2;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic k(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/atomic/AtomicLong;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    return-object p0
.end method

.method private l()Ljava/util/concurrent/Future;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lcom/bugfender/sdk/i2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    invoke-direct {v0, v1, v2}, Lcom/bugfender/sdk/i2;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic l(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method private m()Ljava/util/concurrent/Future;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    new-instance v6, Lcom/bugfender/sdk/g2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iget-object v3, p0, Lcom/bugfender/sdk/k1;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    iget-object v5, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/bugfender/sdk/g2;-><init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/o1;Ljava/lang/String;Lcom/bugfender/sdk/x2;Lcom/bugfender/sdk/y;)V

    new-instance v0, Lcom/bugfender/sdk/j2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    iget-object v3, p0, Lcom/bugfender/sdk/k1;->g:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v6}, Lcom/bugfender/sdk/j2;-><init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/r1;Ljava/lang/String;Lcom/bugfender/sdk/g2;)V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method

.method static synthetic m(Lcom/bugfender/sdk/k1;)V
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->a()V

    return-void
.end method

.method static synthetic n(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/x2;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    return-object p0
.end method

.method private n()V
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->c:Lcom/bugfender/sdk/b1;

    invoke-virtual {v0}, Lcom/bugfender/sdk/b1;->b()V

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method static synthetic o(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/s;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->p:Lcom/bugfender/sdk/s;

    return-object p0
.end method

.method private o()V
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/y$b;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/y$b;-><init>(Lcom/bugfender/sdk/y;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/y$b;->a(Z)Lcom/bugfender/sdk/y$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/y$b;->a()Lcom/bugfender/sdk/y;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    iget-boolean v0, p0, Lcom/bugfender/sdk/k1;->s:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->d()V

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->l()Ljava/util/concurrent/Future;

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->k()Ljava/util/concurrent/Future;

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->j()Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method

.method static synthetic p(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/r1;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->i:Lcom/bugfender/sdk/r1;

    return-object p0
.end method

.method private q()Lcom/bugfender/sdk/w;
    .locals 3

    new-instance v0, Lcom/bugfender/sdk/w$b;

    invoke-direct {v0}, Lcom/bugfender/sdk/w$b;-><init>()V

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->j(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->h:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/bugfender/sdk/x2;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->e(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->f(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->k(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->i(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->g(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bugfender/sdk/w$b;->b(J)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bugfender/sdk/w$b;->a(J)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    const v1, 0x1348cba

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->h(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v1}, Lcom/bugfender/sdk/x2;->k()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/w$b;->a(Z)Lcom/bugfender/sdk/w$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/w$b;->a()Lcom/bugfender/sdk/w;

    move-result-object v0

    return-object v0
.end method

.method static synthetic q(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/y;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/k1;->q:Lcom/bugfender/sdk/y;

    return-object p0
.end method

.method static synthetic r(Lcom/bugfender/sdk/k1;)V
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->n()V

    return-void
.end method

.method static synthetic s(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->g()Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method private t()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/bugfender/sdk/k1;->u:Z

    if-nez v1, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/bugfender/sdk/k1;->a([Ljava/lang/StackTraceElement;)Ljava/lang/StackTraceElement;

    move-result-object v5

    const/4 v6, 0x6

    if-nez v5, :cond_0

    array-length v7, v1

    if-lt v7, v6, :cond_2

    :cond_0
    if-nez v5, :cond_1

    aget-object v5, v1, v6

    :cond_1
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0
.end method

.method private u()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-le v2, v4, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v3, v0, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v0, v0, v4

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-object v0, v0, v3

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private x()V
    .locals 3

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Callable;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->c:Lcom/bugfender/sdk/b1;

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/b1;->a(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bugfender/sdk/k1;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/bugfender/sdk/e1$b;

    invoke-direct {v2}, Lcom/bugfender/sdk/e1$b;-><init>()V

    invoke-virtual {v2, p5}, Lcom/bugfender/sdk/e1$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p5

    invoke-virtual {p5, p6}, Lcom/bugfender/sdk/e1$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p5

    invoke-virtual {p5, p2}, Lcom/bugfender/sdk/e1$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    new-instance p5, Ljava/util/Date;

    invoke-direct {p5}, Ljava/util/Date;-><init>()V

    invoke-virtual {p2, p5}, Lcom/bugfender/sdk/e1$b;->a(Ljava/util/Date;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    iget-object p5, p0, Lcom/bugfender/sdk/k1;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide p5

    invoke-virtual {p2, p5, p6}, Lcom/bugfender/sdk/e1$b;->a(J)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/bugfender/sdk/e1$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    invoke-virtual {p4}, Lcom/bugfender/sdk/e1$c;->a()I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/bugfender/sdk/e1$b;->a(I)Lcom/bugfender/sdk/e1$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/bugfender/sdk/e1$b;->b(I)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/bugfender/sdk/e1$b;->e(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/e1$b;->f(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1$b;->a()Lcom/bugfender/sdk/e1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1;)Ljava/util/concurrent/Callable;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public a(J)V
    .locals 3

    const-wide/32 v0, 0x3200000

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    :goto_0
    iput-wide v0, p0, Lcom/bugfender/sdk/k1;->w:J

    goto :goto_1

    :cond_0
    const-wide/32 v0, 0x100000

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    iput-wide p1, p0, Lcom/bugfender/sdk/k1;->w:J

    :goto_1
    return-void
.end method

.method public a(Lcom/bugfender/sdk/z0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bugfender/sdk/z0<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/bugfender/sdk/o2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->k:Lcom/bugfender/sdk/x;

    new-instance v2, Lcom/bugfender/sdk/k1$b;

    invoke-direct {v2, p0, p1}, Lcom/bugfender/sdk/k1$b;-><init>(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/z0;)V

    invoke-direct {v0, v1, p1, v2}, Lcom/bugfender/sdk/o2;-><init>(Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/z0;Lcom/bugfender/sdk/q;)V

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/bugfender/sdk/e1$c;->b:Lcom/bugfender/sdk/e1$c;

    invoke-direct {p0, v0, p1, p2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bugfender/sdk/k1;->u:Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/bugfender/sdk/k1$c;

    invoke-direct {v1, p0}, Lcom/bugfender/sdk/k1$c;-><init>(Lcom/bugfender/sdk/k1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    new-instance v0, Lcom/bugfender/sdk/c2;

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->k:Lcom/bugfender/sdk/x;

    iget-object v2, p0, Lcom/bugfender/sdk/k1;->n:Lcom/bugfender/sdk/o1;

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->q()Lcom/bugfender/sdk/w;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/bugfender/sdk/c2;-><init>(Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/w;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/bugfender/sdk/e1$c;->d:Lcom/bugfender/sdk/e1$c;

    invoke-direct {p0, v0, p1, p2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bugfender/sdk/k1;->t:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/bugfender/sdk/k1;->l:Lcom/bugfender/sdk/a2;

    invoke-interface {p1}, Lcom/bugfender/sdk/a2;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->o()V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/bugfender/sdk/e1$c;->g:Lcom/bugfender/sdk/e1$c;

    invoke-direct {p0, v0, p1, p2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/bugfender/sdk/e1$c;->f:Lcom/bugfender/sdk/e1$c;

    invoke-direct {p0, v0, p1, p2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->o:Lcom/bugfender/sdk/e3;

    const-string v1, "crash"

    const-string v2, "bf_issue"

    invoke-direct {p0, p1, p2, v1, v2}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/e3;->b(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "bf_issue"

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->o:Lcom/bugfender/sdk/e3;

    invoke-virtual {p0, p1, p2}, Lcom/bugfender/sdk/k1;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/e3;->b(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;
    .locals 2

    const-string v0, "user-feedback"

    const-string v1, "bf_issue"

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->o:Lcom/bugfender/sdk/e3;

    invoke-virtual {p0, p1, p2}, Lcom/bugfender/sdk/k1;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/e3;->b(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/bugfender/sdk/e1$c;->e:Lcom/bugfender/sdk/e1$c;

    invoke-direct {p0, v0, p1, p2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/bugfender/sdk/e1$c;->c:Lcom/bugfender/sdk/e1$c;

    invoke-direct {p0, v0, p1, p2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->l:Lcom/bugfender/sdk/a2;

    invoke-interface {v0}, Lcom/bugfender/sdk/a2;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/bugfender/sdk/k1;->o()V

    :cond_0
    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->m:Lcom/bugfender/sdk/x2;

    invoke-interface {v0}, Lcom/bugfender/sdk/x2;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s()Ljava/net/URL;
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->o:Lcom/bugfender/sdk/e3;

    invoke-virtual {p0}, Lcom/bugfender/sdk/k1;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e3;->a(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/k1;->r:Lcom/bugfender/sdk/k2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bugfender/sdk/k2;->l()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public w()Ljava/net/URL;
    .locals 2

    invoke-virtual {p0}, Lcom/bugfender/sdk/k1;->v()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/bugfender/sdk/k1;->o:Lcom/bugfender/sdk/e3;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/e3;->c(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
