.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;
.source "BaiduMapsFragment.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentBaiduMapsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        ">;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "Landroid/view/View$OnTouchListener;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaiduMapsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaiduMapsFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n1547#2:211\n1618#2,3:212\n*S KotlinDebug\n*F\n+ 1 BaiduMapsFragment.kt\npowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment\n*L\n141#1:211\n141#1:212,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \'2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0008\u0010\u0014\u001a\u00020\u0015H\u0014J\u0008\u0010\u0016\u001a\u00020\u0003H\u0014J\u0008\u0010\u0017\u001a\u00020\u0015H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\u0008\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u00192\u0008\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001b\u0010\u0007\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006("
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentBaiduMapsBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "Landroid/view/View$OnTouchListener;",
        "()V",
        "mapsViewModel",
        "getMapsViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;",
        "mapsViewModel$delegate",
        "Lkotlin/Lazy;",
        "computeLocation",
        "Lcom/baidu/mapapi/model/LatLng;",
        "runningAnimation",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;",
        "createColouredBitmap",
        "Lcom/baidu/mapapi/map/BitmapDescriptor;",
        "targetBitmap",
        "Landroid/graphics/Bitmap;",
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
        "onDestroyView",
        "",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;

.field private static final ZOOM_ENABLED:Ljava/lang/String;


# instance fields
.field private final mapsViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;

    const-string v0, "zoom_enabled"

    .line 200
    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->ZOOM_ENABLED:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 33
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;-><init>()V

    .line 36
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$mapsViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$mapsViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->mapsViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getZOOM_ENABLED$cp()Ljava/lang/String;
    .locals 1

    .line 33
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->ZOOM_ENABLED:Ljava/lang/String;

    return-object v0
.end method

