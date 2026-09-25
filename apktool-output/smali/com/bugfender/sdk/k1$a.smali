.class Lcom/bugfender/sdk/k1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/b1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/k1;-><init>(Ljava/lang/String;Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/c0;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/a2;Lcom/bugfender/sdk/x2;Lcom/bugfender/sdk/e3;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/k1;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/k1;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1$a;->a:Lcom/bugfender/sdk/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/ThreadPoolExecutor;Z)V
    .locals 3

    iget-object p2, p0, Lcom/bugfender/sdk/k1$a;->a:Lcom/bugfender/sdk/k1;

    sget-object v0, Lcom/bugfender/sdk/e1$c;->b:Lcom/bugfender/sdk/e1$c;

    const-string v1, "bf_log_memory_pressure"

    const-string v2, "Bugfender received a memory warning. New incoming logs will be discarded until the logs pending to be processed are reduced."

    invoke-static {p2, v0, v1, v2}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/e1$c;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/e1;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/e1;)Ljava/util/concurrent/Callable;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    return-void
.end method
