.class public final Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;
.super Ljava/lang/Object;
.source "ConnectionNotificationPersistence.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007J\u000e\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000cJ\u001a\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000cH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;",
        "",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getAppContext",
        "()Landroid/content/Context;",
        "goalsStoreKey",
        "",
        "enableUserGoalsNotification",
        "",
        "enabled",
        "",
        "isGoalsHit",
        "goalType",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;",
        "isGoalsNotificationsEnabled",
        "setGoalsHit",
        "goalsHit",
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
.field private final appContext:Landroid/content/Context;

.field private final goalsStoreKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->appContext:Landroid/content/Context;

    const-string p1, "goals_notification_enabled_key"

    .line 23
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->goalsStoreKey:Ljava/lang/String;

    return-void
.end method

.method public static synthetic setGoalsHit$default(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 39
    :cond_0
    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;Z)V

    return-void
.end method


# virtual methods
.method public final enableUserGoalsNotification(Z)V
    .locals 2

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->goalsStoreKey:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public final getAppContext()Landroid/content/Context;
    .locals 1

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->appContext:Landroid/content/Context;

    return-object v0
.end method

.method public final isGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;)Z
    .locals 2

    const-string v0, "goalType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;->getStoreKey()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public final isGoalsNotificationsEnabled()Z
    .locals 3

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->goalsStoreKey:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final setGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;Z)V
    .locals 1

    const-string v0, "goalType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;->getStoreKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
