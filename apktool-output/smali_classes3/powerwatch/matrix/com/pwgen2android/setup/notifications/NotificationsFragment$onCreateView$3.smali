.class public final Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$3;
.super Landroidx/databinding/Observable$OnPropertyChangedCallback;
.source "NotificationsFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
        "powerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$3",
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
.field final synthetic $adapter:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$3;->$adapter:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 65
    invoke-direct {p0}, Landroidx/databinding/Observable$OnPropertyChangedCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChanged(Landroidx/databinding/Observable;I)V
    .locals 0

    .line 67
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/NotificationsFragment$onCreateView$3;->$adapter:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;->notifyDataSetChanged()V

    :goto_0
    return-void
.end method
