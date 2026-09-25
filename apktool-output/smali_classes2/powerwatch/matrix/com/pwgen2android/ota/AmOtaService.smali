.class public Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;
.super Ljava/lang/Object;
.source "AmOtaService.java"


# static fields
.field public static final CMD_RESPONSE_TIMEOUT:Ljava/lang/String; = "command_response_timeout"

.field public static final RESET_CMD_FAILED:Ljava/lang/String; = "reset_command_failed"

.field public static final SEND_HEADER_FAILED:Ljava/lang/String; = "send_header_failed"

.field public static final SEND_PKT_FAILED:Ljava/lang/String; = "command_send_failed"

.field private static final TAG:Ljava/lang/String; = "AmOtaService"

.field private static mPauseOta:Z = false


# instance fields
.field private final AMOTA_CMD_SIZE_IN_PKT:I

.field private final AMOTA_CRC_SIZE_IN_PKT:I

.field private AMOTA_FW_PACKET_SIZE:I

.field private final AMOTA_HEADER_SIZE_IN_PKT:I

.field private final AMOTA_LENGTH_SIZE_IN_PKT:I

.field private final MAXIMUM_APP_PAYLOAD:I

.field private cmdResponseSemaphore:Ljava/util/concurrent/Semaphore;

.field private deviceId:Ljava/lang/String;

.field private disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

.field private mFileOffset:I

.field private mFileSize:I

.field private mStopOta:Z

.field private otaCommunicator:Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseSemaphore:Ljava/util/concurrent/Semaphore;

    const/16 v0, 0x200

    .line 25
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->AMOTA_FW_PACKET_SIZE:I

    const/16 v0, 0x14

    .line 26
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->MAXIMUM_APP_PAYLOAD:I

    const/4 v0, 0x2

    .line 27
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->AMOTA_LENGTH_SIZE_IN_PKT:I

    const/4 v0, 0x1

    .line 28
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->AMOTA_CMD_SIZE_IN_PKT:I

    const/4 v0, 0x4

    .line 29
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->AMOTA_CRC_SIZE_IN_PKT:I

    const/4 v0, 0x3

    .line 30
    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->AMOTA_HEADER_SIZE_IN_PKT:I

    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mStopOta:Z

    return-void
.end method

.method static synthetic access$000(Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;Ljava/io/InputStream;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->startOtaUpdate(Ljava/io/InputStream;)V

    return-void
.end method

.method private amOtaByte2Cmd(I)Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "cmd"
        }
    .end annotation

    and-int/lit16 p1, p1, 0xff

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 98
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-object p1

    .line 95
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_RESET:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-object p1

    .line 93
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_VERIFY:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-object p1

    .line 91
    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_DATA:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-object p1

    .line 89
    :cond_3
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_HEADER:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    return-object p1
.end method

.method private amOtaCmd2Byte(Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;)B
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "cmd"
        }
    .end annotation

    .line 70
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$4;->$SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand:[I

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v1, 0x5

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0

    :cond_1
    return v1

    :cond_2
    return v0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private cmdResponseArrived()V
    .locals 1

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method

.method private getDisposable()Lio/reactivex/disposables/CompositeDisposable;
    .locals 1

    .line 384
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    if-nez v0, :cond_0

    .line 385
    new-instance v0, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v0}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 387
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    return-object v0
.end method

.method private getStatusString([B)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "response"
        }
    .end annotation

    .line 288
    array-length v0, p1

    const/4 v1, 0x3

    if-lt v0, v1, :cond_6

    .line 289
    aget-byte p1, p1, v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 290
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->AMOTA_STATUS_SUCCESS:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_0

    const-string p1, "AMOTA_STATUS_SUCCESS"

    return-object p1

    .line 292
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->AMOTA_STATUS_CRC_ERROR:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_1

    const-string p1, "AMOTA_STATUS_CRC_ERROR"

    return-object p1

    .line 294
    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->AMOTA_STATUS_INVALID_HEADER_INFO:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_2

    const-string p1, "AMOTA_STATUS_INVALID_HEADER_INFO"

    return-object p1

    .line 296
    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->AMOTA_STATUS_INVALID_PKT_LENGTH:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_3

    const-string p1, "AMOTA_STATUS_INVALID_PKT_LENGTH"

    return-object p1

    .line 298
    :cond_3
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->AMOTA_STATUS_INSUFFICIENT_BUFFER:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_4

    const-string p1, "AMOTA_STATUS_INSUFFICIENT_BUFFER"

    return-object p1

    .line 300
    :cond_4
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->AMOTA_STATUS_UNKNOWN_ERROR:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->ordinal()I

    move-result v0

    const-string v1, "AMOTA_STATUS_UNKNOWN_ERROR"

    if-ne p1, v0, :cond_5

    :cond_5
    return-object v1

    :cond_6
    const-string p1, ""

    return-object p1
