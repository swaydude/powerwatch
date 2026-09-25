.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/sync/-$$Lambda$WatchSynchronizerImpl$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/WatchSynchronizerImpl;->lambda$2Nu8qM4GDvfv_1v-9Ebw2ynfVUE(Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncInternalResult;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
