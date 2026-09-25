.class public Lcom/bugfender/sdk/y$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/bugfender/sdk/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    sget-object p1, Lcom/bugfender/sdk/y;->d:Lcom/bugfender/sdk/y;

    :cond_0
    invoke-virtual {p1}, Lcom/bugfender/sdk/y;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/bugfender/sdk/y$b;->a:Z

    invoke-virtual {p1}, Lcom/bugfender/sdk/y;->a()I

    move-result v0

    iput v0, p0, Lcom/bugfender/sdk/y$b;->c:I

    invoke-virtual {p1}, Lcom/bugfender/sdk/y;->b()Z

    move-result p1

    iput-boolean p1, p0, Lcom/bugfender/sdk/y$b;->b:Z

    return-void
.end method


# virtual methods
.method public a(I)Lcom/bugfender/sdk/y$b;
    .locals 0

    iput p1, p0, Lcom/bugfender/sdk/y$b;->c:I

    return-object p0
.end method

.method public a(Z)Lcom/bugfender/sdk/y$b;
    .locals 0

    iput-boolean p1, p0, Lcom/bugfender/sdk/y$b;->a:Z

    return-object p0
.end method

.method public a()Lcom/bugfender/sdk/y;
    .locals 5

    new-instance v0, Lcom/bugfender/sdk/y;

    iget-boolean v1, p0, Lcom/bugfender/sdk/y$b;->a:Z

    iget-boolean v2, p0, Lcom/bugfender/sdk/y$b;->b:Z

    iget v3, p0, Lcom/bugfender/sdk/y$b;->c:I

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/bugfender/sdk/y;-><init>(ZZILcom/bugfender/sdk/y$a;)V

    return-object v0
.end method

.method public b(Z)Lcom/bugfender/sdk/y$b;
    .locals 0

    iput-boolean p1, p0, Lcom/bugfender/sdk/y$b;->b:Z

    return-object p0
.end method
