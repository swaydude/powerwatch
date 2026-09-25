.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;
.super Ljava/lang/Object;
.source "BleConnectionWithRetryOperation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0008J\u0006\u0010\u0013\u001a\u00020\u0008J\u0006\u0010\u0014\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;",
        "",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "getAppContext",
        "()Landroid/content/Context;",
        "lastConnect",
        "",
        "getLastConnect",
        "()Z",
        "setLastConnect",
        "(Z)V",
        "locationTag",
        "",
        "getLocationTag",
        "()Ljava/lang/String;",
        "enableAutoConnect",
        "",
        "isAutoConnectEnabled",
        "restoreLastState",
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

.field private lastConnect:Z

.field private final locationTag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->appContext:Landroid/content/Context;

    const-string p1, "auto_connect_enabled"

    .line 18
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->locationTag:Ljava/lang/String;

    .line 19
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->isAutoConnectEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->lastConnect:Z

    return-void
.end method


# virtual methods
.method public final enableAutoConnect(Z)V
    .locals 2

    .line 26
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->isAutoConnectEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->lastConnect:Z

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->locationTag:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final getAppContext()Landroid/content/Context;
    .locals 1

    .line 17
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->appContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getLastConnect()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->lastConnect:Z

    return v0
.end method

.method public final getLocationTag()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->locationTag:Ljava/lang/String;

    return-object v0
.end method

.method public final isAutoConnectEnabled()Z
    .locals 3

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->locationTag:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final restoreLastState()V
    .locals 3

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->appContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->locationTag:Ljava/lang/String;

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->lastConnect:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final setLastConnect(Z)V
    .locals 0

    .line 19
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->lastConnect:Z

    return-void
.end method
