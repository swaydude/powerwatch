.class final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "HttpModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1;->invoke(Lorg/koin/core/module/Module;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lorg/koin/core/scope/Scope;",
        "Lorg/koin/core/parameter/DefinitionParameters;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttpModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,61:1\n80#2,4:62\n*S KotlinDebug\n*F\n+ 1 HttpModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3\n*L\n34#1:62,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;",
        "Lorg/koin/core/scope/Scope;",
        "it",
        "Lorg/koin/core/parameter/DefinitionParameters;"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;->$httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 33
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;

    const/4 v0, 0x0

    .line 62
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 63
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 65
    const-class v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {p1, v2, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    .line 34
    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;)V

    .line 35
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;->BODY:Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;

    invoke-virtual {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;->setLevel(Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger$Level;)Lpowerwatch/matrix/com/pwgen2android/CloudInterceptLogger;

    .line 37
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/AppInfoInterceptor;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/AppInfoInterceptor;-><init>()V

    .line 38
    new-instance p2, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {p2}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;->$httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;->getConnectionTimeout()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p2

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;->$httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;->getReadTimeout()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p2

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;->$httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;->getWriteTimeout()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, v2}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p2

    .line 44
    check-cast p1, Lokhttp3/Interceptor;

    invoke-virtual {p2, p1}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 46
    new-instance p2, Lretrofit2/Retrofit$Builder;

    invoke-direct {p2}, Lretrofit2/Retrofit$Builder;-><init>()V

    const-string v0, "http://www.dummy.com"

    .line 49
    invoke-virtual {p2, v0}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object p2

    .line 51
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    .line 50
    invoke-virtual {p2, p1}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object p1

    .line 52
    invoke-static {}, Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;->create()Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;

    move-result-object p2

    check-cast p2, Lretrofit2/CallAdapter$Factory;

    invoke-virtual {p1, p2}, Lretrofit2/Retrofit$Builder;->addCallAdapterFactory(Lretrofit2/CallAdapter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object p1

    .line 53
    invoke-static {}, Lretrofit2/converter/scalars/ScalarsConverterFactory;->create()Lretrofit2/converter/scalars/ScalarsConverterFactory;

    move-result-object p2

    check-cast p2, Lretrofit2/Converter$Factory;

    invoke-virtual {p1, p2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object p1

    const-class p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    .line 57
    invoke-virtual {p1, p2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "builder\n                .build()\n                .create(HTTP::class.java)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    return-object p1
.end method
