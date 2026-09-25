.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$SyncProcessExecutor$grX2mXX7UHeKh7REQ8Kq8Ubbwkw;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/SyncProcessExecutor;->lambda$grX2mXX7UHeKh7REQ8Kq8Ubbwkw(Lkotlin/Triple;)Z

    move-result p1

    return p1
.end method
