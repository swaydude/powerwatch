package com.github.mikephil.charting.data;

/* JADX INFO: loaded from: classes.dex */
public class ScatterDataSet extends com.github.mikephil.charting.data.LineScatterCandleRadarDataSet<com.github.mikephil.charting.data.Entry> implements com.github.mikephil.charting.interfaces.datasets.IScatterDataSet {
    private int mScatterShapeHoleColor;
    private float mScatterShapeHoleRadius;
    protected com.github.mikephil.charting.renderer.scatter.IShapeRenderer mShapeRenderer;
    private float mShapeSize;

    public ScatterDataSet(java.util.List<com.github.mikephil.charting.data.Entry> list, java.lang.String str) {
        super(list, str);
        this.mShapeSize = 15.0f;
        this.mShapeRenderer = new com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer();
        this.mScatterShapeHoleRadius = 0.0f;
        this.mScatterShapeHoleColor = com.github.mikephil.charting.utils.ColorTemplate.COLOR_NONE;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public com.github.mikephil.charting.data.DataSet<com.github.mikephil.charting.data.Entry> copy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.mValues.size(); i++) {
            arrayList.add(((com.github.mikephil.charting.data.Entry) this.mValues.get(i)).copy());
        }
        com.github.mikephil.charting.data.ScatterDataSet scatterDataSet = new com.github.mikephil.charting.data.ScatterDataSet(arrayList, getLabel());
        scatterDataSet.mDrawValues = this.mDrawValues;
        scatterDataSet.mValueColors = this.mValueColors;
        scatterDataSet.mColors = this.mColors;
        scatterDataSet.mShapeSize = this.mShapeSize;
        scatterDataSet.mShapeRenderer = this.mShapeRenderer;
        scatterDataSet.mScatterShapeHoleRadius = this.mScatterShapeHoleRadius;
        scatterDataSet.mScatterShapeHoleColor = this.mScatterShapeHoleColor;
        scatterDataSet.mHighlightLineWidth = this.mHighlightLineWidth;
        scatterDataSet.mHighLightColor = this.mHighLightColor;
        scatterDataSet.mHighlightDashPathEffect = this.mHighlightDashPathEffect;
        return scatterDataSet;
    }

    public void setScatterShapeSize(float f) {
        this.mShapeSize = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public float getScatterShapeSize() {
        return this.mShapeSize;
    }

    public void setScatterShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape scatterShape) {
        this.mShapeRenderer = getRendererForShape(scatterShape);
    }

    public void setShapeRenderer(com.github.mikephil.charting.renderer.scatter.IShapeRenderer iShapeRenderer) {
        this.mShapeRenderer = iShapeRenderer;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public com.github.mikephil.charting.renderer.scatter.IShapeRenderer getShapeRenderer() {
        return this.mShapeRenderer;
    }

    public void setScatterShapeHoleRadius(float f) {
        this.mScatterShapeHoleRadius = f;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public float getScatterShapeHoleRadius() {
        return this.mScatterShapeHoleRadius;
    }

    public void setScatterShapeHoleColor(int i) {
        this.mScatterShapeHoleColor = i;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IScatterDataSet
    public int getScatterShapeHoleColor() {
        return this.mScatterShapeHoleColor;
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.data.ScatterDataSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape;

        static {
            int[] iArr = new int[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.values().length];
            $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape = iArr;
            try {
                iArr[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CIRCLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CROSS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.X.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_UP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[com.github.mikephil.charting.charts.ScatterChart.ScatterShape.CHEVRON_DOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public static com.github.mikephil.charting.renderer.scatter.IShapeRenderer getRendererForShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape scatterShape) {
        switch (com.github.mikephil.charting.data.ScatterDataSet.AnonymousClass1.$SwitchMap$com$github$mikephil$charting$charts$ScatterChart$ScatterShape[scatterShape.ordinal()]) {
            case 1:
                return new com.github.mikephil.charting.renderer.scatter.SquareShapeRenderer();
            case 2:
                return new com.github.mikephil.charting.renderer.scatter.CircleShapeRenderer();
            case 3:
                return new com.github.mikephil.charting.renderer.scatter.TriangleShapeRenderer();
            case 4:
                return new com.github.mikephil.charting.renderer.scatter.CrossShapeRenderer();
            case 5:
                return new com.github.mikephil.charting.renderer.scatter.XShapeRenderer();
            case 6:
                return new com.github.mikephil.charting.renderer.scatter.ChevronUpShapeRenderer();
            case 7:
                return new com.github.mikephil.charting.renderer.scatter.ChevronDownShapeRenderer();
            default:
                return null;
        }
    }
}
