.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/BiFunction;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$YtGjbHGn9Q8ksoG0hnkQas6-WGo;

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

    check-cast p1, Lkotlin/Triple;

    check-cast p2, Lkotlin/Unit;

    invoke-static {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->lambda$YtGjbHGn9Q8ksoG0hnkQas6-WGo(Lkotlin/Triple;Lkotlin/Unit;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
