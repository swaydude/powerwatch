.class public final Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;
.super Ljava/lang/Object;
.source "GoogleFitSessionWriter.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoogleFitSessionWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleFitSessionWriter.kt\npowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,247:1\n1547#2:248\n1618#2,2:249\n764#2:251\n855#2,2:252\n1547#2:254\n1618#2,3:255\n1620#2:258\n764#2:259\n855#2,2:260\n1547#2:262\n1618#2,2:263\n764#2:265\n855#2,2:266\n1547#2:268\n1618#2,3:269\n1620#2:272\n1547#2:273\n1618#2,3:274\n1547#2:277\n1618#2,3:278\n*S KotlinDebug\n*F\n+ 1 GoogleFitSessionWriter.kt\npowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter\n*L\n30#1:248\n30#1:249,2\n34#1:251\n34#1:252,2\n35#1:254\n35#1:255,3\n30#1:258\n50#1:259\n50#1:260,2\n52#1:262\n52#1:263,2\n56#1:265\n56#1:266,2\n57#1:268\n57#1:269,3\n52#1:272\n171#1:273\n171#1:274,3\n181#1:277\n181#1:278,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0006H\u0002J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001c\u0010\u001d\u001a\u00020\u001b2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0002\u001a\u00020\u0003R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "packageName",
        "",
        "kotlin.jvm.PlatformType",
        "createDataSource",
        "Lcom/google/android/gms/fitness/data/DataSource;",
        "dataType",
        "Lcom/google/android/gms/fitness/data/DataType;",
        "dataTag",
        "createSessionInsertRequest",
        "",
        "Lcom/google/android/gms/fitness/request/SessionInsertRequest;",
        "userSession",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
        "extractActivityType",
        "userActivitySession",
        "extractCaloriesData",
        "Lcom/google/android/gms/fitness/data/DataSet;",
        "extractDistanceData",
        "extractHeartRateData",
        "extractLocationData",
        "extractStepsData",
        "sendSingleSession",
        "Lio/reactivex/Completable;",
        "sessionRequest",
        "writeSessions",
        "userSessions",
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
.field private final packageName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->packageName:Ljava/lang/String;

    return-void
.end method

.method private final createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 2

    .line 240
    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    .line 241
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 242
    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object p1

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setStreamName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 244
    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object p1

    .line 245
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object p1

    const-string p2, "Builder()\n                .setAppPackageName(packageName)\n                .setDataType(dataType)\n                .setStreamName(\"$packageName - $dataTag\")\n                .setType(DataSource.TYPE_RAW)\n                .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic createDataSource$default(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;ILjava/lang/Object;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "unknown"

    .line 239
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object p0

    return-object p0
.end method

