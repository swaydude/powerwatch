.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source "LockableViewPager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001a\u00a8\u0006#"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;",
        "Landroidx/viewpager/widget/ViewPager;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "displayWidth",
        "",
        "pressedX",
        "",
        "pressedY",
        "swipeDetected",
        "Lkotlin/Function1;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection;",
        "",
        "getSwipeDetected",
        "()Lkotlin/jvm/functions/Function1;",
        "setSwipeDetected",
        "(Lkotlin/jvm/functions/Function1;)V",
        "swipeLocked",
        "",
        "getSwipeLocked",
        "()Z",
        "setSwipeLocked",
        "(Z)V",
        "canScrollHorizontally",
        "direction",
        "detectSwipe",
        "event",
        "Landroid/view/MotionEvent;",
        "onInterceptTouchEvent",
        "onTouchEvent",
        "shouldDetectSwipe",
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
.field private final displayWidth:I

.field private pressedX:F

.field private pressedY:F

.field private swipeDetected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private swipeLocked:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0, p1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 30
    new-instance p1, Landroid/util/DisplayMetrics;

    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 31
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 32
    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->displayWidth:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    new-instance p1, Landroid/util/DisplayMetrics;

    invoke-direct {p1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 31
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p2

    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 32
    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->displayWidth:I

    return-void
.end method

.method private final detectSwipe(Landroid/view/MotionEvent;)V
    .locals 3

    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 55
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->pressedX:F

    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->pressedY:F

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->shouldDetectSwipe(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 59
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->pressedX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    const-string v2, "fragment_invoke"

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 61
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 62
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeDetected:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection$SwipeLeft;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection$SwipeLeft;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 63
    :cond_2
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->pressedX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    cmpg-float p1, v0, p1

    if-gez p1, :cond_4

    .line 65
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 66
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeDetected:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection$SwipeRight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection$SwipeRight;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    return-void
.end method

.method private final shouldDetectSwipe(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 72
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->pressedX:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->pressedY:F

    sub-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "swipe_details: deltaX - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", deltaY - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    float-to-double v0, v0

    .line 75
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->getWidth()I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x3fc3333333333333L    # 0.15

    mul-double v2, v2, v4

    cmpl-double v4, v0, v2

    if-lez v4, :cond_0

    float-to-double v2, p1

    const-wide v4, 0x3ffb333333333333L    # 1.7

    mul-double v2, v2, v4

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public canScrollHorizontally(I)Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeLocked:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getSwipeDetected()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeDetected:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSwipeLocked()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeLocked:Z

    return v0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->detectSwipe(Landroid/view/MotionEvent;)V

    .line 46
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeLocked:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->detectSwipe(Landroid/view/MotionEvent;)V

    .line 41
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeLocked:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final setSwipeDetected(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/SwipeDirection;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeDetected:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setSwipeLocked(Z)V
    .locals 0

    .line 25
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;->swipeLocked:Z

    return-void
.end method
