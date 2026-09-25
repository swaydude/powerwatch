.class Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$ScaleYset;
.super Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;
.source "TimeCycleSplineSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ScaleYset"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 228
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;-><init>()V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;FJ)Z
    .locals 0

    .line 231
    invoke-virtual {p0, p2, p3, p4}, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$ScaleYset;->get(FJ)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    .line 232
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$ScaleYset;->mContinue:Z

    return p1
.end method
