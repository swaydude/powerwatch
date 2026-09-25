.class final Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion$13;
.super Lkotlin/jvm/internal/Lambda;
.source "SettingsDataParser.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/Byte;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "data",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
        "dataList",
        "",
        ""
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion$13;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion$13;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion$13;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion$13;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion$13;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 88
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingTable$Companion$13;->invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;",
            "Ljava/util/List<",
            "Ljava/lang/Byte;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 88
    invoke-static {p2, v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParserKt;->extractInt$default(Ljava/util/List;ZILjava/lang/Object;)I

    move-result p2

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;->setDnd(I)V

    return-void
.end method
