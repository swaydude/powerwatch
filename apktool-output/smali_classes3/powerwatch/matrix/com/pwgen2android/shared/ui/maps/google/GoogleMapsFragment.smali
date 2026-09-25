.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "GoogleMapsFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMapsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "Landroid/view/View$OnTouchListener;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoogleMapsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMapsFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1849#2,2:263\n*S KotlinDebug\n*F\n+ 1 GoogleMapsFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment\n*L\n228#1:263,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u001e\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u0008\u0010\"\u001a\u00020#H\u0014J\u0008\u0010$\u001a\u00020\u0003H\u0014J\u0008\u0010%\u001a\u00020#H\u0014J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u0017J\u0008\u0010.\u001a\u00020\u001cH\u0016J\u0008\u0010/\u001a\u00020\u001cH\u0016J\u001c\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u00010\'2\u0008\u00103\u001a\u0004\u0018\u000104H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMapsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "Landroid/view/View$OnTouchListener;",
        "()V",
        "endLocationMarker",
        "Lcom/google/android/gms/maps/model/Marker;",
        "handler",
        "Landroid/os/Handler;",
        "lastLocation",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "mapInstance",
        "Lcom/google/android/gms/maps/GoogleMap;",
        "mapsViewModel",
        "getMapsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        "mapsViewModel$delegate",
        "Lkotlin/Lazy;",
        "startLocationMarker",
        "computeLocation",
        "nextLocation",
        "step",
        "",
        "runningAnimation",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;",
        "drawColorMap",
        "",
        "googleMap",
        "data",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;",
        "drawMap",
        "getBindingVariable",
        "",
        "getViewModel",
        "layoutRes",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onDestroy",
        "onDestroyView",
        "onTouch",
        "",
        "view",
        "event",
        "Landroid/view/MotionEvent;",
        "Companion",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;

.field private static final ZOOM_ENABLED:Ljava/lang/String;


# instance fields
.field private endLocationMarker:Lcom/google/android/gms/maps/model/Marker;

.field private handler:Landroid/os/Handler;

.field private lastLocation:Lcom/google/android/gms/maps/model/LatLng;

.field private mapInstance:Lcom/google/android/gms/maps/GoogleMap;

.field private final mapsViewModel$delegate:Lkotlin/Lazy;

