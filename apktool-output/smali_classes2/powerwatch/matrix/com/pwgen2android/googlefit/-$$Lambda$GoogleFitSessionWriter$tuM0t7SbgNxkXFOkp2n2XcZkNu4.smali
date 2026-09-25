.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$tuM0t7SbgNxkXFOkp2n2XcZkNu4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$tuM0t7SbgNxkXFOkp2n2XcZkNu4;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$tuM0t7SbgNxkXFOkp2n2XcZkNu4;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    check-cast p1, Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->lambda$tuM0t7SbgNxkXFOkp2n2XcZkNu4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)V

    return-void
.end method
