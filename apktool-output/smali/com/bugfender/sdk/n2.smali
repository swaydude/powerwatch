.class public Lcom/bugfender/sdk/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bugfender/sdk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bugfender/sdk/a<",
        "Lcom/bugfender/sdk/k2;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/bugfender/sdk/e;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1}, Lcom/bugfender/sdk/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "key"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method private a(Lcom/bugfender/sdk/f;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1}, Lcom/bugfender/sdk/f;->a()Lcom/bugfender/sdk/e;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/bugfender/sdk/n2;->a(Lcom/bugfender/sdk/e;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "application"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/f;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "versionName"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/f;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "versionCode"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method private a(Lcom/bugfender/sdk/w;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->l()Ljava/lang/String;

    move-result-object v1

    const-string v2, "udid"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "deviceType"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "osVersion"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "build"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "language"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "timezone"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sdkType"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "applicationToken"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Lcom/bugfender/sdk/w;->h()Ljava/lang/String;

    move-result-object p1

    const-string v1, "sdkVersion"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/bugfender/sdk/k2;
    .locals 17

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    move-object/from16 v2, p1

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/bugfender/sdk/k2$a;

    invoke-direct {v2}, Lcom/bugfender/sdk/k2$a;-><init>()V

    const-string v3, "device"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v4, "sdkType"

    const-string v5, "timezone"

    const-string v6, "language"

    const-string v7, "osVersion"

    if-eqz v3, :cond_0

    :try_start_1
    const-string v8, "udid"

    invoke-virtual {v3, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "name"

    invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "deviceType"

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "version"

    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "build"

    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 p1, v6

    const-string v6, "applicationToken"

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v16, v7

    const-string v7, "sdkVersion"

    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lcom/bugfender/sdk/w$b;

    invoke-direct {v7}, Lcom/bugfender/sdk/w$b;-><init>()V

    invoke-virtual {v7, v8}, Lcom/bugfender/sdk/w$b;->j(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v9}, Lcom/bugfender/sdk/w$b;->e(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v10}, Lcom/bugfender/sdk/w$b;->c(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v11}, Lcom/bugfender/sdk/w$b;->f(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v12}, Lcom/bugfender/sdk/w$b;->k(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v13}, Lcom/bugfender/sdk/w$b;->b(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v14}, Lcom/bugfender/sdk/w$b;->d(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v15}, Lcom/bugfender/sdk/w$b;->i(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/bugfender/sdk/w$b;->g(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/bugfender/sdk/w$b;->a(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/bugfender/sdk/w$b;->h(Ljava/lang/String;)Lcom/bugfender/sdk/w$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bugfender/sdk/w$b;->a()Lcom/bugfender/sdk/w;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->a(Lcom/bugfender/sdk/w;)Lcom/bugfender/sdk/k2$a;

    goto :goto_0

    :cond_0
    move-object/from16 p1, v6

    move-object/from16 v16, v7

    :goto_0
    const-string v1, "applicationVersion"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v3, "versionName"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "versionCode"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "application"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v7, "key"

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance v7, Lcom/bugfender/sdk/e;

    invoke-direct {v7, v1}, Lcom/bugfender/sdk/e;-><init>(Ljava/lang/String;)V

    invoke-static {v7, v3, v6}, Lcom/bugfender/sdk/f;->b(Lcom/bugfender/sdk/e;Ljava/lang/String;Ljava/lang/String;)Lcom/bugfender/sdk/f;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->a(Lcom/bugfender/sdk/f;)Lcom/bugfender/sdk/k2$a;

    :cond_2
    const-string v1, "batteryLevel"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->isNaN()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->floatValue()F

    move-result v1

    :goto_2
    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->a(F)Lcom/bugfender/sdk/k2$a;

    const-string v1, "freeRam"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {v2, v6, v7}, Lcom/bugfender/sdk/k2$a;->a(J)Lcom/bugfender/sdk/k2$a;

    const-string v1, "time"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v1, :cond_4

    :try_start_2
    invoke-static {}, Lcom/bugfender/sdk/y1;->a()Lcom/bugfender/sdk/y1;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    :goto_3
    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->a(Ljava/util/Date;)Lcom/bugfender/sdk/k2$a;

    goto :goto_4

    :cond_4
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_0
    :try_start_3
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->a(Ljava/util/Date;)Lcom/bugfender/sdk/k2$a;

    :goto_4
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->e(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    const-string v1, "totalRam"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/bugfender/sdk/k2$a;->e(J)Lcom/bugfender/sdk/k2$a;

    const-string v1, "ramUsed"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/bugfender/sdk/k2$a;->c(J)Lcom/bugfender/sdk/k2$a;

    const-string v1, "orientation"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->a(I)Lcom/bugfender/sdk/k2$a;

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->c(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    const-string v1, "localSessionId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/bugfender/sdk/k2$a;->b(J)Lcom/bugfender/sdk/k2$a;

    const-string v1, "sessionId"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/bugfender/sdk/k2$a;->d(J)Lcom/bugfender/sdk/k2$a;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->b(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bugfender/sdk/k2$a;->a(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    const-string v1, "sessionIdentifier"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v2, v0}, Lcom/bugfender/sdk/k2$a;->d(Ljava/lang/String;)Lcom/bugfender/sdk/k2$a;

    :cond_5
    invoke-virtual {v2}, Lcom/bugfender/sdk/k2$a;->a()Lcom/bugfender/sdk/k2;

    move-result-object v0
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    return-object v1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/n2;->a(Ljava/lang/String;)Lcom/bugfender/sdk/k2;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/bugfender/sdk/k2;)Ljava/lang/String;
    .locals 4

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "device"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->c()Lcom/bugfender/sdk/w;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/bugfender/sdk/n2;->a(Lcom/bugfender/sdk/w;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "applicationVersion"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->a()Lcom/bugfender/sdk/f;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/bugfender/sdk/n2;->a(Lcom/bugfender/sdk/f;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "batteryLevel"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->b()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v1, "freeRam"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->d()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "time"

    invoke-static {}, Lcom/bugfender/sdk/y1;->a()Lcom/bugfender/sdk/y1;

    move-result-object v2

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->m()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "osVersion"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "language"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timezone"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "totalRam"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->o()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "ramUsed"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->i()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "orientation"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->g()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "sdkType"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "localSessionId"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->f()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "sessionId"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->k()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "sessionIdentifier"

    invoke-virtual {p1}, Lcom/bugfender/sdk/k2;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, Lcom/bugfender/sdk/d1;->a(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/bugfender/sdk/k2;

    invoke-virtual {p0, p1}, Lcom/bugfender/sdk/n2;->a(Lcom/bugfender/sdk/k2;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
