.class public Lcom/bugfender/sdk/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/z1$c;,
        Lcom/bugfender/sdk/z1$d;,
        Lcom/bugfender/sdk/z1$b;,
        Lcom/bugfender/sdk/z1$a;
    }
.end annotation


# instance fields
.field private a:Lcom/bugfender/sdk/z1$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/bugfender/sdk/z1$c;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/z1$c;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/bugfender/sdk/z1$d;

    invoke-direct {v0, p1}, Lcom/bugfender/sdk/z1$d;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object v0, p0, Lcom/bugfender/sdk/z1;->a:Lcom/bugfender/sdk/z1$a;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/z1;->a:Lcom/bugfender/sdk/z1$a;

    invoke-interface {v0}, Lcom/bugfender/sdk/z1$a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/z1;->a:Lcom/bugfender/sdk/z1$a;

    invoke-interface {v0}, Lcom/bugfender/sdk/z1$a;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/z1;->a:Lcom/bugfender/sdk/z1$a;

    invoke-interface {v0}, Lcom/bugfender/sdk/z1$a;->c()J

    move-result-wide v0

    return-wide v0
.end method
