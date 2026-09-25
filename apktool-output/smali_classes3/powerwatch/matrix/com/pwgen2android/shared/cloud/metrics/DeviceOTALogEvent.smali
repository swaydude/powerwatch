.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;
.super Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;
.source "MetricsRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;",
        "deviceEventType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;",
        "eventStatus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;",
        "logDevice",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;",
        "firmwareVersionFrom",
        "",
        "firmwareVersionTo",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;)V",
        "getFirmwareVersionFrom",
        "()Ljava/lang/String;",
        "getFirmwareVersionTo",
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
.field private final firmwareVersionFrom:Ljava/lang/String;

.field private final firmwareVersionTo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "deviceEventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersionFrom"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersionTo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;->firmwareVersionFrom:Ljava/lang/String;

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;->firmwareVersionTo:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 28
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getFirmwareVersionFrom()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;->firmwareVersionFrom:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirmwareVersionTo()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;->firmwareVersionTo:Ljava/lang/String;

    return-object v0
.end method
