.class final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "DBModule.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1;->invoke(Lorg/koin/core/module/Module;)V
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
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDBModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBModule.kt\npowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,125:1\n80#2,4:126\n*S KotlinDebug\n*F\n+ 1 DBModule.kt\npowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3\n*L\n108#1:126,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;",
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


# static fields
.field public static final INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;-><init>()V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;

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

    .line 108
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$3;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;

    const/4 v0, 0x0

    .line 126
    move-object v1, v0

    check-cast v1, Lorg/koin/core/qualifier/Qualifier;

    .line 127
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 129
    const-class v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {p1, v2, v1, v0}, Lorg/koin/core/scope/Scope;->get(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    .line 108
    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManagerImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;)V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;

    return-object p2
.end method
