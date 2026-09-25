.class public final Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;
.super Landroid/widget/RelativeLayout;
.source "OverlayView.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0008\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J0\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0014J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0010R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;",
        "Landroid/widget/RelativeLayout;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "radius",
        "",
        "rect",
        "Landroid/graphics/Rect;",
        "createWindowFrame",
        "",
        "dispatchDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "isInEditMode",
        "",
        "onLayout",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "shouldDecode",
        "resultRect",
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
.field private bitmap:Landroid/graphics/Bitmap;

.field private radius:F

.field private rect:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final createWindowFrame()V
    .locals 11

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->bitmap:Landroid/graphics/Bitmap;

    .line 45
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 47
    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 49
    new-instance v2, Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    const-string v3, "#000000"

    .line 50
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/16 v3, 0x28

    .line 51
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    const/4 v1, 0x0

    .line 55
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 56
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    check-cast v1, Landroid/graphics/Xfermode;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getWidth()I

    move-result v1

    const/4 v3, 0x2

    div-int/2addr v1, v3

    int-to-float v1, v1

    .line 58
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getHeight()I

    move-result v5

    div-int/2addr v5, v3

    int-to-float v5, v5

    .line 59
    iget v6, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->radius:F

    .line 60
    invoke-virtual {v0, v1, v5, v6, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 63
    new-instance v2, Landroid/graphics/Rect;

    sub-float v7, v1, v6

    float-to-int v7, v7

    sub-float v8, v5, v6

    float-to-int v8, v8

    add-float v9, v1, v6

    float-to-int v9, v9

    add-float v10, v5, v6

    float-to-int v10, v10

    invoke-direct {v2, v7, v8, v9, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->rect:Landroid/graphics/Rect;

    const/4 v7, 0x0

    if-nez v2, :cond_0

    move-object v2, v7

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    const-string v8, "Drawing: "

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v8, "rect_issue"

    invoke-static {v8, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    const/high16 v8, 0x41200000    # 10.0f

    .line 69
    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const v8, -0x777778

    .line 70
    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 71
    sget-object v8, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 72
    new-instance v8, Landroid/graphics/DashPathEffect;

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v8, v3, v9}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    check-cast v8, Landroid/graphics/PathEffect;

    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 73
    invoke-virtual {v0, v1, v5, v6, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 75
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v4, v4, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void

    :array_0
    .array-data 4
        0x42700000    # 60.0f
        0x41a00000    # 20.0f
    .end array-data
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->bitmap:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 31
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->createWindowFrame()V

    .line 33
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->bitmap:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public isInEditMode()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 90
    invoke-super/range {p0 .. p5}, Landroid/widget/RelativeLayout;->onLayout(ZIIII)V

    const/4 p1, 0x0

    .line 91
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    .line 79
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 80
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getMeasuredWidth()I

    move-result p1

    int-to-float p1, p1

    const/high16 p2, 0x40800000    # 4.0f

    div-float/2addr p1, p2

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->radius:F

    .line 81
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->setMeasuredDimension(II)V

    return-void
.end method

.method public final shouldDecode(Landroid/graphics/Rect;)Z
    .locals 3

    const-string v0, "resultRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "My: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->rect:Landroid/graphics/Rect;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", compare: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rect_issue"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/camera/OverlayView;->rect:Landroid/graphics/Rect;

    if-eqz v0, :cond_2

    if-nez v0, :cond_1

    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return p1
.end method
