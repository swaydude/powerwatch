.class final Lcom/google/android/play/core/internal/u;
.super Lcom/google/android/play/core/internal/r;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/internal/t;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/internal/t;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    invoke-direct {p0}, Lcom/google/android/play/core/internal/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    invoke-static {v0}, Lcom/google/android/play/core/internal/t;->a(Lcom/google/android/play/core/internal/t;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    invoke-static {v0}, Lcom/google/android/play/core/internal/t;->b(Lcom/google/android/play/core/internal/t;)Lcom/google/android/play/core/splitcompat/a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Unbind from service."

    invoke-virtual {v0, v3, v2}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    invoke-static {v0}, Lcom/google/android/play/core/internal/t;->d(Lcom/google/android/play/core/internal/t;)Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    invoke-static {v2}, Lcom/google/android/play/core/internal/t;->c(Lcom/google/android/play/core/internal/t;)Landroid/content/ServiceConnection;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/t;->a(Lcom/google/android/play/core/internal/t;Z)Z

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/t;->a(Lcom/google/android/play/core/internal/t;Landroid/os/IInterface;)Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/t;

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/t;->a(Lcom/google/android/play/core/internal/t;Landroid/content/ServiceConnection;)Landroid/content/ServiceConnection;

    :cond_0
    return-void
.end method
