.class final Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22;
.super Lkotlin/jvm/internal/Lambda;
.source "AppModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1;->invoke(Lorg/koin/core/module/Module;)V
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
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppModule.kt\npowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,627:1\n80#2,4:628\n*S KotlinDebug\n*F\n+ 1 AppModule.kt\npowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22\n*L\n220#1:628,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;",
        "Lorg/koin/core/scope/Scope;",
        "<name for destructuring parameter 0>",
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


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 220
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1$22;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dstr$fragmentManager$activityContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    invoke-virtual {p2}, Lorg/koin/core/parameter/DefinitionParameters;->component1()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p2}, Lorg/koin/core/parameter/DefinitionParameters;->component2()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Landroid/content/Context;

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;

    const/4 v0, 0x0

    .line 628
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 629
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 631
    const-class v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-virtual {p1, v4, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {p1, v5, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    invoke-virtual {p1, v6, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-virtual {p1, v7, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;

    move-object v1, p2

    .line 220
    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/main/notification/ui/NotificationSettingsVM;-><init>(Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/ConnectionNotificationPersistence;)V

    return-object p2
.end method
