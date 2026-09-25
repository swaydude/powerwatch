package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class AbsSpinnerBindingAdapter {
    public static <T extends java.lang.CharSequence> void setEntries(android.widget.AbsSpinner absSpinner, T[] tArr) {
        if (tArr != null) {
            android.widget.SpinnerAdapter adapter = absSpinner.getAdapter();
            boolean z = false;
            if (adapter == null || adapter.getCount() != tArr.length) {
                z = true;
                break;
            }
            for (int i = 0; i < tArr.length; i++) {
                if (!tArr[i].equals(adapter.getItem(i))) {
                    z = true;
                    break;
                }
            }
            if (z) {
                android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(absSpinner.getContext(), android.R.layout.simple_spinner_item, tArr);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                absSpinner.setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
                return;
            }
            return;
        }
        absSpinner.setAdapter((android.widget.SpinnerAdapter) null);
    }

    public static <T> void setEntries(android.widget.AbsSpinner absSpinner, java.util.List<T> list) {
        if (list != null) {
            android.widget.SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof androidx.databinding.adapters.ObservableListAdapter) {
                ((androidx.databinding.adapters.ObservableListAdapter) adapter).setList(list);
                return;
            } else {
                absSpinner.setAdapter((android.widget.SpinnerAdapter) new androidx.databinding.adapters.ObservableListAdapter(absSpinner.getContext(), list, android.R.layout.simple_spinner_item, android.R.layout.simple_spinner_dropdown_item, 0));
                return;
            }
        }
        absSpinner.setAdapter((android.widget.SpinnerAdapter) null);
    }
}
