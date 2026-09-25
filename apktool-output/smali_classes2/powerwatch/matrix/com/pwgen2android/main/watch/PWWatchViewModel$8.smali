.class public final Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "PWWatchViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeUIStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V
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
        "powerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8",
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
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    .line 199
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 0

    .line 201
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->access$getFragmentWeakReference$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    if-nez p1, :cond_0

    return-void

    .line 203
    :cond_0
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->getGoogleFitStatus()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 204
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->access$getGoogleFitController$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    move-result-object p2

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->authorize(Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    .line 206
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel$8;->this$0:Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;->access$getGoogleFitController$p(Lpowerwatch/matrix/com/pwgen2android/main/watch/PWWatchViewModel;)Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->disable()V

    :goto_0
    return-void
.end method
