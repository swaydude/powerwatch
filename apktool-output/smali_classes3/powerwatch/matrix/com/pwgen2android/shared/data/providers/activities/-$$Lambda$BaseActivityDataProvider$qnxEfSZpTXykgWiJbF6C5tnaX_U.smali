.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$qnxEfSZpTXykgWiJbF6C5tnaX_U;->f$1:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->lambda$qnxEfSZpTXykgWiJbF6C5tnaX_U(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
