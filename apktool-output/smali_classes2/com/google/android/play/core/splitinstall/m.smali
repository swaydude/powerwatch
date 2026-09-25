.class final Lcom/google/android/play/core/splitinstall/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

.field private final synthetic b:I

.field private final synthetic c:I

.field private final synthetic d:Lcom/google/android/play/core/splitinstall/n;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/m;->d:Lcom/google/android/play/core/splitinstall/n;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/m;->a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    iput p3, p0, Lcom/google/android/play/core/splitinstall/m;->b:I

    iput p4, p0, Lcom/google/android/play/core/splitinstall/m;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/m;->d:Lcom/google/android/play/core/splitinstall/n;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/m;->a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    iget v4, p0, Lcom/google/android/play/core/splitinstall/m;->b:I

    iget v5, p0, Lcom/google/android/play/core/splitinstall/m;->c:I

    new-instance v14, Lcom/google/android/play/core/splitinstall/b;

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->sessionId()I

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->bytesDownloaded()J

    move-result-wide v6

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->totalBytesToDownload()J

    move-result-wide v8

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->b()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->resolutionIntent()Landroid/app/PendingIntent;

    move-result-object v12

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->c()Ljava/util/List;

    move-result-object v13

    move-object v2, v14

    invoke-direct/range {v2 .. v13}, Lcom/google/android/play/core/splitinstall/b;-><init>(IIIJJLjava/util/List;Ljava/util/List;Landroid/app/PendingIntent;Ljava/util/List;)V

    invoke-virtual {v0, v14}, Lcom/google/android/play/core/splitinstall/n;->a(Ljava/lang/Object;)V

    return-void
.end method
