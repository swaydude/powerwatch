.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/github/mikephil/charting/charts/LineChart;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/github/mikephil/charting/charts/LineChart;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA;->f$0:Lcom/github/mikephil/charting/charts/LineChart;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA;->f$0:Lcom/github/mikephil/charting/charts/LineChart;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/-$$Lambda$CubicLineChartFragment$rEiA4rGSGxcReeMhWi9snOLFPAA;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartFragment;->lambda$rEiA4rGSGxcReeMhWi9snOLFPAA(Lcom/github/mikephil/charting/charts/LineChart;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicLineChartConfig;)V

    return-void
.end method
