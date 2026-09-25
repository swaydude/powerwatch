.class public Lcom/bugfender/sdk/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:Lcom/bugfender/sdk/q2;

.field private final b:Lcom/bugfender/sdk/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bugfender/sdk/g0<",
            "Lcom/bugfender/sdk/p1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/bugfender/sdk/Bugfender;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/bugfender/sdk/o1;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/bugfender/sdk/q2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "BugfenderApiManager must be not null"

    invoke-static {p1, v0}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/bugfender/sdk/o1;->a:Lcom/bugfender/sdk/q2;

    new-instance p1, Lcom/bugfender/sdk/q0;

    invoke-direct {p1}, Lcom/bugfender/sdk/q0;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/o1;->b:Lcom/bugfender/sdk/g0;

    return-void
.end method

.method private a(Ljava/lang/Throwable;)V
    .locals 2

    instance-of v0, p1, Lcom/bugfender/sdk/g;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/bugfender/sdk/o1;->c:Ljava/lang/String;

    const-string v0, "Unrecognized application key."

    invoke-static {p1, v0}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/bugfender/sdk/j;

    const-string v1, "Bugfender-SDK"

    if-eqz v0, :cond_1

    const-string p1, "Log limit reached"

    invoke-static {v1, p1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lcom/bugfender/sdk/k;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of v0, p1, Lcom/bugfender/sdk/p1;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/bugfender/sdk/p1;

    invoke-virtual {p1}, Lcom/bugfender/sdk/p1;->a()I

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "The Internet permission is not available, please manually delete the app and reinstall it so the manifest can be updated"

    goto :goto_0

    :cond_2
    const-string p1, "Network error, will retry later"

    :goto_0
    invoke-static {v1, p1}, Lcom/bugfender/sdk/d1;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lcom/bugfender/sdk/k2;)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/h;
        }
    .end annotation

    :try_start_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lcom/bugfender/sdk/y0$c$a;->a(Lcom/bugfender/sdk/k2;Ljava/lang/Boolean;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/bugfender/sdk/o1;->a:Lcom/bugfender/sdk/q2;

    const-string v1, "session"

    invoke-virtual {v0, v1, p1}, Lcom/bugfender/sdk/q2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/bugfender/sdk/y0$c$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/m2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bugfender/sdk/m2;->a()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_0
    new-instance v0, Lcom/bugfender/sdk/p1;

    const/4 v1, 0x2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response body from server: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/bugfender/sdk/p1;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/bugfender/sdk/p1; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/bugfender/sdk/o1;->b:Lcom/bugfender/sdk/g0;

    invoke-interface {v0, p1}, Lcom/bugfender/sdk/g0;->of(Ljava/lang/Object;)Lcom/bugfender/sdk/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Lcom/bugfender/sdk/w;Ljava/util/Map;)Lcom/bugfender/sdk/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/bugfender/sdk/w;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lcom/bugfender/sdk/y;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/h;
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/bugfender/sdk/y0$a$a;->a(Ljava/lang/String;Lcom/bugfender/sdk/w;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/o1;->a:Lcom/bugfender/sdk/q2;

    const-string p3, "app/device-status"

    invoke-virtual {p2, p3, p1}, Lcom/bugfender/sdk/q2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/bugfender/sdk/y0$a$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/b0;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/bugfender/sdk/b0;->a()Lcom/bugfender/sdk/b0$a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/bugfender/sdk/b0$a;->a()I

    move-result p1

    const/16 p3, -0x3f9

    if-eq p1, p3, :cond_1

    const/16 p3, -0x3ec

    if-eq p1, p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/bugfender/sdk/p1;

    const-string p2, "Invalid app token"

    invoke-direct {p1, p3, p2}, Lcom/bugfender/sdk/p1;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/bugfender/sdk/p1;

    const-string p2, "Deleted app"

    invoke-direct {p1, p3, p2}, Lcom/bugfender/sdk/p1;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    new-instance p1, Lcom/bugfender/sdk/y$b;

    invoke-direct {p1}, Lcom/bugfender/sdk/y$b;-><init>()V

    invoke-virtual {p2}, Lcom/bugfender/sdk/b0;->c()Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/bugfender/sdk/y$b;->b(Z)Lcom/bugfender/sdk/y$b;

    move-result-object p1

    invoke-virtual {p2}, Lcom/bugfender/sdk/b0;->d()Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/bugfender/sdk/y$b;->a(Z)Lcom/bugfender/sdk/y$b;

    move-result-object p1

    invoke-virtual {p2}, Lcom/bugfender/sdk/b0;->b()Lcom/bugfender/sdk/b0$b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bugfender/sdk/b0$b;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/bugfender/sdk/y$b;->a(I)Lcom/bugfender/sdk/y$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bugfender/sdk/y$b;->a()Lcom/bugfender/sdk/y;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p2, Lcom/bugfender/sdk/p1;

    const/4 p3, 0x2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected response body from server: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lcom/bugfender/sdk/p1;-><init>(ILjava/lang/String;)V

    throw p2
    :try_end_0
    .catch Lcom/bugfender/sdk/p1; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/bugfender/sdk/o1;->b:Lcom/bugfender/sdk/g0;

    invoke-interface {p2, p1}, Lcom/bugfender/sdk/g0;->of(Ljava/lang/Object;)Lcom/bugfender/sdk/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public a(Lcom/bugfender/sdk/u0;Lcom/bugfender/sdk/k2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/h;
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2}, Lcom/bugfender/sdk/y0$b$a;->a(Lcom/bugfender/sdk/u0;Lcom/bugfender/sdk/k2;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/o1;->a:Lcom/bugfender/sdk/q2;

    const-string v0, "issue"

    invoke-virtual {p2, v0, p1}, Lcom/bugfender/sdk/q2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/bugfender/sdk/p1; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/bugfender/sdk/o1;->b:Lcom/bugfender/sdk/g0;

    invoke-interface {p2, p1}, Lcom/bugfender/sdk/g0;->of(Ljava/lang/Object;)Lcom/bugfender/sdk/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/z0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/bugfender/sdk/z0<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/h;
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/bugfender/sdk/y0$d$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/z0;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/bugfender/sdk/o1;->a:Lcom/bugfender/sdk/q2;

    const-string p3, "device/keyvalue"

    invoke-virtual {p2, p3, p1}, Lcom/bugfender/sdk/q2;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/bugfender/sdk/p1; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/bugfender/sdk/o1;->b:Lcom/bugfender/sdk/g0;

    invoke-interface {p2, p1}, Lcom/bugfender/sdk/g0;->of(Ljava/lang/Object;)Lcom/bugfender/sdk/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public a(Ljava/util/List;Lcom/bugfender/sdk/k2;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/e1;",
            ">;",
            "Lcom/bugfender/sdk/k2;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/bugfender/sdk/h;
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2}, Lcom/bugfender/sdk/y0$e$a;->a(Ljava/util/List;Lcom/bugfender/sdk/k2;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/bugfender/sdk/o1;->a:Lcom/bugfender/sdk/q2;

    const-string v1, "log/batch"

    invoke-virtual {p2}, Lcom/bugfender/sdk/k2;->k()J

    move-result-wide v2

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/bugfender/sdk/q2;->a(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    :try_end_0
    .catch Lcom/bugfender/sdk/p1; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/bugfender/sdk/o1;->b:Lcom/bugfender/sdk/g0;

    invoke-interface {p2, p1}, Lcom/bugfender/sdk/g0;->of(Ljava/lang/Object;)Lcom/bugfender/sdk/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/o1;->a(Ljava/lang/Throwable;)V

    throw p1
.end method
