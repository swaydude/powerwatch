package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class RadioGroupBindingAdapter {
    public static void setCheckedButton(android.widget.RadioGroup radioGroup, int i) {
        if (i != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i);
        }
    }

    public static void setListeners(android.widget.RadioGroup radioGroup, final android.widget.RadioGroup.OnCheckedChangeListener onCheckedChangeListener, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() { // from class: androidx.databinding.adapters.RadioGroupBindingAdapter.1
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public void onCheckedChanged(android.widget.RadioGroup radioGroup2, int i) {
                    android.widget.RadioGroup.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    if (onCheckedChangeListener2 != null) {
                        onCheckedChangeListener2.onCheckedChanged(radioGroup2, i);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
