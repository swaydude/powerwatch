.class Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$2;
.super Ljava/lang/Object;
.source "AmOtaService.java"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->registerToOTA(Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Consumer<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 396
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "bytes"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 396
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$2;->accept([B)V

    return-void
.end method

.method public accept([B)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bytes"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 399
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->otaCmdResponse([B)V

    return-void
.end method
