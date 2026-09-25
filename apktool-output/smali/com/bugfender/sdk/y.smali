.class public Lcom/bugfender/sdk/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/y$b;
    }
.end annotation


# static fields
.field public static final d:Lcom/bugfender/sdk/y;


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bugfender/sdk/y$b;

    invoke-direct {v0}, Lcom/bugfender/sdk/y$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/y$b;->b(Z)Lcom/bugfender/sdk/y$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/y$b;->a(Z)Lcom/bugfender/sdk/y$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/bugfender/sdk/y$b;->a(I)Lcom/bugfender/sdk/y$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bugfender/sdk/y$b;->a()Lcom/bugfender/sdk/y;

    move-result-object v0

    sput-object v0, Lcom/bugfender/sdk/y;->d:Lcom/bugfender/sdk/y;

    return-void
.end method

.method private constructor <init>(ZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/bugfender/sdk/y;->a:Z

    iput-boolean p2, p0, Lcom/bugfender/sdk/y;->b:Z

    iput p3, p0, Lcom/bugfender/sdk/y;->c:I

    return-void
.end method

.method synthetic constructor <init>(ZZILcom/bugfender/sdk/y$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/bugfender/sdk/y;-><init>(ZZI)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/bugfender/sdk/y;->c:I

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bugfender/sdk/y;->b:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bugfender/sdk/y;->a:Z

    return v0
.end method
