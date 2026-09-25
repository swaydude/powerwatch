.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$d7OfK7fN8JWoez0iqgR7zYF9x7o;

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

    check-cast p1, Lkotlin/Triple;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$d7OfK7fN8JWoez0iqgR7zYF9x7o(Lkotlin/Triple;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
