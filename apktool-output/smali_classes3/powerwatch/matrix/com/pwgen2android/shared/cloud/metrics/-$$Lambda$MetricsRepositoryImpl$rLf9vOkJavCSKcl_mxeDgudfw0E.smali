.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$rLf9vOkJavCSKcl_mxeDgudfw0E;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$rLf9vOkJavCSKcl_mxeDgudfw0E;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/-$$Lambda$MetricsRepositoryImpl$rLf9vOkJavCSKcl_mxeDgudfw0E;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;->lambda$rLf9vOkJavCSKcl_mxeDgudfw0E(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
