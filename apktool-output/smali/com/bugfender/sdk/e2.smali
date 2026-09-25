.class public Lcom/bugfender/sdk/e2;
.super Lcom/bugfender/sdk/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/e2$a;
    }
.end annotation


# instance fields
.field private e:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/k1;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/n;-><init>(Lcom/bugfender/sdk/k1;ZZ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/e2;->e:Landroid/view/View;

    check-cast v0, Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iput-object v1, p0, Lcom/bugfender/sdk/e2;->e:Landroid/view/View;

    invoke-super {p0}, Lcom/bugfender/sdk/n;->a()V

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bugfender/sdk/e2;->e:Landroid/view/View;

    new-instance v0, Lcom/bugfender/sdk/e2$a;

    invoke-static {p1}, Lcom/bugfender/sdk/c1;->d(Landroid/view/View;)Landroid/widget/SeekBar$OnSeekBarChangeListener;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/bugfender/sdk/e2$a;-><init>(Lcom/bugfender/sdk/e2;Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    check-cast p1, Landroid/widget/SeekBar;

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method
