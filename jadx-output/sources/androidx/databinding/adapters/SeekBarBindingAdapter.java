package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarBindingAdapter {

    public interface OnProgressChanged {
        void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z);
    }

    public interface OnStartTrackingTouch {
        void onStartTrackingTouch(android.widget.SeekBar seekBar);
    }

    public interface OnStopTrackingTouch {
        void onStopTrackingTouch(android.widget.SeekBar seekBar);
    }

    public static void setProgress(android.widget.SeekBar seekBar, int i) {
        if (i != seekBar.getProgress()) {
            seekBar.setProgress(i);
        }
    }

    public static void setOnSeekBarChangeListener(android.widget.SeekBar seekBar, final androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch onStartTrackingTouch, final androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch onStopTrackingTouch, final androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged onProgressChanged, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (onStartTrackingTouch == null && onStopTrackingTouch == null && onProgressChanged == null && inverseBindingListener == null) {
            seekBar.setOnSeekBarChangeListener(null);
        } else {
            seekBar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() { // from class: androidx.databinding.adapters.SeekBarBindingAdapter.1
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(android.widget.SeekBar seekBar2, int i, boolean z) {
                    androidx.databinding.adapters.SeekBarBindingAdapter.OnProgressChanged onProgressChanged2 = onProgressChanged;
                    if (onProgressChanged2 != null) {
                        onProgressChanged2.onProgressChanged(seekBar2, i, z);
                    }
                    androidx.databinding.InverseBindingListener inverseBindingListener2 = inverseBindingListener;
                    if (inverseBindingListener2 != null) {
                        inverseBindingListener2.onChange();
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(android.widget.SeekBar seekBar2) {
                    androidx.databinding.adapters.SeekBarBindingAdapter.OnStartTrackingTouch onStartTrackingTouch2 = onStartTrackingTouch;
                    if (onStartTrackingTouch2 != null) {
                        onStartTrackingTouch2.onStartTrackingTouch(seekBar2);
                    }
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(android.widget.SeekBar seekBar2) {
                    androidx.databinding.adapters.SeekBarBindingAdapter.OnStopTrackingTouch onStopTrackingTouch2 = onStopTrackingTouch;
                    if (onStopTrackingTouch2 != null) {
                        onStopTrackingTouch2.onStopTrackingTouch(seekBar2);
                    }
                }
            });
        }
    }
}
