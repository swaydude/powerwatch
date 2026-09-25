package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class TextureSupportMapFragment extends androidx.fragment.app.Fragment {
    private static final java.lang.String a = "TextureSupportMapFragment";
    private com.baidu.mapapi.map.TextureMapView b;
    private com.baidu.mapapi.map.BaiduMapOptions c;

    public TextureSupportMapFragment() {
    }

    private TextureSupportMapFragment(com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        this.c = baiduMapOptions;
    }

    public static com.baidu.mapapi.map.TextureSupportMapFragment newInstance() {
        return new com.baidu.mapapi.map.TextureSupportMapFragment();
    }

    public static com.baidu.mapapi.map.TextureSupportMapFragment newInstance(com.baidu.mapapi.map.BaiduMapOptions baiduMapOptions) {
        return new com.baidu.mapapi.map.TextureSupportMapFragment(baiduMapOptions);
    }

    public com.baidu.mapapi.map.BaiduMap getBaiduMap() {
        com.baidu.mapapi.map.TextureMapView textureMapView = this.b;
        if (textureMapView == null) {
            return null;
        }
        return textureMapView.getMap();
    }

    public com.baidu.mapapi.map.TextureMapView getMapView() {
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        com.baidu.mapapi.map.TextureMapView textureMapView = new com.baidu.mapapi.map.TextureMapView(getActivity(), this.c);
        this.b = textureMapView;
        return textureMapView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.b.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.b.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle bundle) {
        super.onViewStateRestored(bundle);
    }
}
