.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/-$$Lambda$CloudSynchronizerImpl$RRnhu1-mYHLOGt1zKEWbhuUZeTg;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizerImpl;->lambda$RRnhu1-mYHLOGt1zKEWbhuUZeTg(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;)Z

    move-result p1

    return p1
.end method
