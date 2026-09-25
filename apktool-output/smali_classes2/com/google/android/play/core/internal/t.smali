.class public final Lcom/google/android/play/core/internal/t;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/play/core/splitcompat/a;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/play/core/internal/r;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private final g:Landroid/content/Intent;

.field private final h:Lcom/google/android/play/core/internal/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/internal/w<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/play/core/internal/x;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Landroid/os/IBinder$DeathRecipient;

.field private k:Landroid/content/ServiceConnection;

.field private l:Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/google/android/play/core/internal/t;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/splitcompat/a;Ljava/lang/String;Landroid/content/Intent;Lcom/google/android/play/core/internal/w;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/play/core/splitcompat/a;",
            "Ljava/lang/String;",
            "Landroid/content/Intent;",
            "Lcom/google/android/play/core/internal/w<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/play/core/internal/t;-><init>(Landroid/content/Context;Lcom/google/android/play/core/splitcompat/a;Ljava/lang/String;Landroid/content/Intent;Lcom/google/android/play/core/internal/w;Lcom/google/android/play/core/internal/x;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/splitcompat/a;Ljava/lang/String;Landroid/content/Intent;Lcom/google/android/play/core/internal/w;Lcom/google/android/play/core/internal/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/play/core/splitcompat/a;",
            "Ljava/lang/String;",
            "Landroid/content/Intent;",
            "Lcom/google/android/play/core/internal/w<",
            "TT;>;",
            "Lcom/google/android/play/core/internal/x;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    iput-object p6, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    new-instance p6, Lcom/google/android/play/core/internal/s;

    invoke-direct {p6, p0}, Lcom/google/android/play/core/internal/s;-><init>(Lcom/google/android/play/core/internal/t;)V

    iput-object p6, p0, Lcom/google/android/play/core/internal/t;->j:Landroid/os/IBinder$DeathRecipient;

    iput-object p1, p0, Lcom/google/android/play/core/internal/t;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    iput-object p3, p0, Lcom/google/android/play/core/internal/t;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/play/core/internal/t;->g:Landroid/content/Intent;

    iput-object p5, p0, Lcom/google/android/play/core/internal/t;->h:Lcom/google/android/play/core/internal/w;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/play/core/internal/t;->i:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/t;Landroid/content/ServiceConnection;)Landroid/content/ServiceConnection;
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/play/core/internal/t;->k:Landroid/content/ServiceConnection;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/t;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/t;->l:Landroid/os/IInterface;

    return-object p0
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/t;Landroid/os/IInterface;)Landroid/os/IInterface;
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/internal/t;->l:Landroid/os/IInterface;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/t;Lcom/google/android/play/core/internal/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/play/core/internal/t;->b(Lcom/google/android/play/core/internal/r;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/internal/t;Z)Z
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/play/core/internal/t;->f:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/play/core/internal/t;)Lcom/google/android/play/core/splitcompat/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    return-object p0
.end method

