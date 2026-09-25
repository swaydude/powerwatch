package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: LocationInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020\u0014H\u0002J\u001c\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010$0#0\"H\u0016J\u001c\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010&0#0\"H\u0016J\u0012\u0010'\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010&H\u0016J\b\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0004H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\"2\u0006\u00100\u001a\u00020$H\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00040\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00140\u00140\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "LOCATION_ALT", "", "LOCATION_LAT", "LOCATION_LONG", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "internalLocationUpdateSubject", "Lio/reactivex/subjects/PublishSubject;", "", "isProviderEnabled", "Lio/reactivex/Observable;", "", "()Lio/reactivex/Observable;", "locationManager", "Landroid/location/LocationManager;", "locationReceiver", "Landroid/content/BroadcastReceiver;", "locationSubject", "Lio/reactivex/subjects/BehaviorSubject;", "locationUpdateProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;", "myScheduler", "Lio/reactivex/Scheduler;", "checkLocation", "getLastKnownLocation", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Landroid/location/Location;", "getLastStoredLocation", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "isLocationValid", "gpsPosition", "registerReceiverGPS", "showDialog", "activityContext", "showDialogForLocation", "updateLocationInternal", "Lio/reactivex/Completable;", "updateStorage", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LocationInfoProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private static final java.lang.String ACTION_GPS = "android.location.PROVIDERS_CHANGED";
    private final java.lang.String LOCATION_ALT;
    private final java.lang.String LOCATION_LAT;
    private final java.lang.String LOCATION_LONG;
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakReference;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> internalLocationUpdateSubject;
    private final android.location.LocationManager locationManager;
    private android.content.BroadcastReceiver locationReceiver;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> locationSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider locationUpdateProvider;
    private final io.reactivex.Scheduler myScheduler;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m3287_init_$lambda2(kotlin.Pair pair) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m3288_init_$lambda3(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLastKnownLocation$lambda-10$lambda-9$lambda-8, reason: not valid java name */
    public static final kotlin.Pair m3293getLastKnownLocation$lambda10$lambda9$lambda8(kotlin.Pair location, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "$location");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return location;
    }

    public LocationInfoProviderImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.LOCATION_LAT = "location_lat";
        this.LOCATION_LONG = "location_long";
        this.LOCATION_ALT = "location_alt";
        io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<Boolean>()");
        this.locationSubject = behaviorSubjectCreate;
        io.reactivex.subjects.PublishSubject<kotlin.Unit> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Unit>()");
        this.internalLocationUpdateSubject = publishSubjectCreate;
        io.reactivex.Scheduler schedulerFrom = io.reactivex.schedulers.Schedulers.from(java.util.concurrent.Executors.newSingleThreadExecutor());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(Executors.newSingleThreadExecutor())");
        this.myScheduler = schedulerFrom;
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.disposable = compositeDisposable;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(context);
        this.locationUpdateProvider = new powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider(context);
        java.lang.Object systemService = context.getSystemService(com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION);
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        this.locationManager = (android.location.LocationManager) systemService;
        behaviorSubjectCreate.onNext(java.lang.Boolean.valueOf(checkLocation()));
        registerReceiverGPS();
        compositeDisposable.add(publishSubjectCreate.observeOn(schedulerFrom).concatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$meO8y6o2ek8s0ro6YSX74XNNyJg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3286_init_$lambda1(this.f$0, (kotlin.Unit) obj);
            }
        }).repeat().retry().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$pNatW0gW3oXog2SwCXL_dP8iS4c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3287_init_$lambda2((kotlin.Pair) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$PNZjRehOz5WXSzzLujr_OqrgvG0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3288_init_$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider
    public io.reactivex.Observable<java.lang.Boolean> isProviderEnabled() {
        io.reactivex.Observable map = this.locationSubject.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$ntJnrJlXEN89Yo6apPw3OY_Zo9Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3285_get_isProviderEnabled_$lambda0((java.lang.Boolean) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "locationSubject\n                .map {\n                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) it else true\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_isProviderEnabled_$lambda-0, reason: not valid java name */
    public static final java.lang.Boolean m3285_get_isProviderEnabled_$lambda0(java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return it;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final io.reactivex.SingleSource m3286_init_$lambda1(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl this$0, kotlin.Unit it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getLastKnownLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkLocation() {
        android.location.LocationManager locationManager = this.locationManager;
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps");
        }
        return false;
    }

    private final void registerReceiverGPS() {
        if (this.locationReceiver == null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction(ACTION_GPS);
            this.locationReceiver = new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.registerReceiverGPS.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    java.lang.String action;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    if (intent == null || (action = intent.getAction()) == null || !kotlin.jvm.internal.Intrinsics.areEqual(action, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.ACTION_GPS)) {
                        return;
                    }
                    powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.this.locationSubject.onNext(java.lang.Boolean.valueOf(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.this.checkLocation()));
                }
            };
            android.content.Context context = this.contextWeakReference.get();
            if (context == null) {
                return;
            }
            context.registerReceiver(this.locationReceiver, intentFilter);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider
    public void showDialog(final android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activityContext);
        java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.enable_locations_alert_text);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.enable_locations_alert_text)");
        final java.lang.String str = "android.settings.LOCATION_SOURCE_SETTINGS";
        builder.setMessage(string).setTitle(activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.enable_locations_alert_title)).setPositiveButton(activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.button_ok), new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$XohhAvf5sP8B81-HqZepMgUVEB8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3300showDialog$lambda4(activityContext, str, dialogInterface, i);
            }
        }).setNegativeButton(activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.cancel_locations_enable), new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$-9H50o617-38auTjjq51VnLO98M
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialog$lambda-4, reason: not valid java name */
    public static final void m3300showDialog$lambda4(android.content.Context activityContext, java.lang.String action, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "$activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "$action");
        activityContext.startActivity(new android.content.Intent(action));
        dialogInterface.dismiss();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider
    public io.reactivex.Single<kotlin.Pair<java.lang.Boolean, android.location.Location>> getLastKnownLocation() {
        io.reactivex.Single singleFlatMap = isProviderEnabled().firstOrError().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$NxyR6GT3sLnaLcA49H24YR2YJWA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3289getLastKnownLocation$lambda10(this.f$0, (java.lang.Boolean) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "isProviderEnabled\n                .firstOrError()\n                .flatMap {\n                    if (it) {\n                        locationUpdateProvider.location().map {l -> Pair(true, l) }\n                                .doOnSuccess { debug(\"updating location storage\") }\n                                .flatMap {location ->\n                                    updateStorage(location.second).map { location }\n                                }\n                    } else\n                        Single.just(Pair(false, null)\n                    )\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLastKnownLocation$lambda-10, reason: not valid java name */
    public static final io.reactivex.SingleSource m3289getLastKnownLocation$lambda10(final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl this$0, java.lang.Boolean it) {
        io.reactivex.Single singleJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.booleanValue()) {
            singleJust = this$0.locationUpdateProvider.location().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$CDWg3QvQ5FgaMCam0TmqssBcCiI
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3290getLastKnownLocation$lambda10$lambda6((android.location.Location) obj);
                }
            }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$SueuCpDM1KPH3T2nOhVFbi19TO8
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3291getLastKnownLocation$lambda10$lambda7(this.f$0, (kotlin.Pair) obj);
                }
            }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$YpvQ3rKhh_7wFsUdElEjPjcUBLo
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3292getLastKnownLocation$lambda10$lambda9(this.f$0, (kotlin.Pair) obj);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleJust, "{\n                        locationUpdateProvider.location().map {l -> Pair(true, l) }\n                                .doOnSuccess { debug(\"updating location storage\") }\n                                .flatMap {location ->\n                                    updateStorage(location.second).map { location }\n                                }\n                    }");
        } else {
            singleJust = io.reactivex.Single.just(new kotlin.Pair(false, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleJust, "just(Pair(false, null)\n                    )");
        }
        return singleJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLastKnownLocation$lambda-10$lambda-6, reason: not valid java name */
    public static final kotlin.Pair m3290getLastKnownLocation$lambda10$lambda6(android.location.Location l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "l");
        return new kotlin.Pair(true, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLastKnownLocation$lambda-10$lambda-7, reason: not valid java name */
    public static final void m3291getLastKnownLocation$lambda10$lambda7(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "updating location storage", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLastKnownLocation$lambda-10$lambda-9, reason: not valid java name */
    public static final io.reactivex.SingleSource m3292getLastKnownLocation$lambda10$lambda9(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl this$0, final kotlin.Pair location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        java.lang.Object second = location.getSecond();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "location.second");
        return this$0.updateStorage((android.location.Location) second).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$D2FERxj6DXCJ-_x8RK_ly3HI2mc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3293getLastKnownLocation$lambda10$lambda9$lambda8(location, (java.lang.Boolean) obj);
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider
    public io.reactivex.Single<kotlin.Pair<java.lang.Boolean, powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition>> getLastStoredLocation() {
        io.reactivex.Single<kotlin.Pair<java.lang.Boolean, powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition>> singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$jCgqKthXwgablP3SloafkNy7-U4
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3294getLastStoredLocation$lambda11(this.f$0, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create {\n\n            val context = contextWeakReference.get()\n            val defaultValue = Float.MIN_VALUE.toDouble()\n            if (context != null) {\n                val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)\n                val lat = sharedPrefs.getFloat(LOCATION_LAT, Float.MIN_VALUE)\n                val long = sharedPrefs.getFloat(LOCATION_LONG, Float.MIN_VALUE)\n                val alt: Float = sharedPrefs.getFloat(LOCATION_ALT, Float.MIN_VALUE)\n                debug(\"Reading altitude value: $alt\")\n                it.onSuccess(Pair(true, GPSPosition(long.toDouble(), lat.toDouble(), alt.toDouble())))\n            } else\n                it.onSuccess(Pair(false, GPSPosition(defaultValue, defaultValue, defaultValue)))\n        }");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getLastStoredLocation$lambda-11, reason: not valid java name */
    public static final void m3294getLastStoredLocation$lambda11(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl this$0, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.content.Context context = this$0.contextWeakReference.get();
        if (context != null) {
            android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context);
            float f = defaultSharedPreferences.getFloat(this$0.LOCATION_LAT, Float.MIN_VALUE);
            float f2 = defaultSharedPreferences.getFloat(this$0.LOCATION_LONG, Float.MIN_VALUE);
            float f3 = defaultSharedPreferences.getFloat(this$0.LOCATION_ALT, Float.MIN_VALUE);
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Reading altitude value: ", java.lang.Float.valueOf(f3)), null, 2, null);
            it.onSuccess(new kotlin.Pair(true, new powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition(f2, f, f3, 0.0d, 0L, 24, null)));
            return;
        }
        it.onSuccess(new kotlin.Pair(false, new powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition(1.401298464324817E-45d, 1.401298464324817E-45d, 1.401298464324817E-45d, 0.0d, 0L, 24, null)));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider
    public boolean isLocationValid(powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gpsPosition) {
        if (gpsPosition != null) {
            if (!(((float) gpsPosition.getLatitude()) == Float.MIN_VALUE)) {
                if (!(((float) gpsPosition.getLongitude()) == Float.MIN_VALUE)) {
                    if (!(((float) gpsPosition.getAltitude()) == Float.MIN_VALUE)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider
    public io.reactivex.Completable updateLocationInternal() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$bw3TpTzzqFQmjONuf9XpfNrje80
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3304updateLocationInternal$lambda12(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            println(\"started location search\")\n            internalLocationUpdateSubject.onNext(Unit)\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateLocationInternal$lambda-12, reason: not valid java name */
    public static final void m3304updateLocationInternal$lambda12(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) "started location search");
        this$0.internalLocationUpdateSubject.onNext(kotlin.Unit.INSTANCE);
    }

    private final io.reactivex.Single<java.lang.Boolean> updateStorage(final android.location.Location location) {
        io.reactivex.Single<java.lang.Boolean> singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$k7IfDIAd56T4Xk4A5pqkmbCyoDQ
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3305updateStorage$lambda13(this.f$0, location, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create {\n            val context = contextWeakReference.get()\n            if (context != null) {\n                debug(\"Storing altitude value: ${location.altitude}\")\n                val sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context)\n                sharedPrefs.edit().putFloat(LOCATION_LAT, location.latitude.toFloat()).commit()\n                sharedPrefs.edit().putFloat(LOCATION_LONG, location.longitude.toFloat()).commit()\n                if (location.hasAltitude()) {\n                    sharedPrefs.edit().putFloat(LOCATION_ALT, location.altitude.toFloat()).commit()\n                }\n            }\n            it.onSuccess(true)\n        }");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateStorage$lambda-13, reason: not valid java name */
    public static final void m3305updateStorage$lambda13(powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl this$0, android.location.Location location, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "$location");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.content.Context context = this$0.contextWeakReference.get();
        if (context != null) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Storing altitude value: ", java.lang.Double.valueOf(location.getAltitude())), null, 2, null);
            android.content.SharedPreferences defaultSharedPreferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(context);
            defaultSharedPreferences.edit().putFloat(this$0.LOCATION_LAT, (float) location.getLatitude()).commit();
            defaultSharedPreferences.edit().putFloat(this$0.LOCATION_LONG, (float) location.getLongitude()).commit();
            if (location.hasAltitude()) {
                defaultSharedPreferences.edit().putFloat(this$0.LOCATION_ALT, (float) location.getAltitude()).commit();
            }
        }
        it.onSuccess(true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider
    public void showDialogForLocation(final android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activityContext);
        final java.lang.String str = "android.settings.LOCATION_SOURCE_SETTINGS";
        builder.setMessage("Please enable Location Services. This step is required to improve GPS data on your watch.").setTitle("Enable Location Services").setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$6cZBnyIS0QhdOWRcqmyo1JoAc8Q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProviderImpl.m3302showDialogForLocation$lambda14(activityContext, str, dialogInterface, i);
            }
        }).setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationInfoProviderImpl$-JFUZfuZGhWQO16eKfGb7mHrRBU
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showDialogForLocation$lambda-14, reason: not valid java name */
    public static final void m3302showDialogForLocation$lambda14(android.content.Context activityContext, java.lang.String action, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "$activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "$action");
        activityContext.startActivity(new android.content.Intent(action));
        dialogInterface.dismiss();
    }
}
