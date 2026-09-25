.class public Lcom/bugfender/sdk/y0$a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bugfender/sdk/y0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/bugfender/sdk/b0;
    .locals 4

    :try_start_0
    new-instance v0, Lcom/bugfender/sdk/b0;

    invoke-direct {v0}, Lcom/bugfender/sdk/b0;-><init>()V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "logger_enabled"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-virtual {v0, p0}, Lcom/bugfender/sdk/b0;->b(Z)V

    const-string p0, "crashes_enabled"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-virtual {v0, p0}, Lcom/bugfender/sdk/b0;->a(Z)V

    const-string p0, "latest_sdk_version"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v2, "android"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "ios"

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    new-instance v3, Lcom/bugfender/sdk/b0$b;

    invoke-direct {v3, v2, p0}, Lcom/bugfender/sdk/b0$b;-><init>(II)V

    invoke-virtual {v0, v3}, Lcom/bugfender/sdk/b0;->a(Lcom/bugfender/sdk/b0$b;)V

    :cond_0
    const-string p0, "error"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v1, "message"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    new-instance v2, Lcom/bugfender/sdk/b0$a;

    invoke-direct {v2, v1, p0}, Lcom/bugfender/sdk/b0$a;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v2}, Lcom/bugfender/sdk/b0;->a(Lcom/bugfender/sdk/b0$a;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object v0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method
