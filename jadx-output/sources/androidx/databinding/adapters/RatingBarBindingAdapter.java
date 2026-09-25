package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class RatingBarBindingAdapter {
    public static void setRating(android.widget.RatingBar ratingBar, float f) {
        if (ratingBar.getRating() != f) {
            ratingBar.setRating(f);
        }
    }

    public static void setListeners(android.widget.RatingBar ratingBar, final android.widget.RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        if (inverseBindingListener == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener() { // from class: androidx.databinding.adapters.RatingBarBindingAdapter.1
                @Override // android.widget.RatingBar.OnRatingBarChangeListener
                public void onRatingChanged(android.widget.RatingBar ratingBar2, float f, boolean z) {
                    android.widget.RatingBar.OnRatingBarChangeListener onRatingBarChangeListener2 = onRatingBarChangeListener;
                    if (onRatingBarChangeListener2 != null) {
                        onRatingBarChangeListener2.onRatingChanged(ratingBar2, f, z);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
