.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

.field public final synthetic f$1:Lio/reactivex/ObservableEmitter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w;->f$1:Lio/reactivex/ObservableEmitter;

    return-void
.end method


# virtual methods
.method public final onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w;->f$1:Lio/reactivex/ObservableEmitter;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->lambda$nQlH3cIjT_RtMPwmBKGktg4JH4w(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method
