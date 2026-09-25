.class public final enum Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;
.super Ljava/lang/Enum;
.source "ChartFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;",
        "",
        "(Ljava/lang/String;I)V",
        "DAY",
        "WEEK",
        "MONTH",
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
.field private static final synthetic $VALUES:[Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

.field public static final enum DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

.field public static final enum MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

.field public static final enum WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;


# direct methods
.method private static final synthetic $values()[Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const-string v1, "DAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->DAY:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const-string v1, "WEEK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->WEEK:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    const-string v1, "MONTH"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->MONTH:Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->$values()[Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 13
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    return-object p0
.end method

.method public static values()[Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;
    .locals 2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;->$VALUES:[Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    .line 13
    check-cast v0, [Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartPeriodMode;

    return-object v0
.end method
