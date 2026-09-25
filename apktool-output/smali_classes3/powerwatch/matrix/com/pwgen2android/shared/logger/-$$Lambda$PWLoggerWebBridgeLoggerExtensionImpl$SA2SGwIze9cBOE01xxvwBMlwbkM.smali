.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$SA2SGwIze9cBOE01xxvwBMlwbkM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$SA2SGwIze9cBOE01xxvwBMlwbkM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/-$$Lambda$PWLoggerWebBridgeLoggerExtensionImpl$SA2SGwIze9cBOE01xxvwBMlwbkM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;->lambda$SA2SGwIze9cBOE01xxvwBMlwbkM(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtensionImpl;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    move-result-object p1

    return-object p1
.end method
