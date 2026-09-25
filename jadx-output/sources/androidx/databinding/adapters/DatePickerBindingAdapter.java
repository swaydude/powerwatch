package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class DatePickerBindingAdapter {
    public static void setListeners(android.widget.DatePicker datePicker, int i, int i2, int i3, android.widget.DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.InverseBindingListener inverseBindingListener, androidx.databinding.InverseBindingListener inverseBindingListener2, androidx.databinding.InverseBindingListener inverseBindingListener3) {
        if (i == 0) {
            i = datePicker.getYear();
        }
        if (i3 == 0) {
            i3 = datePicker.getDayOfMonth();
        }
        if (inverseBindingListener == null && inverseBindingListener2 == null && inverseBindingListener3 == null) {
            datePicker.init(i, i2, i3, onDateChangedListener);
            return;
        }
        androidx.databinding.adapters.DatePickerBindingAdapter.DateChangedListener dateChangedListener = (androidx.databinding.adapters.DatePickerBindingAdapter.DateChangedListener) androidx.databinding.adapters.ListenerUtil.getListener(datePicker, androidx.databinding.library.baseAdapters.R.id.onDateChanged);
        if (dateChangedListener == null) {
            dateChangedListener = new androidx.databinding.adapters.DatePickerBindingAdapter.DateChangedListener();
            androidx.databinding.adapters.ListenerUtil.trackListener(datePicker, dateChangedListener, androidx.databinding.library.baseAdapters.R.id.onDateChanged);
        }
        dateChangedListener.setListeners(onDateChangedListener, inverseBindingListener, inverseBindingListener2, inverseBindingListener3);
        datePicker.init(i, i2, i3, dateChangedListener);
    }

    private static class DateChangedListener implements android.widget.DatePicker.OnDateChangedListener {
        androidx.databinding.InverseBindingListener mDayChanged;
        android.widget.DatePicker.OnDateChangedListener mListener;
        androidx.databinding.InverseBindingListener mMonthChanged;
        androidx.databinding.InverseBindingListener mYearChanged;

        private DateChangedListener() {
        }

        public void setListeners(android.widget.DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.InverseBindingListener inverseBindingListener, androidx.databinding.InverseBindingListener inverseBindingListener2, androidx.databinding.InverseBindingListener inverseBindingListener3) {
            this.mListener = onDateChangedListener;
            this.mYearChanged = inverseBindingListener;
            this.mMonthChanged = inverseBindingListener2;
            this.mDayChanged = inverseBindingListener3;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(android.widget.DatePicker datePicker, int i, int i2, int i3) {
            android.widget.DatePicker.OnDateChangedListener onDateChangedListener = this.mListener;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i, i2, i3);
            }
            androidx.databinding.InverseBindingListener inverseBindingListener = this.mYearChanged;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
            androidx.databinding.InverseBindingListener inverseBindingListener2 = this.mMonthChanged;
            if (inverseBindingListener2 != null) {
                inverseBindingListener2.onChange();
            }
            androidx.databinding.InverseBindingListener inverseBindingListener3 = this.mDayChanged;
            if (inverseBindingListener3 != null) {
                inverseBindingListener3.onChange();
            }
        }
    }
}
