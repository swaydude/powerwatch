.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

.field public final synthetic f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic f$2:Lio/reactivex/SingleEmitter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;->f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;->f$2:Lio/reactivex/SingleEmitter;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;->f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE;->f$2:Lio/reactivex/SingleEmitter;

    check-cast p1, Lcom/google/android/gms/location/LocationSettingsResponse;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lambda$7lpFzmEIHsKnzk0U5IKMMuA3drE(Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;Lkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;Lcom/google/android/gms/location/LocationSettingsResponse;)V

    return-void
.end method
