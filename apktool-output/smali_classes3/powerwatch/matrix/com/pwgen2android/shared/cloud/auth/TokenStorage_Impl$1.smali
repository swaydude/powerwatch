.class Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$1;
.super Landroidx/room/EntityInsertionAdapter;
.source "TokenStorage_Impl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;-><init>(Landroidx/room/RoomDatabase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/EntityInsertionAdapter<",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
        ">;"
    }
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

    .line 30
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$1;->this$0:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;

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

    .line 30
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$1;->bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V

    return-void
.end method

.method public bind(Landroidx/sqlite/db/SupportSQLiteStatement;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V
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

    .line 38
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getUid()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 39
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_0

    .line 40
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 44
    :goto_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getTokenType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 45
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getTokenType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 49
    :goto_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getRefreshToken()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    .line 50
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getRefreshToken()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_2
    const/4 v0, 0x5

    .line 54
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getExpiresIn()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 55
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getScope()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_3

    .line 56
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_3

    .line 58
    :cond_3
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getScope()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_3
    const/4 v0, 0x7

    .line 60
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getTokenValidUntil()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindLong(IJ)V

    .line 61
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getEmail()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_4

    .line 62
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_4

    .line 64
    :cond_4
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 66
    :goto_4
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getPassword()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_5

    .line 67
    invoke-interface {p1, v1}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindNull(I)V

    goto :goto_5

    .line 69
    :cond_5
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;->getPassword()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Landroidx/sqlite/db/SupportSQLiteStatement;->bindString(ILjava/lang/String;)V

    :goto_5
    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `PasswordCredentials` (`uid`,`accessToken`,`tokenType`,`refreshToken`,`expiresIn`,`scope`,`tokenValidUntil`,`email`,`password`) VALUES (?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
