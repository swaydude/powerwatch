.class Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$AlphaSet;
.super Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;
.source "TimeCycleSplineSet.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AlphaSet"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 183
    invoke-direct {p0}, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet;-><init>()V

    return-void
.end method


# virtual methods
.method public setProperty(Landroid/view/View;FJ)Z
    .locals 0

    .line 186
    invoke-virtual {p0, p2, p3, p4}, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$AlphaSet;->get(FJ)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 187
    iget-boolean p1, p0, Landroidx/constraintlayout/motion/widget/TimeCycleSplineSet$AlphaSet;->mContinue:Z

    return p1
.end method
