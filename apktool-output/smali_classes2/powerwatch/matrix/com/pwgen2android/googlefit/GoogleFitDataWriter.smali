.class public final Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;
.super Ljava/lang/Object;
.source "GoogleFitDataWriter.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;,
        Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoogleFitDataWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleFitDataWriter.kt\npowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1547#2:355\n1618#2,3:356\n1547#2:359\n1618#2,2:360\n1547#2:362\n1618#2,3:363\n1620#2:366\n1547#2:367\n1618#2,3:368\n1547#2:371\n1618#2,3:372\n2820#2,5:375\n1547#2:380\n1618#2,3:381\n1547#2:384\n1618#2,3:385\n1783#2,2:388\n1849#2,2:390\n1785#2:392\n1849#2,2:393\n1547#2:395\n1618#2,2:396\n1547#2:398\n1618#2,3:399\n1620#2:402\n*S KotlinDebug\n*F\n+ 1 GoogleFitDataWriter.kt\npowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter\n*L\n58#1:355\n58#1:356,3\n78#1:359\n78#1:360,2\n81#1:362\n81#1:363,3\n78#1:366\n106#1:367\n106#1:368,3\n125#1:371\n125#1:372,3\n132#1:375,5\n144#1:380\n144#1:381,3\n221#1:384\n221#1:385,3\n251#1:388,2\n262#1:390,2\n251#1:392\n279#1:393,2\n291#1:395\n291#1:396,2\n311#1:398\n311#1:399,3\n291#1:402\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u001e\u0010\u0016\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J&\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\t2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\u001d\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\u001e\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001c\u0010\u001f\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u001e\u0010!\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\"\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J&\u0010$\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010%\u001a\u00020&J\u001e\u0010\'\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001c\u0010(\u001a\u00020\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;",
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
        "mapSleepTypeToFitSleepType",
        "",
        "sleepType",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;",
        "printData",
        "",
        "it",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
        "saveCaloriesData",
        "Lio/reactivex/Completable;",
        "logs",
        "saveDataToCloud",
        "dataSource",
        "dataPointList",
        "Lcom/google/android/gms/fitness/data/DataPoint;",
        "saveDistanceData",
        "saveHeartRate",
        "saveRestingLog",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
        "saveSingleLog",
        "saveSleepHeartRate",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
        "saveSleepingLog",
        "useGranularData",
        "",
        "saveStepsData",
        "saveWalkingLog",
        "sendSingleSession",
        "dataSet",
        "Lcom/google/android/gms/fitness/data/DataSet;",
        "SleepSession",
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

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->packageName:Ljava/lang/String;

    return-void
.end method

