.class public final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "BiometricsScreenFragment.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u0003H\u0014J\u0008\u0010\r\u001a\u00020\u000bH\u0014J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragementBiometricsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "()V",
        "biometricsViewModel",
        "getBiometricsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;",
        "biometricsViewModel$delegate",
        "Lkotlin/Lazy;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;


# instance fields
.field private final biometricsViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 59
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 55
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 59
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$biometricsViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$biometricsViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->biometricsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 0

    .line 55
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p0

    return-object p0
.end method

.method private final getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 1

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->biometricsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    return-object v0
.end method

.method public static synthetic lambda$3pK56mUZ3ecd5-A6Li99esU2Z9Y(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->onCreateView$lambda-0(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$MuosfboD-SZe3lZwaZjykFT7Z7U(Lcom/google/android/material/bottomsheet/BottomSheetDialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->onCreateView$lambda-1(Lcom/google/android/material/bottomsheet/BottomSheetDialog;Landroid/view/View;)V

    return-void
.end method

.method public static final newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    move-result-object v0

    return-object v0
.end method

.method private static final onCreateView$lambda-0(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 77
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 81
    :cond_1
    invoke-virtual {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    return v1
.end method

.method private static final onCreateView$lambda-1(Lcom/google/android/material/bottomsheet/BottomSheetDialog;Landroid/view/View;)V
    .locals 0

    const-string p1, "$dialog"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->dismiss()V

    return-void
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

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;
    .locals 1

    .line 64
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->getBiometricsViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 55
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0040

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/-$$Lambda$BiometricsScreenFragment$3pK56mUZ3ecd5-A6Li99esU2Z9Y;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/-$$Lambda$BiometricsScreenFragment$3pK56mUZ3ecd5-A6Li99esU2Z9Y;

    const v0, 0x7f0b0045

    const/4 v1, 0x0

    .line 85
    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 87
    sget v0, Lpowerwatch/matrix/com/pwgen2android/R$id;->biometrics_picker:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/super_rabbit/wheel_picker/WheelPicker;

    .line 88
    new-instance v1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 89
    invoke-virtual {v1, p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->setContentView(Landroid/view/View;)V

    const/4 v2, 0x0

    .line 91
    invoke-virtual {v1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->setCancelable(Z)V

    .line 92
    sget v2, Lpowerwatch/matrix/com/pwgen2android/R$id;->close_button:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/-$$Lambda$BiometricsScreenFragment$MuosfboD-SZe3lZwaZjykFT7Z7U;

    invoke-direct {v2, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/-$$Lambda$BiometricsScreenFragment$MuosfboD-SZe3lZwaZjykFT7Z7U;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    move-object v3, v2

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const/4 v10, 0x0

    move-object v2, v11

    invoke-direct/range {v2 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v11, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 96
    invoke-virtual {v0, p3}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 97
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;

    invoke-direct {p3, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)V

    check-cast p3, Lcom/super_rabbit/wheel_picker/OnValueChangeListener;

    invoke-virtual {v0, p3}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setOnValueChangeListener(Lcom/super_rabbit/wheel_picker/OnValueChangeListener;)V

    .line 109
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getWheelConfig()Landroidx/databinding/ObservableField;

    move-result-object p3

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;

    invoke-direct {v2, v0, p1, p0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;-><init>(Lcom/super_rabbit/wheel_picker/WheelPicker;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V

    check-cast v2, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p3, v2}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    return-object p2
.end method
