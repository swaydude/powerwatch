.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventBuilder;
.super Ljava/lang/Object;
.source "AppEvents.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventBuilder;",
        "",
        "hostInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;)V",
        "createAppEvent",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;",
        "appEventType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;",
        "username",
        "",
        "generatedDate",
        "",
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

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventBuilder;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    return-void
.end method

.method public static synthetic createAppEvent$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;Ljava/lang/String;JILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    .line 39
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventBuilder;->createAppEvent(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;Ljava/lang/String;J)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createAppEvent(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;Ljava/lang/String;J)Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;
    .locals 9

    const-string v0, "appEventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventBuilder;->hostInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;->hostInfo(Z)Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    move-result-object v6

    .line 44
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;->getEventType()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    move-object v2, v0

    move-object v5, p2

    move-wide v7, p3

    invoke-direct/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V

    return-object v0
.end method
