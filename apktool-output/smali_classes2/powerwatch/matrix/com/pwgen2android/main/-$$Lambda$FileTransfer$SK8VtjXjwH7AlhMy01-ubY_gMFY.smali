.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;ZLpowerwatch/matrix/com/pwgen2android/main/FileTransfer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;->f$1:Z

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;->f$1:Z

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;->lambda$SK8VtjXjwH7AlhMy01-ubY_gMFY(Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;ZLpowerwatch/matrix/com/pwgen2android/main/FileTransfer;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
