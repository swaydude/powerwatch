.class public Lcom/bugfender/sdk/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/k0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/k0<",
        "Lcom/bugfender/sdk/u0;",
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
.method public a(Lcom/bugfender/sdk/u0;)Lcom/bugfender/sdk/u0;
    .locals 3

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/bugfender/sdk/f0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Bugfender-SDK"

    const-string v1, "Issue reached maximum string size and it was trimmed"

    invoke-static {v0, v1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/bugfender/sdk/u0;->a()Lcom/bugfender/sdk/u0$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/bugfender/sdk/f0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/u0$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->b()Lcom/bugfender/sdk/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/u0$b;->a(Lcom/bugfender/sdk/e;)Lcom/bugfender/sdk/u0$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/u0$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->d()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/bugfender/sdk/u0$b;->a(J)Lcom/bugfender/sdk/u0$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/u0$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/u0$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0;->h()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/u0$b;->a(Ljava/util/UUID;)Lcom/bugfender/sdk/u0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/u0$b;->a()Lcom/bugfender/sdk/u0;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/bugfender/sdk/u0;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/l0;->a(Lcom/bugfender/sdk/u0;)Lcom/bugfender/sdk/u0;

    move-result-object p1

    return-object p1
.end method
