package powerwatch.matrix.com.pwgen2android.shared.ui.views;

/* JADX INFO: compiled from: FontableTextView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u001a\u0012\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"fonts", "", "", "getFonts", "()Ljava/util/Map;", "customTypeFace", "Landroid/graphics/Typeface;", "Landroid/widget/TextView;", "fontKey", "setCustomFont", "", "Lcom/google/android/material/tabs/TabLayout;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class FontableTextViewKt {
    private static final java.util.Map<java.lang.String, java.lang.String> fonts = new java.util.LinkedHashMap();

    public static final java.util.Map<java.lang.String, java.lang.String> getFonts() {
        return fonts;
    }

    public static final android.graphics.Typeface customTypeFace(android.widget.TextView textView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
        java.lang.String str2 = fonts.get(str);
        android.graphics.Typeface typefaceCreateFromAsset = str2 == null ? null : android.graphics.Typeface.createFromAsset(textView.getContext().getAssets(), kotlin.jvm.internal.Intrinsics.stringPlus(str2, ".otf"));
        return typefaceCreateFromAsset == null ? android.graphics.Typeface.DEFAULT : typefaceCreateFromAsset;
    }

    public static final void setCustomFont(com.google.android.material.tabs.TabLayout tabLayout, java.lang.String fontKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabLayout, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontKey, "fontKey");
        android.view.View childAt = tabLayout.getChildAt(0);
        java.util.Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) childAt;
        int childCount = viewGroup.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            android.view.View childAt2 = viewGroup.getChildAt(i);
            java.util.Objects.requireNonNull(childAt2, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) childAt2;
            int childCount2 = viewGroup2.getChildCount();
            if (childCount2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    android.view.View childAt3 = viewGroup2.getChildAt(i3);
                    if (childAt3 instanceof android.widget.TextView) {
                        android.widget.TextView textView = (android.widget.TextView) childAt3;
                        textView.setTypeface(customTypeFace(textView, fontKey));
                    }
                    if (i4 >= childCount2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
            if (i2 >= childCount) {
                return;
            } else {
                i = i2;
            }
        }
    }
}
