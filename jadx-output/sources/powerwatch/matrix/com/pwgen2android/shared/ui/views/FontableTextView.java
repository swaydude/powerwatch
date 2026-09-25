package powerwatch.matrix.com.pwgen2android.shared.ui.views;

/* JADX INFO: compiled from: FontableTextView.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/FontableTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "init", "", "Landroid/content/res/TypedArray;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FontableTextView extends android.widget.TextView {
    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontableTextView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontableTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, powerwatch.matrix.com.pwgen2android.R.styleable.Fontable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttributes(attrs,\n                R.styleable.Fontable)");
        init(context, typedArrayObtainStyledAttributes);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, powerwatch.matrix.com.pwgen2android.R.styleable.Fontable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttributes(attrs,\n                R.styleable.Fontable)");
        init(context, typedArrayObtainStyledAttributes);
    }

    private final void init(android.content.Context context, android.content.res.TypedArray attrs) {
        if (attrs != null) {
            java.lang.String string = attrs.getString(0);
            android.util.Log.d("my_custom_font", string == null ? "" : string);
            if (string == null || powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextViewKt.getFonts().get(string) == null) {
                return;
            }
            android.content.res.AssetManager assets = context.getAssets();
            java.lang.String str = powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextViewKt.getFonts().get(string);
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            setTypeface(android.graphics.Typeface.createFromAsset(assets, kotlin.jvm.internal.Intrinsics.stringPlus(str, ".otf")));
        }
    }
}
