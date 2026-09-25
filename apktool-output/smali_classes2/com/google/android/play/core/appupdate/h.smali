.class final Lcom/google/android/play/core/appupdate/h;
.super Lcom/google/android/play/core/internal/r;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/tasks/h;

.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:Lcom/google/android/play/core/appupdate/c;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/appupdate/c;Lcom/google/android/play/core/tasks/h;Lcom/google/android/play/core/tasks/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/appupdate/h;->c:Lcom/google/android/play/core/appupdate/c;

    iput-object p3, p0, Lcom/google/android/play/core/appupdate/h;->a:Lcom/google/android/play/core/tasks/h;

    iput-object p4, p0, Lcom/google/android/play/core/appupdate/h;->b:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/play/core/internal/r;-><init>(Lcom/google/android/play/core/tasks/h;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/appupdate/h;->c:Lcom/google/android/play/core/appupdate/c;

    iget-object v0, v0, Lcom/google/android/play/core/appupdate/c;->a:Lcom/google/android/play/core/internal/t;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/t;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/internal/l;

    iget-object v1, p0, Lcom/google/android/play/core/appupdate/h;->c:Lcom/google/android/play/core/appupdate/c;

    invoke-static {v1}, Lcom/google/android/play/core/appupdate/c;->a(Lcom/google/android/play/core/appupdate/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/play/core/appupdate/c;->b()Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Lcom/google/android/play/core/appupdate/j;

    iget-object v4, p0, Lcom/google/android/play/core/appupdate/h;->c:Lcom/google/android/play/core/appupdate/c;

    iget-object v5, p0, Lcom/google/android/play/core/appupdate/h;->a:Lcom/google/android/play/core/tasks/h;

    invoke-direct {v3, v4, v5}, Lcom/google/android/play/core/appupdate/j;-><init>(Lcom/google/android/play/core/appupdate/c;Lcom/google/android/play/core/tasks/h;)V

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/play/core/internal/l;->b(Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/play/core/internal/p;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/appupdate/c;->a()Lcom/google/android/play/core/splitcompat/a;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/play/core/appupdate/h;->b:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "completeUpdate(%s)"

    invoke-virtual {v1, v0, v3, v2}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lcom/google/android/play/core/appupdate/h;->a:Lcom/google/android/play/core/tasks/h;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/tasks/h;->a(Ljava/lang/Exception;)Z

    return-void
.end method
