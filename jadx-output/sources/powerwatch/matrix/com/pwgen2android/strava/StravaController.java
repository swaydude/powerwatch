package powerwatch.matrix.com.pwgen2android.strava;

/* JADX INFO: compiled from: StravaController.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u000bJ\u0010\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)J\u0012\u0010*\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010)J\u0006\u0010+\u001a\u00020!J\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0-J\u0014\u0010.\u001a\u00020!2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u001c\u00100\u001a\b\u0012\u0004\u0012\u0002010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001f \f*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "appContext", "Landroid/content/Context;", "stravaCloud", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/StravaCloud;)V", "authScope", "", "authSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "clientID", "clientSecret", "code", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "readScope", "scheduler", "Lio/reactivex/Scheduler;", "scopeKey", "stravaLinkHost", "stravaLinkScheme", "tcxWriter", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXWriter;", "writer", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXXMLWriter;", "writingSubject", "Lio/reactivex/subjects/PublishSubject;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "authorize", "", "activityContext", "getAccessAndRefreshToken", "authInfo", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;", "hasAuthorize", "isValidIntent", "intent", "Landroid/content/Intent;", "parseIntent", "revoke", "subscribeToAuthorize", "Lio/reactivex/Observable;", "writeSessionList", "sessionList", "writeToGPXFormat", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/auth/UploadData;", "writeToTCXFormat", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StravaController implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.lang.String authScope;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> authSubject;
    private final java.lang.String clientID;
    private final java.lang.String clientSecret;
    private final java.lang.String code;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final java.lang.String readScope;
    private final io.reactivex.Scheduler scheduler;
    private final java.lang.String scopeKey;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud stravaCloud;
    private final java.lang.String stravaLinkHost;
    private final java.lang.String stravaLinkScheme;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXWriter tcxWriter;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXXMLWriter writer;
    private final io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> writingSubject;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    public static final void m3628_init_$lambda4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-5, reason: not valid java name */
    public static final void m3629_init_$lambda5(java.lang.Throwable th) {
    }

    public StravaController(android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud stravaCloud) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaCloud, "stravaCloud");
        this.stravaCloud = stravaCloud;
        this.writer = new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXXMLWriter();
        this.tcxWriter = new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXWriter();
        java.lang.String string = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.strava_link_host);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "appContext.getString(R.string.strava_link_host)");
        this.stravaLinkHost = string;
        java.lang.String string2 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.strava_link_scheme);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "appContext.getString(R.string.strava_link_scheme)");
        this.stravaLinkScheme = string2;
        java.lang.String string3 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.client_id);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "appContext.getString(R.string.client_id)");
        this.clientID = string3;
        java.lang.String string4 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.client_secret);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "appContext.getString(R.string.client_secret)");
        this.clientSecret = string4;
        this.authScope = "activity:write";
        this.readScope = "read";
        this.scopeKey = "scope";
        this.code = "code";
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.disposable = compositeDisposable;
        io.reactivex.subjects.BehaviorSubject<java.lang.Boolean> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(false)");
        this.authSubject = behaviorSubjectCreateDefault;
        io.reactivex.subjects.PublishSubject<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<List<UserActivitySession>>()");
        this.writingSubject = publishSubjectCreate;
        io.reactivex.Scheduler schedulerFrom = io.reactivex.schedulers.Schedulers.from(java.util.concurrent.Executors.newSingleThreadExecutor());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(schedulerFrom, "from(Executors.newSingleThreadExecutor())");
        this.scheduler = schedulerFrom;
        behaviorSubjectCreateDefault.onNext(java.lang.Boolean.valueOf(stravaCloud.hasToken()));
        compositeDisposable.add(publishSubjectCreate.concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$mjViwjeUVGnlf31tMukJmobZY5w
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.strava.StravaController.m3626_init_$lambda2(this.f$0, (java.util.List) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$SdTBR-jxECRpQ-C12cK7rs1zKE8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3627_init_$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribeOn(schedulerFrom).repeat().retry().subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$AV8gZzBXIuq5fFKuDQ0VnF5M5d4
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3628_init_$lambda4();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$QGun7feqIA9QPJyo68op511R2ic
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3629_init_$lambda5((java.lang.Throwable) obj);
            }
        }));
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3626_init_$lambda2(final powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, java.util.List sessionList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionList, "sessionList");
        if (this$0.stravaCloud.hasToken()) {
            return this$0.writeToTCXFormat(sessionList).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$7PJ0Vq1hmVoXRtwTrZZNeaySkwY
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.strava.StravaController.m3637lambda2$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData) obj);
                }
            });
        }
        return io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$sk3f_M5cqTBxCBUpVGd2eQSQTSU
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3638lambda2$lambda1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-2$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3637lambda2$lambda0(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.stravaCloud.uploadActivity(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-2$lambda-1, reason: not valid java name */
    public static final void m3638lambda2$lambda1(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Strava is not enabled, token missing", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m3627_init_$lambda3(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Error in Strava activity processing: ", th.getClass().getSimpleName()), th, null, 4, null);
    }

    public final void authorize(android.content.Context activityContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        activityContext.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.strava.com/oauth/mobile/authorize").buildUpon().appendQueryParameter("redirect_uri", this.stravaLinkScheme + "://" + this.stravaLinkHost).appendQueryParameter("client_id", this.clientID).appendQueryParameter("response_type", this.code).appendQueryParameter("approval_prompt", kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO).appendQueryParameter(this.scopeKey, this.authScope).build()));
    }

    public final powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo parseIntent(android.content.Intent intent) {
        android.net.Uri data = intent == null ? null : intent.getData();
        return new powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo(data == null ? null : data.getQueryParameter(this.code), data != null ? data.getQueryParameter(this.scopeKey) : null);
    }

    public final boolean isValidIntent(android.content.Intent intent) {
        powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo intent2 = parseIntent(intent);
        return (intent2 == null ? null : intent2.getCode()) != null;
    }

    public final io.reactivex.Observable<java.lang.Boolean> subscribeToAuthorize() {
        return this.authSubject;
    }

    public final boolean hasAuthorize() {
        return this.stravaCloud.hasToken();
    }

    public final void getAccessAndRefreshToken(powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo authInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authInfo, "authInfo");
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.StravaCloud stravaCloud = this.stravaCloud;
        java.lang.String str = this.clientID;
        java.lang.String str2 = this.clientSecret;
        java.lang.String code = authInfo.getCode();
        kotlin.jvm.internal.Intrinsics.checkNotNull(code);
        stravaCloud.login(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost(str, str2, code, null, 8, null)).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$TomZ35RRToRndSari1h11aMEEj0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3630getAccessAndRefreshToken$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$RwiuBVmMa58KhdAws81N-6Eytxk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3631getAccessAndRefreshToken$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAccessAndRefreshToken$lambda-6, reason: not valid java name */
    public static final void m3630getAccessAndRefreshToken$lambda6(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaPasswordCredentials stravaPasswordCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("Auth success : ", stravaPasswordCredentials));
        this$0.authSubject.onNext(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAccessAndRefreshToken$lambda-7, reason: not valid java name */
    public static final void m3631getAccessAndRefreshToken$lambda7(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.authSubject.onNext(false);
        th.printStackTrace();
    }

    public final void revoke() {
        this.stravaCloud.logout(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.StravaHost(this.clientID, this.clientSecret, "", null, 8, null)).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$EMESRixU8wL4kjIPGgBCGOvW7qk
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3639revoke$lambda8(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$rFWyHneauqIC-2Dja4-2R37-Xds
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3640revoke$lambda9(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: revoke$lambda-8, reason: not valid java name */
    public static final void m3639revoke$lambda8(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.authSubject.onNext(java.lang.Boolean.valueOf(this$0.stravaCloud.hasToken()));
        java.lang.System.out.println((java.lang.Object) "Revoke success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: revoke$lambda-9, reason: not valid java name */
    public static final void m3640revoke$lambda9(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.authSubject.onNext(java.lang.Boolean.valueOf(this$0.stravaCloud.hasToken()));
        th.printStackTrace();
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData> writeToTCXFormat(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> sessionList) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData> observableDoOnError = io.reactivex.Observable.fromIterable(sessionList).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$r6UoTp7GNca2ACYHZU5_pl_i3qc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.strava.StravaController.m3643writeToTCXFormat$lambda16(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$GRwMoyxg--fZSPlAm0NKiK7nOm4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3644writeToTCXFormat$lambda17(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$n2kjZVQFb2X2CaM3BOJaPCMcdsM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3645writeToTCXFormat$lambda18(this.f$0, (java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnError, "fromIterable(sessionList)\n                .map {\n                    val points = it.gpsPositions\n                            .zip(it.heartRates)\n                            .map {positionHeartPair ->\n                                val position = positionHeartPair.first\n                                val heartRate = positionHeartPair.second\n                                TCXPoint(position.latitude, position.longitude, heartRate.value, position.timestamp)\n                            }\n\n                    //collect all distances between dots\n                    val distances = it.gpsPositions.filter { it.latitude != 0.0 && it.longitude != 0.0 }.zipWithNext { first, second ->\n                        first.toLocation().distanceTo(second.toLocation())\n                    }\n\n                    //set distance from start to each point, max to total distance of activity\n                    distances.foldIndexed(0f) { index, result, tempDistance ->\n                        points.getOrNull(index)?.distanceFromStart = if (result > it.distance) it.distance else result\n                        result + tempDistance\n                    }\n\n                    points.last().distanceFromStart = it.distance\n\n                    val maxHeartRate = it.heartRates.maxByOrNull { heartRate -> heartRate.value }?.value ?: 0\n                    val avgHeartRate = it.heartRates.map { heartRate -> heartRate.value }.average().toInt()\n\n                    val tcxData = TCXActivity(points, it.distance, getTCXType(it.activityType),\n                            it.startTime, it.endTime, it.activeCalories, it.bmrCalories,\n                            avgHeartRate, maxHeartRate)\n                    val gpxDataString = tcxWriter.write(tcxData)\n\n                    UploadData(it.name, \"\", gpxDataString, \"default\")\n                }\n                .doOnNext {\n                    debug(\"Strava upload data created\", this)\n                }\n                .doOnError { error(\"Error in Strava format creation: ${it.javaClass.simpleName}\", it) }");
        return observableDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeToTCXFormat$lambda-16, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData m3643writeToTCXFormat$lambda16(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) {
        java.util.List listEmptyList;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(it.getGpsPositions(), it.getHeartRates());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (kotlin.Pair pair : listZip) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) pair.getFirst();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint(gPSPosition.getLatitude(), gPSPosition.getLongitude(), ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) pair.getSecond()).getValue(), gPSPosition.getTimestamp(), 0.0f, 16, null));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gpsPositions = it.getGpsPositions();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = gpsPositions.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition2 = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next;
            if (!(gPSPosition2.getLatitude() == 0.0d)) {
                if (!(gPSPosition2.getLongitude() == 0.0d)) {
                    z = true;
                }
            }
            if (z) {
                arrayList3.add(next);
            }
        }
        java.util.Iterator it3 = arrayList3.iterator();
        if (it3.hasNext()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.Object next2 = it3.next();
            while (it3.hasNext()) {
                java.lang.Object next3 = it3.next();
                arrayList4.add(java.lang.Float.valueOf(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toLocation((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next2).distanceTo(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toLocation((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) next3))));
                next2 = next3;
            }
            listEmptyList = arrayList4;
        } else {
            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        float f = 0.0f;
        int i = 0;
        for (java.lang.Object obj2 : listEmptyList) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((java.lang.Number) obj2).floatValue();
            powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint tCXPoint = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint) kotlin.collections.CollectionsKt.getOrNull(arrayList2, i);
            if (tCXPoint != null) {
                tCXPoint.setDistanceFromStart(f > it.getDistance() ? it.getDistance() : f);
            }
            f += fFloatValue;
            i = i2;
        }
        ((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)).setDistanceFromStart(it.getDistance());
        java.util.Iterator<T> it4 = it.getHeartRates().iterator();
        if (it4.hasNext()) {
            java.lang.Object next4 = it4.next();
            if (it4.hasNext()) {
                int value = ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next4).getValue();
                do {
                    java.lang.Object next5 = it4.next();
                    int value2 = ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) next5).getValue();
                    if (value < value2) {
                        next4 = next5;
                        value = value2;
                    }
                } while (it4.hasNext());
            }
            obj = next4;
        } else {
            obj = null;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate = (powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) obj;
        int value3 = heartRate == null ? 0 : heartRate.getValue();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = it.getHeartRates();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(heartRates, 10));
        java.util.Iterator<T> it5 = heartRates.iterator();
        while (it5.hasNext()) {
            arrayList5.add(java.lang.Integer.valueOf(((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) it5.next()).getValue()));
        }
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData(it.getName(), "", this$0.tcxWriter.write(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity(arrayList2, it.getDistance(), powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXWriterKt.getTCXType(it.getActivityType()), it.getStartTime(), it.getEndTime(), it.getActiveCalories(), it.getBmrCalories(), (int) kotlin.collections.CollectionsKt.averageOfInt(arrayList5), value3, 0.0f, 512, null)), "default");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeToTCXFormat$lambda-17, reason: not valid java name */
    public static final void m3644writeToTCXFormat$lambda17(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData uploadData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug(this$0, "Strava upload data created", this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeToTCXFormat$lambda-18, reason: not valid java name */
    public static final void m3645writeToTCXFormat$lambda18(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Error in Strava format creation: ", th.getClass().getSimpleName()), th, null, 4, null);
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData> writeToGPXFormat(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> sessionList) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData> observableDoOnNext = io.reactivex.Observable.fromIterable(sessionList).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$ej2p704HLr7hg8TJWKkCKLtEOkg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.strava.StravaController.m3641writeToGPXFormat$lambda20(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.strava.-$$Lambda$StravaController$iKiXNrZtq-A622WM3_T4bNE5kX4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.strava.StravaController.m3642writeToGPXFormat$lambda21(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "fromIterable(sessionList)\n//                .filter { it.gpsPositions.isNotEmpty() }//TODO Add support for only heart rates too\n                .map {\n                    val activityName = it.name\n                    val points = it.gpsPositions\n                            .zip(it.heartRates)\n                            .map { positionHeartPair ->\n                                val position = positionHeartPair.first\n                                val heartRate = positionHeartPair.second\n                                GPXPoint(position.latitude, position.longitude, heartRate.value, position.timestamp)\n                            }\n\n                    val gpxData = GPXData(points)\n                    val gpxDataString = writer.writeGPX(gpxData)\n\n                    UploadData(it.name, \"\", gpxDataString, \"default\")\n                }\n                .doOnNext {\n                    debug(\"===========Strava format=============\", this)\n                    debug(it.data)\n                }");
        return observableDoOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeToGPXFormat$lambda-20, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData m3641writeToGPXFormat$lambda20(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession it) throws javax.xml.transform.TransformerException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        it.getName();
        java.util.List<kotlin.Pair> listZip = kotlin.collections.CollectionsKt.zip(it.getGpsPositions(), it.getHeartRates());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (kotlin.Pair pair : listZip) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) pair.getFirst();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint(gPSPosition.getLatitude(), gPSPosition.getLongitude(), ((powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate) pair.getSecond()).getValue(), gPSPosition.getTimestamp()));
        }
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData(it.getName(), "", this$0.writer.writeGPX(new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData(arrayList)), "default");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeToGPXFormat$lambda-21, reason: not valid java name */
    public static final void m3642writeToGPXFormat$lambda21(powerwatch.matrix.com.pwgen2android.strava.StravaController this$0, powerwatch.matrix.com.pwgen2android.shared.cloud.strava.auth.UploadData uploadData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController = this$0;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug(stravaController, "===========Strava format=============", this$0);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(stravaController, uploadData.getData(), null, 2, null);
    }

    public final void writeSessionList(java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> sessionList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionList, "sessionList");
        this.writingSubject.onNext(sessionList);
    }
}
