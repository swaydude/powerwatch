package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
class ObservableListAdapter<T> extends android.widget.BaseAdapter {
    private final android.content.Context mContext;
    private final int mDropDownResourceId;
    private final android.view.LayoutInflater mLayoutInflater;
    private java.util.List<T> mList;
    private androidx.databinding.ObservableList.OnListChangedCallback mListChangedCallback;
    private final int mResourceId;
    private final int mTextViewResourceId;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public ObservableListAdapter(android.content.Context context, java.util.List<T> list, int i, int i2, int i3) {
        this.mContext = context;
        this.mResourceId = i;
        this.mDropDownResourceId = i2;
        this.mTextViewResourceId = i3;
        this.mLayoutInflater = i == 0 ? null : (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        setList(list);
    }

    public void setList(java.util.List<T> list) {
        java.util.List<T> list2 = this.mList;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof androidx.databinding.ObservableList) {
            ((androidx.databinding.ObservableList) list2).removeOnListChangedCallback(this.mListChangedCallback);
        }
        this.mList = list;
        if (list instanceof androidx.databinding.ObservableList) {
            if (this.mListChangedCallback == null) {
                this.mListChangedCallback = new androidx.databinding.ObservableList.OnListChangedCallback() { // from class: androidx.databinding.adapters.ObservableListAdapter.1
                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onChanged(androidx.databinding.ObservableList observableList) {
                        androidx.databinding.adapters.ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeChanged(androidx.databinding.ObservableList observableList, int i, int i2) {
                        androidx.databinding.adapters.ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeInserted(androidx.databinding.ObservableList observableList, int i, int i2) {
                        androidx.databinding.adapters.ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeMoved(androidx.databinding.ObservableList observableList, int i, int i2, int i3) {
                        androidx.databinding.adapters.ObservableListAdapter.this.notifyDataSetChanged();
                    }

                    @Override // androidx.databinding.ObservableList.OnListChangedCallback
                    public void onItemRangeRemoved(androidx.databinding.ObservableList observableList, int i, int i2) {
                        androidx.databinding.adapters.ObservableListAdapter.this.notifyDataSetChanged();
                    }
                };
            }
            ((androidx.databinding.ObservableList) this.mList).addOnListChangedCallback(this.mListChangedCallback);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i) {
        return this.mList.get(i);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return getViewForResource(this.mResourceId, i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return getViewForResource(this.mDropDownResourceId, i, view, viewGroup);
    }

    public android.view.View getViewForResource(int i, int i2, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.CharSequence charSequenceValueOf;
        if (view == null) {
            if (i == 0) {
                view = new android.widget.TextView(this.mContext);
            } else {
                view = this.mLayoutInflater.inflate(i, viewGroup, false);
            }
        }
        int i3 = this.mTextViewResourceId;
        android.widget.TextView textView = (android.widget.TextView) (i3 == 0 ? view : view.findViewById(i3));
        T t = this.mList.get(i2);
        if (t instanceof java.lang.CharSequence) {
            charSequenceValueOf = (java.lang.CharSequence) t;
        } else {
            charSequenceValueOf = java.lang.String.valueOf(t);
        }
        textView.setText(charSequenceValueOf);
        return view;
    }
}
