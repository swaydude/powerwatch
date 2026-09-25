.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$IvEGMklUoaE3ef06nKt3-Ap8ktc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$IvEGMklUoaE3ef06nKt3-Ap8ktc;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$IvEGMklUoaE3ef06nKt3-Ap8ktc;->f$0:Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;

    check-cast p1, Lkotlin/Triple;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->lambda$IvEGMklUoaE3ef06nKt3-Ap8ktc(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
