.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

.field public final synthetic f$1:Lio/reactivex/CompletableEmitter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ;->f$1:Lio/reactivex/CompletableEmitter;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ;->f$1:Lio/reactivex/CompletableEmitter;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->lambda$pUPTiTa1BccvLAM49exbURaO_CQ(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V

    return-void
.end method
