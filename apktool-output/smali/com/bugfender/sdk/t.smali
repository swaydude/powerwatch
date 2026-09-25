.class public Lcom/bugfender/sdk/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/t$c;,
        Lcom/bugfender/sdk/t$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Ljava/lang/Thread;

.field private final c:Ljava/lang/Throwable;

.field private final d:Ljava/util/Date;


# direct methods
.method private constructor <init>(Lcom/bugfender/sdk/t$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/t;->a:Ljava/util/UUID;

    invoke-static {p1}, Lcom/bugfender/sdk/t$b;->a(Lcom/bugfender/sdk/t$b;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/t;->b:Ljava/lang/Thread;

    invoke-static {p1}, Lcom/bugfender/sdk/t$b;->b(Lcom/bugfender/sdk/t$b;)Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lcom/bugfender/sdk/t;->c:Ljava/lang/Throwable;

    invoke-static {p1}, Lcom/bugfender/sdk/t$b;->c(Lcom/bugfender/sdk/t$b;)Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lcom/bugfender/sdk/t;->d:Ljava/util/Date;

    return-void
.end method

.method synthetic constructor <init>(Lcom/bugfender/sdk/t$b;Lcom/bugfender/sdk/t$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bugfender/sdk/t;-><init>(Lcom/bugfender/sdk/t$b;)V

    return-void
.end method

.method public static a(Ljava/lang/Thread;Ljava/lang/Throwable;)Lcom/bugfender/sdk/t;
    .locals 1

    new-instance v0, Lcom/bugfender/sdk/t$b;

    invoke-direct {v0}, Lcom/bugfender/sdk/t$b;-><init>()V

    invoke-virtual {v0, p1}, Lcom/bugfender/sdk/t$b;->a(Ljava/lang/Throwable;)Lcom/bugfender/sdk/t$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/bugfender/sdk/t$b;->a(Ljava/lang/Thread;)Lcom/bugfender/sdk/t$b;

    move-result-object p0

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/t$b;->a(Ljava/util/Date;)Lcom/bugfender/sdk/t$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/bugfender/sdk/t$b;->a()Lcom/bugfender/sdk/t;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/t;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public b()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/t;->b:Ljava/lang/Thread;

    return-object v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/t;->c:Ljava/lang/Throwable;

    return-object v0
.end method

.method public d()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/bugfender/sdk/t;->d:Ljava/util/Date;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 4

    :try_start_0
    new-instance v0, Lcom/bugfender/sdk/t$c;

    iget-object v1, p0, Lcom/bugfender/sdk/t;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1}, Lcom/bugfender/sdk/t$c;-><init>(Ljava/lang/Throwable;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "id"

    iget-object v3, p0, Lcom/bugfender/sdk/t;->a:Ljava/util/UUID;

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "title"

    invoke-virtual {v0}, Lcom/bugfender/sdk/t$c;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "message"

    invoke-virtual {v0}, Lcom/bugfender/sdk/t$c;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "date"

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
