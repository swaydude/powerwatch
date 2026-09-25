package powerwatch.matrix.com.pwgen2android.googlefit;

/* JADX INFO: compiled from: GoogleFitDataWriter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u001e\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J&\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\u001d\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\u001e\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001c\u0010\u001f\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u001e\u0010!\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\"\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J&\u0010$\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020#0\u00142\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&J\u001e\u0010'\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001c\u0010(\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "packageName", "", "kotlin.jvm.PlatformType", "createDataSource", "Lcom/google/android/gms/fitness/data/DataSource;", "dataType", "Lcom/google/android/gms/fitness/data/DataType;", "dataTag", "mapSleepTypeToFitSleepType", "", "sleepType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "printData", "", "it", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "saveCaloriesData", "Lio/reactivex/Completable;", "logs", "saveDataToCloud", "dataSource", "dataPointList", "Lcom/google/android/gms/fitness/data/DataPoint;", "saveDistanceData", "saveHeartRate", "saveRestingLog", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/RestingLog;", "saveSingleLog", "saveSleepHeartRate", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "saveSleepingLog", "useGranularData", "", "saveStepsData", "saveWalkingLog", "sendSingleSession", "dataSet", "Lcom/google/android/gms/fitness/data/DataSet;", "SleepSession", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoogleFitDataWriter implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.lang.String packageName;

    /* JADX INFO: compiled from: GoogleFitDataWriter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.DEEP.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.LIGHT.ordinal()] = 2;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE.ordinal()] = 3;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.RESTLESS.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GoogleFitDataWriter(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.packageName = context.getPackageName();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final io.reactivex.Completable saveWalkingLog(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Completable completableDoOnError = io.reactivex.Observable.fromIterable(kotlin.collections.CollectionsKt.chunked(logs, com.baidu.mapapi.UIMsg.d_ResultType.SHORT_URL)).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$dGu66lXxAzDE7nYM9pwbuHsigmc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1494saveWalkingLog$lambda0(this.f$0, (java.util.List) obj);
            }
        }).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$TGrVOeshyWbuMa2-m8Cy6r_c2os
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1495saveWalkingLog$lambda1(this.f$0, context, (java.util.List) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$XOgE9Af3WOX3F0Grn-eFZfu-2x8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1496saveWalkingLog$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnError, "fromIterable(logs.chunked(500))\n                .doOnNext { printData(it) }\n                .concatMapCompletable {\n                    saveSingleLog(it, context)\n                }\n                .doOnError {\n                    it.printStackTrace()\n                    error(\"Error in save walking log\", it)\n                }");
        return completableDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveWalkingLog$lambda-0, reason: not valid java name */
    public static final void m1494saveWalkingLog$lambda0(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.printData(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveWalkingLog$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1495saveWalkingLog$lambda1(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, android.content.Context context, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.saveSingleLog(it, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveWalkingLog$lambda-2, reason: not valid java name */
    public static final void m1496saveWalkingLog$lambda2(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        th.printStackTrace();
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error in save walking log", th, null, 4, null);
    }

    private final void printData(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> it) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Preparing to save walking log list, size: " + it.size() + ' ', null, 2, null);
    }

    private final io.reactivex.Completable saveSingleLog(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs, android.content.Context context) {
        io.reactivex.Completable completableAndThen = saveHeartRate(logs, context).andThen(saveStepsData(logs, context)).andThen(saveDistanceData(logs, context));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "saveHeartRate(logs, context)\n                .andThen(saveStepsData(logs, context))\n                .andThen(saveDistanceData(logs, context))");
        return completableAndThen;
    }

    private final io.reactivex.Completable saveHeartRate(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs, final android.content.Context context) {
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$uB1JUVbRoP6306Gx92Lv56ZO8pw
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1472saveHeartRate$lambda4(this.f$0, logs, context, singleEmitter);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$VDPtf3I-7Rw01ZzzhUCXQ1hTI2w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1473saveHeartRate$lambda5(this.f$0, (kotlin.Triple) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$qC2Bl_tB6LbW8r-gtTLaAc20Kzk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1474saveHeartRate$lambda6(this.f$0, (kotlin.Triple) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n\n            val dataSource = createDataSource(DataType.TYPE_HEART_RATE_BPM, \"walking heart rate\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_BPM, it.heartRate)\n                        .build()\n            }\n\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving heart rate data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveHeartRate$lambda-4, reason: not valid java name */
    public static final void m1472saveHeartRate$lambda4(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List logs, android.content.Context context, io.reactivex.SingleEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.fitness.data.DataType TYPE_HEART_RATE_BPM = com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
        com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = this$0.createDataSource(TYPE_HEART_RATE_BPM, "walking heart rate");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog : list) {
            arrayList.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(walkingLog.getStartTime(), walkingLog.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_BPM, walkingLog.getHeartRate()).build());
        }
        emitter.onSuccess(new kotlin.Triple(dataSourceCreateDataSource, arrayList, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveHeartRate$lambda-5, reason: not valid java name */
    public static final void m1473saveHeartRate$lambda5(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple triple) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Saving heart rate data", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveHeartRate$lambda-6, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1474saveHeartRate$lambda6(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.saveDataToCloud((com.google.android.gms.fitness.data.DataSource) it.getFirst(), (java.util.List) it.getSecond(), (android.content.Context) it.getThird());
    }

    private final io.reactivex.Completable saveSleepHeartRate(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> logs, final android.content.Context context) {
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$OZ6m87_o0ZMKFD5X9KRE9AzQsJ4
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1480saveSleepHeartRate$lambda9(logs, context, this, singleEmitter);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$lied0SMwSb1KrFYHPvHUH6NgoGU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1477saveSleepHeartRate$lambda10(this.f$0, (kotlin.Pair) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$qm4G3kZeJ8hX7lShpDB85AjA-8Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1478saveSleepHeartRate$lambda12(this.f$0, (kotlin.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<Pair<List<DataSet>, Context>> { emitter ->\n\n            val list = logs\n                    .chunked(60)\n                    .map {singleList ->\n                        val dataSource = createDataSource(DataType.TYPE_HEART_RATE_BPM, \"sleeping heart rate\")\n\n                        val dataPointList = singleList.map {singleListItem ->\n                            DataPoint.builder(dataSource)\n                                    .setTimeInterval(singleListItem.startTime, singleListItem.endTime, TimeUnit.MILLISECONDS)\n                                    .setField(Field.FIELD_BPM, singleListItem.heartRate)\n                                    .build()\n                        }\n\n                        DataSet.builder(dataSource)\n                                .addAll(dataPointList)\n                                .build()\n                    }\n\n            emitter.onSuccess(Pair(list, context))\n        }.doOnSuccess { debug(\"Saving sleep log heart rate data\") }\n                .flatMapCompletable {pair ->\n                    Observable.fromIterable(pair.first)\n                            .concatMapCompletable { sendSingleSession(it, pair.second) }\n                }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepHeartRate$lambda-9, reason: not valid java name */
    public static final void m1480saveSleepHeartRate$lambda9(java.util.List logs, android.content.Context context, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.SingleEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        java.util.List<java.util.List> listChunked = kotlin.collections.CollectionsKt.chunked(logs, 60);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        for (java.util.List list : listChunked) {
            com.google.android.gms.fitness.data.DataType TYPE_HEART_RATE_BPM = com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
            com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = this$0.createDataSource(TYPE_HEART_RATE_BPM, "sleeping heart rate");
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> list2 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog sleepLog : list2) {
                arrayList2.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(sleepLog.getStartTime(), sleepLog.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_BPM, sleepLog.getHeartRate()).build());
            }
            arrayList.add(com.google.android.gms.fitness.data.DataSet.builder(dataSourceCreateDataSource).addAll(arrayList2).build());
        }
        emitter.onSuccess(new kotlin.Pair(arrayList, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepHeartRate$lambda-10, reason: not valid java name */
    public static final void m1477saveSleepHeartRate$lambda10(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Saving sleep log heart rate data", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepHeartRate$lambda-12, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1478saveSleepHeartRate$lambda12(final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, final kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "pair");
        return io.reactivex.Observable.fromIterable((java.lang.Iterable) pair.getFirst()).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$TzX32TQzwPsihFYWw4RbPl2udBg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1479saveSleepHeartRate$lambda12$lambda11(this.f$0, pair, (com.google.android.gms.fitness.data.DataSet) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepHeartRate$lambda-12$lambda-11, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1479saveSleepHeartRate$lambda12$lambda11(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Pair pair, com.google.android.gms.fitness.data.DataSet it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "$pair");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.sendSingleSession(it, (android.content.Context) pair.getSecond());
    }

    private final io.reactivex.Completable saveCaloriesData(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs, final android.content.Context context) {
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$oo6jWmbFKuOA7E_8AJQTCNlpOU4
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1463saveCaloriesData$lambda14(this.f$0, logs, context, singleEmitter);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$USzNo8QI-Bg23oblKtCXsbfq1Kc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1464saveCaloriesData$lambda15(this.f$0, (kotlin.Triple) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$gjlLGZ-c94nN-QTp2PRwzqrLv6s
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1465saveCaloriesData$lambda16(this.f$0, (kotlin.Triple) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n            val dataSource = createDataSource(DataType.TYPE_CALORIES_EXPENDED, \"calories count\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_CALORIES, it.activeCalories * 1f / 1000)\n                        .build()\n            }\n\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving calories data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveCaloriesData$lambda-14, reason: not valid java name */
    public static final void m1463saveCaloriesData$lambda14(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List logs, android.content.Context context, io.reactivex.SingleEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.fitness.data.DataType TYPE_CALORIES_EXPENDED = com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
        com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = this$0.createDataSource(TYPE_CALORIES_EXPENDED, "calories count");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog : list) {
            arrayList.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(walkingLog.getStartTime(), walkingLog.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_CALORIES, (walkingLog.getActiveCalories() * 1.0f) / 1000).build());
        }
        emitter.onSuccess(new kotlin.Triple(dataSourceCreateDataSource, arrayList, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveCaloriesData$lambda-15, reason: not valid java name */
    public static final void m1464saveCaloriesData$lambda15(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple triple) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Saving calories data", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveCaloriesData$lambda-16, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1465saveCaloriesData$lambda16(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.saveDataToCloud((com.google.android.gms.fitness.data.DataSource) it.getFirst(), (java.util.List) it.getSecond(), (android.content.Context) it.getThird());
    }

    private final io.reactivex.Completable saveStepsData(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs, final android.content.Context context) {
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$a9zcI63tIz9xRHlBDezjhXY-FRk
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1491saveStepsData$lambda19(this.f$0, logs, context, singleEmitter);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$SLnnyLOQkXoqzYu9dxH-X9AbadQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1492saveStepsData$lambda20(this.f$0, (kotlin.Triple) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$E3H_wgeYDpuV-whodmvWskPU8Xo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1493saveStepsData$lambda21(this.f$0, (kotlin.Triple) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n            val dataSource = createDataSource(DataType.TYPE_STEP_COUNT_DELTA, \"step count\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_STEPS, it.steps)\n                        .build()\n            }\n\n            debug(\"Saving steps data, total: ${logs.sumBy { it.steps }}\")\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving steps data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveStepsData$lambda-19, reason: not valid java name */
    public static final void m1491saveStepsData$lambda19(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List logs, android.content.Context context, io.reactivex.SingleEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_DELTA = com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
        com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = this$0.createDataSource(TYPE_STEP_COUNT_DELTA, "step count");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog : list) {
            arrayList.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(walkingLog.getStartTime(), walkingLog.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_STEPS, walkingLog.getSteps()).build());
        }
        java.util.ArrayList arrayList2 = arrayList;
        powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter googleFitDataWriter = this$0;
        int steps = 0;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            steps += ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog) it.next()).getSteps();
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(googleFitDataWriter, kotlin.jvm.internal.Intrinsics.stringPlus("Saving steps data, total: ", java.lang.Integer.valueOf(steps)), null, 2, null);
        emitter.onSuccess(new kotlin.Triple(dataSourceCreateDataSource, arrayList2, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveStepsData$lambda-20, reason: not valid java name */
    public static final void m1492saveStepsData$lambda20(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple triple) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Saving steps data", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveStepsData$lambda-21, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1493saveStepsData$lambda21(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.saveDataToCloud((com.google.android.gms.fitness.data.DataSource) it.getFirst(), (java.util.List) it.getSecond(), (android.content.Context) it.getThird());
    }

    private final io.reactivex.Completable saveDistanceData(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> logs, final android.content.Context context) {
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$ARQyqm04in1o4zks6vXl05P0MNk
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1469saveDistanceData$lambda23(this.f$0, logs, context, singleEmitter);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$EH4jOZK0nBDYSqKQbWCO_PTNsz0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1470saveDistanceData$lambda24(this.f$0, (kotlin.Triple) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$z6W4Td40JBtDm5uWMHAdBQt73AU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1471saveDistanceData$lambda25(this.f$0, (kotlin.Triple) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<Triple<DataSource, List<DataPoint>, Context>> { emitter ->\n            val dataSource = createDataSource(DataType.TYPE_DISTANCE_DELTA, \"walking distance\")\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_DISTANCE, it.distance.toFloat())\n                        .build()\n            }\n\n            emitter.onSuccess(Triple(dataSource, list, context))\n        }.doOnSuccess { debug(\"Saving distance data\") }\n                .flatMapCompletable {\n                    saveDataToCloud(it.first, it.second, it.third)\n                }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveDistanceData$lambda-23, reason: not valid java name */
    public static final void m1469saveDistanceData$lambda23(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List logs, android.content.Context context, io.reactivex.SingleEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.fitness.data.DataType TYPE_DISTANCE_DELTA = com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
        com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = this$0.createDataSource(TYPE_DISTANCE_DELTA, "walking distance");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog : list) {
            arrayList.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(walkingLog.getStartTime(), walkingLog.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_DISTANCE, (float) walkingLog.getDistance()).build());
        }
        emitter.onSuccess(new kotlin.Triple(dataSourceCreateDataSource, arrayList, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveDistanceData$lambda-24, reason: not valid java name */
    public static final void m1470saveDistanceData$lambda24(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple triple) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Saving distance data", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveDistanceData$lambda-25, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1471saveDistanceData$lambda25(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.saveDataToCloud((com.google.android.gms.fitness.data.DataSource) it.getFirst(), (java.util.List) it.getSecond(), (android.content.Context) it.getThird());
    }

    private final io.reactivex.Completable sendSingleSession(final com.google.android.gms.fitness.data.DataSet dataSet, final android.content.Context context) {
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$nGae16WvMNURqbzoxQL9Gnkgyi4
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1497sendSingleSession$lambda28(context, dataSet, this, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create { emitter ->\n\n            Fitness.getHistoryClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                    .insertData(dataSet)\n                    .addOnSuccessListener {\n                        debug(\"Sleep heart rate data saved to cloud\")\n                        emitter.onComplete()\n                    }\n                    .addOnFailureListener {\n                        error(\"Sleep heart rate data save error\", it)\n                        it.printStackTrace()\n                        emitter.onComplete()\n                    }\n\n        }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleSession$lambda-28, reason: not valid java name */
    public static final void m1497sendSingleSession$lambda28(android.content.Context context, com.google.android.gms.fitness.data.DataSet dataSet, final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, final io.reactivex.CompletableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSet, "$dataSet");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(context);
        kotlin.jvm.internal.Intrinsics.checkNotNull(lastSignedInAccount);
        com.google.android.gms.fitness.Fitness.getHistoryClient(context, lastSignedInAccount).insertData(dataSet).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$atBmwkPuSeYhcn9iU5JRyUI3chI
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1498sendSingleSession$lambda28$lambda26(this.f$0, emitter, (java.lang.Void) obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$sV4tRRrPl__b_73MffCodSOrqNk
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1499sendSingleSession$lambda28$lambda27(this.f$0, emitter, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleSession$lambda-28$lambda-26, reason: not valid java name */
    public static final void m1498sendSingleSession$lambda28$lambda26(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Void r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Sleep heart rate data saved to cloud", null, 2, null);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleSession$lambda-28$lambda-27, reason: not valid java name */
    public static final void m1499sendSingleSession$lambda28$lambda27(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Exception it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Sleep heart rate data save error", it, null, 4, null);
        it.printStackTrace();
        emitter.onComplete();
    }

    private final io.reactivex.Completable saveDataToCloud(final com.google.android.gms.fitness.data.DataSource dataSource, final java.util.List<com.google.android.gms.fitness.data.DataPoint> dataPointList, final android.content.Context context) {
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$Ft2SWIPZ3_dZcH1UIS1mLr-l4Eg
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1466saveDataToCloud$lambda31(dataSource, dataPointList, this, context, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create { emitter ->\n            val dataSet = DataSet.builder(dataSource)\n                    .addAll(dataPointList)\n                    .build()\n\n            debug(\"Sending data to cloud: size - ${dataPointList.size}\")\n\n            Fitness.getHistoryClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                    .insertData(dataSet)\n                    .addOnSuccessListener {\n                        debug(\"Data saved to cloud\")\n                        emitter.onComplete()\n                    }\n                    .addOnFailureListener {\n                        error(\"Data save error\", it)\n                        it.printStackTrace()\n                        emitter.onComplete()\n                    }\n\n        }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveDataToCloud$lambda-31, reason: not valid java name */
    public static final void m1466saveDataToCloud$lambda31(com.google.android.gms.fitness.data.DataSource dataSource, java.util.List dataPointList, final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, android.content.Context context, final io.reactivex.CompletableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataSource, "$dataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPointList, "$dataPointList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.fitness.data.DataSet dataSetBuild = com.google.android.gms.fitness.data.DataSet.builder(dataSource).addAll(dataPointList).build();
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Sending data to cloud: size - ", java.lang.Integer.valueOf(dataPointList.size())), null, 2, null);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(context);
        kotlin.jvm.internal.Intrinsics.checkNotNull(lastSignedInAccount);
        com.google.android.gms.fitness.Fitness.getHistoryClient(context, lastSignedInAccount).insertData(dataSetBuild).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$d937dLeo4lTI2bl7peTWNL2xEpQ
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1467saveDataToCloud$lambda31$lambda29(this.f$0, emitter, (java.lang.Void) obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$Cdy5-mTl1l_pJwCFlDhtdQQFln8
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1468saveDataToCloud$lambda31$lambda30(this.f$0, emitter, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveDataToCloud$lambda-31$lambda-29, reason: not valid java name */
    public static final void m1467saveDataToCloud$lambda31$lambda29(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Void r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Data saved to cloud", null, 2, null);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveDataToCloud$lambda-31$lambda-30, reason: not valid java name */
    public static final void m1468saveDataToCloud$lambda31$lambda30(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Exception it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Data save error", it, null, 4, null);
        it.printStackTrace();
        emitter.onComplete();
    }

    static /* synthetic */ com.google.android.gms.fitness.data.DataSource createDataSource$default(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter googleFitDataWriter, com.google.android.gms.fitness.data.DataType dataType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "unknown";
        }
        return googleFitDataWriter.createDataSource(dataType, str);
    }

    private final com.google.android.gms.fitness.data.DataSource createDataSource(com.google.android.gms.fitness.data.DataType dataType, java.lang.String dataTag) {
        com.google.android.gms.fitness.data.DataSource dataSourceBuild = new com.google.android.gms.fitness.data.DataSource.Builder().setAppPackageName(this.packageName).setDataType(dataType).setStreamName(((java.lang.Object) this.packageName) + " - " + dataTag).setType(0).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSourceBuild, "Builder()\n                .setAppPackageName(packageName)\n                .setDataType(dataType)\n                .setStreamName(\"${packageName} - $dataTag\")\n                .setType(DataSource.TYPE_RAW)\n                .build()");
        return dataSourceBuild;
    }

    public final io.reactivex.Completable saveRestingLog(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> logs, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$HdBdCPiUUXou8aet6dEAMaeDmRQ
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1475saveRestingLog$lambda33(context, logs, this, singleEmitter);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$IvEGMklUoaE3ef06nKt3-Ap8ktc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1476saveRestingLog$lambda34(this.f$0, (kotlin.Triple) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "create<Triple<DataSource, List<DataPoint>, Context>> {\n\n            val dataSource = DataSource.Builder()\n                    .setAppPackageName(context.packageName)\n                    .setDataType(DataType.TYPE_HEART_RATE_BPM)\n                    .setStreamName(context.packageName + \" - step count\")\n                    .setType(DataSource.TYPE_RAW)\n                    .build()\n\n            val list = logs.map {\n                DataPoint.builder(dataSource)\n                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                        .setField(Field.FIELD_BPM, it.heartRate)\n                        .build()\n            }\n            debug(\"Sending resting data to FIT: size - ${list.size}\")\n\n            it.onSuccess(Triple(dataSource, list, context))\n        }.flatMapCompletable {\n            saveDataToCloud(it.first, it.second, it.third)\n        }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveRestingLog$lambda-33, reason: not valid java name */
    public static final void m1475saveRestingLog$lambda33(android.content.Context context, java.util.List logs, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.google.android.gms.fitness.data.DataSource dataSourceBuild = new com.google.android.gms.fitness.data.DataSource.Builder().setAppPackageName(context.getPackageName()).setDataType(com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM).setStreamName(kotlin.jvm.internal.Intrinsics.stringPlus(context.getPackageName(), " - step count")).setType(0).build();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> list = logs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog restingLog : list) {
            arrayList.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceBuild).setTimeInterval(restingLog.getStartTime(), restingLog.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_BPM, restingLog.getHeartRate()).build());
        }
        java.util.ArrayList arrayList2 = arrayList;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Sending resting data to FIT: size - ", java.lang.Integer.valueOf(arrayList2.size())), null, 2, null);
        it.onSuccess(new kotlin.Triple(dataSourceBuild, arrayList2, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveRestingLog$lambda-34, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1476saveRestingLog$lambda34(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, kotlin.Triple it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.saveDataToCloud((com.google.android.gms.fitness.data.DataSource) it.getFirst(), (java.util.List) it.getSecond(), (android.content.Context) it.getThird());
    }

    private final int mapSleepTypeToFitSleepType(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType) {
        int i = powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.WhenMappings.$EnumSwitchMapping$0[sleepType.ordinal()];
        if (i == 1) {
            return 110;
        }
        if (i == 2) {
            return 109;
        }
        if (i == 3 || i == 4) {
            return 112;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: compiled from: GoogleFitDataWriter.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitDataWriter$SleepSession;", "", "startTime", "", "endTime", "list", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "(JJLjava/util/List;)V", "getEndTime", "()J", "getList", "()Ljava/util/List;", "getStartTime", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class SleepSession {
        private final long endTime;
        private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> list;
        private final long startTime;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession copy$default(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession sleepSession, long j, long j2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = sleepSession.startTime;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = sleepSession.endTime;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                list = sleepSession.list;
            }
            return sleepSession.copy(j3, j4, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> component3() {
            return this.list;
        }

        public final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession copy(long startTime, long endTime, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
            return new powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession(startTime, endTime, list);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession)) {
                return false;
            }
            powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession sleepSession = (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession) other;
            return this.startTime == sleepSession.startTime && this.endTime == sleepSession.endTime && kotlin.jvm.internal.Intrinsics.areEqual(this.list, sleepSession.list);
        }

        public int hashCode() {
            return (((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.startTime) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.endTime)) * 31) + this.list.hashCode();
        }

        public java.lang.String toString() {
            return "SleepSession(startTime=" + this.startTime + ", endTime=" + this.endTime + ", list=" + this.list + ')';
        }

        public SleepSession(long j, long j2, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
            this.startTime = j;
            this.endTime = j2;
            this.list = list;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> getList() {
            return this.list;
        }

        public final long getStartTime() {
            return this.startTime;
        }
    }

    public static /* synthetic */ io.reactivex.Completable saveSleepingLog$default(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter googleFitDataWriter, java.util.List list, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return googleFitDataWriter.saveSleepingLog(list, context, z);
    }

    public final io.reactivex.Completable saveSleepingLog(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> logs, final android.content.Context context, final boolean useGranularData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Completable completableAndThen = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$Xh3QSRmSRIyF8Fy67JvI-05TL6k
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1481saveSleepingLog$lambda38(this.f$0, logs, singleEmitter);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$mRPi8Q_p39ki-fGaDwzmgzKBpr8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1482saveSleepingLog$lambda39(this.f$0, (java.util.List) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$4ktu_tksw7s_HdsMEc5pUfJFFeg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1483saveSleepingLog$lambda42(useGranularData, context, this, (java.util.List) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$CP2TM2RIZsPmmkF-6X_v-V1cnCs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$a0Ej0qq-lYPW5bCAJGncIkiWzIY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1485saveSleepingLog$lambda44(this.f$0, (java.util.List) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$jGYHQgOt4L2T4jhvMPSg1Ug5fS4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1486saveSleepingLog$lambda49(context, this, (java.util.List) obj);
            }
        }).andThen(saveSleepHeartRate(logs, context));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "create<List<SleepSession>> {\n\n            val sessions = mutableListOf<SleepSession>()\n\n            debug(\"Received sleep entries, size: ${logs.size}\")\n            val resultList = logs.fold(mutableListOf<SleepLog>()) { list, next ->\n                //ako je lista prazna, dodaj element\n                if (list.isEmpty()) list.add(next)\n\n                //ako je razlika poslednjeg elementa u listi i sledeceg veca od 3 sata\n                if (abs(list.last().endTime - next.startTime) > 60 * 1000L) {\n\n                    debug(\"Creating new list: last - ${list.last().endTime}, next - ${next.startTime}\")\n\n                    //iskopiraj sve iz liste u novu listu\n                    val newList = mutableListOf<SleepLog>()\n                    list.forEach { sleep -> newList.add(sleep) }\n\n                    debug(\"Creating session with: ${list.first().startTime} : ${list.last().endTime}, size - ${newList.size}\")\n                    //napravi novu Sleep sesiju, sa upravo-kreiranim elementima\n                    sessions.add(SleepSession(list.first().startTime, list.last().endTime, newList))\n\n                    //obrisi listu da skupljamo nove logove\n                    list.clear()\n                }\n\n                //na kraju dodaj sledeci element u listu\n                list.add(next)\n                list\n            }\n\n            if (resultList.size >= 2) {\n                val newList = mutableListOf<SleepLog>()\n                resultList.forEach { sleep -> newList.add(sleep) }\n\n                sessions.add(SleepSession(resultList.first().startTime, resultList.last().endTime, newList))\n\n            }\n\n            it.onSuccess(sessions)\n        }\n                .doOnSuccess {\n                    debug(\"Prepared sessions: ${it.size}\")\n                }\n                .map { sleepSessions ->\n                    sleepSessions.map { singleSession ->\n                        val session = Session.Builder()\n                                .setStartTime(singleSession.startTime, TimeUnit.MILLISECONDS)\n                                .setEndTime(singleSession.endTime, TimeUnit.MILLISECONDS)\n                                .setActivity(FitnessActivities.SLEEP)\n                                .build()\n                        val sessionBuilder = SessionInsertRequest.Builder()\n                                .setSession(session)\n\n                        if (useGranularData) {\n\n                            val dataSource = DataSource.Builder()\n                                    .setType(DataSource.TYPE_RAW)\n                                    .setDataType(DataType.TYPE_ACTIVITY_SEGMENT)\n                                    .setAppPackageName(context)\n                                    // Optional but recommended for identifying the stream if you have multiple streams with the same dataType.\n                                    .setStreamName(context.packageName + \" - sleep log\")\n                                    .build()\n\n\n                            val dataPoints = singleSession.list.map {\n                                DataPoint.builder(dataSource)\n                                        .setTimeInterval(it.startTime, it.endTime, TimeUnit.MILLISECONDS)\n                                        .setField(FIELD_ACTIVITY, mapSleepTypeToFitSleepType(it.sleepType))\n                                        .build()\n                            }\n\n                            val dataSet = DataSet.builder(dataSource).addAll(dataPoints).build()\n\n                            sessionBuilder.addDataSet(dataSet)\n                        }\n\n                        sessionBuilder.build()\n\n                    }\n                }\n                .doOnError {\n                    it.printStackTrace()\n                }\n                .doOnSuccess {\n                    debug(\"Prepared requests, size: ${it.size}\")\n                }\n                .flatMapCompletable {\n                    Observable.fromIterable(it)\n                            .concatMapCompletable { sessionRequest ->\n                                Completable.create { emitter ->\n                                    Fitness.getSessionsClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                                            .insertSession(sessionRequest)\n                                            .addOnSuccessListener {\n                                                debug(\"Session sleep data saved to cloud\")\n                                                emitter.onComplete()\n                                            }\n                                            .addOnFailureListener {\n                                                error(\"Session sleep data save error\", it)\n                                                it.printStackTrace()\n                                                emitter.onComplete()\n                                            }\n                                }\n\n                            }\n                }\n                .andThen(saveSleepHeartRate(logs, context))");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-38, reason: not valid java name */
    public static final void m1481saveSleepingLog$lambda38(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List logs, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logs, "$logs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter googleFitDataWriter = this$0;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(googleFitDataWriter, kotlin.jvm.internal.Intrinsics.stringPlus("Received sleep entries, size: ", java.lang.Integer.valueOf(logs.size())), null, 2, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = logs.iterator();
        while (it2.hasNext()) {
            powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog sleepLog = (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) it2.next();
            if (arrayList2.isEmpty()) {
                arrayList2.add(sleepLog);
            }
            if (java.lang.Math.abs(((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).getEndTime() - sleepLog.getStartTime()) > 60000) {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(googleFitDataWriter, "Creating new list: last - " + ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).getEndTime() + ", next - " + sleepLog.getStartTime(), null, 2, null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) it3.next());
                }
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(googleFitDataWriter, "Creating session with: " + ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)).getStartTime() + " : " + ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).getEndTime() + ", size - " + arrayList3.size(), null, 2, null);
                arrayList.add(new powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession(((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)).getStartTime(), ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).getEndTime(), arrayList3));
                arrayList2.clear();
            }
            arrayList2.add(sleepLog);
        }
        if (arrayList2.size() >= 2) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList4.add((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) it4.next());
            }
            arrayList.add(new powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession(((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)).getStartTime(), ((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).getEndTime(), arrayList4));
        }
        it.onSuccess(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-39, reason: not valid java name */
    public static final void m1482saveSleepingLog$lambda39(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Prepared sessions: ", java.lang.Integer.valueOf(list.size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-42, reason: not valid java name */
    public static final java.util.List m1483saveSleepingLog$lambda42(boolean z, android.content.Context context, powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List sleepSessions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepSessions, "sleepSessions");
        java.util.List<powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession> list = sleepSessions;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.SleepSession sleepSession : list) {
            com.google.android.gms.fitness.request.SessionInsertRequest.Builder session = new com.google.android.gms.fitness.request.SessionInsertRequest.Builder().setSession(new com.google.android.gms.fitness.data.Session.Builder().setStartTime(sleepSession.getStartTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setEndTime(sleepSession.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setActivity(com.google.android.gms.fitness.FitnessActivities.SLEEP).build());
            if (z) {
                com.google.android.gms.fitness.data.DataSource dataSourceBuild = new com.google.android.gms.fitness.data.DataSource.Builder().setType(0).setDataType(com.google.android.gms.fitness.data.DataType.TYPE_ACTIVITY_SEGMENT).setAppPackageName(context).setStreamName(kotlin.jvm.internal.Intrinsics.stringPlus(context.getPackageName(), " - sleep log")).build();
                java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> list2 = sleepSession.getList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog sleepLog : list2) {
                    arrayList2.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceBuild).setTimeInterval(sleepLog.getStartTime(), sleepLog.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_ACTIVITY, this$0.mapSleepTypeToFitSleepType(sleepLog.getSleepType())).build());
                }
                session.addDataSet(com.google.android.gms.fitness.data.DataSet.builder(dataSourceBuild).addAll(arrayList2).build());
            }
            arrayList.add(session.build());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-44, reason: not valid java name */
    public static final void m1485saveSleepingLog$lambda44(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Prepared requests, size: ", java.lang.Integer.valueOf(list.size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-49, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1486saveSleepingLog$lambda49(final android.content.Context context, final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.fromIterable(it).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$YexJTsMG62bz4jOLlpmrNaFDFEA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1487saveSleepingLog$lambda49$lambda48(context, this$0, (com.google.android.gms.fitness.request.SessionInsertRequest) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-49$lambda-48, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1487saveSleepingLog$lambda49$lambda48(final android.content.Context context, final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, final com.google.android.gms.fitness.request.SessionInsertRequest sessionRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRequest, "sessionRequest");
        return io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$1txX5Ws1v829VXwa0Ig3-fbthKk
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1488saveSleepingLog$lambda49$lambda48$lambda47(context, sessionRequest, this$0, completableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-49$lambda-48$lambda-47, reason: not valid java name */
    public static final void m1488saveSleepingLog$lambda49$lambda48$lambda47(android.content.Context context, com.google.android.gms.fitness.request.SessionInsertRequest sessionRequest, final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, final io.reactivex.CompletableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRequest, "$sessionRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(context);
        kotlin.jvm.internal.Intrinsics.checkNotNull(lastSignedInAccount);
        com.google.android.gms.fitness.Fitness.getSessionsClient(context, lastSignedInAccount).insertSession(sessionRequest).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$pUPTiTa1BccvLAM49exbURaO_CQ
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1489saveSleepingLog$lambda49$lambda48$lambda47$lambda45(this.f$0, emitter, (java.lang.Void) obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitDataWriter$NdWzTKt39NEDQRmuD8aY7skPBZs
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter.m1490saveSleepingLog$lambda49$lambda48$lambda47$lambda46(this.f$0, emitter, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-49$lambda-48$lambda-47$lambda-45, reason: not valid java name */
    public static final void m1489saveSleepingLog$lambda49$lambda48$lambda47$lambda45(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Void r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Session sleep data saved to cloud", null, 2, null);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveSleepingLog$lambda-49$lambda-48$lambda-47$lambda-46, reason: not valid java name */
    public static final void m1490saveSleepingLog$lambda49$lambda48$lambda47$lambda46(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Exception it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Session sleep data save error", it, null, 4, null);
        it.printStackTrace();
        emitter.onComplete();
    }
}
