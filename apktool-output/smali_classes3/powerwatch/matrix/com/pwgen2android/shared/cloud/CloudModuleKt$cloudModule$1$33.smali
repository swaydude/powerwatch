.class final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$33;
.super Lkotlin/jvm/internal/Lambda;
.source "CloudModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1;->invoke(Lorg/koin/core/module/Module;)V
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
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCloudModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$33\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,139:1\n80#2,4:140\n80#2,4:144\n80#2,4:148\n80#2,4:152\n80#2,4:156\n80#2,4:160\n80#2,4:164\n*S KotlinDebug\n*F\n+ 1 CloudModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$33\n*L\n121#1:140,4\n122#1:144,4\n123#1:148,4\n124#1:152,4\n125#1:156,4\n126#1:160,4\n127#1:164,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;",
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
.field final synthetic $cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$33;->$cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 118
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$33;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;
    .locals 35

    move-object/from16 v0, p1

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;

    move-object v2, v1

    move-object/from16 v15, p0

    .line 120
    iget-object v3, v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$33;->$cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    const/4 v4, 0x0

    .line 140
    move-object v14, v4

    check-cast v14, Lorg/koin/core/qualifier/Qualifier;

    .line 141
    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 143
    const-class v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    invoke-virtual {v0, v4, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;

    const-class v5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-virtual {v0, v5, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;

    .line 147
    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    invoke-virtual {v0, v6, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-virtual {v0, v7, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;

    .line 151
    const-class v8, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v8

    invoke-virtual {v0, v8, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;

    const-class v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-static {v9}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v9

    invoke-virtual {v0, v9, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    .line 155
    const-class v10, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-static {v10}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v10

    invoke-virtual {v0, v10, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    const-class v11, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;

    invoke-static {v11}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    invoke-virtual {v0, v11, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;

    .line 159
    const-class v12, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;

    invoke-static {v12}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v12

    invoke-virtual {v0, v12, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;

    const-class v16, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v15

    invoke-virtual {v0, v15, v14, v13}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;

    move-object/from16 p2, v1

    move-object v1, v13

    move-object v13, v15

    .line 163
    const-class v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;

    invoke-static {v15}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v15

    invoke-virtual {v0, v15, v14, v1}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;

    move-object/from16 v33, v2

    move-object v2, v14

    move-object v14, v15

    const-class v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;

    invoke-static {v15}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v15

    invoke-virtual {v0, v15, v2, v1}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;

    .line 167
    const-class v16, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    move-object/from16 v34, v3

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    invoke-virtual {v0, v3, v2, v1}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;

    const-class v3, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    invoke-virtual {v0, v3, v2, v1}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const v31, 0xfff8000

    const/16 v32, 0x0

    move-object/from16 v2, v33

    move-object/from16 v3, v34

    .line 119
    invoke-direct/range {v2 .. v32}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/AuthService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeviceService;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GoalConfigurationService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/WalkingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/RestingLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/SleepLogService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/device/DeviceCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/WalkingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/RestingHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityPeriods/hour/SleepHourPeriodCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/goalConfiguration/GoalConfigurationCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/WalkingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/RestingLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/activityLogs/SleepLogCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userActivities/UserActivityCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method
