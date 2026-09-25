.class public final Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;
.super Ljava/lang/Object;
.source "Environment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0006\u0010\u0013\u001a\u00020\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0006\"\u0011\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "DEV_BASE_URL",
        "",
        "PROD_BASE_URL",
        "devAuthConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;",
        "getDevAuthConfig",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;",
        "devHttpConfig",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;",
        "getDevHttpConfig",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;",
        "prodAuthConfig",
        "getProdAuthConfig",
        "prodHttpConfig",
        "getProdHttpConfig",
        "cloudConfiguration",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;",
        "prodEnabled",
        "",
        "stravaConfiguration",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final DEV_BASE_URL:Ljava/lang/String; = "https://api.dev.powerwatch.com"

.field public static final PROD_BASE_URL:Ljava/lang/String; = "https://api.prod.powerwatch.com"

.field private static final devAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

.field private static final devHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

.field private static final prodAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

.field private static final prodHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 25

    .line 22
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    const-string v1, "/oauth/token"

    const-string v2, "password"

    const-string v3, "read write"

    const-string v4, "consumer_android"

    const-string v5, "handball2015"

    const-string v6, "Basic"

    const-string v7, "Y29uc3VtZXJfYW5kcm9pZDpoYW5kYmFsbDIwMTU="

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x180

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v12, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->prodAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    .line 31
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    const-string v14, "/oauth/token"

    const-string v15, "password"

    const-string v16, "read write"

    const-string v17, "consumer_android"

    const-string v18, "handball2015"

    const-string v19, "Basic"

    const-string v20, "Y29uc3VtZXJfYW5kcm9pZDpoYW5kYmFsbDIwMTU="

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x180

    const/16 v24, 0x0

    move-object v13, v0

    invoke-direct/range {v13 .. v24}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->devAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    .line 40
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    const-string v1, "https://api.prod.powerwatch.com"

    const/16 v2, 0x3c

    invoke-direct {v0, v1, v2, v2, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->prodHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    .line 46
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    const-string v1, "https://api.dev.powerwatch.com"

    invoke-direct {v0, v1, v2, v2, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->devHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    return-void
.end method

.method public static final cloudConfiguration(Z)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;
    .locals 45

    if-eqz p0, :cond_0

    const-string v0, "https://api.prod.powerwatch.com"

    goto :goto_0

    :cond_0
    const-string v0, "https://api.dev.powerwatch.com"

    :goto_0
    move-object v2, v0

    if-eqz p0, :cond_1

    .line 60
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->prodHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    goto :goto_1

    :cond_1
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->devHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    :goto_1
    move-object v3, v0

    if-eqz p0, :cond_2

    .line 61
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->prodAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    goto :goto_2

    :cond_2
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->devAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    :goto_2
    move-object v4, v0

    .line 68
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v6, "/pwuser/get"

    const-string v7, "/pwuser/add"

    const-string v8, "/pwuser/update"

    const-string v9, ""

    const-string v10, ""

    move-object v5, v12

    invoke-direct/range {v5 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;

    move-object v5, v6

    const-string v7, "/pwuser/forgotPassword"

    const-string v8, "/pwuser/changePassword"

    const-string v9, "/pwuser/verify"

    const-string v10, "/pwuser/resendEmail"

    const-string v11, "/pwuser/fcmToken"

    invoke-direct/range {v6 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 74
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;

    move-object v6, v0

    .line 75
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v8, ""

    const-string v9, "/host/pairDevice"

    const-string v10, "/host/updateDevice"

    const-string v11, "/pwuser/devices"

    const-string v12, "/host/unpairDevice"

    move-object v7, v1

    invoke-direct/range {v7 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 84
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;

    move-object v7, v0

    const-string v1, "/pwuser/walking/hour"

    const-string v8, "/pwuser/walking/dayHours"

    const-string v9, "/pwuser/walking/weekHours"

    const-string v10, "/pwuser/walking/monthHours"

    invoke-direct {v0, v1, v8, v9, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;

    move-object v8, v0

    const-string v1, "/pwuser/resting/hour"

    const-string v9, "/pwuser/resting/dayHours"

    const-string v10, "/pwuser/resting/weekHours"

    const-string v11, "/pwuser/resting/monthHours"

    invoke-direct {v0, v1, v9, v10, v11}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;

    move-object v9, v0

    const-string v1, "/pwuser/sleep/hour"

    const-string v10, "/pwuser/sleep/dayHours"

    const-string v11, "/pwuser/sleep/weekHours"

    const-string v12, "/pwuser/sleep/monthHours"

    invoke-direct {v0, v1, v10, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object v10, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v12, ""

    const-string v13, ""

    const-string v14, ""

    const-string v15, "/pwuser/walking/day"

    const-string v16, ""

    move-object v11, v1

    invoke-direct/range {v11 .. v16}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 109
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object v11, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v13, ""

    const-string v14, ""

    const-string v15, ""

    const-string v16, "/pwuser/resting/day"

    const-string v17, ""

    move-object v12, v1

    invoke-direct/range {v12 .. v17}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 116
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object v12, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v14, ""

    const-string v15, ""

    const-string v16, ""

    const-string v17, "/pwuser/sleep/day"

    const-string v18, ""

    move-object v13, v1

    invoke-direct/range {v13 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 123
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object v13, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v15, ""

    const-string v16, ""

    const-string v17, ""

    const-string v18, "/pwuser/walking/week"

    const-string v19, ""

    move-object v14, v1

    invoke-direct/range {v14 .. v19}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 130
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object v14, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v16, ""

    const-string v17, ""

    const-string v18, ""

    const-string v19, "/pwuser/resting/week"

    const-string v20, ""

    move-object v15, v1

    invoke-direct/range {v15 .. v20}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 137
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object v15, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v17, ""

    const-string v18, ""

    const-string v19, ""

    const-string v20, "/pwuser/sleep/week"

    const-string v21, ""

    move-object/from16 v16, v1

    invoke-direct/range {v16 .. v21}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 144
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;

    move-object/from16 v19, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v21, "/pwuser/update/latest"

    const-string v22, ""

    const-string v23, ""

    const-string v24, ""

    const-string v25, ""

    move-object/from16 v20, v1

    invoke-direct/range {v20 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 151
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object/from16 v16, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v21, ""

    const-string v22, ""

    const-string v23, ""

    const-string v24, "/pwuser/walking/month"

    const-string v25, ""

    move-object/from16 v20, v1

    invoke-direct/range {v20 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 158
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object/from16 v17, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v21, ""

    const-string v22, ""

    const-string v23, ""

    const-string v24, "/pwuser/resting/month"

    const-string v25, ""

    move-object/from16 v20, v1

    invoke-direct/range {v20 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 165
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;

    move-object/from16 v18, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v21, ""

    const-string v22, ""

    const-string v23, ""

    const-string v24, "/pwuser/sleep/month"

    const-string v25, ""

    move-object/from16 v20, v1

    invoke-direct/range {v20 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 172
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;

    move-object/from16 v20, v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v22, ""

    const-string v23, "/pwuser/goal/addForUser"

    const-string v24, ""

    const-string v25, "/pwuser/goal/getByUser"

    const-string v26, ""

    move-object/from16 v21, v1

    invoke-direct/range {v21 .. v26}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 179
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;

    move-object/from16 v21, v0

    .line 180
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v23, ""

    const-string v24, "/pwuser/walking/add"

    const-string v25, ""

    const-string v26, ""

    const-string v27, ""

    move-object/from16 v22, v1

    invoke-direct/range {v22 .. v27}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 187
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;

    move-object/from16 v22, v0

    .line 188
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v24, ""

    const-string v25, "/pwuser/resting/add"

    const-string v26, ""

    const-string v27, ""

    const-string v28, ""

    move-object/from16 v23, v1

    invoke-direct/range {v23 .. v28}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 195
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;

    move-object/from16 v23, v0

    .line 196
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v25, ""

    const-string v26, "/pwuser/sleep/add"

    const-string v27, ""

    const-string v28, ""

    const-string v29, ""

    move-object/from16 v24, v1

    invoke-direct/range {v24 .. v29}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 206
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const-string v31, ""

    const-string v32, "/pwuser/activitySession/addWithData"

    const-string v33, "/pwuser/activitySession/update"

    const-string v34, ""

    const-string v35, "/pwuser/activitySession/delete"

    move-object/from16 v30, v0

    invoke-direct/range {v30 .. v35}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;

    move-object/from16 v24, v1

    move-object/from16 p0, v5

    const-string v5, "/pwuser/activitySession/day"

    move-object/from16 v28, v6

    const-string v6, "/pwuser/activitySession/month/activityDates"

    invoke-direct {v1, v0, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;

    move-object/from16 v25, v0

    .line 214
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x1d

    const/16 v36, 0x0

    const-string v31, "/metrics/events/device/add"

    move-object/from16 v29, v1

    invoke-direct/range {v29 .. v36}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x1d

    const/16 v44, 0x0

    const-string v39, "/metrics/events/app"

    move-object/from16 v37, v5

    invoke-direct/range {v37 .. v44}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 213
    invoke-direct {v0, v1, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V

    .line 221
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;

    move-object/from16 v26, v0

    const-string v1, "/pwuser/update/fonts"

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;-><init>(Ljava/lang/String;)V

    .line 58
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    move-object v1, v0

    const-string v27, "/reports/addAttachment"

    move-object/from16 v5, p0

    move-object/from16 v6, v28

    invoke-direct/range {v1 .. v27}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/HourPeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/PeriodConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/LogCloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/MetricsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final getDevAuthConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;
    .locals 1

    .line 31
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->devAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    return-object v0
.end method

.method public static final getDevHttpConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;
    .locals 1

    .line 46
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->devHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    return-object v0
.end method

.method public static final getProdAuthConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;
    .locals 1

    .line 22
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->prodAuthConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/OAuth2Config;

    return-object v0
.end method

.method public static final getProdHttpConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;
    .locals 1

    .line 40
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->prodHttpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    return-object v0
.end method

.method public static final stravaConfiguration()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;
    .locals 4

    .line 52
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;

    const-string v1, "/oauth/token"

    const-string v2, "/oauth/deauthorize"

    const-string v3, "/api/v3/uploads"

    invoke-direct {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/StravaConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
