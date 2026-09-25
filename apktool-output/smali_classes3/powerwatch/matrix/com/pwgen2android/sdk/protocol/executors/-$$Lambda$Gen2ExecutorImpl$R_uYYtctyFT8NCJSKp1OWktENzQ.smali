.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ;

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

    check-cast p1, [B

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$R_uYYtctyFT8NCJSKp1OWktENzQ([B)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
