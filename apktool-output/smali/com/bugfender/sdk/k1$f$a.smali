.class Lcom/bugfender/sdk/k1$f$a;
.super Lcom/bugfender/sdk/z2$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bugfender/sdk/k1$f;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/bugfender/sdk/k1$f;


# direct methods
.method constructor <init>(Lcom/bugfender/sdk/k1$f;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    invoke-direct {p0}, Lcom/bugfender/sdk/z2$b;-><init>()V

    return-void
.end method

.method private a(Lcom/bugfender/sdk/q1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bugfender/sdk/q1<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/p1;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/bugfender/sdk/q1;->b()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Lcom/bugfender/sdk/j;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object p1, p1, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    sget-object v0, Lcom/bugfender/sdk/y;->d:Lcom/bugfender/sdk/y;

    invoke-static {p1, v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/y;)Lcom/bugfender/sdk/y;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bugfender/sdk/q1;->b()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/bugfender/sdk/k;

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance p1, Lcom/bugfender/sdk/p1;

    invoke-direct {p1}, Lcom/bugfender/sdk/p1;-><init>()V

    throw p1
.end method


# virtual methods
.method protected a(J)V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->i(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/z2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/z2;->a()V

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->i(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/z2;

    move-result-object v0

    new-instance v1, Lcom/bugfender/sdk/z2$a;

    invoke-direct {v1, p0}, Lcom/bugfender/sdk/z2$a;-><init>(Lcom/bugfender/sdk/z2$c;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/bugfender/sdk/z2;->a(JLcom/bugfender/sdk/z2$c;)V

    return-void
.end method

.method public b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->q(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/y;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->q(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/y;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v1, v1, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v1}, Lcom/bugfender/sdk/k1;->c(Lcom/bugfender/sdk/k1;)Lcom/bugfender/sdk/a2;

    move-result-object v1

    invoke-interface {v1}, Lcom/bugfender/sdk/a2;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez v0, :cond_2

    :cond_1
    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->e(Lcom/bugfender/sdk/k1;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->f(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/q1;

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/k1$f$a;->a(Lcom/bugfender/sdk/q1;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->d(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/q1;

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/k1$f$a;->a(Lcom/bugfender/sdk/q1;)V

    :cond_3
    if-eqz v1, :cond_4

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->g(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/q1;

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/k1$f$a;->a(Lcom/bugfender/sdk/q1;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->a(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/q1;

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/k1$f$a;->a(Lcom/bugfender/sdk/q1;)V

    iget-object v0, p0, Lcom/bugfender/sdk/k1$f$a;->d:Lcom/bugfender/sdk/k1$f;

    iget-object v0, v0, Lcom/bugfender/sdk/k1$f;->b:Lcom/bugfender/sdk/k1;

    invoke-static {v0}, Lcom/bugfender/sdk/k1;->h(Lcom/bugfender/sdk/k1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bugfender/sdk/q1;

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/k1$f$a;->a(Lcom/bugfender/sdk/q1;)V

    :cond_4
    return-void
.end method
