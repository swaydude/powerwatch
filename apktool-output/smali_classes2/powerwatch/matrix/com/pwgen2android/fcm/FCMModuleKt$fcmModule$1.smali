.class final Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;
.super Lkotlin/jvm/internal/Lambda;
.source "FCMModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt;->fcmModule(Landroid/content/Context;)Lorg/koin/core/module/Module;
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
    value = "SMAP\nFCMModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FCMModule.kt\npowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 DefinitionFactory.kt\norg/koin/core/definition/DefinitionFactory\n*L\n1#1,13:1\n61#2,6:14\n67#2,2:28\n61#2,6:30\n67#2,2:44\n61#2,6:46\n67#2,2:60\n9#3,4:20\n37#3,4:24\n9#3,4:36\n37#3,4:40\n9#3,4:52\n37#3,4:56\n*S KotlinDebug\n*F\n+ 1 FCMModule.kt\npowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1\n*L\n8#1:14,6\n8#1:28,2\n9#1:30,6\n9#1:44,2\n11#1:46,6\n11#1:60,2\n8#1:20,4\n8#1:24,4\n9#1:36,4\n9#1:40,4\n11#1:52,4\n11#1:56,4\n*E\n"
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
.field final synthetic $appContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;->$appContext:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 6
    check-cast p1, Lorg/koin/core/module/Module;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;->invoke(Lorg/koin/core/module/Module;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/module/Module;)V
    .locals 6

    const-string v0, "$this$module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1$1;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;->$appContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1$1;-><init>(Landroid/content/Context;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    .line 14
    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 19
    sget-object v2, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 23
    sget-object v2, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 24
    new-instance v3, Lorg/koin/core/definition/BeanDefinition;

    const-class v4, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-direct {v3, v1, v1, v4}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 25
    invoke-virtual {v3, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 26
    invoke-virtual {v3, v2}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 28
    new-instance v0, Lorg/koin/core/definition/Options;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v3, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 9
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1$2;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;->$appContext:Landroid/content/Context;

    invoke-direct {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1$2;-><init>(Landroid/content/Context;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 35
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 39
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 40
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 41
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 42
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 44
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 11
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1$3;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;->$appContext:Landroid/content/Context;

    invoke-direct {v0, v3}, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1$3;-><init>(Landroid/content/Context;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 51
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 55
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 56
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v1, v1, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 57
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 58
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 60
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v2, v2}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    return-void
.end method
