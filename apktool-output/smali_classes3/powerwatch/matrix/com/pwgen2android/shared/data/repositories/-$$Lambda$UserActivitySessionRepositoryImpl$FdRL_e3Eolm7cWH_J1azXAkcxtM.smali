.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

.field public final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$FdRL_e3Eolm7cWH_J1azXAkcxtM;->f$1:Ljava/util/List;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->lambda$FdRL_e3Eolm7cWH_J1azXAkcxtM(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p1

    return-object p1
.end method
