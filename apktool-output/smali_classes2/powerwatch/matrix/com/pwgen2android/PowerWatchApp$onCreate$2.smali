.class final Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;
.super Lkotlin/jvm/internal/Lambda;
.source "PowerWatchApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lorg/koin/core/KoinApplication;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lorg/koin/core/KoinApplication;"
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
.field final synthetic $cloudEnv:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

.field final synthetic $prodEnabled:Z

.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;ZLpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;

    iput-boolean p2, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->$prodEnabled:Z

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->$cloudEnv:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 68
    check-cast p1, Lorg/koin/core/KoinApplication;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->invoke(Lorg/koin/core/KoinApplication;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/KoinApplication;)V
    .locals 4

    const-string v0, "$this$startKoin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    new-instance v0, Lorg/koin/core/logger/EmptyLogger;

    invoke-direct {v0}, Lorg/koin/core/logger/EmptyLogger;-><init>()V

    check-cast v0, Lorg/koin/core/logger/Logger;

    invoke-virtual {p1, v0}, Lorg/koin/core/KoinApplication;->logger(Lorg/koin/core/logger/Logger;)Lorg/koin/core/KoinApplication;

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;

    check-cast v0, Landroid/content/Context;

    invoke-static {p1, v0}, Lorg/koin/android/ext/koin/KoinExtKt;->androidContext(Lorg/koin/core/KoinApplication;Landroid/content/Context;)Lorg/koin/core/KoinApplication;

    const/4 v0, 0x6

    new-array v0, v0, [Lorg/koin/core/module/Module;

    .line 75
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt;->appModule(Landroid/content/Context;)Lorg/koin/core/module/Module;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 76
    iget-boolean v1, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->$prodEnabled:Z

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt;->cloud(Z)Lorg/koin/core/module/Module;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    .line 77
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->$cloudEnv:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getHttpConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;

    move-result-object v1

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpModuleKt;->httpModule(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)Lorg/koin/core/module/Module;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 78
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt;->dbModule(Landroid/content/Context;)Lorg/koin/core/module/Module;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 79
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp$onCreate$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt;->fcmModule(Landroid/content/Context;)Lorg/koin/core/module/Module;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 80
    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt;->logger(Z)Lorg/koin/core/module/Module;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 74
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 73
    invoke-virtual {p1, v0}, Lorg/koin/core/KoinApplication;->modules(Ljava/util/List;)Lorg/koin/core/KoinApplication;

    return-void
.end method
