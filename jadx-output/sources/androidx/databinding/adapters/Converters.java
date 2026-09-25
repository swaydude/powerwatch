package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class Converters {
    public static android.graphics.drawable.ColorDrawable convertColorToDrawable(int i) {
        return new android.graphics.drawable.ColorDrawable(i);
    }

    public static android.content.res.ColorStateList convertColorToColorStateList(int i) {
        return android.content.res.ColorStateList.valueOf(i);
    }
}
