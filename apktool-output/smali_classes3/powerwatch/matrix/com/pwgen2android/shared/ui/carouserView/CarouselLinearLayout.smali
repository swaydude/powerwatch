.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;
.super Landroid/widget/LinearLayout;
.source "CarouselLinearLayout.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0014J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "(Landroid/content/Context;)V",
        "scale",
        "",
        "onDraw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "setScaleBoth",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private scale:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 11
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;->getBIG_SCALE()F

    move-result p1

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->scale:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 11
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;->getBIG_SCALE()F

    move-result p1

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->scale:F

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 26
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->getWidth()I

    move-result v0

    .line 27
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->getHeight()I

    move-result v1

    .line 28
    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->scale:F

    int-to-float v0, v0

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v0, v3

    int-to-float v1, v1

    div-float/2addr v1, v3

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Canvas;->scale(FFFF)V

    return-void
.end method

.method public final setScaleBoth(F)V
    .locals 0

    .line 18
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->scale:F

    .line 19
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;->invalidate()V

    return-void
.end method
