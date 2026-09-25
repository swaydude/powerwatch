package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class CalendarViewBindingAdapter {
    public static void setDate(android.widget.CalendarView calendarView, long j) {
        if (calendarView.getDate() != j) {
            calendarView.setDate(j);
        }
    }

    public static void setListeners(android.widget.CalendarView calendarView, final android.widget.CalendarView.OnDateChangeListener onDateChangeListener, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new android.widget.CalendarView.OnDateChangeListener() { // from class: androidx.databinding.adapters.CalendarViewBindingAdapter.1
                @Override // android.widget.CalendarView.OnDateChangeListener
                public void onSelectedDayChange(android.widget.CalendarView calendarView2, int i, int i2, int i3) {
                    android.widget.CalendarView.OnDateChangeListener onDateChangeListener2 = onDateChangeListener;
                    if (onDateChangeListener2 != null) {
                        onDateChangeListener2.onSelectedDayChange(calendarView2, i, i2, i3);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
