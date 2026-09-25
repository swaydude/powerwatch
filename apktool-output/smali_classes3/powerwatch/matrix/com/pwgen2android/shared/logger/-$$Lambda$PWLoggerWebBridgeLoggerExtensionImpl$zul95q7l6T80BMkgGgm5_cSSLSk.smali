.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$zul95q7l6T80BMkgGgm5_cSSLSk;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->lambda$zul95q7l6T80BMkgGgm5_cSSLSk(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;

    move-result-object p1

    return-object p1
.end method
