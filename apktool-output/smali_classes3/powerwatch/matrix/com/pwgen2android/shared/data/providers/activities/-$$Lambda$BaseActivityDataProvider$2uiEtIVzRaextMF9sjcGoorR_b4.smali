.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;

.field public final synthetic f$1:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4;->f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/-$$Lambda$BaseActivityDataProvider$2uiEtIVzRaextMF9sjcGoorR_b4;->f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;->lambda$2uiEtIVzRaextMF9sjcGoorR_b4(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/BaseActivityDataProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lpowerwatch/matrix/com/pwgen2android/shared/sync/SyncEvent$SyncFinishedEvent;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
