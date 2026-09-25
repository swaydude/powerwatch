.class Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$PathRotate;
.super Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;
.source "TimeCycleSplineSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "PathRotate"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 211
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;-><init>()V

    return-void
.end method


# virtual methods
.method public setPathRotate(Landroid/view/View;FJDD)Z
    .locals 0

    .line 217
    invoke-virtual {p0, p2, p3, p4}, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$PathRotate;->get(FJ)F

    move-result p2

    invoke-static {p7, p8, p5, p6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p3

    double-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    .line 218
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$PathRotate;->mContinue:Z

    return p1
.end method

.method public setProperty(Landroid/view/View;FJ)Z
    .locals 0

    .line 214
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$PathRotate;->mContinue:Z

    return p1
.end method
