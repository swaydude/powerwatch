.class public Lcom/baidu/mapsdkplatform/comapi/map/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/mapsdkplatform/comjni/map/basemap/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapsdkplatform/comapi/map/e$a;
    }
.end annotation


# static fields
.field private static O:I

.field private static P:I

.field private static as:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapsdkplatform/comjni/map/basemap/JNIBaseMap;",
            ">;"
        }
    .end annotation
.end field

.field public static d:F

.field static m:J

.field private static final r:Ljava/lang/String;


# instance fields
.field private A:Z

.field private B:Lcom/baidu/mapsdkplatform/comapi/map/al;

.field private C:Lcom/baidu/mapsdkplatform/comapi/map/ak;

.field private D:Landroid/content/Context;

.field private E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapsdkplatform/comapi/map/d;",
            ">;"
        }
    .end annotation
.end field

.field private F:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/baidu/mapapi/map/MapLayer;",
            "Lcom/baidu/mapsdkplatform/comapi/map/d;",
            ">;"
        }
    .end annotation
.end field

.field private G:Lcom/baidu/mapsdkplatform/comapi/map/z;

.field private H:Lcom/baidu/mapsdkplatform/comapi/map/g;

.field private I:Lcom/baidu/mapsdkplatform/comapi/map/ag;

.field private J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

.field private K:Lcom/baidu/mapsdkplatform/comapi/map/p;

.field private L:Lcom/baidu/mapsdkplatform/comapi/map/a;

.field private M:Lcom/baidu/mapsdkplatform/comapi/map/q;

.field private N:Lcom/baidu/mapsdkplatform/comapi/map/ah;

.field private Q:I

.field private R:I

.field private S:I

.field private T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

.field private U:Landroid/view/VelocityTracker;

.field private V:J

.field private W:J

.field private X:J

.field private Y:J

.field private Z:I

.field public a:F

.field private aa:F

.field private ab:F

.field private ac:Z

.field private ad:J

.field private ae:J

.field private af:Z

.field private ag:Z

.field private ah:F

.field private ai:F

.field private aj:F

.field private ak:F

.field private al:J

.field private am:J

.field private an:Lcom/baidu/mapsdkplatform/comapi/map/f;

.field private ao:Ljava/lang/String;

.field private ap:I

.field private aq:Lcom/baidu/mapsdkplatform/comapi/map/b;

.field private ar:Lcom/baidu/mapsdkplatform/comapi/map/c;

.field private at:Z

.field private au:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/baidu/mapsdkplatform/comapi/map/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private av:Z

.field private aw:Z

.field public b:F

.field public c:F

.field e:Z

.field f:Z

.field g:Z

.field h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapsdkplatform/comapi/map/n;",
            ">;"
        }
    .end annotation
.end field

.field i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

.field j:J

.field k:Z

.field l:I

.field n:Z

.field o:Z

.field p:Z

.field public q:Lcom/baidu/mapapi/map/MapStatusUpdate;

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/baidu/mapsdkplatform/comapi/map/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->r:Ljava/lang/String;

    const/high16 v0, 0x44890000    # 1096.0f

    sput v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->d:F

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->m:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x41a80000    # 21.0f

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    const/high16 v1, 0x40800000    # 4.0f

    iput v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->b:F

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->c:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->u:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->v:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->w:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->x:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->y:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->g:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->z:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->A:Z

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/l$a;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->af:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ag:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->al:J

    iput-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->am:J

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->at:Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->au:Ljava/util/Queue;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->q:Lcom/baidu/mapapi/map/MapStatusUpdate;

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->av:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aw:Z

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->D:Landroid/content/Context;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    iput-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ao:Ljava/lang/String;

    iput p3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ap:I

    return-void
.end method

