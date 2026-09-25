.class public Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManagerFactory;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/content/Context;Ljava/io/File;)Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;
    .locals 1

    :try_start_0
    new-instance v0, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;

    invoke-direct {v0, p0, p1}, Lcom/google/android/play/core/splitinstall/testing/FakeSplitInstallManager;-><init>(Landroid/content/Context;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
