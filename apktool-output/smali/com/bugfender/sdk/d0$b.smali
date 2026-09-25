.class Lcom/bugfender/sdk/d0$b;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Lcom/bugfender/sdk/k1;

.field private final d:Z

.field private final e:Z


# direct methods
.method private constructor <init>(ILjava/lang/String;Lcom/bugfender/sdk/k1;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    iput p1, p0, Lcom/bugfender/sdk/d0$b;->a:I

    iput-object p2, p0, Lcom/bugfender/sdk/d0$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/bugfender/sdk/d0$b;->c:Lcom/bugfender/sdk/k1;

    iput-boolean p4, p0, Lcom/bugfender/sdk/d0$b;->d:Z

    iput-boolean p5, p0, Lcom/bugfender/sdk/d0$b;->e:Z

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;Lcom/bugfender/sdk/k1;ZZLcom/bugfender/sdk/d0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/bugfender/sdk/d0$b;-><init>(ILjava/lang/String;Lcom/bugfender/sdk/k1;ZZ)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lcom/bugfender/sdk/d0$b;->d:Z

    const-string v1, "Interaction"

    if-eqz v0, :cond_0

    invoke-static {v1, p1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/bugfender/sdk/d0$b;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bugfender/sdk/d0$b;->c:Lcom/bugfender/sdk/k1;

    invoke-virtual {v0, v1, p1}, Lcom/bugfender/sdk/k1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OnTextChanged in EditText with { id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/bugfender/sdk/d0$b;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/bugfender/sdk/d0$b;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, ", text: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bugfender/sdk/d0$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/bugfender/sdk/d0$b;->a(Ljava/lang/String;)V

    return-void
.end method
