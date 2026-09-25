.class final Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2;
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
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;",
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
.field final synthetic $appContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2;->$appContext:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 46
    check-cast p1, Lorg/koin/core/scope/Scope;

    check-cast p2, Lorg/koin/core/parameter/DefinitionParameters;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2;->invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration20$1;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration20$1;-><init>()V

    .line 54
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration21$1;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration21$1;-><init>()V

    .line 61
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration22$1;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration22$1;-><init>()V

    .line 87
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration23$1;

    invoke-direct {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2$migration23$1;-><init>()V

    .line 101
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBModuleKt$dbModule$1$2;->$appContext:Landroid/content/Context;

    const-class v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    const-string v4, "PowerWatchDB"

    invoke-static {v2, v3, v4}, Landroidx/room/Room;->databaseBuilder(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Landroidx/room/migration/Migration;

    .line 102
    check-cast p1, Landroidx/room/migration/Migration;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    check-cast p2, Landroidx/room/migration/Migration;

    const/4 p1, 0x1

    aput-object p2, v3, p1

    check-cast v0, Landroidx/room/migration/Migration;

    const/4 p1, 0x2

    aput-object v0, v3, p1

    check-cast v1, Landroidx/room/migration/Migration;

    const/4 p1, 0x3

    aput-object v1, v3, p1

    invoke-virtual {v2, v3}, Landroidx/room/RoomDatabase$Builder;->addMigrations([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;

    move-result-object p1

    .line 103
    invoke-virtual {p1}, Landroidx/room/RoomDatabase$Builder;->allowMainThreadQueries()Landroidx/room/RoomDatabase$Builder;

    move-result-object p1

    .line 105
    invoke-virtual {p1}, Landroidx/room/RoomDatabase$Builder;->build()Landroidx/room/RoomDatabase;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/RoomDB;

    return-object p1
.end method
