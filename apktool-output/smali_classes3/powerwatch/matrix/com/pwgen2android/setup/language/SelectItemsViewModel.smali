.class public final Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "SelectItemsViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectItemsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectItemsViewModel.kt\npowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n376#2,7:94\n*S KotlinDebug\n*F\n+ 1 SelectItemsViewModel.kt\npowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel\n*L\n69#1:94,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020#J\u0008\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0004H\u0016J\u000e\u0010-\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0004R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\u00060\u00060\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020 0\u001aX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006."
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;",
        "activityContext",
        "Landroid/content/Context;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "settingsDisplayValueLoader",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;",
        "itemExecutorDelegate",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "savePreferencesViewModel",
        "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V",
        "activeValue",
        "",
        "getActiveValue",
        "()Ljava/lang/Byte;",
        "setActiveValue",
        "(Ljava/lang/Byte;)V",
        "Ljava/lang/Byte;",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "items",
        "Landroidx/databinding/ObservableField;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
        "getItems",
        "()Landroidx/databinding/ObservableField;",
        "showSaveProgress",
        "",
        "getShowSaveProgress",
        "type",
        "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;",
        "getType",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;",
        "setType",
        "(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)V",
        "loadItems",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "onSaveClicked",
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
.field private final synthetic $$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

.field private activeValue:Ljava/lang/Byte;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final itemExecutorDelegate:Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;

.field private final items:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
            ">;>;"
        }
    .end annotation
.end field

.field private final settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

.field private type:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V
    .locals 2

    const-string v0, "activityContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDisplayValueLoader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemExecutorDelegate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savePreferencesViewModel"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 41
    invoke-direct {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    .line 38
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->itemExecutorDelegate:Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;

    .line 39
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 41
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    .line 43
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->items:Landroidx/databinding/ObservableField;

    .line 47
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 40
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;

    const/4 p7, 0x1

    const/4 p8, 0x0

    invoke-direct {p6, p8, p7, p8}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModelImpl;-><init>(Landroidx/databinding/ObservableField;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p6, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 35
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;-><init>(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V

    return-void
.end method

.method public static synthetic lambda$5T2kUT3JbCYD95U1I7Mdoze1BC8(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onSaveClicked$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$D00RxMyrhxNfNpIbKBNU1WgKPos(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$FnkQkMWUFrWxpKw7lRbHZ8L4aXo()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onSaveClicked$lambda-2()V

    return-void
.end method

.method private static final onSaveClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;Ljava/lang/Throwable;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 84
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onBackClicked()V

    return-void
.end method

.method private static final onSaveClicked$lambda-2()V
    .locals 0

    return-void
.end method

.method private static final onSaveClicked$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getActiveValue()Ljava/lang/Byte;
    .locals 1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->activeValue:Ljava/lang/Byte;

    return-object v0
.end method

.method public final getItems()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
            ">;>;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->items:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getShowSaveProgress()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->$$delegate_0:Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;
    .locals 1

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->type:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    return-object v0
.end method

.method public final loadItems(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;",
            ")",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;",
            ">;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->settingsDisplayValueLoader:Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->getActivityContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->activeValue:Ljava/lang/Byte;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    invoke-virtual {v0, v1, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;->loadItems(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;B)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onBackClicked()V
    .locals 1

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onCreateView(Landroid/content/Context;)V

    .line 54
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->items:Landroidx/databinding/ObservableField;

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->type:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->loadItems(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)Ljava/util/List;

    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final onSaveClicked(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->items:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 94
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    .line 95
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;

    .line 69
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;->getChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-interface {p1}, Ljava/util/ListIterator;->nextIndex()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    .line 71
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_3

    .line 76
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->getShowSaveProgress()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 77
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->onBackClicked()V

    goto :goto_2

    .line 79
    :cond_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->itemExecutorDelegate:Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->type:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    if-nez v3, :cond_4

    .line 80
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType$DND;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    .line 79
    :cond_4
    invoke-direct {v2, p1, v3}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;-><init>(ILpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)V

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;->executeItem(Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;)Lio/reactivex/Completable;

    move-result-object p1

    .line 81
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object p1

    .line 82
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsViewModel$D00RxMyrhxNfNpIbKBNU1WgKPos;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsViewModel$D00RxMyrhxNfNpIbKBNU1WgKPos;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsViewModel$FnkQkMWUFrWxpKw7lRbHZ8L4aXo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsViewModel$FnkQkMWUFrWxpKw7lRbHZ8L4aXo;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsViewModel$5T2kUT3JbCYD95U1I7Mdoze1BC8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/language/-$$Lambda$SelectItemsViewModel$5T2kUT3JbCYD95U1I7Mdoze1BC8;

    .line 86
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 79
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :goto_2
    return-void
.end method

.method public final setActiveValue(Ljava/lang/Byte;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->activeValue:Ljava/lang/Byte;

    return-void
.end method

.method public final setType(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;->type:Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;

    return-void
.end method
