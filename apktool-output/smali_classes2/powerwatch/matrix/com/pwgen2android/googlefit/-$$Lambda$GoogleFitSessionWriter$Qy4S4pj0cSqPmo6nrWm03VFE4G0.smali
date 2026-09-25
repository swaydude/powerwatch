.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$Qy4S4pj0cSqPmo6nrWm03VFE4G0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$Qy4S4pj0cSqPmo6nrWm03VFE4G0;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$Qy4S4pj0cSqPmo6nrWm03VFE4G0;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->lambda$Qy4S4pj0cSqPmo6nrWm03VFE4G0(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
