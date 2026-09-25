.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "NotificationLoggerFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
        "powerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1",
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
.field final synthetic $adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1;->$adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;

    .line 47
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 0

    .line 49
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1;->$adapter:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;

    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment$onCreateView$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->access$getInternalLoggerViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerViewModel;->getLogsObservableField()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;->setItems(Ljava/util/List;)V

    return-void
.end method
