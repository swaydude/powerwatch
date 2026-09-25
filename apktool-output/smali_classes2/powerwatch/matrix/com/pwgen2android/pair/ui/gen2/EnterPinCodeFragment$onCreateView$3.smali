.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3;
.super Ljava/lang/Object;
.source "EnterPinCodeFragment.kt"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "powerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3",
        "Landroid/text/TextWatcher;",
        "afterTextChanged",
        "",
        "s",
        "Landroid/text/Editable;",
        "beforeTextChanged",
        "",
        "start",
        "",
        "count",
        "after",
        "onTextChanged",
        "before",
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
.field final synthetic $codeEditText:Landroid/widget/EditText;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;


# direct methods
.method constructor <init>(Landroid/widget/EditText;Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3;->$codeEditText:Landroid/widget/EditText;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 71
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3;->$codeEditText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment$onCreateView$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;->access$getEnterPidCodeViewModel(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeFragment;)Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/EnterPinCodeViewModel;->onCodeEntered(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const-string p2, "s"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    const-string p2, "s"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
