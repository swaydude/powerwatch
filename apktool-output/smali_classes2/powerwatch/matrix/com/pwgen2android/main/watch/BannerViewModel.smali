.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "BannerViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u000c\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "context",
        "Landroid/content/Context;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "imageField",
        "Landroidx/databinding/ObservableField;",
        "",
        "getImageField",
        "()Landroidx/databinding/ObservableField;",
        "languageInfo",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
        "getLanguageInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;",
        "setLanguageInfo",
        "(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V",
        "onClick",
        "",
        "onCreateView",
        "onDestroyView",
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
.field private final context:Landroid/content/Context;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final imageField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private languageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;)V
    .locals 2

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 18
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->context:Landroid/content/Context;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 20
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 22
    new-instance p1, Landroidx/databinding/ObservableField;

    const p2, 0x7f07008d

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->imageField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public static synthetic lambda$aL1lRNdy4MIK64ddkXLTt-T5rmM(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V

    return-void
.end method

.method public static synthetic lambda$uTKgkH_BOTHpKcyHCiVbSsU2wm4(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->onCreateView$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->setLanguageInfo(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V

    .line 30
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0xc81

    if-eq v0, v1, :cond_12

    const/16 v1, 0xcae

    if-eq v0, v1, :cond_10

    const/16 v1, 0xccc

    if-eq v0, v1, :cond_e

    const/16 v1, 0xd2b

    if-eq v0, v1, :cond_c

    const/16 v1, 0xd37

    if-eq v0, v1, :cond_a

    const/16 v1, 0xd64

    if-eq v0, v1, :cond_8

    const/16 v1, 0xe04

    if-eq v0, v1, :cond_6

    const/16 v1, 0xe43

    if-eq v0, v1, :cond_4

    const v1, 0x6e7e71c

    if-eq v0, v1, :cond_2

    const v1, 0x6e7e934

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v0, "zh_TW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const p1, 0x7f0700ea

    goto/16 :goto_1

    :cond_2
    const-string v0, "zh_CN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const p1, 0x7f0700e9

    goto/16 :goto_1

    :cond_4
    const-string v0, "ru"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const p1, 0x7f0700e8

    goto/16 :goto_1

    :cond_6
    const-string v0, "pt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const p1, 0x7f0700e7

    goto :goto_1

    :cond_8
    const-string v0, "ko"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    const p1, 0x7f0700e6

    goto :goto_1

    :cond_a
    const-string v0, "ja"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    const p1, 0x7f0700e5

    goto :goto_1

    :cond_c
    const-string v0, "it"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_0

    :cond_d
    const p1, 0x7f0700e4

    goto :goto_1

    :cond_e
    const-string v0, "fr"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_0

    :cond_f
    const p1, 0x7f0700e3

    goto :goto_1

    :cond_10
    const-string v0, "es"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_0

    :cond_11
    const p1, 0x7f0700e2

    goto :goto_1

    :cond_12
    const-string v0, "de"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    :goto_0
    const p1, 0x7f07008d

    goto :goto_1

    :cond_13
    const p1, 0x7f0700e1

    .line 43
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->getImageField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-1(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getImageField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->imageField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getLanguageInfo()Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;
    .locals 1

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->languageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    return-object v0
.end method

.method public final onClick()V
    .locals 4

    .line 57
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 60
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 62
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->languageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    const-string v2, "gen2_manual_en.pdf"

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getUserManual()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    .line 63
    :goto_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->context:Landroid/content/Context;

    const-string v3, "manual.pdf"

    invoke-static {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/FileExtensionsKt;->createFromAssets(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 66
    :cond_2
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->context:Landroid/content/Context;

    const-string v3, "powerwatch.matrix.com.pwgen2android"

    invoke-static {v2, v3, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "application/pdf"

    .line 69
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 72
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 74
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 27
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getLanguage()Lio/reactivex/Observable;

    move-result-object v0

    .line 28
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$BannerViewModel$aL1lRNdy4MIK64ddkXLTt-T5rmM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$BannerViewModel$aL1lRNdy4MIK64ddkXLTt-T5rmM;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$BannerViewModel$uTKgkH_BOTHpKcyHCiVbSsU2wm4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/watch/-$$Lambda$BannerViewModel$uTKgkH_BOTHpKcyHCiVbSsU2wm4;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 52
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public final setLanguageInfo(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->languageInfo:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    return-void
.end method
