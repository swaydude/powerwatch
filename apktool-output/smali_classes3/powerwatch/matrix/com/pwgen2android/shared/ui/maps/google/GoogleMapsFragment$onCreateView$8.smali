.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "GoogleMapsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
        "powerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    .line 128
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 1

    .line 130
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->access$getMapsViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getZoomEnabled()Landroidx/databinding/ObservableField;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 131
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->access$getMapInstance$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object p2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, p1}, Lcom/google/android/gms/maps/UiSettings;->setZoomGesturesEnabled(Z)V

    .line 132
    :goto_1
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->access$getMapInstance$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object v0

    :goto_2
    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/UiSettings;->setScrollGesturesEnabled(Z)V

    :goto_3
    return-void
.end method
