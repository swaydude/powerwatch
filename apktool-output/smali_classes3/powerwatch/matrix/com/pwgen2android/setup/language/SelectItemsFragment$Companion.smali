.class public final Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;
.super Ljava/lang/Object;
.source "SelectItemsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0006\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;",
        "",
        "()V",
        "ACTIVE_VALUE_KEY",
        "",
        "getACTIVE_VALUE_KEY",
        "()Ljava/lang/String;",
        "TITLE_KEY",
        "getTITLE_KEY",
        "TYPE_KEY",
        "getTYPE_KEY",
        "newInstance",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;",
        "title",
        "activeValue",
        "",
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

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getACTIVE_VALUE_KEY()Ljava/lang/String;
    .locals 1

    .line 100
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->access$getACTIVE_VALUE_KEY$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTITLE_KEY()Ljava/lang/String;
    .locals 1

    .line 101
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->access$getTITLE_KEY$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTYPE_KEY()Ljava/lang/String;
    .locals 1

    .line 99
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->access$getTYPE_KEY$cp()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final newInstance(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;Ljava/lang/String;B)Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;-><init>()V

    .line 105
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 106
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;->getTYPE_KEY()Ljava/lang/String;

    move-result-object v2

    check-cast p1, Ljava/io/Serializable;

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 107
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;->getACTIVE_VALUE_KEY()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, p3}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    .line 108
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment$Companion;->getTITLE_KEY()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
