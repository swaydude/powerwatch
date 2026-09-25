.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;
.super Ljava/lang/Object;
.source "MetricsRepository.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\u0008"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "",
        "logEvent",
        "",
        "item",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;",
        "logOTAEvent",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;",
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


# virtual methods
.method public abstract logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V
.end method

.method public abstract logOTAEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;)V
.end method
