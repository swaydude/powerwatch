.class Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl$1;
.super Landroidx/room/EntityInsertionAdapter;
.source "DefaultPhoneWatchDao_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertionAdapter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;


# direct methods
.method constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;Landroidx/room/RoomDatabase;)V
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

    .line 26
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl;

    invoke-direct {p0, p2}, Landroidx/room/EntityInsertionAdapter;-><init>(Landroidx/room/RoomDatabase;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 26
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DefaultPhoneWatchDao_Impl$1;->bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V

    return-void
.end method

.method public bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "stmt",
            "value"
        }
    .end annotation

    .line 34
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getUid()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 35
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 36
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 40
    :goto_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 41
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;->getSerialNumber()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `DefaultPhoneWatch` (`uid`,`bluetoothAddress`,`serialNumber`) VALUES (?,?,?)"

    return-object v0
.end method
