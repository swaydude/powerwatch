.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/CompletableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;

.field public final synthetic f$1:F

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field public final synthetic f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field public final synthetic f$5:[B


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;FLpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$1:F

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$5:[B

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/CompletableEmitter;)V
    .locals 7

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$1:F

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY;->f$5:[B

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;->lambda$Xea7oL57tPY03GqlCw_XyeJgafY(Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;FLpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;[BLio/reactivex/CompletableEmitter;)V

    return-void
.end method
