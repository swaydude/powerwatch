.class public Lcom/bugfender/sdk/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/u0$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/Long;

.field private g:Lcom/bugfender/sdk/e;


# direct methods
.method private constructor <init>(Lcom/bugfender/sdk/u0$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->a(Lcom/bugfender/sdk/u0$b;)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/u0;->a:Ljava/util/UUID;

    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->b(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "issue"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->b(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/bugfender/sdk/u0;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->c(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/u0;->c:Ljava/lang/String;

    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->d(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/u0;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->e(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/u0;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->f(Lcom/bugfender/sdk/u0$b;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/u0;->f:Ljava/lang/Long;

    invoke-static {p1}, Lcom/bugfender/sdk/u0$b;->g(Lcom/bugfender/sdk/u0$b;)Lcom/bugfender/sdk/e;

    move-result-object p1

    iput-object p1, p0, Lcom/bugfender/sdk/u0;->g:Lcom/bugfender/sdk/e;

    return-void
.end method

.method synthetic constructor <init>(Lcom/bugfender/sdk/u0$b;Lcom/bugfender/sdk/u0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/u0;-><init>(Lcom/bugfender/sdk/u0$b;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;JLcom/bugfender/sdk/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/u0;->a:Ljava/util/UUID;

    iput-object p2, p0, Lcom/bugfender/sdk/u0;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/bugfender/sdk/u0;->d:Ljava/lang/String;

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/bugfender/sdk/u0;->f:Ljava/lang/Long;

    iput-object p6, p0, Lcom/bugfender/sdk/u0;->g:Lcom/bugfender/sdk/e;

    return-void
.end method

.method public static a()Lcom/bugfender/sdk/u0$b;
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/u0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/u0$b;-><init>(Lcom/bugfender/sdk/u0$a;)V

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/bugfender/sdk/u0;->f:Ljava/lang/Long;

    return-void
.end method

.method public a(Lcom/bugfender/sdk/e;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/u0;->g:Lcom/bugfender/sdk/e;

    return-void
.end method

.method public b()Lcom/bugfender/sdk/e;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u0;->g:Lcom/bugfender/sdk/e;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u0;->f:Ljava/lang/Long;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/u0;->a:Ljava/util/UUID;

    return-object v0
.end method
