.class final Lcom/google/android/play/core/internal/ab;
.super Lcom/google/android/play/core/internal/r;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/internal/z;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/internal/z;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/internal/ab;->a:Lcom/google/android/play/core/internal/z;

    invoke-direct {p0}, Lcom/google/android/play/core/internal/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/internal/ab;->a:Lcom/google/android/play/core/internal/z;

    iget-object v0, v0, Lcom/google/android/play/core/internal/z;->a:Lcom/google/android/play/core/internal/t;

    invoke-static {v0}, Lcom/google/android/play/core/internal/t;->h(Lcom/google/android/play/core/internal/t;)V

    iget-object v0, p0, Lcom/google/android/play/core/internal/ab;->a:Lcom/google/android/play/core/internal/z;

    iget-object v0, v0, Lcom/google/android/play/core/internal/z;->a:Lcom/google/android/play/core/internal/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/t;->a(Lcom/google/android/play/core/internal/t;Landroid/os/IInterface;)Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/play/core/internal/ab;->a:Lcom/google/android/play/core/internal/z;

    iget-object v0, v0, Lcom/google/android/play/core/internal/z;->a:Lcom/google/android/play/core/internal/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/t;->a(Lcom/google/android/play/core/internal/t;Z)Z

    return-void
.end method
