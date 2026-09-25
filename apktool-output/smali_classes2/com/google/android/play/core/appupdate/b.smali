.class final Lcom/google/android/play/core/appupdate/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/appupdate/AppUpdateManager;


# instance fields
.field private final a:Lcom/google/android/play/core/appupdate/c;

.field private final b:Lcom/google/android/play/core/appupdate/a;

.field private final c:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/appupdate/c;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/appupdate/b;->a:Lcom/google/android/play/core/appupdate/c;

    new-instance p1, Lcom/google/android/play/core/appupdate/a;

    invoke-direct {p1, p2}, Lcom/google/android/play/core/appupdate/a;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/android/play/core/appupdate/b;->b:Lcom/google/android/play/core/appupdate/a;

    iput-object p2, p0, Lcom/google/android/play/core/appupdate/b;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final completeUpdate()Lcom/google/android/play/core/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/play/core/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/appupdate/b;->a:Lcom/google/android/play/core/appupdate/c;

    iget-object v1, p0, Lcom/google/android/play/core/appupdate/b;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/appupdate/c;->b(Ljava/lang/String;)Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final getAppUpdateInfo()Lcom/google/android/play/core/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/play/core/tasks/Task<",
            "Lcom/google/android/play/core/appupdate/AppUpdateInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/appupdate/b;->a:Lcom/google/android/play/core/appupdate/c;

    iget-object v1, p0, Lcom/google/android/play/core/appupdate/b;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/appupdate/c;->a(Ljava/lang/String;)Lcom/google/android/play/core/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized registerListener(Lcom/google/android/play/core/install/InstallStateUpdatedListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/appupdate/b;->b:Lcom/google/android/play/core/appupdate/a;

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/appupdate/a;->a(Lcom/google/android/play/core/listener/StateUpdatedListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final startUpdateFlowForResult(Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILandroid/app/Activity;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/play/core/appupdate/d;

    invoke-direct {v0, p3}, Lcom/google/android/play/core/appupdate/d;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p0, p1, p2, v0, p4}, Lcom/google/android/play/core/appupdate/b;->startUpdateFlowForResult(Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILcom/google/android/play/core/common/IntentSenderForResultStarter;I)Z

    move-result p1

    return p1
.end method

.method public final startUpdateFlowForResult(Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILcom/google/android/play/core/common/IntentSenderForResultStarter;I)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/IntentSender$SendIntentException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->isUpdateTypeAllowed(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->e()Landroid/app/PendingIntent;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-ne p2, v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/play/core/appupdate/AppUpdateInfo;->d()Landroid/app/PendingIntent;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p3

    move v3, p4

    invoke-interface/range {v1 .. v8}, Lcom/google/android/play/core/common/IntentSenderForResultStarter;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return v0
.end method

.method public final declared-synchronized unregisterListener(Lcom/google/android/play/core/install/InstallStateUpdatedListener;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/appupdate/b;->b:Lcom/google/android/play/core/appupdate/a;

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/appupdate/a;->b(Lcom/google/android/play/core/listener/StateUpdatedListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
