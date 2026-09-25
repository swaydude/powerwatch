.class public final Lpowerwatch/matrix/com/pwgen2android/AppModuleKt;
.super Ljava/lang/Object;
.source "AppModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "appModule",
        "Lorg/koin/core/module/Module;",
        "appContext",
        "Landroid/content/Context;",
        "cloud",
        "prodEnabled",
        "",
        "logger",
        "app_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final appModule(Landroid/content/Context;)Lorg/koin/core/module/Module;
    .locals 3

    const-string v0, "appContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/AppModuleKt$appModule$1;-><init>(Landroid/content/Context;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p0, p0, v0, v1, v2}, Lorg/koin/dsl/ModuleKt;->module$default(ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lorg/koin/core/module/Module;

    move-result-object p0

    return-object p0
.end method

.method public static final cloud(Z)Lorg/koin/core/module/Module;
    .locals 0

    .line 165
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/EnvironmentKt;->cloudConfiguration(Z)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    move-result-object p0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt;->cloudModule(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;)Lorg/koin/core/module/Module;

    move-result-object p0

    return-object p0
.end method

.method public static final logger(Z)Lorg/koin/core/module/Module;
    .locals 1

    .line 167
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    if-eqz p0, :cond_0

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;

    goto :goto_0

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$DEV;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$DEV;

    :goto_0
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt;->loggerModule(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)Lorg/koin/core/module/Module;

    move-result-object p0

    return-object p0
.end method
