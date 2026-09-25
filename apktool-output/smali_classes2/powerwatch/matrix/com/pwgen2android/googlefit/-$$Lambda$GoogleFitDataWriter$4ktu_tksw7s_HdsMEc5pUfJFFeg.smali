.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Landroid/content/Context;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;


# direct methods
.method public synthetic constructor <init>(ZLandroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;->f$0:Z

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;->f$1:Landroid/content/Context;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;->f$0:Z

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;->f$1:Landroid/content/Context;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->lambda$4ktu_tksw7s_HdsMEc5pUfJFFeg(ZLandroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
