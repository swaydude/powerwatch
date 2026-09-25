.class Lcom/bugfender/sdk/s2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/s2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/widget/AdapterView$OnItemSelectedListener;

.field final synthetic b:Lcom/bugfender/sdk/s2;


# direct methods
.method private constructor <init>(Lcom/bugfender/sdk/s2;Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/s2$b;->b:Lcom/bugfender/sdk/s2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/bugfender/sdk/s2$b;->a:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-void
.end method

.method synthetic constructor <init>(Lcom/bugfender/sdk/s2;Landroid/widget/AdapterView$OnItemSelectedListener;Lcom/bugfender/sdk/s2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/bugfender/sdk/s2$b;-><init>(Lcom/bugfender/sdk/s2;Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private a(Landroid/view/View;)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OnItemSelected in Spinner with { id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p2}, Lcom/bugfender/sdk/s2$b;->a(Landroid/view/View;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", position: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/s2$b;->b:Lcom/bugfender/sdk/s2;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/n;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/bugfender/sdk/s2$b;->a:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v2, :cond_0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, p4

    invoke-interface/range {v2 .. v7}, Landroid/widget/AdapterView$OnItemSelectedListener;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_0
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/bugfender/sdk/s2$b;->a:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/widget/AdapterView$OnItemSelectedListener;->onNothingSelected(Landroid/widget/AdapterView;)V

    :cond_0
    return-void
.end method
