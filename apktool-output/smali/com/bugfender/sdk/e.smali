.class public Lcom/bugfender/sdk/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/e;->a(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bugfender/sdk/e;->a:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "Key must be not null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lcom/bugfender/sdk/e;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/e;

    invoke-direct {v0, p0}, Lcom/bugfender/sdk/e;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/e;->a:Ljava/lang/String;

    return-object v0
.end method
