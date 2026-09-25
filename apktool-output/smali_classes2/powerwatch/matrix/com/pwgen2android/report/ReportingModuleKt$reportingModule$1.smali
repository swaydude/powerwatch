.class final Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ReportingModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt;->reportingModule()Lorg/koin/core/module/Module;
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
    value = "SMAP\nReportingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportingModule.kt\npowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 DefinitionFactory.kt\norg/koin/core/definition/DefinitionFactory\n*L\n1#1,22:1\n61#2,6:23\n67#2,2:37\n61#2,6:39\n67#2,2:53\n61#2,6:55\n67#2,2:69\n61#2,6:71\n67#2,2:85\n61#2,6:87\n67#2,2:101\n61#2,6:103\n67#2,2:117\n61#2,6:119\n67#2,2:133\n9#3,4:29\n37#3,4:33\n9#3,4:45\n37#3,4:49\n9#3,4:61\n37#3,4:65\n9#3,4:77\n37#3,4:81\n9#3,4:93\n37#3,4:97\n9#3,4:109\n37#3,4:113\n9#3,4:125\n37#3,4:129\n*S KotlinDebug\n*F\n+ 1 ReportingModule.kt\npowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1\n*L\n13#1:23,6\n13#1:37,2\n14#1:39,6\n14#1:53,2\n15#1:55,6\n15#1:69,2\n16#1:71,6\n16#1:85,2\n17#1:87,6\n17#1:101,2\n19#1:103,6\n19#1:117,2\n20#1:119,6\n20#1:133,2\n13#1:29,4\n13#1:33,4\n14#1:45,4\n14#1:49,4\n15#1:61,4\n15#1:65,4\n16#1:77,4\n16#1:81,4\n17#1:93,4\n17#1:97,4\n19#1:109,4\n19#1:113,4\n20#1:125,4\n20#1:129,4\n*E\n"
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


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    check-cast p1, Lorg/koin/core/module/Module;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;->invoke(Lorg/koin/core/module/Module;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/module/Module;)V
    .locals 6

    const-string v0, "$this$module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    .line 23
    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 28
    sget-object v2, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 32
    sget-object v2, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 33
    new-instance v3, Lorg/koin/core/definition/BeanDefinition;

    const-class v4, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebView;

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-direct {v3, v1, v1, v4}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 34
    invoke-virtual {v3, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 35
    invoke-virtual {v3, v2}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 37
    new-instance v0, Lorg/koin/core/definition/Options;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v3, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 14
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$2;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$2;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 44
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 48
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 49
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppWebViewClient;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 50
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 51
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 53
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 15
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$3;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$3;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 60
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 64
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 65
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/AppBridge;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 66
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 67
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 69
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 16
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$4;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 76
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 80
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 81
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/EnvelopeDeserializer;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 82
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 83
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 85
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 17
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$5;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$5;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 92
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 96
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 97
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 98
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 99
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 101
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 19
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$6;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$6;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 108
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 112
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 113
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerWebBridgeLoggerExtension;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 114
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 115
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 117
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 20
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$7;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1$7;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 124
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 128
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 129
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lcom/google/gson/Gson;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 130
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 131
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 133
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    return-void
.end method
