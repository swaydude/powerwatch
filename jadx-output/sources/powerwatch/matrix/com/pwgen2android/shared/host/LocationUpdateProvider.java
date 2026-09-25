package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: LocationUpdateProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001f0\u001eH\u0002J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001eR\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00110\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationUpdateProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "builder", "Lcom/google/android/gms/location/LocationSettingsRequest$Builder;", "kotlin.jvm.PlatformType", "getBuilder", "()Lcom/google/android/gms/location/LocationSettingsRequest$Builder;", "callback", "Lcom/google/android/gms/location/LocationCallback;", "getCallback", "()Lcom/google/android/gms/location/LocationCallback;", "setCallback", "(Lcom/google/android/gms/location/LocationCallback;)V", "client", "Lcom/google/android/gms/location/SettingsClient;", "getClient", "()Lcom/google/android/gms/location/SettingsClient;", "locationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "removeSubject", "Lio/reactivex/subjects/PublishSubject;", "Landroid/location/Location;", "lastLocation", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "register", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LocationUpdateProvider implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final com.google.android.gms.location.LocationSettingsRequest.Builder builder;
    private com.google.android.gms.location.LocationCallback callback;
    private final com.google.android.gms.location.SettingsClient client;
    private final android.content.Context context;
    private final com.google.android.gms.location.FusedLocationProviderClient locationProvider;
    private final com.google.android.gms.location.LocationRequest locationRequest;
    private final io.reactivex.subjects.PublishSubject<android.location.Location> removeSubject;

    public LocationUpdateProvider(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.locationProvider = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(context);
        com.google.android.gms.location.LocationRequest locationRequestCreate = com.google.android.gms.location.LocationRequest.create();
        if (locationRequestCreate == null) {
            locationRequestCreate = null;
        } else {
            locationRequestCreate.setInterval(5000L);
            locationRequestCreate.setFastestInterval(1000L);
            locationRequestCreate.setPriority(100);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        this.locationRequest = locationRequestCreate;
        com.google.android.gms.location.LocationSettingsRequest.Builder builder = new com.google.android.gms.location.LocationSettingsRequest.Builder();
        kotlin.jvm.internal.Intrinsics.checkNotNull(locationRequestCreate);
        this.builder = builder.addLocationRequest(locationRequestCreate);
        this.client = com.google.android.gms.location.LocationServices.getSettingsClient(context);
        io.reactivex.subjects.PublishSubject<android.location.Location> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Location>()");
        this.removeSubject = publishSubjectCreate;
        this.callback = new com.google.android.gms.location.LocationCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(com.google.android.gms.location.LocationResult locationResult) {
                android.location.Location location;
                if (locationResult == null || locationResult.getLocations().size() <= 0 || (location = locationResult.getLocations().get(0)) == null) {
                    return;
                }
                location.getLatitude();
                java.lang.System.out.println((java.lang.Object) ("altitude value: " + location.hasAltitude() + " - " + location.getAltitude()));
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.this.removeSubject.onNext(location);
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.this.locationProvider.removeLocationUpdates(powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.this.getCallback());
            }
        };
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final com.google.android.gms.location.LocationRequest getLocationRequest() {
        return this.locationRequest;
    }

    public final com.google.android.gms.location.LocationSettingsRequest.Builder getBuilder() {
        return this.builder;
    }

    public final com.google.android.gms.location.SettingsClient getClient() {
        return this.client;
    }

    public final com.google.android.gms.location.LocationCallback getCallback() {
        return this.callback;
    }

    public final void setCallback(com.google.android.gms.location.LocationCallback locationCallback) {
        this.callback = locationCallback;
    }

    public final io.reactivex.Single<java.lang.Boolean> register() {
        io.reactivex.Single<java.lang.Boolean> singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$LOY1k4UQE-cqMtwMKw4j79K-KEg
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3315register$lambda3(this.f$0, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create<Boolean> { emitter ->\n\n            var c : LocationCallback? = null\n\n            c = object : LocationCallback() {\n                override fun onLocationResult(locationResult: LocationResult?) {\n                    locationResult ?: return\n                    if (locationResult.locations.size > 0) {\n                        val location = locationResult.locations[0]\n                        if (location != null && location.latitude != null) {\n                            debug(\"altitude value: ${location.hasAltitude()} - ${location.altitude}\")\n                            removeSubject.onNext(location)\n                            locationProvider.removeLocationUpdates(c)\n                        }\n                    }\n                }\n            }\n            client.checkLocationSettings(builder.build())\n                    .addOnSuccessListener {\n                        locationProvider.requestLocationUpdates(locationRequest, c, Looper.getMainLooper())\n                        emitter.onSuccess(true)\n                    }\n                    .addOnFailureListener { exception ->\n                        exception.printStackTrace()\n\n                        if (exception is ResolvableApiException) {\n                            try {\n                                // Show the dialog by calling startResolutionForResult(),\n                                // and check the result in onActivityResult().\n                                //TODO Request location on fragment here\n//                                exception.startResolutionForResult(contextWeakReference.get()!!,\n//                                        13)\n                            } catch (sendEx: IntentSender.SendIntentException) {\n                                // Ignore the error.\n                            }\n                        }\n\n                    }\n\n        }");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider$register$1$1] */
    /* JADX INFO: renamed from: register$lambda-3, reason: not valid java name */
    public static final void m3315register$lambda3(final powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider this$0, final io.reactivex.SingleEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = new com.google.android.gms.location.LocationCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider$register$1$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(com.google.android.gms.location.LocationResult locationResult) {
                android.location.Location location;
                if (locationResult == null || locationResult.getLocations().size() <= 0 || (location = locationResult.getLocations().get(0)) == null) {
                    return;
                }
                location.getLatitude();
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this.this$0, "altitude value: " + location.hasAltitude() + " - " + location.getAltitude(), null, 2, null);
                this.this$0.removeSubject.onNext(location);
                this.this$0.locationProvider.removeLocationUpdates(objectRef.element);
            }
        };
        this$0.getClient().checkLocationSettings(this$0.getBuilder().build()).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$7lpFzmEIHsKnzk0U5IKMMuA3drE
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3316register$lambda3$lambda1(this.f$0, objectRef, emitter, (com.google.android.gms.location.LocationSettingsResponse) obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$kISiR1E1XHmesQi_gqW_wRIw1rc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3317register$lambda3$lambda2(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: register$lambda-3$lambda-1, reason: not valid java name */
    public static final void m3316register$lambda3$lambda1(powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider this$0, kotlin.jvm.internal.Ref.ObjectRef c, io.reactivex.SingleEmitter emitter, com.google.android.gms.location.LocationSettingsResponse locationSettingsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "$c");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        this$0.locationProvider.requestLocationUpdates(this$0.getLocationRequest(), (com.google.android.gms.location.LocationCallback) c.element, android.os.Looper.getMainLooper());
        emitter.onSuccess(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: register$lambda-3$lambda-2, reason: not valid java name */
    public static final void m3317register$lambda3$lambda2(java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        exception.printStackTrace();
        boolean z = exception instanceof com.google.android.gms.common.api.ResolvableApiException;
    }

    private final io.reactivex.Single<kotlin.Pair<java.lang.Boolean, android.location.Location>> lastLocation() {
        io.reactivex.Single<kotlin.Pair<java.lang.Boolean, android.location.Location>> singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$Aeubbrc3ZwDBOTB6OiVK-v_iLcE
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3309lastLocation$lambda6(this.f$0, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create { emitter ->\n            locationProvider.lastLocation\n                    .addOnSuccessListener { location ->\n                        emitter.onSuccess(Pair(true, location))\n                    }\n                    .addOnFailureListener { error ->\n                        error.printStackTrace()\n                        emitter.onError(error)\n                    }\n        }");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lastLocation$lambda-6, reason: not valid java name */
    public static final void m3309lastLocation$lambda6(powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider this$0, final io.reactivex.SingleEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.locationProvider.getLastLocation().addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$nKDaDZLqRJsnEnn_etfjhfMmXmg
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3310lastLocation$lambda6$lambda4(emitter, (android.location.Location) obj);
            }
        }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$P2dpEA_8wBOODaSgpDWBwBMaQ6w
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(java.lang.Exception exc) {
                powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3311lastLocation$lambda6$lambda5(emitter, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lastLocation$lambda-6$lambda-4, reason: not valid java name */
    public static final void m3310lastLocation$lambda6$lambda4(io.reactivex.SingleEmitter emitter, android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        emitter.onSuccess(new kotlin.Pair(true, location));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lastLocation$lambda-6$lambda-5, reason: not valid java name */
    public static final void m3311lastLocation$lambda6$lambda5(io.reactivex.SingleEmitter emitter, java.lang.Exception error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        error.printStackTrace();
        emitter.onError(error);
    }

    public final io.reactivex.Single<android.location.Location> location() {
        io.reactivex.Single<android.location.Location> singleFirstOrError = lastLocation().toObservable().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$QBiQCQlAGR7w8TYJzIgl08rrfzI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3312location$lambda9(this.f$0, (kotlin.Pair) obj);
            }
        }).firstOrError();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "lastLocation()\n                .toObservable()\n                .flatMap {\n                    if (it.second == null) {\n                        register().toObservable()\n                                .flatMap { removeSubject }\n                                .take(1)\n                                .doOnNext { location ->\n                                    println(\"Removing location\")\n                                    locationProvider.removeLocationUpdates(callback)\n                                }\n                    } else Observable.just<Location>(it.second)\n                }\n                .firstOrError()");
        return singleFirstOrError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: location$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3312location$lambda9(final powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider this$0, kotlin.Pair it) {
        io.reactivex.Observable observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it.getSecond() == null) {
            observableJust = this$0.register().toObservable().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$2OdsTgH61SUOJ9L5Hwk5Idp0YlI
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3313location$lambda9$lambda7(this.f$0, (java.lang.Boolean) obj);
                }
            }).take(1L).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.host.-$$Lambda$LocationUpdateProvider$UQf8VFc-jVSI6TreA6ZvGY93TpY
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider.m3314location$lambda9$lambda8(this.f$0, (android.location.Location) obj);
                }
            });
        } else {
            observableJust = io.reactivex.Observable.just(it.getSecond());
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: location$lambda-9$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3313location$lambda9$lambda7(powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider this$0, java.lang.Boolean it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.removeSubject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: location$lambda-9$lambda-8, reason: not valid java name */
    public static final void m3314location$lambda9$lambda8(powerwatch.matrix.com.pwgen2android.shared.host.LocationUpdateProvider this$0, android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) "Removing location");
        this$0.locationProvider.removeLocationUpdates(this$0.getCallback());
    }
}
