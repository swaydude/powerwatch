.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;
.super Ljava/lang/Object;
.source "BarChartFragment.kt"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008%\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u00a9\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u001a\u0008\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0006\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0006\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0015\u00100\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u0006H\u00c6\u0003J\u000f\u00101\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003J\t\u00103\u001a\u00020\u000bH\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u000eH\u00c6\u0003J\u001b\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0006H\u00c6\u0003J\t\u00107\u001a\u00020\u0014H\u00c6\u0003J\u00ad\u0001\u00108\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00062\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u001a\u0008\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u00062\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00062\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001J\t\u00109\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010:\u001a\u00020\u000e2\u0008\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u00020\u0016H\u00d6\u0001J\t\u0010>\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001bR\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\u0017\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010&R\u0011\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010*\u00a8\u0006D"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;",
        "Landroid/os/Parcelable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BaseChartConfig;",
        "mode",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;",
        "barEntries",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;",
        "limitLines",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;",
        "yMinValue",
        "",
        "yMaxValue",
        "yLinesEnabled",
        "",
        "multipleColors",
        "headerValues",
        "Lkotlin/Pair;",
        "",
        "goalThreshold",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;",
        "barColors",
        "",
        "performAnimation",
        "daySubtitle",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;)V",
        "getBarColors",
        "()Ljava/util/List;",
        "getBarEntries",
        "getDaySubtitle",
        "()Ljava/lang/String;",
        "getGoalThreshold",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;",
        "getHeaderValues",
        "getLimitLines",
        "getMode",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;",
        "getMultipleColors",
        "()Z",
        "getPerformAnimation",
        "getYLinesEnabled",
        "getYMaxValue",
        "()F",
        "getYMinValue",
        "component1",
        "component10",
        "component11",
        "component12",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final barColors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final barEntries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;",
            ">;>;"
        }
    .end annotation
.end field

.field private final daySubtitle:Ljava/lang/String;

.field private final goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

.field private final headerValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final limitLines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;",
            ">;"
        }
    .end annotation
.end field

.field private final mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

.field private final multipleColors:Z

.field private final performAnimation:Z

.field private final yLinesEnabled:Z

.field private final yMaxValue:F

.field private final yMinValue:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig$Creator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xfff

    const/4 v14, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;",
            ">;>;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;",
            ">;FFZZ",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barEntries"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "limitLines"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerValues"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalThreshold"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barColors"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    .line 50
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    .line 51
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    .line 52
    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    .line 53
    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    .line 54
    iput-boolean p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    .line 55
    iput-boolean p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    .line 56
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->headerValues:Ljava/util/List;

    .line 57
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    .line 58
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    .line 62
    iput-boolean p11, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    .line 63
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 49
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 50
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    .line 51
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    move/from16 v4, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    const/4 v6, 0x0

    goto :goto_5

    :cond_5
    move/from16 v6, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    const/4 v9, 0x1

    if-eqz v8, :cond_6

    const/4 v8, 0x1

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    .line 56
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v10

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    .line 57
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x7

    const/16 v16, 0x0

    move-object/from16 p1, v11

    move/from16 p2, v12

    move/from16 p3, v13

    move/from16 p4, v14

    move/from16 p5, v15

    move-object/from16 p6, v16

    invoke-direct/range {p1 .. p6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x3

    new-array v12, v12, [Ljava/lang/Integer;

    const v13, 0x7f050087

    .line 59
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v7

    const v7, 0x7f0500de

    .line 60
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v12, v9

    const v7, 0x7f0500ec

    .line 61
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v13, 0x2

    aput-object v7, v12, v13

    .line 58
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_9

    :cond_9
    move-object/from16 v7, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    goto :goto_a

    :cond_a
    move/from16 v9, p11

    :goto_a
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    const/4 v0, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v0, p12

    :goto_b
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move/from16 p5, v4

    move/from16 p6, v5

    move/from16 p7, v6

    move/from16 p8, v8

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v7

    move/from16 p12, v9

    move-object/from16 p13, v0

    .line 48
    invoke-direct/range {p1 .. p13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v9

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-boolean v12, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v1, p12

    :goto_b
    move-object p1, v2

    move-object p2, v3

    move-object/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->copy(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    return-object v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    return v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final component9()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    return-object v0
.end method

.method public final copy(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;",
            ">;>;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;",
            ">;FFZZ",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Ljava/lang/String;",
            ")",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;"
        }
    .end annotation

    const-string v0, "mode"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barEntries"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "limitLines"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerValues"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalThreshold"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "barColors"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    move-object v1, v0

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;Ljava/util/List;Ljava/util/List;FFZZLjava/util/List;Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;Ljava/util/List;ZLjava/lang/String;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    iget-boolean v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getBarColors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    return-object v0
.end method

.method public final getBarEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;",
            ">;>;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    return-object v0
.end method

.method public final getDaySubtitle()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getGoalThreshold()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;
    .locals 1

    .line 57
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    return-object v0
.end method

.method public getHeaderValues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->headerValues:Ljava/util/List;

    return-object v0
.end method

.method public final getLimitLines()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    return-object v0
.end method

.method public final getMode()Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;
    .locals 1

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    return-object v0
.end method

.method public final getMultipleColors()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    return v0
.end method

.method public final getPerformAnimation()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    return v0
.end method

.method public final getYLinesEnabled()Z
    .locals 1

    .line 54
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    return v0
.end method

.method public final getYMaxValue()F
    .locals 1

    .line 53
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    return v0
.end method

.method public final getYMinValue()F
    .locals 1

    .line 52
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    if-nez v1, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BarChartConfig(mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", barEntries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", limitLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", yMinValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", yMaxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", yLinesEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", multipleColors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", headerValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->getHeaderValues()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", goalThreshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", barColors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", performAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", daySubtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->mode:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barEntries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;

    invoke-virtual {v2, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartEntryData;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->limitLines:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;

    invoke-virtual {v1, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/LimitLineData;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMinValue:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yMaxValue:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->yLinesEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->multipleColors:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->headerValues:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Serializable;

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->goalThreshold:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;

    invoke-virtual {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/GoalThreshold;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->barColors:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_4
    iget-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->performAnimation:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/BarChartConfig;->daySubtitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
