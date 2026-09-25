.class public Lcom/bugfender/sdk/c2;
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
.field private final a:Lcom/bugfender/sdk/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bugfender/sdk/o1;

.field private final c:Lcom/bugfender/sdk/w;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/w;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bugfender/sdk/o1;",
            "Lcom/bugfender/sdk/w;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/c2;->a:Lcom/bugfender/sdk/x;

    iput-object p2, p0, Lcom/bugfender/sdk/c2;->b:Lcom/bugfender/sdk/o1;

    iput-object p3, p0, Lcom/bugfender/sdk/c2;->c:Lcom/bugfender/sdk/w;

    iput-object p4, p0, Lcom/bugfender/sdk/c2;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/c2;->b:Lcom/bugfender/sdk/o1;

    iget-object v1, p0, Lcom/bugfender/sdk/c2;->c:Lcom/bugfender/sdk/w;

    invoke-virtual {v1}, Lcom/bugfender/sdk/w;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/c2;->c:Lcom/bugfender/sdk/w;

    invoke-virtual {v2}, Lcom/bugfender/sdk/w;->l()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/bugfender/sdk/z0;

    iget-object v4, p0, Lcom/bugfender/sdk/c2;->d:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/z0;)V

    iget-object v0, p0, Lcom/bugfender/sdk/c2;->a:Lcom/bugfender/sdk/x;

    iget-object v1, p0, Lcom/bugfender/sdk/c2;->d:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/bugfender/sdk/x;->a(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Lcom/bugfender/sdk/h; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
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

    invoke-virtual {p0}, Lcom/bugfender/sdk/c2;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
