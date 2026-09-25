package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class ImageViewBindingAdapter {
    public static void setImageUri(android.widget.ImageView imageView, java.lang.String str) {
        if (str == null) {
            imageView.setImageURI(null);
        } else {
            imageView.setImageURI(android.net.Uri.parse(str));
        }
    }

    public static void setImageUri(android.widget.ImageView imageView, android.net.Uri uri) {
        imageView.setImageURI(uri);
    }

    public static void setImageDrawable(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }
}
