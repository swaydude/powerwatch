.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "BannerFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
        "powerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1",
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
.field final synthetic $bannerImage:Landroid/widget/ImageView;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;Landroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1;->$bannerImage:Landroid/widget/ImageView;

    .line 38
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 0

    .line 40
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;->access$getBannerViewModel(Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment;)Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerViewModel;->getImageField()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    return-void

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 41
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerFragment$onCreateView$1;->$bannerImage:Landroid/widget/ImageView;

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method
