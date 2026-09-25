.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f$0:Landroidx/recyclerview/widget/RecyclerView;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8;->f$0:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8;->f$0:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/-$$Lambda$NotificationLoggerFragment$8dVI00-8L3vBZVzaxHyR2QOZDH8;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerFragment;->lambda$8dVI00-8L3vBZVzaxHyR2QOZDH8(Landroidx/recyclerview/widget/RecyclerView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLoggerRecyclerAdapter;Landroid/view/View;)V

    return-void
.end method
