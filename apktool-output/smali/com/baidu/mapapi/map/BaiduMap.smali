.class public Lcom/baidu/mapapi/map/BaiduMap;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/map/BaiduMap$OnSynchronizationListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderValidDataListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapDrawFrameCallback;,
        Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMyLocationClickListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMarkerDragListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnPolylineClickListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMarkerClickListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapLongClickListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapDoubleClickListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderCallback;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapLoadedCallback;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapClickListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;,
        Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;
    }
.end annotation


# static fields
.field public static final MAP_TYPE_NONE:I = 0x3

.field public static final MAP_TYPE_NORMAL:I = 0x1

.field public static final MAP_TYPE_SATELLITE:I = 0x2

.field private static final e:Ljava/lang/String; = "BaiduMap"

.field public static mapStatusReason:I


# instance fields
.field private A:Lcom/baidu/mapapi/map/BaiduMap$OnMyLocationClickListener;

.field private B:Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;

.field private C:Lcom/baidu/mapapi/map/BaiduMap$OnMapDrawFrameCallback;

.field private D:Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;

.field private E:Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderValidDataListener;

.field private F:Lcom/baidu/mapapi/map/BaiduMap$OnSynchronizationListener;

.field private G:Lcom/baidu/mapapi/map/TileOverlay;

.field private H:Lcom/baidu/mapapi/map/HeatMap;

.field private I:Ljava/util/concurrent/locks/Lock;

.field private J:Ljava/util/concurrent/locks/Lock;

.field private K:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/baidu/mapapi/map/InfoWindow;",
            ">;"
        }
    .end annotation
.end field

.field private L:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/baidu/mapapi/map/InfoWindow;",
            "Lcom/baidu/mapapi/map/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private M:Lcom/baidu/mapapi/map/Marker;

.field private N:Lcom/baidu/mapapi/map/MyLocationData;

.field private O:Lcom/baidu/mapapi/map/MyLocationConfiguration;

.field private P:Z

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Landroid/graphics/Point;

.field a:Lcom/baidu/mapapi/map/MapView;

.field b:Lcom/baidu/mapapi/map/TextureMapView;

.field c:Lcom/baidu/mapapi/map/WearMapView;

.field d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

.field private f:Lcom/baidu/mapapi/map/Projection;

.field private g:Lcom/baidu/mapapi/map/UiSettings;

.field private h:Lcom/baidu/mapsdkplatform/comapi/map/l;

.field private i:Lcom/baidu/mapsdkplatform/comapi/map/e;

.field private j:Lcom/baidu/mapsdkplatform/comapi/map/ae;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/Overlay;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/InfoWindow;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lcom/baidu/mapapi/map/Overlay$a;

.field private p:Lcom/baidu/mapapi/map/InfoWindow$a;

.field private q:Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;

.field private r:Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;

.field private s:Lcom/baidu/mapapi/map/BaiduMap$OnMapClickListener;

.field private t:Lcom/baidu/mapapi/map/BaiduMap$OnMapLoadedCallback;

.field private u:Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderCallback;

.field private v:Lcom/baidu/mapapi/map/BaiduMap$OnMapDoubleClickListener;

.field private w:Lcom/baidu/mapapi/map/BaiduMap$OnMapLongClickListener;

.field private x:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/baidu/mapapi/map/BaiduMap$OnMarkerClickListener;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/baidu/mapapi/map/BaiduMap$OnPolylineClickListener;",
            ">;"
        }
    .end annotation
.end field

.field private z:Lcom/baidu/mapapi/map/BaiduMap$OnMarkerDragListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lcom/baidu/mapsdkplatform/comapi/map/ae;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->y:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->J:Ljava/util/concurrent/locks/Lock;

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->j:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->b()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    sget-object p1, Lcom/baidu/mapsdkplatform/comapi/map/ac;->b:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-direct {p0}, Lcom/baidu/mapapi/map/BaiduMap;->c()V

    return-void
.end method

.method constructor <init>(Lcom/baidu/mapsdkplatform/comapi/map/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->y:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->J:Ljava/util/concurrent/locks/Lock;

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a()Lcom/baidu/mapsdkplatform/comapi/map/e;

    move-result-object p1

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    sget-object p1, Lcom/baidu/mapsdkplatform/comapi/map/ac;->a:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-direct {p0}, Lcom/baidu/mapapi/map/BaiduMap;->c()V

    return-void
.end method

.method static synthetic A(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/TileOverlay;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->G:Lcom/baidu/mapapi/map/TileOverlay;

    return-object p0
.end method

.method private a(Ljava/lang/String;)Landroid/graphics/Point;
    .locals 10

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "^\\{"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\}$"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    aget-object v6, p1, v3

    const-string v7, "\""

    invoke-virtual {v6, v7, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    aget-object v7, v6, v2

    const-string v8, "x"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_1

    aget-object v4, v6, v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_1
    aget-object v7, v6, v2

    const-string v9, "y"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    aget-object v5, v6, v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    return-object p1
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/map/Marker;)Lcom/baidu/mapapi/map/Marker;
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->M:Lcom/baidu/mapapi/map/Marker;

    return-object p1
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/map/Projection;)Lcom/baidu/mapapi/map/Projection;
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->f:Lcom/baidu/mapapi/map/Projection;

    return-object p1
.end method

.method private a(Lcom/baidu/mapapi/map/MapStatusUpdate;)Lcom/baidu/mapsdkplatform/comapi/map/ad;
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/baidu/mapapi/map/MapStatusUpdate;->a(Lcom/baidu/mapsdkplatform/comapi/map/e;Lcom/baidu/mapapi/map/MapStatus;)Lcom/baidu/mapapi/map/MapStatus;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/MapStatus;->b(Lcom/baidu/mapsdkplatform/comapi/map/ad;)Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object p1

    return-object p1
.end method

.method private a(I)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    packed-switch p1, :pswitch_data_0

    const-string p1, ""

    goto :goto_0

    :pswitch_0
    const-string p1, "SSL\u63e1\u624b\u8d85\u65f6"

    goto :goto_0

    :pswitch_1
    const-string p1, "SSL\u63e1\u624b\u9519\u8bef"

    goto :goto_0

    :pswitch_2
    const-string p1, "\u7f51\u7edc\u5199\u9519\u8bef"

    goto :goto_0

    :pswitch_3
    const-string p1, "DNS\u89e3\u6790\u8d85\u65f6"

    goto :goto_0

    :pswitch_4
    const-string p1, "DNS\u89e3\u6790\u9519\u8bef"

    goto :goto_0

    :pswitch_5
    const-string p1, "\u7f51\u7edc\u63a5\u6536\u8d85\u65f6"

    goto :goto_0

    :pswitch_6
    const-string p1, "\u7f51\u7edc\u53d1\u9001\u8d85\u65f6"

    goto :goto_0

    :pswitch_7
    const-string p1, "\u7f51\u7edc\u8fde\u63a5\u8d85\u65f6"

    goto :goto_0

    :pswitch_8
    const-string p1, "\u7f51\u7edc\u8d85\u65f6\u9519\u8bef"

    goto :goto_0

    :pswitch_9
    const-string p1, "\u8bf7\u6c42\u53d6\u6d88"

    goto :goto_0

    :pswitch_a
    const-string p1, "\u6570\u636e\u4e0d\u4e00\u81f4"

    goto :goto_0

    :pswitch_b
    const-string p1, "\u5f53\u524d\u7f51\u7edc\u7c7b\u578b\u6709\u95ee\u9898"

    goto :goto_0

    :pswitch_c
    const-string p1, "\u8fd4\u56de\u54cd\u5e94\u6570\u636e\u8fc7\u5927\uff0c\u6570\u636e\u6ea2\u51fa"

    goto :goto_0

    :pswitch_d
    const-string p1, "\u54cd\u5e94\u6570\u636e\u8bfb\u53d6\u5931\u8d25"

    goto :goto_0

    :pswitch_e
    const-string p1, "\u8bf7\u6c42\u53d1\u9001\u9519\u8bef"

    goto :goto_0

    :pswitch_f
    const-string p1, "\u7f51\u7edc\u8fde\u63a5\u9519\u8bef"

    goto :goto_0

    :cond_0
    const-string p1, "\u6570\u636e\u8bf7\u6c42\u6210\u529f"

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x3ec
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/BaiduMap;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->k:Ljava/util/List;

    return-object p0
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/map/InfoWindow;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->a(Lcom/baidu/mapapi/map/InfoWindow;)V

    return-void
