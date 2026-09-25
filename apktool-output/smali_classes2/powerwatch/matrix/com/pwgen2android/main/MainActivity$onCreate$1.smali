.class public final Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->onCreate(Landroid/os/Bundle;)V
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
        "powerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    .line 66
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 3

    .line 68
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->access$getMainActivityViewModel(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getFirebaseField()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Pair;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    move-object p1, p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 69
    :goto_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->access$getMainActivityViewModel(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;)Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getFirebaseField()Landroidx/databinding/ObservableField;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 71
    :goto_1
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v0, 0x1

    :goto_3
    if-nez v0, :cond_7

    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    if-eqz v1, :cond_6

    goto :goto_4

    .line 72
    :cond_6
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity$onCreate$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;

    invoke-static {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;->access$showDialog(Lpowerwatch/matrix/com/pwgen2android/main/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_4
    return-void
.end method
