.class public final Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt;
.super Ljava/lang/Object;
.source "FCMModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "fcmModule",
        "Lorg/koin/core/module/Module;",
        "appContext",
        "Landroid/content/Context;",
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
.method public static final fcmModule(Landroid/content/Context;)Lorg/koin/core/module/Module;
    .locals 3

    const-string v0, "appContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/fcm/FCMModuleKt$fcmModule$1;-><init>(Landroid/content/Context;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p0, p0, v0, v1, v2}, Lorg/koin/dsl/ModuleKt;->module$default(ZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lorg/koin/core/module/Module;

    move-result-object p0

    return-object p0
.end method
