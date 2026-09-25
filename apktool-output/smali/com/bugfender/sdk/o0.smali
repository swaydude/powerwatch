.class public Lcom/bugfender/sdk/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/k0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/k0<",
        "Lcom/bugfender/sdk/e1;",
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
.method public a(Lcom/bugfender/sdk/e1;)Lcom/bugfender/sdk/e1;
    .locals 3

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/bugfender/sdk/f0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Bugfender-SDK"

    const-string v1, "Log reached maximum string size and it was trimmed"

    invoke-static {v0, v1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/bugfender/sdk/e1$b;

    invoke-direct {v0}, Lcom/bugfender/sdk/e1$b;-><init>()V

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/bugfender/sdk/f0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->b()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->a(Ljava/util/Date;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bugfender/sdk/e1$b;->a(J)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->a(I)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->b(I)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/e1$b;->e(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/e1$b;->f(Ljava/lang/String;)Lcom/bugfender/sdk/e1$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/e1$b;->a()Lcom/bugfender/sdk/e1;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/bugfender/sdk/e1;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/o0;->a(Lcom/bugfender/sdk/e1;)Lcom/bugfender/sdk/e1;

    move-result-object p1

    return-object p1
.end method
