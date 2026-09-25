package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class MapFragment extends android.app.Fragment {
    private static final java.lang.String a = "MapFragment";
    private com.baidu.mapapi.map.MapView b;
    private com.baidu.mapapi.map.BaiduMapOptions c;

    public MapFragment() {
    }

    private MapFragment(com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        this.c = baiduMapOptions;
    }

    public static com.baidu.mapapi.map.MapFragment newInstance() {
        return new com.baidu.mapapi.map.MapFragment();
    }

    public static com.baidu.mapapi.map.MapFragment newInstance(com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        return new com.baidu.mapapi.map.MapFragment(baiduMapOptions);
    }

    public com.baidu.mapapi.map.BaiduMap getBaiduMap() {
        com.baidu.mapapi.map.MapView mapView = this.b;
        if (mapView == null) {
            return null;
        }
        return mapView.getMap();
    }

    public com.baidu.mapapi.map.MapView getMapView() {
        return this.b;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.baidu.mapapi.map.MapView mapView = new com.baidu.mapapi.map.MapView(getActivity(), this.c);
        this.b = mapView;
        return mapView;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.b.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.onResume();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
