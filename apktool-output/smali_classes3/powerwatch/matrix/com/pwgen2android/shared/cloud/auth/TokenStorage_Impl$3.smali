.class Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$3;
.super Landroidx/room/SharedSQLiteStatement;
.source "TokenStorage_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;Landroidx/room/RoomDatabase;)V
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

    .line 80
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$3;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;

    invoke-direct {p0, p2}, Landroidx/room/SharedSQLiteStatement;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM PasswordCredentials"

    return-object v0
.end method
