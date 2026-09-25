.class final Lcom/google/android/play/core/splitinstall/testing/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:J

.field private final synthetic b:Ljava/util/List;

.field private final synthetic c:Ljava/util/List;

.field private final synthetic d:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;JLjava/util/List;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/testing/d;->d:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    iput-wide p2, p0, Lcom/google/android/play/core/splitinstall/testing/d;->a:J

    iput-object p4, p0, Lcom/google/android/play/core/splitinstall/testing/d;->b:Ljava/util/List;

    iput-object p5, p0, Lcom/google/android/play/core/splitinstall/testing/d;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget-wide v0, p0, Lcom/google/android/play/core/splitinstall/testing/d;->a:J

    const-wide/16 v2, 0x3

    div-long/2addr v0, v2

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    :goto_0
    int-to-long v7, v6

    cmp-long v9, v7, v2

    if-gez v9, :cond_0

    iget-wide v7, p0, Lcom/google/android/play/core/splitinstall/testing/d;->a:J

    add-long/2addr v4, v0

    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    iget-object v7, p0, Lcom/google/android/play/core/splitinstall/testing/d;->d:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v13}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    iget-object v7, p0, Lcom/google/android/play/core/splitinstall/testing/d;->d:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    invoke-static {v7}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->b(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager$a;->a()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/d;->d:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->c(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/d;->d:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    const/4 v1, 0x6

    const/4 v2, -0x6

    invoke-static {v0, v1, v2}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;II)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/d;->d:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/testing/d;->b:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/testing/d;->c:Ljava/util/List;

    iget-wide v3, p0, Lcom/google/android/play/core/splitinstall/testing/d;->a:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;Ljava/util/List;J)V

    return-void
.end method
