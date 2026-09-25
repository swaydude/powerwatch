.class public Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;
.super Ljava/lang/Object;
.source "MetricsRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;",
        "",
        "deviceEventType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;",
        "eventStatus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;",
        "logDevice",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V",
        "getDeviceEventType",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;",
        "getEventStatus",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;",
        "getLogDevice",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;",
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


# instance fields
.field private final deviceEventType:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

.field private final eventStatus:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

.field private final logDevice:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V
    .locals 1

    const-string v0, "deviceEventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->deviceEventType:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->eventStatus:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->logDevice:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 26
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V

    return-void
.end method


# virtual methods
.method public final getDeviceEventType()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;
    .locals 1

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->deviceEventType:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    return-object v0
.end method

.method public final getEventStatus()Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;
    .locals 1

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->eventStatus:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    return-object v0
.end method

.method public final getLogDevice()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;
    .locals 1

    .line 26
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;->logDevice:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    return-object v0
.end method
