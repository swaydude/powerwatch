package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class NumberPickerBindingAdapter {
    public static void setValue(android.widget.NumberPicker numberPicker, int i) {
        if (numberPicker.getValue() != i) {
            numberPicker.setValue(i);
        }
    }

    public static void setListeners(android.widget.NumberPicker numberPicker, final android.widget.NumberPicker.OnValueChangeListener onValueChangeListener, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new android.widget.NumberPicker.OnValueChangeListener() { // from class: androidx.databinding.adapters.NumberPickerBindingAdapter.1
                @Override // android.widget.NumberPicker.OnValueChangeListener
                public void onValueChange(android.widget.NumberPicker numberPicker2, int i, int i2) {
                    android.widget.NumberPicker.OnValueChangeListener onValueChangeListener2 = onValueChangeListener;
                    if (onValueChangeListener2 != null) {
                        onValueChangeListener2.onValueChange(numberPicker2, i, i2);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
