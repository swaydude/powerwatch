package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class SearchViewBindingAdapter {

    public interface OnQueryTextChange {
        boolean onQueryTextChange(java.lang.String str);
    }

    public interface OnQueryTextSubmit {
        boolean onQueryTextSubmit(java.lang.String str);
    }

    public interface OnSuggestionClick {
        boolean onSuggestionClick(int i);
    }

    public interface OnSuggestionSelect {
        boolean onSuggestionSelect(int i);
    }

    public static void setOnQueryTextListener(android.widget.SearchView searchView, final androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextSubmit onQueryTextSubmit, final androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange onQueryTextChange) {
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            if (onQueryTextSubmit == null && onQueryTextChange == null) {
                searchView.setOnQueryTextListener(null);
            } else {
                searchView.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() { // from class: androidx.databinding.adapters.SearchViewBindingAdapter.1
                    @Override // android.widget.SearchView.OnQueryTextListener
                    public boolean onQueryTextSubmit(java.lang.String str) {
                        androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextSubmit onQueryTextSubmit2 = onQueryTextSubmit;
                        if (onQueryTextSubmit2 != null) {
                            return onQueryTextSubmit2.onQueryTextSubmit(str);
                        }
                        return false;
                    }

                    @Override // android.widget.SearchView.OnQueryTextListener
                    public boolean onQueryTextChange(java.lang.String str) {
                        androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange onQueryTextChange2 = onQueryTextChange;
                        if (onQueryTextChange2 != null) {
                            return onQueryTextChange2.onQueryTextChange(str);
                        }
                        return false;
                    }
                });
            }
        }
    }

    public static void setOnSuggestListener(android.widget.SearchView searchView, final androidx.databinding.adapters.SearchViewBindingAdapter.OnSuggestionSelect onSuggestionSelect, final androidx.databinding.adapters.SearchViewBindingAdapter.OnSuggestionClick onSuggestionClick) {
        if (android.os.Build.VERSION.SDK_INT >= 11) {
            if (onSuggestionSelect == null && onSuggestionClick == null) {
                searchView.setOnSuggestionListener(null);
            } else {
                searchView.setOnSuggestionListener(new android.widget.SearchView.OnSuggestionListener() { // from class: androidx.databinding.adapters.SearchViewBindingAdapter.2
                    @Override // android.widget.SearchView.OnSuggestionListener
                    public boolean onSuggestionSelect(int i) {
                        androidx.databinding.adapters.SearchViewBindingAdapter.OnSuggestionSelect onSuggestionSelect2 = onSuggestionSelect;
                        if (onSuggestionSelect2 != null) {
                            return onSuggestionSelect2.onSuggestionSelect(i);
                        }
                        return false;
                    }

                    @Override // android.widget.SearchView.OnSuggestionListener
                    public boolean onSuggestionClick(int i) {
                        androidx.databinding.adapters.SearchViewBindingAdapter.OnSuggestionClick onSuggestionClick2 = onSuggestionClick;
                        if (onSuggestionClick2 != null) {
                            return onSuggestionClick2.onSuggestionClick(i);
                        }
                        return false;
                    }
                });
            }
        }
    }
}
