.class public Lcom/baidu/mapsdkplatform/comapi/util/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapsdkplatform/comapi/util/c$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/util/c;->a:Ljava/util/ArrayList;

    return-void
.end method

.method synthetic constructor <init>(Lcom/baidu/mapsdkplatform/comapi/util/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/util/c;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/util/c;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    const/16 p1, -0x65

    return p1

    :cond_0
    const-string v1, "ad_auth"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public static a()Lcom/baidu/mapsdkplatform/comapi/util/c;
    .locals 1

    invoke-static {}, Lcom/baidu/mapsdkplatform/comapi/util/c$a;->a()Lcom/baidu/mapsdkplatform/comapi/util/c;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/util/c;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    const-string v2, "ad_auth"

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    const-string v0, "ad_key"

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/util/c;->a(Ljava/lang/String;)I

    move-result p1

    const/16 v1, -0x65

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    move v1, p1

    :goto_0
    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/util/c;->a:Ljava/util/ArrayList;

    rem-int/lit8 v3, v1, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    div-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0, p1}, Lcom/baidu/mapsdkplatform/comapi/util/c;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/util/c;->b:Landroid/content/Context;

    return-void
.end method

.method public b()Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/util/c;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/util/c;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method
