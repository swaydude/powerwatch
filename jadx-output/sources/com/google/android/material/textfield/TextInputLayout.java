package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends android.widget.LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_TextInputLayout;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final java.lang.String LOG_TAG = "TextInputLayout";
    private android.animation.ValueAnimator animator;
    private com.google.android.material.shape.MaterialShapeDrawable boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private final int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private final int boxStrokeWidthDefaultPx;
    private final int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private com.google.android.material.shape.MaterialShapeDrawable boxUnderline;
    final com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private android.content.res.ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private android.content.res.ColorStateList counterTextColor;
    private android.widget.TextView counterView;
    private int defaultFilledBackgroundColor;
    private android.content.res.ColorStateList defaultHintTextColor;
    private final int defaultStrokeColor;
    private final int disabledColor;
    private final int disabledFilledBackgroundColor;
    android.widget.EditText editText;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener> editTextAttachedListeners;
    private final java.util.LinkedHashSet<com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> endIconDelegates;
    private android.graphics.drawable.Drawable endIconDummyDrawable;
    private final android.widget.FrameLayout endIconFrame;
    private int endIconMode;
    private android.view.View.OnLongClickListener endIconOnLongClickListener;
    private android.content.res.ColorStateList endIconTintList;
    private android.graphics.PorterDuff.Mode endIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton endIconView;
    private final com.google.android.material.internal.CheckableImageButton errorIconView;
    private int focusedStrokeColor;
    private android.content.res.ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private java.lang.CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private final int hoveredFilledBackgroundColor;
    private final int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final com.google.android.material.textfield.IndicatorViewController indicatorViewController;
    private final android.widget.FrameLayout inputFrame;
    private boolean isProvidingHint;
    private android.graphics.drawable.Drawable originalEditTextEndDrawable;
    private java.lang.CharSequence originalHint;
    private boolean restoringSavedState;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    private android.graphics.drawable.Drawable startIconDummyDrawable;
    private android.view.View.OnLongClickListener startIconOnLongClickListener;
    private android.content.res.ColorStateList startIconTintList;
    private android.graphics.PorterDuff.Mode startIconTintMode;
    private final com.google.android.material.internal.CheckableImageButton startIconView;
    private final android.graphics.Rect tmpBoundsRect;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF;
    private android.graphics.Typeface typeface;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(com.google.android.material.textfield.TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(com.google.android.material.textfield.TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(android.content.Context context) {
        this(context, null);
    }

    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(com.google.android.material.internal.ThemeEnforcement.createThemedContext(context, attributeSet, i, i2), attributeSet, i);
        this.indicatorViewController = new com.google.android.material.textfield.IndicatorViewController(this);
        this.tmpRect = new android.graphics.Rect();
        this.tmpBoundsRect = new android.graphics.Rect();
        this.tmpRectF = new android.graphics.RectF();
        this.editTextAttachedListeners = new java.util.LinkedHashSet<>();
        this.endIconMode = 0;
        android.util.SparseArray<com.google.android.material.textfield.EndIconDelegate> sparseArray = new android.util.SparseArray<>();
        this.endIconDelegates = sparseArray;
        this.endIconChangedListeners = new java.util.LinkedHashSet<>();
        com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper = new com.google.android.material.internal.CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        android.content.Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context2);
        this.endIconFrame = frameLayout2;
        frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 8388629));
        frameLayout.addView(frameLayout2);
        collapsingTextHelper.setTextSizeInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper.setPositionInterpolator(com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR);
        collapsingTextHelper.setCollapsedTextGravity(com.google.android.material.badge.BadgeDrawable.TOP_START);
        androidx.appcompat.widget.TintTypedArray tintTypedArrayObtainTintedStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.TextInputLayout, i, i2, com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance, com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance, com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance, com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance, com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance);
        this.hintEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_hintEnabled, true);
        setHint(tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.shapeAppearanceModel = com.google.android.material.shape.ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        int dimensionPixelSize = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthDefaultPx = dimensionPixelSize;
        this.boxStrokeWidthFocusedPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = dimensionPixelSize;
        float dimension = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = tintTypedArrayObtainTintedStyledAttributes.getDimension(com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        com.google.android.material.shape.ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.shapeAppearanceModel = builder.build();
        android.content.res.ColorStateList colorStateList = com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            } else {
                android.content.res.ColorStateList colorStateList2 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(context2, com.google.android.material.R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList2.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_android_textColorHint)) {
            android.content.res.ColorStateList colorStateList3 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_android_textColorHint);
            this.focusedTextColor = colorStateList3;
            this.defaultHintTextColor = colorStateList3;
        }
        android.content.res.ColorStateList colorStateList4 = com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor);
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            this.defaultStrokeColor = colorStateList4.getDefaultColor();
            this.disabledColor = colorStateList4.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList4.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            this.focusedStrokeColor = colorStateList4.getColorForState(new int[]{android.R.attr.state_focused}, -1);
        } else {
            this.focusedStrokeColor = tintTypedArrayObtainTintedStyledAttributes.getColor(com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor, 0);
            this.defaultStrokeColor = androidx.core.content.ContextCompat.getColor(context2, com.google.android.material.R.color.mtrl_textinput_default_box_stroke_color);
            this.disabledColor = androidx.core.content.ContextCompat.getColor(context2, com.google.android.material.R.color.mtrl_textinput_disabled_color);
            this.hoveredStrokeColor = androidx.core.content.ContextCompat.getColor(context2, com.google.android.material.R.color.mtrl_textinput_hovered_box_stroke_color);
        }
        if (tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance, 0));
        }
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance, 0);
        boolean z = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_errorEnabled, false);
        com.google.android.material.internal.CheckableImageButton checkableImageButton = (com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_text_input_end_icon, (android.view.ViewGroup) frameLayout, false);
        this.errorIconView = checkableImageButton;
        frameLayout.addView(checkableImageButton);
        checkableImageButton.setVisibility(8);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_errorIconTint));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(com.google.android.material.R.string.error_icon_content_description));
        androidx.core.view.ViewCompat.setImportantForAccessibility(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setFocusable(false);
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_helperTextEnabled, false);
        java.lang.CharSequence text = tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_helperText);
        boolean z3 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        com.google.android.material.internal.CheckableImageButton checkableImageButton2 = (com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_text_input_start_icon, (android.view.ViewGroup) frameLayout, false);
        this.startIconView = checkableImageButton2;
        frameLayout.addView(checkableImageButton2);
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.TextInputLayout_startIconDrawable));
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_startIconCheckable, true));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconTint)) {
            setStartIconTintList(com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_startIconTint));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_startIconTintMode, -1), null));
        }
        setHelperTextEnabled(z2);
        setHelperText(text);
        setHelperTextTextAppearance(resourceId2);
        setErrorEnabled(z);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.counterTextAppearance);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_errorTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_hintTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_counterTextColor));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor));
        }
        setCounterEnabled(z3);
        setBoxBackgroundMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_boxBackgroundMode, 0));
        com.google.android.material.internal.CheckableImageButton checkableImageButton3 = (com.google.android.material.internal.CheckableImageButton) android.view.LayoutInflater.from(getContext()).inflate(com.google.android.material.R.layout.design_text_input_end_icon, (android.view.ViewGroup) frameLayout2, false);
        this.endIconView = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        sparseArray.append(-1, new com.google.android.material.textfield.CustomEndIconDelegate(this));
        sparseArray.append(0, new com.google.android.material.textfield.NoEndIconDelegate(this));
        sparseArray.append(1, new com.google.android.material.textfield.PasswordToggleEndIconDelegate(this));
        sparseArray.append(2, new com.google.android.material.textfield.ClearTextEndIconDelegate(this));
        sparseArray.append(3, new com.google.android.material.textfield.DropdownMenuEndIconDelegate(this));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_endIconMode, 0));
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.TextInputLayout_endIconDrawable));
            }
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(tintTypedArrayObtainTintedStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(tintTypedArrayObtainTintedStyledAttributes.getDrawable(com.google.android.material.R.styleable.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(tintTypedArrayObtainTintedStyledAttributes.getText(com.google.android.material.R.styleable.TextInputLayout_passwordToggleContentDescription));
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint));
            }
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconTint)) {
                setEndIconTintList(com.google.android.material.resources.MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, com.google.android.material.R.styleable.TextInputLayout_endIconTint));
            }
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(com.google.android.material.R.styleable.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(com.google.android.material.internal.ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(com.google.android.material.R.styleable.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        androidx.core.view.ViewCompat.setImportantForAccessibility(this, 2);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof android.widget.EditText) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((android.widget.EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    com.google.android.material.shape.MaterialShapeDrawable getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        throw new java.lang.IllegalStateException();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderline = null;
            return;
        }
        if (i == 1) {
            this.boxBackground = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderline = new com.google.android.material.shape.MaterialShapeDrawable();
        } else {
            if (i == 2) {
                if (this.hintEnabled && !(this.boxBackground instanceof com.google.android.material.textfield.CutoutDrawable)) {
                    this.boxBackground = new com.google.android.material.textfield.CutoutDrawable(this.shapeAppearanceModel);
                } else {
                    this.boxBackground = new com.google.android.material.shape.MaterialShapeDrawable(this.shapeAppearanceModel);
                }
                this.boxUnderline = null;
                return;
            }
            throw new java.lang.IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            androidx.core.view.ViewCompat.setBackground(this.editText, this.boxBackground);
        }
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        android.widget.EditText editText = this.editText;
        return (editText == null || this.boxBackground == null || editText.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(androidx.core.content.ContextCompat.getColor(getContext(), i));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        if (this.boxBackground.getTopLeftCornerResolvedSize() == f && this.boxBackground.getTopRightCornerResolvedSize() == f2 && this.boxBackground.getBottomRightCornerResolvedSize() == f4 && this.boxBackground.getBottomLeftCornerResolvedSize() == f3) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f).setTopRightCornerSize(f2).setBottomRightCornerSize(f4).setBottomLeftCornerSize(f3).build();
        applyBoxAttributes();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxBackground.getTopLeftCornerResolvedSize();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxBackground.getTopRightCornerResolvedSize();
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxBackground.getBottomLeftCornerResolvedSize();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxBackground.getBottomRightCornerResolvedSize();
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            android.widget.TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public android.graphics.Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i) {
        android.widget.EditText editText;
        if (this.originalHint == null || (editText = this.editText) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.isProvidingHint;
        this.isProvidingHint = false;
        java.lang.CharSequence hint = editText.getHint();
        this.editText.setHint(this.originalHint);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.editText.setHint(hint);
            this.isProvidingHint = z;
        }
    }

    private void setEditText(android.widget.EditText editText) {
        if (this.editText != null) {
            throw new java.lang.IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.endIconMode != 3 && !(editText instanceof com.google.android.material.textfield.TextInputEditText)) {
            android.util.Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.editText.addTextChangedListener(new android.text.TextWatcher() { // from class: com.google.android.material.textfield.TextInputLayout.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                com.google.android.material.textfield.TextInputLayout textInputLayout = com.google.android.material.textfield.TextInputLayout.this;
                textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
                if (com.google.android.material.textfield.TextInputLayout.this.counterEnabled) {
                    com.google.android.material.textfield.TextInputLayout.this.updateCounter(editable.length());
                }
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (android.text.TextUtils.isEmpty(this.hint)) {
                java.lang.CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((java.lang.CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText().length());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startIconView.bringToFront();
        this.endIconFrame.bringToFront();
        this.errorIconView.bringToFront();
        dispatchOnEditTextAttached();
        updateLabelState(false, true);
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop();
        }
        return super.getBaseline();
    }

    void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    private void updateLabelState(boolean z, boolean z2) {
        android.content.res.ColorStateList colorStateList;
        android.widget.TextView textView;
        boolean zIsEnabled = isEnabled();
        android.widget.EditText editText = this.editText;
        boolean z3 = (editText == null || android.text.TextUtils.isEmpty(editText.getText())) ? false : true;
        android.widget.EditText editText2 = this.editText;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zErrorShouldBeShown = this.indicatorViewController.errorShouldBeShown();
        android.content.res.ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList2);
            this.collapsingTextHelper.setExpandedTextColor(this.defaultHintTextColor);
        }
        if (!zIsEnabled) {
            this.collapsingTextHelper.setCollapsedTextColor(android.content.res.ColorStateList.valueOf(this.disabledColor));
            this.collapsingTextHelper.setExpandedTextColor(android.content.res.ColorStateList.valueOf(this.disabledColor));
        } else if (zErrorShouldBeShown) {
            this.collapsingTextHelper.setCollapsedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || zErrorShouldBeShown))) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
                return;
            }
            return;
        }
        if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    public android.widget.EditText getEditText() {
        return this.editText;
    }

    public void setHint(java.lang.CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    private void setHintInternal(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.setText(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    public java.lang.CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (!z) {
                this.isProvidingHint = false;
                if (!android.text.TextUtils.isEmpty(this.hint) && android.text.TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            } else {
                java.lang.CharSequence hint = this.editText.getHint();
                if (!android.text.TextUtils.isEmpty(hint)) {
                    if (android.text.TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((java.lang.CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public void setHintTextAppearance(int i) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public android.content.res.ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public void setDefaultHintTextColor(android.content.res.ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    public android.content.res.ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public void setErrorEnabled(boolean z) {
        this.indicatorViewController.setErrorEnabled(z);
    }

    public void setErrorTextAppearance(int i) {
        this.indicatorViewController.setErrorTextAppearance(i);
    }

    public void setErrorTextColor(android.content.res.ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    public void setHelperTextTextAppearance(int i) {
        this.indicatorViewController.setHelperTextAppearance(i);
    }

    public void setHelperTextColor(android.content.res.ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public void setHelperTextEnabled(boolean z) {
        this.indicatorViewController.setHelperTextEnabled(z);
    }

    public void setHelperText(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(charSequence);
        }
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    public void setError(java.lang.CharSequence charSequence) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.showError(charSequence);
        } else {
            this.indicatorViewController.hideError();
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setErrorIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null);
    }

    public android.graphics.drawable.Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    public void setErrorIconTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, mode);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(com.google.android.material.R.id.textinput_counter);
                android.graphics.Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public android.content.res.ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(android.content.res.ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public android.content.res.ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            android.widget.EditText editText = this.editText;
            updateCounter(editText == null ? 0 : editText.getText().length());
        }
    }

    void updateCounter(int i) {
        boolean z = this.counterOverflowed;
        if (this.counterMaxLength == -1) {
            this.counterView.setText(java.lang.String.valueOf(i));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            if (androidx.core.view.ViewCompat.getAccessibilityLiveRegion(this.counterView) == 1) {
                androidx.core.view.ViewCompat.setAccessibilityLiveRegion(this.counterView, 0);
            }
            this.counterOverflowed = i > this.counterMaxLength;
            updateCounterContentDescription(getContext(), this.counterView, i, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
                if (this.counterOverflowed) {
                    androidx.core.view.ViewCompat.setAccessibilityLiveRegion(this.counterView, 1);
                }
            }
            this.counterView.setText(getContext().getString(com.google.android.material.R.string.character_counter_pattern, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.counterMaxLength)));
        }
        if (this.editText == null || z == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    private static void updateCounterContentDescription(android.content.Context context, android.widget.TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? com.google.android.material.R.string.character_counter_overflowed_content_description : com.google.android.material.R.string.character_counter_content_description, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    private static void recursiveSetEnabled(android.view.ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof android.view.ViewGroup) {
                recursiveSetEnabled((android.view.ViewGroup) childAt, z);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    java.lang.CharSequence getCounterOverflowDescription() {
        android.widget.TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    private void updateCounterTextAppearanceAndColor() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.widget.TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    void setTextAppearanceCompatWithErrorFallback(android.widget.TextView textView, int i) {
        boolean z = true;
        try {
            androidx.core.widget.TextViewCompat.setTextAppearance(textView, i);
            if (android.os.Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (java.lang.Exception unused) {
        }
        if (z) {
            androidx.core.widget.TextViewCompat.setTextAppearance(textView, com.google.android.material.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(androidx.core.content.ContextCompat.getColor(getContext(), com.google.android.material.R.color.design_error));
        }
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0 || i == 1) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
        } else {
            if (i != 2) {
                return 0;
            }
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    private android.graphics.Rect calculateCollapsedTextBounds(android.graphics.Rect rect) {
        if (this.editText == null) {
            throw new java.lang.IllegalStateException();
        }
        android.graphics.Rect rect2 = this.tmpBoundsRect;
        rect2.bottom = rect.bottom;
        int i = this.boxBackgroundMode;
        if (i == 1) {
            rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            return rect2;
        }
        if (i == 2) {
            rect2.left = rect.left + this.editText.getPaddingLeft();
            rect2.top = rect.top - calculateLabelMarginTop();
            rect2.right = rect.right - this.editText.getPaddingRight();
            return rect2;
        }
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = getPaddingTop();
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        return rect2;
    }

    private android.graphics.Rect calculateExpandedTextBounds(android.graphics.Rect rect) {
        if (this.editText == null) {
            throw new java.lang.IllegalStateException();
        }
        android.graphics.Rect rect2 = this.tmpBoundsRect;
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
        return rect2;
    }

    private int calculateExpandedLabelTop(android.graphics.Rect rect, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.editText.getCompoundPaddingTop();
    }

    private int calculateExpandedLabelBottom(android.graphics.Rect rect, android.graphics.Rect rect2, float f) {
        if (this.boxBackgroundMode == 1) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && (android.os.Build.VERSION.SDK_INT < 16 || this.editText.getMinLines() <= 1);
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? com.google.android.material.color.MaterialColors.layer(com.google.android.material.color.MaterialColors.getColor(this, com.google.android.material.R.attr.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    private void applyBoxAttributes() {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        materialShapeDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.setFillColor(android.content.res.ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        if (this.endIconMode == 3) {
            this.editText.getBackground().invalidateSelf();
        }
        applyBoxUnderlineAttributes();
        invalidate();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderline == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderline.setFillColor(android.content.res.ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    void updateEditTextBackground() {
        android.graphics.drawable.Drawable background;
        android.widget.TextView textView;
        android.widget.EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (this.indicatorViewController.errorShouldBeShown()) {
            background.setColorFilter(androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(this.indicatorViewController.getErrorViewCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.DrawableCompat.clearColorFilter(background);
            this.editText.refreshDrawableState();
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.textfield.TextInputLayout.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.textfield.TextInputLayout.SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.textfield.TextInputLayout.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.textfield.TextInputLayout.SavedState createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.textfield.TextInputLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public com.google.android.material.textfield.TextInputLayout.SavedState[] newArray(int i) {
                return new com.google.android.material.textfield.TextInputLayout.SavedState[i];
            }
        };
        java.lang.CharSequence error;
        boolean isEndIconChecked;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            android.text.TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        public java.lang.String toString() {
            return "TextInputLayout.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " error=" + ((java.lang.Object) this.error) + "}";
        }
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.textfield.TextInputLayout.SavedState savedState = new com.google.android.material.textfield.TextInputLayout.SavedState(super.onSaveInstanceState());
        if (this.indicatorViewController.errorShouldBeShown()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = hasEndIcon() && this.endIconView.isChecked();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.textfield.TextInputLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.textfield.TextInputLayout.SavedState savedState = (com.google.android.material.textfield.TextInputLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            this.endIconView.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    com.google.android.material.textfield.TextInputLayout.this.endIconView.performClick();
                    com.google.android.material.textfield.TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    public java.lang.CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    public java.lang.CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateIconDummyDrawables = updateIconDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateIconDummyDrawables) {
            this.editText.post(new java.lang.Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    com.google.android.material.textfield.TextInputLayout.this.editText.requestLayout();
                }
            });
        }
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = java.lang.Math.max(this.endIconView.getMeasuredHeight(), this.startIconView.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setStartIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            applyStartIconTint();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((java.lang.CharSequence) null);
        }
    }

    public android.graphics.drawable.Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public void setStartIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updateIconDummyDrawables();
        }
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(java.lang.CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public java.lang.CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public void setStartIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            this.hasStartIconTintList = true;
            applyStartIconTint();
        }
    }

    public void setStartIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            this.hasStartIconTintMode = true;
            applyStartIconTint();
        }
    }

    public void setEndIconMode(int i) {
        int i2 = this.endIconMode;
        this.endIconMode = i;
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().isBoxBackgroundModeSupported(this.boxBackgroundMode)) {
            getEndIconDelegate().initialize();
            applyEndIconTint();
            dispatchOnEndIconChanged(i2);
        } else {
            throw new java.lang.IllegalStateException("The current box background mode " + this.boxBackgroundMode + " is not supported by the end icon mode " + i);
        }
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    public void setEndIconOnClickListener(android.view.View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 4);
            updateIconDummyDrawables();
        }
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    public void setEndIconDrawable(android.graphics.drawable.Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public android.graphics.drawable.Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(java.lang.CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public java.lang.CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public void setEndIconTintList(android.content.res.ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            this.hasEndIconTintList = true;
            applyEndIconTint();
        }
    }

    public void setEndIconTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            this.hasEndIconTintMode = true;
            applyEndIconTint();
        }
    }

    public void addOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    public void removeOnEndIconChangedListener(com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    public void addOnEditTextAttachedListener(com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void removeOnEditTextAttachedListener(com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleDrawable(android.graphics.drawable.Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleContentDescription(java.lang.CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    @java.lang.Deprecated
    public java.lang.CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @java.lang.Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintList(android.content.res.ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        this.hasEndIconTintList = true;
        applyEndIconTint();
    }

    @java.lang.Deprecated
    public void setPasswordVisibilityToggleTintMode(android.graphics.PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        this.hasEndIconTintMode = true;
        applyEndIconTint();
    }

    @java.lang.Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void setTextInputAccessibilityDelegate(com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate accessibilityDelegate) {
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            androidx.core.view.ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    com.google.android.material.internal.CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    private com.google.android.material.textfield.EndIconDelegate getEndIconDelegate() {
        com.google.android.material.textfield.EndIconDelegate endIconDelegate = this.endIconDelegates.get(this.endIconMode);
        return endIconDelegate != null ? endIconDelegate : this.endIconDelegates.get(0);
    }

    private void dispatchOnEditTextAttached() {
        java.util.Iterator<com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    private boolean hasStartIcon() {
        return getStartIconDrawable() != null;
    }

    private void applyStartIconTint() {
        applyIconTint(this.startIconView, this.hasStartIconTintList, this.startIconTintList, this.hasStartIconTintMode, this.startIconTintMode);
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private void dispatchOnEndIconChanged(int i) {
        java.util.Iterator<com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this, i);
        }
    }

    private void tintEndIconOnError(boolean z) {
        if (z && getEndIconDrawable() != null) {
            android.graphics.drawable.Drawable drawableMutate = androidx.core.graphics.drawable.DrawableCompat.wrap(getEndIconDrawable()).mutate();
            androidx.core.graphics.drawable.DrawableCompat.setTint(drawableMutate, this.indicatorViewController.getErrorViewCurrentTextColor());
            this.endIconView.setImageDrawable(drawableMutate);
            return;
        }
        applyEndIconTint();
    }

    private void applyEndIconTint() {
        applyIconTint(this.endIconView, this.hasEndIconTintList, this.endIconTintList, this.hasEndIconTintMode, this.endIconTintMode);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    private boolean updateIconDummyDrawables() {
        boolean z;
        if (this.editText == null) {
            return false;
        }
        boolean z2 = true;
        if (hasStartIcon() && isStartIconVisible() && this.startIconView.getMeasuredWidth() > 0) {
            if (this.startIconDummyDrawable == null) {
                this.startIconDummyDrawable = new android.graphics.drawable.ColorDrawable();
                this.startIconDummyDrawable.setBounds(0, 0, (this.startIconView.getMeasuredWidth() - this.editText.getPaddingLeft()) + androidx.core.view.MarginLayoutParamsCompat.getMarginEnd((android.view.ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()), 1);
            }
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            android.graphics.drawable.Drawable drawable = compoundDrawablesRelative[0];
            android.graphics.drawable.Drawable drawable2 = this.startIconDummyDrawable;
            if (drawable != drawable2) {
                androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.startIconDummyDrawable != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.startIconDummyDrawable = null;
            z = true;
        } else {
            z = false;
        }
        com.google.android.material.internal.CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable != null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
            if (this.endIconDummyDrawable == null) {
                this.endIconDummyDrawable = new android.graphics.drawable.ColorDrawable();
                this.endIconDummyDrawable.setBounds(0, 0, (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.editText.getPaddingRight()) + androidx.core.view.MarginLayoutParamsCompat.getMarginStart((android.view.ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()), 1);
            }
            android.graphics.drawable.Drawable[] compoundDrawablesRelative3 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            android.graphics.drawable.Drawable drawable3 = compoundDrawablesRelative3[2];
            android.graphics.drawable.Drawable drawable4 = this.endIconDummyDrawable;
            if (drawable3 != drawable4) {
                this.originalEditTextEndDrawable = compoundDrawablesRelative3[2];
                androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable4, compoundDrawablesRelative3[3]);
            } else {
                z2 = z;
            }
        } else {
            if (this.endIconDummyDrawable == null) {
                return z;
            }
            android.graphics.drawable.Drawable[] compoundDrawablesRelative4 = androidx.core.widget.TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if (compoundDrawablesRelative4[2] == this.endIconDummyDrawable) {
                androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.endIconDummyDrawable = null;
        }
        return z2;
    }

    private com.google.android.material.internal.CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    private void applyIconTint(com.google.android.material.internal.CheckableImageButton checkableImageButton, boolean z, android.content.res.ColorStateList colorStateList, boolean z2, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = androidx.core.graphics.drawable.DrawableCompat.wrap(drawable).mutate();
            if (z) {
                androidx.core.graphics.drawable.DrawableCompat.setTintList(drawable, colorStateList);
            }
            if (z2) {
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static void setIconOnClickListener(android.view.View view, android.view.View.OnClickListener onClickListener, android.view.View.OnLongClickListener onLongClickListener) {
        view.setOnClickListener(onClickListener);
        setIconClickable(view, onLongClickListener);
    }

    private static void setIconOnLongClickListener(android.view.View view, android.view.View.OnLongClickListener onLongClickListener) {
        view.setOnLongClickListener(onLongClickListener);
        setIconClickable(view, onLongClickListener);
    }

    private static void setIconClickable(android.view.View view, android.view.View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = androidx.core.view.ViewCompat.hasOnClickListeners(view);
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        view.setFocusable(z2);
        view.setClickable(zHasOnClickListeners);
        view.setLongClickable(z);
        androidx.core.view.ViewCompat.setImportantForAccessibility(view, z2 ? 1 : 2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.widget.EditText editText = this.editText;
        if (editText != null) {
            android.graphics.Rect rect = this.tmpRect;
            com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    private void updateBoxUnderlineBounds(android.graphics.Rect rect) {
        if (this.boxUnderline != null) {
            this.boxUnderline.setBounds(rect.left, rect.bottom - this.boxStrokeWidthFocusedPx, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    private void drawHint(android.graphics.Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void drawBoxUnderline(android.graphics.Canvas canvas) {
        com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable = this.boxUnderline;
        if (materialShapeDrawable != null) {
            android.graphics.Rect bounds = materialShapeDrawable.getBounds();
            bounds.top = bounds.bottom - this.boxStrokeWidthPx;
            this.boxUnderline.draw(canvas);
        }
    }

    private void collapseHint(boolean z) {
        android.animation.ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !android.text.TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof com.google.android.material.textfield.CutoutDrawable);
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            android.graphics.RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextActualBounds(rectF);
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).setCutout(rectF);
        }
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void applyCutoutPadding(android.graphics.RectF rectF) {
        rectF.left -= this.boxLabelCutoutPaddingPx;
        rectF.top -= this.boxLabelCutoutPaddingPx;
        rectF.right += this.boxLabelCutoutPaddingPx;
        rectF.bottom += this.boxLabelCutoutPaddingPx;
    }

    boolean cutoutIsOpen() {
        return cutoutEnabled() && ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).hasCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) | false : false;
        updateLabelState(androidx.core.view.ViewCompat.isLaidOut(this) && isEnabled());
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    void updateTextInputBoxState() {
        android.widget.TextView textView;
        android.widget.EditText editText;
        android.widget.EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.editText) != null && editText.isHovered());
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (this.indicatorViewController.errorShouldBeShown()) {
            this.boxStrokeColor = this.indicatorViewController.getErrorViewCurrentTextColor();
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.boxStrokeColor = textView.getCurrentTextColor();
        } else if (z2) {
            this.boxStrokeColor = this.focusedStrokeColor;
        } else if (z3) {
            this.boxStrokeColor = this.hoveredStrokeColor;
        } else {
            this.boxStrokeColor = this.defaultStrokeColor;
        }
        tintEndIconOnError(this.indicatorViewController.errorShouldBeShown() && getEndIconDelegate().shouldTintIconOnError());
        if (getErrorIconDrawable() != null && this.indicatorViewController.errorShouldBeShown()) {
            z = true;
        }
        setErrorIconVisible(z);
        if ((z3 || z2) && isEnabled()) {
            this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
        } else {
            this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z3) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    private void setErrorIconVisible(boolean z) {
        this.errorIconView.setVisibility(z ? 0 : 8);
        this.endIconFrame.setVisibility(z ? 8 : 0);
        if (hasEndIcon()) {
            return;
        }
        updateIconDummyDrawables();
    }

    private void expandHint(boolean z) {
        android.animation.ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((com.google.android.material.textfield.CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
    }

    void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.getExpansionFraction() == f) {
            return;
        }
        if (this.animator == null) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.animator.setDuration(167L);
            this.animator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                    com.google.android.material.textfield.TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f);
        this.animator.start();
    }

    final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    final int getErrorTextCurrentColor() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    public static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final com.google.android.material.textfield.TextInputLayout layout;

        public AccessibilityDelegate(com.google.android.material.textfield.TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View view, androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            android.widget.EditText editText = this.layout.getEditText();
            android.text.Editable text = editText != null ? editText.getText() : null;
            java.lang.CharSequence hint = this.layout.getHint();
            java.lang.CharSequence error = this.layout.getError();
            java.lang.CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean z = !android.text.TextUtils.isEmpty(text);
            boolean z2 = !android.text.TextUtils.isEmpty(hint);
            boolean z3 = !android.text.TextUtils.isEmpty(error);
            boolean z4 = false;
            boolean z5 = z3 || !android.text.TextUtils.isEmpty(counterOverflowDescription);
            if (z) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (z2) {
                accessibilityNodeInfoCompat.setText(hint);
            }
            if (z2) {
                accessibilityNodeInfoCompat.setHintText(hint);
                if (!z && z2) {
                    z4 = true;
                }
                accessibilityNodeInfoCompat.setShowingHintText(z4);
            }
            if (z5) {
                if (!z3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
                accessibilityNodeInfoCompat.setContentInvalid(true);
            }
        }
    }
}
