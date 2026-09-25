package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class AdapterViewBindingAdapter {

    public interface OnItemSelected {
        void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j);
    }

    public interface OnNothingSelected {
        void onNothingSelected(android.widget.AdapterView<?> adapterView);
    }

    public static void setSelectedItemPosition(android.widget.AdapterView adapterView, int i) {
        if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }

    public static void setSelection(android.widget.AdapterView adapterView, int i) {
        setSelectedItemPosition(adapterView, i);
    }

    public static void setSelectedItemPosition(android.widget.AdapterView adapterView, int i, android.widget.Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i);
        } else if (adapterView.getSelectedItemPosition() != i) {
            adapterView.setSelection(i);
        }
    }

    public static void setSelection(android.widget.AdapterView adapterView, int i, android.widget.Adapter adapter) {
        setSelectedItemPosition(adapterView, i, adapter);
    }

    public static void setOnItemSelectedListener(android.widget.AdapterView adapterView, androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected onItemSelected, androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected onNothingSelected, androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (onItemSelected == null && onNothingSelected == null && inverseBindingListener == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelectedComponentListener(onItemSelected, onNothingSelected, inverseBindingListener));
        }
    }

    public static class OnItemSelectedComponentListener implements android.widget.AdapterView.OnItemSelectedListener {
        private final androidx.databinding.InverseBindingListener mAttrChanged;
        private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected mNothingSelected;
        private final androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected mSelected;

        public OnItemSelectedComponentListener(androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected onItemSelected, androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected onNothingSelected, androidx.databinding.InverseBindingListener inverseBindingListener) {
            this.mSelected = onItemSelected;
            this.mNothingSelected = onNothingSelected;
            this.mAttrChanged = inverseBindingListener;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
            androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected onItemSelected = this.mSelected;
            if (onItemSelected != null) {
                onItemSelected.onItemSelected(adapterView, view, i, j);
            }
            androidx.databinding.InverseBindingListener inverseBindingListener = this.mAttrChanged;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
            androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected onNothingSelected = this.mNothingSelected;
            if (onNothingSelected != null) {
                onNothingSelected.onNothingSelected(adapterView);
            }
            androidx.databinding.InverseBindingListener inverseBindingListener = this.mAttrChanged;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
        }
    }
}
