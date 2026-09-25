.class public Lcom/bugfender/sdk/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bugfender/sdk/r1;

.field private final b:Lcom/bugfender/sdk/k2;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/r1;Lcom/bugfender/sdk/k2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/t0;->a:Lcom/bugfender/sdk/r1;

    iput-object p2, p0, Lcom/bugfender/sdk/t0;->b:Lcom/bugfender/sdk/k2;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/t0;->a:Lcom/bugfender/sdk/r1;

    iget-object v1, p0, Lcom/bugfender/sdk/t0;->b:Lcom/bugfender/sdk/k2;

    invoke-interface {v0, v1}, Lcom/bugfender/sdk/r1;->d(Lcom/bugfender/sdk/k2;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Lcom/bugfender/sdk/i; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Bugfender-SDK"

    invoke-static {v1, v0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bugfender/sdk/t0;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
