.class public final Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "UserActivityViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;Lpowerwatch/matrix/com/pwgen2android/shared/SelectedDateProvider;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V
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
        "powerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    .line 127
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 0

    .line 129
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getMapData()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHasLocations()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->setHasLocations(Z)V

    .line 130
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getMapData()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getHasHeartRates()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;->setHasHeartRate(Z)V

    .line 131
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getMapData()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p1

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel$6;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/UserActivityViewModel;->getMapData()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object p2

    invoke-virtual {p2}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/MapType;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
