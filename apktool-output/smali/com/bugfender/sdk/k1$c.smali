.class Lcom/bugfender/sdk/k1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/k1;->b()V
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

    iput-object p1, p0, Lcom/bugfender/sdk/k1$c;->a:Lcom/bugfender/sdk/k1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/k1$c;->a:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->o(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/s;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/k1$c;->a:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->p(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/r1;

    move-result-object v0

    invoke-interface {v0}, Lcom/bugfender/sdk/r1;->f()Lcom/bugfender/sdk/t1;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/k1$c;->a:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/s;->a(Lcom/bugfender/sdk/t1;)Lcom/bugfender/sdk/s;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/s;)Lcom/bugfender/sdk/s;

    :cond_0
    return-void
.end method
