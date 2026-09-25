.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;
.super Ljava/lang/Object;
.source "AGPSRepository.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0008\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "FILE_PREFIX_KEY",
        "",
        "TIMESTAMP_LOCATION",
        "UPDATE_FINISHED_TIMESTAMP",
        "threshold",
        "",
        "getOne",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
        "id",
        "fromCache",
        "",
        "isWatchUpdateNeeded",
        "save",
        "Lio/reactivex/Single;",
        "entity",
        "storeLastUpdateTimestamp",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final FILE_PREFIX_KEY:Ljava/lang/String;

.field private final TIMESTAMP_LOCATION:Ljava/lang/String;

.field private final UPDATE_FINISHED_TIMESTAMP:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private final threshold:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    const-wide/32 v0, 0x6c258c00

    .line 25
    iput-wide v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->threshold:J

    const-string p1, "gps_file_"

    .line 27
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->FILE_PREFIX_KEY:Ljava/lang/String;

    const-string p1, "gps_file_timestamp"

    .line 28
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->TIMESTAMP_LOCATION:Ljava/lang/String;

    const-string p1, "update_finished"

    .line 29
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->UPDATE_FINISHED_TIMESTAMP:Ljava/lang/String;

    return-void
.end method

.method private static final getOne$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Ljava/lang/String;Lio/reactivex/ObservableEmitter;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 48
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    invoke-static {v2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->TIMESTAMP_LOCATION:Ljava/lang/String;

    const-wide/16 v4, -0x1

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    sub-long/2addr v0, v2

    .line 49
    iget-wide v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->threshold:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    .line 50
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    invoke-static {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/FileExtensionsKt;->readFile(Ljava/lang/String;Landroid/content/Context;)Lkotlin/Pair;

    move-result-object p0

    .line 51
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_0

    .line 53
    array-length v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "File size: "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 54
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;-><init>([BLjava/lang/String;)V

    invoke-interface {p2, v0}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 57
    :cond_0
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method public static synthetic lambda$3lpnkz7oW6a8C89oqsiYQZyxFl0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->save$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$GybjmaorvecWQrzfzLWAbgvpSR0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Ljava/lang/String;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->getOne$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Ljava/lang/String;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method private static final save$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Lio/reactivex/SingleEmitter;)V
    .locals 4

    const-string v0, "$entity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;->getFileName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/FileExtensionsKt;->deleteFile(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    .line 34
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "File deleted: "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 35
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;->getContent()[B

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;->getFileName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/FileExtensionsKt;->writeContentToFile([BLjava/lang/String;Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 37
    iget-object v3, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    invoke-static {v3}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->TIMESTAMP_LOCATION:Ljava/lang/String;

    invoke-interface {v3, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->getTotalSpace()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_0
    const-string v0, "File written: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 39
    invoke-interface {p2, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getOne(Ljava/lang/Object;Z)Lio/reactivex/Observable;
    .locals 0

    .line 23
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public getOne(Ljava/lang/String;Z)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
            ">;"
        }
    .end annotation

    const-string p2, "id"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$GybjmaorvecWQrzfzLWAbgvpSR0;

    invoke-direct {p2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$GybjmaorvecWQrzfzLWAbgvpSR0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;Ljava/lang/String;)V

    invoke-static {p2}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "create {\n\n            val currentTime = System.currentTimeMillis()\n            val lastTime = PreferenceManager.getDefaultSharedPreferences(context).getLong(TIMESTAMP_LOCATION, -1)\n            if (lastTime != -1L && (currentTime - lastTime < threshold)) {\n                val filePair = readFile(id, context)\n                val data = filePair.second\n                if (data != null) {\n                    println(\"File size: ${data.size}\")\n                    it.onNext(GPSFile(data, filePair.first))\n                }\n            }\n            it.onComplete()\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public isWatchUpdateNeeded()Z
    .locals 5

    .line 69
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    invoke-static {v0}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->UPDATE_FINISHED_TIMESTAMP:Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-wide/32 v0, 0xea60

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic save(Ljava/lang/Object;)Lio/reactivex/Single;
    .locals 0

    .line 23
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->save(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public save(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;",
            ">;"
        }
    .end annotation

    const-string v0, "entity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "create {\n            val s = deleteFile(entity.fileName, context)\n            println(\"File deleted: $s\")\n            val f = writeContentToFile(entity.content, entity.fileName, context)\n            val time = System.currentTimeMillis()\n            PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(TIMESTAMP_LOCATION, time).apply()\n            println(\"File written: ${f?.totalSpace}\")\n            it.onSuccess(entity)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public storeLastUpdateTimestamp()V
    .locals 4

    .line 64
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 65
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->context:Landroid/content/Context;

    invoke-static {v2}, Landroidx/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;->UPDATE_FINISHED_TIMESTAMP:Ljava/lang/String;

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
