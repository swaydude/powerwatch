.class public final Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;
.super Landroidx/fragment/app/Fragment;
.source "DBDebugFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0017\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;",
        "Landroidx/fragment/app/Fragment;",
        "()V",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method

.method public static synthetic lambda$YyG_lM301gA2VZF3eGQGLRiZhgQ(Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;->onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-0(Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0b0054

    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f080165

    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;

    const-string p3, "toolbar"

    .line 26
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x7f0f0037

    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "getString(R.string.app_secret_screen_title)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->title(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Ljava/lang/String;)V

    .line 27
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->hideRightButton(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;)V

    .line 28
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/-$$Lambda$DBDebugFragment$YyG_lM301gA2VZF3eGQGLRiZhgQ;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/-$$Lambda$DBDebugFragment$YyG_lM301gA2VZF3eGQGLRiZhgQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;)V

    invoke-static {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->backButtonClickListener(Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;Landroid/view/View$OnClickListener;)V

    const p2, 0x7f080285

    .line 31
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebView;

    .line 32
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 34
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/secret/debugdb/DBDebugFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "page_url"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :goto_0
    if-eqz p3, :cond_1

    .line 37
    invoke-virtual {p2, p3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-object p1

    .line 35
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "URL must be provided!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
