.class Lcom/bugfender/sdk/k1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/k1;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/q<",
        "Lcom/bugfender/sdk/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/k1;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/k1;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1$d;->a:Lcom/bugfender/sdk/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bugfender/sdk/y;)V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/k1$d;->a:Lcom/bugfender/sdk/k1;

    new-instance v1, Lcom/bugfender/sdk/y$b;

    invoke-direct {v1, p1}, Lcom/bugfender/sdk/y$b;-><init>(Lcom/bugfender/sdk/y;)V

    invoke-virtual {v1}, Lcom/bugfender/sdk/y$b;->a()Lcom/bugfender/sdk/y;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/y;)Lcom/bugfender/sdk/y;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/bugfender/sdk/y;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/k1$d;->a(Lcom/bugfender/sdk/y;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    instance-of p1, p1, Lcom/bugfender/sdk/g;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/bugfender/sdk/k1$d;->a:Lcom/bugfender/sdk/k1;

    invoke-static {p1}, Lcom/bugfender/sdk/k1;->r(Lcom/bugfender/sdk/k1;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/bugfender/sdk/k1$d;->a:Lcom/bugfender/sdk/k1;

    invoke-static {p1}, Lcom/bugfender/sdk/k1;->q(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/y;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/bugfender/sdk/k1$d;->a:Lcom/bugfender/sdk/k1;

    sget-object v0, Lcom/bugfender/sdk/y;->d:Lcom/bugfender/sdk/y;

    invoke-static {p1, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/y;)Lcom/bugfender/sdk/y;

    :cond_1
    return-void
.end method
