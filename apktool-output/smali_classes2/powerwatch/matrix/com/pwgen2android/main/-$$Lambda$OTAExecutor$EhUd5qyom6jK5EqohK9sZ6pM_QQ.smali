.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    check-cast p1, [B

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->lambda$EhUd5qyom6jK5EqohK9sZ6pM_QQ(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;[B)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