.end method

.method private a(Lcom/baidu/mapapi/map/InfoWindow;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_9

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    iget-boolean v3, p1, Lcom/baidu/mapapi/map/InfoWindow;->j:Z

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->destroyDrawingCache()V

    new-instance v3, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    invoke-direct {v3}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;-><init>()V

    sget-object v4, Lcom/baidu/mapapi/map/MapViewLayoutParams$ELayoutMode;->mapMode:Lcom/baidu/mapapi/map/MapViewLayoutParams$ELayoutMode;

    invoke-virtual {v3, v4}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->layoutMode(Lcom/baidu/mapapi/map/MapViewLayoutParams$ELayoutMode;)Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    move-result-object v3

    iget-object v4, p1, Lcom/baidu/mapapi/map/InfoWindow;->c:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v3, v4}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    move-result-object v3

    iget v4, p1, Lcom/baidu/mapapi/map/InfoWindow;->f:I

    invoke-virtual {v3, v4}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->yOffset(I)Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->build()Lcom/baidu/mapapi/map/MapViewLayoutParams;

    move-result-object v3

    sget-object v4, Lcom/baidu/mapapi/map/f;->b:[I

    iget-object v5, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-virtual {v5}, Lcom/baidu/mapsdkplatform/comapi/map/ac;->ordinal()I

    move-result v5

    aget v4, v4, v5

    if-eq v4, v1, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    if-eqz v4, :cond_4

    invoke-virtual {v4, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    iget-object v4, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v4, v0, v3}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_3
    iget-object v4, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    if-eqz v4, :cond_4

    invoke-virtual {v4, v0}, Lcom/baidu/mapapi/map/TextureMapView;->removeView(Landroid/view/View;)V

    iget-object v4, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-virtual {v4, v0, v3}, Lcom/baidu/mapapi/map/TextureMapView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    :goto_0
    iget-boolean v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->i:Z

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    :goto_1
    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->b(Lcom/baidu/mapapi/map/InfoWindow;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v3

    iget-object v4, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/baidu/mapapi/map/Marker;

    if-eqz v4, :cond_8

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    iget-object v6, p1, Lcom/baidu/mapapi/map/InfoWindow;->a:Lcom/baidu/mapapi/map/BitmapDescriptor;

    if-eqz v6, :cond_7

    sget-object v6, Lcom/baidu/mapsdkplatform/comapi/map/j;->b:Lcom/baidu/mapsdkplatform/comapi/map/j;

    iput-object v6, v4, Lcom/baidu/mapapi/map/Marker;->type:Lcom/baidu/mapsdkplatform/comapi/map/j;

    iput-object v3, v4, Lcom/baidu/mapapi/map/Marker;->b:Lcom/baidu/mapapi/map/BitmapDescriptor;

    iget-object v3, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    const-string v6, "draw_with_view"

    if-eqz v3, :cond_6

    invoke-virtual {v5, v6, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_7
    :goto_2
    iget-object p1, p1, Lcom/baidu/mapapi/map/InfoWindow;->c:Lcom/baidu/mapapi/model/LatLng;

    iput-object p1, v4, Lcom/baidu/mapapi/map/Marker;->a:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v4, v5}, Lcom/baidu/mapapi/map/Marker;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz p1, :cond_8

    if-eqz v0, :cond_8

    invoke-virtual {p1, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(Landroid/os/Bundle;)V

    :cond_8
    return-void

    :cond_9
    :goto_3
    invoke-virtual {p0, p1, v2}, Lcom/baidu/mapapi/map/BaiduMap;->showInfoWindow(Lcom/baidu/mapapi/map/InfoWindow;Z)V

    return-void
.end method

.method private final a(Lcom/baidu/mapapi/map/MyLocationData;Lcom/baidu/mapapi/map/MyLocationConfiguration;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "direction_wheel"

    const-string v4, "iconarrowfocid"

    const-string v5, "iconarrowfoc"

    const-string v6, "iconarrownorid"

    const-string v7, "iconarrownor"

    const-string v8, "direction"

    const-string v9, "radius"

    const-string v10, "pty"

    const-string v11, "ptx"

    if-eqz v2, :cond_c

    if-eqz v3, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapapi/map/BaiduMap;->isMyLocationEnabled()Z

    move-result v12

    if-nez v12, :cond_0

    goto/16 :goto_7

    :cond_0
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lcom/baidu/mapapi/model/LatLng;

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    iget-wide v4, v2, Lcom/baidu/mapapi/map/MyLocationData;->latitude:D

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    iget-wide v6, v2, Lcom/baidu/mapapi/map/MyLocationData;->longitude:D

    invoke-direct {v1, v4, v5, v6, v7}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v1}, Lcom/baidu/mapapi/model/CoordUtil;->ll2mc(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v4

    const/4 v5, 0x0

    :try_start_0
    const-string v6, "type"

    invoke-virtual {v12, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v4}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v6

    invoke-virtual {v14, v11, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    invoke-virtual {v4}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v6

    invoke-virtual {v14, v10, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    iget v6, v2, Lcom/baidu/mapapi/map/MyLocationData;->accuracy:F

    float-to-int v6, v6

    invoke-static {v1, v6}, Lcom/baidu/mapapi/model/CoordUtil;->getMCDistanceByOneLatLngAndRadius(Lcom/baidu/mapapi/model/LatLng;I)I

    move-result v1

    int-to-float v1, v1

    float-to-double v6, v1

    invoke-virtual {v14, v9, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    iget v1, v2, Lcom/baidu/mapapi/map/MyLocationData;->direction:F

    iget-boolean v1, v3, Lcom/baidu/mapapi/map/MyLocationConfiguration;->enableDirection:Z

    if-eqz v1, :cond_2

    iget v1, v2, Lcom/baidu/mapapi/map/MyLocationData;->direction:F

    const/high16 v6, 0x43b40000    # 360.0f

    rem-float/2addr v1, v6

    const/high16 v7, 0x43340000    # 180.0f

    cmpl-float v7, v1, v7

    if-lez v7, :cond_1

    sub-float/2addr v1, v6

    goto :goto_0

    :cond_1
    const/high16 v7, -0x3ccc0000    # -180.0f

    cmpg-float v7, v1, v7

    if-gez v7, :cond_3

    add-float/2addr v1, v6

    goto :goto_0

    :cond_2
    const v1, -0x3b85c000    # -1001.0f

    :cond_3
    :goto_0
    float-to-double v6, v1

    invoke-virtual {v14, v8, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "NormalLocArrow"

    move-object/from16 v6, v19

    invoke-virtual {v14, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/16 v1, 0x1c

    move-object/from16 v7, v18

    invoke-virtual {v14, v7, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "FocusLocArrow"

    move-object/from16 v5, v17

    invoke-virtual {v14, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/16 v1, 0x1d

    move-object/from16 v2, v16

    invoke-virtual {v14, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "lineid"

    move-object/from16 v16, v2

    iget v2, v3, Lcom/baidu/mapapi/map/MyLocationConfiguration;->accuracyCircleStrokeColor:I

    invoke-virtual {v14, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "areaid"

    iget v2, v3, Lcom/baidu/mapapi/map/MyLocationConfiguration;->accuracyCircleFillColor:I

    invoke-virtual {v14, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v13, v14}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v1, "data"

    invoke-virtual {v12, v1, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, v3, Lcom/baidu/mapapi/map/MyLocationConfiguration;->locationMode:Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;

    sget-object v2, Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;->COMPASS:Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;

    if-ne v1, v2, :cond_4

    invoke-virtual {v4}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v1

    invoke-virtual {v15, v11, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    invoke-virtual {v4}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v1

    invoke-virtual {v15, v10, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {v15, v9, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v15, v8, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v15, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/16 v2, 0x36

    invoke-virtual {v15, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v15, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v0, v16

    invoke-virtual {v15, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    goto :goto_2

    :catch_1
    move-exception v0

    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_2
    iget-object v0, v3, Lcom/baidu/mapapi/map/MyLocationConfiguration;->customMarker:Lcom/baidu/mapapi/map/BitmapDescriptor;

    if-nez v0, :cond_5

    const/4 v0, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_5

    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v3, Lcom/baidu/mapapi/map/MyLocationConfiguration;->customMarker:Lcom/baidu/mapapi/map/BitmapDescriptor;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/baidu/mapapi/map/BitmapDescriptor;

    new-instance v6, Lcom/baidu/mapapi/model/ParcelItem;

    invoke-direct {v6}, Lcom/baidu/mapapi/model/ParcelItem;-><init>()V

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    iget-object v8, v5, Lcom/baidu/mapapi/map/BitmapDescriptor;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    mul-int v9, v9, v10

    mul-int/lit8 v9, v9, 0x4

    invoke-static {v9}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v9

    const-string v10, "imgdata"

    invoke-virtual {v7, v10, v9}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    const-string v9, "imgindex"

    invoke-virtual {v7, v9, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const-string v9, "imgH"

    invoke-virtual {v7, v9, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    const-string v8, "imgW"

    invoke-virtual {v7, v8, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Lcom/baidu/mapapi/model/ParcelItem;->setBundle(Landroid/os/Bundle;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lcom/baidu/mapapi/model/ParcelItem;

    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v5, v1, :cond_7

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapapi/model/ParcelItem;

    aput-object v1, v0, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_7
    const-string v1, "icondata"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_8
    move-object/from16 v1, p0

    move-object v0, v2

    :goto_5
    iget-object v2, v1, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v2, :cond_9

    invoke-virtual {v12}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_9
    sget-object v0, Lcom/baidu/mapapi/map/f;->a:[I

    iget-object v2, v3, Lcom/baidu/mapapi/map/MyLocationConfiguration;->locationMode:Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;

    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_b

    const/4 v2, 0x2

    if-eq v0, v2, :cond_a

    goto/16 :goto_7

    :cond_a
    new-instance v0, Lcom/baidu/mapapi/map/MapStatus$Builder;

    invoke-direct {v0}, Lcom/baidu/mapapi/map/MapStatus$Builder;-><init>()V

    new-instance v2, Lcom/baidu/mapapi/model/LatLng;

    move-object/from16 v3, p1

    iget-wide v4, v3, Lcom/baidu/mapapi/map/MyLocationData;->latitude:D

    iget-wide v6, v3, Lcom/baidu/mapapi/map/MyLocationData;->longitude:D

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->target(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v2

    iget v2, v2, Lcom/baidu/mapapi/map/MapStatus;->zoom:F

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->zoom(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v2

    iget v2, v2, Lcom/baidu/mapapi/map/MapStatus;->rotate:F

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->rotate(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v2

    iget v2, v2, Lcom/baidu/mapapi/map/MapStatus;->overlook:F

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->overlook(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v2

    iget-object v2, v2, Lcom/baidu/mapapi/map/MapStatus;->targetScreen:Landroid/graphics/Point;

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->targetScreen(Landroid/graphics/Point;)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    goto :goto_6

    :cond_b
    move-object/from16 v3, p1

    new-instance v0, Lcom/baidu/mapapi/map/MapStatus$Builder;

    invoke-direct {v0}, Lcom/baidu/mapapi/map/MapStatus$Builder;-><init>()V

    iget v2, v3, Lcom/baidu/mapapi/map/MyLocationData;->direction:F

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->rotate(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    const/high16 v2, -0x3dcc0000    # -45.0f

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->overlook(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    new-instance v2, Lcom/baidu/mapapi/model/LatLng;

    iget-wide v4, v3, Lcom/baidu/mapapi/map/MyLocationData;->latitude:D

    iget-wide v6, v3, Lcom/baidu/mapapi/map/MyLocationData;->longitude:D

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->target(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v2

    iget-object v2, v2, Lcom/baidu/mapapi/map/MapStatus;->targetScreen:Landroid/graphics/Point;

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->targetScreen(Landroid/graphics/Point;)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v2

    iget v2, v2, Lcom/baidu/mapapi/map/MapStatus;->zoom:F

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/MapStatus$Builder;->zoom(F)Lcom/baidu/mapapi/map/MapStatus$Builder;

    move-result-object v0

    :goto_6
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapStatus$Builder;->build()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newMapStatus(Lcom/baidu/mapapi/map/MapStatus;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->animateMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    :cond_c
    :goto_7
    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/map/BaiduMap;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->S:Z

    return p1
.end method

.method private b(Lcom/baidu/mapapi/map/InfoWindow;)Lcom/baidu/mapapi/map/BitmapDescriptor;
    .locals 2

    iget-object v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->j:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->g:Z

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->h:I

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensityDpi()I

    move-result v0

    iput v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->h:I

    :cond_0
    iget-object v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    iget v1, p1, Lcom/baidu/mapapi/map/InfoWindow;->h:I

    invoke-static {v0, v1}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromViewWithDpi(Landroid/view/View;I)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    invoke-static {v0}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromView(Landroid/view/View;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v0

    :goto_0
    iput-object v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->a:Lcom/baidu/mapapi/map/BitmapDescriptor;

    goto :goto_1

    :cond_2
    iget-object v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->a:Lcom/baidu/mapapi/map/BitmapDescriptor;

    :goto_1
    return-object v0
.end method

.method static synthetic b(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapsdkplatform/comapi/map/e;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    return-object p0
.end method

.method static synthetic c(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->m:Ljava/util/List;

    return-object p0
.end method

.method private c()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->k:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->l:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->m:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->K:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->n:Ljava/util/List;

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v0

    const/high16 v1, 0x42200000    # 40.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v2

    mul-float v2, v2, v1

    float-to-int v1, v2

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    iput-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->T:Landroid/graphics/Point;

    new-instance v0, Lcom/baidu/mapapi/map/UiSettings;

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-direct {v0, v1}, Lcom/baidu/mapapi/map/UiSettings;-><init>(Lcom/baidu/mapsdkplatform/comapi/map/e;)V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->g:Lcom/baidu/mapapi/map/UiSettings;

    new-instance v0, Lcom/baidu/mapapi/map/a;

    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/a;-><init>(Lcom/baidu/mapapi/map/BaiduMap;)V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->o:Lcom/baidu/mapapi/map/Overlay$a;

    new-instance v0, Lcom/baidu/mapapi/map/b;

    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/b;-><init>(Lcom/baidu/mapapi/map/BaiduMap;)V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->p:Lcom/baidu/mapapi/map/InfoWindow$a;

    new-instance v0, Lcom/baidu/mapapi/map/c;

    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/c;-><init>(Lcom/baidu/mapapi/map/BaiduMap;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/n;)V

    new-instance v0, Lcom/baidu/mapapi/map/d;

    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/d;-><init>(Lcom/baidu/mapapi/map/BaiduMap;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/q;)V

    new-instance v0, Lcom/baidu/mapapi/map/e;

    invoke-direct {v0, p0}, Lcom/baidu/mapapi/map/e;-><init>(Lcom/baidu/mapapi/map/BaiduMap;)V

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ak;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->C()Z

    move-result v0

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->P:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->D()Z

    move-result v0

    iput-boolean v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->Q:Z

    return-void
.end method

.method static synthetic d(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->l:Ljava/util/List;

    return-object p0
.end method

.method static synthetic e(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->K:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic f(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->q:Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;

    return-object p0
.end method

.method static synthetic g(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnSynchronizationListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->F:Lcom/baidu/mapapi/map/BaiduMap$OnSynchronizationListener;

    return-object p0
.end method

.method static synthetic h(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->r:Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;

    return-object p0
.end method

.method static synthetic i(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapClickListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->s:Lcom/baidu/mapapi/map/BaiduMap$OnMapClickListener;

    return-object p0
.end method

.method static synthetic j(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapDoubleClickListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->v:Lcom/baidu/mapapi/map/BaiduMap$OnMapDoubleClickListener;

    return-object p0
.end method

.method static synthetic k(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapLongClickListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->w:Lcom/baidu/mapapi/map/BaiduMap$OnMapLongClickListener;

    return-object p0
.end method

.method static synthetic l(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapLoadedCallback;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->t:Lcom/baidu/mapapi/map/BaiduMap$OnMapLoadedCallback;

    return-object p0
.end method

.method static synthetic m(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderCallback;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->u:Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderCallback;

    return-object p0
.end method

.method static synthetic n(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->B:Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;

    return-object p0
.end method

.method static synthetic o(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMyLocationClickListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->A:Lcom/baidu/mapapi/map/BaiduMap$OnMyLocationClickListener;

    return-object p0
.end method

.method static synthetic p(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method static synthetic q(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->y:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method static synthetic r(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/Marker;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->M:Lcom/baidu/mapapi/map/Marker;

    return-object p0
.end method

.method static synthetic s(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/Projection;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->f:Lcom/baidu/mapapi/map/Projection;

    return-object p0
.end method

.method static synthetic t(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMarkerDragListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->z:Lcom/baidu/mapapi/map/BaiduMap$OnMarkerDragListener;

    return-object p0
.end method

.method static synthetic u(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/concurrent/locks/Lock;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    return-object p0
.end method

.method static synthetic v(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/HeatMap;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    return-object p0
.end method

.method static synthetic w(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapDrawFrameCallback;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->C:Lcom/baidu/mapapi/map/BaiduMap$OnMapDrawFrameCallback;

    return-object p0
.end method

.method static synthetic x(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->D:Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;

    return-object p0
.end method

.method static synthetic y(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderValidDataListener;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->E:Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderValidDataListener;

    return-object p0
.end method

.method static synthetic z(Lcom/baidu/mapapi/map/BaiduMap;)Ljava/util/concurrent/locks/Lock;
    .locals 0

    iget-object p0, p0, Lcom/baidu/mapapi/map/BaiduMap;->J:Ljava/util/concurrent/locks/Lock;

    return-object p0
.end method


# virtual methods
.method a()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->t()V

    return-void
.end method

.method a(Lcom/baidu/mapapi/map/HeatMap;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v1, :cond_0

    if-ne p1, v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/HeatMap;->b()V

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/HeatMap;->c()V

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/baidu/mapapi/map/HeatMap;->a:Lcom/baidu/mapapi/map/BaiduMap;

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->o()V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->p(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method a(Lcom/baidu/mapapi/map/TileOverlay;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->J:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->G:Lcom/baidu/mapapi/map/TileOverlay;

    if-ne v1, p1, :cond_0

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TileOverlay;->b()V

    iput-object v0, p1, Lcom/baidu/mapapi/map/TileOverlay;->a:Lcom/baidu/mapapi/map/BaiduMap;

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->f(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->G:Lcom/baidu/mapapi/map/TileOverlay;

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->J:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_0
    :goto_0
    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->G:Lcom/baidu/mapapi/map/TileOverlay;

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->J:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void
.end method

.method public addHeatMap(Lcom/baidu/mapapi/map/HeatMap;)V
    .locals 2

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :cond_1
    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/HeatMap;->b()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/HeatMap;->c()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/baidu/mapapi/map/HeatMap;->a:Lcom/baidu/mapapi/map/BaiduMap;

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->o()V

    :cond_2
    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->H:Lcom/baidu/mapapi/map/HeatMap;

    iput-object p0, p1, Lcom/baidu/mapapi/map/HeatMap;->a:Lcom/baidu/mapapi/map/BaiduMap;

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->p(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->I:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/baidu/mapapi/map/OverlayOptions;->a()Lcom/baidu/mapapi/map/Overlay;

    move-result-object p1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->o:Lcom/baidu/mapapi/map/Overlay$a;

    iput-object v0, p1, Lcom/baidu/mapapi/map/Overlay;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    instance-of v0, p1, Lcom/baidu/mapapi/map/Marker;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/baidu/mapapi/map/Marker;

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->p:Lcom/baidu/mapapi/map/InfoWindow$a;

    iput-object v1, v0, Lcom/baidu/mapapi/map/Marker;->x:Lcom/baidu/mapapi/map/InfoWindow$a;

    iget-object v1, v0, Lcom/baidu/mapapi/map/Marker;->p:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/baidu/mapapi/map/Marker;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Z)V

    :cond_1
    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/baidu/mapapi/map/Marker;->w:Lcom/baidu/mapapi/map/InfoWindow;

    if-eqz v1, :cond_2

    iget-object v0, v0, Lcom/baidu/mapapi/map/Marker;->w:Lcom/baidu/mapapi/map/InfoWindow;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->showInfoWindow(Lcom/baidu/mapapi/map/InfoWindow;Z)V

    :cond_2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/Overlay;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Landroid/os/Bundle;)V

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final addOverlays(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/OverlayOptions;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/Overlay;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Landroid/os/Bundle;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/baidu/mapapi/map/OverlayOptions;

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v5}, Lcom/baidu/mapapi/map/OverlayOptions;->a()Lcom/baidu/mapapi/map/Overlay;

    move-result-object v5

    iget-object v8, p0, Lcom/baidu/mapapi/map/BaiduMap;->o:Lcom/baidu/mapapi/map/Overlay$a;

    iput-object v8, v5, Lcom/baidu/mapapi/map/Overlay;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    instance-of v8, v5, Lcom/baidu/mapapi/map/Marker;

    if-eqz v8, :cond_3

    move-object v8, v5

    check-cast v8, Lcom/baidu/mapapi/map/Marker;

    iget-object v9, p0, Lcom/baidu/mapapi/map/BaiduMap;->p:Lcom/baidu/mapapi/map/InfoWindow$a;

    iput-object v9, v8, Lcom/baidu/mapapi/map/Marker;->x:Lcom/baidu/mapapi/map/InfoWindow$a;

    iget-object v9, v8, Lcom/baidu/mapapi/map/Marker;->p:Ljava/util/ArrayList;

    if-eqz v9, :cond_2

    iget-object v9, v8, Lcom/baidu/mapapi/map/Marker;->p:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-eqz v9, :cond_2

    iget-object v9, p0, Lcom/baidu/mapapi/map/BaiduMap;->l:Ljava/util/List;

    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v9, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v9, :cond_2

    invoke-virtual {v9, v6}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Z)V

    :cond_2
    iget-object v6, p0, Lcom/baidu/mapapi/map/BaiduMap;->m:Ljava/util/List;

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    iget-object v6, p0, Lcom/baidu/mapapi/map/BaiduMap;->k:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5, v7}, Lcom/baidu/mapapi/map/Overlay;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    aput-object v7, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    div-int/lit16 p1, v1, 0x190

    const/4 v4, 0x0

    :goto_1
    add-int/lit8 v5, p1, 0x1

    if-ge v4, v5, :cond_8

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    :goto_2
    const/16 v8, 0x190

    if-ge v7, v8, :cond_6

    mul-int/lit16 v8, v4, 0x190

    add-int/2addr v8, v7

    if-ge v8, v1, :cond_6

    aget-object v9, v2, v8

    if-nez v9, :cond_5

    goto :goto_3

    :cond_5
    aget-object v8, v2, v8

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_6
    iget-object v7, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v7, :cond_7

    invoke-virtual {v7, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Ljava/util/List;)V

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_8
    return-object v0
.end method

.method public addTileLayer(Lcom/baidu/mapapi/map/TileOverlayOptions;)Lcom/baidu/mapapi/map/TileOverlay;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->G:Lcom/baidu/mapapi/map/TileOverlay;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/TileOverlay;->b()V

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->G:Lcom/baidu/mapapi/map/TileOverlay;

    iput-object v0, v1, Lcom/baidu/mapapi/map/TileOverlay;->a:Lcom/baidu/mapapi/map/BaiduMap;

    :cond_1
    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TileOverlayOptions;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, p0}, Lcom/baidu/mapapi/map/TileOverlayOptions;->a(Lcom/baidu/mapapi/map/BaiduMap;)Lcom/baidu/mapapi/map/TileOverlay;

    move-result-object p1

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->G:Lcom/baidu/mapapi/map/TileOverlay;

    return-object p1

    :cond_2
    return-object v0
.end method

.method public final animateMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V
    .locals 1

    const/16 v0, 0x12c

    invoke-virtual {p0, p1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->animateMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;I)V

    return-void
.end method

.method public final animateMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;I)V
    .locals 2

    if-eqz p1, :cond_3

    if-gtz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->a(Lcom/baidu/mapapi/map/MapStatusUpdate;)Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object p1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_1

    return-void

    :cond_1
    sget v1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    or-int/lit16 v1, v1, 0x100

    sput v1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    iget-boolean v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;I)V

    :cond_3
    :goto_0
    return-void
.end method

.method b()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->e()Z

    move-result v0

    return v0
.end method

.method public changeLocationLayerOrder(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->d(Z)V

    return-void
.end method

.method public cleanCache(I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(I)V

    return-void
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->n()V

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/BaiduMap;->hideInfoWindow()V

    return-void
.end method

.method public getAllInfoWindows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/InfoWindow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->n:Ljava/util/List;

    return-object v0
.end method

.method public final getCompassPosition()Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/baidu/mapapi/map/BaiduMap;->a(Ljava/lang/String;)Landroid/graphics/Point;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getFocusedBaseIndoorMapInfo()Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->p()Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo;

    move-result-object v0

    return-object v0
.end method

.method public getGLMapView()Lcom/baidu/mapsdkplatform/comapi/map/l;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    return-object v0
.end method

.method public final getLocationConfigeration()Lcom/baidu/mapapi/map/MyLocationConfiguration;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/BaiduMap;->getLocationConfiguration()Lcom/baidu/mapapi/map/MyLocationConfiguration;

    move-result-object v0

    return-object v0
.end method

.method public final getLocationConfiguration()Lcom/baidu/mapapi/map/MyLocationConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->O:Lcom/baidu/mapapi/map/MyLocationConfiguration;

    return-object v0
.end method

.method public final getLocationData()Lcom/baidu/mapapi/map/MyLocationData;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->N:Lcom/baidu/mapapi/map/MyLocationData;

    return-object v0
.end method

.method public final getMapStatus()Lcom/baidu/mapapi/map/MapStatus;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapStatus;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v0

    return-object v0
.end method

.method public final getMapStatusLimit()Lcom/baidu/mapapi/model/LatLngBounds;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->F()Lcom/baidu/mapapi/model/LatLngBounds;

    move-result-object v0

    return-object v0
.end method

.method public final getMapType()I
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->l()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x3

    return v0

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x2

    :cond_2
    return v1
.end method

.method public getMarkersInBounds(Lcom/baidu/mapapi/model/LatLngBounds;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/mapapi/model/LatLngBounds;",
            ")",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/Marker;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->m:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapapi/map/Marker;

    invoke-virtual {v2}, Lcom/baidu/mapapi/map/Marker;->getPosition()Lcom/baidu/mapapi/model/LatLng;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/baidu/mapapi/model/LatLngBounds;->contains(Lcom/baidu/mapapi/model/LatLng;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final getMaxZoomLevel()F
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    return v0
.end method

.method public final getMinZoomLevel()F
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->b:F

    return v0
.end method

.method public final getProjection()Lcom/baidu/mapapi/map/Projection;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->f:Lcom/baidu/mapapi/map/Projection;

    return-object v0
.end method

.method public getProjectionMatrix()[F
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->N()[F

    move-result-object v0

    return-object v0
.end method

.method public final getUiSettings()Lcom/baidu/mapapi/map/UiSettings;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->g:Lcom/baidu/mapapi/map/UiSettings;

    return-object v0
.end method

.method public getViewMatrix()[F
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->O()[F

    move-result-object v0

    return-object v0
.end method

.method public getZoomToBound(IIIIII)F
    .locals 7

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(IIIIII)F

    move-result p1

    return p1
.end method

.method public getmGLMapView()Lcom/baidu/mapsdkplatform/comapi/map/l;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    return-object v0
.end method

.method public hideInfoWindow()V
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->K:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapapi/map/InfoWindow;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/baidu/mapapi/map/f;->b:[I

    iget-object v3, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-virtual {v3}, Lcom/baidu/mapsdkplatform/comapi/map/ac;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/TextureMapView;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapapi/map/Overlay;

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->K:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    iget-object v3, v1, Lcom/baidu/mapapi/map/Overlay;->z:Ljava/lang/String;

    instance-of v4, v1, Lcom/baidu/mapapi/map/Marker;

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->K:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public hideInfoWindow(Lcom/baidu/mapapi/map/InfoWindow;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz p1, :cond_5

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    if-eqz v0, :cond_3

    sget-object v1, Lcom/baidu/mapapi/map/f;->b:[I

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-virtual {v2}, Lcom/baidu/mapsdkplatform/comapi/map/ac;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/MapView;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/TextureMapView;->removeView(Landroid/view/View;)V

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/Marker;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Marker;->remove()V

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->K:Ljava/util/Map;

    iget-object v0, v0, Lcom/baidu/mapapi/map/Marker;->z:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_5
    :goto_1
    return-void
.end method

.method public hideSDKLayer()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c()V

    return-void
.end method

.method public final isBaiduHeatMapEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->i()Z

    move-result v0

    return v0
.end method

.method public isBaseIndoorMapMode()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->q()Z

    move-result v0

    return v0
.end method

.method public final isBuildingsEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->m()Z

    move-result v0

    return v0
.end method

.method public final isMyLocationEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->s()Z

    move-result v0

    return v0
.end method

.method public final isSupportBaiduHeatMap()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->j()Z

    move-result v0

    return v0
.end method

.method public final isTrafficEnabled()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g()Z

    move-result v0

    return v0
.end method

.method public final removeMarkerClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnMarkerClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setBaiduHeatMapEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->h(Z)V

    :cond_0
    return-void
.end method

.method public final setBuildingsEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->j(Z)V

    :cond_0
    return-void
.end method

.method public setCompassEnable(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->e(Z)V

    return-void
.end method

.method public setCompassIcon(Landroid/graphics/Bitmap;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/graphics/Bitmap;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BDMapSDKException: compass\'s icon can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setCompassPosition(Landroid/graphics/Point;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/graphics/Point;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->T:Landroid/graphics/Point;

    :cond_1
    return-void
.end method

.method public setCustomTrafficColor(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    const-string v1, "^#[0-9a-fA-F]{8}$"

    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v3, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object/from16 v4, p2

    invoke-virtual {v4, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object/from16 v5, p3

    invoke-virtual {v5, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object/from16 v6, p4

    invoke-virtual {v6, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-static/range {p1 .. p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    int-to-long v7, v2

    invoke-static/range {p2 .. p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    int-to-long v9, v2

    invoke-static/range {p3 .. p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    int-to-long v11, v2

    invoke-static/range {p4 .. p4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    int-to-long v13, v2

    const/4 v2, 0x1

    move-object v3, v1

    move-wide v4, v7

    move-wide v6, v9

    move-wide v8, v11

    move-wide v10, v13

    move v12, v2

    invoke-virtual/range {v3 .. v12}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(JJJJZ)V

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/baidu/mapapi/map/BaiduMap;->e:Ljava/lang/String;

    const-string v3, "the string of the input customTrafficColor is error"

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_2
    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static/range {p4 .. p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v2, v0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    const-string v1, "#ffffffff"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    int-to-long v7, v7

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    int-to-long v9, v1

    const/4 v11, 0x0

    invoke-virtual/range {v2 .. v11}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(JJJJZ)V

    :cond_3
    :goto_0
    const/4 v1, 0x1

    return v1
.end method

.method public final setIndoorEnable(Z)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->R:Z

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->l(Z)V

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->D:Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;->onBaseIndoorMapMode(ZLcom/baidu/mapapi/map/MapBaseIndoorMapInfo;)V

    :cond_1
    return-void
.end method

.method public setLayerClickable(Lcom/baidu/mapapi/map/MapLayer;Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapapi/map/MapLayer;Z)V

    return-void
.end method

.method public final setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->a(Lcom/baidu/mapapi/map/MapStatusUpdate;)Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object p1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->q:Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/BaiduMap;->getMapStatus()Lcom/baidu/mapapi/map/MapStatus;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;->onMapStatusChange(Lcom/baidu/mapapi/map/MapStatus;)V

    :cond_2
    return-void
.end method

.method public final setMapStatusLimits(Lcom/baidu/mapapi/model/LatLngBounds;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapapi/model/LatLngBounds;)V

    invoke-static {p1}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newLatLngBounds(Lcom/baidu/mapapi/model/LatLngBounds;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    return-void
.end method

.method public final setMapType(I)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_5

    const/4 v3, 0x2

    if-eq p1, v3, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->C()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->v(Z)V

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->D()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->w(Z)V

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->l(Z)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->P:Z

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->v(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->Q:Z

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->w(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g(Z)V

    goto :goto_0

    :cond_5
    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->P:Z

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->v(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->Q:Z

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->w(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    invoke-virtual {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g(Z)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    iget-boolean v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->R:Z

    invoke-virtual {v0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->l(Z)V

    :goto_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(I)V

    :cond_6
    return-void
.end method

.method public final setMaxAndMinZoomLevel(FF)V
    .locals 1

    const/high16 v0, 0x41a80000    # 21.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    return-void

    :cond_0
    const/high16 v0, 0x40800000    # 4.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    return-void

    :cond_1
    cmpg-float v0, p1, p2

    if-gez v0, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(FF)V

    :cond_3
    return-void
.end method

.method public final setMyLocationConfigeration(Lcom/baidu/mapapi/map/MyLocationConfiguration;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMyLocationConfiguration(Lcom/baidu/mapapi/map/MyLocationConfiguration;)V

    return-void
.end method

.method public final setMyLocationConfiguration(Lcom/baidu/mapapi/map/MyLocationConfiguration;)V
    .locals 1

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->O:Lcom/baidu/mapapi/map/MyLocationConfiguration;

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->N:Lcom/baidu/mapapi/map/MyLocationData;

    invoke-direct {p0, v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->a(Lcom/baidu/mapapi/map/MyLocationData;Lcom/baidu/mapapi/map/MyLocationConfiguration;)V

    return-void
.end method

.method public final setMyLocationData(Lcom/baidu/mapapi/map/MyLocationData;)V
    .locals 4

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->N:Lcom/baidu/mapapi/map/MyLocationData;

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->O:Lcom/baidu/mapapi/map/MyLocationConfiguration;

    if-nez v0, :cond_0

    new-instance v0, Lcom/baidu/mapapi/map/MyLocationConfiguration;

    sget-object v1, Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;->NORMAL:Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/baidu/mapapi/map/MyLocationConfiguration;-><init>(Lcom/baidu/mapapi/map/MyLocationConfiguration$LocationMode;ZLcom/baidu/mapapi/map/BitmapDescriptor;)V

    iput-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->O:Lcom/baidu/mapapi/map/MyLocationConfiguration;

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->O:Lcom/baidu/mapapi/map/MyLocationConfiguration;

    invoke-direct {p0, p1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->a(Lcom/baidu/mapapi/map/MyLocationData;Lcom/baidu/mapapi/map/MyLocationConfiguration;)V

    return-void
.end method

.method public final setMyLocationEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->o(Z)V

    :cond_0
    return-void
.end method

.method public final setOnBaseIndoorMapListener(Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->D:Lcom/baidu/mapapi/map/BaiduMap$OnBaseIndoorMapListener;

    return-void
.end method

.method public final setOnMapClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->s:Lcom/baidu/mapapi/map/BaiduMap$OnMapClickListener;

    return-void
.end method

.method public final setOnMapDoubleClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapDoubleClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->v:Lcom/baidu/mapapi/map/BaiduMap$OnMapDoubleClickListener;

    return-void
.end method

.method public final setOnMapDrawFrameCallback(Lcom/baidu/mapapi/map/BaiduMap$OnMapDrawFrameCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->C:Lcom/baidu/mapapi/map/BaiduMap$OnMapDrawFrameCallback;

    return-void
.end method

.method public setOnMapLoadedCallback(Lcom/baidu/mapapi/map/BaiduMap$OnMapLoadedCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->t:Lcom/baidu/mapapi/map/BaiduMap$OnMapLoadedCallback;

    return-void
.end method

.method public final setOnMapLongClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapLongClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->w:Lcom/baidu/mapapi/map/BaiduMap$OnMapLongClickListener;

    return-void
.end method

.method public setOnMapRenderCallbadk(Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->u:Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderCallback;

    return-void
.end method

.method public final setOnMapRenderValidDataListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderValidDataListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->E:Lcom/baidu/mapapi/map/BaiduMap$OnMapRenderValidDataListener;

    return-void
.end method

.method public final setOnMapStatusChangeListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->q:Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;

    return-void
.end method

.method public final setOnMapTouchListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->r:Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;

    return-void
.end method

.method public final setOnMarkerClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnMarkerClickListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setOnMarkerDragListener(Lcom/baidu/mapapi/map/BaiduMap$OnMarkerDragListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->z:Lcom/baidu/mapapi/map/BaiduMap$OnMarkerDragListener;

    return-void
.end method

.method public final setOnMyLocationClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnMyLocationClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->A:Lcom/baidu/mapapi/map/BaiduMap$OnMyLocationClickListener;

    return-void
.end method

.method public final setOnPolylineClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnPolylineClickListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->y:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setOnSynchronizationListener(Lcom/baidu/mapapi/map/BaiduMap$OnSynchronizationListener;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->F:Lcom/baidu/mapapi/map/BaiduMap$OnSynchronizationListener;

    return-void
.end method

.method public setOverlayUnderPoi(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(Z)V

    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/baidu/mapapi/map/BaiduMap;->setViewPadding(IIII)V

    return-void
.end method

.method public setPixelFormatTransparent(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->d()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l;->e()V

    :goto_0
    return-void
.end method

.method public final setTrafficEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->i(Z)V

    :cond_0
    return-void
.end method

.method public final setViewPadding(IIII)V
    .locals 6

    if-ltz p1, :cond_6

    if-ltz p2, :cond_6

    if-ltz p3, :cond_6

    if-gez p4, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_1

    return-void

    :cond_1
    sget-object v0, Lcom/baidu/mapapi/map/f;->b:[I

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/ac;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getWidth()I

    move-result v0

    sub-int/2addr v0, p1

    sub-int/2addr v0, p3

    int-to-float v0, v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getHeight()I

    move-result v1

    sub-int/2addr v1, p2

    sub-int/2addr v1, p4

    int-to-float v1, v1

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MapView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    new-instance v3, Landroid/graphics/Point;

    int-to-float v4, p1

    iget-object v5, p0, Lcom/baidu/mapapi/map/BaiduMap;->T:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    int-to-float v5, v5

    mul-float v5, v5, v0

    add-float/2addr v4, v5

    float-to-int v0, v4

    int-to-float v4, p2

    iget-object v5, p0, Lcom/baidu/mapapi/map/BaiduMap;->T:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    int-to-float v5, v5

    mul-float v5, v5, v1

    add-float/2addr v4, v5

    float-to-int v1, v4

    invoke-direct {v3, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/graphics/Point;)Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/baidu/mapapi/map/MapView;->setPadding(IIII)V

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/MapView;->invalidate()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->getWidth()I

    move-result v0

    sub-int/2addr v0, p1

    sub-int/2addr v0, p3

    int-to-float v0, v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/TextureMapView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget-object v1, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/TextureMapView;->getHeight()I

    move-result v1

    sub-int/2addr v1, p2

    sub-int/2addr v1, p4

    int-to-float v1, v1

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-virtual {v2}, Lcom/baidu/mapapi/map/TextureMapView;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    iget-object v2, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    new-instance v3, Landroid/graphics/Point;

    int-to-float v4, p1

    iget-object v5, p0, Lcom/baidu/mapapi/map/BaiduMap;->T:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->x:I

    int-to-float v5, v5

    mul-float v5, v5, v0

    add-float/2addr v4, v5

    float-to-int v0, v4

    int-to-float v4, p2

    iget-object v5, p0, Lcom/baidu/mapapi/map/BaiduMap;->T:Landroid/graphics/Point;

    iget v5, v5, Landroid/graphics/Point;->y:I

    int-to-float v5, v5

    mul-float v5, v5, v1

    add-float/2addr v4, v5

    float-to-int v1, v4

    invoke-direct {v3, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/graphics/Point;)Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/baidu/mapapi/map/TextureMapView;->setPadding(IIII)V

    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TextureMapView;->invalidate()V

    :cond_6
    :goto_0
    return-void
.end method

.method public showInfoWindow(Lcom/baidu/mapapi/map/InfoWindow;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->showInfoWindow(Lcom/baidu/mapapi/map/InfoWindow;Z)V

    return-void
.end method

.method public showInfoWindow(Lcom/baidu/mapapi/map/InfoWindow;Z)V
    .locals 6

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    if-eqz p1, :cond_8

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/BaiduMap;->hideInfoWindow()V

    :cond_1
    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->p:Lcom/baidu/mapapi/map/InfoWindow$a;

    iput-object p2, p1, Lcom/baidu/mapapi/map/InfoWindow;->e:Lcom/baidu/mapapi/map/InfoWindow$a;

    iget-object p2, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_5

    iget-boolean p2, p1, Lcom/baidu/mapapi/map/InfoWindow;->j:Z

    if-eqz p2, :cond_5

    iget-object p2, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->destroyDrawingCache()V

    new-instance v2, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    invoke-direct {v2}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;-><init>()V

    sget-object v3, Lcom/baidu/mapapi/map/MapViewLayoutParams$ELayoutMode;->mapMode:Lcom/baidu/mapapi/map/MapViewLayoutParams$ELayoutMode;

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->layoutMode(Lcom/baidu/mapapi/map/MapViewLayoutParams$ELayoutMode;)Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    move-result-object v2

    iget-object v3, p1, Lcom/baidu/mapapi/map/InfoWindow;->c:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    move-result-object v2

    iget v3, p1, Lcom/baidu/mapapi/map/InfoWindow;->f:I

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->yOffset(I)Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MapViewLayoutParams$Builder;->build()Lcom/baidu/mapapi/map/MapViewLayoutParams;

    move-result-object v2

    sget-object v3, Lcom/baidu/mapapi/map/f;->b:[I

    iget-object v4, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-virtual {v4}, Lcom/baidu/mapsdkplatform/comapi/map/ac;->ordinal()I

    move-result v4

    aget v3, v3, v4

    if-eq v3, v1, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/baidu/mapapi/map/BaiduMap;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v3, p2, v2}, Lcom/baidu/mapapi/map/MapView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    :cond_3
    iget-object v3, p0, Lcom/baidu/mapapi/map/BaiduMap;->b:Lcom/baidu/mapapi/map/TextureMapView;

    if-eqz v3, :cond_4

    invoke-virtual {v3, p2, v2}, Lcom/baidu/mapapi/map/TextureMapView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    :goto_0
    iget-boolean p2, p1, Lcom/baidu/mapapi/map/InfoWindow;->i:Z

    if-eqz p2, :cond_5

    const/4 p2, 0x0

    goto :goto_1

    :cond_5
    const/4 p2, 0x1

    :goto_1
    invoke-direct {p0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->b(Lcom/baidu/mapapi/map/InfoWindow;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v2

    new-instance v3, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v3}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    invoke-virtual {v3, v0}, Lcom/baidu/mapapi/map/MarkerOptions;->perspective(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v2

    iget-object v3, p1, Lcom/baidu/mapapi/map/InfoWindow;->c:Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v2

    const v3, 0x7fffffff

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/MarkerOptions;->zIndex(I)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v2

    iget v3, p1, Lcom/baidu/mapapi/map/InfoWindow;->f:I

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/MarkerOptions;->yOffset(I)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/baidu/mapapi/map/MarkerOptions;->infoWindow(Lcom/baidu/mapapi/map/InfoWindow;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/baidu/mapapi/map/MarkerOptions;->a()Lcom/baidu/mapapi/map/Overlay;

    move-result-object v2

    iget-object v3, p0, Lcom/baidu/mapapi/map/BaiduMap;->o:Lcom/baidu/mapapi/map/Overlay$a;

    iput-object v3, v2, Lcom/baidu/mapapi/map/Overlay;->listener:Lcom/baidu/mapapi/map/Overlay$a;

    sget-object v3, Lcom/baidu/mapsdkplatform/comapi/map/j;->b:Lcom/baidu/mapsdkplatform/comapi/map/j;

    iput-object v3, v2, Lcom/baidu/mapapi/map/Overlay;->type:Lcom/baidu/mapsdkplatform/comapi/map/j;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2, v3}, Lcom/baidu/mapapi/map/Overlay;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    iget-object v4, p1, Lcom/baidu/mapapi/map/InfoWindow;->b:Landroid/view/View;

    const-string v5, "draw_with_view"

    if-eqz v4, :cond_6

    invoke-virtual {v3, v5, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v3, v5, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :goto_2
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_7

    if-eqz p2, :cond_7

    invoke-virtual {v0, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Landroid/os/Bundle;)V

    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->k:Ljava/util/List;

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    check-cast v2, Lcom/baidu/mapapi/map/Marker;

    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->p:Lcom/baidu/mapapi/map/InfoWindow$a;

    iput-object p2, v2, Lcom/baidu/mapapi/map/Marker;->x:Lcom/baidu/mapapi/map/InfoWindow$a;

    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->K:Ljava/util/Map;

    iget-object v0, v2, Lcom/baidu/mapapi/map/Marker;->z:Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->L:Ljava/util/Map;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->n:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_3
    return-void
.end method

.method public showInfoWindows(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/map/InfoWindow;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/InfoWindow;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->showInfoWindow(Lcom/baidu/mapapi/map/InfoWindow;Z)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final showMapIndoorPoi(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->w(Z)V

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->Q:Z

    :cond_0
    return-void
.end method

.method public final showMapPoi(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->v(Z)V

    iput-boolean p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->P:Z

    :cond_0
    return-void
.end method

.method public showSDKLayer()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->d()V

    return-void
.end method

.method public final snapshot(Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V
    .locals 3

    iput-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->B:Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;

    sget-object p1, Lcom/baidu/mapapi/map/f;->b:[I

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ac;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "anything"

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v2, v1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Ljava/lang/String;Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/baidu/mapapi/map/BaiduMap;->j:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v2, v1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Ljava/lang/String;Landroid/graphics/Rect;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final snapshotScope(Landroid/graphics/Rect;Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V
    .locals 2

    iput-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->B:Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;

    sget-object p2, Lcom/baidu/mapapi/map/f;->b:[I

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->d:Lcom/baidu/mapsdkplatform/comapi/map/ac;

    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ac;->ordinal()I

    move-result v0

    aget p2, p2, v0

    const/4 v0, 0x1

    const-string v1, "anything"

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->h:Lcom/baidu/mapsdkplatform/comapi/map/l;

    if-eqz p2, :cond_2

    invoke-virtual {p2, v1, p1}, Lcom/baidu/mapsdkplatform/comapi/map/l;->a(Ljava/lang/String;Landroid/graphics/Rect;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/baidu/mapapi/map/BaiduMap;->j:Lcom/baidu/mapsdkplatform/comapi/map/ae;

    if-eqz p2, :cond_2

    invoke-virtual {p2, v1, p1}, Lcom/baidu/mapsdkplatform/comapi/map/ae;->a(Ljava/lang/String;Landroid/graphics/Rect;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public switchBaseIndoorMapFloor(Ljava/lang/String;Ljava/lang/String;)Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/baidu/mapapi/map/BaiduMap;->getFocusedBaseIndoorMapInfo()Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object p1, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;->SWITCH_ERROR:Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;

    return-object p1

    :cond_1
    iget-object v1, v0, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo;->a:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object p1, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;->FOCUSED_ID_ERROR:Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;

    return-object p1

    :cond_2
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo;->getFloors()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;->SWITCH_OK:Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;

    return-object p1

    :cond_4
    sget-object p1, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;->SWITCH_ERROR:Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;

    return-object p1

    :cond_5
    :goto_0
    sget-object p1, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;->FLOOR_OVERLFLOW:Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;

    return-object p1

    :cond_6
    :goto_1
    sget-object p1, Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;->FLOOR_INFO_ERROR:Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo$SwitchFloorError;

    return-object p1
.end method

.method public switchLayerOrder(Lcom/baidu/mapapi/map/MapLayer;Lcom/baidu/mapapi/map/MapLayer;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/BaiduMap;->i:Lcom/baidu/mapsdkplatform/comapi/map/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapapi/map/MapLayer;Lcom/baidu/mapapi/map/MapLayer;)V

    return-void
.end method
