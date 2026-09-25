.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

.field public final synthetic f$1:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik;->f$1:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik;->f$1:Landroid/content/Context;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->lambda$BPjJdSijsdYBV74XshBDqM1t2ik(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
