.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$P2dpEA_8wBOODaSgpDWBwBMaQ6w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic f$0:Lio/reactivex/SingleEmitter;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$P2dpEA_8wBOODaSgpDWBwBMaQ6w;->f$0:Lio/reactivex/SingleEmitter;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$P2dpEA_8wBOODaSgpDWBwBMaQ6w;->f$0:Lio/reactivex/SingleEmitter;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lambda$P2dpEA_8wBOODaSgpDWBwBMaQ6w(Lio/reactivex/SingleEmitter;Ljava/lang/Exception;)V

    return-void
.end method
