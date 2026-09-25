.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$bvA2s0KRGByBW8UcKXbpOe_xgWo;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->lambda$bvA2s0KRGByBW8UcKXbpOe_xgWo(Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    move-result-object p1

    return-object p1
.end method
