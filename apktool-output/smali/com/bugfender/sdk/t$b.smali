.class public Lcom/bugfender/sdk/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/Throwable;

.field private b:Ljava/lang/Thread;

.field private c:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/t$b;)Ljava/lang/Thread;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/t$b;->b:Ljava/lang/Thread;

    return-object p0
.end method

.method static synthetic b(Lcom/bugfender/sdk/t$b;)Ljava/lang/Throwable;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/t$b;->a:Ljava/lang/Throwable;

    return-object p0
.end method

.method static synthetic c(Lcom/bugfender/sdk/t$b;)Ljava/util/Date;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/t$b;->c:Ljava/util/Date;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Thread;)Lcom/bugfender/sdk/t$b;
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/t$b;->b:Ljava/lang/Thread;

    return-object p0
.end method

.method public a(Ljava/lang/Throwable;)Lcom/bugfender/sdk/t$b;
    .locals 1

    const-string v0, "throwable == null"

    invoke-static {p1, v0}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    iput-object p1, p0, Lcom/bugfender/sdk/t$b;->a:Ljava/lang/Throwable;

    return-object p0
.end method

.method public a(Ljava/util/Date;)Lcom/bugfender/sdk/t$b;
    .locals 1

    const-string v0, "date == null"

    invoke-static {p1, v0}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    iput-object p1, p0, Lcom/bugfender/sdk/t$b;->c:Ljava/util/Date;

    return-object p0
.end method

.method public a()Lcom/bugfender/sdk/t;
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/bugfender/sdk/t;-><init>(Lcom/bugfender/sdk/t$b;Lcom/bugfender/sdk/t$a;)V

    return-object v0
.end method
