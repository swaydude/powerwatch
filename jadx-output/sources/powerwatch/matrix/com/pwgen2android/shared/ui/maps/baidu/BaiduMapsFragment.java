package powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu;

/* JADX INFO: compiled from: BaiduMapsFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001'B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0003H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\b\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001b\u0010\u0007\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006("}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentBaiduMapsBinding;", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "Landroid/view/View$OnTouchListener;", "()V", "mapsViewModel", "getMapsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/BaseMapViewModel;", "mapsViewModel$delegate", "Lkotlin/Lazy;", "computeLocation", "Lcom/baidu/mapapi/model/LatLng;", "runningAnimation", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;", "createColouredBitmap", "Lcom/baidu/mapapi/map/BitmapDescriptor;", "targetBitmap", "Landroid/graphics/Bitmap;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onTouch", "", "view", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BaiduMapsFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding, powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel> implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable, android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.Companion(null);
    private static final java.lang.String ZOOM_ENABLED = "zoom_enabled";

    /* JADX INFO: renamed from: mapsViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy mapsViewModel = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment$mapsViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel invoke() {
            androidx.fragment.app.Fragment parentFragment = this.this$0.getParentFragment();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parentFragment);
            androidx.lifecycle.ViewModel viewModel = new androidx.lifecycle.ViewModelProvider(parentFragment).get(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProvider(parentFragment!!).get(BaseMapViewModel::class.java)");
            return (powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel) viewModel;
        }
    });

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment newInstance(boolean z) {
        return INSTANCE.newInstance(z);
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
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_baidu_maps;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel getMapsViewModel() {
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

    private final com.baidu.mapapi.map.BitmapDescriptor createColouredBitmap(android.graphics.Bitmap targetBitmap) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.green_chart), android.graphics.PorterDuff.Mode.SRC_ATOP);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColorFilter(porterDuffColorFilter);
        new android.graphics.Canvas(targetBitmap).drawBitmap(targetBitmap, 0.0f, 0.0f, paint);
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = com.baidu.mapapi.map.BitmapDescriptorFactory.fromBitmap(targetBitmap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmapDescriptorFromBitmap, "fromBitmap(targetBitmap)");
        return bitmapDescriptorFromBitmap;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.content.res.Resources resources;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.os.Bundle arguments = getArguments();
        boolean z = arguments == null ? false : arguments.getBoolean(ZOOM_ENABLED);
        if (z) {
            viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.transparent_touch_panel).setOnTouchListener(this);
        }
        android.content.Context context = getContext();
        android.util.DisplayMetrics displayMetrics = null;
        if (context != null && (resources = context.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        float f = (displayMetrics == null ? 1.0f : displayMetrics.density) * 36.0f;
        android.graphics.Bitmap resizedBitmap = android.graphics.Bitmap.createScaledBitmap(com.baidu.mapapi.map.BitmapDescriptorFactory.fromResource(powerwatch.matrix.com.pwgen2android.R.drawable.icon_marker).getBitmap(), kotlin.math.MathKt.roundToInt(f), kotlin.math.MathKt.roundToInt(f), false);
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = com.baidu.mapapi.map.BitmapDescriptorFactory.fromBitmap(resizedBitmap);
        com.baidu.mapapi.map.MarkerOptions markerOptions = new com.baidu.mapapi.map.MarkerOptions();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resizedBitmap, "resizedBitmap");
        final com.baidu.mapapi.map.MarkerOptions markerOptionsIcon = markerOptions.icon(createColouredBitmap(resizedBitmap));
        final com.baidu.mapapi.map.MarkerOptions markerOptionsIcon2 = new com.baidu.mapapi.map.MarkerOptions().icon(bitmapDescriptorFromBitmap);
        final com.baidu.mapapi.map.MapView mapView = (com.baidu.mapapi.map.MapView) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.baidu_map);
        mapView.showZoomControls(false);
        final com.baidu.mapapi.map.MapStatus.Builder builder = new com.baidu.mapapi.map.MapStatus.Builder();
        builder.zoom(13.0f);
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        mapView.getMap().getUiSettings().setAllGesturesEnabled(z);
        getCompositeDisposable().add(getMapsViewModel().getLocationsSubject().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.-$$Lambda$BaiduMapsFragment$_bA9gNVboMK3HUDziD4szN8ppMc
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.m3489onCreateView$lambda0((java.util.List) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.-$$Lambda$BaiduMapsFragment$EBd7lFKKVFzfMe9HXgk9eGzvvf8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.m3490onCreateView$lambda2(this.f$0, (java.util.List) obj);
            }
        }).delay(300L, java.util.concurrent.TimeUnit.MILLISECONDS).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.-$$Lambda$BaiduMapsFragment$IM-5RU5yAKj9ePdE2FuUedtFmpU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.m3492onCreateView$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }).retry().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.-$$Lambda$BaiduMapsFragment$DAQHCNfNY2SKjDxyvR5ioc8MZBc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.m3493onCreateView$lambda6(mapView, this, markerOptionsIcon, objectRef, markerOptionsIcon2, builder, (java.util.List) obj);
            }
        }));
        getCompositeDisposable().add(getMapsViewModel().getLocationAnimationObservable().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.-$$Lambda$BaiduMapsFragment$y0p4NDGRJwME72CbNhoOSUCn9gw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.m3495onCreateView$lambda7(this.f$0, markerOptionsIcon, objectRef, mapView, builder, (kotlin.Pair) obj);
            }
        }));
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel mapsViewModel = getMapsViewModel();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        mapsViewModel.onCreateView(context2);
        return viewOnCreateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final boolean m3489onCreateView$lambda0(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !it.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m3490onCreateView$lambda2(final powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.-$$Lambda$BaiduMapsFragment$3maFENfiV_GGkeAk6x6kCH9OKeQ
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.m3491onCreateView$lambda2$lambda1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2$lambda-1, reason: not valid java name */
    public static final void m3491onCreateView$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMapsViewModel().getShowProgressField().set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m3492onCreateView$lambda3(powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error while loading activity maps. Error is: ", th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-6, reason: not valid java name */
    public static final void m3493onCreateView$lambda6(final com.baidu.mapapi.map.MapView mapView, final powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment this$0, final com.baidu.mapapi.map.MarkerOptions markerOptions, final kotlin.jvm.internal.Ref.ObjectRef startPositionMarker, final com.baidu.mapapi.map.MarkerOptions markerOptions2, final com.baidu.mapapi.map.MapStatus.Builder builder, final java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPositionMarker, "$startPositionMarker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "$builder");
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.-$$Lambda$BaiduMapsFragment$mJfOv5YZg7jILqjU-Rxx5ta5EdQ
            @Override // java.lang.Runnable
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.m3494onCreateView$lambda6$lambda5(mapView, this$0, list, markerOptions, startPositionMarker, markerOptions2, builder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, com.baidu.mapapi.map.Overlay] */
    /* JADX INFO: renamed from: onCreateView$lambda-6$lambda-5, reason: not valid java name */
    public static final void m3494onCreateView$lambda6$lambda5(com.baidu.mapapi.map.MapView mapView, powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment this$0, java.util.List it, com.baidu.mapapi.map.MarkerOptions markerOptions, kotlin.jvm.internal.Ref.ObjectRef startPositionMarker, com.baidu.mapapi.map.MarkerOptions markerOptions2, com.baidu.mapapi.map.MapStatus.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPositionMarker, "$startPositionMarker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "$builder");
        mapView.getMap().clear();
        this$0.getMapsViewModel().getShowProgressField().set(false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition mapPosition = (powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition) kotlin.collections.CollectionsKt.first(it);
        com.baidu.mapapi.model.LatLng gps = powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toGPS(new com.baidu.mapapi.model.LatLng(mapPosition.getPosition().latitude, mapPosition.getPosition().longitude));
        markerOptions.position(gps);
        com.baidu.mapapi.map.Overlay overlay = (com.baidu.mapapi.map.Overlay) startPositionMarker.element;
        if (overlay != null) {
            overlay.remove();
        }
        startPositionMarker.element = mapView.getMap().addOverlay(markerOptions);
        powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition mapPosition2 = (powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition) kotlin.collections.CollectionsKt.last(it);
        markerOptions2.position(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toGPS(new com.baidu.mapapi.model.LatLng(mapPosition2.getPosition().latitude, mapPosition2.getPosition().longitude)));
        mapView.getMap().addOverlay(markerOptions2);
        builder.target(gps);
        mapView.getMap().setMapStatus(com.baidu.mapapi.map.MapStatusUpdateFactory.newMapStatus(builder.build()));
        com.baidu.mapapi.map.PolylineOptions polylineOptionsWidth = new com.baidu.mapapi.map.PolylineOptions().width(6);
        android.content.Context context = this$0.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        com.baidu.mapapi.map.PolylineOptions polylineOptionsZIndex = polylineOptionsWidth.color(androidx.core.content.ContextCompat.getColor(context, powerwatch.matrix.com.pwgen2android.R.color.green_chart)).zIndex(0);
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition> list = it;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.shared.ui.maps.MapPosition mapPosition3 : list) {
            arrayList.add(powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toGPS(new com.baidu.mapapi.model.LatLng(mapPosition3.getPosition().latitude, mapPosition3.getPosition().longitude)));
        }
        mapView.getMap().addOverlay(polylineOptionsZIndex.points(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.baidu.mapapi.map.Overlay] */
    /* JADX INFO: renamed from: onCreateView$lambda-7, reason: not valid java name */
    public static final void m3495onCreateView$lambda7(powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment this$0, com.baidu.mapapi.map.MarkerOptions markerOptions, kotlin.jvm.internal.Ref.ObjectRef startPositionMarker, com.baidu.mapapi.map.MapView mapView, com.baidu.mapapi.map.MapStatus.Builder builder, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPositionMarker, "$startPositionMarker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "$builder");
        powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation = (powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) pair.getFirst();
        this$0.getMapsViewModel().getShowProgressField().set(true);
        com.baidu.mapapi.model.LatLng gps = powerwatch.matrix.com.pwgen2android.shared.data.models.ActivityPeriodsModelsKt.toGPS(this$0.computeLocation(runningAnimation));
        markerOptions.position(gps);
        com.baidu.mapapi.map.Overlay overlay = (com.baidu.mapapi.map.Overlay) startPositionMarker.element;
        startPositionMarker.element = mapView.getMap().addOverlay(markerOptions);
        if (overlay != null) {
            overlay.remove();
        }
        builder.target(gps);
        builder.zoom(15.5f);
        mapView.getMap().setMapStatus(com.baidu.mapapi.map.MapStatusUpdateFactory.newMapStatus(builder.build()));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getCompositeDisposable().clear();
    }

    private final com.baidu.mapapi.model.LatLng computeLocation(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation) {
        com.google.android.gms.maps.model.LatLng latLngComputeOffset = com.google.maps.android.SphericalUtil.computeOffset(new com.google.android.gms.maps.model.LatLng(runningAnimation.getLastLocation().getLatitude(), runningAnimation.getLastLocation().getLongitude()), runningAnimation.getStep(), com.google.maps.android.SphericalUtil.computeHeading(new com.google.android.gms.maps.model.LatLng(runningAnimation.getLastLocation().getLatitude(), runningAnimation.getLastLocation().getLongitude()), new com.google.android.gms.maps.model.LatLng(runningAnimation.getNextLocation().getLatitude(), runningAnimation.getNextLocation().getLongitude())));
        return new com.baidu.mapapi.model.LatLng(latLngComputeOffset.latitude, latLngComputeOffset.longitude);
    }

    /* JADX INFO: compiled from: BaiduMapsFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment$Companion;", "", "()V", "ZOOM_ENABLED", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/maps/baidu/BaiduMapsFragment;", "zoomEnabled", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment newInstance(boolean zoomEnabled) {
            powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment baiduMapsFragment = new powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(powerwatch.matrix.com.pwgen2android.shared.ui.maps.baidu.BaiduMapsFragment.ZOOM_ENABLED, zoomEnabled);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            baiduMapsFragment.setArguments(bundle);
            return baiduMapsFragment;
        }
    }
}