.method private final createSessionInsertRequest(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fitness/request/SessionInsertRequest;",
            ">;"
        }
    .end annotation

    .line 159
    new-instance v0, Lcom/google/android/gms/fitness/data/Session$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/Session$Builder;-><init>()V

    .line 160
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/fitness/data/Session$Builder;->setStartTime(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$Builder;

    move-result-object v0

    .line 161
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/fitness/data/Session$Builder;->setEndTime(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$Builder;

    move-result-object v0

    .line 162
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->extractActivityType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Session$Builder;->setActivity(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$Builder;

    move-result-object v0

    .line 164
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getName()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/Session$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$Builder;

    .line 166
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Session$Builder;->build()Lcom/google/android/gms/fitness/data/Session;

    move-result-object v0

    .line 168
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 170
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->extractHeartRateData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 273
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 274
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 275
    check-cast v5, Lcom/google/android/gms/fitness/data/DataSet;

    .line 172
    new-instance v6, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    invoke-direct {v6}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;-><init>()V

    .line 173
    invoke-virtual {v6, v0}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->setSession(Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v6

    .line 174
    invoke-virtual {v6, v5}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->addDataSet(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v5

    .line 175
    invoke-virtual {v5}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->build()Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 276
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 178
    move-object v2, v3

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 180
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->extractLocationData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 277
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 278
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 279
    check-cast v4, Lcom/google/android/gms/fitness/data/DataSet;

    .line 182
    new-instance v6, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    invoke-direct {v6}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;-><init>()V

    .line 183
    invoke-virtual {v6, v0}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->setSession(Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v6

    .line 184
    invoke-virtual {v6, v4}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->addDataSet(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v4

    .line 185
    invoke-virtual {v4}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->build()Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 280
    :cond_3
    check-cast v5, Ljava/util/List;

    .line 188
    move-object v2, v5

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 190
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Prepared data list requests: locations - "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", heart rates - "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " \n Session info: start - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dateFormat(J)Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", end - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->dateFormat(J)Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", duration - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v3

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->hourMinSecTimeFormat(J)Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", distance - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result v3

    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ", steps - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getSteps()I

    move-result v3

    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", calories - "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActiveCalories()I

    move-result v3

    .line 190
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 194
    move-object v3, p0

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v3, v2, v5, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 196
    new-instance v2, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;-><init>()V

    .line 197
    invoke-virtual {v2, v0}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->setSession(Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v2

    .line 198
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->extractDistanceData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->addDataSet(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v2

    .line 199
    invoke-virtual {v2}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->build()Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    move-result-object v2

    const-string v3, "Builder()\n                .setSession(session)\n                .addDataSet(extractDistanceData(userSession))\n                .build()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    new-instance v2, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;-><init>()V

    .line 201
    invoke-virtual {v2, v0}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->setSession(Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v2

    .line 202
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->extractStepsData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->addDataSet(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v2

    .line 203
    invoke-virtual {v2}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->build()Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    move-result-object v2

    const-string v3, "Builder()\n                .setSession(session)\n                .addDataSet(extractStepsData(userSession))\n                .build()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    new-instance v2, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;-><init>()V

    .line 205
    invoke-virtual {v2, v0}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->setSession(Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v0

    .line 206
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->extractCaloriesData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->addDataSet(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object p1

    .line 207
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->build()Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    move-result-object p1

    const-string v0, "Builder()\n                .setSession(session)\n                .addDataSet(extractCaloriesData(userSession))\n                .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method private final extractActivityType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/lang/String;
    .locals 1

    .line 125
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const-string p1, "walking"

    goto :goto_0

    :pswitch_0
    const-string p1, "interval_training.high_intensity"

    goto :goto_0

    :pswitch_1
    const-string p1, "biking"

    goto :goto_0

    :pswitch_2
    const-string p1, "running.jogging"

    goto :goto_0

    :pswitch_3
    const-string p1, "running"

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final extractCaloriesData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lcom/google/android/gms/fitness/data/DataSet;
    .locals 7

    .line 92
    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->TYPE_CALORIES_EXPENDED:Lcom/google/android/gms/fitness/data/DataType;

    const-string v1, "TYPE_CALORIES_EXPENDED"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "session calories"

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    .line 95
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 96
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v2

    .line 97
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 96
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 98
    sget-object v2, Lcom/google/android/gms/fitness/data/Field;->FIELD_CALORIES:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActiveCalories()I

    move-result p1

    int-to-float p1, p1

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float p1, p1, v3

    const/16 v3, 0x3e8

    int-to-float v3, v3

    div-float/2addr p1, v3

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object p1

    .line 99
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object p1

    .line 102
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v0

    .line 103
    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->add(Lcom/google/android/gms/fitness/data/DataPoint;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object p1

    .line 104
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object p1

    const-string v0, "builder(distanceDataSource)\n                .add(distanceDataPoint)\n                .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final extractDistanceData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lcom/google/android/gms/fitness/data/DataSet;
    .locals 7

    .line 75
    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->TYPE_DISTANCE_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    const-string v1, "TYPE_DISTANCE_DELTA"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "session distance"

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    .line 78
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 79
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v2

    .line 80
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 79
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 81
    sget-object v2, Lcom/google/android/gms/fitness/data/Field;->FIELD_DISTANCE:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getDistance()F

    move-result p1

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object p1

    .line 85
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v0

    .line 86
    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->add(Lcom/google/android/gms/fitness/data/DataPoint;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object p1

    const-string v0, "builder(distanceDataSource)\n                .add(distanceDataPoint)\n                .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final extractHeartRateData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            ">;"
        }
    .end annotation

    .line 28
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getHeartRates()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0x320

    .line 29
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 248
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 249
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 250
    check-cast v3, Ljava/util/List;

    .line 31
    sget-object v4, Lcom/google/android/gms/fitness/data/DataType;->TYPE_HEART_RATE_BPM:Lcom/google/android/gms/fitness/data/DataType;

    const-string v5, "TYPE_HEART_RATE_BPM"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "session heart rate"

    invoke-direct {p0, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v4

    .line 33
    check-cast v3, Ljava/lang/Iterable;

    .line 251
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .line 252
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 34
    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getEndTime()J

    move-result-wide v7

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v9

    cmp-long v11, v7, v9

    if-gtz v11, :cond_1

    const/4 v7, 0x1

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_0

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 253
    :cond_2
    check-cast v5, Ljava/util/List;

    .line 251
    check-cast v5, Ljava/lang/Iterable;

    .line 254
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v5, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 255
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 256
    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;

    .line 36
    invoke-static {v4}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v7

    .line 37
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getStartTime()J

    move-result-wide v8

    .line 38
    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getEndTime()J

    move-result-wide v10

    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 37
    invoke-virtual/range {v7 .. v12}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v7

    .line 39
    sget-object v8, Lcom/google/android/gms/fitness/data/Field;->FIELD_BPM:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;->getValue()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v7, v8, v6}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v6

    .line 40
    invoke-virtual {v6}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 257
    :cond_3
    check-cast v3, Ljava/util/List;

    .line 42
    invoke-static {v4}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v4

    .line 43
    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v3

    .line 44
    invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 258
    :cond_4
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method private final extractLocationData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            ">;"
        }
    .end annotation

    .line 49
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getGpsPositions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 259
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 260
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 50
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmpg-double v10, v6, v8

    if-nez v10, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_4

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v5

    cmpg-double v7, v5, v8

    if-nez v7, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_3
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 261
    :cond_5
    check-cast v1, Ljava/util/List;

    .line 259
    check-cast v1, Ljava/lang/Iterable;

    const/16 v0, 0x320

    .line 51
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 262
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 263
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 264
    check-cast v5, Ljava/util/List;

    .line 53
    sget-object v6, Lcom/google/android/gms/fitness/data/DataType;->TYPE_LOCATION_SAMPLE:Lcom/google/android/gms/fitness/data/DataType;

    const-string v7, "TYPE_LOCATION_SAMPLE"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "session location"

    invoke-direct {p0, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v6

    .line 55
    check-cast v5, Ljava/lang/Iterable;

    .line 265
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .line 266
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 56
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getTimestamp()J

    move-result-wide v9

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v11

    cmp-long v13, v9, v11

    if-gtz v13, :cond_7

    const/4 v9, 0x1

    goto :goto_6

    :cond_7
    const/4 v9, 0x0

    :goto_6
    if-eqz v9, :cond_6

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 267
    :cond_8
    check-cast v7, Ljava/util/List;

    .line 265
    check-cast v7, Ljava/lang/Iterable;

    .line 268
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v7, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .line 269
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 270
    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;

    .line 58
    invoke-static {v6}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v9

    .line 59
    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getTimestamp()J

    move-result-wide v10

    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v10, v11, v12}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimestamp(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v9

    .line 60
    sget-object v10, Lcom/google/android/gms/fitness/data/Field;->FIELD_LONGITUDE:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLongitude()D

    move-result-wide v11

    double-to-float v11, v11

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v9

    .line 61
    sget-object v10, Lcom/google/android/gms/fitness/data/Field;->FIELD_LATITUDE:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getLatitude()D

    move-result-wide v11

    double-to-float v11, v11

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v9

    .line 62
    sget-object v10, Lcom/google/android/gms/fitness/data/Field;->FIELD_ACCURACY:Lcom/google/android/gms/fitness/data/Field;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v9

    .line 63
    sget-object v10, Lcom/google/android/gms/fitness/data/Field;->FIELD_ALTITUDE:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;->getAltitude()D

    move-result-wide v11

    double-to-float v8, v11

    invoke-virtual {v9, v10, v8}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v8

    .line 64
    invoke-virtual {v8}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v8

    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 271
    :cond_9
    check-cast v5, Ljava/util/List;

    .line 67
    invoke-static {v6}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v6

    .line 68
    check-cast v5, Ljava/lang/Iterable;

    invoke-virtual {v6, v5}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v5

    .line 69
    invoke-virtual {v5}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    .line 272
    :cond_a
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method private final extractStepsData(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Lcom/google/android/gms/fitness/data/DataSet;
    .locals 7

    .line 109
    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->TYPE_STEP_COUNT_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    const-string v1, "TYPE_STEP_COUNT_DELTA"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "session steps"

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    .line 112
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 113
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getStartTime()J

    move-result-wide v2

    .line 114
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getEndTime()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 113
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 115
    sget-object v2, Lcom/google/android/gms/fitness/data/Field;->FIELD_STEPS:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getSteps()I

    move-result p1

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;I)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object p1

    .line 116
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object p1

    .line 119
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v0

    .line 120
    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->add(Lcom/google/android/gms/fitness/data/DataPoint;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object p1

    .line 121
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object p1

    const-string v0, "builder(distanceDataSource)\n                .add(distanceDataPoint)\n                .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic lambda$4DNvLS9PbEonv3i1hO2WfTbyBZs()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-13$lambda-12$lambda-11()V

    return-void
.end method

.method public static synthetic lambda$BPjJdSijsdYBV74XshBDqM1t2ik(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-13(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$GKGs2s3Y4fenaGu5SMHN_ZYuges(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->sendSingleSession$lambda-19$lambda-17(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic lambda$QozwErT9bE6ZUMThNjdwHw_gQhQ(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-14(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Qy4S4pj0cSqPmo6nrWm03VFE4G0(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-8(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$TTIoZNb4gN_cYv0Zy96vivGlZSU(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->sendSingleSession$lambda-19(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$bQhU_XbaynvMPpnl1han6DfBxFE(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->sendSingleSession$lambda-19$lambda-18(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$cyszL97eFN4iRDZj2aob-mgRlFo(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V

    return-void
.end method

.method public static synthetic lambda$pz4vfsJ92WHZuFw-NagDjmFjvF4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-13$lambda-12(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$tuM0t7SbgNxkXFOkp2n2XcZkNu4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-13$lambda-10(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)V

    return-void
.end method

.method public static synthetic lambda$y3FSCPjaUKf48a6OhbUL8kGhr0c(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->writeSessions$lambda-9(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Ljava/util/List;)V

    return-void
.end method

.method private final sendSingleSession(Lcom/google/android/gms/fitness/request/SessionInsertRequest;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1

    .line 221
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$TTIoZNb4gN_cYv0Zy96vivGlZSU;

    invoke-direct {v0, p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$TTIoZNb4gN_cYv0Zy96vivGlZSU;-><init>(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create { emitter ->\n\n            Fitness.getSessionsClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                    .insertSession(sessionRequest)\n                    .addOnSuccessListener {\n                        debug(\"Session data saved to cloud\")\n                        emitter.onComplete()\n                    }\n                    .addOnFailureListener {\n                        error(\"Session data save error\", it)\n                        it.printStackTrace()\n                        emitter.onComplete()\n                    }\n\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final sendSingleSession$lambda-19(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;)V
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sessionRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/fitness/Fitness;->getSessionsClient(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/fitness/SessionsClient;

    move-result-object p0

    .line 224
    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/SessionsClient;->insertSession(Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 225
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$GKGs2s3Y4fenaGu5SMHN_ZYuges;

    invoke-direct {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$GKGs2s3Y4fenaGu5SMHN_ZYuges;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 229
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$bQhU_XbaynvMPpnl1han6DfBxFE;

    invoke-direct {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$bQhU_XbaynvMPpnl1han6DfBxFE;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final sendSingleSession$lambda-19$lambda-17(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$emitter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "Session data saved to cloud"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p2, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 227
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final sendSingleSession$lambda-19$lambda-18(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    move-object v3, p2

    check-cast v3, Ljava/lang/Throwable;

    const-string v2, "Session data save error"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 231
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 232
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final writeSessions$lambda-13(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p2

    .line 149
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$tuM0t7SbgNxkXFOkp2n2XcZkNu4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$tuM0t7SbgNxkXFOkp2n2XcZkNu4;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 150
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$pz4vfsJ92WHZuFw-NagDjmFjvF4;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$pz4vfsJ92WHZuFw-NagDjmFjvF4;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final writeSessions$lambda-13$lambda-10(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "FitWriter - processing next request"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final writeSessions$lambda-13$lambda-12(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->sendSingleSession(Lcom/google/android/gms/fitness/request/SessionInsertRequest;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$4DNvLS9PbEonv3i1hO2WfTbyBZs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$4DNvLS9PbEonv3i1hO2WfTbyBZs;

    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final writeSessions$lambda-13$lambda-12$lambda-11()V
    .locals 2

    .line 150
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "FitWriter - one session sent"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final writeSessions$lambda-14(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 154
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error in save session log"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final writeSessions$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)V
    .locals 1

    .line 142
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;->getActivityType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityType;->name()Ljava/lang/String;

    move-result-object p0

    const-string v0, "FitWriter - running next session, type - "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final writeSessions$lambda-8(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;->createSessionInsertRequest(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final writeSessions$lambda-9(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "FitWriter - created requests "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 21
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final writeSessions(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "userSessions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$cyszL97eFN4iRDZj2aob-mgRlFo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$cyszL97eFN4iRDZj2aob-mgRlFo;

    .line 142
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 143
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$Qy4S4pj0cSqPmo6nrWm03VFE4G0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$Qy4S4pj0cSqPmo6nrWm03VFE4G0;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 146
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$y3FSCPjaUKf48a6OhbUL8kGhr0c;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$y3FSCPjaUKf48a6OhbUL8kGhr0c;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 147
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 152
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$QozwErT9bE6ZUMThNjdwHw_gQhQ;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitSessionWriter$QozwErT9bE6ZUMThNjdwHw_gQhQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "fromIterable(userSessions)\n                .doOnNext { println(\"FitWriter - running next session, type - ${it.activityType.name}\") }\n                .map {\n                    createSessionInsertRequest(it)\n                }\n                .doOnNext { debug(\"FitWriter - created requests ${it.size}\") }\n                .concatMapCompletable {\n                    Observable.fromIterable(it)\n                            .doOnNext { debug(\"FitWriter - processing next request\") }\n                            .concatMapCompletable { session -> sendSingleSession(session, context).doOnComplete { println(\"FitWriter - one session sent\") } }\n                }\n                .doOnError {\n                    it.printStackTrace()\n                    error(\"Error in save session log\", it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
