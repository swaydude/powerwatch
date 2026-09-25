package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class TimePickerBindingAdapter {
    public static void setHour(android.widget.TimePicker timePicker, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (timePicker.getHour() != i) {
                timePicker.setHour(i);
            }
        } else if (timePicker.getCurrentHour().intValue() != i) {
            timePicker.setCurrentHour(java.lang.Integer.valueOf(i));
        }
    }

    public static void setMinute(android.widget.TimePicker timePicker, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            if (timePicker.getMinute() != i) {
                timePicker.setMinute(i);
            }
        } else if (timePicker.getCurrentMinute().intValue() != i) {
            timePicker.setCurrentHour(java.lang.Integer.valueOf(i));
        }
    }

    public static int getHour(android.widget.TimePicker timePicker) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return timePicker.getHour();
        }
        java.lang.Integer currentHour = timePicker.getCurrentHour();
        if (currentHour == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    public static int getMinute(android.widget.TimePicker timePicker) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return timePicker.getMinute();
        }
        java.lang.Integer currentMinute = timePicker.getCurrentMinute();
        if (currentMinute == null) {
            return 0;
        }
        return currentMinute.intValue();
    }

    public static void setListeners(android.widget.TimePicker timePicker, final android.widget.TimePicker.OnTimeChangedListener onTimeChangedListener, final androidx.databinding.InverseBindingListener inverseBindingListener, final androidx.databinding.InverseBindingListener inverseBindingListener2) {
        if (inverseBindingListener == null && inverseBindingListener2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new android.widget.TimePicker.OnTimeChangedListener() { // from class: androidx.databinding.adapters.TimePickerBindingAdapter.1
                @Override // android.widget.TimePicker.OnTimeChangedListener
                public void onTimeChanged(android.widget.TimePicker timePicker2, int i, int i2) {
                    android.widget.TimePicker.OnTimeChangedListener onTimeChangedListener2 = onTimeChangedListener;
                    if (onTimeChangedListener2 != null) {
                        onTimeChangedListener2.onTimeChanged(timePicker2, i, i2);
                    }
                    androidx.databinding.InverseBindingListener inverseBindingListener3 = inverseBindingListener;
                    if (inverseBindingListener3 != null) {
                        inverseBindingListener3.onChange();
                    }
                    androidx.databinding.InverseBindingListener inverseBindingListener4 = inverseBindingListener2;
                    if (inverseBindingListener4 != null) {
                        inverseBindingListener4.onChange();
                    }
                }
            });
        }
    }
}
