.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;
.super Ljava/lang/Object;
.source "NotificationTypeController.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;,
        Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u000b\u000cB\u0017\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;",
        "",
        "titleResourceId",
        "",
        "label",
        "",
        "(ILjava/lang/String;)V",
        "getLabel",
        "()Ljava/lang/String;",
        "getTitleResourceId",
        "()I",
        "Calls",
        "SMS",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$Calls;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType$SMS;",
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
.field private final label:Ljava/lang/String;

.field private final titleResourceId:I


# direct methods
.method private constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;->titleResourceId:I

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;->label:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;-><init>(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleResourceId()I
    .locals 1

    .line 8
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationAppType;->titleResourceId:I

    return v0
.end method
