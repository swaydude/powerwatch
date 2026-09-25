.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;
.super Ljava/lang/Object;
.source "RestingMonthPeriodRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JT\u0010\u0005\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \t*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007 \t*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0008 \t*\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepository;",
        "restingHourPeriodRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;)V",
        "all",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;",
        "kotlin.jvm.PlatformType",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "fromCache",
        "",
        "mapToMonth",
        "hours",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
        "Companion",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final restingHourPeriodRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl$Companion;

    .line 26
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepository;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;)V
    .locals 1

    const-string v0, "restingHourPeriodRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;->restingHourPeriodRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

    return-void
.end method

.method private static final all$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;->mapToMonth(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$6TQI4lsj55U9HdvHP_PqS8EBoRg(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;->all$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final mapToMonth(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingHourPeriod;",
            ">;)",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;",
            ">;"
        }
    .end annotation

    .line 19
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingDayPeriodFormatterImpl;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingDayPeriodFormatterImpl;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingDayPeriodFormatterImpl;->format()Ljava/util/List;

    move-result-object p1

    .line 20
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingWeekPeriodFormatterImpl;->format()Ljava/util/List;

    move-result-object p1

    .line 21
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingMonthPeriodFormatterImpl;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingMonthPeriodFormatterImpl;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingMonthPeriodFormatterImpl;->format()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingMonthPeriod;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;->restingHourPeriodRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;

    invoke-interface {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/hour/RestingHourPeriodRepository;->all(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Z)Lio/reactivex/Observable;

    move-result-object p1

    .line 16
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/-$$Lambda$RestingMonthPeriodRepositoryImpl$6TQI4lsj55U9HdvHP_PqS8EBoRg;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/-$$Lambda$RestingMonthPeriodRepositoryImpl$6TQI4lsj55U9HdvHP_PqS8EBoRg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityPeriods/month/RestingMonthPeriodRepositoryImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
