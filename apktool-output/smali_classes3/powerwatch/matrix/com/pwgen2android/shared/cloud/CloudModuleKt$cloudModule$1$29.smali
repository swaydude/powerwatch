.class final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$29;
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
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCloudModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$29\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,139:1\n80#2,4:140\n*S KotlinDebug\n*F\n+ 1 CloudModule.kt\npowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$29\n*L\n111#1:140,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;",
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

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$29;->$cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 111
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$29;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoServiceImpl;

    const/4 v0, 0x0

    .line 140
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 141
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 143
    const-class v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {p1, v2, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;

    .line 111
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudModuleKt$cloudModule$1$29;->$cloudConfig:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudConfig;->getUpdateInfoConfig()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoServiceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;

    return-object p2
.end method
