package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentTimerSettingsBinding extends androidx.databinding.ViewDataBinding {
    public final com.super_rabbit.wheel_picker.WheelPicker hourPicker;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM mViewModel;
    public final com.super_rabbit.wheel_picker.WheelPicker minutePicker;
    public final android.widget.TextView pauseView;
    public final android.widget.TextView resetView;
    public final com.super_rabbit.wheel_picker.WheelPicker secondsPicker;
    public final android.widget.TextView startView;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM viewModel);

    protected FragmentTimerSettingsBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, com.super_rabbit.wheel_picker.WheelPicker hourPicker, com.super_rabbit.wheel_picker.WheelPicker minutePicker, android.widget.TextView pauseView, android.widget.TextView resetView, com.super_rabbit.wheel_picker.WheelPicker secondsPicker, android.widget.TextView startView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.hourPicker = hourPicker;
        this.minutePicker = minutePicker;
        this.pauseView = pauseView;
        this.resetView = resetView;
        this.secondsPicker = secondsPicker;
        this.startView = startView;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.settings.timer.TimerSettingsVM getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_timer_settings, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_timer_settings, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentTimerSettingsBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_timer_settings);
    }
}
