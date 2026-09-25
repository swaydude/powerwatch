.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$mTnsw4JYaomGNnu4nxdyOoUNSH0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$mTnsw4JYaomGNnu4nxdyOoUNSH0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$mTnsw4JYaomGNnu4nxdyOoUNSH0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda$mTnsw4JYaomGNnu4nxdyOoUNSH0(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    move-result-object p1

    return-object p1
.end method
