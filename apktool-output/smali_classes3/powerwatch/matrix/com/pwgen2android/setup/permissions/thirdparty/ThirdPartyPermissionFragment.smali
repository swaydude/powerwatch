.class public final Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "ThirdPartyPermissionFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nThirdPartyPermissionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyPermissionFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,107:1\n54#2,3:108\n*S KotlinDebug\n*F\n+ 1 ThirdPartyPermissionFragment.kt\npowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment\n*L\n31#1:108,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\r\u001a\u00020\u000eH\u0014J\u0008\u0010\u000f\u001a\u00020\u0003H\u0014J\u0008\u0010\u0010\u001a\u00020\u000eH\u0014J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0008\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\n\u00a8\u0006 "
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentThirdPartyPermissionBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "adapter",
        "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;",
        "permissionsInfoViewModel",
        "getPermissionsInfoViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;",
        "permissionsInfoViewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onActivityResult",
        "",
        "requestCode",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;


# instance fields
.field private adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

.field private final permissionsInfoViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 31
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 28
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 31
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$permissionsInfoViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$permissionsInfoViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 108
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 110
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 31
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->permissionsInfoViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getAdapter$p(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;
    .locals 0

    .line 28
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

    return-object p0
.end method

.method private final getPermissionsInfoViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;
    .locals 1

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->permissionsInfoViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 28
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;
    .locals 1

    .line 35
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getPermissionsInfoViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b007d

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .line 93
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0x4d2

    if-ne p1, p3, :cond_2

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    .line 96
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getPermissionsInfoViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;->authorizationSuccess()V

    .line 98
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->notifyDataSetChanged()V

    goto :goto_0

    :cond_1
    const-string p1, "adapter"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p2, 0x7f08015d

    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;

    const-string p3, "toolbar"

    .line 46
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/ToolbarViewExtensionsKt;->removeBackground(Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;)V

    const p3, 0x7f080081

    .line 47
    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/Button;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/Button;->setVisibility(I)V

    :goto_0
    const p3, 0x7f0801e5

    .line 49
    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/LoginToolbar;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    const p3, 0x7f0f00be

    .line 50
    invoke-virtual {p0, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    if-nez p2, :cond_2

    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v0, 0x7f050023

    invoke-static {p3, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    :goto_2
    sget p2, Lpowerwatch/matrix/com/pwgen2android/R$id;->permissions_list:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 55
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 56
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    .line 57
    check-cast p3, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 60
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;->getPermissionsList()Landroidx/databinding/ObservableField;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/List;

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 61
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, p3, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

    const/4 p3, 0x0

    const-string v1, "adapter"

    if-eqz v0, :cond_4

    .line 63
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$onCreateView$1;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$onCreateView$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;->setClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 68
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->adapter:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoRecyclerAdapter;

    if-eqz v0, :cond_3

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 71
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;->getPermissionsList()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$onCreateView$2;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$onCreateView$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;->getListChanged()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$onCreateView$3;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$onCreateView$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 85
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1

    .line 68
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3

    .line 63
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw p3
.end method
