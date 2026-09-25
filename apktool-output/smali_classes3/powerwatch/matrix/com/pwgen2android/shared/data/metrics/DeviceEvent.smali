.class public Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;
.super Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;
.source "DeviceEvent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fR\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;",
        "eventType",
        "",
        "eventDetails",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;",
        "deviceId",
        "firmwareVersion",
        "timezone",
        "region",
        "username",
        "host",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;",
        "date",
        "",
        "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V",
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
.field private final deviceId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deviceId"
    .end annotation
.end field

.field private final eventDetails:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "eventDetails"
    .end annotation
.end field

.field private final eventType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "eventType"
    .end annotation
.end field

.field private final firmwareVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "firmwareVersion"
    .end annotation
.end field

.field private final region:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "region"
    .end annotation
.end field

.field private final timezone:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timezone"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V
    .locals 1

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventDetails"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-direct {p0, p7, p8, p9, p10}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V

    .line 57
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;->eventType:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;->eventDetails:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;

    .line 63
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;->deviceId:Ljava/lang/String;

    .line 66
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;->firmwareVersion:Ljava/lang/String;

    .line 69
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;->timezone:Ljava/lang/String;

    .line 72
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;->region:Ljava/lang/String;

    return-void
.end method
