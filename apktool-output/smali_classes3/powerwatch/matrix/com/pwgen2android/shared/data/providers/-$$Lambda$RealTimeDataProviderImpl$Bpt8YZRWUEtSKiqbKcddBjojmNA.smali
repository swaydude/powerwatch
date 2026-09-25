.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    check-cast p2, Ljava/lang/Long;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->lambda$Bpt8YZRWUEtSKiqbKcddBjojmNA(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p1

    return-object p1
.end method
