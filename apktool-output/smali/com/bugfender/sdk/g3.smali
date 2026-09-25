.class public Lcom/bugfender/sdk/g3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;Lcom/bugfender/sdk/k1;ZZ)Lcom/bugfender/sdk/f3;
    .locals 1

    instance-of v0, p0, Landroid/widget/Button;

    if-eqz v0, :cond_0

    instance-of v0, p0, Landroid/widget/CompoundButton;

    if-nez v0, :cond_0

    new-instance p0, Lcom/bugfender/sdk/p;

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/p;-><init>(Lcom/bugfender/sdk/k1;ZZ)V

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/widget/SeekBar;

    if-eqz v0, :cond_1

    new-instance p0, Lcom/bugfender/sdk/e2;

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/e2;-><init>(Lcom/bugfender/sdk/k1;ZZ)V

    return-object p0

    :cond_1
    instance-of v0, p0, Landroid/widget/EditText;

    if-eqz v0, :cond_2

    new-instance p0, Lcom/bugfender/sdk/d0;

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/d0;-><init>(Lcom/bugfender/sdk/k1;ZZ)V

    return-object p0

    :cond_2
    instance-of v0, p0, Landroid/widget/Spinner;

    if-eqz v0, :cond_3

    new-instance p0, Lcom/bugfender/sdk/s2;

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/s2;-><init>(Lcom/bugfender/sdk/k1;ZZ)V

    return-object p0

    :cond_3
    instance-of p0, p0, Landroid/widget/CompoundButton;

    if-eqz p0, :cond_4

    new-instance p0, Lcom/bugfender/sdk/w2;

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/w2;-><init>(Lcom/bugfender/sdk/k1;ZZ)V

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method
