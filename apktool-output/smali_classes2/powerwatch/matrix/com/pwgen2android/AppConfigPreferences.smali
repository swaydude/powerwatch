.class public final Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;
.super Ljava/lang/Object;
.source "AppConfigPreferences.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;",
        "",
        "()V",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

.field private static final PERMISSIONS_SHOWN_FLAG:Ljava/lang/String;

.field private static final PROD_ENABLED:Ljava/lang/String;

.field private static final PULL_DOWN_TO_SYNC_SHOWN:Ljava/lang/String;

.field private static final WATCH_MOCK_DATA_ENABLED:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    const-string v0, "com.matrix.powerwatch2.PRODUCTION_ENABLED"

    .line 10
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->PROD_ENABLED:Ljava/lang/String;

    const-string v0, "com.matrix.powerwatch2.WATCH_MOCK_DATA_ENABLED"

    .line 11
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->WATCH_MOCK_DATA_ENABLED:Ljava/lang/String;

    const-string v0, "com.matrix.powerwatch2.PERMISSION_SHOWN_FLAG"

    .line 12
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->PERMISSIONS_SHOWN_FLAG:Ljava/lang/String;

    const-string v0, "com.matrix.powerwatch2.PULL_DOWN_TO_SYNC_SHOWN"

    .line 13
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->PULL_DOWN_TO_SYNC_SHOWN:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getPERMISSIONS_SHOWN_FLAG$cp()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->PERMISSIONS_SHOWN_FLAG:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getPROD_ENABLED$cp()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->PROD_ENABLED:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getPULL_DOWN_TO_SYNC_SHOWN$cp()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->PULL_DOWN_TO_SYNC_SHOWN:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getWATCH_MOCK_DATA_ENABLED$cp()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->WATCH_MOCK_DATA_ENABLED:Ljava/lang/String;

    return-object v0
.end method
