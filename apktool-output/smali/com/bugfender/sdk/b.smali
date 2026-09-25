.class public Lcom/bugfender/sdk/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field private static final g:Ljava/lang/String; = "UI"


# instance fields
.field public final a:Lcom/bugfender/sdk/k1;

.field private final b:Lcom/bugfender/sdk/m1;

.field private final c:Z

.field private final d:Z

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bugfender/sdk/f3;",
            ">;>;"
        }
    .end annotation
.end field

.field private f:Lcom/bugfender/sdk/x1;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/k1;Lcom/bugfender/sdk/m1;ZZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bugfender/sdk/b;->e:Ljava/util/Map;

    iput-object p1, p0, Lcom/bugfender/sdk/b;->a:Lcom/bugfender/sdk/k1;

    iput-object p2, p0, Lcom/bugfender/sdk/b;->b:Lcom/bugfender/sdk/m1;

    iput-boolean p3, p0, Lcom/bugfender/sdk/b;->c:Z

    iput-boolean p4, p0, Lcom/bugfender/sdk/b;->d:Z

    new-instance p1, Lcom/bugfender/sdk/x1;

    invoke-direct {p1}, Lcom/bugfender/sdk/x1;-><init>()V

    iput-object p1, p0, Lcom/bugfender/sdk/b;->f:Lcom/bugfender/sdk/x1;

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/b;Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Landroid/app/Activity;)V
    .locals 3

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/bugfender/sdk/b;->f:Lcom/bugfender/sdk/x1;

    new-instance v2, Lcom/bugfender/sdk/b$a;

    invoke-direct {v2, p0, p1}, Lcom/bugfender/sdk/b$a;-><init>(Lcom/bugfender/sdk/b;Landroid/app/Activity;)V

    invoke-virtual {v1, v0, v2}, Lcom/bugfender/sdk/x1;->a(Landroid/view/View;Lcom/bugfender/sdk/x1$a;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/bugfender/sdk/b;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bugfender/sdk/f3;

    invoke-interface {v2}, Lcom/bugfender/sdk/f3;->a()V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    iget-object v0, p0, Lcom/bugfender/sdk/b;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static synthetic a(Lcom/bugfender/sdk/b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bugfender/sdk/b;->c:Z

    return p0
.end method

.method private b(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/bugfender/sdk/b;->c:Z

    if-eqz v0, :cond_0

    const-string v0, "UI"

    invoke-static {v0, p1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/bugfender/sdk/b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bugfender/sdk/b;->d:Z

    return p0
.end method

.method private c(Landroid/app/Activity;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method static synthetic c(Lcom/bugfender/sdk/b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/b;->e:Ljava/util/Map;

    return-object p0
.end method

.method private c(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->d(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/bugfender/sdk/b;)Lcom/bugfender/sdk/m1;
    .locals 0

    iget-object p0, p0, Lcom/bugfender/sdk/b;->b:Lcom/bugfender/sdk/m1;

    return-object p0
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lcom/bugfender/sdk/b;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bugfender/sdk/b;->a:Lcom/bugfender/sdk/k1;

    const-string v1, "UI"

    invoke-virtual {v0, v1, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private d(Landroid/app/Activity;)Z
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/b;->e:Ljava/util/Map;

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Activity created: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Activity destroyed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/b;->c(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->b(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Activity paused: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Activity resumed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Activity save instance state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Activity started: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/b;->c(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->d(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->a(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Activity stopped: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/b;->c(Ljava/lang/String;)V

    return-void
.end method
