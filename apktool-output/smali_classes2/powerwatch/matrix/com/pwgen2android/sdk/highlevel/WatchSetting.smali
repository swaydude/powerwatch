.class public abstract Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;
.super Ljava/lang/Object;
.source "SettingsLiteCommunicator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Language;,
        Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0005\u0007\u0008\t\n\u000bB\u0013\u0008\u0004\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0005\u000c\r\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;",
        "",
        "deviceID",
        "",
        "(Ljava/lang/String;)V",
        "getDeviceID",
        "()Ljava/lang/String;",
        "Biometrics",
        "Goals",
        "Language",
        "SleepTime",
        "Units",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Language;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;",
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
.field private final deviceID:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;->deviceID:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move-object p1, p3

    .line 14
    :cond_0
    invoke-direct {p0, p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getDeviceID()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;->deviceID:Ljava/lang/String;

    return-object v0
.end method
