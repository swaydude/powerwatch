.class public final Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "OtaTrackFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentOtaTrackBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOtaTrackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaTrackFragment.kt\npowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,117:1\n54#2,3:118\n*S KotlinDebug\n*F\n+ 1 OtaTrackFragment.kt\npowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment\n*L\n23#1:118,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u000e\u001a\u00020\u000fH\u0014J\u0008\u0010\u0010\u001a\u00020\u0003H\u0014J\u0008\u0010\u0011\u001a\u00020\u000fH\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentOtaTrackBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;",
        "()V",
        "downloadCircle",
        "Landroid/widget/ImageView;",
        "otaTrackViewModel",
        "getOtaTrackViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;",
        "otaTrackViewModel$delegate",
        "Lkotlin/Lazy;",
        "syncCircle",
        "transferCircle",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "setupColor",
        "",
        "otaUiPhase",
        "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;",
        "context",
        "Landroid/content/Context;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;


# instance fields
.field private downloadCircle:Landroid/widget/ImageView;

.field private final otaTrackViewModel$delegate:Lkotlin/Lazy;

.field private syncCircle:Landroid/widget/ImageView;

.field private transferCircle:Landroid/widget/ImageView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 21
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 23
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$otaTrackViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$otaTrackViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 118
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 120
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 23
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->otaTrackViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;
    .locals 1

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->otaTrackViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    return-object v0
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;

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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;
    .locals 1

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b006b

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p1

    .line 41
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getContext()Landroid/content/Context;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 49
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p3

    invoke-virtual {p3, p2}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->onCreateView(Landroid/content/Context;)V

    :cond_1
    return-object p1
.end method

.method public final setupColor(Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;->getPhase()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;

    move-result-object p1

    .line 69
    :goto_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$CONNECTING;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const v1, 0x7f0f0170

    const v2, 0x106000c

    if-eqz v0, :cond_4

    .line 70
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->downloadCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p2, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 71
    :goto_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->syncCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p2, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 72
    :goto_2
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->transferCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p2, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 73
    :goto_3
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->getOtaPhaseDescription()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_10

    .line 75
    :cond_4
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_STARTED;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/high16 v3, 0x1060000

    if-eqz v0, :cond_6

    .line 76
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->downloadCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {p2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 77
    :goto_4
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->getOtaPhaseDescription()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_10

    .line 79
    :cond_6
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$DOWNLOAD_FINISHED;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const v1, 0x1060014

    if-eqz v0, :cond_8

    .line 80
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->downloadCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_7

    goto/16 :goto_10

    :cond_7
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto/16 :goto_10

    .line 82
    :cond_8
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$SYNC;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 83
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->downloadCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 84
    :goto_5
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->syncCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {p2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 85
    :goto_6
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->getOtaPhaseDescription()Landroidx/databinding/ObservableField;

    move-result-object p1

    const v0, 0x7f0f01b0

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_10

    .line 88
    :cond_b
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$FILE_TRANSFER;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 89
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->downloadCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 90
    :goto_7
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->syncCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_d

    goto :goto_8

    :cond_d
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 91
    :goto_8
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->transferCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_e

    goto :goto_9

    :cond_e
    invoke-static {p2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 92
    :goto_9
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->getOtaPhaseDescription()Landroidx/databinding/ObservableField;

    move-result-object p1

    const v0, 0x7f0f01da

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_10

    .line 94
    :cond_f
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$COMPLETE;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/16 v3, 0xa

    if-eqz v0, :cond_13

    .line 95
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->downloadCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_10

    goto :goto_a

    :cond_10
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 96
    :goto_a
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->syncCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_11

    goto :goto_b

    :cond_11
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 97
    :goto_b
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->transferCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_12

    goto :goto_c

    :cond_12
    invoke-static {p2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 98
    :goto_c
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->getOtaPhaseDescription()Landroidx/databinding/ObservableField;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f0f01a5

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v1, 0x7f0f01b2

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto/16 :goto_10

    .line 100
    :cond_13
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase$ERROR;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_17

    .line 101
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->downloadCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_14

    goto :goto_d

    :cond_14
    invoke-static {p2, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 102
    :goto_d
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->syncCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_15

    goto :goto_e

    :cond_15
    invoke-static {p2, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 103
    :goto_e
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->transferCircle:Landroid/widget/ImageView;

    if-nez p1, :cond_16

    goto :goto_f

    :cond_16
    invoke-static {p2, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 104
    :goto_f
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->getOtaProgressField()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 105
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackFragment;->getOtaTrackViewModel()Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/ota/OtaTrackViewModel;->getOtaPhaseDescription()Landroidx/databinding/ObservableField;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f0f00c4

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v1, 0x7f0f01b3

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_17
    :goto_10
    return-void
.end method
