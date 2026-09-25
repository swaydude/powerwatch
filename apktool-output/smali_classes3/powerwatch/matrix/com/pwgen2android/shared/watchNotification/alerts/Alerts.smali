.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;
.super Ljava/lang/Object;
.source "AlertsConfiguration.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$CALLS;,
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$MESSAGES;,
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$ALARMS;,
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$GOALS;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0007\u0008\t\nB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0004\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;",
        "",
        "value",
        "",
        "(I)V",
        "getValue",
        "()I",
        "ALARMS",
        "CALLS",
        "GOALS",
        "MESSAGES",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$CALLS;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$MESSAGES;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$ALARMS;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts$GOALS;",
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
.field private final value:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;->value:I

    return-void
.end method

.method public synthetic constructor <init>(ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 6
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alerts;->value:I

    return v0
.end method
