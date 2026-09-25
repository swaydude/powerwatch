package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentPersonalSettingsBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.ImageView arrowAge;
    public final android.widget.ImageView arrowGender;
    public final android.widget.ImageView arrowHeight;
    public final android.widget.ImageView arrowSleepTime;
    public final android.widget.ImageView arrowWeight;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM viewModel);

    protected FragmentPersonalSettingsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.ImageView arrowAge, android.widget.ImageView arrowGender, android.widget.ImageView arrowHeight, android.widget.ImageView arrowSleepTime, android.widget.ImageView arrowWeight) {
        super(_bindingComponent, _root, _localFieldCount);
        this.arrowAge = arrowAge;
        this.arrowGender = arrowGender;
        this.arrowHeight = arrowHeight;
        this.arrowSleepTime = arrowSleepTime;
        this.arrowWeight = arrowWeight;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.settings.personal.PersonalSettingsVM getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_personal_settings, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_personal_settings, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentPersonalSettingsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_personal_settings);
    }
}
