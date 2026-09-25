package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class CompoundButtonBindingAdapter {
    public static void setChecked(android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    public static void setListeners(android.widget.CompoundButton compoundButton, final android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: androidx.databinding.adapters.CompoundButtonBindingAdapter.1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(android.widget.CompoundButton compoundButton2, boolean z) {
                    android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    if (onCheckedChangeListener2 != null) {
                        onCheckedChangeListener2.onCheckedChanged(compoundButton2, z);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
