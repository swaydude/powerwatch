.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion;
.super Ljava/lang/Object;
.source "SettingsDataParser.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u009a\u0001\u0010\u0003\u001a\u008a\u0001\u0012\u0004\u0012\u00020\u0005\u0012:\u00128\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\u00060\u0004jD\u0012\u0004\u0012\u00020\u0005\u0012:\u00128\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\u0006`\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion;",
        "",
        "()V",
        "array",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/Function2;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "Lkotlin/ParameterName;",
        "name",
        "data",
        "",
        "",
        "dataList",
        "",
        "Lkotlin/collections/HashMap;",
        "getArray",
        "()Ljava/util/HashMap;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getArray()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lkotlin/jvm/functions/Function2<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            "Ljava/util/List<",
            "Ljava/lang/Byte;",
            ">;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    .line 73
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;->access$getArray$cp()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method
