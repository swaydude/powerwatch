package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class AutoCompleteTextViewBindingAdapter {

    public interface FixText {
        java.lang.CharSequence fixText(java.lang.CharSequence charSequence);
    }

    public interface IsValid {
        boolean isValid(java.lang.CharSequence charSequence);
    }

    public static void setValidator(android.widget.AutoCompleteTextView autoCompleteTextView, final androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.FixText fixText, final androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.IsValid isValid) {
        if (fixText == null && isValid == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new android.widget.AutoCompleteTextView.Validator() { // from class: androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.1
                @Override // android.widget.AutoCompleteTextView.Validator
                public boolean isValid(java.lang.CharSequence charSequence) {
                    androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.IsValid isValid2 = isValid;
                    if (isValid2 != null) {
                        return isValid2.isValid(charSequence);
                    }
                    return true;
                }

                @Override // android.widget.AutoCompleteTextView.Validator
                public java.lang.CharSequence fixText(java.lang.CharSequence charSequence) {
                    androidx.databinding.adapters.AutoCompleteTextViewBindingAdapter.FixText fixText2 = fixText;
                    return fixText2 != null ? fixText2.fixText(charSequence) : charSequence;
                }
            });
        }
    }

    public static void setOnItemSelectedListener(android.widget.AutoCompleteTextView autoCompleteTextView, androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected onItemSelected, androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected onNothingSelected) {
        if (onItemSelected == null && onNothingSelected == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelectedComponentListener(onItemSelected, onNothingSelected, null));
        }
    }
}
