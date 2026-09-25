.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;
.source "SettingsLiteCommunicator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SleepTime"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;",
        "user",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
        "locale",
        "Ljava/util/Locale;",
        "goals",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "sleepTime",
        "",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/util/Locale;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;I)V",
        "getGoals",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "getLocale",
        "()Ljava/util/Locale;",
        "getSleepTime",
        "()I",
        "getUser",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;",
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

.field private final locale:Ljava/util/Locale;

.field private final sleepTime:I

.field private final user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/util/Locale;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;I)V
    .locals 2

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goals"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 20
    invoke-direct {p0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->locale:Ljava/util/Locale;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->goals:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->sleepTime:I

    return-void
.end method


# virtual methods
.method public final getGoals()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->goals:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    return-object v0
.end method

.method public final getLocale()Ljava/util/Locale;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method public final getSleepTime()I
    .locals 1

    .line 20
    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->sleepTime:I

    return v0
.end method

.method public final getUser()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;
    .locals 1

    .line 20
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;->user:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    return-object v0
.end method
