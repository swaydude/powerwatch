.class Lcom/google/android/play/core/splitinstall/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/splitinstall/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/play/core/splitinstall/d;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

.field final synthetic b:Landroid/content/Intent;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/google/android/play/core/splitinstall/n;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;Landroid/content/Intent;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/e;->d:Lcom/google/android/play/core/splitinstall/n;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/e;->a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    iput-object p3, p0, Lcom/google/android/play/core/splitinstall/e;->b:Landroid/content/Intent;

    iput-object p4, p0, Lcom/google/android/play/core/splitinstall/e;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/e;->d:Lcom/google/android/play/core/splitinstall/n;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/e;->a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/play/core/splitinstall/n;->a(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;II)V

    return-void
.end method

.method public a(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/e;->d:Lcom/google/android/play/core/splitinstall/n;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/e;->a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    const/4 v2, 0x6

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/play/core/splitinstall/n;->a(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;II)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/e;->b:Landroid/content/Intent;

    const-string v1, "triggered_from_app_after_verification"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/e;->b:Landroid/content/Intent;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/e;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/e;->b:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/e;->d:Lcom/google/android/play/core/splitinstall/n;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/n;->a(Lcom/google/android/play/core/splitinstall/n;)Lcom/google/android/play/core/splitcompat/a;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "Splits copied and verified more than once."

    invoke-virtual {v0, v2, v1}, Lcom/google/android/play/core/splitcompat/a;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
