.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/CompletableOnSubscribe;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/google/android/gms/fitness/request/SessionInsertRequest;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;->f$1:Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/CompletableEmitter;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;->f$1:Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;->f$2:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->lambda$1txX5Ws1v829VXwa0Ig3-fbthKk(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method