.field private startLocationMarker:Lcom/google/android/gms/maps/model/Marker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;

    const-string v0, "zoom_enabled"

    .line 252
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->ZOOM_ENABLED:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 35
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 39
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->handler:Landroid/os/Handler;

    .line 45
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$mapsViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$mapsViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getMapInstance$p(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 0

    .line 35
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapInstance:Lcom/google/android/gms/maps/GoogleMap;

    return-object p0
.end method

.method public static final synthetic access$getMapsViewModel(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;
    .locals 0

    .line 35
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getZOOM_ENABLED$cp()Ljava/lang/String;
    .locals 1

    .line 35
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->ZOOM_ENABLED:Ljava/lang/String;

    return-object v0
.end method

.method private final computeLocation(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;D)Lcom/google/android/gms/maps/model/LatLng;
    .locals 6

    .line 173
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 174
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, p2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v4, p2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 172
    invoke-static {v0, v1}, Lcom/google/maps/android/SphericalUtil;->computeHeading(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v0

    .line 177
    new-instance p2, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {p2, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 176
    invoke-static {p2, p3, p4, v0, v1}, Lcom/google/maps/android/SphericalUtil;->computeOffset(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    const-string p2, "computeOffset(\n                LatLng(lastLocation.latitude, lastLocation.longitude),\n                step,\n                heading\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final computeLocation(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 7

    .line 160
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getLastLocation()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getLastLocation()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 161
    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getNextLocation()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getNextLocation()Landroid/location/Location;

    move-result-object v4

    invoke-virtual {v4}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 159
    invoke-static {v0, v1}, Lcom/google/maps/android/SphericalUtil;->computeHeading(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v0

    .line 164
    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getLastLocation()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getLastLocation()Landroid/location/Location;

    move-result-object v5

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    .line 165
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getStep()D

    move-result-wide v3

    .line 163
    invoke-static {v2, v3, v4, v0, v1}, Lcom/google/maps/android/SphericalUtil;->computeOffset(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    const-string v0, "computeOffset(\n                LatLng(runningAnimation.lastLocation.latitude, runningAnimation.lastLocation.longitude),\n                runningAnimation.step,\n                heading\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final drawColorMap(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/GoogleMap;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;",
            ">;)V"
        }
    .end annotation

    .line 225
    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    const-string v1, "#4CD964"

    .line 226
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    .line 228
    check-cast p2, Ljava/lang/Iterable;

    .line 263
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    .line 229
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    goto :goto_0

    .line 231
    :cond_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    return-void
.end method

.method private final drawMap(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/GoogleMap;",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;",
            ">;)V"
        }
    .end annotation

    .line 237
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->drawColorMap(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/List;)V

    const/4 v0, 0x0

    .line 238
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p2

    const/high16 v0, 0x41780000    # 15.5f

    invoke-static {p2, v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;ILcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    return-void
.end method

.method private final getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;
    .locals 1

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    return-object v0
.end method

.method public static synthetic lambda$-_Hxm-UyEKF-XZ1kcSwpPC20dUQ(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-8(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$1TV2x2fsVQH5QUNnXeXpvU4ki50(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;ZLkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;ZLkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$4cQO4VZiID3YM7WF4-bnRWRWkzw(Lkotlin/Pair;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-7$lambda-6(Lkotlin/Pair;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Z)V

    return-void
.end method

.method public static synthetic lambda$M9Jiv7mnRhUPNTDHE44eLuOLoy4(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$ThQimpgeEK7fs36SRzpjvXqi-ds(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/List;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-5(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$WAY0lTJbQvf51fa4dkw5_Df_E-w(Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$dxBzN1FE0nEU8LeS6psEUjTZgrY(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$nQlH3cIjT_RtMPwmBKGktg4JH4w(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method

.method public static synthetic lambda$q_8Px2g8HN6BIqO_5HtBMxMJAqY(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-0(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$ssJS652sw1CsiV3wgL7ixX1h0LE(Ljava/util/List;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-3(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$zCAXZDueJ0Kzp0UPJ8O5T73y_4A(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;->newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-0(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    const/4 p1, 0x1

    invoke-interface {p0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final onCreateView$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lkotlin/Pair;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 140
    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->computeLocation(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    .line 141
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->handler:Landroid/os/Handler;

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$M9Jiv7mnRhUPNTDHE44eLuOLoy4;

    invoke-direct {v2, p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$M9Jiv7mnRhUPNTDHE44eLuOLoy4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/Pair;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final onCreateView$lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/Pair;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$latLng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->startLocationMarker:Lcom/google/android/gms/maps/model/Marker;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 143
    :goto_0
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    .line 144
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapInstance:Lcom/google/android/gms/maps/GoogleMap;

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const/high16 p2, 0x41780000    # 15.5f

    invoke-static {p1, p2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p1

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;ILcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    goto :goto_1

    .line 146
    :cond_2
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapInstance:Lcom/google/android/gms/maps/GoogleMap;

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLng(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p1

    invoke-virtual {p0, p1, v1, v0}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;ILcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    :goto_1
    return-void
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w;

    invoke-direct {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;)V

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    return-void
.end method

.method private static final onCreateView$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Lio/reactivex/ObservableEmitter;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapInstance:Lcom/google/android/gms/maps/GoogleMap;

    .line 94
    invoke-interface {p1, p2}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 95
    invoke-interface {p1}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final onCreateView$lambda-3(Ljava/util/List;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final onCreateView$lambda-4(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error while loading activity maps. Error is: "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-5(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/List;)Lkotlin/Pair;
    .locals 1

    const-string v0, "map"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;ZLkotlin/Pair;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$4cQO4VZiID3YM7WF4-bnRWRWkzw;

    invoke-direct {v1, p2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$4cQO4VZiID3YM7WF4-bnRWRWkzw;-><init>(Lkotlin/Pair;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final onCreateView$lambda-7$lambda-6(Lkotlin/Pair;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Z)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/GoogleMap;

    .line 110
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    .line 112
    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getShowProgressField()Landroidx/databinding/ObservableField;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 113
    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->clear()V

    .line 115
    invoke-direct {p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->drawMap(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/List;)V

    const/4 v0, 0x0

    .line 116
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iput-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->lastLocation:Lcom/google/android/gms/maps/model/LatLng;

    .line 117
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    .line 118
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapInstance:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    const/high16 v4, 0x42f00000    # 120.0f

    invoke-static {v4}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->defaultMarker(F)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    iget-object v4, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->lastLocation:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v4, :cond_4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v1

    :goto_0
    iput-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->startLocationMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 119
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapInstance:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-static {}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->defaultMarker()Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v2

    :goto_1
    iput-object v2, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->endLocationMarker:Lcom/google/android/gms/maps/model/Marker;

    .line 121
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->mapInstance:Lcom/google/android/gms/maps/GoogleMap;

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p2}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    .line 122
    :goto_2
    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getShowProgressField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    :cond_4
    const-string p0, "lastLocation"

    .line 118
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    throw v2
.end method

.method private static final onCreateView$lambda-8(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 35
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;
    .locals 1

    .line 49
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v0

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0066

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->ZOOM_ENABLED:Ljava/lang/String;

    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const p3, 0x7f08026f

    .line 71
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    move-object v0, p0

    check-cast v0, Landroid/view/View$OnTouchListener;

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 75
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p3

    const v0, 0x7f080167

    invoke-virtual {p3, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p3

    if-nez p3, :cond_3

    .line 76
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/FrameLayout;

    if-eqz p2, :cond_2

    .line 79
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$q_8Px2g8HN6BIqO_5HtBMxMJAqY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$q_8Px2g8HN6BIqO_5HtBMxMJAqY;

    invoke-virtual {p3, v1}, Landroid/widget/FrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 84
    :cond_2
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;->newInstance()Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;

    move-result-object p3

    .line 85
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getShowProgressField()Landroidx/databinding/ObservableField;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 87
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v1

    move-object v2, p3

    check-cast v2, Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 89
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 91
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$WAY0lTJbQvf51fa4dkw5_Df_E-w;

    invoke-direct {v1, p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$WAY0lTJbQvf51fa4dkw5_Df_E-w;-><init>(Lpowerwatch/matrix/com/pwgen2android/temp/SupportMapFragment;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)V

    invoke-static {v1}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object p3

    check-cast p3, Lio/reactivex/ObservableSource;

    .line 98
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getLocationsSubject()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$ssJS652sw1CsiV3wgL7ixX1h0LE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$ssJS652sw1CsiV3wgL7ixX1h0LE;

    .line 99
    invoke-virtual {v1, v2}, Lio/reactivex/subjects/BehaviorSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    .line 100
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$zCAXZDueJ0Kzp0UPJ8O5T73y_4A;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$zCAXZDueJ0Kzp0UPJ8O5T73y_4A;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$ThQimpgeEK7fs36SRzpjvXqi-ds;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$ThQimpgeEK7fs36SRzpjvXqi-ds;

    .line 90
    invoke-static {p3, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p3

    const-wide/16 v1, 0x12c

    .line 107
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v1, v2, v3}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p3

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$1TV2x2fsVQH5QUNnXeXpvU4ki50;

    invoke-direct {v1, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$1TV2x2fsVQH5QUNnXeXpvU4ki50;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;Z)V

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$-_Hxm-UyEKF-XZ1kcSwpPC20dUQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$-_Hxm-UyEKF-XZ1kcSwpPC20dUQ;

    invoke-virtual {p3, v1, p2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p2

    .line 89
    invoke-virtual {v0, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 128
    :cond_3
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p2

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getZoomEnabled()Landroidx/databinding/ObservableField;

    move-result-object p2

    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$onCreateView$8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)V

    check-cast p3, Landroidx/databinding/Observable$OnPropertyChangedCallback;

    invoke-virtual {p2, p3}, Landroidx/databinding/ObservableField;->addOnPropertyChangedCallback(Landroidx/databinding/Observable$OnPropertyChangedCallback;)V

    .line 136
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p2

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p3

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getLocationAnimationObservable()Lio/reactivex/Observable;

    move-result-object p3

    .line 137
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p3

    .line 138
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$dxBzN1FE0nEU8LeS6psEUjTZgrY;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/-$$Lambda$GoogleMapsFragment$dxBzN1FE0nEU8LeS6psEUjTZgrY;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;)V

    invoke-virtual {p3, v0}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p3

    .line 136
    invoke-virtual {p2, p3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 152
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    .line 246
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroy()V

    .line 247
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public onDestroyView()V
    .locals 0

    .line 242
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_1

    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, v1, :cond_4

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_2

    :cond_4
    :goto_1
    if-nez p1, :cond_5

    goto :goto_2

    .line 58
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :goto_2
    return v0
.end method
