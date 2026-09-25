package androidx.preference;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends androidx.preference.PreferenceGroup {
    @Override // androidx.preference.Preference
    public boolean isEnabled() {
        return false;
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public boolean shouldDisableDependents() {
        return !super.isEnabled();
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        android.widget.TextView textView;
        super.onBindViewHolder(preferenceViewHolder);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            preferenceViewHolder.itemView.setAccessibilityHeading(true);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 21) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (getContext().getTheme().resolveAttribute(androidx.preference.R.attr.colorAccent, typedValue, true) && (textView = (android.widget.TextView) preferenceViewHolder.findViewById(android.R.id.title)) != null) {
                if (textView.getCurrentTextColor() != androidx.core.content.ContextCompat.getColor(getContext(), androidx.preference.R.color.preference_fallback_accent_color)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Override // androidx.preference.Preference
    @java.lang.Deprecated
    public void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfo;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
        if (android.os.Build.VERSION.SDK_INT >= 28 || (collectionItemInfo = accessibilityNodeInfoCompat.getCollectionItemInfo()) == null) {
            return;
        }
        accessibilityNodeInfoCompat.setCollectionItemInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true, collectionItemInfo.isSelected()));
    }
}
