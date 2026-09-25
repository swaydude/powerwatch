package powerwatch.matrix.com.pwgen2android.googlefit;

/* JADX INFO: compiled from: GoogleFitSessionWriter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001c\u0010\u001d\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0002\u001a\u00020\u0003R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitSessionWriter;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "packageName", "", "kotlin.jvm.PlatformType", "createDataSource", "Lcom/google/android/gms/fitness/data/DataSource;", "dataType", "Lcom/google/android/gms/fitness/data/DataType;", "dataTag", "createSessionInsertRequest", "", "Lcom/google/android/gms/fitness/request/SessionInsertRequest;", "userSession", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "extractActivityType", "userActivitySession", "extractCaloriesData", "Lcom/google/android/gms/fitness/data/DataSet;", "extractDistanceData", "extractHeartRateData", "extractLocationData", "extractStepsData", "sendSingleSession", "Lio/reactivex/Completable;", "sessionRequest", "writeSessions", "userSessions", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoogleFitSessionWriter implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.lang.String packageName;

    /* JADX INFO: compiled from: GoogleFitSessionWriter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.valuesCustom().length];
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_RUNNING.ordinal()] = 1;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_RUNNING.ordinal()] = 2;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_JOGGING.ordinal()] = 3;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_JOGGING.ordinal()] = 4;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_BIKING.ordinal()] = 5;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_BIKING.ordinal()] = 6;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_DRIVING.ordinal()] = 7;
            iArr[powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_HIIT.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GoogleFitSessionWriter(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.packageName = context.getPackageName();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final java.util.List<com.google.android.gms.fitness.data.DataSet> extractHeartRateData(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        java.util.List<java.util.List> listChunked = kotlin.collections.CollectionsKt.chunked(userActivitySession.getHeartRates(), 800);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        for (java.util.List list : listChunked) {
            com.google.android.gms.fitness.data.DataType TYPE_HEART_RATE_BPM = com.google.android.gms.fitness.data.DataType.TYPE_HEART_RATE_BPM;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_HEART_RATE_BPM, "TYPE_HEART_RATE_BPM");
            com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = createDataSource(TYPE_HEART_RATE_BPM, "session heart rate");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) obj).getEndTime() <= userActivitySession.getEndTime()) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> arrayList3 = arrayList2;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate : arrayList3) {
                arrayList4.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(heartRate.getStartTime(), heartRate.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_BPM, heartRate.getValue()).build());
            }
            arrayList.add(com.google.android.gms.fitness.data.DataSet.builder(dataSourceCreateDataSource).addAll(arrayList4).build());
        }
        return arrayList;
    }

    private final java.util.List<com.google.android.gms.fitness.data.DataSet> extractLocationData(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions = userActivitySession.getGpsPositions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = gpsPositions.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next;
            if (gPSPosition.getLatitude() == 0.0d) {
                if (gPSPosition.getLongitude() == 0.0d) {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        java.util.List<java.util.List> listChunked = kotlin.collections.CollectionsKt.chunked(arrayList, 800);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        for (java.util.List list : listChunked) {
            com.google.android.gms.fitness.data.DataType TYPE_LOCATION_SAMPLE = com.google.android.gms.fitness.data.DataType.TYPE_LOCATION_SAMPLE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_LOCATION_SAMPLE, "TYPE_LOCATION_SAMPLE");
            com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = createDataSource(TYPE_LOCATION_SAMPLE, "session location");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) obj).getTimestamp() <= userActivitySession.getEndTime()) {
                    arrayList3.add(obj);
                }
            }
            java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> arrayList4 = arrayList3;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            for (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition2 : arrayList4) {
                arrayList5.add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimestamp(gPSPosition2.getTimestamp(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_LONGITUDE, (float) gPSPosition2.getLongitude()).setField(com.google.android.gms.fitness.data.Field.FIELD_LATITUDE, (float) gPSPosition2.getLatitude()).setField(com.google.android.gms.fitness.data.Field.FIELD_ACCURACY, 1.0f).setField(com.google.android.gms.fitness.data.Field.FIELD_ALTITUDE, (float) gPSPosition2.getAltitude()).build());
            }
            arrayList2.add(com.google.android.gms.fitness.data.DataSet.builder(dataSourceCreateDataSource).addAll(arrayList5).build());
        }
        return arrayList2;
    }

    private final com.google.android.gms.fitness.data.DataSet extractDistanceData(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        com.google.android.gms.fitness.data.DataType TYPE_DISTANCE_DELTA = com.google.android.gms.fitness.data.DataType.TYPE_DISTANCE_DELTA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_DISTANCE_DELTA, "TYPE_DISTANCE_DELTA");
        com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = createDataSource(TYPE_DISTANCE_DELTA, "session distance");
        com.google.android.gms.fitness.data.DataSet dataSetBuild = com.google.android.gms.fitness.data.DataSet.builder(dataSourceCreateDataSource).add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(userActivitySession.getStartTime(), userActivitySession.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_DISTANCE, userActivitySession.getDistance()).build()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSetBuild, "builder(distanceDataSource)\n                .add(distanceDataPoint)\n                .build()");
        return dataSetBuild;
    }

    private final com.google.android.gms.fitness.data.DataSet extractCaloriesData(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        com.google.android.gms.fitness.data.DataType TYPE_CALORIES_EXPENDED = com.google.android.gms.fitness.data.DataType.TYPE_CALORIES_EXPENDED;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_CALORIES_EXPENDED, "TYPE_CALORIES_EXPENDED");
        com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = createDataSource(TYPE_CALORIES_EXPENDED, "session calories");
        com.google.android.gms.fitness.data.DataSet dataSetBuild = com.google.android.gms.fitness.data.DataSet.builder(dataSourceCreateDataSource).add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(userActivitySession.getStartTime(), userActivitySession.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_CALORIES, (userActivitySession.getActiveCalories() * 1.0f) / 1000).build()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSetBuild, "builder(distanceDataSource)\n                .add(distanceDataPoint)\n                .build()");
        return dataSetBuild;
    }

    private final com.google.android.gms.fitness.data.DataSet extractStepsData(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        com.google.android.gms.fitness.data.DataType TYPE_STEP_COUNT_DELTA = com.google.android.gms.fitness.data.DataType.TYPE_STEP_COUNT_DELTA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TYPE_STEP_COUNT_DELTA, "TYPE_STEP_COUNT_DELTA");
        com.google.android.gms.fitness.data.DataSource dataSourceCreateDataSource = createDataSource(TYPE_STEP_COUNT_DELTA, "session steps");
        com.google.android.gms.fitness.data.DataSet dataSetBuild = com.google.android.gms.fitness.data.DataSet.builder(dataSourceCreateDataSource).add(com.google.android.gms.fitness.data.DataPoint.builder(dataSourceCreateDataSource).setTimeInterval(userActivitySession.getStartTime(), userActivitySession.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setField(com.google.android.gms.fitness.data.Field.FIELD_STEPS, userActivitySession.getSteps()).build()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSetBuild, "builder(distanceDataSource)\n                .add(distanceDataPoint)\n                .build()");
        return dataSetBuild;
    }

    private final java.lang.String extractActivityType(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        switch (powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.WhenMappings.$EnumSwitchMapping$0[userActivitySession.getActivityType().ordinal()]) {
            case 1:
            case 2:
                return com.google.android.gms.fitness.FitnessActivities.RUNNING;
            case 3:
            case 4:
                return com.google.android.gms.fitness.FitnessActivities.RUNNING_JOGGING;
            case 5:
            case 6:
            case 7:
                return com.google.android.gms.fitness.FitnessActivities.BIKING;
            case 8:
                return com.google.android.gms.fitness.FitnessActivities.HIGH_INTENSITY_INTERVAL_TRAINING;
            default:
                return com.google.android.gms.fitness.FitnessActivities.WALKING;
        }
    }

    public final io.reactivex.Completable writeSessions(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> userSessions, final android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userSessions, "userSessions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.Completable completableDoOnError = io.reactivex.Observable.fromIterable(userSessions).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$cyszL97eFN4iRDZj2aob-mgRlFo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1510writeSessions$lambda7((powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$Qy4S4pj0cSqPmo6nrWm03VFE4G0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1511writeSessions$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$y3FSCPjaUKf48a6OhbUL8kGhr0c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1512writeSessions$lambda9(this.f$0, (java.util.List) obj);
            }
        }).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$BPjJdSijsdYBV74XshBDqM1t2ik
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1505writeSessions$lambda13(this.f$0, context, (java.util.List) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$QozwErT9bE6ZUMThNjdwHw_gQhQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1509writeSessions$lambda14(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnError, "fromIterable(userSessions)\n                .doOnNext { println(\"FitWriter - running next session, type - ${it.activityType.name}\") }\n                .map {\n                    createSessionInsertRequest(it)\n                }\n                .doOnNext { debug(\"FitWriter - created requests ${it.size}\") }\n                .concatMapCompletable {\n                    Observable.fromIterable(it)\n                            .doOnNext { debug(\"FitWriter - processing next request\") }\n                            .concatMapCompletable { session -> sendSingleSession(session, context).doOnComplete { println(\"FitWriter - one session sent\") } }\n                }\n                .doOnError {\n                    it.printStackTrace()\n                    error(\"Error in save session log\", it)\n                }");
        return completableDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-7, reason: not valid java name */
    public static final void m1510writeSessions$lambda7(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("FitWriter - running next session, type - ", userActivitySession.getActivityType().name()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-8, reason: not valid java name */
    public static final java.util.List m1511writeSessions$lambda8(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.createSessionInsertRequest(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-9, reason: not valid java name */
    public static final void m1512writeSessions$lambda9(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("FitWriter - created requests ", java.lang.Integer.valueOf(list.size())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-13, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1505writeSessions$lambda13(final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, final android.content.Context context, java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.fromIterable(it).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$tuM0t7SbgNxkXFOkp2n2XcZkNu4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1506writeSessions$lambda13$lambda10(this.f$0, (com.google.android.gms.fitness.request.SessionInsertRequest) obj);
            }
        }).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$pz4vfsJ92WHZuFw-NagDjmFjvF4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1507writeSessions$lambda13$lambda12(this.f$0, context, (com.google.android.gms.fitness.request.SessionInsertRequest) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-13$lambda-10, reason: not valid java name */
    public static final void m1506writeSessions$lambda13$lambda10(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "FitWriter - processing next request", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-13$lambda-12, reason: not valid java name */
    public static final io.reactivex.CompletableSource m1507writeSessions$lambda13$lambda12(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, android.content.Context context, com.google.android.gms.fitness.request.SessionInsertRequest session) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "session");
        return this$0.sendSingleSession(session, context).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$4DNvLS9PbEonv3i1hO2WfTbyBZs
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1508writeSessions$lambda13$lambda12$lambda11();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-13$lambda-12$lambda-11, reason: not valid java name */
    public static final void m1508writeSessions$lambda13$lambda12$lambda11() {
        java.lang.System.out.println((java.lang.Object) "FitWriter - one session sent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeSessions$lambda-14, reason: not valid java name */
    public static final void m1509writeSessions$lambda14(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        th.printStackTrace();
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error in save session log", th, null, 4, null);
    }

    private final java.util.List<com.google.android.gms.fitness.request.SessionInsertRequest> createSessionInsertRequest(powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userSession) {
        com.google.android.gms.fitness.data.Session.Builder activity = new com.google.android.gms.fitness.data.Session.Builder().setStartTime(userSession.getStartTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setEndTime(userSession.getEndTime(), java.util.concurrent.TimeUnit.MILLISECONDS).setActivity(extractActivityType(userSession));
        if (userSession.getName().length() > 0) {
            activity.setName(userSession.getName());
        }
        com.google.android.gms.fitness.data.Session sessionBuild = activity.build();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.google.android.gms.fitness.data.DataSet> listExtractHeartRateData = extractHeartRateData(userSession);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listExtractHeartRateData, 10));
        java.util.Iterator<T> it = listExtractHeartRateData.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.google.android.gms.fitness.request.SessionInsertRequest.Builder().setSession(sessionBuild).addDataSet((com.google.android.gms.fitness.data.DataSet) it.next()).build());
        }
        java.util.ArrayList arrayList3 = arrayList2;
        arrayList.addAll(arrayList3);
        java.util.List<com.google.android.gms.fitness.data.DataSet> listExtractLocationData = extractLocationData(userSession);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listExtractLocationData, 10));
        java.util.Iterator<T> it2 = listExtractLocationData.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new com.google.android.gms.fitness.request.SessionInsertRequest.Builder().setSession(sessionBuild).addDataSet((com.google.android.gms.fitness.data.DataSet) it2.next()).build());
        }
        java.util.ArrayList arrayList5 = arrayList4;
        arrayList.addAll(arrayList5);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Prepared data list requests: locations - " + arrayList5.size() + ", heart rates - " + arrayList3.size() + " \n Session info: start - " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dateFormat(userSession.getStartTime()) + ", end - " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.dateFormat(userSession.getEndTime()) + ", duration - " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.hourMinSecTimeFormat(userSession.getEndTime() - userSession.getStartTime()) + ", distance - " + userSession.getDistance() + ", steps - " + userSession.getSteps() + ", calories - " + userSession.getActiveCalories(), null, 2, null);
        com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequestBuild = new com.google.android.gms.fitness.request.SessionInsertRequest.Builder().setSession(sessionBuild).addDataSet(extractDistanceData(userSession)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionInsertRequestBuild, "Builder()\n                .setSession(session)\n                .addDataSet(extractDistanceData(userSession))\n                .build()");
        arrayList.add(sessionInsertRequestBuild);
        com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequestBuild2 = new com.google.android.gms.fitness.request.SessionInsertRequest.Builder().setSession(sessionBuild).addDataSet(extractStepsData(userSession)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionInsertRequestBuild2, "Builder()\n                .setSession(session)\n                .addDataSet(extractStepsData(userSession))\n                .build()");
        arrayList.add(sessionInsertRequestBuild2);
        com.google.android.gms.fitness.request.SessionInsertRequest sessionInsertRequestBuild3 = new com.google.android.gms.fitness.request.SessionInsertRequest.Builder().setSession(sessionBuild).addDataSet(extractCaloriesData(userSession)).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sessionInsertRequestBuild3, "Builder()\n                .setSession(session)\n                .addDataSet(extractCaloriesData(userSession))\n                .build()");
        arrayList.add(sessionInsertRequestBuild3);
        return arrayList;
    }

    private final io.reactivex.Completable sendSingleSession(final com.google.android.gms.fitness.request.SessionInsertRequest sessionRequest, final android.content.Context context) {
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$TTIoZNb4gN_cYv0Zy96vivGlZSU
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1502sendSingleSession$lambda19(context, sessionRequest, this, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create { emitter ->\n\n            Fitness.getSessionsClient(context, GoogleSignIn.getLastSignedInAccount(context)!!)\n                    .insertSession(sessionRequest)\n                    .addOnSuccessListener {\n                        debug(\"Session data saved to cloud\")\n                        emitter.onComplete()\n                    }\n                    .addOnFailureListener {\n                        error(\"Session data save error\", it)\n                        it.printStackTrace()\n                        emitter.onComplete()\n                    }\n\n        }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleSession$lambda-19, reason: not valid java name */
    public static final void m1502sendSingleSession$lambda19(android.content.Context context, com.google.android.gms.fitness.request.SessionInsertRequest sessionRequest, final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, final io.reactivex.CompletableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRequest, "$sessionRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(context);
        kotlin.jvm.internal.Intrinsics.checkNotNull(lastSignedInAccount);
        com.google.android.gms.fitness.Fitness.getSessionsClient(context, lastSignedInAccount).insertSession(sessionRequest).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$GKGs2s3Y4fenaGu5SMHN_ZYuges
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1503sendSingleSession$lambda19$lambda17(this.f$0, emitter, (java.lang.Void) obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.googlefit.-$$Lambda$GoogleFitSessionWriter$bQhU_XbaynvMPpnl1han6DfBxFE
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter.m1504sendSingleSession$lambda19$lambda18(this.f$0, emitter, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleSession$lambda-19$lambda-17, reason: not valid java name */
    public static final void m1503sendSingleSession$lambda19$lambda17(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Void r4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Session data saved to cloud", null, 2, null);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleSession$lambda-19$lambda-18, reason: not valid java name */
    public static final void m1504sendSingleSession$lambda19$lambda18(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter this$0, io.reactivex.CompletableEmitter emitter, java.lang.Exception it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Session data save error", it, null, 4, null);
        it.printStackTrace();
        emitter.onComplete();
    }

    static /* synthetic */ com.google.android.gms.fitness.data.DataSource createDataSource$default(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitSessionWriter googleFitSessionWriter, com.google.android.gms.fitness.data.DataType dataType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "unknown";
        }
        return googleFitSessionWriter.createDataSource(dataType, str);
    }

    private final com.google.android.gms.fitness.data.DataSource createDataSource(com.google.android.gms.fitness.data.DataType dataType, java.lang.String dataTag) {
        com.google.android.gms.fitness.data.DataSource dataSourceBuild = new com.google.android.gms.fitness.data.DataSource.Builder().setAppPackageName(this.packageName).setDataType(dataType).setStreamName(((java.lang.Object) this.packageName) + " - " + dataTag).setType(0).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dataSourceBuild, "Builder()\n                .setAppPackageName(packageName)\n                .setDataType(dataType)\n                .setStreamName(\"$packageName - $dataTag\")\n                .setType(DataSource.TYPE_RAW)\n                .build()");
        return dataSourceBuild;
    }
}
