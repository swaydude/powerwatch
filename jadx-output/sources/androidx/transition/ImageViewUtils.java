package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ImageViewUtils {
    private static final java.lang.String TAG = "ImageViewUtils";
    private static java.lang.reflect.Method sAnimateTransformMethod;
    private static boolean sAnimateTransformMethodFetched;

    static void startAnimateTransform(android.widget.ImageView imageView) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            android.widget.ImageView.ScaleType scaleType = imageView.getScaleType();
            imageView.setTag(androidx.transition.R.id.save_scale_type, scaleType);
            if (scaleType == android.widget.ImageView.ScaleType.MATRIX) {
                imageView.setTag(androidx.transition.R.id.save_image_matrix, imageView.getImageMatrix());
            } else {
                imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            }
            imageView.setImageMatrix(androidx.transition.MatrixUtils.IDENTITY_MATRIX);
        }
    }

    static void animateTransform(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            imageView.setImageMatrix(matrix);
            return;
        }
        fetchAnimateTransformMethod();
        java.lang.reflect.Method method = sAnimateTransformMethod;
        if (method != null) {
            try {
                method.invoke(imageView, matrix);
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
    }

    private static void fetchAnimateTransformMethod() {
        if (sAnimateTransformMethodFetched) {
            return;
        }
        try {
            java.lang.reflect.Method declaredMethod = android.widget.ImageView.class.getDeclaredMethod("animateTransform", android.graphics.Matrix.class);
            sAnimateTransformMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve animateTransform method", e);
        }
        sAnimateTransformMethodFetched = true;
    }

    static void reserveEndAnimateTransform(final android.widget.ImageView imageView, android.animation.Animator animator) {
        if (android.os.Build.VERSION.SDK_INT < 21) {
            animator.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.transition.ImageViewUtils.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator2) {
                    android.widget.ImageView.ScaleType scaleType = (android.widget.ImageView.ScaleType) imageView.getTag(androidx.transition.R.id.save_scale_type);
                    imageView.setScaleType(scaleType);
                    imageView.setTag(androidx.transition.R.id.save_scale_type, null);
                    if (scaleType == android.widget.ImageView.ScaleType.MATRIX) {
                        android.widget.ImageView imageView2 = imageView;
                        imageView2.setImageMatrix((android.graphics.Matrix) imageView2.getTag(androidx.transition.R.id.save_image_matrix));
                        imageView.setTag(androidx.transition.R.id.save_image_matrix, null);
                    }
                    animator2.removeListener(this);
                }
            });
        }
    }

    private ImageViewUtils() {
    }
}
