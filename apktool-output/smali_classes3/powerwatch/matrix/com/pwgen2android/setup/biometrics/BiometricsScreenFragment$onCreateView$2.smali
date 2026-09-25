.class public final Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;
.super Ljava/lang/Object;
.source "BiometricsScreenFragment.kt"

# interfaces
.implements Lcom/super_rabbit/wheel_picker/OnValueChangeListener;


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
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2",
        "Lcom/super_rabbit/wheel_picker/OnValueChangeListener;",
        "onValueChange",
        "",
        "picker",
        "Lcom/super_rabbit/wheel_picker/WheelPicker;",
        "oldVal",
        "",
        "newVal",
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

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onValueChange(Lcom/super_rabbit/wheel_picker/WheelPicker;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "picker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "oldVal"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "newVal"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->$currentConfig:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;->getType()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType;

    move-result-object p1

    .line 100
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Weight;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->access$getBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getWeight()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 101
    :cond_0
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Height;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->access$getBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getHeight()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 102
    :cond_1
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Age;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->access$getBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getAge()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 103
    :cond_2
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Gender;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->access$getBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getGender()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 104
    :cond_3
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelType$Language;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment$onCreateView$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;->access$getBiometricsViewModel(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsScreenFragment;)Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;->getLanguage()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method
