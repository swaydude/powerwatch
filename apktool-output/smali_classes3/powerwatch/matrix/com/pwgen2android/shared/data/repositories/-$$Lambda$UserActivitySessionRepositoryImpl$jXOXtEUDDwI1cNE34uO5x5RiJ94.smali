.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

.field public final synthetic f$2:Z


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

    iput-boolean p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;->f$2:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

    iget-boolean v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$jXOXtEUDDwI1cNE34uO5x5RiJ94;->f$2:Z

    invoke-static {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->lambda$jXOXtEUDDwI1cNE34uO5x5RiJ94(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Z)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
