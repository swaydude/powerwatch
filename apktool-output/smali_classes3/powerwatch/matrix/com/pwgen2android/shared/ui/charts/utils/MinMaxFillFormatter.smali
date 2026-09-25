.class public Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;
.super Lcom/github/mikephil/charting/formatter/DefaultFillFormatter;
.source "MinMaxFillFormatter.java"


# instance fields
.field public final aboveLineChartColor:I

.field public final max:F

.field public final min:F


# direct methods
.method public constructor <init>(FFI)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "max",
            "min",
            "aboveLineChartColor"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Lcom/github/mikephil/charting/formatter/DefaultFillFormatter;-><init>()V

    .line 12
    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->max:F

    .line 13
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->min:F

    .line 14
    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/utils/MinMaxFillFormatter;->aboveLineChartColor:I

    return-void
.end method
