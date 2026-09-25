.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$DownloadExecutor$MrdiV72AzryP66vOfk3i6scfRts;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;->lambda$MrdiV72AzryP66vOfk3i6scfRts(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
