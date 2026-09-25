.class public Lcom/bugfender/sdk/f2;
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

.field private final b:Lcom/bugfender/sdk/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/bugfender/sdk/w;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/x;Lcom/bugfender/sdk/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/o1;",
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/bugfender/sdk/w;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/f2;->a:Lcom/bugfender/sdk/o1;

    iput-object p2, p0, Lcom/bugfender/sdk/f2;->b:Lcom/bugfender/sdk/x;

    iput-object p3, p0, Lcom/bugfender/sdk/f2;->c:Lcom/bugfender/sdk/w;

    return-void
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/q1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bugfender/sdk/q1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/f2;->b:Lcom/bugfender/sdk/x;

    invoke-interface {v0}, Lcom/bugfender/sdk/x;->getAll()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    iget-object v3, p0, Lcom/bugfender/sdk/f2;->a:Lcom/bugfender/sdk/o1;

    iget-object v4, p0, Lcom/bugfender/sdk/f2;->c:Lcom/bugfender/sdk/w;

    invoke-virtual {v4}, Lcom/bugfender/sdk/w;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/bugfender/sdk/f2;->c:Lcom/bugfender/sdk/w;

    invoke-virtual {v5}, Lcom/bugfender/sdk/w;->l()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/bugfender/sdk/z0;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-direct {v6, v2, v7}, Lcom/bugfender/sdk/z0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, v4, v5, v6}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/z0;)V

    iget-object v3, p0, Lcom/bugfender/sdk/f2;->b:Lcom/bugfender/sdk/x;

    invoke-interface {v3, v2}, Lcom/bugfender/sdk/x;->remove(Ljava/lang/String;)Z
    :try_end_0
    .catch Lcom/bugfender/sdk/h; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/bugfender/sdk/q1;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2, v0}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/bugfender/sdk/q1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/q1;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bugfender/sdk/f2;->a()Lcom/bugfender/sdk/q1;

    move-result-object v0

    return-object v0
.end method
