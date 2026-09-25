.class public Lcom/baidu/platform/comjni/map/cloud/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/platform/comjni/map/cloud/ICloudCenter;


# instance fields
.field protected final a:Ljava/util/concurrent/locks/Lock;

.field private b:I

.field private c:Lcom/baidu/mapapi/cloud/CloudListener;

.field private d:Z

.field private e:Z

.field private f:Lcom/baidu/mapapi/http/AsyncHttpClient;

.field private g:Landroid/os/Handler;

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->d:Z

    iput-boolean v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->e:Z

    new-instance v0, Lcom/baidu/mapapi/http/AsyncHttpClient;

    invoke-direct {v0}, Lcom/baidu/mapapi/http/AsyncHttpClient;-><init>()V

    iput-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->f:Lcom/baidu/mapapi/http/AsyncHttpClient;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->g:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/baidu/platform/comjni/map/cloud/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->h:Ljava/lang/String;

    return-object p1
.end method

.method private a(I)V
    .locals 2

    iget v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    new-instance v0, Lcom/baidu/mapapi/cloud/CloudRgcResult;

    invoke-direct {v0}, Lcom/baidu/mapapi/cloud/CloudRgcResult;-><init>()V

    iget-object v1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->c:Lcom/baidu/mapapi/cloud/CloudListener;

    invoke-interface {v1, v0, p1}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetCloudRgcResult(Lcom/baidu/mapapi/cloud/CloudRgcResult;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object p1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :pswitch_1
    new-instance v0, Lcom/baidu/mapapi/cloud/DetailSearchResult;

    invoke-direct {v0}, Lcom/baidu/mapapi/cloud/DetailSearchResult;-><init>()V

    iget-object v1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_1
    iget-object v1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->c:Lcom/baidu/mapapi/cloud/CloudListener;

    invoke-interface {v1, v0, p1}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetDetailSearchResult(Lcom/baidu/mapapi/cloud/DetailSearchResult;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :pswitch_2
    new-instance v0, Lcom/baidu/mapapi/cloud/CloudSearchResult;

    invoke-direct {v0}, Lcom/baidu/mapapi/cloud/CloudSearchResult;-><init>()V

    iget-object v1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_2
    iget-object v1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->c:Lcom/baidu/mapapi/cloud/CloudListener;

    invoke-interface {v1, v0, p1}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetSearchResult(Lcom/baidu/mapapi/cloud/CloudSearchResult;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2711
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lcom/baidu/platform/comjni/map/cloud/a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->a(I)V

    return-void
.end method

.method private a()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic a(Lcom/baidu/platform/comjni/map/cloud/a;)Z
    .locals 0

    invoke-direct {p0}, Lcom/baidu/platform/comjni/map/cloud/a;->a()Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/baidu/platform/comjni/map/cloud/a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->g:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic b(Lcom/baidu/platform/comjni/map/cloud/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->f(Ljava/lang/String;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->f:Lcom/baidu/mapapi/http/AsyncHttpClient;

    new-instance v1, Lcom/baidu/platform/comjni/map/cloud/b;

    invoke-direct {v1, p0}, Lcom/baidu/platform/comjni/map/cloud/b;-><init>(Lcom/baidu/platform/comjni/map/cloud/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/baidu/mapapi/http/AsyncHttpClient;->get(Ljava/lang/String;Lcom/baidu/mapapi/http/HttpClient$ProtoResultCallback;)V

    const/4 p1, 0x1

    return p1
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    const-string v1, ""

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/baidu/mapapi/http/HttpClient;->getAuthToken()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 p1, -0x4

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->a(I)V

    return-object v0

    :cond_1
    iget-boolean v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->d:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&token="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/baidu/mapsdkplatform/comjni/util/AppMD5;->encodeUrlParamsValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/baidu/mapapi/http/HttpClient;->getPhoneInfo()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-boolean v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->e:Z

    if-eqz v0, :cond_3

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&sign="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/baidu/mapsdkplatform/comjni/util/AppMD5;->getSignMD5String(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1

    :cond_4
    :goto_0
    return-object v0
.end method

.method private f(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    iget p1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->b:I

    packed-switch p1, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    new-instance p1, Lcom/baidu/mapapi/cloud/CloudRgcResult;

    invoke-direct {p1}, Lcom/baidu/mapapi/cloud/CloudRgcResult;-><init>()V

    :try_start_1
    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/cloud/CloudRgcResult;->parseFromJSON(Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_2
    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->c:Lcom/baidu/mapapi/cloud/CloudListener;

    iget v1, p1, Lcom/baidu/mapapi/cloud/CloudRgcResult;->status:I

    invoke-interface {v0, p1, v1}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetCloudRgcResult(Lcom/baidu/mapapi/cloud/CloudRgcResult;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    iget-object p1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_4

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :pswitch_1
    new-instance p1, Lcom/baidu/mapapi/cloud/DetailSearchResult;

    invoke-direct {p1}, Lcom/baidu/mapapi/cloud/DetailSearchResult;-><init>()V

    :try_start_3
    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/cloud/DetailSearchResult;->parseFromJSON(Lorg/json/JSONObject;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_2
    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_4
    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->c:Lcom/baidu/mapapi/cloud/CloudListener;

    iget v1, p1, Lcom/baidu/mapapi/cloud/DetailSearchResult;->status:I

    invoke-interface {v0, p1, v1}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetDetailSearchResult(Lcom/baidu/mapapi/cloud/DetailSearchResult;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :pswitch_2
    new-instance p1, Lcom/baidu/mapapi/cloud/CloudSearchResult;

    invoke-direct {p1}, Lcom/baidu/mapapi/cloud/CloudSearchResult;-><init>()V

    :try_start_5
    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/cloud/CloudSearchResult;->parseFromJSON(Lorg/json/JSONObject;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_3
    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_6
    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->c:Lcom/baidu/mapapi/cloud/CloudListener;

    iget v1, p1, Lcom/baidu/mapapi/cloud/CloudSearchResult;->status:I

    invoke-interface {v0, p1, v1}, Lcom/baidu/mapapi/cloud/CloudListener;->onGetSearchResult(Lcom/baidu/mapapi/cloud/CloudSearchResult;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :goto_4
    return-void

    :catch_3
    move-exception p1

    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2711
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lcom/baidu/mapapi/cloud/CloudListener;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    iput-object p1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->c:Lcom/baidu/mapapi/cloud/CloudListener;

    iget-object p1, p0, Lcom/baidu/platform/comjni/map/cloud/a;->a:Ljava/util/concurrent/locks/Lock;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    const/16 v0, 0x2711

    iput v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->d:Z

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->d(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    const/16 v0, 0x2712

    iput v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->d:Z

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->d(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    const/16 v0, 0x2713

    iput v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->b:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/platform/comjni/map/cloud/a;->d:Z

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/baidu/platform/comjni/map/cloud/a;->d(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
