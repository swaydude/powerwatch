.class public Lcom/bugfender/sdk/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/x1$a;,
        Lcom/bugfender/sdk/x1$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/x1;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lcom/bugfender/sdk/x1$a;)V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/x1;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/bugfender/sdk/x1$b;

    invoke-direct {v1, p0, p1, p2}, Lcom/bugfender/sdk/x1$b;-><init>(Lcom/bugfender/sdk/x1;Landroid/view/View;Lcom/bugfender/sdk/x1$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
