.class final Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5;
.super Lkotlin/jvm/internal/Lambda;
.source "LoggerModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1;->invoke(Lorg/koin/core/module/Module;)V
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
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLoggerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoggerModule.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,34:1\n80#2,4:35\n*S KotlinDebug\n*F\n+ 1 LoggerModule.kt\npowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5\n*L\n30#1:35,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;",
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
.field final synthetic $loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5;->$loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 30
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;

    const/4 v0, 0x0

    .line 35
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 36
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 38
    const-class v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {p1, v2, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerModuleKt$loggerModule$1$5;->$loggerConfig:Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;

    invoke-direct {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtensionImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerOutput;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;

    return-object p2
.end method
