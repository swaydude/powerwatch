.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$O_whdrKorqVxFBPl_fHJvpeJceY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$O_whdrKorqVxFBPl_fHJvpeJceY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$O_whdrKorqVxFBPl_fHJvpeJceY;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$O_whdrKorqVxFBPl_fHJvpeJceY;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$O_whdrKorqVxFBPl_fHJvpeJceY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/-$$Lambda$BaseChartPeriodsViewModel$O_whdrKorqVxFBPl_fHJvpeJceY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Calendar;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;->lambda$O_whdrKorqVxFBPl_fHJvpeJceY(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object p1

    return-object p1
.end method
