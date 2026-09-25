.class Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl$3;
.super Ljava/lang/Object;
.source "FragmentMyPowerwatchBindingImpl.java"

# interfaces
.implements Landroidx/databinding/InverseBindingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 215
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange()V
    .locals 5

    .line 220
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;->stravaToggle:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SwitchCompat;->isChecked()Z

    move-result v0

    .line 229
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;

    iget-object v1, v1, Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMyPowerwatchBindingImpl;->mViewModel:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    .line 239
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getStravaStatus()Landroidx/databinding/ObservableField;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    .line 247
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
