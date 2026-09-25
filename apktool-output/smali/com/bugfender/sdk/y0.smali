.class public Lcom/bugfender/sdk/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bugfender/sdk/y0$e;,
        Lcom/bugfender/sdk/y0$d;,
        Lcom/bugfender/sdk/y0$a;,
        Lcom/bugfender/sdk/y0$c;,
        Lcom/bugfender/sdk/y0$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Lcom/bugfender/sdk/e;)Lorg/json/JSONObject;
    .locals 2

    :try_start_0
    const-string v0, "application == null"

    invoke-static {p0, v0}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/bugfender/sdk/e;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "application.getKey()"

    invoke-static {v0, v1}, Lcom/bugfender/sdk/w1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/bugfender/sdk/e;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method
