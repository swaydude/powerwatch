.class public final Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;
.super Ljava/lang/Object;
.source "TokenStorage_Impl.java"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage;


# instance fields
.field private final __db:Landroidx/room/RoomDatabase;

.field private final __insertionAdapterOfPasswordCredentials:Landroidx/room/EntityInsertionAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/EntityInsertionAdapter<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;",
            ">;"
        }
    .end annotation
.end field

.field private final __preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

.field private final __preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;


# direct methods
.method public constructor <init>(Landroidx/room/RoomDatabase;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "__db"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$1;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__insertionAdapterOfPasswordCredentials:Landroidx/room/EntityInsertionAdapter;

    .line 73
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$2;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    .line 80
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$3;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl$3;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;Landroidx/room/RoomDatabase;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    return-void
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 201
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public add(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "passwordCredentials"
        }
    .end annotation

    .line 91
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 94
    :try_start_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__insertionAdapterOfPasswordCredentials:Landroidx/room/EntityInsertionAdapter;

    invoke-virtual {v0, p1}, Landroidx/room/EntityInsertionAdapter;->insert(Ljava/lang/Object;)V

    .line 95
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {p1}, Landroidx/room/RoomDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 98
    throw p1
.end method

.method public delete()V
    .locals 3

    .line 103
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 104
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 105
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 107
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 108
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 111
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 110
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 111
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDelete:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 112
    throw v1
.end method

.method public deleteAll()V
    .locals 3

    .line 117
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 118
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v0}, Landroidx/room/SharedSQLiteStatement;->acquire()Landroidx/sqlite/db/SupportSQLiteStatement;

    move-result-object v0

    .line 119
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->beginTransaction()V

    .line 121
    :try_start_0
    invoke-interface {v0}, Landroidx/sqlite/db/SupportSQLiteStatement;->executeUpdateDelete()I

    .line 122
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v1}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 125
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v1, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    return-void

    :catchall_0
    move-exception v1

    .line 124
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v2}, Landroidx/room/RoomDatabase;->endTransaction()V

    .line 125
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__preparedStmtOfDeleteAll:Landroidx/room/SharedSQLiteStatement;

    invoke-virtual {v2, v0}, Landroidx/room/SharedSQLiteStatement;->release(Landroidx/sqlite/db/SupportSQLiteStatement;)V

    .line 126
    throw v1
.end method

.method public get()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;
    .locals 26

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM PasswordCredentials WHERE uid = 0"

    const/4 v2, 0x0

    .line 132
    invoke-static {v0, v2}, Landroidx/room/RoomSQLiteQuery;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    move-result-object v3

    .line 133
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    invoke-virtual {v0}, Landroidx/room/RoomDatabase;->assertNotSuspendingTransaction()V

    .line 134
    iget-object v0, v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenStorage_Impl;->__db:Landroidx/room/RoomDatabase;

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, Landroidx/room/util/DBUtil;->query(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "uid"

    .line 136
    invoke-static {v2, v0}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "accessToken"

    .line 137
    invoke-static {v2, v5}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "tokenType"

    .line 138
    invoke-static {v2, v6}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "refreshToken"

    .line 139
    invoke-static {v2, v7}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "expiresIn"

    .line 140
    invoke-static {v2, v8}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "scope"

    .line 141
    invoke-static {v2, v9}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "tokenValidUntil"

    .line 142
    invoke-static {v2, v10}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "email"

    .line 143
    invoke-static {v2, v11}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "password"

    .line 144
    invoke-static {v2, v12}, Landroidx/room/util/CursorUtil;->getColumnIndexOrThrow(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    .line 146
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 148
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v15

    .line 150
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v16, v4

    goto :goto_0

    .line 153
    :cond_0
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    .line 156
    :goto_0
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v17, v4

    goto :goto_1

    .line 159
    :cond_1
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v0

    .line 162
    :goto_1
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object/from16 v18, v4

    goto :goto_2

    .line 165
    :cond_2
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v0

    .line 168
    :goto_2
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v19

    .line 170
    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v21, v4

    goto :goto_3

    .line 173
    :cond_3
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v21, v0

    .line 176
    :goto_3
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v22

    .line 178
    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v24, v4

    goto :goto_4

    .line 181
    :cond_4
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v24, v0

    .line 184
    :goto_4
    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_5
    move-object/from16 v25, v4

    goto :goto_6

    .line 187
    :cond_5
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    .line 189
    :goto_6
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;

    move-object v14, v4

    invoke-direct/range {v14 .. v25}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    :cond_6
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 196
    invoke-virtual {v3}, Landroidx/room/RoomSQLiteQuery;->release()V

    return-object v4

    :catchall_0
    move-exception v0

    .line 195
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 196
    invoke-virtual {v3}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 197
    throw v0
.end method
