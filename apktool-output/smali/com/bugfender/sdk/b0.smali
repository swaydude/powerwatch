.class public Lcom/bugfender/sdk/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/b0$a;,
        Lcom/bugfender/sdk/b0$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/bugfender/sdk/b0$b;

.field private c:Lcom/bugfender/sdk/b0$a;

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/bugfender/sdk/b0$a;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/b0;->c:Lcom/bugfender/sdk/b0$a;

    return-object v0
.end method

.method public a(Lcom/bugfender/sdk/b0$a;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/b0;->c:Lcom/bugfender/sdk/b0$a;

    return-void
.end method

.method public a(Lcom/bugfender/sdk/b0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/b0;->b:Lcom/bugfender/sdk/b0$b;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bugfender/sdk/b0;->d:Z

    return-void
.end method

.method public b()Lcom/bugfender/sdk/b0$b;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/b0;->b:Lcom/bugfender/sdk/b0$b;

    return-object v0
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/bugfender/sdk/b0;->a:Z

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bugfender/sdk/b0;->d:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bugfender/sdk/b0;->a:Z

    return v0
.end method
