.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "QRCodeTutorialFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQRCodeTutorialFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRCodeTutorialFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,76:1\n54#2,3:77\n*S KotlinDebug\n*F\n+ 1 QRCodeTutorialFragment.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment\n*L\n21#1:77,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J$\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002J\u0008\u0010\u0013\u001a\u00020\u000bH\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00038FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentCalendarBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;",
        "()V",
        "qrCodeViewModel",
        "getQrCodeViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;",
        "qrCodeViewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "getViewModel",
        "insertImageIntoText",
        "",
        "stepTitleText",
        "Landroid/widget/TextView;",
        "stepOrder",
        "stepBodyText",
        "layoutRes",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;


# instance fields
.field private final qrCodeViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 19
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 21
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$qrCodeViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$qrCodeViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 77
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 79
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 21
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->qrCodeViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final insertImageIntoText(Landroid/widget/TextView;ILandroid/widget/TextView;)V
    .locals 7

    const/4 v0, 0x1

    if-nez p1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const v1, 0x7f0f01c9

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(R.string.tutorial_step)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v2, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v3

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "java.lang.String.format(format, *args)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    if-nez p3, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {p3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_3

    const/16 v2, 0x7b

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p1

    .line 55
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p2

    const/16 v2, 0x7d

    .line 56
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    .line 58
    new-instance v2, Lkotlin/ranges/IntRange;

    invoke-direct {v2, p2, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v2}, Lkotlin/text/StringsKt;->substring(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "{stepOne}"

    .line 59
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const v2, 0x7f07008e

    goto :goto_2

    :cond_2
    const v2, 0x7f07006f

    .line 62
    :goto_2
    new-instance v3, Landroid/text/style/ImageSpan;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v3, v4, v2, v0}, Landroid/text/style/ImageSpan;-><init>(Landroid/content/Context;II)V

    .line 63
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    add-int/2addr v1, v0

    const/16 p1, 0x21

    .line 64
    invoke-virtual {v2, v3, p2, v1, p1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 66
    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;

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

.method public final getQrCodeViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;
    .locals 1

    .line 21
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->qrCodeViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;
    .locals 1

    .line 27
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getQrCodeViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0072

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    move-object p1, p2

    goto :goto_0

    :cond_0
    const p3, 0x7f080227

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 34
    :goto_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getRootView()Landroid/view/View;

    move-result-object p3

    if-nez p3, :cond_1

    move-object p3, p2

    goto :goto_1

    :cond_1
    const v0, 0x7f08022b

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 35
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getRootView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, p2

    goto :goto_2

    :cond_2
    const v1, 0x7f080229

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 37
    :goto_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getRootView()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_3

    move-object v1, p2

    goto :goto_3

    :cond_3
    const v2, 0x7f080226

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 38
    :goto_3
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getRootView()Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_4

    move-object v2, p2

    goto :goto_4

    :cond_4
    const v3, 0x7f08022a

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 39
    :goto_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getRootView()Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    const p2, 0x7f080228

    invoke-virtual {v3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    :goto_5
    const/4 v3, 0x1

    .line 41
    invoke-direct {p0, p1, v3, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->insertImageIntoText(Landroid/widget/TextView;ILandroid/widget/TextView;)V

    const/4 p1, 0x2

    .line 42
    invoke-direct {p0, p3, p1, v2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->insertImageIntoText(Landroid/widget/TextView;ILandroid/widget/TextView;)V

    const/4 p1, 0x3

    .line 43
    invoke-direct {p0, v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->insertImageIntoText(Landroid/widget/TextView;ILandroid/widget/TextView;)V

    .line 46
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRCodeTutorialFragment;->getRootView()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
