.class final Lcom/google/android/play/core/splitinstall/testing/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/splitinstall/d;


# instance fields
.field private final synthetic a:Ljava/util/List;

.field private final synthetic b:J

.field private final synthetic c:Z

.field private final synthetic d:Ljava/util/List;

.field private final synthetic e:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;JZLjava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/testing/c;->e:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/testing/c;->a:Ljava/util/List;

    iput-wide p3, p0, Lcom/google/android/play/core/splitinstall/testing/c;->b:J

    iput-boolean p5, p0, Lcom/google/android/play/core/splitinstall/testing/c;->c:Z

    iput-object p6, p0, Lcom/google/android/play/core/splitinstall/testing/c;->d:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/c;->e:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->d(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;)Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/testing/c;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/testing/c;->e:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    iget-wide v0, p0, Lcom/google/android/play/core/splitinstall/testing/c;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v3, 0x5

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/testing/c;->e:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    const/4 v1, 0x6

    invoke-static {v0, v1, p1}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;II)V

    return-void
.end method

.method public final b()V
    .locals 7

    iget-boolean v0, p0, Lcom/google/android/play/core/splitinstall/testing/c;->c:Z

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/testing/c;->e:Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/testing/c;->d:Ljava/util/List;

    iget-object v3, p0, Lcom/google/android/play/core/splitinstall/testing/c;->a:Ljava/util/List;

    iget-wide v4, p0, Lcom/google/android/play/core/splitinstall/testing/c;->b:J

    const/4 v6, 0x1

    invoke-static/range {v1 .. v6}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;->a(Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;Ljava/util/List;Ljava/util/List;JZ)V

    :cond_0
    return-void
.end method
