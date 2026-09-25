package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
public class ShapeAppearancePathProvider {
    private final com.google.android.material.shape.ShapePath[] cornerPaths = new com.google.android.material.shape.ShapePath[4];
    private final android.graphics.Matrix[] cornerTransforms = new android.graphics.Matrix[4];
    private final android.graphics.Matrix[] edgeTransforms = new android.graphics.Matrix[4];
    private final android.graphics.PointF pointF = new android.graphics.PointF();
    private final com.google.android.material.shape.ShapePath shapePath = new com.google.android.material.shape.ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];

    public interface PathListener {
        void onCornerPathCreated(com.google.android.material.shape.ShapePath shapePath, android.graphics.Matrix matrix, int i);

        void onEdgePathCreated(com.google.android.material.shape.ShapePath shapePath, android.graphics.Matrix matrix, int i);
    }

    private float angleOfEdge(int i) {
        return (i + 1) * 90;
    }

    public ShapeAppearancePathProvider() {
        for (int i = 0; i < 4; i++) {
            this.cornerPaths[i] = new com.google.android.material.shape.ShapePath();
            this.cornerTransforms[i] = new android.graphics.Matrix();
            this.edgeTransforms[i] = new android.graphics.Matrix();
        }
    }

    public void calculatePath(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, float f, android.graphics.RectF rectF, android.graphics.Path path) {
        calculatePath(shapeAppearanceModel, f, rectF, null, path);
    }

    public void calculatePath(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, float f, android.graphics.RectF rectF, com.google.android.material.shape.ShapeAppearancePathProvider.PathListener pathListener, android.graphics.Path path) {
        path.rewind();
        com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec shapeAppearancePathSpec = new com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec(shapeAppearanceModel, f, rectF, pathListener, path);
        for (int i = 0; i < 4; i++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i);
            setEdgePathAndTransform(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            appendCornerPath(shapeAppearancePathSpec, i2);
            appendEdgePath(shapeAppearancePathSpec, i2);
        }
        path.close();
    }

    private void setCornerPathAndTransform(com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        getCornerTreatmentForIndex(i, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, getCornerSizeForIndex(i, shapeAppearancePathSpec.shapeAppearanceModel));
        float fAngleOfEdge = angleOfEdge(i);
        this.cornerTransforms[i].reset();
        getCoordinatesOfCorner(i, shapeAppearancePathSpec.bounds, this.pointF);
        this.cornerTransforms[i].setTranslate(this.pointF.x, this.pointF.y);
        this.cornerTransforms[i].preRotate(fAngleOfEdge);
    }

    private void setEdgePathAndTransform(int i) {
        this.scratch[0] = this.cornerPaths[i].getEndX();
        this.scratch[1] = this.cornerPaths[i].getEndY();
        this.cornerTransforms[i].mapPoints(this.scratch);
        float fAngleOfEdge = angleOfEdge(i);
        this.edgeTransforms[i].reset();
        android.graphics.Matrix matrix = this.edgeTransforms[i];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i].preRotate(fAngleOfEdge);
    }

    private void appendCornerPath(com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        this.scratch[0] = this.cornerPaths[i].getStartX();
        this.scratch[1] = this.cornerPaths[i].getStartY();
        this.cornerTransforms[i].mapPoints(this.scratch);
        if (i == 0) {
            android.graphics.Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            android.graphics.Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i].applyToPath(this.cornerTransforms[i], shapeAppearancePathSpec.path);
        if (shapeAppearancePathSpec.pathListener != null) {
            shapeAppearancePathSpec.pathListener.onCornerPathCreated(this.cornerPaths[i], this.cornerTransforms[i], i);
        }
    }

    private void appendEdgePath(com.google.android.material.shape.ShapeAppearancePathProvider.ShapeAppearancePathSpec shapeAppearancePathSpec, int i) {
        int i2 = (i + 1) % 4;
        this.scratch[0] = this.cornerPaths[i].getEndX();
        this.scratch[1] = this.cornerPaths[i].getEndY();
        this.cornerTransforms[i].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i2].getStartX();
        this.scratch2[1] = this.cornerPaths[i2].getStartY();
        this.cornerTransforms[i2].mapPoints(this.scratch2);
        float[] fArr = this.scratch;
        float f = fArr[0];
        float[] fArr2 = this.scratch2;
        float fMax = java.lang.Math.max(((float) java.lang.Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i);
        this.shapePath.reset(0.0f, 0.0f);
        getEdgeTreatmentForIndex(i, shapeAppearancePathSpec.shapeAppearanceModel).getEdgePath(fMax, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.shapePath.applyToPath(this.edgeTransforms[i], shapeAppearancePathSpec.path);
        if (shapeAppearancePathSpec.pathListener != null) {
            shapeAppearancePathSpec.pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i], i);
        }
    }

    private float getEdgeCenterForIndex(android.graphics.RectF rectF, int i) {
        this.scratch[0] = this.cornerPaths[i].endX;
        this.scratch[1] = this.cornerPaths[i].endY;
        this.cornerTransforms[i].mapPoints(this.scratch);
        if (i == 1 || i == 3) {
            return java.lang.Math.abs(rectF.centerX() - this.scratch[0]);
        }
        return java.lang.Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private com.google.android.material.shape.CornerTreatment getCornerTreatmentForIndex(int i, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (i == 1) {
            return shapeAppearanceModel.getBottomRightCorner();
        }
        if (i == 2) {
            return shapeAppearanceModel.getBottomLeftCorner();
        }
        if (i == 3) {
            return shapeAppearanceModel.getTopLeftCorner();
        }
        return shapeAppearanceModel.getTopRightCorner();
    }

    private com.google.android.material.shape.CornerSize getCornerSizeForIndex(int i, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (i == 1) {
            return shapeAppearanceModel.getBottomRightCornerSize();
        }
        if (i == 2) {
            return shapeAppearanceModel.getBottomLeftCornerSize();
        }
        if (i == 3) {
            return shapeAppearanceModel.getTopLeftCornerSize();
        }
        return shapeAppearanceModel.getTopRightCornerSize();
    }

    private com.google.android.material.shape.EdgeTreatment getEdgeTreatmentForIndex(int i, com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel) {
        if (i == 1) {
            return shapeAppearanceModel.getBottomEdge();
        }
        if (i == 2) {
            return shapeAppearanceModel.getLeftEdge();
        }
        if (i == 3) {
            return shapeAppearanceModel.getTopEdge();
        }
        return shapeAppearanceModel.getRightEdge();
    }

    private void getCoordinatesOfCorner(int i, android.graphics.RectF rectF, android.graphics.PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i == 3) {
            pointF.set(rectF.left, rectF.top);
        } else {
            pointF.set(rectF.right, rectF.top);
        }
    }

    static final class ShapeAppearancePathSpec {
        public final android.graphics.RectF bounds;
        public final float interpolation;
        public final android.graphics.Path path;
        public final com.google.android.material.shape.ShapeAppearancePathProvider.PathListener pathListener;
        public final com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel, float f, android.graphics.RectF rectF, com.google.android.material.shape.ShapeAppearancePathProvider.PathListener pathListener, android.graphics.Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f;
            this.bounds = rectF;
            this.path = path;
        }
    }
}
