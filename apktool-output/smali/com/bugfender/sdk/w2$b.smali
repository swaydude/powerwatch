.class Lcom/bugfender/sdk/w2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/w2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field final synthetic b:Lcom/bugfender/sdk/w2;


# direct methods
.method private constructor <init>(Lcom/bugfender/sdk/w2;Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/bugfender/sdk/w2$b;->b:Lcom/bugfender/sdk/w2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/bugfender/sdk/w2$b;->a:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method synthetic constructor <init>(Lcom/bugfender/sdk/w2;Landroid/widget/CompoundButton$OnCheckedChangeListener;Lcom/bugfender/sdk/w2$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/bugfender/sdk/w2$b;-><init>(Lcom/bugfender/sdk/w2;Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OnCheckedChanged in CompoundButton (Switch / SwitchCompat) with { id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", checked: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/bugfender/sdk/w2$b;->b:Lcom/bugfender/sdk/w2;

    invoke-virtual {v1, v0}, Lcom/bugfender/sdk/n;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/bugfender/sdk/w2$b;->a:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    :cond_0
    return-void
.end method
