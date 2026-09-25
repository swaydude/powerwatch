.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$2;
.super Landroidx/room/SharedSQLiteStatement;
.source "UpdateInfoDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;Landroidx/room/RoomDatabase;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x0
        }
        names = {
            "this$0",
            "database"
        }
    .end annotation

    .line 77
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl$2;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/UpdateInfoDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/SharedSQLiteStatement;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM UpdateInfo WHERE uid = 0"

    return-object v0
.end method
