.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/CompletableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lcom/google/android/gms/fitness/data/DataSource;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

.field public final synthetic f$3:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$0:Lcom/google/android/gms/fitness/data/DataSource;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$1:Ljava/util/List;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$3:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/CompletableEmitter;)V
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$0:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$1:Ljava/util/List;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;->f$3:Landroid/content/Context;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->lambda$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method