.end method

.method private sendFwData(Ljava/io/InputStream;)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mFsInput"
        }
    .end annotation

    .line 159
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileSize:I

    .line 161
    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileOffset:I

    .line 163
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "file size = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileSize:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, -0x1

    :cond_0
    if-ge v1, v0, :cond_6

    .line 166
    :try_start_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sentFwDataPacket(Ljava/io/InputStream;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    .line 168
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const/4 v3, 0x0

    if-gez v2, :cond_1

    .line 171
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "sentFwDataPacket failed"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_1
    const-wide/16 v4, 0x1f40

    .line 174
    invoke-direct {p0, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->waitCmdResponse(J)Z

    move-result v4

    if-nez v4, :cond_3

    .line 175
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "waitCmdResponse timeout"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 176
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz p1, :cond_2

    const-string v0, "command_response_timeout"

    .line 177
    invoke-interface {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->otaFailed(Ljava/lang/String;)V

    :cond_2
    return v3

    :cond_3
    add-int/2addr v1, v2

    .line 182
    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz v4, :cond_4

    mul-int/lit8 v5, v1, 0x64

    .line 183
    div-int/2addr v5, v0

    invoke-interface {v4, v5}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->progressUpdate(I)V

    .line 185
    :cond_4
    :goto_1
    sget-boolean v4, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mPauseOta:Z

    if-eqz v4, :cond_5

    iget-boolean v4, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mStopOta:Z

    if-nez v4, :cond_5

    goto :goto_1

    .line 186
    :cond_5
    iget-boolean v4, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mStopOta:Z

    if-eqz v4, :cond_0

    return v3

    .line 191
    :cond_6
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "send firmware data complete"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1
.end method

.method private sendFwHeader(Ljava/io/InputStream;)Z
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mFsInput"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x30

    new-array v1, v0, [B

    .line 114
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    const/4 v2, 0x0

    if-ge p1, v0, :cond_0

    .line 116
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "invalid packed firmware length"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_0
    const/16 p1, 0xb

    .line 120
    aget-byte p1, v1, p1

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x18

    const/16 v3, 0xa

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    add-int/2addr p1, v3

    const/16 v3, 0x9

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0x8

    shl-int/2addr v3, v4

    add-int/2addr p1, v3

    aget-byte v3, v1, v4

    and-int/lit16 v3, v3, 0xff

    add-int/2addr p1, v3

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileSize:I

    .line 123
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mFileSize = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileSize:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "send fw header "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->formatHex2String([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_HEADER:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    invoke-direct {p0, p1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendOtaCmd(Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;[BI)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/16 v0, 0x3e80

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->waitCmdResponse(J)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method private sendOneFrame([B)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 102
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mStopOta:Z

    if-eqz v0, :cond_0

    .line 103
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v1, "OTA stopped due to application control"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->otaCommunicator:Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->deviceId:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;->sendMessage(Ljava/lang/String;[B)V

    const/4 p1, 0x1

    return p1
.end method

.method private sendOtaCmd(Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;[BI)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "cmd",
            "data",
            "len"
        }
    .end annotation

    .line 444
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->amOtaCmd2Byte(Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;)B

    move-result p1

    add-int/lit8 v0, p3, 0x3

    add-int/lit8 v1, v0, 0x4

    .line 447
    new-array v2, v1, [B

    add-int/lit8 v3, p3, 0x4

    int-to-byte v4, v3

    const/4 v5, 0x0

    .line 450
    aput-byte v4, v2, v5

    shr-int/lit8 v3, v3, 0x8

    int-to-byte v3, v3

    const/4 v4, 0x1

    .line 451
    aput-byte v3, v2, v4

    const/4 v3, 0x2

    .line 452
    aput-byte p1, v2, v3

    const/4 p1, 0x3

    if-eqz p3, :cond_0

    .line 456
    invoke-static {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/ota/CrcCalculator;->calcCrc32(I[B)I

    move-result v3

    .line 458
    invoke-static {p2, v5, v2, p1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    int-to-byte p2, v3

    .line 463
    aput-byte p2, v2, v0

    add-int/lit8 p2, v0, 0x1

    shr-int/lit8 p3, v3, 0x8

    int-to-byte p3, p3

    .line 464
    aput-byte p3, v2, p2

    add-int/lit8 p2, v0, 0x2

    shr-int/lit8 p3, v3, 0x10

    int-to-byte p3, p3

    .line 465
    aput-byte p3, v2, p2

    add-int/2addr v0, p1

    shr-int/lit8 p1, v3, 0x18

    int-to-byte p1, p1

    .line 466
    aput-byte p1, v2, v0

    .line 468
    invoke-direct {p0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendPacket([BI)Z

    move-result p1

    if-eqz p1, :cond_1

    return v4

    .line 471
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string p2, "sendPacket failed"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 472
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz p1, :cond_2

    const-string p2, "command_send_failed"

    .line 473
    invoke-interface {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->otaFailed(Ljava/lang/String;)V

    :cond_2
    return v5
.end method

.method private sendPacket([BI)Z
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "data",
            "len"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    sub-int v2, p2, v1

    const/16 v3, 0x14

    if-le v2, v3, :cond_0

    const/16 v2, 0x14

    .line 428
    :cond_0
    new-array v3, v2, [B

    .line 429
    invoke-static {p1, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 431
    :try_start_0
    invoke-direct {p0, v3}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendOneFrame([B)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_1

    return v0

    :catch_0
    move-exception v3

    .line 435
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V

    :cond_1
    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private sendResetCmd()Z
    .locals 3

    .line 206
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v1, "send fw reset cmd"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_RESET:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendOtaCmd(Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x36b0

    .line 208
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->waitCmdResponse(J)Z

    move-result v0

    return v0

    :cond_0
    return v2
.end method

.method private sendVerifyCmd()Z
    .locals 3

    .line 197
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v1, "send fw verify cmd"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_VERIFY:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendOtaCmd(Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x1388

    .line 199
    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->waitCmdResponse(J)Z

    move-result v0

    return v0

    :cond_0
    return v2
.end method

.method private sentFwDataPacket(Ljava/io/InputStream;)I
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mFsInput"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 131
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->AMOTA_FW_PACKET_SIZE:I

    .line 132
    new-array v1, v0, [B

    .line 133
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    const/4 v2, -0x1

    if-gtz p1, :cond_0

    .line 135
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "no data read from mFsInput"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 138
    :cond_0
    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->AMOTA_FW_PACKET_SIZE:I

    if-ge p1, v3, :cond_1

    move v0, p1

    .line 142
    :cond_1
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_FW_DATA:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    invoke-direct {p0, v3, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendOtaCmd(Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;[BI)Z

    move-result v0

    if-nez v0, :cond_2

    .line 143
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "send fw data error"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_2
    return p1
.end method

.method private startOtaUpdate(Ljava/io/InputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mFsInput"
        }
    .end annotation

    .line 218
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v0

    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileSize:I

    if-nez v0, :cond_0

    .line 220
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 221
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open file error, file size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 225
    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendFwHeader(Ljava/io/InputStream;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 226
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v1, "send FW header failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz v0, :cond_1

    const-string v1, "send_header_failed"

    .line 228
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->otaFailed(Ljava/lang/String;)V

    .line 230
    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    .line 236
    :cond_2
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileOffset:I

    if-lez v0, :cond_3

    .line 237
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "set file offset "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileOffset:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileOffset:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ljava/io/InputStream;->skip(J)J

    .line 242
    :cond_3
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendFwData(Ljava/io/InputStream;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    .line 243
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v2, "send FW Data failed"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 244
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 245
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz p1, :cond_4

    .line 246
    invoke-interface {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->sendFwDataState(Z)V

    :cond_4
    return-void

    .line 250
    :cond_5
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    const/4 v2, 0x1

    if-eqz v0, :cond_6

    .line 251
    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->sendFwDataState(Z)V

    .line 254
    :cond_6
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendVerifyCmd()Z

    move-result v0

    if-nez v0, :cond_8

    .line 255
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v2, "send FW verify cmd failed"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 257
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz p1, :cond_7

    .line 258
    invoke-interface {p1, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->sendVerifyState(Z)V

    :cond_7
    return-void

    .line 262
    :cond_8
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz v0, :cond_9

    .line 263
    invoke-interface {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->sendVerifyState(Z)V

    .line 268
    :cond_9
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->sendResetCmd()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 269
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz v0, :cond_b

    .line 270
    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->otaSuccess()V

    goto :goto_0

    .line 273
    :cond_a
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    if-eqz v0, :cond_b

    const-string v1, "reset_command_failed"

    .line 274
    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;->otaFailed(Ljava/lang/String;)V

    .line 280
    :cond_b
    :goto_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 282
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 284
    :goto_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "exit startOtaUpdate"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private waitCmdResponse(J)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeoutMs"
        }
    .end annotation

    .line 57
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseSemaphore:Ljava/util/concurrent/Semaphore;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/InterruptedException;->printStackTrace()V

    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public amOtaStart(Ljava/io/InputStream;Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x0,
            0x0,
            0x0
        }
        names = {
            "inputStream",
            "otaCommunicator",
            "amotaCallback",
            "deviceId"
        }
    .end annotation

    .line 355
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->deviceId:Ljava/lang/String;

    .line 356
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->otaCommunicator:Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;

    const/4 p2, 0x0

    .line 357
    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mStopOta:Z

    .line 358
    sput-boolean p2, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mPauseOta:Z

    .line 359
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    .line 361
    new-instance p3, Ljava/util/concurrent/Semaphore;

    invoke-direct {p3, p2}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseSemaphore:Ljava/util/concurrent/Semaphore;

    .line 363
    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileOffset:I

    .line 365
    new-instance p2, Ljava/lang/Thread;

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$1;

    invoke-direct {p3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;Ljava/io/InputStream;)V

    invoke-direct {p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 376
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 378
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;->AMOTA_STATUS_SUCCESS:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaStatus;

    return-object p1
.end method

.method public amOtaStop()V
    .locals 1

    const/4 v0, 0x1

    .line 410
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mStopOta:Z

    const/4 v0, 0x0

    .line 411
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    .line 412
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->tryAcquire()Z

    .line 413
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method

.method public dispose()V
    .locals 1

    .line 391
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->getDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public formatHex2String([B)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 49
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-byte v4, p1, v3

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    .line 50
    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v5, v2

    const-string v4, "%02X "

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public otaCmdResponse([B)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "response"
        }
    .end annotation

    const/4 v0, 0x2

    .line 310
    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    invoke-direct {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->amOtaByte2Cmd(I)Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    move-result-object v1

    .line 312
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->AMOTA_CMD_UNKNOWN:Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;

    if-ne v1, v2, :cond_0

    .line 313
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "got unknown response"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->formatHex2String([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v2, 0x3

    .line 318
    aget-byte v3, p1, v2

    and-int/lit16 v3, v3, 0xff

    if-eqz v3, :cond_1

    .line 319
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "error occurred, response = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->formatHex2String([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 320
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "status : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->getStatusString([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 324
    :cond_1
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$4;->$SwitchMap$powerwatch$matrix$com$pwgen2android$ota$eAmotaCommand:[I

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/ota/eAmotaCommand;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x5

    const/4 v4, 0x4

    if-eq v1, v0, :cond_5

    if-eq v1, v2, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    .line 344
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "get response from unknown command"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 340
    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "get AMOTA_CMD_FW_RESET response"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseArrived()V

    goto :goto_0

    .line 336
    :cond_3
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "get AMOTA_CMD_FW_VERIFY response"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 337
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseArrived()V

    goto :goto_0

    .line 332
    :cond_4
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    const-string v0, "get AMOTA_CMD_FW_DATA response"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 333
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseArrived()V

    goto :goto_0

    .line 326
    :cond_5
    aget-byte v0, p1, v4

    and-int/lit16 v0, v0, 0xff

    aget-byte v1, p1, v3

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    const/4 v1, 0x6

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    const/4 v1, 0x7

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x18

    add-int/2addr v0, p1

    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileOffset:I

    .line 328
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get AMOTA_CMD_FW_HEADER response, mFileOffset = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mFileOffset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 329
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->cmdResponseArrived()V

    :goto_0
    return-void
.end method

.method public pauseOta()V
    .locals 1

    const/4 v0, 0x1

    .line 150
    sput-boolean v0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mPauseOta:Z

    return-void
.end method

.method public registerToOTA(Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "otaCommunicator"
        }
    .end annotation

    .line 395
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->getDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;->receivedData()Lio/reactivex/Observable;

    move-result-object p1

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;)V

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$3;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;)V

    .line 396
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 395
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public resumeOta(Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "amotaCallback"
        }
    .end annotation

    .line 154
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mAmotaCallback:Lpowerwatch/matrix/com/pwgen2android/ota/AmotaCallback;

    const/4 p1, 0x0

    .line 155
    sput-boolean p1, Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;->mPauseOta:Z

    return-void
.end method
