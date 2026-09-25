.class public final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "BiometricsScreenFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3",
        "Landroidx/databinding/Observable$OnPropertyChangedCallback;",
        "onPropertyChanged",
        "",
        "sender",
        "Landroidx/databinding/Observable;",
        "propertyId",
        "",
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
.field final synthetic $currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $dialog:Lcom/google/android/material/bottomsheet/BottomSheetDialog;

.field final synthetic $picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;


# direct methods
.method constructor <init>(Lcom/super_rabbit/wheel_picker/WheelPicker;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/super_rabbit/wheel_picker/WheelPicker;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;",
            "Lcom/google/android/material/bottomsheet/BottomSheetDialog;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$dialog:Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 109
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 0

    .line 111
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->scrollTo(I)V

    .line 112
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getWheelConfig()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object p2, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 113
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getWheelItemCount()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setWheelItemCount(I)V

    .line 114
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getMaxValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setMax(I)V

    .line 115
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getMinValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setMin(I)V

    .line 116
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getAdapter()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/StringPickerAdapter;

    move-result-object p2

    check-cast p2, Lcom/super_rabbit/wheel_picker/WheelAdapter;

    invoke-virtual {p1, p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->setAdapter(Lcom/super_rabbit/wheel_picker/WheelAdapter;)V

    .line 117
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    invoke-virtual {p1}, Lcom/super_rabbit/wheel_picker/WheelPicker;->reset()V

    .line 118
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$picker:Lcom/super_rabbit/wheel_picker/WheelPicker;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getCurrentValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/super_rabbit/wheel_picker/WheelPicker;->scrollToValue(Ljava/lang/String;)V

    .line 119
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$3;->$dialog:Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialog;->show()V

    return-void
.end method
