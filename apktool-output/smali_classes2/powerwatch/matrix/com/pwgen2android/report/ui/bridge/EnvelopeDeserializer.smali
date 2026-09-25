.class public final Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;
.super Ljava/lang/Object;
.source "EnvelopeDeserializer.kt"

# interfaces
.implements Lcom/google/gson/JsonDeserializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/gson/JsonDeserializer<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;",
        "Lcom/google/gson/JsonDeserializer;",
        "",
        "gson",
        "Lcom/google/gson/Gson;",
        "(Lcom/google/gson/Gson;)V",
        "map",
        "Ljava/util/HashMap;",
        "",
        "Ljava/lang/reflect/Type;",
        "deserialize",
        "json",
        "Lcom/google/gson/JsonElement;",
        "typeOfT",
        "context",
        "Lcom/google/gson/JsonDeserializationContext;",
        "fillUpBasicData",
        "Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;",
        "envelopeType",
        "payload",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final gson:Lcom/google/gson/Gson;

.field private final map:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;)V
    .locals 3

    const-string v0, "gson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;->gson:Lcom/google/gson/Gson;

    .line 18
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;->map:Ljava/util/HashMap;

    .line 21
    check-cast p1, Ljava/util/Map;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;->getType()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer$1;-><init>()V

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "object : TypeToken<WebLog>() {}.type"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final fillUpBasicData(Ljava/lang/String;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;
    .locals 1

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    invoke-direct {v0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonParseException;
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeOfT"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object p1

    .line 36
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object p2

    :goto_0
    const-string v0, "envelopeType"

    .line 38
    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_1

    move-object v0, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v1, "payload"

    .line 40
    invoke-virtual {p1, v1}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    .line 45
    :try_start_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "type"

    if-eqz v1, :cond_2

    .line 46
    :try_start_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeTypes$WebLogRequest;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 47
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;->map:Ljava/util/HashMap;

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/reflect/Type;

    .line 48
    iget-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p3, p1, p2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "gson.fromJson(payloadElement, turnsType)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;->fillUpBasicData(Ljava/lang/String;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p2, "java.lang"

    const-string v2, "Object"

    .line 55
    :cond_3
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    check-cast p2, Ljava/lang/reflect/Type;

    invoke-interface {p3, p1, p2}, Lcom/google/gson/JsonDeserializationContext;->deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "context.deserialize(payloadElement, Class.forName(\"$packageName.$className\"))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;->fillUpBasicData(Ljava/lang/String;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 57
    new-instance p2, Lcom/google/gson/JsonParseException;

    const-string p3, "Unknown payloadElement type: "

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {p2, p3, p1}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
