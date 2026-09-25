.class public final Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt;
.super Ljava/lang/Object;
.source "ReportingModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "reportingModule",
        "Lorg/koin/core/module/Module;",
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
.method public static final reportingModule()Lorg/koin/core/module/Module;
    .locals 3

    .line 11
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/report/ReportingModuleKt$reportingModule$1;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Lorg/koin/dsl/ModuleKt;->module(ZZLkotlin/jvm/functions/Function1;)Lorg/koin/core/module/Module;

    move-result-object v0

    return-object v0
.end method
