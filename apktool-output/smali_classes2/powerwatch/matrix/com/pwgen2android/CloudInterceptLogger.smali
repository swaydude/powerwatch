.class public final Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;
.super Ljava/lang/Object;
.source "CloudInterceptLogger.java"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;,
        Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;
    }
.end annotation


# static fields
.field public static final CloudTag:Ljava/lang/String; = "AC_Cloud"

.field private static final UTF8:Ljava/nio/charset/Charset;


# instance fields
.field private appLogger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

.field private volatile level:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

.field private final logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    .line 33
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->UTF8:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "logger",
            "appLogger"
        }
    .end annotation

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->NONE:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->level:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    .line 107
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    .line 108
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->appLogger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "appLogger"
        }
    .end annotation

    .line 103
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->DEFAULT:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-direct {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;-><init>(Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V

    return-void
.end method

.method private bodyEncoded(Lokhttp3/Headers;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "headers"
        }
    .end annotation

    const-string v0, "Content-Encoding"

    .line 340
    invoke-virtual {p1, v0}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "identity"

    .line 341
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private forbiddenURLs(Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "url"
        }
    .end annotation

    const-string v0, "sleep"

    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "walk"

    .line 130
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "goal"

    .line 131
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "rest"

    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method static isPlaintext(Lokio/Buffer;)Z
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "buffer"
        }
    .end annotation

    const/4 v0, 0x0

    .line 321
    :try_start_0
    new-instance v7, Lokio/Buffer;

    invoke-direct {v7}, Lokio/Buffer;-><init>()V

    .line 322
    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x40

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    invoke-virtual {p0}, Lokio/Buffer;->size()J

    move-result-wide v1

    move-wide v5, v1

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    const-wide/16 v3, 0x0

    move-object v1, p0

    move-object v2, v7

    .line 323
    invoke-virtual/range {v1 .. v6}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    const/4 p0, 0x0

    :goto_1
    const/16 v1, 0x10

    if-ge p0, v1, :cond_3

    .line 325
    invoke-virtual {v7}, Lokio/Buffer;->exhausted()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 328
    :cond_1
    invoke-virtual {v7}, Lokio/Buffer;->readUtf8CodePoint()I

    move-result v1

    .line 329
    invoke-static {v1}, Ljava/lang/Character;->isISOControl(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_2

    return v0

    :cond_2
    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    const/4 p0, 0x1

    return p0

    :catch_0
    return v0
.end method


# virtual methods
.method public getLevel()Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;
    .locals 1

    .line 125
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->level:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    return-object v0
.end method

.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 23
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "chain"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 136
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->level:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    .line 138
    invoke-interface/range {p1 .. p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v3

    .line 139
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->NONE:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    if-ne v2, v4, :cond_0

    .line 140
    invoke-interface {v0, v3}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v0

    return-object v0

    .line 143
    :cond_0
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->BODY:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    const/4 v5, 0x1

    if-ne v2, v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_3

    .line 144
    sget-object v7, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->HEADERS:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    if-ne v2, v7, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v2, 0x1

    .line 146
    :goto_2
    invoke-virtual {v3}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    .line 149
    :goto_3
    invoke-interface/range {p1 .. p1}, Lokhttp3/Interceptor$Chain;->connection()Lokhttp3/Connection;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 150
    invoke-interface {v8}, Lokhttp3/Connection;->protocol()Lokhttp3/Protocol;

    move-result-object v8

    goto :goto_4

    :cond_5
    sget-object v8, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 151
    :goto_4
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "--> "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v11, 0x20

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 154
    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v12

    invoke-virtual {v12}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v13, "auth"

    invoke-virtual {v12, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    const-string v14, ""

    const-string v15, "\n"

    if-eqz v12, :cond_6

    .line 155
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " auth \n"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    .line 157
    :cond_6
    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v12

    invoke-virtual {v12}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v1, v12}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->forbiddenURLs(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_7

    .line 158
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_7
    move-object v8, v14

    :goto_5
    const-string v10, "-byte body)"

    const-string v12, " ("

    if-nez v2, :cond_8

    if-eqz v5, :cond_8

    .line 161
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v16, v12

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v11

    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_6

    :cond_8
    move-object/from16 v16, v12

    .line 163
    :goto_6
    iget-object v6, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v6, v9}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    const-string v6, "-byte body omitted)"

    const-string v9, ": "

    const-string v11, "AC_Cloud"

    if-eqz v2, :cond_16

    if-eqz v5, :cond_b

    .line 169
    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object v12

    if-eqz v12, :cond_9

    .line 170
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    move-object/from16 v19, v13

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v20, v2

    const-string v2, "Content-Type: "

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v12, v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    goto :goto_7

    :cond_9
    move/from16 v20, v2

    move-object/from16 v19, v13

    .line 172
    :goto_7
    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v12

    const-wide/16 v17, -0x1

    cmp-long v2, v12, v17

    if-eqz v2, :cond_a

    .line 173
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Content-Length: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v13, v10

    move-object/from16 v21, v11

    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v10

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    goto :goto_8

    :cond_a
    move-object v13, v10

    move-object/from16 v21, v11

    goto :goto_8

    :cond_b
    move/from16 v20, v2

    move-object/from16 v21, v11

    move-object/from16 v19, v13

    move-object v13, v10

    .line 177
    :goto_8
    invoke-virtual {v3}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v2

    .line 178
    invoke-virtual {v2}, Lokhttp3/Headers;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v10, :cond_d

    .line 179
    invoke-virtual {v2, v11}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v12

    move/from16 v22, v10

    const-string v10, "Content-Type"

    .line 181
    invoke-virtual {v10, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_c

    const-string v10, "Content-Length"

    invoke-virtual {v10, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_c

    .line 182
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v10, v0}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    :cond_c
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p1

    move/from16 v10, v22

    goto :goto_9

    :cond_d
    const-string v0, "--> END "

    if-eqz v4, :cond_13

    if-nez v5, :cond_e

    goto/16 :goto_a

    .line 194
    :cond_e
    invoke-virtual {v3}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->bodyEncoded(Lokhttp3/Headers;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 195
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (encoded body omitted)"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    move-object/from16 v5, v16

    goto/16 :goto_b

    .line 197
    :cond_f
    new-instance v2, Lokio/Buffer;

    invoke-direct {v2}, Lokio/Buffer;-><init>()V

    .line 198
    invoke-virtual {v7, v2}, Lokhttp3/RequestBody;->writeTo(Lokio/BufferedSink;)V

    .line 200
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->UTF8:Ljava/nio/charset/Charset;

    .line 201
    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object v10

    if-eqz v10, :cond_10

    .line 203
    invoke-virtual {v10, v5}, Lokhttp3/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v5

    .line 206
    :cond_10
    iget-object v10, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v10, v14}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 207
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->isPlaintext(Lokio/Buffer;)Z

    move-result v10

    if-eqz v10, :cond_12

    .line 208
    invoke-virtual {v2, v5}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    .line 209
    iget-object v5, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v5, v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 215
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v16

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v10

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 217
    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->forbiddenURLs(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_11

    .line 218
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v8, v2

    .line 220
    :cond_11
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_12
    move-object/from16 v5, v16

    .line 222
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (binary "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    invoke-virtual {v7}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v10

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 224
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_b

    :cond_13
    :goto_a
    move-object/from16 v5, v16

    .line 187
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v7}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 188
    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->forbiddenURLs(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_14

    .line 189
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 230
    :cond_14
    :goto_b
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    .line 231
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->appLogger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-object/from16 v2, v21

    invoke-interface {v0, v8, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_c

    :cond_15
    move-object/from16 v2, v21

    goto :goto_c

    :cond_16
    move/from16 v20, v2

    move-object v2, v11

    move-object/from16 v19, v13

    move-object/from16 v5, v16

    move-object v13, v10

    .line 234
    :goto_c
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    move-object/from16 v0, p1

    .line 237
    :try_start_0
    invoke-interface {v0, v3}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    sub-long/2addr v10, v7

    invoke-virtual {v3, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    .line 245
    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v3

    .line 246
    invoke-virtual {v3}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v10

    const-wide/16 v16, -0x1

    cmp-long v12, v10, v16

    if-eqz v12, :cond_17

    .line 247
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v21, v2

    const-string v2, "-byte"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_d

    :cond_17
    move-object/from16 v21, v2

    const-string v2, "unknown-length"

    .line 248
    :goto_d
    iget-object v12, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    move-object/from16 v16, v13

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v17, v10

    const-string v10, "<-- "

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    move-result v11

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v11, 0x20

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object/from16 v22, v6

    invoke-virtual {v0}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 249
    invoke-virtual {v0}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v6

    invoke-virtual {v6}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v6

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, "ms"

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v20, :cond_18

    .line 250
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ", "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " body"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_18
    move-object v2, v14

    :goto_e
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 248
    invoke-interface {v12, v2}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 253
    invoke-virtual {v0}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v5, v19

    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual {v0}, Lokhttp3/Response;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_19

    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_f

    :cond_19
    move-object v2, v14

    .line 257
    :goto_f
    invoke-virtual {v0}, Lokhttp3/Response;->isSuccessful()Z

    move-result v5

    if-nez v5, :cond_1a

    .line 258
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    move-result v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v5

    invoke-virtual {v5}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1a
    if-eqz v20, :cond_24

    .line 262
    invoke-virtual {v0}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v5

    .line 263
    invoke-virtual {v5}, Lokhttp3/Headers;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_10
    if-ge v7, v6, :cond_1b

    .line 264
    iget-object v8, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v7}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v10}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_1b
    if-eqz v4, :cond_21

    .line 267
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->hasBody(Lokhttp3/Response;)Z

    move-result v4

    if-nez v4, :cond_1c

    goto/16 :goto_11

    .line 269
    :cond_1c
    invoke-virtual {v0}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v4

    invoke-direct {v1, v4}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->bodyEncoded(Lokhttp3/Headers;)Z

    move-result v4

    if-eqz v4, :cond_1d

    .line 270
    iget-object v3, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    const-string v4, "<-- END HTTP (encoded body omitted)"

    invoke-interface {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    goto/16 :goto_12

    .line 272
    :cond_1d
    invoke-virtual {v3}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v4

    const-wide v5, 0x7fffffffffffffffL

    .line 273
    invoke-interface {v4, v5, v6}, Lokio/BufferedSource;->request(J)Z

    .line 274
    invoke-interface {v4}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v4

    .line 276
    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->UTF8:Ljava/nio/charset/Charset;

    .line 277
    invoke-virtual {v3}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v3

    if-eqz v3, :cond_1e

    .line 279
    invoke-virtual {v3, v5}, Lokhttp3/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v5

    .line 282
    :cond_1e
    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->isPlaintext(Lokio/Buffer;)Z

    move-result v3

    if-nez v3, :cond_1f

    .line 283
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v2, v14}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 284
    iget-object v2, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "<-- END HTTP (binary "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lokio/Buffer;->size()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v4, v22

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    return-object v0

    :cond_1f
    const-wide/16 v6, 0x0

    cmp-long v3, v17, v6

    if-eqz v3, :cond_20

    .line 289
    iget-object v3, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v3, v14}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 290
    invoke-virtual {v4}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object v3

    invoke-virtual {v3, v5}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    .line 292
    iget-object v5, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    invoke-interface {v5, v3}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 296
    invoke-virtual {v0}, Lokhttp3/Response;->isSuccessful()Z

    move-result v5

    if-nez v5, :cond_20

    .line 297
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 301
    :cond_20
    iget-object v3, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "<-- END HTTP ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lokio/Buffer;->size()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v4, v16

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    goto :goto_12

    .line 268
    :cond_21
    :goto_11
    iget-object v3, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    const-string v4, "<-- END HTTP"

    invoke-interface {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 303
    :goto_12
    invoke-virtual {v0}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v3

    invoke-virtual {v3}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v3

    invoke-virtual {v3}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->forbiddenURLs(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual {v0}, Lokhttp3/Response;->isSuccessful()Z

    move-result v3

    if-nez v3, :cond_23

    .line 304
    :cond_22
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "<-- END HTTP\n"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 307
    :cond_23
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_24

    .line 308
    iget-object v3, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->appLogger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-object/from16 v4, v21

    invoke-interface {v3, v2, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->debug(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_24
    return-object v0

    :catch_0
    move-exception v0

    move-object v4, v2

    move-object v2, v0

    .line 239
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->logger:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "<-- HTTP FAILED: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Logger;->log(Ljava/lang/String;)V

    .line 240
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->appLogger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v4, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;->error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 241
    throw v2
.end method

.method public setLevel(Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;)Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "level"
        }
    .end annotation

    const-string v0, "level == null. Use Level.NONE instead."

    .line 119
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 120
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->level:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    return-object p0
.end method
