.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI;

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

    check-cast p1, Lkotlin/Pair;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;->lambda$VwFZ82i819DsOcuvbVzQUpzZIgI(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    move-result-object p1

    return-object p1
.end method
