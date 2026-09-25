.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

.field public final synthetic f$2:Z


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;->f$2:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;->f$0:Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/-$$Lambda$NotificationsRecyclerViewAdapter$toggleListener$1$oOmUqEgOqFA94qqim2wgqVls-YI;->f$2:Z

    check-cast p1, Lcom/tbruyelle/rxpermissions2/Permission;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter$toggleListener$1;->lambda$oOmUqEgOqFA94qqim2wgqVls-YI(Lpowerwatch/matrix/com/pwgen2android/setup/notifications/ui/NotificationsRecyclerViewAdapter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;ZLcom/tbruyelle/rxpermissions2/Permission;)V

    return-void
.end method
