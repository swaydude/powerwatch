.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "QRPairingViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQRPairingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRPairingViewModel.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n286#2,2:62\n286#2,2:64\n*S KotlinDebug\n*F\n+ 1 QRPairingViewModel.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel\n*L\n29#1:62,2\n35#1:64,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0017\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\n\u0010\u0015\u001a\u00020\u0012*\u00020\u0016R\u001c\u0010\t\u001a\u0010\u0012\u000c\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "loginCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;)V",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "extractQRCode",
        "",
        "qrCodeData",
        "",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "onBackClicked",
        "",
        "onPairingFailed",
        "onQRCodeResolved",
        "onPinCodeClicked",
        "Landroid/view/View;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel$Companion;

    .line 58
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;)V
    .locals 1

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "loginCloudService"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x3

    .line 18
    invoke-direct {p0, p2, p2, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 20
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 17
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method private final extractQRCode(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 10

    .line 28
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const-string p1, "\n"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Iterable;

    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    .line 29
    check-cast v4, Ljava/lang/CharSequence;

    const-string v5, "Pair code"

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v4, v5, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 31
    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    const-string p1, " "

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 33
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 64
    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 35
    check-cast v1, Ljava/lang/CharSequence;

    const-string v4, "open?"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v1, v4, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_4
    move-object v0, v3

    :goto_1
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_5

    move-object p1, v3

    goto :goto_2

    .line 36
    :cond_5
    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    const-string p1, "?"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_2
    if-nez p1, :cond_6

    :goto_3
    move-object p1, v3

    goto :goto_4

    :cond_6
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    move-object v4, p1

    check-cast v4, Ljava/lang/CharSequence;

    const-string p1, "="

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_4
    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    :goto_5
    return-object v3
.end method


# virtual methods
.method public final onBackClicked()V
    .locals 1

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onPairingFailed()V
    .locals 8

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingFailedFragment;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801aa

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onPinCodeClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801aa

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onQRCodeResolved(Ljava/lang/String;)V
    .locals 8

    const-string v0, "qrCodeData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->extractQRCode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressFragment$Companion;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801aa

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
