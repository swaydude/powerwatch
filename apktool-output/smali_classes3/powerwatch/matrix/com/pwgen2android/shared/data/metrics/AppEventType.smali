.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;
.super Ljava/lang/Object;
.source "AppEvents.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType$LoginEvent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0001\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;",
        "",
        "eventType",
        "",
        "(Ljava/lang/String;)V",
        "getEventType",
        "()Ljava/lang/String;",
        "LoginEvent",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType$LoginEvent;",
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
.field private final eventType:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;->eventType:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getEventType()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;->eventType:Ljava/lang/String;

    return-object v0
.end method
