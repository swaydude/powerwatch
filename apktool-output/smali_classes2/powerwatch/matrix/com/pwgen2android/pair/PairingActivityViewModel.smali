.class public final Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
.source "PairingActivityViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/PairingActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V",
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
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V
    .locals 7

    const-string v0, "languageController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;)V

    .line 17
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801aa

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p3

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    return-void
.end method
