package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentWatchAlarmBinding extends androidx.databinding.ViewDataBinding {
    public final android.widget.LinearLayout activationLayout;
    public final com.super_rabbit.wheel_picker.WheelPicker amPmPicker;
    public final android.widget.ImageView arrowActivationSet;
    public final android.widget.ImageView arrowAlarmSet;
    public final com.super_rabbit.wheel_picker.WheelPicker hourPicker;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel mViewModel;
    public final com.super_rabbit.wheel_picker.WheelPicker minutePicker;
    public final android.widget.TextView oldAlarmActivationMode;
    public final android.widget.TextView oldAlarmLabel;
    public final android.widget.TextView oldAlarmRepeatMode;
    public final android.widget.LinearLayout previousAlarmLayout;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel viewModel);

    protected FragmentWatchAlarmBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, android.widget.LinearLayout activationLayout, com.super_rabbit.wheel_picker.WheelPicker amPmPicker, android.widget.ImageView arrowActivationSet, android.widget.ImageView arrowAlarmSet, com.super_rabbit.wheel_picker.WheelPicker hourPicker, com.super_rabbit.wheel_picker.WheelPicker minutePicker, android.widget.TextView oldAlarmActivationMode, android.widget.TextView oldAlarmLabel, android.widget.TextView oldAlarmRepeatMode, android.widget.LinearLayout previousAlarmLayout) {
        super(_bindingComponent, _root, _localFieldCount);
        this.activationLayout = activationLayout;
        this.amPmPicker = amPmPicker;
        this.arrowActivationSet = arrowActivationSet;
        this.arrowAlarmSet = arrowAlarmSet;
        this.hourPicker = hourPicker;
        this.minutePicker = minutePicker;
        this.oldAlarmActivationMode = oldAlarmActivationMode;
        this.oldAlarmLabel = oldAlarmLabel;
        this.oldAlarmRepeatMode = oldAlarmRepeatMode;
        this.previousAlarmLayout = previousAlarmLayout;
    }

    public powerwatch.matrix.com.pwgen2android.main.watch.settings.alarm.WatchAlarmViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_alarm, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_alarm, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchAlarmBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_watch_alarm);
    }
}
