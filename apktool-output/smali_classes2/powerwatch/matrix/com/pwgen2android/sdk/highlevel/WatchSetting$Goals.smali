.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;
.source "SettingsLiteCommunicator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Goals"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;",
        "goals",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "deviceID",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/String;)V",
        "getGoals",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
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
.field private final goals:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/String;)V
    .locals 1

    const-string p2, "goals"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    .line 18
    invoke-direct {p0, p2, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;->goals:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 18
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 1

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;->goals:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    return-object v0
.end method
