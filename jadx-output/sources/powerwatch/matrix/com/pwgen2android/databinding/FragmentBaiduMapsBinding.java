package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentBaiduMapsBinding extends androidx.databinding.ViewDataBinding {
    public final com.baidu.mapapi.map.MapView baiduMap;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel mViewModel;
    public final android.view.View transparentTouchPanel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel viewModel);

    protected FragmentBaiduMapsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, com.baidu.mapapi.map.MapView baiduMap, android.view.View transparentTouchPanel) {
        super(_bindingComponent, _root, _localFieldCount);
        this.baiduMap = baiduMap;
        this.transparentTouchPanel = transparentTouchPanel;
    }

    public powerwatch.matrix.com.pwgen2android.shared.ui.maps.BaseMapViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_baidu_maps, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_baidu_maps, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentBaiduMapsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_baidu_maps);
    }
}
