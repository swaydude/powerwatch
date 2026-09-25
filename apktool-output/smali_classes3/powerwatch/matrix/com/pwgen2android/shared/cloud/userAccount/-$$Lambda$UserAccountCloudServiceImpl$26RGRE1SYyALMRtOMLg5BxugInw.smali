.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/-$$Lambda$UserAccountCloudServiceImpl$26RGRE1SYyALMRtOMLg5BxugInw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/-$$Lambda$UserAccountCloudServiceImpl$26RGRE1SYyALMRtOMLg5BxugInw;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/-$$Lambda$UserAccountCloudServiceImpl$26RGRE1SYyALMRtOMLg5BxugInw;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;->lambda$26RGRE1SYyALMRtOMLg5BxugInw(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
