.class public Lcom/google/android/play/core/appupdate/AppUpdateManagerFactory;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/content/Context;)Lcom/google/android/play/core/appupdate/AppUpdateManager;
    .locals 2

    new-instance v0, Lcom/google/android/play/core/appupdate/b;

    new-instance v1, Lcom/google/android/play/core/appupdate/c;

    invoke-direct {v1, p0}, Lcom/google/android/play/core/appupdate/c;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, p0}, Lcom/google/android/play/core/appupdate/b;-><init>(Lcom/google/android/play/core/appupdate/c;Landroid/content/Context;)V

    return-object v0
.end method
