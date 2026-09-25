.class public abstract Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "BaseActivityViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "activity",
        "Landroid/app/Activity;",
        "(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;)V",
        "resetLanguage",
        "",
        "context",
        "Landroid/content/Context;",
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
.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;)V
    .locals 2

    const-string v0, "languageController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 7
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 16
    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;->initSetLanguage(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final resetLanguage(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;->initSetLanguage(Landroid/content/Context;)V

    return-void
.end method
