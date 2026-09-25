.class public Lcom/bugfender/sdk/u;
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


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/u;->a:Lcom/bugfender/sdk/r1;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u;->a:Lcom/bugfender/sdk/r1;

    invoke-interface {v0}, Lcom/bugfender/sdk/r1;->e()Lcom/bugfender/sdk/t1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/t1;->d()Z

    move-result v0

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

    invoke-virtual {p0}, Lcom/bugfender/sdk/u;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
