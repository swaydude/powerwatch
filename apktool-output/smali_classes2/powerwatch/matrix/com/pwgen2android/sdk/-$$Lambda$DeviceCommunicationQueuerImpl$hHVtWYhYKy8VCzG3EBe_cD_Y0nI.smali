.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->lambda$hHVtWYhYKy8VCzG3EBe_cD_Y0nI(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