.method private final b(Lcom/google/android/play/core/internal/r;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->l:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/play/core/internal/t;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Initiate binding to the service."

    invoke-virtual {v0, v3, v2}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/google/android/play/core/internal/z;

    invoke-direct {p1, p0, v1}, Lcom/google/android/play/core/internal/z;-><init>(Lcom/google/android/play/core/internal/t;B)V

    iput-object p1, p0, Lcom/google/android/play/core/internal/t;->k:Landroid/content/ServiceConnection;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/play/core/internal/t;->f:Z

    iget-object v2, p0, Lcom/google/android/play/core/internal/t;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/play/core/internal/t;->g:Landroid/content/Intent;

    invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Failed to bind to the service."

    invoke-virtual {p1, v2, v0}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iput-boolean v1, p0, Lcom/google/android/play/core/internal/t;->f:Z

    iget-object p1, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/internal/r;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/r;->b()Lcom/google/android/play/core/tasks/h;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/play/core/internal/aa;

    invoke-direct {v1}, Lcom/google/android/play/core/internal/aa;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/tasks/h;->a(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/play/core/internal/t;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Waiting to bind to the service."

    invoke-virtual {v0, v2, v1}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/play/core/internal/r;->run()V

    :cond_4
    return-void
.end method

.method static synthetic b(Lcom/google/android/play/core/internal/t;Lcom/google/android/play/core/internal/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/play/core/internal/t;->c(Lcom/google/android/play/core/internal/r;)V

    return-void
.end method

.method static synthetic c(Lcom/google/android/play/core/internal/t;)Landroid/content/ServiceConnection;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/t;->k:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method private final c(Lcom/google/android/play/core/internal/r;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/play/core/internal/t;->d()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic d(Lcom/google/android/play/core/internal/t;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/t;->b:Landroid/content/Context;

    return-object p0
.end method

.method private final d()Landroid/os/Handler;
    .locals 4

    sget-object v0, Lcom/google/android/play/core/internal/t;->a:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/play/core/internal/t;->d:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    iget-object v2, p0, Lcom/google/android/play/core/internal/t;->d:Ljava/lang/String;

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    iget-object v2, p0, Lcom/google/android/play/core/internal/t;->d:Ljava/lang/String;

    new-instance v3, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lcom/google/android/play/core/internal/t;->d:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic e(Lcom/google/android/play/core/internal/t;)Lcom/google/android/play/core/internal/w;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/t;->h:Lcom/google/android/play/core/internal/w;

    return-object p0
.end method

.method private final e()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath"

    invoke-virtual {v0, v3, v2}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->l:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/play/core/internal/t;->j:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v2, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath failed"

    invoke-virtual {v2, v0, v3, v1}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method private final f()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "unlinkToDeath"

    invoke-virtual {v0, v3, v2}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->l:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/play/core/internal/t;->j:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    return-void
.end method

.method static synthetic f(Lcom/google/android/play/core/internal/t;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/internal/t;->e()V

    return-void
.end method

.method static synthetic g(Lcom/google/android/play/core/internal/t;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    return-object p0
.end method

.method static synthetic h(Lcom/google/android/play/core/internal/t;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/play/core/internal/t;->f()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    new-instance v0, Lcom/google/android/play/core/internal/u;

    invoke-direct {v0, p0}, Lcom/google/android/play/core/internal/u;-><init>(Lcom/google/android/play/core/internal/t;)V

    invoke-direct {p0, v0}, Lcom/google/android/play/core/internal/t;->c(Lcom/google/android/play/core/internal/r;)V

    return-void
.end method

.method public final a(Lcom/google/android/play/core/internal/r;)V
    .locals 2

    new-instance v0, Lcom/google/android/play/core/internal/v;

    invoke-virtual {p1}, Lcom/google/android/play/core/internal/r;->b()Lcom/google/android/play/core/tasks/h;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/play/core/internal/v;-><init>(Lcom/google/android/play/core/internal/t;Lcom/google/android/play/core/tasks/h;Lcom/google/android/play/core/internal/r;)V

    invoke-direct {p0, v0}, Lcom/google/android/play/core/internal/t;->c(Lcom/google/android/play/core/internal/r;)V

    return-void
.end method

.method public final b()Landroid/os/IInterface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->l:Landroid/os/IInterface;

    return-object v0
.end method

.method final synthetic c()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "reportBinderDeath"

    invoke-virtual {v0, v3, v2}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->i:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/internal/x;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "calling onBinderDied"

    invoke-virtual {v2, v3, v1}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-interface {v0}, Lcom/google/android/play/core/internal/x;->a()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->c:Lcom/google/android/play/core/splitcompat/a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/play/core/internal/t;->d:Ljava/lang/String;

    aput-object v3, v2, v1

    const-string v1, "%s : Binder has died."

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/internal/r;

    invoke-virtual {v1}, Lcom/google/android/play/core/internal/r;->b()Lcom/google/android/play/core/tasks/h;

    move-result-object v1

    if-eqz v1, :cond_1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xf

    if-ge v2, v3, :cond_2

    new-instance v2, Landroid/os/RemoteException;

    invoke-direct {v2}, Landroid/os/RemoteException;-><init>()V

    goto :goto_1

    :cond_2
    new-instance v2, Landroid/os/RemoteException;

    iget-object v3, p0, Lcom/google/android/play/core/internal/t;->d:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " : Binder has died."

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v1, v2}, Lcom/google/android/play/core/tasks/h;->a(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/play/core/internal/t;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
