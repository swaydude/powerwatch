.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UpdateInfoRepositoryImpl$bPtA32RaCt8PJWCln2I1v_R8NLw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UpdateInfoRepositoryImpl$bPtA32RaCt8PJWCln2I1v_R8NLw;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UpdateInfoRepositoryImpl$bPtA32RaCt8PJWCln2I1v_R8NLw;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;->lambda$bPtA32RaCt8PJWCln2I1v_R8NLw(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepositoryImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
