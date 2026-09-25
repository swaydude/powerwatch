.class Lcom/bugfender/sdk/x1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Lcom/bugfender/sdk/x1$a;

.field final synthetic c:Lcom/bugfender/sdk/x1;


# direct methods
.method public constructor <init>(Lcom/bugfender/sdk/x1;Landroid/view/View;Lcom/bugfender/sdk/x1$a;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/x1$b;->c:Lcom/bugfender/sdk/x1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/bugfender/sdk/x1$b;->a:Landroid/view/View;

    iput-object p3, p0, Lcom/bugfender/sdk/x1$b;->b:Lcom/bugfender/sdk/x1$a;

    return-void
.end method

.method private a(Landroid/view/View;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    instance-of v0, p1, Landroid/widget/AdapterView;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/bugfender/sdk/x1$b;->a(Landroid/view/View;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/bugfender/sdk/x1$b;->a:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/x1$b;->a(Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/x1$b;->b:Lcom/bugfender/sdk/x1$a;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/bugfender/sdk/x1$a;->a(Ljava/util/List;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bugfender/sdk/x1$b;->b:Lcom/bugfender/sdk/x1$a;

    return-void
.end method
