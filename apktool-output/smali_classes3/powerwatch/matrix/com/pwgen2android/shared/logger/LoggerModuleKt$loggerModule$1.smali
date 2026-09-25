.class final Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;
.super Lkotlin/jvm/internal/Lambda;
.source "LoggerModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt;->loggerModule(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)Lorg/koin/core/module/Module;
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
    value = "SMAP\nLoggerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggerModule.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 DefinitionFactory.kt\norg/koin/core/definition/DefinitionFactory\n*L\n1#1,34:1\n92#2,5:35\n97#2,2:56\n92#2,5:58\n97#2,2:79\n61#2,6:81\n67#2,2:95\n61#2,6:97\n67#2,2:111\n61#2,6:113\n67#2,2:127\n61#2,6:129\n67#2,2:143\n25#3,16:40\n25#3,16:63\n9#3,4:87\n37#3,4:91\n9#3,4:103\n37#3,4:107\n9#3,4:119\n37#3,4:123\n9#3,4:135\n37#3,4:139\n*S KotlinDebug\n*F\n+ 1 LoggerModule.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1\n*L\n23#1:35,5\n23#1:56,2\n24#1:58,5\n24#1:79,2\n26#1:81,6\n26#1:95,2\n28#1:97,6\n28#1:111,2\n30#1:113,6\n30#1:127,2\n32#1:129,6\n32#1:143,2\n23#1:40,16\n24#1:63,16\n26#1:87,4\n26#1:91,4\n28#1:103,4\n28#1:107,4\n30#1:119,4\n30#1:123,4\n32#1:135,4\n32#1:139,4\n*E\n"
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
.field final synthetic $loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;->$loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Lorg/koin/core/module/Module;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;->invoke(Lorg/koin/core/module/Module;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/module/Module;)V
    .locals 8

    const-string v0, "$this$module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    .line 35
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 39
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 43
    sget-object v3, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 52
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 53
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 54
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 56
    new-instance v0, Lorg/koin/core/definition/Options;

    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-direct {v0, v3, v3, v5, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 24
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$2;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$2;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 62
    sget-object v4, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 66
    sget-object v4, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 75
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 76
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 77
    invoke-virtual {v6, v4}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 79
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v5, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$3;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;->$loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 86
    sget-object v1, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 90
    sget-object v1, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 91
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogger;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 92
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 93
    invoke-virtual {v4, v1}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 95
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$4;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;->$loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 102
    sget-object v1, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 106
    sget-object v1, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 107
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtension;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 108
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 109
    invoke-virtual {v4, v1}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 111
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;->$loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 118
    sget-object v1, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 122
    sget-object v1, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 123
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 124
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 125
    invoke-virtual {v4, v1}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 127
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$6;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;->$loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$6;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 134
    sget-object v1, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 138
    sget-object v1, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 139
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 140
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 141
    invoke-virtual {v4, v1}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 143
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    return-void
.end method
