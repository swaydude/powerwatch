.class Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$1;
.super Ljava/lang/Object;
.source "AmOtaService.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->amOtaStart(Ljava/io/InputStream;Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

.field final synthetic val$inputStream:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;Ljava/io/InputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            "this$0",
            "val$inputStream"
        }
    .end annotation

    .line 365
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$1;->val$inputStream:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-wide/16 v0, 0x7d0

    .line 368
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 370
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 372
    :goto_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$1;->val$inputStream:Ljava/io/InputStream;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->access$000(Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;Ljava/io/InputStream;)V

    return-void
.end method
