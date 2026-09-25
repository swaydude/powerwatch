.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$vmSJ1rwrDIqt2n8I7Eu7AInKMLs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$vmSJ1rwrDIqt2n8I7Eu7AInKMLs;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OtaProcessExecutorImpl$vmSJ1rwrDIqt2n8I7Eu7AInKMLs;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;->lambda$vmSJ1rwrDIqt2n8I7Eu7AInKMLs(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessExecutorImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
