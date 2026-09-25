package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentCalendarBinding extends androidx.databinding.ViewDataBinding {
    public final powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView calendarView;
    public final android.widget.Button dayFive;
    public final android.widget.Button dayFour;
    public final android.widget.Button dayOne;
    public final android.widget.Button daySeven;
    public final android.widget.Button daySix;
    public final android.widget.Button dayThree;
    public final android.widget.Button dayTwo;

    @androidx.databinding.Bindable
    protected powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel mViewModel;

    public abstract void setViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel viewModel);

    protected FragmentCalendarBinding(java.lang.Object _bindingComponent, android.view.View _root, int _localFieldCount, powerwatch.matrix.com.pwgen2android.shared.ui.calendar.CalendarView calendarView, android.widget.Button dayFive, android.widget.Button dayFour, android.widget.Button dayOne, android.widget.Button daySeven, android.widget.Button daySix, android.widget.Button dayThree, android.widget.Button dayTwo) {
        super(_bindingComponent, _root, _localFieldCount);
        this.calendarView = calendarView;
        this.dayFive = dayFive;
        this.dayFour = dayFour;
        this.dayOne = dayOne;
        this.daySeven = daySeven;
        this.daySix = daySix;
        this.dayThree = dayThree;
        this.dayTwo = dayTwo;
    }

    public powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarViewModel getViewModel() {
        return this.mViewModel;
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_calendar, root, attachToRoot, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding inflate(android.view.LayoutInflater inflater, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding) androidx.databinding.ViewDataBinding.inflateInternal(inflater, powerwatch.matrix.com.pwgen2android.R.layout.fragment_calendar, null, false, component);
    }

    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding bind(android.view.View view) {
        return bind(view, androidx.databinding.DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding bind(android.view.View view, java.lang.Object component) {
        return (powerwatch.matrix.com.pwgen2android.databinding.FragmentCalendarBinding) bind(component, view, powerwatch.matrix.com.pwgen2android.R.layout.fragment_calendar);
    }
}
