.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;
.super Ljava/lang/Object;
.source "DeviceEvent.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J^\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014JJ\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;",
        "",
        "hostInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;)V",
        "createDeviceOTAEvent",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;",
        "eventType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;",
        "eventStatus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;",
        "username",
        "",
        "deviceId",
        "firmwareVersion",
        "firmwareVersionFrom",
        "firmwareVersionTo",
        "timezone",
        "region",
        "date",
        "",
        "createEvent",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;",
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
.field private final hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;)V
    .locals 1

    const-string v0, "hostInfoProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    return-void
.end method

.method public static synthetic createDeviceOTAEvent$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;
    .locals 14

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-wide v12, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v12, p10

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    .line 121
    invoke-virtual/range {v2 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;->createDeviceOTAEvent(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic createEvent$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;
    .locals 12

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-wide v10, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v10, p8

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 110
    invoke-virtual/range {v2 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;->createEvent(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final createDeviceOTAEvent(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;
    .locals 15

    const-string v0, "eventType"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    move-object/from16 v10, p3

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceId"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    move-object/from16 v9, p9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;

    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v3, v0

    .line 128
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;->getEventType()Ljava/lang/String;

    move-result-object v2

    move-object v14, p0

    .line 130
    iget-object v1, v14, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    const/4 v6, 0x0

    invoke-interface {v1, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;->hostInfo(Z)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    move-result-object v11

    move-object v1, v0

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p3

    move-wide/from16 v12, p10

    .line 128
    invoke-direct/range {v1 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceOTAEvent;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V

    return-object v0
.end method

.method public final createEvent(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;
    .locals 13

    const-string v0, "eventType"

    move-object v1, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    move-object/from16 v8, p3

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceId"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareVersion"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    move-object/from16 v6, p6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v3, v0

    .line 117
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;->getEventType()Ljava/lang/String;

    move-result-object v2

    move-object v12, p0

    .line 118
    iget-object v1, v12, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    const/4 v9, 0x0

    invoke-interface {v1, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;->hostInfo(Z)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    move-result-object v9

    move-object v1, v0

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p3

    move-wide/from16 v10, p8

    .line 117
    invoke-direct/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEvent;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V

    return-object v0
.end method
