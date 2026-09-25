.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$y42qyD3HI3dzv8qSwcJgzj0LxB4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$y42qyD3HI3dzv8qSwcJgzj0LxB4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$DeviceRepositoryImpl$y42qyD3HI3dzv8qSwcJgzj0LxB4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;->lambda$y42qyD3HI3dzv8qSwcJgzj0LxB4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepositoryImpl;Ljava/lang/Throwable;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
