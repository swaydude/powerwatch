.class Lcom/bugfender/sdk/k1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/q<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bugfender/sdk/z0;

.field final synthetic b:Lcom/bugfender/sdk/k1;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/z0;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1$b;->b:Lcom/bugfender/sdk/k1;

    iput-object p2, p0, Lcom/bugfender/sdk/k1$b;->a:Lcom/bugfender/sdk/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Set device data \""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/bugfender/sdk/k1$b;->a:Lcom/bugfender/sdk/z0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/z0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\"=\""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/bugfender/sdk/k1$b;->a:Lcom/bugfender/sdk/z0;

    invoke-virtual {v0}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/bugfender/sdk/e1$b;

    invoke-direct {v0}, Lcom/bugfender/sdk/e1$b;-><init>()V

    const-string v1, "bf_key_value"

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/e1$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/e1$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v1}, Lcom/bugfender/sdk/e1$b;->a(Ljava/util/Date;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    iget-object v1, p0, Lcom/bugfender/sdk/k1$b;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v1}, Lcom/bugfender/sdk/k1;->k(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/bugfender/sdk/e1$b;->a(J)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/e1$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    sget-object v0, Lcom/bugfender/sdk/e1$c;->b:Lcom/bugfender/sdk/e1$c;

    invoke-virtual {v0}, Lcom/bugfender/sdk/e1$c;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/e1$b;->a(I)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/bugfender/sdk/e1$b;->b(I)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1$b;->a()Lcom/bugfender/sdk/e1;

    move-result-object p1

    iget-object v0, p0, Lcom/bugfender/sdk/k1$b;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0, p1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/e1;)Ljava/util/concurrent/Callable;

    move-result-object p1

    iget-object v0, p0, Lcom/bugfender/sdk/k1$b;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0, p1}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Ljava/util/concurrent/Callable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/k1$b;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set device data \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bugfender/sdk/k1$b;->a:Lcom/bugfender/sdk/z0;

    invoke-virtual {v1}, Lcom/bugfender/sdk/z0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\"=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bugfender/sdk/k1$b;->a:Lcom/bugfender/sdk/z0;

    invoke-virtual {v1}, Lcom/bugfender/sdk/z0;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\" failed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Bugfender-SDK"

    invoke-static {v1, v0, p1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
