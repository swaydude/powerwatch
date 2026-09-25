.class public final Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;
.super Landroid/widget/LinearLayout;
.source "OverlayView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0014R\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "myWidth",
        "",
        "getMyWidth",
        "()F",
        "setMyWidth",
        "(F)V",
        "onMeasure",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
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
.field private myWidth:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public final getMyWidth()F
    .locals 1

    .line 123
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;->myWidth:F

    return v0
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 126
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    const/4 p1, 0x0

    .line 128
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type powerwatch.matrix.com.pwgen2android.pair.camera.CustomTextView"

    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomTextView;

    .line 129
    iget p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;->myWidth:F

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomTextView;->setMyWidth(F)V

    .line 131
    iget p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;->myWidth:F

    float-to-int p1, p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setMyWidth(F)V
    .locals 0

    .line 123
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/CustomLinear;->myWidth:F

    return-void
.end method
