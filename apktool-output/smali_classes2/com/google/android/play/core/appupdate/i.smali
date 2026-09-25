.class final Lcom/google/android/play/core/appupdate/i;
.super Lcom/google/android/play/core/appupdate/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/play/core/appupdate/g<",
        "Lcom/google/android/play/core/appupdate/AppUpdateInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/appupdate/c;Lcom/google/android/play/core/tasks/h;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/tasks/h<",
            "Lcom/google/android/play/core/appupdate/AppUpdateInfo;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/play/core/splitcompat/a;

    const-string v1, "OnRequestInstallCallback"

    invoke-direct {v0, v1}, Lcom/google/android/play/core/splitcompat/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/play/core/appupdate/g;-><init>(Lcom/google/android/play/core/appupdate/c;Lcom/google/android/play/core/splitcompat/a;Lcom/google/android/play/core/tasks/h;)V

    iput-object p3, p0, Lcom/google/android/play/core/appupdate/i;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/android/play/core/appupdate/g;->a(Landroid/os/Bundle;)V

    invoke-static {p1}, Lcom/google/android/play/core/appupdate/c;->a(Landroid/os/Bundle;)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/play/core/appupdate/c;->a(Landroid/os/Bundle;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/appupdate/i;->a:Lcom/google/android/play/core/tasks/h;

    new-instance v1, Lcom/google/android/play/core/install/InstallException;

    invoke-static {p1}, Lcom/google/android/play/core/appupdate/c;->a(Landroid/os/Bundle;)I

    move-result p1

    invoke-direct {v1, p1}, Lcom/google/android/play/core/install/InstallException;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/tasks/h;->a(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/appupdate/i;->a:Lcom/google/android/play/core/tasks/h;

    iget-object v1, p0, Lcom/google/android/play/core/appupdate/i;->b:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/google/android/play/core/appupdate/c;->a(Landroid/os/Bundle;Ljava/lang/String;)Lcom/google/android/play/core/appupdate/AppUpdateInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/tasks/h;->a(Ljava/lang/Object;)Z

    return-void
.end method
