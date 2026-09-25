.class final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1;
.super Lkotlin/jvm/internal/Lambda;
.source "HttpModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt;->httpModule(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)Lorg/koin/core/module/Module;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lorg/koin/core/module/Module;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttpModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 DefinitionFactory.kt\norg/koin/core/definition/DefinitionFactory\n*L\n1#1,61:1\n92#2,5:62\n97#2,2:83\n61#2,6:85\n67#2,2:99\n61#2,6:101\n67#2,2:115\n25#3,16:67\n9#3,4:91\n37#3,4:95\n9#3,4:107\n37#3,4:111\n*S KotlinDebug\n*F\n+ 1 HttpModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1\n*L\n29#1:62,5\n29#1:83,2\n31#1:85,6\n31#1:99,2\n33#1:101,6\n33#1:115,2\n29#1:67,16\n31#1:91,4\n31#1:95,4\n33#1:107,4\n33#1:111,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lorg/koin/core/module/Module;"
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1;->$httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 28
    check-cast p1, Lorg/koin/core/module/Module;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1;->invoke(Lorg/koin/core/module/Module;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/module/Module;)V
    .locals 6

    const-string v0, "$this$module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    .line 62
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 66
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 70
    sget-object v3, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 79
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lcom/google/gson/Gson;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 80
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 81
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 83
    new-instance v0, Lorg/koin/core/definition/Options;

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-direct {v0, v3, v3, v5, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 31
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$2;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1;->$httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 90
    sget-object v1, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 94
    sget-object v1, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 95
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 96
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 97
    invoke-virtual {v4, v1}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 99
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 33
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1;->$httpConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt$httpModule$1$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 106
    sget-object v1, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 110
    sget-object v1, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 111
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HTTP;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 112
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 113
    invoke-virtual {v4, v1}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 115
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    return-void
.end method
