.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$bt4CsaNz3dKad1eDYCeGQBo7AAY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$bt4CsaNz3dKad1eDYCeGQBo7AAY;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitController$bt4CsaNz3dKad1eDYCeGQBo7AAY;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;->lambda$bt4CsaNz3dKad1eDYCeGQBo7AAY(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
