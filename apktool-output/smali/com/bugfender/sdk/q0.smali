.class public final Lcom/bugfender/sdk/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/g0<",
        "Lcom/bugfender/sdk/p1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bugfender/sdk/p1;)Lcom/bugfender/sdk/h;
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Lcom/bugfender/sdk/p1;->a()I

    move-result v0

    const/16 v1, -0x3ef

    if-eq v0, v1, :cond_1

    const/16 v1, -0x3ec

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/bugfender/sdk/k;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/k;-><init>(Lcom/bugfender/sdk/p1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/bugfender/sdk/g;

    invoke-virtual {p1}, Lcom/bugfender/sdk/p1;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/g;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Lcom/bugfender/sdk/j;

    invoke-virtual {p1}, Lcom/bugfender/sdk/p1;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/j;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Lcom/bugfender/sdk/l;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/l;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public bridge synthetic of(Ljava/lang/Object;)Lcom/bugfender/sdk/h;
    .locals 0

    check-cast p1, Lcom/bugfender/sdk/p1;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/q0;->a(Lcom/bugfender/sdk/p1;)Lcom/bugfender/sdk/h;

    move-result-object p1

    return-object p1
.end method
