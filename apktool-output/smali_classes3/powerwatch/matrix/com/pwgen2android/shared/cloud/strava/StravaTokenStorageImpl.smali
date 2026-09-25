.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;
.super Ljava/lang/Object;
.source "StravaTokenStorage.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000e\u001a\u00020\u000fH\u0017J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000f2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorage;",
        "appContext",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "ACCESS_TOKEN",
        "",
        "CODE",
        "EXPIRES_AT",
        "EXPIRES_IN",
        "REFRESH_TOKEN",
        "TOKEN_TYPE",
        "contextWearReference",
        "Ljava/lang/ref/WeakReference;",
        "clearCredentials",
        "",
        "loadCredentials",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;",
        "storeCredentials",
        "credentials",
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
.field private final ACCESS_TOKEN:Ljava/lang/String;

.field private final CODE:Ljava/lang/String;

.field private final EXPIRES_AT:Ljava/lang/String;

.field private final EXPIRES_IN:Ljava/lang/String;

.field private final REFRESH_TOKEN:Ljava/lang/String;

.field private final TOKEN_TYPE:Ljava/lang/String;

.field private final contextWearReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->contextWearReference:Ljava/lang/ref/WeakReference;

    const-string p1, "password_credentials_access_token"

    .line 32
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->ACCESS_TOKEN:Ljava/lang/String;

    const-string p1, "password_credentials_refresh_token"

    .line 33
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->REFRESH_TOKEN:Ljava/lang/String;

    const-string p1, "password_credentials_token_type"

    .line 34
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->TOKEN_TYPE:Ljava/lang/String;

    const-string p1, "password_credentials_expires_in"

    .line 35
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_IN:Ljava/lang/String;

    const-string p1, "password_credentials_expires_at"

    .line 36
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_AT:Ljava/lang/String;

    const-string p1, "password_credentials_code"

    .line 37
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->CODE:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public clearCredentials()V
    .locals 6

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->contextWearReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->ACCESS_TOKEN:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 23
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->REFRESH_TOKEN:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 24
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_AT:Ljava/lang/String;

    const-wide/16 v4, -0x1

    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 25
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_IN:Ljava/lang/String;

    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 26
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->TOKEN_TYPE:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 27
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->CODE:Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public loadCredentials()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;
    .locals 17

    move-object/from16 v0, p0

    .line 54
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->contextWearReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 56
    :cond_0
    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->ACCESS_TOKEN:Ljava/lang/String;

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    return-object v2

    .line 59
    :cond_1
    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->REFRESH_TOKEN:Ljava/lang/String;

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_2

    return-object v2

    .line 61
    :cond_2
    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_AT:Ljava/lang/String;

    const-wide/16 v5, -0x1

    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v12

    .line 63
    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_IN:Ljava/lang/String;

    invoke-interface {v3, v4, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    .line 65
    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->TOKEN_TYPE:Ljava/lang/String;

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3

    return-object v2

    .line 67
    :cond_3
    invoke-static {v1}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->CODE:Ljava/lang/String;

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_4

    return-object v2

    .line 69
    :cond_4
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;

    const/4 v6, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public storeCredentials(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;)V
    .locals 8

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->contextWearReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->ACCESS_TOKEN:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez p1, :cond_1

    move-object v4, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 43
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->REFRESH_TOKEN:Ljava/lang/String;

    if-nez p1, :cond_2

    move-object v4, v3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getRefreshToken()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 44
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_AT:Ljava/lang/String;

    const-wide/16 v4, -0x1

    if-nez p1, :cond_3

    move-wide v6, v4

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getExpiresAt()J

    move-result-wide v6

    :goto_2
    invoke-interface {v1, v2, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 45
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->EXPIRES_IN:Ljava/lang/String;

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getExpiresIn()J

    move-result-wide v4

    :goto_3
    invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 46
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->TOKEN_TYPE:Ljava/lang/String;

    if-nez p1, :cond_5

    move-object v4, v3

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getTokenType()Ljava/lang/String;

    move-result-object v4

    :goto_4
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    if-nez p1, :cond_6

    goto :goto_5

    .line 47
    :cond_6
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getCode()Ljava/lang/String;

    move-result-object v3

    :goto_5
    if-eqz v3, :cond_7

    .line 48
    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaTokenStorageImpl;->CODE:Ljava/lang/String;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaPasswordCredentials;->getCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_7
    return-void
.end method
