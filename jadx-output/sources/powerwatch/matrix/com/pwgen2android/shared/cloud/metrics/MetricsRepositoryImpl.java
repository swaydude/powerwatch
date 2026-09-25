package powerwatch.matrix.com.pwgen2android.shared.cloud.metrics;

/* JADX INFO: compiled from: MetricsRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\"H\u0016R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "deviceEventBuilder", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "metricsService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "context", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventBuilder;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/content/Context;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "sendingSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;", "kotlin.jvm.PlatformType", "getCountryCode", "Lio/reactivex/Single;", "", "loadDeviceForLogging", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;", "logDevice", "loadUserData", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/UserData;", "logEvent", "", "item", "logOTAEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/DeviceOTALogEvent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MetricsRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder deviceEventBuilder;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService metricsService;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent> sendingSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-11, reason: not valid java name */
    public static final void m3057_init_$lambda11() {
    }

    public MetricsRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder deviceEventBuilder, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsService metricsService, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceEventBuilder, "deviceEventBuilder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsService, "metricsService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.deviceEventBuilder = deviceEventBuilder;
        this.userAccountRepository = userAccountRepository;
        this.metricsService = metricsService;
        this.deviceRepository = deviceRepository;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<LogEvent>()");
        this.sendingSubject = publishSubjectCreate;
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.disposable = compositeDisposable;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(context);
        compositeDisposable.add(publishSubjectCreate.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$WuViSgV5y2ZqDliY4XBsaQLcKBg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3059_init_$lambda5((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent) obj);
            }
        }).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$MjMqXcbUGFMZzag1q6lVxsvw40c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3056_init_$lambda10(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent) obj);
            }
        }).retry().repeat().subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$qh30oSQU2IUzBrwaf3HHUS7q1Gg
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3057_init_$lambda11();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$7sTsHy_wSPedsKY12_RkLWqZfgA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final io.reactivex.Single<java.lang.String> getCountryCode() {
        io.reactivex.Single<java.lang.String> singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$tXNarlzG_pYKJgJyzsmeUBxp2tY
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3060getCountryCode$lambda0(singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create<String> {\n//            val tm = contextWeakReference.get()?.getSystemService(TELEPHONY_SERVICE) as TelephonyManager\n//            val countryCodeValue = tm.networkCountryIso ?: \"US\"\n//            it.onSuccess(countryCodeValue)\n            it.onSuccess(TimeZone.getDefault().id)\n        }");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCountryCode$lambda-0, reason: not valid java name */
    public static final void m3060getCountryCode$lambda0(io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.onSuccess(java.util.TimeZone.getDefault().getID());
    }

    private final io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData> loadUserData() {
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData> singleFlatMap = powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, false, 3, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$DRWoPEtQhZH3mvOVEoEx-ERguYY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3068loadUserData$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "userAccountRepository.getFirst()\n                .flatMap {user ->\n                    getCountryCode().map { UserData(user.email, it) }\n                }");
        return singleFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadUserData$lambda-2, reason: not valid java name */
    public static final io.reactivex.SingleSource m3068loadUserData$lambda2(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
        return this$0.getCountryCode().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$mTnsw4JYaomGNnu4nxdyOoUNSH0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3069loadUserData$lambda2$lambda1(user, (java.lang.String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadUserData$lambda-2$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData m3069loadUserData$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "$user");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData(user.getEmail(), it);
    }

    private final io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice> loadDeviceForLogging(final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice logDevice) {
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice> singleDefer = io.reactivex.Single.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$SblnsUdaHp7_biJeKHHDUG1MUZs
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3066loadDeviceForLogging$lambda4(logDevice, this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefer, "defer<LogDevice> {\n            if (logDevice == null) {\n                if (deviceRepository.isEmpty()) Single.just(LogDevice(\"\", \"\"))\n                else deviceRepository.defaultDevice()\n                        .map { LogDevice(it.bluetoothAddress, it.firmwareVersion) }\n            } else Single.just(logDevice)\n        }");
        return singleDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadDeviceForLogging$lambda-4, reason: not valid java name */
    public static final io.reactivex.SingleSource m3066loadDeviceForLogging$lambda4(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice logDevice, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl this$0) {
        io.reactivex.Single singleJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (logDevice == null) {
            singleJust = this$0.deviceRepository.isEmpty() ? io.reactivex.Single.just(new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice("", "")) : this$0.deviceRepository.defaultDevice().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$pR759A8GZ3TpNSR2GT8d8nYhzjc
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3067loadDeviceForLogging$lambda4$lambda3((powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
                }
            });
        } else {
            singleJust = io.reactivex.Single.just(logDevice);
        }
        return singleJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadDeviceForLogging$lambda-4$lambda-3, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice m3067loadDeviceForLogging$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.shared.data.models.Device it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice(it.getBluetoothAddress(), it.getFirmwareVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-5, reason: not valid java name */
    public static final void m3059_init_$lambda5(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent logEvent) {
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("Received new metrics event: ", logEvent.getDeviceEventType().getEventType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-10, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3056_init_$lambda10(final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this$0.loadUserData().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$fPCwPg28U62znV_uAaHGcDDo1uo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3062lambda10$lambda7(this.f$0, item, (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$dFjJ2kPpYP0uXvQohFkOv15a5I0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3064lambda10$lambda8(item, this$0, (kotlin.Pair) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$fEY_0NEyksdI3MDd6zFfQd7ubkc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3065lambda10$lambda9(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-7, reason: not valid java name */
    public static final io.reactivex.SingleSource m3062lambda10$lambda7(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent item, final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData userData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "userData");
        return this$0.loadDeviceForLogging(item.getLogDevice()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.-$$Lambda$MetricsRepositoryImpl$rLf9vOkJavCSKcl_mxeDgudfw0E
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl.m3063lambda10$lambda7$lambda6(userData, (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-7$lambda-6, reason: not valid java name */
    public static final kotlin.Pair m3063lambda10$lambda7$lambda6(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData userData, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "$userData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(userData, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-8, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEvent m3064lambda10$lambda8(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent item, powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl this$0, kotlin.Pair userData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$item");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userData, "userData");
        if (item instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent) {
            powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType deviceEventType = item.getDeviceEventType();
            java.lang.String deviceId = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice) userData.getSecond()).getDeviceId();
            java.lang.String firmwareVersion = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice) userData.getSecond()).getFirmwareVersion();
            powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent deviceOTALogEvent = (powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent) item;
            java.lang.String firmwareVersionFrom = deviceOTALogEvent.getFirmwareVersionFrom();
            java.lang.String firmwareVersionTo = deviceOTALogEvent.getFirmwareVersionTo();
            java.lang.String id = java.util.TimeZone.getDefault().getID();
            java.lang.String country = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData) userData.getFirst()).getCountry();
            java.lang.String email = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData) userData.getFirst()).getEmail();
            powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus eventStatus = item.getEventStatus();
            powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder deviceEventBuilder = this$0.deviceEventBuilder;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "id");
            return deviceEventBuilder.createDeviceOTAEvent(deviceEventType, eventStatus, email, deviceId, firmwareVersion, firmwareVersionFrom, firmwareVersionTo, id, country, (512 & 512) != 0 ? java.lang.System.currentTimeMillis() : 0L);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventType deviceEventType2 = item.getDeviceEventType();
        java.lang.String deviceId2 = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice) userData.getSecond()).getDeviceId();
        java.lang.String firmwareVersion2 = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogDevice) userData.getSecond()).getFirmwareVersion();
        java.lang.String id2 = java.util.TimeZone.getDefault().getID();
        java.lang.String country2 = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData) userData.getFirst()).getCountry();
        java.lang.String email2 = ((powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.UserData) userData.getFirst()).getEmail();
        powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventStatus eventStatus2 = item.getEventStatus();
        powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEventBuilder deviceEventBuilder2 = this$0.deviceEventBuilder;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "id");
        return deviceEventBuilder2.createEvent(deviceEventType2, eventStatus2, email2, deviceId2, firmwareVersion2, id2, country2, (128 & 128) != 0 ? java.lang.System.currentTimeMillis() : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-10$lambda-9, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3065lambda10$lambda9(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepositoryImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.metrics.DeviceEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService.DefaultImpls.add$default(this$0.metricsService, kotlin.collections.CollectionsKt.listOf(event), null, 2, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository
    public void logEvent(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.LogEvent item) {
        // --- PATCHED: bypass cloud ---
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository
    public void logOTAEvent(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.DeviceOTALogEvent item) {
        // --- PATCHED: bypass cloud ---
    }
}
