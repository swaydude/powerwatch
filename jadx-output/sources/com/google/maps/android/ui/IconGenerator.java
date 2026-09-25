package com.google.maps.android.ui;

/* JADX INFO: loaded from: classes2.dex */
public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 1.0f;
    private com.google.maps.android.ui.BubbleDrawable mBackground;
    private android.view.ViewGroup mContainer;
    private android.view.View mContentView;
    private final android.content.Context mContext;
    private int mRotation;
    private com.google.maps.android.ui.RotationLayout mRotationLayout;
    private android.widget.TextView mTextView;

    private static int getStyleColor(int i) {
        if (i == 3) {
            return -3407872;
        }
        if (i == 4) {
            return -16737844;
        }
        if (i == 5) {
            return -10053376;
        }
        if (i != 6) {
            return i != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    public IconGenerator(android.content.Context context) {
        this.mContext = context;
        this.mBackground = new com.google.maps.android.ui.BubbleDrawable(context.getResources());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.google.maps.android.R.layout.amu_text_bubble, (android.view.ViewGroup) null);
        this.mContainer = viewGroup;
        com.google.maps.android.ui.RotationLayout rotationLayout = (com.google.maps.android.ui.RotationLayout) viewGroup.getChildAt(0);
        this.mRotationLayout = rotationLayout;
        android.widget.TextView textView = (android.widget.TextView) rotationLayout.findViewById(com.google.maps.android.R.id.amu_text);
        this.mTextView = textView;
        this.mContentView = textView;
        setStyle(1);
    }

    public android.graphics.Bitmap makeIcon(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public android.graphics.Bitmap makeIcon() {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContainer.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.mContainer.getMeasuredWidth();
        int measuredHeight = this.mContainer.getMeasuredHeight();
        this.mContainer.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.mRotation;
        if (i == 1 || i == 3) {
            measuredHeight = this.mContainer.getMeasuredWidth();
            measuredWidth = this.mContainer.getMeasuredHeight();
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(measuredWidth, measuredHeight, android.graphics.Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        int i2 = this.mRotation;
        if (i2 != 0) {
            if (i2 == 1) {
                canvas.translate(measuredWidth, 0.0f);
                canvas.rotate(90.0f);
            } else if (i2 == 2) {
                canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
            } else {
                canvas.translate(0.0f, measuredHeight);
                canvas.rotate(270.0f);
            }
        }
        this.mContainer.draw(canvas);
        return bitmapCreateBitmap;
    }

    public void setContentView(android.view.View view) {
        this.mRotationLayout.removeAllViews();
        this.mRotationLayout.addView(view);
        this.mContentView = view;
        android.view.View viewFindViewById = this.mRotationLayout.findViewById(com.google.maps.android.R.id.amu_text);
        this.mTextView = viewFindViewById instanceof android.widget.TextView ? (android.widget.TextView) viewFindViewById : null;
    }

    public void setContentRotation(int i) {
        this.mRotationLayout.setViewRotation(i);
    }

    public void setRotation(int i) {
        this.mRotation = ((i + 360) % 360) / 90;
    }

    public float getAnchorU() {
        return rotateAnchor(this.mAnchorU, this.mAnchorV);
    }

    public float getAnchorV() {
        return rotateAnchor(this.mAnchorV, this.mAnchorU);
    }

    private float rotateAnchor(float f, float f2) {
        int i = this.mRotation;
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            return 1.0f - f2;
        }
        if (i == 2) {
            return 1.0f - f;
        }
        if (i == 3) {
            return f2;
        }
        throw new java.lang.IllegalStateException();
    }

    public void setTextAppearance(android.content.Context context, int i) {
        android.widget.TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(this.mContext, i);
    }

    public void setStyle(int i) {
        setColor(getStyleColor(i));
        setTextAppearance(this.mContext, getTextStyle(i));
    }

    public void setColor(int i) {
        this.mBackground.setColor(i);
        setBackground(this.mBackground);
    }

    public void setBackground(android.graphics.drawable.Drawable drawable) {
        this.mContainer.setBackgroundDrawable(drawable);
        if (drawable != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            drawable.getPadding(rect);
            this.mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.mContainer.setPadding(0, 0, 0, 0);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentView.setPadding(i, i2, i3, i4);
    }

    private static int getTextStyle(int i) {
        if (i != 3 && i != 4 && i != 5 && i != 6 && i != 7) {
            return com.google.maps.android.R.style.amu_Bubble_TextAppearance_Dark;
        }
        return com.google.maps.android.R.style.amu_Bubble_TextAppearance_Light;
    }
}
