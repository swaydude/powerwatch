.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$XJwK1u9pUVkcoSysPbzQl52y-Tk;->f$1:Ljava/lang/String;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->lambda$XJwK1u9pUVkcoSysPbzQl52y-Tk(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/String;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
