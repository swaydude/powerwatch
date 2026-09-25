.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->lambda$Cp8zCp_EFmgByTzv2-M8Wi3w0sg(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
