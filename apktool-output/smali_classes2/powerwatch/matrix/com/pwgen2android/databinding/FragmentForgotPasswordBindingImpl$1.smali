.class Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$1;
.super Ljava/lang/Object;
.source "FragmentForgotPasswordBindingImpl.java"

# interfaces
.implements Landroidx/databinding/InverseBindingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 39
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange()V
    .locals 5

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->emailEditText:Landroid/widget/EditText;

    invoke-static {v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->getTextString(Landroid/widget/TextView;)Ljava/lang/String;

    move-result-object v0

    .line 53
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;

    iget-object v1, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentForgotPasswordBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    .line 63
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    .line 71
    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
