.class public Lcom/bugfender/sdk/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/bugfender/sdk/y;",
        ">;"
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
.method public constructor <init>(Lcom/bugfender/sdk/o1;Lcom/bugfender/sdk/w;Lcom/bugfender/sdk/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/o1;",
            "Lcom/bugfender/sdk/w;",
            "Lcom/bugfender/sdk/x<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/z;->a:Lcom/bugfender/sdk/o1;

    iput-object p2, p0, Lcom/bugfender/sdk/z;->c:Lcom/bugfender/sdk/w;

    iput-object p3, p0, Lcom/bugfender/sdk/z;->b:Lcom/bugfender/sdk/x;

    return-void
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/y;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/bugfender/sdk/z;->a:Lcom/bugfender/sdk/o1;

    iget-object v1, p0, Lcom/bugfender/sdk/z;->c:Lcom/bugfender/sdk/w;

    invoke-virtual {v1}, Lcom/bugfender/sdk/w;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/bugfender/sdk/z;->c:Lcom/bugfender/sdk/w;

    iget-object v3, p0, Lcom/bugfender/sdk/z;->b:Lcom/bugfender/sdk/x;

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Lcom/bugfender/sdk/x;->a(Z)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/String;Lcom/bugfender/sdk/w;Ljava/util/Map;)Lcom/bugfender/sdk/y;

    move-result-object v0
    :try_end_0
    .catch Lcom/bugfender/sdk/h; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    instance-of v1, v0, Lcom/bugfender/sdk/g;

    if-nez v1, :cond_0

    sget-object v0, Lcom/bugfender/sdk/y;->d:Lcom/bugfender/sdk/y;

    return-object v0

    :cond_0
    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bugfender/sdk/z;->a()Lcom/bugfender/sdk/y;

    move-result-object v0

    return-object v0
.end method
