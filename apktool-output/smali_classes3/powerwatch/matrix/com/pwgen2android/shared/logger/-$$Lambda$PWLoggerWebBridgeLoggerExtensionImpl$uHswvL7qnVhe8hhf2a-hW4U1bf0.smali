.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$uHswvL7qnVhe8hhf2a-hW4U1bf0;

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

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->lambda$uHswvL7qnVhe8hhf2a-hW4U1bf0(Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;)Z

    move-result p1

    return p1
.end method
