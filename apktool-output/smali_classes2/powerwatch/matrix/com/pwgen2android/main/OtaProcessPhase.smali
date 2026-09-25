.class public abstract Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;
.super Ljava/lang/Object;
.source "OtaProcessExecutorImpl.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;,
        Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$STOPPED;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000bB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\t\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;",
        "",
        "()V",
        "COMPLETE",
        "CONNECTING",
        "DOWNLOAD_FINISHED",
        "DOWNLOAD_STARTED",
        "ERROR",
        "FILE_TRANSFER",
        "INITIAL",
        "STOPPED",
        "SYNC",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$INITIAL;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$STOPPED;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;-><init>()V

    return-void
.end method
