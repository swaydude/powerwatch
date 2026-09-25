.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$nKDaDZLqRJsnEnn_etfjhfMmXmg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;


# instance fields
.field public final synthetic f$0:Lio/reactivex/SingleEmitter;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$nKDaDZLqRJsnEnn_etfjhfMmXmg;->f$0:Lio/reactivex/SingleEmitter;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/host/-$$Lambda$LocationUpdateProvider$nKDaDZLqRJsnEnn_etfjhfMmXmg;->f$0:Lio/reactivex/SingleEmitter;

    check-cast p1, Landroid/location/Location;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;->lambda$nKDaDZLqRJsnEnn_etfjhfMmXmg(Lio/reactivex/SingleEmitter;Landroid/location/Location;)V

    return-void
.end method
