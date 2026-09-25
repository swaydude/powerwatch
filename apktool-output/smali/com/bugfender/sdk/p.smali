.class public Lcom/bugfender/sdk/p;
.super Lcom/bugfender/sdk/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/p$b;
    }
.end annotation


# instance fields
.field private e:Landroid/view/View;

.field private f:Lcom/bugfender/sdk/p$b;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/k1;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/n;-><init>(Lcom/bugfender/sdk/k1;ZZ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/p;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-object v1, p0, Lcom/bugfender/sdk/p;->e:Landroid/view/View;

    iget-object v0, p0, Lcom/bugfender/sdk/p;->f:Lcom/bugfender/sdk/p$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bugfender/sdk/p$b;->a()V

    iput-object v1, p0, Lcom/bugfender/sdk/p;->f:Lcom/bugfender/sdk/p$b;

    :cond_0
    invoke-super {p0}, Lcom/bugfender/sdk/n;->a()V

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bugfender/sdk/p;->e:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/bugfender/sdk/p$b;

    invoke-static {p1}, Lcom/bugfender/sdk/c1;->b(Landroid/view/View;)Landroid/view/View$OnClickListener;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/bugfender/sdk/p$b;-><init>(Lcom/bugfender/sdk/p;Landroid/view/View$OnClickListener;Lcom/bugfender/sdk/p$a;)V

    iput-object v0, p0, Lcom/bugfender/sdk/p;->f:Lcom/bugfender/sdk/p$b;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