.method private R()V
    .locals 2

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->w:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->t:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->s:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->c:F

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    goto :goto_1

    :cond_1
    :goto_0
    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    const/high16 v1, 0x41a00000    # 20.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    iput v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    iget v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    invoke-virtual {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private S()V
    .locals 3

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->n:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->o:Z

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private T()Z
    .locals 7

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ag:Z

    iget-boolean v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->am:J

    iget-wide v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->al:J

    sub-long/2addr v2, v4

    iget v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aj:F

    iget v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ah:F

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x447a0000    # 1000.0f

    mul-float v4, v4, v5

    long-to-float v2, v2

    div-float/2addr v4, v2

    iget v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ak:F

    iget v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ai:F

    sub-float/2addr v3, v6

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    mul-float v3, v3, v5

    div-float/2addr v3, v2

    mul-float v4, v4, v4

    mul-float v3, v3, v3

    add-float/2addr v4, v3

    float-to-double v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x43fa0000    # 500.0f

    cmpg-float v3, v2, v3

    if-gtz v3, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->A()V

    const/16 v0, 0x22

    const v3, 0x3f19999a    # 0.6f

    mul-float v2, v2, v3

    float-to-int v2, v2

    iget v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ak:F

    float-to-int v3, v3

    shl-int/lit8 v3, v3, 0x10

    iget v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aj:F

    float-to-int v4, v4

    or-int/2addr v3, v4

    invoke-virtual {p0, v0, v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->M()V

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method private a(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p1, Landroid/app/Activity;

    if-eqz v1, :cond_1

    check-cast p1, Landroid/app/Activity;

    return-object p1

    :cond_1
    instance-of v1, p1, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_2

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0
.end method

.method private a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/d;->c:I

    iget v2, p1, Lcom/baidu/mapsdkplatform/comapi/map/d;->d:I

    iget-object v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(IILjava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->E:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 5

    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1, p2, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v4

    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private b(Landroid/view/MotionEvent;)V
    .locals 7

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ae:J

    iget-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ad:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x190

    cmp-long v6, v2, v4

    if-gez v6, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42f00000    # 120.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ae:J

    :cond_2
    :goto_0
    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ad:J

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    const/4 v1, 0x4

    const/4 v2, 0x0

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p1, v0

    invoke-virtual {p0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ac:Z

    return-void
.end method

.method private b(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/g;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-virtual {p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/g;->a(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v0, p2, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(J)V

    return-void
.end method

.method private c(Landroid/view/MotionEvent;)Z
    .locals 8

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-wide v4, Lcom/baidu/mapsdkplatform/comapi/map/e;->m:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x12c

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p0, v3, v4}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v3

    if-eqz v2, :cond_2

    invoke-interface {v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->d(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v3

    float-to-double v3, v3

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    cmpl-double v7, v3, v5

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v3

    float-to-double v3, v3

    if-lez v7, :cond_5

    mul-double v3, v3, v5

    :cond_5
    double-to-float v3, v3

    iget-boolean v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ac:Z

    if-eqz v4, :cond_6

    div-float/2addr v0, v3

    const/high16 v4, 0x40400000    # 3.0f

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_6

    div-float/2addr v2, v3

    cmpg-float v0, v2, v4

    if-gtz v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ac:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    if-gez v2, :cond_7

    const/4 v2, 0x0

    :cond_7
    if-gez p1, :cond_8

    const/4 p1, 0x0

    :cond_8
    iget-boolean v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    if-eqz v3, :cond_9

    sget v3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    or-int/2addr v1, v3

    sput v1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/4 v1, 0x3

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p1, v2

    invoke-virtual {p0, v1, v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    :cond_9
    return v0
.end method

.method private d(Landroid/view/MotionEvent;)Z
    .locals 7

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/mapsdkplatform/comapi/map/n;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {p0, v4, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v4

    if-eqz v3, :cond_0

    invoke-interface {v3, v4}, Lcom/baidu/mapsdkplatform/comapi/map/n;->e(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_0

    :cond_1
    iput-boolean v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    return v1

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ae:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x190

    cmp-long v0, v3, v5

    if-gez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v3, 0x41200000    # 10.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    sub-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->M()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    if-nez v0, :cond_6

    if-gez v3, :cond_4

    const/4 v3, 0x0

    :cond_4
    if-gez p1, :cond_5

    const/4 p1, 0x0

    :cond_5
    const/4 v0, 0x5

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p1, v3

    invoke-virtual {p0, v0, v2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    return v1

    :cond_6
    return v2
.end method

.method private e(FF)Z
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->af:Z

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v2, :cond_1

    invoke-interface {v2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/n;->b(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object p2

    iget v0, p2, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v0, v2

    iput v0, p2, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v2

    iput-wide v2, p2, Lcom/baidu/mapsdkplatform/comapi/map/ad;->d:D

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v2

    iput-wide v2, p2, Lcom/baidu/mapsdkplatform/comapi/map/ad;->e:D

    const/16 p1, 0x12c

    invoke-virtual {p0, p2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sput-wide p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->m:J

    return v1

    :cond_3
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method private e(Landroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->d(Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method private f(Landroid/os/Bundle;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {v1, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->f(Z)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/al;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(J)V

    :cond_2
    return p1
.end method

.method private g(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "param"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "type"

    const-string v3, "layer_addr"

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Lcom/baidu/mapsdkplatform/comapi/map/j;->d:Lcom/baidu/mapsdkplatform/comapi/map/j;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/j;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/baidu/mapsdkplatform/comapi/map/j;->f:Lcom/baidu/mapsdkplatform/comapi/map/j;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/j;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/baidu/mapsdkplatform/comapi/map/j;->b:Lcom/baidu/mapsdkplatform/comapi/map/j;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/j;->ordinal()I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Lcom/baidu/mapsdkplatform/comapi/map/j;->d:Lcom/baidu/mapsdkplatform/comapi/map/j;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/j;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_3

    :goto_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/aj;->a:J

    invoke-virtual {p1, v3, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto :goto_1

    :cond_3
    sget-object v1, Lcom/baidu/mapsdkplatform/comapi/map/j;->f:Lcom/baidu/mapsdkplatform/comapi/map/j;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/j;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_1

    goto :goto_0

    :goto_1
    return-void
.end method

.method static m(Z)V
    .locals 5

    invoke-static {}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->as:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->as:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comjni/map/basemap/JNIBaseMap;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comjni/map/basemap/JNIBaseMap;->a:J

    invoke-static {v0, v1, p0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c(JZ)V

    sget-object p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->as:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comjni/map/basemap/JNIBaseMap;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v1, v0, Lcom/baidu/mapsdkplatform/comjni/map/basemap/JNIBaseMap;->a:J

    const-wide/16 v3, -0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/JNIBaseMap;->ClearLayer(JJ)V

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c(JZ)V

    :cond_2
    return-void
.end method


# virtual methods
.method A()V
    .locals 3

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->n:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->o:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->o:Z

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method B()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->o:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->n:Z

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->c(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public C()Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->I:Lcom/baidu/mapsdkplatform/comapi/map/ag;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/ag;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(J)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public D()Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ar:Lcom/baidu/mapsdkplatform/comapi/map/c;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/c;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(J)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public E()Lcom/baidu/mapsdkplatform/comapi/map/ad;
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->h()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/baidu/mapsdkplatform/comapi/map/ad;

    invoke-direct {v1}, Lcom/baidu/mapsdkplatform/comapi/map/ad;-><init>()V

    invoke-virtual {v1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public F()Lcom/baidu/mapapi/model/LatLngBounds;
    .locals 10

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->i()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    invoke-direct {v1}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;-><init>()V

    const-string v2, "maxCoorx"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "minCoorx"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    const-string v4, "maxCoory"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    const-string v5, "minCoory"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    new-instance v5, Lcom/baidu/mapapi/model/inner/GeoPoint;

    int-to-double v6, v0

    int-to-double v8, v2

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/baidu/mapapi/model/inner/GeoPoint;-><init>(DD)V

    invoke-static {v5}, Lcom/baidu/mapapi/model/CoordUtil;->mc2ll(Lcom/baidu/mapapi/model/inner/GeoPoint;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->include(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    move-result-object v0

    new-instance v2, Lcom/baidu/mapapi/model/inner/GeoPoint;

    int-to-double v4, v4

    int-to-double v6, v3

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/baidu/mapapi/model/inner/GeoPoint;-><init>(DD)V

    invoke-static {v2}, Lcom/baidu/mapapi/model/CoordUtil;->mc2ll(Lcom/baidu/mapapi/model/inner/GeoPoint;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->include(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    invoke-virtual {v1}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->build()Lcom/baidu/mapapi/model/LatLngBounds;

    move-result-object v0

    return-object v0
.end method

.method public G()Lcom/baidu/mapapi/map/MapStatusUpdate;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->q:Lcom/baidu/mapapi/map/MapStatusUpdate;

    return-object v0
.end method

.method public H()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Q:I

    return v0
.end method

.method public I()I
    .locals 1

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    return v0
.end method

.method J()Lcom/baidu/mapsdkplatform/comapi/map/ad;
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->j()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/baidu/mapsdkplatform/comapi/map/ad;

    invoke-direct {v1}, Lcom/baidu/mapsdkplatform/comapi/map/ad;-><init>()V

    invoke-virtual {v1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public K()D
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v0

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;->m:D

    return-wide v0
.end method

.method L()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->n:Z

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->o:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/n;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/n;->c(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method M()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput-boolean v0, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    return-void
.end method

.method public N()[F
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->u()[F

    move-result-object v0

    return-object v0
.end method

.method public O()[F
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->v()[F

    move-result-object v0

    return-object v0
.end method

.method public P()Ljava/util/Queue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Queue<",
            "Lcom/baidu/mapsdkplatform/comapi/map/e$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->au:Ljava/util/Queue;

    return-object v0
.end method

.method public Q()V
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->au:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->au:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;->e:Landroid/os/Bundle;

    if-nez v1, :cond_1

    iget-wide v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;->a:J

    iget v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;->b:I

    iget v4, v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;->c:I

    iget v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;->d:I

    invoke-static {v1, v2, v3, v4, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JIII)I

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->A()V

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;->e:Landroid/os/Bundle;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Landroid/os/Bundle;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public a(IIIIII)F
    .locals 2

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->k:Z

    if-nez v0, :cond_0

    const/high16 p1, 0x41400000    # 12.0f

    return p1

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "left"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "right"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "bottom"

    invoke-virtual {v0, p1, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "top"

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const/4 p1, 0x1

    const-string p2, "hasHW"

    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "width"

    invoke-virtual {v0, p1, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "height"

    invoke-virtual {v0, p1, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p1, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(Landroid/os/Bundle;)F

    move-result p1

    return p1
.end method

.method a(III)I
    .locals 7

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->at:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/e$a;

    iget-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    move-object v1, v0

    move v4, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/baidu/mapsdkplatform/comapi/map/e$a;-><init>(JIII)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->au:Ljava/util/Queue;

    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    invoke-static {v0, v1, p1, p2, p3}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JIII)I

    move-result p1

    return p1
.end method

.method public a(Landroid/os/Bundle;JILandroid/os/Bundle;)I
    .locals 6

    iget-object p4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v0, p4, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    const-string p4, "jsondata"

    const-string v2, "param"

    cmp-long v3, p2, v0

    if-nez v3, :cond_0

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-virtual {p2}, Lcom/baidu/mapsdkplatform/comapi/map/g;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-virtual {p2}, Lcom/baidu/mapsdkplatform/comapi/map/g;->b()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/g;->g:I

    return p1

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/z;->a:J

    cmp-long v3, p2, v0

    if-nez v3, :cond_1

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    invoke-virtual {p2}, Lcom/baidu/mapsdkplatform/comapi/map/z;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    invoke-virtual {p2}, Lcom/baidu/mapsdkplatform/comapi/map/z;->b()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    iget p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/z;->g:I

    return p1

    :cond_1
    iget-object p4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->K:Lcom/baidu/mapsdkplatform/comapi/map/p;

    iget-wide v0, p4, Lcom/baidu/mapsdkplatform/comapi/map/p;->a:J

    const-string p4, "zoom"

    const-string v3, "y"

    const-string v4, "x"

    cmp-long v5, p2, v0

    if-nez v5, :cond_2

    invoke-virtual {p5, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p5, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {p5, p4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p4

    iget-object p5, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->M:Lcom/baidu/mapsdkplatform/comapi/map/q;

    invoke-interface {p5, p2, p3, p4}, Lcom/baidu/mapsdkplatform/comapi/map/q;->a(III)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->K:Lcom/baidu/mapsdkplatform/comapi/map/p;

    iget p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/p;->g:I

    return p1

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/al;->a:J

    cmp-long v5, p2, v0

    if-nez v5, :cond_3

    invoke-virtual {p5, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p5, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p3

    invoke-virtual {p5, p4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p4

    iget-object p5, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->C:Lcom/baidu/mapsdkplatform/comapi/map/ak;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->D:Landroid/content/Context;

    invoke-interface {p5, p2, p3, p4, v0}, Lcom/baidu/mapsdkplatform/comapi/map/ak;->a(IIILandroid/content/Context;)Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iget p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/al;->g:I

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public a(Lcom/baidu/mapapi/model/inner/GeoPoint;)Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->N:Lcom/baidu/mapsdkplatform/comapi/map/ah;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/ah;->a(Lcom/baidu/mapapi/model/inner/GeoPoint;)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method

.method a()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->E:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/f;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/f;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->an:Lcom/baidu/mapsdkplatform/comapi/map/f;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/b;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/b;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aq:Lcom/baidu/mapsdkplatform/comapi/map/b;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/p;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/p;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->K:Lcom/baidu/mapsdkplatform/comapi/map/p;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/a;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/a;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->L:Lcom/baidu/mapsdkplatform/comapi/map/a;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/r;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/r;-><init>()V

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/ag;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ag;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->I:Lcom/baidu/mapsdkplatform/comapi/map/ag;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    sget-object v1, Lcom/baidu/mapapi/map/MapLayer;->MAP_LAYER_POI_MARKER:Lcom/baidu/mapapi/map/MapLayer;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->I:Lcom/baidu/mapsdkplatform/comapi/map/ag;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/c;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/c;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ar:Lcom/baidu/mapsdkplatform/comapi/map/c;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    sget-object v1, Lcom/baidu/mapapi/map/MapLayer;->MAP_LAYER_INDOOR_POI:Lcom/baidu/mapapi/map/MapLayer;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ar:Lcom/baidu/mapsdkplatform/comapi/map/c;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->e(Z)V

    :cond_0
    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/aj;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/aj;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    sget-object v1, Lcom/baidu/mapapi/map/MapLayer;->MAP_LAYER_OVERLAY:Lcom/baidu/mapapi/map/MapLayer;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/g;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/z;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/z;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    invoke-direct {p0, v0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/d;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    sget-object v1, Lcom/baidu/mapapi/map/MapLayer;->MAP_LAYER_LOCATION:Lcom/baidu/mapapi/map/MapLayer;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(FF)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    iput p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->c:F

    iput p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->b:F

    return-void
.end method

.method a(I)V
    .locals 23

    move-object/from16 v0, p0

    new-instance v1, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-direct {v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;-><init>()V

    iput-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(I)Z

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    const-string v3, "com.baidu.platform.comapi.wnplatform.walkmap.WNaviBaiduMap"

    const-string v4, "setId"

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Ljava/lang/String;Ljava/lang/String;J)V

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensityDpi()I

    move-result v1

    const/16 v2, 0xb4

    if-ge v1, v2, :cond_0

    const/16 v1, 0x12

    :goto_0
    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->l:I

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensityDpi()I

    move-result v1

    const/16 v3, 0xf0

    if-ge v1, v3, :cond_1

    const/16 v1, 0x19

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensityDpi()I

    move-result v1

    const/16 v3, 0x140

    if-ge v1, v3, :cond_2

    const/16 v1, 0x25

    goto :goto_0

    :cond_2
    const/16 v1, 0x32

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getModuleFileName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->getAppSDCardPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->getAppCachePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->getAppSecondCachePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->getMapTmpStgMax()I

    move-result v19

    invoke-static {}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->getDomTmpStgMax()I

    move-result v20

    invoke-static {}, Lcom/baidu/mapapi/common/EnvironmentUtilities;->getItsTmpStgMax()I

    move-result v21

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensityDpi()I

    move-result v6

    if-lt v6, v2, :cond_3

    const-string v2, "/h/"

    goto :goto_2

    :cond_3
    const-string v2, "/l/"

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/cfg"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/vmp"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "/a/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/idrres/"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/tmp/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->D:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Display;->getWidth()I

    move-result v16

    invoke-virtual {v2}, Landroid/view/Display;->getHeight()I

    move-result v17

    iget-object v6, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ao:Ljava/lang/String;

    iget v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ap:I

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensityDpi()I

    move-result v18

    const/16 v22, 0x0

    move-object v7, v8

    move-object v8, v1

    invoke-virtual/range {v6 .. v22}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIIIIII)Z

    return-void

    :cond_4
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "BDMapSDKException: Please give the right context."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method a(II)V
    .locals 0

    iput p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Q:I

    iput p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    return-void
.end method

.method public a(JJJJZ)V
    .locals 11

    move-object v0, p0

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v1, :cond_0

    return-void

    :cond_0
    move-wide v2, p1

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    invoke-virtual/range {v1 .. v10}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JJJJZ)V

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 8

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "type"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "x"

    sget v5, Lcom/baidu/mapsdkplatform/comapi/map/e;->O:I

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "y"

    sget v5, Lcom/baidu/mapsdkplatform/comapi/map/e;->P:I

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v4, "hidetime"

    const/16 v5, 0x3e8

    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v2, "data"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto/16 :goto_2

    :cond_1
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Lcom/baidu/mapapi/model/ParcelItem;

    invoke-direct {v4}, Lcom/baidu/mapapi/model/ParcelItem;-><init>()V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    mul-int v6, v6, v7

    mul-int/lit8 v6, v6, 0x4

    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v6

    const-string v7, "imgdata"

    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v6

    const-string v7, "imgindex"

    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const-string v7, "imgH"

    invoke-virtual {v5, v7, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    const-string v6, "imgW"

    invoke-virtual {v5, v6, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "hasIcon"

    const/4 v6, 0x1

    invoke-virtual {v5, p1, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v4, v5}, Lcom/baidu/mapapi/model/ParcelItem;->setBundle(Landroid/os/Bundle;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_3

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lcom/baidu/mapapi/model/ParcelItem;

    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/baidu/mapapi/model/ParcelItem;

    aput-object v4, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const-string v2, "icondata"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_3
    move-object p1, v1

    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(J)V

    return-void
.end method

.method a(Landroid/os/Handler;)V
    .locals 2

    const/16 v0, 0xfa0

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->registMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x27

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->registMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x29

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->registMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x31

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->registMessage(ILandroid/os/Handler;)V

    const v0, 0xff09

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->registMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x32

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->registMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x3e7

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->registMessage(ILandroid/os/Handler;)V

    iget-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    invoke-static {v0, v1, p0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/BaseMapCallback;->addLayerDataInterface(JLcom/baidu/mapsdkplatform/comjni/map/basemap/b;)V

    return-void
.end method

.method public a(Lcom/baidu/mapapi/map/MapLayer;Lcom/baidu/mapapi/map/MapLayer;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mapsdkplatform/comapi/map/d;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/baidu/mapsdkplatform/comapi/map/d;

    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-wide v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    iget-wide p1, p2, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JJ)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lcom/baidu/mapapi/map/MapLayer;Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mapsdkplatform/comapi/map/d;

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-wide v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    invoke-virtual {v0, v1, v2, p2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(JZ)V

    return-void
.end method

.method public a(Lcom/baidu/mapapi/map/MapStatusUpdate;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->q:Lcom/baidu/mapapi/map/MapStatusUpdate;

    return-void
.end method

.method public a(Lcom/baidu/mapapi/model/LatLngBounds;)V
    .locals 5

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/baidu/mapapi/model/LatLngBounds;->northeast:Lcom/baidu/mapapi/model/LatLng;

    iget-object p1, p1, Lcom/baidu/mapapi/model/LatLngBounds;->southwest:Lcom/baidu/mapapi/model/LatLng;

    invoke-static {v0}, Lcom/baidu/mapapi/model/CoordUtil;->ll2mc(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v0

    invoke-static {p1}, Lcom/baidu/mapapi/model/CoordUtil;->ll2mc(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object p1

    invoke-virtual {v0}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v2

    double-to-int v2, v2

    invoke-virtual {p1}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLongitudeE6()D

    move-result-wide v3

    double-to-int p1, v3

    invoke-virtual {v0}, Lcom/baidu/mapapi/model/inner/GeoPoint;->getLatitudeE6()D

    move-result-wide v3

    double-to-int v0, v3

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "maxCoorx"

    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "minCoory"

    invoke-virtual {v3, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "minCoorx"

    invoke-virtual {v3, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "maxCoory"

    invoke-virtual {v3, p1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p1, v3}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Landroid/os/Bundle;)V

    :cond_1
    :goto_0
    return-void
.end method

.method a(Lcom/baidu/mapsdkplatform/comapi/map/ab;)V
    .locals 7

    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/ad;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/ad;-><init>()V

    if-nez p1, :cond_0

    new-instance p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;

    invoke-direct {p1}, Lcom/baidu/mapsdkplatform/comapi/map/ab;-><init>()V

    :cond_0
    iget-object v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->a:Lcom/baidu/mapsdkplatform/comapi/map/ad;

    iget-boolean v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->f:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->y:Z

    iget-boolean v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->d:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->z:Z

    iget-boolean v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->e:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    iget-boolean v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->g:Z

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0, p0}, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a(Lcom/baidu/mapsdkplatform/comapi/map/e;)Landroid/os/Bundle;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Landroid/os/Bundle;Z)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    sget-object v1, Lcom/baidu/mapsdkplatform/comapi/map/aa;->a:Lcom/baidu/mapsdkplatform/comapi/map/aa;

    invoke-virtual {v1}, Lcom/baidu/mapsdkplatform/comapi/map/aa;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c(I)I

    iget-boolean v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->b:Z

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->u:Z

    iget-boolean v0, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->b:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {v0, v3, v4, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v0

    const/high16 v3, 0x42200000    # 40.0f

    mul-float v0, v0, v3

    float-to-int v0, v0

    sput v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->O:I

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v0

    mul-float v0, v0, v3

    float-to-int v0, v0

    sput v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->P:I

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v5, "x"

    sget v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->O:I

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "y"

    sget v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->P:I

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v5, "hidetime"

    const/16 v6, 0x3e8

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v4, "data"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/baidu/mapsdkplatform/comapi/map/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {v0, v3, v4, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    :goto_1
    iget p1, p1, Lcom/baidu/mapsdkplatform/comapi/map/ab;->c:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Z)V

    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->an:Lcom/baidu/mapsdkplatform/comapi/map/f;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/f;->a:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ar:Lcom/baidu/mapsdkplatform/comapi/map/c;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/c;->a:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->I:Lcom/baidu/mapsdkplatform/comapi/map/ag;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/ag;->a:J

    invoke-virtual {p1, v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->e(Z)V

    :cond_3
    return-void
.end method

.method public a(Lcom/baidu/mapsdkplatform/comapi/map/ad;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a(Lcom/baidu/mapsdkplatform/comapi/map/e;)Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "animation"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "animatime"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Landroid/os/Bundle;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/baidu/mapsdkplatform/comapi/map/ad;I)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a(Lcom/baidu/mapsdkplatform/comapi/map/e;)Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "animation"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "animatime"

    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-boolean p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->at:Z

    if-eqz p2, :cond_1

    new-instance p2, Lcom/baidu/mapsdkplatform/comapi/map/e$a;

    invoke-direct {p2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e$a;-><init>(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->au:Ljava/util/Queue;

    invoke-interface {p1, p2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->A()V

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Landroid/os/Bundle;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Lcom/baidu/mapsdkplatform/comapi/map/ak;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->C:Lcom/baidu/mapsdkplatform/comapi/map/ak;

    return-void
.end method

.method public a(Lcom/baidu/mapsdkplatform/comapi/map/n;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Lcom/baidu/mapsdkplatform/comapi/map/q;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->M:Lcom/baidu/mapsdkplatform/comapi/map/q;

    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;I)V

    return-void
.end method

.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/z;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    invoke-virtual {p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/z;->a(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    iget-wide v0, p2, Lcom/baidu/mapsdkplatform/comapi/map/z;->a:J

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(J)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Landroid/os/Bundle;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    invoke-direct {p0, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g(Landroid/os/Bundle;)V

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Bundle;

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {p1, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a([Landroid/os/Bundle;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public a(Z)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->an:Lcom/baidu/mapsdkplatform/comapi/map/f;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/f;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(J)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->an:Lcom/baidu/mapsdkplatform/comapi/map/f;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/f;->a:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    :cond_1
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->t:Z

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->R()V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->t:Z

    invoke-virtual {p1, v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Z)V

    return-void
.end method

.method public a(FFFF)Z
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    iget v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    int-to-float v4, v3

    sub-float v4, v4, p2

    int-to-float v3, v3

    sub-float v3, v3, p4

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    const/4 v9, 0x1

    if-ne v5, v9, :cond_12

    iget v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const-wide v13, 0x4066800000000000L    # 180.0

    const-wide v15, 0x40c3880000000000L    # 10000.0

    const-wide/high16 v17, 0x4000000000000000L    # 2.0

    const/16 v19, 0x0

    if-nez v5, :cond_6

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v5, v4

    cmpl-float v5, v5, v19

    if-lez v5, :cond_0

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float/2addr v5, v3

    cmpl-float v5, v5, v19

    if-gtz v5, :cond_1

    :cond_0
    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v5, v4

    cmpg-float v5, v5, v19

    if-gez v5, :cond_5

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float/2addr v5, v3

    cmpg-float v5, v5, v19

    if-gez v5, :cond_5

    :cond_1
    sub-float v5, v3, v4

    float-to-double v8, v5

    sub-float v10, v2, v1

    float-to-double v6, v10

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    iget-object v8, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v8, v8, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v9, v9, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v8, v9

    float-to-double v8, v8

    iget-object v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v11, v11, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v12, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v12, v12, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v11, v12

    float-to-double v11, v11

    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v8

    sub-double/2addr v6, v8

    mul-float v10, v10, v10

    mul-float v5, v5, v5

    add-float/2addr v10, v5

    float-to-double v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-wide v10, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v10

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->log(D)D

    move-result-wide v20

    div-double v10, v10, v20

    mul-double v10, v10, v15

    double-to-int v5, v10

    mul-double v6, v6, v13

    const-wide v10, 0x400921ff2e48e8a7L    # 3.1416

    div-double/2addr v6, v10

    double-to-int v6, v6

    const-wide/16 v10, 0x0

    cmpl-double v7, v8, v10

    if-lez v7, :cond_2

    const/16 v7, 0xbb8

    if-gt v5, v7, :cond_3

    const/16 v7, -0xbb8

    if-lt v5, v7, :cond_3

    :cond_2
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/16 v6, 0xa

    if-lt v5, v6, :cond_4

    :cond_3
    const/4 v5, 0x2

    iput v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v6, 0x1

    goto :goto_0

    :cond_4
    const/4 v5, 0x2

    const/4 v6, 0x1

    iput v6, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    goto :goto_0

    :cond_5
    const/4 v5, 0x2

    const/4 v6, 0x1

    iput v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    :goto_0
    iget v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    if-nez v5, :cond_7

    return v6

    :cond_6
    const/4 v6, 0x1

    :cond_7
    iget v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v7, 0x0

    if-ne v5, v6, :cond_9

    iget-boolean v6, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->y:Z

    if-eqz v6, :cond_9

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v5, v4

    cmpl-float v5, v5, v19

    if-lez v5, :cond_8

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float/2addr v5, v3

    cmpl-float v5, v5, v19

    if-lez v5, :cond_8

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/16 v5, 0x53

    :goto_1
    const/4 v6, 0x1

    invoke-virtual {v0, v6, v5, v7}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    goto/16 :goto_4

    :cond_8
    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v5, v4

    cmpg-float v5, v5, v19

    if-gez v5, :cond_12

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float/2addr v5, v3

    cmpg-float v5, v5, v19

    if-gez v5, :cond_12

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/16 v5, 0x57

    goto :goto_1

    :cond_9
    const/4 v6, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    if-eq v5, v9, :cond_a

    if-eq v5, v6, :cond_a

    if-ne v5, v8, :cond_12

    :cond_a
    sub-float v5, v3, v4

    float-to-double v9, v5

    sub-float v11, v2, v1

    float-to-double v6, v11

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v6

    iget-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v9, v9, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v10, v10, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v9, v10

    float-to-double v9, v9

    iget-object v12, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v12, v12, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v8, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v8, v8, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v12, v8

    float-to-double v13, v12

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v8

    sub-double/2addr v6, v8

    mul-float v11, v11, v11

    mul-float v5, v5, v5

    add-float/2addr v11, v5

    float-to-double v8, v11

    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-wide v10, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    move-result-wide v10

    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->log(D)D

    move-result-wide v12

    div-double/2addr v10, v12

    mul-double v10, v10, v15

    double-to-int v5, v10

    iget-object v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v10, v10, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v11, v11, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v10, v11

    float-to-double v10, v10

    iget-object v12, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v12, v12, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v12, v13

    float-to-double v12, v12

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v10

    iget-object v12, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v12, v12, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v12, v13

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v13, v14

    mul-float v12, v12, v13

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v13, v14

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v15, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v15, v15, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v14, v15

    mul-float v13, v13, v14

    add-float/2addr v12, v13

    float-to-double v12, v12

    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    add-double/2addr v10, v6

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    mul-double v14, v14, v12

    mul-double v14, v14, v8

    move/from16 v16, v3

    float-to-double v2, v1

    add-double/2addr v14, v2

    double-to-float v2, v14

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double v12, v12, v10

    mul-double v12, v12, v8

    float-to-double v10, v4

    add-double/2addr v12, v10

    double-to-float v3, v12

    const-wide v10, 0x4066800000000000L    # 180.0

    mul-double v6, v6, v10

    const-wide v10, 0x400921ff2e48e8a7L    # 3.1416

    div-double/2addr v6, v10

    double-to-int v6, v6

    const/16 v7, 0x2001

    const-wide/16 v10, 0x0

    cmpl-double v12, v8, v10

    if-lez v12, :cond_f

    iget v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v11, 0x3

    if-eq v11, v10, :cond_b

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v10

    const/16 v12, 0x7d0

    if-le v10, v12, :cond_f

    iget v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v12, 0x2

    if-ne v12, v10, :cond_f

    :cond_b
    iput v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v6

    iget v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    iget-boolean v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    if-eqz v10, :cond_11

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    cmpl-double v12, v8, v10

    if-lez v12, :cond_d

    iget v8, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    cmpl-float v6, v6, v8

    if-ltz v6, :cond_c

    const/4 v8, 0x0

    return v8

    :cond_c
    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/4 v9, 0x3

    goto :goto_2

    :cond_d
    const/4 v8, 0x0

    const/4 v9, 0x3

    iget v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->b:F

    cmpg-float v6, v6, v10

    if-gtz v6, :cond_e

    return v8

    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    :goto_2
    invoke-virtual {v0, v7, v9, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    goto :goto_3

    :cond_f
    if-eqz v6, :cond_11

    iget v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v8, 0x4

    if-eq v8, v5, :cond_10

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/16 v9, 0xa

    if-le v5, v9, :cond_11

    iget v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v9, 0x2

    if-ne v9, v5, :cond_11

    :cond_10
    iput v8, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    iget-boolean v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->z:Z

    if-eqz v5, :cond_11

    sget v5, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    const/4 v8, 0x1

    or-int/2addr v5, v8

    sput v5, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    invoke-virtual {v0, v7, v8, v6}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    :cond_11
    :goto_3
    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v2, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v3, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    goto :goto_5

    :cond_12
    :goto_4
    move/from16 v16, v3

    :goto_5
    iget v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v3, 0x2

    if-eq v3, v2, :cond_13

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v4, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    move/from16 v3, v16

    iput v3, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v1, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    move/from16 v2, p3

    iput v2, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    :cond_13
    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    if-nez v1, :cond_14

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Q:I

    const/4 v3, 0x2

    div-int/2addr v2, v3

    int-to-float v2, v2

    iput v2, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    div-int/2addr v2, v3

    int-to-float v2, v2

    iput v2, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    const-wide/16 v3, 0x0

    cmpl-double v5, v3, v1

    if-nez v5, :cond_14

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v1, v2

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v2, v3

    mul-float v1, v1, v2

    iget-object v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v2, v3

    iget-object v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v4, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v4, v4, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v3, v4

    mul-float v2, v2, v3

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    iget-object v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput-wide v1, v3, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    :cond_14
    const/4 v1, 0x1

    return v1
.end method

.method public a(J)Z
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/d;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public a(Landroid/graphics/Point;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v1, :cond_1

    return v0

    :cond_1
    iget v1, p1, Landroid/graphics/Point;->x:I

    if-ltz v1, :cond_2

    iget v1, p1, Landroid/graphics/Point;->y:I

    if-ltz v1, :cond_2

    iget v0, p1, Landroid/graphics/Point;->x:I

    sput v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->O:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    sput p1, Lcom/baidu/mapsdkplatform/comapi/map/e;->P:I

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "x"

    sget v3, Lcom/baidu/mapsdkplatform/comapi/map/e;->O:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "y"

    sget v3, Lcom/baidu/mapsdkplatform/comapi/map/e;->P:I

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "hidetime"

    const/16 v3, 0x3e8

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    const-string v1, "data"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    :goto_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/g;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(J)V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public a(Landroid/os/Bundle;)Z
    .locals 6

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    new-instance v0, Lcom/baidu/mapsdkplatform/comapi/map/al;

    invoke-direct {v0}, Lcom/baidu/mapsdkplatform/comapi/map/al;-><init>()V

    iput-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/al;->c:I

    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iget v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/al;->d:I

    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iget-object v4, v4, Lcom/baidu/mapsdkplatform/comapi/map/al;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(IILjava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iput-wide v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/al;->a:J

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->E:Ljava/util/List;

    iget-object v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "sdktileaddr"

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    invoke-direct {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->e(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->f(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method a(Landroid/view/MotionEvent;)Z
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ne v2, v4, :cond_1

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    float-to-int v7, v7

    invoke-virtual {v0, v6, v7}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(II)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    float-to-int v7, v7

    invoke-virtual {v0, v6, v7}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(II)Z

    move-result v6

    if-nez v6, :cond_1

    :cond_0
    const/4 v2, 0x1

    :cond_1
    if-ne v2, v4, :cond_22

    iget v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    int-to-float v2, v2

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    sub-float/2addr v2, v6

    iget v6, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    int-to-float v6, v6

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    sub-float/2addr v6, v7

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v9

    const/4 v10, 0x5

    if-eq v9, v10, :cond_5

    const/4 v10, 0x6

    if-eq v9, v10, :cond_4

    const/16 v10, 0x105

    if-eq v9, v10, :cond_3

    const/16 v10, 0x106

    if-eq v9, v10, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v9

    iput-wide v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->X:J

    goto :goto_0

    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v9

    iput-wide v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->V:J

    goto :goto_1

    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v9

    iput-wide v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Y:J

    :goto_0
    iget v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Z:I

    add-int/2addr v9, v5

    goto :goto_2

    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v9

    iput-wide v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->W:J

    :goto_1
    iget v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Z:I

    sub-int/2addr v9, v5

    :goto_2
    iput v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Z:I

    :goto_3
    iget-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    if-nez v9, :cond_6

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v9

    iput-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    :cond_6
    iget-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    invoke-virtual {v9, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-static {}, Lcom/baidu/mapapi/JNIInitializer;->getCachedContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    if-nez v1, :cond_7

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v9

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v9

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v1

    move/from16 v21, v9

    move v9, v1

    move/from16 v1, v21

    :goto_4
    iget-object v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    const/16 v11, 0x3e8

    int-to-float v9, v9

    invoke-virtual {v10, v11, v9}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    invoke-virtual {v9, v5}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v9

    iget-object v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    invoke-virtual {v10, v5}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v10

    iget-object v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    invoke-virtual {v11, v4}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v11

    iget-object v12, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->U:Landroid/view/VelocityTracker;

    invoke-virtual {v12, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v12

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    int-to-float v1, v1

    cmpl-float v9, v9, v1

    if-gtz v9, :cond_b

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpl-float v9, v9, v1

    if-gtz v9, :cond_b

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpl-float v9, v9, v1

    if-gtz v9, :cond_b

    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpl-float v1, v9, v1

    if-lez v1, :cond_8

    goto :goto_6

    :cond_8
    iget v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    if-nez v1, :cond_1e

    iget v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Z:I

    if-nez v1, :cond_1e

    iget-wide v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->X:J

    iget-wide v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Y:J

    cmp-long v1, v9, v11

    if-lez v1, :cond_9

    goto :goto_5

    :cond_9
    move-wide v9, v11

    :goto_5
    iput-wide v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->X:J

    iget-wide v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->V:J

    iget-wide v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->W:J

    cmp-long v1, v11, v13

    if-gez v1, :cond_a

    move-wide v11, v13

    :cond_a
    iput-wide v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->V:J

    sub-long/2addr v9, v11

    const-wide/16 v11, 0xc8

    cmp-long v1, v9, v11

    if-gez v1, :cond_1e

    iget-boolean v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    if-eqz v1, :cond_1e

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v1

    if-eqz v1, :cond_1e

    iget v3, v1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    const/high16 v9, 0x3f800000    # 1.0f

    sub-float/2addr v3, v9

    iput v3, v1, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    sget v3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    or-int/2addr v3, v5

    sput v3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    const/16 v3, 0x12c

    invoke-virtual {v0, v1, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(Lcom/baidu/mapsdkplatform/comapi/map/ad;I)V

    goto/16 :goto_b

    :cond_b
    :goto_6
    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    if-eqz v1, :cond_1e

    iget v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const-wide v12, 0x4066800000000000L    # 180.0

    const-wide v16, 0x40c3880000000000L    # 10000.0

    const-wide/high16 v18, 0x4000000000000000L    # 2.0

    const/4 v14, 0x0

    if-nez v1, :cond_12

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v1, v2

    cmpl-float v1, v1, v14

    if-lez v1, :cond_c

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float/2addr v1, v6

    cmpl-float v1, v1, v14

    if-gtz v1, :cond_d

    :cond_c
    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v1, v2

    cmpg-float v1, v1, v14

    if-gez v1, :cond_11

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float/2addr v1, v6

    cmpg-float v1, v1, v14

    if-gez v1, :cond_11

    :cond_d
    sub-float v1, v6, v2

    float-to-double v14, v1

    sub-float v3, v8, v7

    move/from16 v20, v6

    float-to-double v5, v3

    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v5

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v15, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v15, v15, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v14, v15

    float-to-double v14, v14

    iget-object v4, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v4, v4, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v9, v9, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v4, v9

    float-to-double v10, v4

    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v9

    sub-double/2addr v5, v9

    mul-float v3, v3, v3

    mul-float v1, v1, v1

    add-float/2addr v3, v1

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-wide v9, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    div-double/2addr v3, v9

    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->log(D)D

    move-result-wide v14

    div-double/2addr v9, v14

    mul-double v9, v9, v16

    double-to-int v1, v9

    mul-double v5, v5, v12

    const-wide v9, 0x400921ff2e48e8a7L    # 3.1416

    div-double/2addr v5, v9

    double-to-int v5, v5

    const-wide/16 v9, 0x0

    cmpl-double v6, v3, v9

    if-lez v6, :cond_e

    const/16 v3, 0xbb8

    if-gt v1, v3, :cond_f

    const/16 v3, -0xbb8

    if-lt v1, v3, :cond_f

    :cond_e
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v1

    const/16 v3, 0xa

    if-lt v1, v3, :cond_10

    :cond_f
    const/4 v1, 0x2

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v3, 0x1

    goto :goto_7

    :cond_10
    const/4 v1, 0x2

    const/4 v3, 0x1

    iput v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    goto :goto_7

    :cond_11
    move/from16 v20, v6

    const/4 v1, 0x2

    const/4 v3, 0x1

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    :goto_7
    iget v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    if-nez v1, :cond_13

    return v3

    :cond_12
    move/from16 v20, v6

    const/4 v3, 0x1

    :cond_13
    iget v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    if-ne v1, v3, :cond_15

    iget-boolean v3, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->y:Z

    if-eqz v3, :cond_15

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v1, v2

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-lez v1, :cond_14

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float v1, v1, v20

    cmpl-float v1, v1, v3

    if-lez v1, :cond_14

    sget v1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    const/4 v3, 0x1

    or-int/2addr v1, v3

    sput v1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/16 v1, 0x53

    :goto_8
    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v4}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    goto/16 :goto_c

    :cond_14
    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v1, v2

    const/4 v3, 0x0

    cmpg-float v1, v1, v3

    if-gez v1, :cond_1f

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    sub-float v1, v1, v20

    cmpg-float v1, v1, v3

    if-gez v1, :cond_1f

    sget v1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    const/4 v3, 0x1

    or-int/2addr v1, v3

    sput v1, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/16 v1, 0x57

    goto :goto_8

    :cond_15
    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eq v1, v5, :cond_16

    if-eq v1, v3, :cond_16

    if-ne v1, v4, :cond_1f

    :cond_16
    sub-float v6, v20, v2

    float-to-double v9, v6

    sub-float v1, v8, v7

    float-to-double v3, v1

    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    iget-object v9, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v9, v9, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v10, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v10, v10, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v9, v10

    float-to-double v9, v9

    iget-object v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v11, v11, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v11, v14

    float-to-double v12, v11

    invoke-static {v9, v10, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v9

    sub-double/2addr v3, v9

    mul-float v1, v1, v1

    mul-float v6, v6, v6

    add-float/2addr v1, v6

    float-to-double v9, v1

    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    iget-object v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-wide v11, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    div-double/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v11

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->log(D)D

    move-result-wide v13

    div-double/2addr v11, v13

    mul-double v11, v11, v16

    double-to-int v1, v11

    iget-object v6, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v11, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v11, v11, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v6, v11

    float-to-double v11, v6

    iget-object v6, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v6, v13

    float-to-double v13, v6

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v11

    iget-object v6, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v6, v6, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v6, v13

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v13, v14

    mul-float v6, v6, v13

    iget-object v13, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v13, v13, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v13, v14

    iget-object v14, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v14, v14, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v5, v0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v5, v5, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v14, v5

    mul-float v13, v13, v14

    add-float/2addr v6, v13

    float-to-double v5, v6

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    add-double/2addr v11, v3

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    mul-double v13, v13, v5

    mul-double v13, v13, v9

    move/from16 v17, v1

    float-to-double v0, v7

    add-double/2addr v13, v0

    double-to-float v0, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    mul-double v5, v5, v11

    mul-double v5, v5, v9

    float-to-double v11, v2

    add-double/2addr v5, v11

    double-to-float v1, v5

    const-wide v5, 0x4066800000000000L    # 180.0

    mul-double v3, v3, v5

    const-wide v5, 0x400921ff2e48e8a7L    # 3.1416

    div-double/2addr v3, v5

    double-to-int v3, v3

    const/16 v4, 0x2001

    const-wide/16 v5, 0x0

    cmpl-double v11, v9, v5

    move-object/from16 v6, p0

    if-lez v11, :cond_1b

    iget v5, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v11, 0x3

    if-eq v11, v5, :cond_17

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/16 v12, 0x7d0

    if-le v5, v12, :cond_1b

    iget v5, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v12, 0x2

    if-ne v12, v5, :cond_1b

    :cond_17
    iput v11, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->E()Lcom/baidu/mapsdkplatform/comapi/map/ad;

    move-result-object v3

    iget v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/ad;->a:F

    iget-boolean v11, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    if-eqz v11, :cond_1d

    const-wide/high16 v11, 0x3ff0000000000000L    # 1.0

    cmpl-double v13, v9, v11

    if-lez v13, :cond_19

    iget v9, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    cmpl-float v3, v3, v9

    if-ltz v3, :cond_18

    const/4 v9, 0x0

    return v9

    :cond_18
    sget v3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    const/4 v10, 0x1

    or-int/2addr v3, v10

    sput v3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    move/from16 v5, v17

    const/4 v11, 0x3

    goto :goto_9

    :cond_19
    move/from16 v5, v17

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x3

    iget v12, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->b:F

    cmpg-float v3, v3, v12

    if-gtz v3, :cond_1a

    return v9

    :cond_1a
    sget v3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    or-int/2addr v3, v10

    sput v3, Lcom/baidu/mapapi/map/BaiduMap;->mapStatusReason:I

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    :goto_9
    invoke-virtual {v6, v4, v11, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    goto :goto_a

    :cond_1b
    if-eqz v3, :cond_1d

    iget v5, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v9, 0x4

    if-eq v9, v5, :cond_1c

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v5

    const/16 v10, 0xa

    if-le v5, v10, :cond_1d

    iget v5, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v10, 0x2

    if-ne v10, v5, :cond_1d

    :cond_1c
    iput v9, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    iget-boolean v5, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->z:Z

    if-eqz v5, :cond_1d

    invoke-direct/range {p0 .. p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/4 v5, 0x1

    invoke-virtual {v6, v4, v5, v3}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    :cond_1d
    :goto_a
    iget-object v3, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v0, v3, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    goto :goto_d

    :cond_1e
    :goto_b
    move/from16 v20, v6

    :cond_1f
    :goto_c
    move-object v6, v0

    :goto_d
    iget v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->S:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_20

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    move/from16 v1, v20

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v7, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput v8, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    :cond_20
    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    if-nez v0, :cond_21

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->Q:I

    const/4 v2, 0x2

    div-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->f:F

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    div-int/2addr v1, v2

    int-to-float v1, v1

    iput v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->g:F

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    const-wide/16 v2, 0x0

    cmpl-double v4, v2, v0

    if-nez v4, :cond_21

    iget-object v0, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v1, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v0, v1

    iget-object v1, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->b:F

    iget-object v2, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->a:F

    sub-float/2addr v1, v2

    mul-float v0, v0, v1

    iget-object v1, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v2, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v1, v2

    iget-object v2, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v2, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->d:F

    iget-object v3, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget v3, v3, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->c:F

    sub-float/2addr v2, v3

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iget-object v2, v6, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iput-wide v0, v2, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->h:D

    :cond_21
    const/4 v0, 0x1

    return v0

    :cond_22
    move-object v6, v0

    const/4 v0, 0x1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_25

    if-eq v2, v0, :cond_24

    const/4 v3, 0x2

    if-eq v2, v3, :cond_23

    const/4 v2, 0x0

    return v2

    :cond_23
    invoke-direct/range {p0 .. p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->c(Landroid/view/MotionEvent;)Z

    goto :goto_e

    :cond_24
    invoke-direct/range {p0 .. p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->d(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_25
    invoke-direct/range {p0 .. p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(Landroid/view/MotionEvent;)V

    :goto_e
    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->N:Lcom/baidu/mapsdkplatform/comapi/map/ah;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/ah;->a(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object p1

    return-object p1
.end method

.method b(FF)V
    .locals 8

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ae:J

    iget-wide v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ad:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x190

    const/4 v6, 0x1

    cmp-long v7, v2, v4

    if-gez v7, :cond_2

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x42f00000    # 120.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ad:J

    iput-boolean v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->af:Z

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ae:J

    :cond_2
    iput-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ad:J

    :goto_0
    iput p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    iput p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    float-to-int p1, p1

    float-to-int p2, p2

    const/4 v0, 0x4

    const/4 v1, 0x0

    shl-int/lit8 p2, p2, 0x10

    or-int/2addr p1, p2

    invoke-virtual {p0, v0, v1, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    iput-boolean v6, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ac:Z

    return-void
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->f(I)Z

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method b(Landroid/os/Handler;)V
    .locals 2

    const/16 v0, 0xfa0

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->unregistMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x29

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->unregistMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x31

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->unregistMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x27

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->unregistMessage(ILandroid/os/Handler;)V

    const v0, 0xff09

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->unregistMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x32

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->unregistMessage(ILandroid/os/Handler;)V

    const/16 v0, 0x3e7

    invoke-static {v0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/MessageCenter;->unregistMessage(ILandroid/os/Handler;)V

    iget-wide v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->j:J

    invoke-static {v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/BaseMapCallback;->removeLayerDataInterface(J)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->A:Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->A:Z

    return v0
.end method

.method public c()V
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/d;

    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-wide v3, v1, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    const/4 v1, 0x0

    invoke-virtual {v2, v3, v4, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method c(I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(I)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    :cond_0
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->f(Landroid/os/Bundle;)V

    return-void
.end method

.method public c(Z)V
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->av:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aq:Lcom/baidu/mapsdkplatform/comapi/map/b;

    iget-wide v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/b;->a:J

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    iget-wide v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/aj;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JJ)Z

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->av:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    iget-wide v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/aj;->a:J

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aq:Lcom/baidu/mapsdkplatform/comapi/map/b;

    iget-wide v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/b;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JJ)Z

    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->av:Z

    :cond_2
    return-void
.end method

.method c(FF)Z
    .locals 8

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-wide v4, Lcom/baidu/mapsdkplatform/comapi/map/e;->m:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x12c

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/baidu/mapsdkplatform/comapi/map/n;

    float-to-int v3, p1

    float-to-int v4, p2

    invoke-virtual {p0, v3, v4}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v3

    if-eqz v2, :cond_2

    invoke-interface {v2, v3}, Lcom/baidu/mapsdkplatform/comapi/map/n;->d(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_0

    :cond_3
    return v1

    :cond_4
    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    sub-float v2, p2, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v3

    float-to-double v3, v3

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    cmpl-double v7, v3, v5

    invoke-static {}, Lcom/baidu/mapapi/common/SysOSUtil;->getDensity()F

    move-result v3

    float-to-double v3, v3

    if-lez v7, :cond_5

    mul-double v3, v3, v5

    :cond_5
    double-to-float v3, v3

    iget-boolean v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ac:Z

    if-eqz v4, :cond_6

    div-float/2addr v0, v3

    const/high16 v4, 0x40400000    # 3.0f

    cmpg-float v0, v0, v4

    if-gtz v0, :cond_6

    div-float/2addr v2, v3

    cmpg-float v0, v2, v4

    if-gtz v0, :cond_6

    return v1

    :cond_6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ac:Z

    float-to-int v2, p1

    float-to-int v3, p2

    if-gez v2, :cond_7

    const/4 v2, 0x0

    :cond_7
    if-gez v3, :cond_8

    const/4 v3, 0x0

    :cond_8
    iget-boolean v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    if-eqz v4, :cond_9

    iget v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aj:F

    iput v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ah:F

    iget v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ak:F

    iput v4, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ai:F

    iput p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aj:F

    iput p2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ak:F

    iget-wide p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->am:J

    iput-wide p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->al:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->am:J

    iput-boolean v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ag:Z

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->S()V

    const/4 p1, 0x3

    shl-int/lit8 p2, v3, 0x10

    or-int/2addr p2, v2

    invoke-virtual {p0, p1, v0, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    :cond_9
    return v0
.end method

.method c(II)Z
    .locals 2

    const/4 v0, 0x0

    if-ltz p1, :cond_1

    iget v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->Q:I

    add-int/2addr v1, v0

    if-gt p1, v1, :cond_1

    if-ltz p2, :cond_1

    iget p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->R:I

    add-int/2addr p1, v0

    if-le p2, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public d()V
    .locals 6

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mapsdkplatform/comapi/map/d;

    instance-of v3, v1, Lcom/baidu/mapsdkplatform/comapi/map/z;

    if-nez v3, :cond_2

    instance-of v3, v1, Lcom/baidu/mapsdkplatform/comapi/map/a;

    if-nez v3, :cond_2

    instance-of v3, v1, Lcom/baidu/mapsdkplatform/comapi/map/p;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-wide v3, v1, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    const/4 v1, 0x1

    invoke-virtual {v2, v3, v4, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v3, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-wide v4, v1, Lcom/baidu/mapsdkplatform/comapi/map/d;->a:J

    invoke-virtual {v3, v4, v5, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c(Z)V

    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->g(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->g(Landroid/os/Bundle;)V

    return-void
.end method

.method public d(Z)V
    .locals 5

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aw:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    iget-wide v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/aj;->a:J

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    iget-wide v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/z;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JJ)Z

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aw:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    iget-wide v1, p1, Lcom/baidu/mapsdkplatform/comapi/map/z;->a:J

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    iget-wide v3, p1, Lcom/baidu/mapsdkplatform/comapi/map/aj;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JJ)Z

    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aw:Z

    :cond_2
    return-void
.end method

.method d(FF)Z
    .locals 7

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/mapsdkplatform/comapi/map/n;

    float-to-int v4, p1

    float-to-int v5, p2

    invoke-virtual {p0, v4, v5}, Lcom/baidu/mapsdkplatform/comapi/map/e;->b(II)Lcom/baidu/mapapi/model/inner/GeoPoint;

    move-result-object v4

    if-eqz v3, :cond_0

    invoke-interface {v3, v4}, Lcom/baidu/mapsdkplatform/comapi/map/n;->e(Lcom/baidu/mapapi/model/inner/GeoPoint;)V

    goto :goto_0

    :cond_1
    iput-boolean v2, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->p:Z

    return v1

    :cond_2
    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->T:Lcom/baidu/mapsdkplatform/comapi/map/l$a;

    iget-boolean v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/l$a;->e:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->af:Z

    if-eqz v0, :cond_3

    invoke-direct {p0, p1, p2}, Lcom/baidu/mapsdkplatform/comapi/map/e;->e(FF)Z

    move-result p1

    return p1

    :cond_3
    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ag:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->T()Z

    move-result p1

    return p1

    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ae:J

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x190

    cmp-long v0, v3, v5

    if-gez v0, :cond_5

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aa:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v3, 0x41200000    # 10.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_5

    iget v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ab:F

    sub-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_5

    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->M()V

    return v1

    :cond_5
    invoke-virtual {p0}, Lcom/baidu/mapsdkplatform/comapi/map/e;->M()V

    float-to-int p1, p1

    float-to-int p2, p2

    if-gez p1, :cond_6

    const/4 p1, 0x0

    :cond_6
    if-gez p2, :cond_7

    const/4 p2, 0x0

    :cond_7
    const/4 v0, 0x5

    shl-int/lit8 p2, p2, 0x10

    or-int/2addr p1, p2

    invoke-virtual {p0, v0, v2, p1}, Lcom/baidu/mapsdkplatform/comapi/map/e;->a(III)I

    return v1
.end method

.method public e(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    return-void
.end method

.method public e()Z
    .locals 4

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v1, :cond_0

    iget-wide v2, v0, Lcom/baidu/mapsdkplatform/comapi/map/al;->a:J

    invoke-virtual {v1, v2, v3}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c(J)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method f()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/baidu/mapsdkplatform/comapi/map/ah;

    invoke-direct {v1, v0}, Lcom/baidu/mapsdkplatform/comapi/map/ah;-><init>(Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;)V

    iput-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->N:Lcom/baidu/mapsdkplatform/comapi/map/ah;

    return-void
.end method

.method public f(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->B:Lcom/baidu/mapsdkplatform/comapi/map/al;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/al;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    return-void
.end method

.method public g(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->an:Lcom/baidu/mapsdkplatform/comapi/map/f;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/f;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    return-void
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->s:Z

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->e(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->x:Z

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(Z)V

    return-void
.end method

.method public i(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->s:Z

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->c(Z)V

    return-void
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->x:Z

    return v0
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->d(Z)V

    return-void
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->k()Z

    move-result v0

    return v0
.end method

.method public k(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->u:Z

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->H:Lcom/baidu/mapsdkplatform/comapi/map/g;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/g;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    return-void
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->t:Z

    return v0
.end method

.method public l(Z)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    const/high16 v1, 0x41b00000    # 22.0f

    goto :goto_0

    :cond_1
    const/high16 v1, 0x41a80000    # 21.0f

    :goto_0
    iput v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->a:F

    iput v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->c:F

    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->e(Z)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->aq:Lcom/baidu/mapsdkplatform/comapi/map/b;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/b;->a:J

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->d(J)V

    iget-object p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ar:Lcom/baidu/mapsdkplatform/comapi/map/c;

    iget-wide v0, v0, Lcom/baidu/mapsdkplatform/comapi/map/c;->a:J

    invoke-virtual {p1, v0, v1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->d(J)V

    return-void
.end method

.method public l()Z
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->an:Lcom/baidu/mapsdkplatform/comapi/map/f;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/f;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(J)Z

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->o()Z

    move-result v0

    return v0
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->J:Lcom/baidu/mapsdkplatform/comapi/map/aj;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/aj;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->d(J)V

    return-void
.end method

.method public n(Z)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->f(Z)V

    return-void
.end method

.method public o()V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->p()V

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->K:Lcom/baidu/mapsdkplatform/comapi/map/p;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/p;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(J)V

    return-void
.end method

.method public o(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->v:Z

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->G:Lcom/baidu/mapsdkplatform/comapi/map/z;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/z;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    return-void
.end method

.method public p()Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->q()Lcom/baidu/mapapi/map/MapBaseIndoorMapInfo;

    move-result-object v0

    return-object v0
.end method

.method public p(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->w:Z

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->K:Lcom/baidu/mapsdkplatform/comapi/map/p;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/p;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    return-void
.end method

.method public q(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    return-void
.end method

.method public q()Z
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->r()Z

    move-result v0

    return v0
.end method

.method public r(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    return-void
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->u:Z

    return v0
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->g:Z

    return-void
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->v:Z

    return v0
.end method

.method public t()V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->K:Lcom/baidu/mapsdkplatform/comapi/map/p;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/p;->a:J

    invoke-virtual {v0, v1, v2}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->b(J)V

    return-void
.end method

.method public t(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->z:Z

    return-void
.end method

.method u()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->e()V

    return-void
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->y:Z

    return-void
.end method

.method v()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->f()V

    return-void
.end method

.method public v(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->I:Lcom/baidu/mapsdkplatform/comapi/map/ag;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/ag;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    :cond_0
    return-void
.end method

.method public w(Z)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->i:Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->ar:Lcom/baidu/mapsdkplatform/comapi/map/c;

    iget-wide v1, v1, Lcom/baidu/mapsdkplatform/comapi/map/c;->a:J

    invoke-virtual {v0, v1, v2, p1}, Lcom/baidu/mapsdkplatform/comjni/map/basemap/a;->a(JZ)V

    :cond_0
    return-void
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->e:Z

    return v0
.end method

.method public x(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->at:Z

    return-void
.end method

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->f:Z

    return v0
.end method

.method public y()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->z:Z

    return v0
.end method

.method public z()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/mapsdkplatform/comapi/map/e;->y:Z

    return v0
.end method
