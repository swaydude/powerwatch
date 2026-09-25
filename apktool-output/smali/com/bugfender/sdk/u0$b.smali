.class public final Lcom/bugfender/sdk/u0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:J

.field private g:Lcom/bugfender/sdk/e;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/bugfender/sdk/u0$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/bugfender/sdk/u0$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/u0$b;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/u0$b;->a:Ljava/util/UUID;

    return-object p0
.end method

.method static synthetic b(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/u0$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/u0$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/u0$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lcom/bugfender/sdk/u0$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/u0$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/bugfender/sdk/u0$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/bugfender/sdk/u0$b;->f:J

    return-wide v0
.end method

.method static synthetic g(Lcom/bugfender/sdk/u0$b;)Lcom/bugfender/sdk/e;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/u0$b;->g:Lcom/bugfender/sdk/e;

    return-object p0
.end method


# virtual methods
.method public a(J)Lcom/bugfender/sdk/u0$b;
    .locals 0

    iput-wide p1, p0, Lcom/bugfender/sdk/u0$b;->f:J

    return-object p0
.end method

.method public a(Lcom/bugfender/sdk/e;)Lcom/bugfender/sdk/u0$b;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/u0$b;->g:Lcom/bugfender/sdk/e;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/u0$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/util/UUID;)Lcom/bugfender/sdk/u0$b;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/u0$b;->a:Ljava/util/UUID;

    return-object p0
.end method

.method public a()Lcom/bugfender/sdk/u0;
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/u0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/bugfender/sdk/u0;-><init>(Lcom/bugfender/sdk/u0$b;Lcom/bugfender/sdk/u0$a;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/u0$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/u0$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/bugfender/sdk/u0$b;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/u0$b;->b:Ljava/lang/String;

    return-object p0
.end method
