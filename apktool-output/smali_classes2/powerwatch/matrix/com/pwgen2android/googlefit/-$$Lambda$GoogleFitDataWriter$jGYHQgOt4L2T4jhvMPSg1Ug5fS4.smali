.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4;->f$1:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4;->f$1:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->lambda$jGYHQgOt4L2T4jhvMPSg1Ug5fS4(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
