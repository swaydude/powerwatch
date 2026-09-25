.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$lGvI7wfw15hraZj0a0bAwVaxNi0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$lGvI7wfw15hraZj0a0bAwVaxNi0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/-$$Lambda$UserActivitySessionRepositoryImpl$lGvI7wfw15hraZj0a0bAwVaxNi0;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;->lambda$lGvI7wfw15hraZj0a0bAwVaxNi0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserActivitySessionRepositoryImpl;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
