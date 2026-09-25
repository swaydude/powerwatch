package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class CardViewBindingAdapter {
    public static void setContentPadding(androidx.cardview.widget.CardView cardView, int i) {
        cardView.setContentPadding(i, i, i, i);
    }

    public static void setContentPaddingLeft(androidx.cardview.widget.CardView cardView, int i) {
        cardView.setContentPadding(i, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    public static void setContentPaddingTop(androidx.cardview.widget.CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), i, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    public static void setContentPaddingRight(androidx.cardview.widget.CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i, cardView.getContentPaddingBottom());
    }

    public static void setContentPaddingBottom(androidx.cardview.widget.CardView cardView, int i) {
        cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i);
    }
}
