.class Lcom/google/android/play/core/appupdate/g;
.super Lcom/google/android/play/core/internal/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/play/core/internal/o;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/android/play/core/tasks/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/tasks/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/play/core/splitcompat/a;

.field private final synthetic c:Lcom/google/android/play/core/appupdate/c;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/appupdate/c;Lcom/google/android/play/core/splitcompat/a;Lcom/google/android/play/core/tasks/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/splitcompat/a;",
            "Lcom/google/android/play/core/tasks/h<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/play/core/appupdate/g;->c:Lcom/google/android/play/core/appupdate/c;

    invoke-direct {p0}, Lcom/google/android/play/core/internal/o;-><init>()V

    iput-object p2, p0, Lcom/google/android/play/core/appupdate/g;->b:Lcom/google/android/play/core/splitcompat/a;

    iput-object p3, p0, Lcom/google/android/play/core/appupdate/g;->a:Lcom/google/android/play/core/tasks/h;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/play/core/appupdate/g;->c:Lcom/google/android/play/core/appupdate/c;

    iget-object p1, p1, Lcom/google/android/play/core/appupdate/c;->a:Lcom/google/android/play/core/internal/t;

    invoke-virtual {p1}, Lcom/google/android/play/core/internal/t;->a()V

    iget-object p1, p0, Lcom/google/android/play/core/appupdate/g;->b:Lcom/google/android/play/core/splitcompat/a;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onRequestInfo"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/play/core/appupdate/g;->c:Lcom/google/android/play/core/appupdate/c;

    iget-object p1, p1, Lcom/google/android/play/core/appupdate/c;->a:Lcom/google/android/play/core/internal/t;

    invoke-virtual {p1}, Lcom/google/android/play/core/internal/t;->a()V

    iget-object p1, p0, Lcom/google/android/play/core/appupdate/g;->b:Lcom/google/android/play/core/splitcompat/a;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onCompleteUpdate"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/play/core/splitcompat/a;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
