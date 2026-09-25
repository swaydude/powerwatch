.class final Lcom/google/android/play/core/splitinstall/testing/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/testing/a;->a:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/a;->a:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Lcom/google/android/play/core/internal/q;

    move-result-object v0

    invoke-static {}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/internal/q;->a(Ljava/lang/Object;)V

    return-void
.end method
