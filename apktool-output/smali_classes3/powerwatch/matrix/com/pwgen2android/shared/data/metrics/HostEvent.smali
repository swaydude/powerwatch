.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;
.super Ljava/lang/Object;
.source "AppEvents.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\u0008&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;",
        "",
        "username",
        "",
        "host",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;",
        "generatedDate",
        "",
        "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V",
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
.field private final generatedDate:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "generatedDate"
    .end annotation
.end field

.field private final host:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "host"
    .end annotation
.end field

.field private final username:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "username"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V
    .locals 1

    const-string v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;->username:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;->host:Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;

    .line 19
    iput-wide p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;->generatedDate:J

    return-void
.end method