.method private final createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 2

    .line 202
    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    .line 203
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 204
    invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object p1

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setStreamName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 206
    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object p1

    .line 207
    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object p1

    const-string p2, "Builder()\n                .setAppPackageName(packageName)\n                .setDataType(dataType)\n                .setStreamName(\"${packageName} - $dataTag\")\n                .setType(DataSource.TYPE_RAW)\n                .build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic createDataSource$default(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;ILjava/lang/Object;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "unknown"

    .line 201
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$1txX5Ws1v829VXwa0Ig3-fbthKk(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-49$lambda-48$lambda-47(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$4ktu_tksw7s_HdsMEc5pUfJFFeg(ZLandroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-42(ZLandroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ARQyqm04in1o4zks6vXl05P0MNk(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDistanceData$lambda-23(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$CP2TM2RIZsPmmkF-6X_v-V1cnCs(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-43(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Cdy5-mTl1l_pJwCFlDhtdQQFln8(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud$lambda-31$lambda-30(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$E3H_wgeYDpuV-whodmvWskPU8Xo(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveStepsData$lambda-21(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$EH4jOZK0nBDYSqKQbWCO_PTNsz0(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDistanceData$lambda-24(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V

    return-void
.end method

.method public static synthetic lambda$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud$lambda-31(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$HdBdCPiUUXou8aet6dEAMaeDmRQ(Landroid/content/Context;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveRestingLog$lambda-33(Landroid/content/Context;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$IvEGMklUoaE3ef06nKt3-Ap8ktc(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveRestingLog$lambda-34(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$NdWzTKt39NEDQRmuD8aY7skPBZs(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-49$lambda-48$lambda-47$lambda-46(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4(Ljava/util/List;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepHeartRate$lambda-9(Ljava/util/List;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$SLnnyLOQkXoqzYu9dxH-X9AbadQ(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveStepsData$lambda-20(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V

    return-void
.end method

.method public static synthetic lambda$TGrVOeshyWbuMa2-m8Cy6r_c2os(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveWalkingLog$lambda-1(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$TzX32TQzwPsihFYWw4RbPl2udBg(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;Lcom/google/android/gms/fitness/data/DataSet;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepHeartRate$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;Lcom/google/android/gms/fitness/data/DataSet;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$USzNo8QI-Bg23oblKtCXsbfq1Kc(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveCaloriesData$lambda-15(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V

    return-void
.end method

.method public static synthetic lambda$VDPtf3I-7Rw01ZzzhUCXQ1hTI2w(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveHeartRate$lambda-5(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V

    return-void
.end method

.method public static synthetic lambda$XOgE9Af3WOX3F0Grn-eFZfu-2x8(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveWalkingLog$lambda-2(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Xh3QSRmSRIyF8Fy67JvI-05TL6k(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-38(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$YexJTsMG62bz4jOLlpmrNaFDFEA(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-49$lambda-48(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$a0Ej0qq-lYPW5bCAJGncIkiWzIY(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-44(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$a9zcI63tIz9xRHlBDezjhXY-FRk(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveStepsData$lambda-19(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$atBmwkPuSeYhcn9iU5JRyUI3chI(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->sendSingleSession$lambda-28$lambda-26(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic lambda$d937dLeo4lTI2bl7peTWNL2xEpQ(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud$lambda-31$lambda-29(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic lambda$dGu66lXxAzDE7nYM9pwbuHsigmc(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveWalkingLog$lambda-0(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$gjlLGZ-c94nN-QTp2PRwzqrLv6s(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveCaloriesData$lambda-16(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jGYHQgOt4L2T4jhvMPSg1Ug5fS4(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-49(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$lied0SMwSb1KrFYHPvHUH6NgoGU(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepHeartRate$lambda-10(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$mRPi8Q_p39ki-fGaDwzmgzKBpr8(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-39(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$nGae16WvMNURqbzoxQL9Gnkgyi4(Landroid/content/Context;Lcom/google/android/gms/fitness/data/DataSet;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->sendSingleSession$lambda-28(Landroid/content/Context;Lcom/google/android/gms/fitness/data/DataSet;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$oo6jWmbFKuOA7E_8AJQTCNlpOU4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveCaloriesData$lambda-14(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$pUPTiTa1BccvLAM49exbURaO_CQ(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog$lambda-49$lambda-48$lambda-47$lambda-45(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic lambda$qC2Bl_tB6LbW8r-gtTLaAc20Kzk(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveHeartRate$lambda-6(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$qm4G3kZeJ8hX7lShpDB85AjA-8Y(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepHeartRate$lambda-12(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sV4tRRrPl__b_73MffCodSOrqNk(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->sendSingleSession$lambda-28$lambda-27(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic lambda$uB1JUVbRoP6306Gx92Lv56ZO8pw(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveHeartRate$lambda-4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$z6W4Td40JBtDm5uWMHAdBQt73AU(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDistanceData$lambda-25(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method private final mapSleepTypeToFitSleepType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)I
    .locals 1

    .line 236
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 239
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/16 p1, 0x70

    goto :goto_1

    :cond_2
    const/16 p1, 0x6d

    goto :goto_1

    :cond_3
    const/16 p1, 0x6e

    :goto_1
    return p1
.end method

.method private final printData(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;)V"
        }
    .end annotation

    .line 43
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Preparing to save walking log list, size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final saveCaloriesData(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 103
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$oo6jWmbFKuOA7E_8AJQTCNlpOU4;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$oo6jWmbFKuOA7E_8AJQTCNlpOU4;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 114
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$USzNo8QI-Bg23oblKtCXsbfq1Kc;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$USzNo8QI-Bg23oblKtCXsbfq1Kc;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 115
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$gjlLGZ-c94nN-QTp2PRwzqrLv6s;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$gjlLGZ-c94nN-QTp2PRwzqrLv6s;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n            val dataSource = createDataSource(DataType.TYPE_CALORIES_EXPENDED, \"calories count\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_CALORIES, it.activeCalories * 1f / 1000)\n                        .build()\n            }\n\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving calories data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final saveCaloriesData$lambda-14(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->TYPE_CALORIES_EXPENDED:Lcom/google/android/gms/fitness/data/DataType;

    const-string v1, "TYPE_CALORIES_EXPENDED"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "calories count"

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object p0

    .line 106
    check-cast p1, Ljava/lang/Iterable;

    .line 367
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 368
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 369
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    .line 107
    invoke-static {p0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v2

    .line 108
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v3

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v2

    .line 109
    sget-object v3, Lcom/google/android/gms/fitness/data/Field;->FIELD_CALORIES:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getActiveCalories()I

    move-result v1

    int-to-float v1, v1

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float v1, v1, v4

    const/16 v4, 0x3e8

    int-to-float v4, v4

    div-float/2addr v1, v4

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 110
    invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 370
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 113
    new-instance p1, Lkotlin/Triple;

    invoke-direct {p1, p0, v0, p2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final saveCaloriesData$lambda-15(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Saving calories data"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final saveCaloriesData$lambda-16(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private final saveDataToCloud(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/fitness/data/DataPoint;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 179
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;

    invoke-direct {v0, p1, p2, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create { emitter ->\n            val dataSet = DataSet.builder(dataSource)\n                    .addAll(dataPointList)\n                    .build()\n\n            debug(\"Sending data to cloud: size - ${dataPointList.size}\")\n\n            Fitness.getHistoryClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                    .insertData(dataSet)\n                    .addOnSuccessListener {\n                        debug(\"Data saved to cloud\")\n                        emitter.onComplete()\n                    }\n                    .addOnFailureListener {\n                        error(\"Data save error\", it)\n                        it.printStackTrace()\n                        emitter.onComplete()\n                    }\n\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final saveDataToCloud$lambda-31(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;Lio/reactivex/CompletableEmitter;)V
    .locals 3

    const-string v0, "$dataSource"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataPointList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    invoke-static {p0}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object p0

    .line 181
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object p0

    .line 182
    invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object p0

    .line 184
    move-object v0, p2

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "Sending data to cloud: size - "

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 186
    invoke-static {p3}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p3, p1}, Lcom/google/android/gms/fitness/Fitness;->getHistoryClient(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/fitness/HistoryClient;

    move-result-object p1

    .line 187
    invoke-virtual {p1, p0}, Lcom/google/android/gms/fitness/HistoryClient;->insertData(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 188
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$d937dLeo4lTI2bl7peTWNL2xEpQ;

    invoke-direct {p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$d937dLeo4lTI2bl7peTWNL2xEpQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 192
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Cdy5-mTl1l_pJwCFlDhtdQQFln8;

    invoke-direct {p1, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Cdy5-mTl1l_pJwCFlDhtdQQFln8;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final saveDataToCloud$lambda-31$lambda-29(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$emitter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "Data saved to cloud"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p2, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 190
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final saveDataToCloud$lambda-31$lambda-30(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    move-object v3, p2

    check-cast v3, Ljava/lang/Throwable;

    const-string v2, "Data save error"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 194
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 195
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private final saveDistanceData(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 141
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$ARQyqm04in1o4zks6vXl05P0MNk;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$ARQyqm04in1o4zks6vXl05P0MNk;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 152
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$EH4jOZK0nBDYSqKQbWCO_PTNsz0;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$EH4jOZK0nBDYSqKQbWCO_PTNsz0;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 153
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$z6W4Td40JBtDm5uWMHAdBQt73AU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$z6W4Td40JBtDm5uWMHAdBQt73AU;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n            val dataSource = createDataSource(DataType.TYPE_DISTANCE_DELTA, \"walking distance\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_DISTANCE, it.distance.toFloat())\n                        .build()\n            }\n\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving distance data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final saveDistanceData$lambda-23(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->TYPE_DISTANCE_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    const-string v1, "TYPE_DISTANCE_DELTA"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "walking distance"

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object p0

    .line 144
    check-cast p1, Ljava/lang/Iterable;

    .line 380
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 381
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 382
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    .line 145
    invoke-static {p0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v2

    .line 146
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v3

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v2

    .line 147
    sget-object v3, Lcom/google/android/gms/fitness/data/Field;->FIELD_DISTANCE:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getDistance()D

    move-result-wide v4

    double-to-float v1, v4

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 148
    invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 383
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 151
    new-instance p1, Lkotlin/Triple;

    invoke-direct {p1, p0, v0, p2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final saveDistanceData$lambda-24(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Saving distance data"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final saveDistanceData$lambda-25(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private final saveHeartRate(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 54
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$uB1JUVbRoP6306Gx92Lv56ZO8pw;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$uB1JUVbRoP6306Gx92Lv56ZO8pw;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 66
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$VDPtf3I-7Rw01ZzzhUCXQ1hTI2w;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$VDPtf3I-7Rw01ZzzhUCXQ1hTI2w;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 67
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$qC2Bl_tB6LbW8r-gtTLaAc20Kzk;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$qC2Bl_tB6LbW8r-gtTLaAc20Kzk;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n\n            val dataSource = createDataSource(DataType.TYPE_HEART_RATE_BPM, \"walking heart rate\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_BPM, it.heartRate)\n                        .build()\n            }\n\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving heart rate data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final saveHeartRate$lambda-4(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->TYPE_HEART_RATE_BPM:Lcom/google/android/gms/fitness/data/DataType;

    const-string v1, "TYPE_HEART_RATE_BPM"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "walking heart rate"

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object p0

    .line 58
    check-cast p1, Ljava/lang/Iterable;

    .line 355
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 356
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 357
    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    .line 59
    invoke-static {p0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v2

    .line 60
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v3

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v2

    .line 61
    sget-object v3, Lcom/google/android/gms/fitness/data/Field;->FIELD_BPM:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getHeartRate()F

    move-result v1

    invoke-virtual {v2, v3, v1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 358
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 65
    new-instance p1, Lkotlin/Triple;

    invoke-direct {p1, p0, v0, p2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final saveHeartRate$lambda-5(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Saving heart rate data"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final saveHeartRate$lambda-6(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final saveRestingLog$lambda-33(Landroid/content/Context;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/SingleEmitter;)V
    .locals 9

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    new-instance v0, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    .line 215
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 216
    sget-object v1, Lcom/google/android/gms/fitness/data/DataType;->TYPE_HEART_RATE_BPM:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 217
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, " - step count"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setStreamName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 218
    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    .line 221
    check-cast p1, Ljava/lang/Iterable;

    .line 384
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 385
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 386
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;

    .line 222
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v3

    .line 223
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getStartTime()J

    move-result-wide v4

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getEndTime()J

    move-result-wide v6

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v3 .. v8}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v3

    .line 224
    sget-object v4, Lcom/google/android/gms/fitness/data/Field;->FIELD_BPM:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;->getHeartRate()F

    move-result v2

    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v2

    .line 225
    invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 387
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 227
    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "Sending resting data to FIT: size - "

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, p1, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 229
    new-instance p1, Lkotlin/Triple;

    invoke-direct {p1, v0, v1, p0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p1}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final saveRestingLog$lambda-34(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private final saveSingleLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveHeartRate(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object v0

    .line 48
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveStepsData(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 49
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDistanceData(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "saveHeartRate(logs, context)\n                .andThen(saveStepsData(logs, context))\n                .andThen(saveDistanceData(logs, context))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final saveSleepHeartRate(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 74
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;

    invoke-direct {v0, p1, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4;-><init>(Ljava/util/List;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 94
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$lied0SMwSb1KrFYHPvHUH6NgoGU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$lied0SMwSb1KrFYHPvHUH6NgoGU;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 95
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$qm4G3kZeJ8hX7lShpDB85AjA-8Y;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$qm4G3kZeJ8hX7lShpDB85AjA-8Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<Pair<List<DataSet>, Context>> { emitter ->\n\n            val list = logs\n                    .chunked(60)\n                    .map {singleList ->\n                        val dataSource = createDataSource(DataType.TYPE_HEART_RATE_BPM, \"sleeping heart rate\")\n\n                        val dataPointList = singleList.map {singleListItem ->\n                            DataPoint.builder(dataSource)\n                                    .setTimeInterval(singleListItem.startTime, singleListItem.endTime, TimeUnit.MILLISECONDS)\n                                    .setField(Field.FIELD_BPM, singleListItem.heartRate)\n                                    .build()\n                        }\n\n                        DataSet.builder(dataSource)\n                                .addAll(dataPointList)\n                                .build()\n                    }\n\n            emitter.onSuccess(Pair(list, context))\n        }.doOnSuccess { debug(\"Saving sleep log heart rate data\") }\n                .flatMapCompletable {pair ->\n                    Observable.fromIterable(pair.first)\n                            .concatMapCompletable { sendSingleSession(it, pair.second) }\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final saveSleepHeartRate$lambda-10(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Saving sleep log heart rate data"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final saveSleepHeartRate$lambda-12(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object v0

    .line 97
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$TzX32TQzwPsihFYWw4RbPl2udBg;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$TzX32TQzwPsihFYWw4RbPl2udBg;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final saveSleepHeartRate$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Pair;Lcom/google/android/gms/fitness/data/DataSet;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$pair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->sendSingleSession(Lcom/google/android/gms/fitness/data/DataSet;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final saveSleepHeartRate$lambda-9(Ljava/util/List;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/SingleEmitter;)V
    .locals 12

    const-string v0, "$logs"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0x3c

    .line 77
    invoke-static {p0, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 359
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 360
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 361
    check-cast v2, Ljava/util/List;

    .line 79
    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_HEART_RATE_BPM:Lcom/google/android/gms/fitness/data/DataType;

    const-string v4, "TYPE_HEART_RATE_BPM"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "sleeping heart rate"

    invoke-direct {p2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v3

    .line 81
    check-cast v2, Ljava/lang/Iterable;

    .line 362
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 363
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 364
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    .line 82
    invoke-static {v3}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v6

    .line 83
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v7

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v9

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v6

    .line 84
    sget-object v7, Lcom/google/android/gms/fitness/data/Field;->FIELD_BPM:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getHeartRate()F

    move-result v5

    invoke-virtual {v6, v7, v5}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;F)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v5

    .line 85
    invoke-virtual {v5}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 365
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 88
    invoke-static {v3}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v2

    .line 89
    check-cast v4, Ljava/lang/Iterable;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v2

    .line 90
    invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 366
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 93
    new-instance p0, Lkotlin/Pair;

    invoke-direct {p0, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic saveSleepingLog$default(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;ZILjava/lang/Object;)Lio/reactivex/Completable;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 245
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepingLog(Ljava/util/List;Landroid/content/Context;Z)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0
.end method

.method private static final saveSleepingLog$lambda-38(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Lio/reactivex/SingleEmitter;)V
    .locals 12

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .line 250
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "Received sleep entries, size: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 251
    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 389
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    .line 253
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v5

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    const-wide/32 v7, 0xea60

    cmp-long v9, v5, v7

    if-lez v9, :cond_2

    .line 258
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Creating new list: last - "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ", next - "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 261
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v5

    check-cast v11, Ljava/util/List;

    .line 262
    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    .line 390
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    .line 262
    invoke-interface {v11, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 264
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Creating session with: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ", size - "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 266
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v7

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v9

    move-object v6, v5

    invoke-direct/range {v6 .. v11}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;-><init>(JJLjava/util/List;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 273
    :cond_2
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 277
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    if-lt p0, v3, :cond_5

    .line 278
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    move-object v7, p0

    check-cast v7, Ljava/util/List;

    .line 279
    move-object p0, v1

    check-cast p0, Ljava/lang/Iterable;

    .line 393
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    .line 279
    invoke-interface {v7, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 281
    :cond_4
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v5

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;-><init>(JJLjava/util/List;)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    :cond_5
    invoke-interface {p2, v0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final saveSleepingLog$lambda-39(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Prepared sessions: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final saveSleepingLog$lambda-42(ZLandroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "$context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "this$0"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sleepSessions"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 291
    check-cast v2, Ljava/lang/Iterable;

    .line 395
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 396
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 397
    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;

    .line 292
    new-instance v6, Lcom/google/android/gms/fitness/data/Session$Builder;

    invoke-direct {v6}, Lcom/google/android/gms/fitness/data/Session$Builder;-><init>()V

    .line 293
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;->getStartTime()J

    move-result-wide v7

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v7, v8, v9}, Lcom/google/android/gms/fitness/data/Session$Builder;->setStartTime(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$Builder;

    move-result-object v6

    .line 294
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;->getEndTime()J

    move-result-wide v7

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v7, v8, v9}, Lcom/google/android/gms/fitness/data/Session$Builder;->setEndTime(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$Builder;

    move-result-object v6

    const-string v7, "sleep"

    .line 295
    invoke-virtual {v6, v7}, Lcom/google/android/gms/fitness/data/Session$Builder;->setActivity(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$Builder;

    move-result-object v6

    .line 296
    invoke-virtual {v6}, Lcom/google/android/gms/fitness/data/Session$Builder;->build()Lcom/google/android/gms/fitness/data/Session;

    move-result-object v6

    .line 297
    new-instance v7, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    invoke-direct {v7}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;-><init>()V

    .line 298
    invoke-virtual {v7, v6}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->setSession(Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    move-result-object v6

    if-eqz p0, :cond_1

    .line 302
    new-instance v7, Lcom/google/android/gms/fitness/data/DataSource$Builder;

    invoke-direct {v7}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V

    const/4 v8, 0x0

    .line 303
    invoke-virtual {v7, v8}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v7

    .line 304
    sget-object v8, Lcom/google/android/gms/fitness/data/DataType;->TYPE_ACTIVITY_SEGMENT:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v7, v8}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v7

    .line 305
    invoke-virtual {v7, v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setAppPackageName(Landroid/content/Context;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v7

    .line 307
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    const-string v9, " - sleep log"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setStreamName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;

    move-result-object v7

    .line 308
    invoke-virtual {v7}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v7

    .line 311
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;->getList()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 398
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .line 399
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 400
    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;

    .line 312
    invoke-static {v7}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v10

    .line 313
    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getStartTime()J

    move-result-wide v11

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getEndTime()J

    move-result-wide v13

    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v10 .. v15}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v10

    .line 314
    sget-object v11, Lcom/google/android/gms/fitness/data/Field;->FIELD_ACTIVITY:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;->getSleepType()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;

    move-result-object v9

    invoke-direct {v1, v9}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->mapSleepTypeToFitSleepType(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;)I

    move-result v9

    invoke-virtual {v10, v11, v9}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;I)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v9

    .line 315
    invoke-virtual {v9}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 401
    :cond_0
    check-cast v8, Ljava/util/List;

    .line 318
    invoke-static {v7}, Lcom/google/android/gms/fitness/data/DataSet;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v5

    check-cast v8, Ljava/lang/Iterable;

    invoke-virtual {v5, v8}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/fitness/data/DataSet$Builder;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/fitness/data/DataSet$Builder;->build()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v5

    .line 320
    invoke-virtual {v6, v5}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->addDataSet(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;

    .line 323
    :cond_1
    invoke-virtual {v6}, Lcom/google/android/gms/fitness/request/SessionInsertRequest$Builder;->build()Lcom/google/android/gms/fitness/request/SessionInsertRequest;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 402
    :cond_2
    check-cast v3, Ljava/util/List;

    return-object v3
.end method

.method private static final saveSleepingLog$lambda-43(Ljava/lang/Throwable;)V
    .locals 0

    .line 328
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final saveSleepingLog$lambda-44(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 331
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "Prepared requests, size: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final saveSleepingLog$lambda-49(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p2

    .line 335
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$YexJTsMG62bz4jOLlpmrNaFDFEA;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$YexJTsMG62bz4jOLlpmrNaFDFEA;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final saveSleepingLog$lambda-49$lambda-48(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;

    invoke-direct {v0, p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk;-><init>(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final saveSleepingLog$lambda-49$lambda-48$lambda-47(Landroid/content/Context;Lcom/google/android/gms/fitness/request/SessionInsertRequest;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sessionRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/fitness/Fitness;->getSessionsClient(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/fitness/SessionsClient;

    move-result-object p0

    .line 338
    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/SessionsClient;->insertSession(Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 339
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ;

    invoke-direct {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 343
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$NdWzTKt39NEDQRmuD8aY7skPBZs;

    invoke-direct {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$NdWzTKt39NEDQRmuD8aY7skPBZs;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final saveSleepingLog$lambda-49$lambda-48$lambda-47$lambda-45(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$emitter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "Session sleep data saved to cloud"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p2, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 341
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final saveSleepingLog$lambda-49$lambda-48$lambda-47$lambda-46(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    move-object v3, p2

    check-cast v3, Ljava/lang/Throwable;

    const-string v2, "Session sleep data save error"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 345
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 346
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private final saveStepsData(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    .line 122
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$a9zcI63tIz9xRHlBDezjhXY-FRk;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$a9zcI63tIz9xRHlBDezjhXY-FRk;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 134
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$SLnnyLOQkXoqzYu9dxH-X9AbadQ;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$SLnnyLOQkXoqzYu9dxH-X9AbadQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    .line 135
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$E3H_wgeYDpuV-whodmvWskPU8Xo;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$E3H_wgeYDpuV-whodmvWskPU8Xo;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n            val dataSource = createDataSource(DataType.TYPE_STEP_COUNT_DELTA, \"step count\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_STEPS, it.steps)\n                        .build()\n            }\n\n            debug(\"Saving steps data, total: ${logs.sumBy { it.steps }}\")\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving steps data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final saveStepsData$lambda-19(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;Landroid/content/Context;Lio/reactivex/SingleEmitter;)V
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->TYPE_STEP_COUNT_DELTA:Lcom/google/android/gms/fitness/data/DataType;

    const-string v1, "TYPE_STEP_COUNT_DELTA"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "step count"

    invoke-direct {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->createDataSource(Lcom/google/android/gms/fitness/data/DataType;Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    .line 125
    check-cast p1, Ljava/lang/Iterable;

    .line 371
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 372
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 373
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    .line 126
    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataPoint;->builder(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v4

    .line 127
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getStartTime()J

    move-result-wide v5

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getEndTime()J

    move-result-wide v7

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setTimeInterval(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v4

    .line 128
    sget-object v5, Lcom/google/android/gms/fitness/data/Field;->FIELD_STEPS:Lcom/google/android/gms/fitness/data/Field;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v3

    invoke-virtual {v4, v5, v3}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->setField(Lcom/google/android/gms/fitness/data/Field;I)Lcom/google/android/gms/fitness/data/DataPoint$Builder;

    move-result-object v3

    .line 129
    invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataPoint$Builder;->build()Lcom/google/android/gms/fitness/data/DataPoint;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 374
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 132
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v2, 0x0

    .line 376
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 377
    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;

    .line 132
    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;->getSteps()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_1

    .line 379
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "Saving steps data, total: "

    .line 132
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, p1, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 133
    new-instance p0, Lkotlin/Triple;

    invoke-direct {p0, v0, v1, p2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p3, p0}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final saveStepsData$lambda-20(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Saving steps data"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final saveStepsData$lambda-21(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lkotlin/Triple;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-direct {p0, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveDataToCloud(Lcom/google/android/gms/fitness/data/DataSource;Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final saveWalkingLog$lambda-0(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 32
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->printData(Ljava/util/List;)V

    return-void
.end method

.method private static final saveWalkingLog$lambda-1(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;Ljava/util/List;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSingleLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final saveWalkingLog$lambda-2(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Error in save walking log"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final sendSingleSession(Lcom/google/android/gms/fitness/data/DataSet;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1

    .line 161
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$nGae16WvMNURqbzoxQL9Gnkgyi4;

    invoke-direct {v0, p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$nGae16WvMNURqbzoxQL9Gnkgyi4;-><init>(Landroid/content/Context;Lcom/google/android/gms/fitness/data/DataSet;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create { emitter ->\n\n            Fitness.getHistoryClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                    .insertData(dataSet)\n                    .addOnSuccessListener {\n                        debug(\"Sleep heart rate data saved to cloud\")\n                        emitter.onComplete()\n                    }\n                    .addOnFailureListener {\n                        error(\"Sleep heart rate data save error\", it)\n                        it.printStackTrace()\n                        emitter.onComplete()\n                    }\n\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final sendSingleSession$lambda-28(Landroid/content/Context;Lcom/google/android/gms/fitness/data/DataSet;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dataSet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getLastSignedInAccount(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lcom/google/android/gms/fitness/Fitness;->getHistoryClient(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/google/android/gms/fitness/HistoryClient;

    move-result-object p0

    .line 164
    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/HistoryClient;->insertData(Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 165
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$atBmwkPuSeYhcn9iU5JRyUI3chI;

    invoke-direct {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$atBmwkPuSeYhcn9iU5JRyUI3chI;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    .line 169
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$sV4tRRrPl__b_73MffCodSOrqNk;

    invoke-direct {p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$sV4tRRrPl__b_73MffCodSOrqNk;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private static final sendSingleSession$lambda-28$lambda-26(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Void;)V
    .locals 2

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$emitter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p2, "Sleep heart rate data saved to cloud"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p2, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 167
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final sendSingleSession$lambda-28$lambda-27(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Lio/reactivex/CompletableEmitter;Ljava/lang/Exception;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    move-object v3, p2

    check-cast v3, Ljava/lang/Throwable;

    const-string v2, "Sleep heart rate data save error"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 171
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 172
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 26
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final saveRestingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$HdBdCPiUUXou8aet6dEAMaeDmRQ;

    invoke-direct {v0, p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$HdBdCPiUUXou8aet6dEAMaeDmRQ;-><init>(Landroid/content/Context;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 230
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$IvEGMklUoaE3ef06nKt3-Ap8ktc;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$IvEGMklUoaE3ef06nKt3-Ap8ktc;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<Triple<DataSource, List<DataPoint>, Context>> {\n\n            val dataSource = DataSource.Builder()\n                    .setAppPackageName(context.packageName)\n                    .setDataType(DataType.TYPE_HEART_RATE_BPM)\n                    .setStreamName(context.packageName + \" - step count\")\n                    .setType(DataSource.TYPE_RAW)\n                    .build()\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_BPM, it.heartRate)\n                        .build()\n            }\n            debug(\"Sending resting data to FIT: size - ${list.size}\")\n\n            it.onSuccess(Triple(dataSource, list, context))\n        }.flatMapCompletable {\n            saveDataToCloud(it.first, it.second, it.third)\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final saveSleepingLog(Ljava/util/List;Landroid/content/Context;Z)Lio/reactivex/Completable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;",
            ">;",
            "Landroid/content/Context;",
            "Z)",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Xh3QSRmSRIyF8Fy67JvI-05TL6k;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$Xh3QSRmSRIyF8Fy67JvI-05TL6k;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object v0

    .line 287
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$mRPi8Q_p39ki-fGaDwzmgzKBpr8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$mRPi8Q_p39ki-fGaDwzmgzKBpr8;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    .line 290
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;

    invoke-direct {v1, p3, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg;-><init>(ZLandroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p3

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$CP2TM2RIZsPmmkF-6X_v-V1cnCs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$CP2TM2RIZsPmmkF-6X_v-V1cnCs;

    .line 327
    invoke-virtual {p3, v0}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p3

    .line 330
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$a0Ej0qq-lYPW5bCAJGncIkiWzIY;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$a0Ej0qq-lYPW5bCAJGncIkiWzIY;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p3, v0}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p3

    .line 333
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4;

    invoke-direct {v0, p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p3, v0}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p3

    .line 352
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;->saveSleepHeartRate(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    invoke-virtual {p3, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "create<List<SleepSession>> {\n\n            val sessions = mutableListOf<SleepSession>()\n\n            debug(\"Received sleep entries, size: ${logs.size}\")\n            val resultList = logs.fold(mutableListOf<SleepLog>()) { list, next ->\n                //ako je lista prazna, dodaj element\n                if (list.isEmpty()) list.add(next)\n\n                //ako je razlika poslednjeg elementa u listi i sledeceg veca od 3 sata\n                if (abs(list.last().endTime - next.startTime) > 60 * 1000L) {\n\n                    debug(\"Creating new list: last - ${list.last().endTime}, next - ${next.startTime}\")\n\n                    //iskopiraj sve iz liste u novu listu\n                    val newList = mutableListOf<SleepLog>()\n                    list.forEach { sleep -> newList.add(sleep) }\n\n                    debug(\"Creating session with: ${list.first().startTime} : ${list.last().endTime}, size - ${newList.size}\")\n                    //napravi novu Sleep sesiju, sa upravo-kreiranim elementima\n                    sessions.add(SleepSession(list.first().startTime, list.last().endTime, newList))\n\n                    //obrisi listu da skupljamo nove logove\n                    list.clear()\n                }\n\n                //na kraju dodaj sledeci element u listu\n                list.add(next)\n                list\n            }\n\n            if (resultList.size >= 2) {\n                val newList = mutableListOf<SleepLog>()\n                resultList.forEach { sleep -> newList.add(sleep) }\n\n                sessions.add(SleepSession(resultList.first().startTime, resultList.last().endTime, newList))\n\n            }\n\n            it.onSuccess(sessions)\n        }\n                .doOnSuccess {\n                    debug(\"Prepared sessions: ${it.size}\")\n                }\n                .map { sleepSessions ->\n                    sleepSessions.map { singleSession ->\n                        val session = Session.Builder()\n                                .setStartTime(singleSession.startTime, TimeUnit.MILLISECONDS)\n                                .setEndTime(singleSession.endTime, TimeUnit.MILLISECONDS)\n                                .setActivity(FitnessActivities.SLEEP)\n                                .build()\n                        val sessionBuilder = SessionInsertRequest.Builder()\n                                .setSession(session)\n\n                        if (useGranularData) {\n\n                            val dataSource = DataSource.Builder()\n                                    .setType(DataSource.TYPE_RAW)\n                                    .setDataType(DataType.TYPE_ACTIVITY_SEGMENT)\n                                    .setAppPackageName(context)\n                                    // Optional but recommended for identifying the stream if you have multiple streams with the same dataType.\n                                    .setStreamName(context.packageName + \" - sleep log\")\n                                    .build()\n\n\n                            val dataPoints = singleSession.list.map {\n                                DataPoint.builder(dataSource)\n                                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                                        .setField(FIELD_ACTIVITY, mapSleepTypeToFitSleepType(it.sleepType))\n                                        .build()\n                            }\n\n                            val dataSet = DataSet.builder(dataSource).addAll(dataPoints).build()\n\n                            sessionBuilder.addDataSet(dataSet)\n                        }\n\n                        sessionBuilder.build()\n\n                    }\n                }\n                .doOnError {\n                    it.printStackTrace()\n                }\n                .doOnSuccess {\n                    debug(\"Prepared requests, size: ${it.size}\")\n                }\n                .flatMapCompletable {\n                    Observable.fromIterable(it)\n                            .concatMapCompletable { sessionRequest ->\n                                Completable.create { emitter ->\n                                    Fitness.getSessionsClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                                            .insertSession(sessionRequest)\n                                            .addOnSuccessListener {\n                                                debug(\"Session sleep data saved to cloud\")\n                                                emitter.onComplete()\n                                            }\n                                            .addOnFailureListener {\n                                                error(\"Session sleep data save error\", it)\n                                                it.printStackTrace()\n                                                emitter.onComplete()\n                                            }\n                                }\n\n                            }\n                }\n                .andThen(saveSleepHeartRate(logs, context))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final saveWalkingLog(Ljava/util/List;Landroid/content/Context;)Lio/reactivex/Completable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lio/reactivex/Completable;"
        }
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0x1f4

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$dGu66lXxAzDE7nYM9pwbuHsigmc;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$dGu66lXxAzDE7nYM9pwbuHsigmc;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 33
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$TGrVOeshyWbuMa2-m8Cy6r_c2os;

    invoke-direct {v0, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$TGrVOeshyWbuMa2-m8Cy6r_c2os;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->concatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 36
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$XOgE9Af3WOX3F0Grn-eFZfu-2x8;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/googlefit/-$$Lambda$GoogleFitDataWriter$XOgE9Af3WOX3F0Grn-eFZfu-2x8;-><init>(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    const-string p2, "fromIterable(logs.chunked(500))\n                .doOnNext { printData(it) }\n                .concatMapCompletable {\n                    saveSingleLog(it, context)\n                }\n                .doOnError {\n                    it.printStackTrace()\n                    error(\"Error in save walking log\", it)\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