.method private final computeLocation(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;)Lcom/baidu/mapapi/model/LatLng;
    .locals 7

    .line 186
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

    .line 187
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

    .line 185
    invoke-static {v0, v1}, Lcom/google/maps/android/SphericalUtil;->computeHeading(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v0

    .line 190
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

    .line 191
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;->getStep()D

    move-result-wide v3

    .line 189
    invoke-static {v2, v3, v4, v0, v1}, Lcom/google/maps/android/SphericalUtil;->computeOffset(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    .line 195
    new-instance v0, Lcom/baidu/mapapi/model/LatLng;

    iget-wide v1, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    return-object v0
.end method

.method private final createColouredBitmap(Landroid/graphics/Bitmap;)Lcom/baidu/mapapi/map/BitmapDescriptor;
    .locals 3

    .line 57
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const v2, 0x7f050087

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 58
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 59
    check-cast v0, Landroid/graphics/ColorFilter;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 61
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v2, 0x0

    .line 62
    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 64
    invoke-static {p1}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object p1

    const-string v0, "fromBitmap(targetBitmap)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;
    .locals 1

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->mapsViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    return-object v0
.end method

.method public static synthetic lambda$3maFENfiV_GGkeAk6x6kCH9OKeQ(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->onCreateView$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;)V

    return-void
.end method

.method public static synthetic lambda$DAQHCNfNY2SKjDxyvR5ioc8MZBc(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;Ljava/util/List;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->onCreateView$lambda-6(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$EBd7lFKKVFzfMe9HXgk9eGzvvf8(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$IM-5RU5yAKj9ePdE2FuUedtFmpU(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$_bA9gNVboMK3HUDziD4szN8ppMc(Ljava/util/List;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->onCreateView$lambda-0(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$mJfOv5YZg7jILqjU-Rxx5ta5EdQ(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/util/List;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->onCreateView$lambda-6$lambda-5(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/util/List;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;)V

    return-void
.end method

.method public static synthetic lambda$y0p4NDGRJwME72CbNhoOSUCn9gw(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/MapStatus$Builder;Lkotlin/Pair;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/MapStatus$Builder;Lkotlin/Pair;)V

    return-void
.end method

.method public static final newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;->newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda-0(Ljava/util/List;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final onCreateView$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/util/List;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$3maFENfiV_GGkeAk6x6kCH9OKeQ;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$3maFENfiV_GGkeAk6x6kCH9OKeQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final onCreateView$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getShowProgressField()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onCreateView$lambda-3(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
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

.method private static final onCreateView$lambda-6(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;Ljava/util/List;)V
    .locals 10

    const-string v0, "this$0"

    move-object v3, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$startPositionMarker"

    move-object v6, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$builder"

    move-object v8, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v9, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$mJfOv5YZg7jILqjU-Rxx5ta5EdQ;

    move-object v1, v9

    move-object v2, p0

    move-object/from16 v4, p6

    move-object v5, p2

    move-object v7, p4

    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$mJfOv5YZg7jILqjU-Rxx5ta5EdQ;-><init>(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/util/List;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;)V

    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final onCreateView$lambda-6$lambda-5(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Ljava/util/List;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$startPositionMarker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$builder"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/BaiduMap;->clear()V

    .line 117
    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getShowProgressField()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    const-string v0, "it"

    .line 119
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    .line 120
    new-instance v2, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-wide v3, v3, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iget-wide v5, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toGPS(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v0

    .line 123
    invoke-virtual {p3, v0}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    .line 125
    iget-object v2, p4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lcom/baidu/mapapi/map/Overlay;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    .line 126
    :goto_0
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v2

    .line 127
    check-cast p3, Lcom/baidu/mapapi/map/OverlayOptions;

    invoke-virtual {v2, p3}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p3

    .line 126
    iput-object p3, p4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 129
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    .line 130
    new-instance p4, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p3

    iget-wide v4, p3, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {p4, v2, v3, v4, v5}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toGPS(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object p3

    .line 131
    invoke-virtual {p5, p3}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    .line 132
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p3

    check-cast p5, Lcom/baidu/mapapi/map/OverlayOptions;

    invoke-virtual {p3, p5}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    .line 134
    invoke-virtual {p6, v0}, Lcom/baidu/mapapi/map/MapStatus$Builder;->target(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapStatus$Builder;

    .line 136
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p3

    invoke-virtual {p6}, Lcom/baidu/mapapi/map/MapStatus$Builder;->build()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object p4

    invoke-static {p4}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newMapStatus(Lcom/baidu/mapapi/map/MapStatus;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    .line 137
    new-instance p3, Lcom/baidu/mapapi/map/PolylineOptions;

    invoke-direct {p3}, Lcom/baidu/mapapi/map/PolylineOptions;-><init>()V

    const/4 p4, 0x6

    .line 138
    invoke-virtual {p3, p4}, Lcom/baidu/mapapi/map/PolylineOptions;->width(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object p3

    .line 139
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const p4, 0x7f050087

    invoke-static {p1, p4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/baidu/mapapi/map/PolylineOptions;->color(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object p1

    .line 140
    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->zIndex(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object p1

    .line 141
    check-cast p2, Ljava/lang/Iterable;

    .line 211
    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p3, Ljava/util/Collection;

    .line 212
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    .line 213
    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;

    .line 141
    new-instance p5, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p6

    iget-wide v0, p6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-virtual {p4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;->getPosition()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p4

    iget-wide v2, p4, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {p5, v0, v1, v2, v3}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toGPS(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 214
    :cond_1
    check-cast p3, Ljava/util/List;

    .line 141
    invoke-virtual {p1, p3}, Lcom/baidu/mapapi/map/PolylineOptions;->points(Ljava/util/List;)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object p1

    .line 142
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p0

    check-cast p1, Lcom/baidu/mapapi/map/OverlayOptions;

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    return-void
.end method

.method private static final onCreateView$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/MapStatus$Builder;Lkotlin/Pair;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$startPositionMarker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$builder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;

    .line 154
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getShowProgressField()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 156
    invoke-direct {p0, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->computeLocation(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ActivityPeriodsModelsKt;->toGPS(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object p0

    .line 157
    invoke-virtual {p1, p0}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    .line 159
    iget-object p5, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p5, Lcom/baidu/mapapi/map/Overlay;

    .line 161
    invoke-virtual {p3}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    .line 162
    check-cast p1, Lcom/baidu/mapapi/map/OverlayOptions;

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p1

    .line 161
    iput-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez p5, :cond_0

    goto :goto_0

    .line 164
    :cond_0
    invoke-virtual {p5}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    .line 166
    :goto_0
    invoke-virtual {p4, p0}, Lcom/baidu/mapapi/map/MapStatus$Builder;->target(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapStatus$Builder;

    const/high16 p0, 0x41780000    # 15.5f

    .line 167
    invoke-virtual {p4, p0}, Lcom/baidu/mapapi/map/MapStatus$Builder;->zoom(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    .line 168
    invoke-virtual {p3}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p0

    invoke-virtual {p4}, Lcom/baidu/mapapi/map/MapStatus$Builder;->build()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object p1

    invoke-static {p1}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newMapStatus(Lcom/baidu/mapapi/map/MapStatus;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

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

    .line 33
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;
    .locals 1

    .line 40
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v0

    return-object v0
.end method

.method protected layoutRes()I
    .locals 1

    const v0, 0x7f0b0043

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-super {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 71
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->ZOOM_ENABLED:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    :goto_0
    if-eqz p2, :cond_1

    const v0, 0x7f08026f

    .line 74
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 76
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    :goto_1
    if-nez v1, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_4
    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    :goto_2
    const v1, 0x7f0700a5

    .line 78
    invoke-static {v1}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromResource(I)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/BitmapDescriptor;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    const/high16 v2, 0x42100000    # 36.0f

    mul-float v0, v0, v2

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    .line 77
    invoke-static {v1, v2, v0, p3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 87
    invoke-static {v0}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v1

    .line 88
    new-instance v2, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v2}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    const-string v3, "resizedBitmap"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->createColouredBitmap(Landroid/graphics/Bitmap;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v0

    .line 89
    new-instance v2, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v2}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v8

    const v1, 0x7f080086

    .line 91
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapapi/map/MapView;

    .line 92
    invoke-virtual {v1, p3}, Lcom/baidu/mapapi/map/MapView;->showZoomControls(Z)V

    .line 94
    new-instance p3, Lcom/baidu/mapapi/map/MapStatus$Builder;

    invoke-direct {p3}, Lcom/baidu/mapapi/map/MapStatus$Builder;-><init>()V

    const/high16 v2, 0x41500000    # 13.0f

    .line 95
    invoke-virtual {p3, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->zoom(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    .line 96
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 99
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/mapapi/map/BaiduMap;->getUiSettings()Lcom/baidu/mapapi/map/UiSettings;

    move-result-object v3

    invoke-virtual {v3, p2}, Lcom/baidu/mapapi/map/UiSettings;->setAllGesturesEnabled(Z)V

    .line 101
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p2

    .line 102
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getLocationsSubject()Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v3

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$_bA9gNVboMK3HUDziD4szN8ppMc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$_bA9gNVboMK3HUDziD4szN8ppMc;

    .line 103
    invoke-virtual {v3, v4}, Lio/reactivex/subjects/BehaviorSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v3

    .line 104
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$EBd7lFKKVFzfMe9HXgk9eGzvvf8;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$EBd7lFKKVFzfMe9HXgk9eGzvvf8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;)V

    invoke-virtual {v3, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v3

    const-wide/16 v4, 0x12c

    .line 109
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v4, v5, v6}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v3

    .line 110
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$IM-5RU5yAKj9ePdE2FuUedtFmpU;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$IM-5RU5yAKj9ePdE2FuUedtFmpU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;)V

    invoke-virtual {v3, v4}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v3

    .line 113
    invoke-virtual {v3}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v10

    .line 114
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$DAQHCNfNY2SKjDxyvR5ioc8MZBc;

    move-object v3, v11

    move-object v4, v1

    move-object v5, p0

    move-object v6, v0

    move-object v7, v2

    move-object v9, p3

    invoke-direct/range {v3 .. v9}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$DAQHCNfNY2SKjDxyvR5ioc8MZBc;-><init>(Lcom/baidu/mapapi/map/MapView;Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MarkerOptions;Lcom/baidu/mapapi/map/MapStatus$Builder;)V

    invoke-virtual {v10, v11}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v3

    .line 101
    invoke-virtual {p2, v3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 149
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p2

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->getLocationAnimationObservable()Lio/reactivex/Observable;

    move-result-object v3

    .line 150
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v9

    .line 151
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$y0p4NDGRJwME72CbNhoOSUCn9gw;

    move-object v3, v10

    move-object v4, p0

    move-object v5, v0

    move-object v6, v2

    move-object v7, v1

    move-object v8, p3

    invoke-direct/range {v3 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/-$$Lambda$BaiduMapsFragment$y0p4NDGRJwME72CbNhoOSUCn9gw;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;Lcom/baidu/mapapi/map/MarkerOptions;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/MapStatus$Builder;)V

    invoke-virtual {v9, v10}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p3

    .line 149
    invoke-virtual {p2, p3}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 173
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getMapsViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;->onCreateView(Landroid/content/Context;)V

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 179
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;->onDestroyView()V

    .line 180
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 47
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

    .line 48
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

    .line 49
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
