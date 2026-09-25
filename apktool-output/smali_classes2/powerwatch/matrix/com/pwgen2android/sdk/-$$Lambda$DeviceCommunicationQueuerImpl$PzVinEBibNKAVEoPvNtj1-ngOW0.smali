.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$PzVinEBibNKAVEoPvNtj1-ngOW0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$PzVinEBibNKAVEoPvNtj1-ngOW0;->f$0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$PzVinEBibNKAVEoPvNtj1-ngOW0;->f$0:Ljava/lang/String;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->lambda$PzVinEBibNKAVEoPvNtj1-ngOW0(Ljava/lang/String;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    move-result-object p1

    return-object p1
.end method
