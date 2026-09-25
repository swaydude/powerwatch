.class final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1;
.super Lkotlin/jvm/internal/Lambda;
.source "DBModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt;->dbModule(Landroid/content/Context;)Lorg/koin/core/module/Module;
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
    value = "SMAP\nDBModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBModule.kt\npowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1\n+ 2 Module.kt\norg/koin/core/module/Module\n+ 3 DefinitionFactory.kt\norg/koin/core/definition/DefinitionFactory\n*L\n1#1,125:1\n61#2,6:126\n67#2,2:140\n61#2,6:142\n67#2,2:156\n61#2,6:158\n67#2,2:172\n92#2,5:174\n97#2,2:195\n92#2,5:197\n97#2,2:218\n92#2,5:220\n97#2,2:241\n92#2,5:243\n97#2,2:264\n92#2,5:266\n97#2,2:287\n92#2,5:289\n97#2,2:310\n92#2,5:312\n97#2,2:333\n92#2,5:335\n97#2,2:356\n92#2,5:358\n97#2,2:379\n92#2,5:381\n97#2,2:402\n92#2,5:404\n97#2,2:425\n92#2,5:427\n97#2,2:448\n9#3,4:132\n37#3,4:136\n9#3,4:148\n37#3,4:152\n9#3,4:164\n37#3,4:168\n25#3,16:179\n25#3,16:202\n25#3,16:225\n25#3,16:248\n25#3,16:271\n25#3,16:294\n25#3,16:317\n25#3,16:340\n25#3,16:363\n25#3,16:386\n25#3,16:409\n25#3,16:432\n*S KotlinDebug\n*F\n+ 1 DBModule.kt\npowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1\n*L\n43#1:126,6\n43#1:140,2\n46#1:142,6\n46#1:156,2\n108#1:158,6\n108#1:172,2\n109#1:174,5\n109#1:195,2\n110#1:197,5\n110#1:218,2\n112#1:220,5\n112#1:241,2\n113#1:243,5\n113#1:264,2\n114#1:266,5\n114#1:287,2\n116#1:289,5\n116#1:310,2\n117#1:312,5\n117#1:333,2\n118#1:335,5\n118#1:356,2\n119#1:358,5\n119#1:379,2\n120#1:381,5\n120#1:402,2\n121#1:404,5\n121#1:425,2\n122#1:427,5\n122#1:448,2\n43#1:132,4\n43#1:136,4\n46#1:148,4\n46#1:152,4\n108#1:164,4\n108#1:168,4\n109#1:179,16\n110#1:202,16\n112#1:225,16\n113#1:248,16\n114#1:271,16\n116#1:294,16\n117#1:317,16\n118#1:340,16\n119#1:363,16\n120#1:386,16\n121#1:409,16\n122#1:432,16\n*E\n"
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1;->$appContext:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 41
    check-cast p1, Lorg/koin/core/module/Module;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1;->invoke(Lorg/koin/core/module/Module;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/module/Module;)V
    .locals 8

    const-string v0, "$this$module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$1;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x0

    .line 126
    move-object v2, v1

    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 131
    sget-object v3, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 135
    sget-object v3, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 136
    new-instance v4, Lorg/koin/core/definition/BeanDefinition;

    const-class v5, Lkotlin/Unit;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-direct {v4, v2, v2, v5}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 137
    invoke-virtual {v4, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 138
    invoke-virtual {v4, v3}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 140
    new-instance v0, Lorg/koin/core/definition/Options;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v4, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 46
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1;->$appContext:Landroid/content/Context;

    invoke-direct {v0, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2;-><init>(Landroid/content/Context;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 147
    sget-object v4, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 151
    sget-object v4, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 152
    new-instance v5, Lorg/koin/core/definition/BeanDefinition;

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    invoke-direct {v5, v2, v2, v6}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 153
    invoke-virtual {v5, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 154
    invoke-virtual {v5, v4}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 156
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v5, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 108
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 163
    sget-object v4, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 167
    sget-object v4, Lorg/koin/core/definition/Kind;->Single:Lorg/koin/core/definition/Kind;

    .line 168
    new-instance v5, Lorg/koin/core/definition/BeanDefinition;

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    invoke-direct {v5, v2, v2, v6}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 169
    invoke-virtual {v5, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 170
    invoke-virtual {v5, v4}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 172
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3}, Lorg/koin/core/definition/Options;-><init>(ZZ)V

    invoke-virtual {p1, v5, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 109
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$4;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 178
    sget-object v4, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 182
    sget-object v4, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 191
    new-instance v5, Lorg/koin/core/definition/BeanDefinition;

    const-class v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UserDao;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v6

    invoke-direct {v5, v2, v2, v6}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 192
    invoke-virtual {v5, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 193
    invoke-virtual {v5, v4}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 195
    new-instance v0, Lorg/koin/core/definition/Options;

    const/4 v4, 0x1

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v5, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 110
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$5;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$5;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 201
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 205
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 214
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DeviceDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 215
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 216
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 218
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 112
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$6;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$6;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 224
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 228
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 237
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/WalkingHourPeriodDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 238
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 239
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 241
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 113
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$7;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$7;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 247
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 251
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 260
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/RestingHourPeriodDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 261
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 262
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 264
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 114
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$8;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 270
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 274
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 283
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityPeriods/SleepHourPeriodDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 284
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 285
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 287
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 116
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$9;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$9;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 293
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 297
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 306
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/GoalConfigurationDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 307
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 308
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 310
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 117
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$10;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$10;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 316
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 320
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 329
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/WalkingLogDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 330
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 331
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 333
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 118
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$11;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$11;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 339
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 343
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 352
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/RestingLogDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 353
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 354
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 356
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 119
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$12;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$12;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 362
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 366
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 375
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activityLogs/SleepLogDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 376
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 377
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 379
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 120
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$13;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$13;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 385
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 389
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 398
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/activitySessions/UserActivitySessionDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 399
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 400
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 402
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 121
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$14;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$14;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 408
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 412
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 421
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 422
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 423
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 425
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    .line 122
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$15;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$15;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 431
    sget-object v5, Lorg/koin/core/definition/DefinitionFactory;->INSTANCE:Lorg/koin/core/definition/DefinitionFactory;

    .line 435
    sget-object v5, Lorg/koin/core/definition/Kind;->Factory:Lorg/koin/core/definition/Kind;

    .line 444
    new-instance v6, Lorg/koin/core/definition/BeanDefinition;

    const-class v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao;

    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v7

    invoke-direct {v6, v2, v2, v7}, Lorg/koin/core/definition/BeanDefinition;-><init>(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;)V

    .line 445
    invoke-virtual {v6, v0}, Lorg/koin/core/definition/BeanDefinition;->setDefinition(Lkotlin/jvm/functions/Function2;)V

    .line 446
    invoke-virtual {v6, v5}, Lorg/koin/core/definition/BeanDefinition;->setKind(Lorg/koin/core/definition/Kind;)V

    .line 448
    new-instance v0, Lorg/koin/core/definition/Options;

    invoke-direct {v0, v3, v3, v4, v1}, Lorg/koin/core/definition/Options;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v6, v0}, Lorg/koin/core/module/Module;->declareDefinition(Lorg/koin/core/definition/BeanDefinition;Lorg/koin/core/definition/Options;)V

    return-void
.end method
