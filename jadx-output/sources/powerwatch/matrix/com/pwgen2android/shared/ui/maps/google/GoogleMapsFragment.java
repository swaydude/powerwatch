package powerwatch.matrix.com.pwgen2android.shared.ui.maps.google;

/* JADX INFO: compiled from: GoogleMapsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u00015B\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\u001e\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u0003H\u0014J\b\u0010%\u001a\u00020#H\u0014J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0017J\b\u0010.\u001a\u00020\u001cH\u0016J\b\u0010/\u001a\u00020\u001cH\u0016J\u001c\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010'2\b\u00103\u001a\u0004\u0018\u000104H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentMapsBinding;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "Landroid/view/View$OnTouchListener;", "()V", "endLocationMarker", "Lcom/google/android/gms/maps/model/Marker;", "handler", "Landroid/os/Handler;", "lastLocation", "Lcom/google/android/gms/maps/model/LatLng;", "mapInstance", "Lcom/google/android/gms/maps/GoogleMap;", "mapsViewModel", "getMapsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "mapsViewModel$delegate", "Lkotlin/Lazy;", "startLocationMarker", "computeLocation", "nextLocation", "step", "", "runningAnimation", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;", "drawColorMap", "", "googleMap", "data", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/MapPosition;", "drawMap", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onTouch", "", "view", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoogleMapsFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentMapsBinding, powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable, android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.Companion(null);
    private static final java.lang.String ZOOM_ENABLED = "zoom_enabled";
    private com.google.android.gms.maps.model.Marker endLocationMarker;
    private com.google.android.gms.maps.model.LatLng lastLocation;
    private com.google.android.gms.maps.GoogleMap mapInstance;
    private com.google.android.gms.maps.model.Marker startLocationMarker;
    private android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: mapsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mapsViewModel = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment$mapsViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel invoke() {
            androidx.fragment.app.Fragment parentFragment = this.this$0.getParentFragment();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parentFragment);
            androidx.lifecycle.ViewModel viewModel = androidx.lifecycle.ViewModelProviders.of(parentFragment).get(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModel, "of(parentFragment!!).get(BaseMapViewModel::class.java)");
            return (powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel) viewModel;
        }
    });

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment newInstance(boolean z) {
        return INSTANCE.newInstance(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-8, reason: not valid java name */
    public static final void m3510onCreateView$lambda8(java.lang.Throwable th) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_maps;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel getMapsViewModel() {
        return (powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel) this.mapsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel getViewModel() {
        return getMapsViewModel();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        android.view.ViewParent parent;
        android.view.ViewParent parent2;
        java.lang.Integer numValueOf = event == null ? null : java.lang.Integer.valueOf(event.getAction());
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (view != null && (parent2 = view.getParent()) != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        } else if (view != null && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.os.Bundle arguments = getArguments();
        final boolean z = arguments == null ? false : arguments.getBoolean(ZOOM_ENABLED);
        if (z) {
            viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.transparent_touch_panel).setOnTouchListener(this);
        }
        if (getChildFragmentManager().findFragmentById(powerwatch.matrix.com.pwgen2android.R.id.map_view) == null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.map_view);
            if (z) {
                frameLayout.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$q_8Px2g8HN6BIqO_5HtBMxMJAqY
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        return powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3500onCreateView$lambda0(view, motionEvent);
                    }
                });
            }
            final powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment supportMapFragmentNewInstance = powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.newInstance();
            getMapsViewModel().getShowProgressField().set(true);
            getChildFragmentManager().beginTransaction().add(powerwatch.matrix.com.pwgen2android.R.id.map_view, supportMapFragmentNewInstance).commitAllowingStateLoss();
            getCompositeDisposable().add(io.reactivex.Observable.combineLatest(io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$WAY0lTJbQvf51fa4dkw5_Df_E-w
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3503onCreateView$lambda2(supportMapFragmentNewInstance, this, observableEmitter);
                }
            }), getMapsViewModel().getLocationsSubject().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$ssJS652sw1CsiV3wgL7ixX1h0LE
                @Override // io.reactivex.functions.Predicate
                public final boolean test(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3505onCreateView$lambda3((java.util.List) obj);
                }
            }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$zCAXZDueJ0Kzp0UPJ8O5T73y_4A
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3506onCreateView$lambda4(this.f$0, (java.lang.Throwable) obj);
                }
            }), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$ThQimpgeEK7fs36SRzpjvXqi-ds
                @Override // io.reactivex.functions.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3507onCreateView$lambda5((com.google.android.gms.maps.GoogleMap) obj, (java.util.List) obj2);
                }
            }).delay(300L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$1TV2x2fsVQH5QUNnXeXpvU4ki50
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3508onCreateView$lambda7(this.f$0, z, (kotlin.Pair) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$-_Hxm-UyEKF-XZ1kcSwpPC20dUQ
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3510onCreateView$lambda8((java.lang.Throwable) obj);
                }
            }));
        }
        getMapsViewModel().getZoomEnabled().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.onCreateView.8
            @Override // androidx.databinding.Observable.OnPropertyChangedCallback
            public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                java.lang.Boolean bool = powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.this.getMapsViewModel().getZoomEnabled().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
                boolean zBooleanValue = bool.booleanValue();
                com.google.android.gms.maps.GoogleMap googleMap = powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.this.mapInstance;
                com.google.android.gms.maps.UiSettings uiSettings = googleMap == null ? null : googleMap.getUiSettings();
                if (uiSettings != null) {
                    uiSettings.setZoomGesturesEnabled(zBooleanValue);
                }
                com.google.android.gms.maps.GoogleMap googleMap2 = powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.this.mapInstance;
                com.google.android.gms.maps.UiSettings uiSettings2 = googleMap2 != null ? googleMap2.getUiSettings() : null;
                if (uiSettings2 == null) {
                    return;
                }
                uiSettings2.setScrollGesturesEnabled(zBooleanValue);
            }
        });
        getCompositeDisposable().add(getMapsViewModel().getLocationAnimationObservable().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$dxBzN1FE0nEU8LeS6psEUjTZgrY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3501onCreateView$lambda10(this.f$0, (kotlin.Pair) obj);
            }
        }));
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel mapsViewModel = getMapsViewModel();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        mapsViewModel.onCreateView(context);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final boolean m3500onCreateView$lambda0(android.view.View view, android.view.MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m3503onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment supportMapFragment, final powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment this$0, final io.reactivex.ObservableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        supportMapFragment.getMapAsync(new com.google.android.gms.maps.OnMapReadyCallback() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$nQlH3cIjT_RtMPwmBKGktg4JH4w
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3504onCreateView$lambda2$lambda1(this.f$0, emitter, googleMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2$lambda-1, reason: not valid java name */
    public static final void m3504onCreateView$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment this$0, io.reactivex.ObservableEmitter emitter, com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "$emitter");
        this$0.mapInstance = googleMap;
        emitter.onNext(googleMap);
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final boolean m3505onCreateView$lambda3(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !it.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-4, reason: not valid java name */
    public static final void m3506onCreateView$lambda4(powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error while loading activity maps. Error is: ", th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-5, reason: not valid java name */
    public static final kotlin.Pair m3507onCreateView$lambda5(com.google.android.gms.maps.GoogleMap map, java.util.List locations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "map");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locations, "locations");
        return new kotlin.Pair(map, locations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-7, reason: not valid java name */
    public static final void m3508onCreateView$lambda7(final powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment this$0, final boolean z, final kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$4cQO4VZiID3YM7WF4-bnRWRWkzw
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3509onCreateView$lambda7$lambda6(pair, this$0, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-7$lambda-6, reason: not valid java name */
    public static final void m3509onCreateView$lambda7$lambda6(kotlin.Pair pair, powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment this$0, boolean z) {
        com.google.android.gms.maps.model.Marker markerAddMarker;
        com.google.android.gms.maps.UiSettings uiSettings;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.google.android.gms.maps.GoogleMap googleMap = (com.google.android.gms.maps.GoogleMap) pair.getFirst();
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition> list = (java.util.List) pair.getSecond();
        this$0.getMapsViewModel().getShowProgressField().set(true);
        googleMap.clear();
        this$0.drawMap(googleMap, list);
        this$0.lastLocation = list.get(0).getPosition();
        com.google.android.gms.maps.model.LatLng position = ((powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition) kotlin.collections.CollectionsKt.last((java.util.List) list)).getPosition();
        com.google.android.gms.maps.GoogleMap googleMap2 = this$0.mapInstance;
        if (googleMap2 == null) {
            markerAddMarker = null;
        } else {
            com.google.android.gms.maps.model.MarkerOptions markerOptionsIcon = new com.google.android.gms.maps.model.MarkerOptions().icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(120.0f));
            com.google.android.gms.maps.model.LatLng latLng = this$0.lastLocation;
            if (latLng == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("lastLocation");
                throw null;
            }
            markerAddMarker = googleMap2.addMarker(markerOptionsIcon.position(latLng));
        }
        this$0.startLocationMarker = markerAddMarker;
        com.google.android.gms.maps.GoogleMap googleMap3 = this$0.mapInstance;
        this$0.endLocationMarker = googleMap3 != null ? googleMap3.addMarker(new com.google.android.gms.maps.model.MarkerOptions().icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker()).position(position)) : null;
        com.google.android.gms.maps.GoogleMap googleMap4 = this$0.mapInstance;
        if (googleMap4 != null && (uiSettings = googleMap4.getUiSettings()) != null) {
            uiSettings.setAllGesturesEnabled(z);
        }
        this$0.getMapsViewModel().getShowProgressField().set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-10, reason: not valid java name */
    public static final void m3501onCreateView$lambda10(final powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment this$0, final kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        final com.google.android.gms.maps.model.LatLng latLngComputeLocation = this$0.computeLocation((powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) pair.getFirst());
        this$0.handler.post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.-$$Lambda$GoogleMapsFragment$M9Jiv7mnRhUPNTDHE44eLuOLoy4
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.m3502onCreateView$lambda10$lambda9(this.f$0, latLngComputeLocation, pair);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-10$lambda-9, reason: not valid java name */
    public static final void m3502onCreateView$lambda10$lambda9(powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment this$0, com.google.android.gms.maps.model.LatLng latLng, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(latLng, "$latLng");
        com.google.android.gms.maps.model.Marker marker = this$0.startLocationMarker;
        if (marker != null) {
            marker.setPosition(latLng);
        }
        if (((java.lang.Boolean) pair.getSecond()).booleanValue()) {
            com.google.android.gms.maps.GoogleMap googleMap = this$0.mapInstance;
            if (googleMap == null) {
                return;
            }
            googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(latLng, 15.5f), 1, null);
            return;
        }
        com.google.android.gms.maps.GoogleMap googleMap2 = this$0.mapInstance;
        if (googleMap2 == null) {
            return;
        }
        googleMap2.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng), 1, null);
    }

    private final com.google.android.gms.maps.model.LatLng computeLocation(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation) {
        com.google.android.gms.maps.model.LatLng latLngComputeOffset = com.google.maps.android.SphericalUtil.computeOffset(new com.google.android.gms.maps.model.LatLng(runningAnimation.getLastLocation().getLatitude(), runningAnimation.getLastLocation().getLongitude()), runningAnimation.getStep(), com.google.maps.android.SphericalUtil.computeHeading(new com.google.android.gms.maps.model.LatLng(runningAnimation.getLastLocation().getLatitude(), runningAnimation.getLastLocation().getLongitude()), new com.google.android.gms.maps.model.LatLng(runningAnimation.getNextLocation().getLatitude(), runningAnimation.getNextLocation().getLongitude())));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(latLngComputeOffset, "computeOffset(\n                LatLng(runningAnimation.lastLocation.latitude, runningAnimation.lastLocation.longitude),\n                runningAnimation.step,\n                heading\n        )");
        return latLngComputeOffset;
    }

    private final com.google.android.gms.maps.model.LatLng computeLocation(com.google.android.gms.maps.model.LatLng lastLocation, com.google.android.gms.maps.model.LatLng nextLocation, double step) {
        com.google.android.gms.maps.model.LatLng latLngComputeOffset = com.google.maps.android.SphericalUtil.computeOffset(new com.google.android.gms.maps.model.LatLng(lastLocation.latitude, lastLocation.longitude), step, com.google.maps.android.SphericalUtil.computeHeading(new com.google.android.gms.maps.model.LatLng(lastLocation.latitude, lastLocation.longitude), new com.google.android.gms.maps.model.LatLng(nextLocation.latitude, nextLocation.longitude)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(latLngComputeOffset, "computeOffset(\n                LatLng(lastLocation.latitude, lastLocation.longitude),\n                step,\n                heading\n        )");
        return latLngComputeOffset;
    }

    private final void drawColorMap(com.google.android.gms.maps.GoogleMap googleMap, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition> data) {
        com.google.android.gms.maps.model.PolylineOptions polylineOptionsColor = new com.google.android.gms.maps.model.PolylineOptions().color(android.graphics.Color.parseColor("#4CD964"));
        java.util.Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            polylineOptionsColor.add(((powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition) it.next()).getPosition());
        }
        googleMap.addPolyline(polylineOptionsColor);
    }

    private final void drawMap(com.google.android.gms.maps.GoogleMap googleMap, java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition> data) {
        drawColorMap(googleMap, data);
        googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(data.get(0).getPosition(), 15.5f), 1, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getCompositeDisposable().clear();
    }

    /* JADX INFO: compiled from: GoogleMapsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment$Companion;", "", "()V", "ZOOM_ENABLED", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/google/GoogleMapsFragment;", "zoomEnabled", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment newInstance(boolean zoomEnabled) {
            powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment googleMapsFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(powerwatch.matrix.com.pwgen2android.shared.ui.maps.google.GoogleMapsFragment.ZOOM_ENABLED, zoomEnabled);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            googleMapsFragment.setArguments(bundle);
            return googleMapsFragment;
        }
    }
}
