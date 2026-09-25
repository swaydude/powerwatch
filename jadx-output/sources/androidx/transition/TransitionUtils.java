package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class TransitionUtils {
    private static final boolean HAS_IS_ATTACHED_TO_WINDOW;
    private static final boolean HAS_OVERLAY;
    private static final boolean HAS_PICTURE_BITMAP;
    private static final int MAX_IMAGE_SIZE = 1048576;

    static {
        HAS_IS_ATTACHED_TO_WINDOW = android.os.Build.VERSION.SDK_INT >= 19;
        HAS_OVERLAY = android.os.Build.VERSION.SDK_INT >= 18;
        HAS_PICTURE_BITMAP = android.os.Build.VERSION.SDK_INT >= 28;
    }

    static android.view.View copyViewImage(android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        androidx.transition.ViewUtils.transformMatrixToGlobal(view, matrix);
        androidx.transition.ViewUtils.transformMatrixToLocal(viewGroup, matrix);
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = java.lang.Math.round(rectF.left);
        int iRound2 = java.lang.Math.round(rectF.top);
        int iRound3 = java.lang.Math.round(rectF.right);
        int iRound4 = java.lang.Math.round(rectF.bottom);
        android.widget.ImageView imageView = new android.widget.ImageView(view.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.graphics.Bitmap bitmapCreateViewBitmap = createViewBitmap(view, matrix, rectF, viewGroup);
        if (bitmapCreateViewBitmap != null) {
            imageView.setImageBitmap(bitmapCreateViewBitmap);
        }
        imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY), android.view.View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.EXACTLY));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    private static android.graphics.Bitmap createViewBitmap(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF, android.view.ViewGroup viewGroup) {
        boolean z;
        boolean zIsAttachedToWindow;
        boolean z2;
        android.graphics.Bitmap bitmapCreateBitmap;
        android.view.ViewGroup viewGroup2;
        int iIndexOfChild;
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4;
        if (HAS_IS_ATTACHED_TO_WINDOW) {
            z = !view.isAttachedToWindow();
            if (viewGroup != null) {
                zIsAttachedToWindow = viewGroup.isAttachedToWindow();
            }
            z2 = HAS_OVERLAY;
            bitmapCreateBitmap = null;
            if (z2 || !z) {
                viewGroup2 = null;
                iIndexOfChild = 0;
            } else {
                if (!zIsAttachedToWindow) {
                    return null;
                }
                viewGroup2 = (android.view.ViewGroup) view.getParent();
                iIndexOfChild = viewGroup2.indexOfChild(view);
                viewGroup.getOverlay().add(view);
            }
            iRound = java.lang.Math.round(rectF.width());
            iRound2 = java.lang.Math.round(rectF.height());
            if (iRound > 0 && iRound2 > 0) {
                float fMin = java.lang.Math.min(1.0f, 1048576.0f / (iRound * iRound2));
                iRound3 = java.lang.Math.round(iRound * fMin);
                iRound4 = java.lang.Math.round(iRound2 * fMin);
                matrix.postTranslate(-rectF.left, -rectF.top);
                matrix.postScale(fMin, fMin);
                if (HAS_PICTURE_BITMAP) {
                    android.graphics.Picture picture = new android.graphics.Picture();
                    android.graphics.Canvas canvasBeginRecording = picture.beginRecording(iRound3, iRound4);
                    canvasBeginRecording.concat(matrix);
                    view.draw(canvasBeginRecording);
                    picture.endRecording();
                    bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(picture);
                } else {
                    bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iRound3, iRound4, android.graphics.Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                    canvas.concat(matrix);
                    view.draw(canvas);
                }
            }
            if (z2 && z) {
                viewGroup.getOverlay().remove(view);
                viewGroup2.addView(view, iIndexOfChild);
            }
            return bitmapCreateBitmap;
        }
        z = false;
        zIsAttachedToWindow = false;
        z2 = HAS_OVERLAY;
        bitmapCreateBitmap = null;
        if (z2) {
            viewGroup2 = null;
            iIndexOfChild = 0;
        } else {
            viewGroup2 = null;
            iIndexOfChild = 0;
        }
        iRound = java.lang.Math.round(rectF.width());
        iRound2 = java.lang.Math.round(rectF.height());
        if (iRound > 0) {
            float fMin2 = java.lang.Math.min(1.0f, 1048576.0f / (iRound * iRound2));
            iRound3 = java.lang.Math.round(iRound * fMin2);
            iRound4 = java.lang.Math.round(iRound2 * fMin2);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin2, fMin2);
            if (HAS_PICTURE_BITMAP) {
                android.graphics.Picture picture2 = new android.graphics.Picture();
                android.graphics.Canvas canvasBeginRecording2 = picture2.beginRecording(iRound3, iRound4);
                canvasBeginRecording2.concat(matrix);
                view.draw(canvasBeginRecording2);
                picture2.endRecording();
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(picture2);
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iRound3, iRound4, android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap);
                canvas2.concat(matrix);
                view.draw(canvas2);
            }
        }
        if (z2) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        return bitmapCreateBitmap;
    }

    static android.animation.Animator mergeAnimators(android.animation.Animator animator, android.animation.Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    static class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        final float[] mTempStartValues = new float[9];
        final float[] mTempEndValues = new float[9];
        final android.graphics.Matrix mTempMatrix = new android.graphics.Matrix();

        MatrixEvaluator() {
        }

        @Override // android.animation.TypeEvaluator
        public android.graphics.Matrix evaluate(float f, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
            matrix.getValues(this.mTempStartValues);
            matrix2.getValues(this.mTempEndValues);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.mTempEndValues;
                float f2 = fArr[i];
                float[] fArr2 = this.mTempStartValues;
                fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
            }
            this.mTempMatrix.setValues(this.mTempEndValues);
            return this.mTempMatrix;
        }
    }

    private TransitionUtils() {
    }
}
