package powerwatch.matrix.com.pwgen2android.shared.ui.charts;

/* JADX INFO: compiled from: CubicLineChartFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J,\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CubicChartYAxisRender;", "Lcom/github/mikephil/charting/renderer/YAxisRenderer;", "lineDatas", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/DaySetData;", "viewPortHandler", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "yAxis", "Lcom/github/mikephil/charting/components/YAxis;", "trans", "Lcom/github/mikephil/charting/utils/Transformer;", "(Ljava/util/List;Lcom/github/mikephil/charting/utils/ViewPortHandler;Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/utils/Transformer;)V", "computeAxisValues", "", "min", "", "max", "drawYLabels", "c", "Landroid/graphics/Canvas;", "fixedPosition", "positions", "", "offset", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CubicChartYAxisRender extends com.github.mikephil.charting.renderer.YAxisRenderer {
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData> lineDatas;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CubicChartYAxisRender(java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData> lineDatas, com.github.mikephil.charting.utils.ViewPortHandler viewPortHandler, com.github.mikephil.charting.components.YAxis yAxis, com.github.mikephil.charting.utils.Transformer trans) {
        super(viewPortHandler, yAxis, trans);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineDatas, "lineDatas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPortHandler, "viewPortHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trans, "trans");
        this.lineDatas = lineDatas;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    protected void computeAxisValues(float min, float max) {
        java.lang.Object next;
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData> list = this.lineDatas;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData) it.next()).getDataSets());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.Iterator it2 = arrayList2.iterator();
        java.lang.Object next2 = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float yMin = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next).getYMin();
                do {
                    java.lang.Object next3 = it2.next();
                    float yMin2 = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next3).getYMin();
                    if (java.lang.Float.compare(yMin, yMin2) > 0) {
                        next = next3;
                        yMin = yMin2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next;
        if (iLineDataSet != null) {
            min = iLineDataSet.getYMin();
        }
        float f = min;
        java.util.Iterator it3 = arrayList2.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                float yMax = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next2).getYMax();
                do {
                    java.lang.Object next4 = it3.next();
                    float yMax2 = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next4).getYMax();
                    if (java.lang.Float.compare(yMax, yMax2) < 0) {
                        next2 = next4;
                        yMax = yMax2;
                    }
                } while (it3.hasNext());
            }
        }
        com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet2 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next2;
        if (iLineDataSet2 != null) {
            max = iLineDataSet2.getYMax();
        }
        int size = this.lineDatas.size();
        double dAbs = java.lang.Math.abs(max - f);
        int i = 0;
        if (size == 0 || dAbs <= 0.0d || java.lang.Double.isInfinite(dAbs)) {
            this.mAxis.mEntries = new float[0];
            this.mAxis.mCenteredEntries = new float[0];
            this.mAxis.mEntryCount = 0;
            return;
        }
        double dRoundToNextSignificant = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(dAbs / ((double) size));
        if (this.mAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mAxis.getGranularity()) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = com.github.mikephil.charting.utils.Utils.roundToNextSignificant(java.lang.Math.pow(10.0d, (int) java.lang.Math.log10(dRoundToNextSignificant)));
        if (((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5) {
            dRoundToNextSignificant = java.lang.Math.floor(((double) 10) * dRoundToNextSignificant2);
        }
        int iIsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            dRoundToNextSignificant = ((float) dAbs) / (size - 1);
            this.mAxis.mEntryCount = size;
            if (this.mAxis.mEntries.length < size) {
                this.mAxis.mEntries = new float[size];
            }
            if (size > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    this.mAxis.mEntries[i2] = f;
                    f += (float) dRoundToNextSignificant;
                    if (i3 >= size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
        } else {
            double dCeil = (dRoundToNextSignificant > 0.0d ? 1 : (dRoundToNextSignificant == 0.0d ? 0 : -1)) == 0 ? 0.0d : java.lang.Math.ceil(((double) f) / dRoundToNextSignificant) * dRoundToNextSignificant;
            if (this.mAxis.isCenterAxisLabelsEnabled()) {
                dCeil -= dRoundToNextSignificant;
            }
            double dNextUp = (dRoundToNextSignificant > 0.0d ? 1 : (dRoundToNextSignificant == 0.0d ? 0 : -1)) == 0 ? 0.0d : com.github.mikephil.charting.utils.Utils.nextUp(java.lang.Math.floor(((double) max) / dRoundToNextSignificant) * dRoundToNextSignificant);
            if (!(dRoundToNextSignificant == 0.0d)) {
                double d = dCeil;
                iIsCenterAxisLabelsEnabled = iIsCenterAxisLabelsEnabled;
                while (d <= dNextUp) {
                    d += dRoundToNextSignificant;
                    iIsCenterAxisLabelsEnabled++;
                }
            }
            this.mAxis.mEntryCount = iIsCenterAxisLabelsEnabled;
            if (this.mAxis.mEntries.length < iIsCenterAxisLabelsEnabled) {
                this.mAxis.mEntries = new float[iIsCenterAxisLabelsEnabled];
            }
            for (int i4 = 0; i4 < iIsCenterAxisLabelsEnabled; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i4] = (float) dCeil;
                dCeil += dRoundToNextSignificant;
            }
            size = iIsCenterAxisLabelsEnabled;
        }
        if (dRoundToNextSignificant < 1.0d) {
            this.mAxis.mDecimals = (int) java.lang.Math.ceil(-java.lang.Math.log10(dRoundToNextSignificant));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (!this.mAxis.isCenterAxisLabelsEnabled()) {
            return;
        }
        if (this.mAxis.mCenteredEntries.length < size) {
            this.mAxis.mCenteredEntries = new float[size];
        }
        float f2 = ((float) dRoundToNextSignificant) / 2.0f;
        if (size <= 0) {
            return;
        }
        while (true) {
            int i5 = i + 1;
            this.mAxis.mCenteredEntries[i] = this.mAxis.mEntries[i] + f2;
            if (i5 >= size) {
                return;
            } else {
                i = i5;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    protected void drawYLabels(android.graphics.Canvas c, float fixedPosition, float[] positions, float offset) {
        java.lang.Object next;
        powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData daySetData;
        java.lang.Object next2;
        java.lang.Object next3;
        if (positions == null) {
            return;
        }
        if (positions.length == 0) {
            return;
        }
        float f = positions[0];
        java.util.ArrayList arrayList = new java.util.ArrayList(positions.length);
        int length = positions.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f2 = positions[i];
            int i3 = i2 + 1;
            if (i3 % 2 == 0 && (daySetData = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData) kotlin.collections.CollectionsKt.getOrNull(this.lineDatas, i2 / 2)) != null) {
                java.util.Iterator<T> it = daySetData.getDataSets().iterator();
                if (it.hasNext()) {
                    next2 = it.next();
                    if (it.hasNext()) {
                        float yMax = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next2).getYMax();
                        do {
                            java.lang.Object next4 = it.next();
                            float yMax2 = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next4).getYMax();
                            if (java.lang.Float.compare(yMax, yMax2) < 0) {
                                yMax = yMax2;
                                next2 = next4;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next2 = null;
                }
                com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next2;
                float yMax3 = iLineDataSet == null ? 0.0f : iLineDataSet.getYMax();
                java.util.Iterator<T> it2 = daySetData.getDataSets().iterator();
                if (it2.hasNext()) {
                    next3 = it2.next();
                    if (it2.hasNext()) {
                        float yMin = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next3).getYMin();
                        do {
                            java.lang.Object next5 = it2.next();
                            float yMin2 = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next5).getYMin();
                            if (java.lang.Float.compare(yMin, yMin2) > 0) {
                                yMin = yMin2;
                                next3 = next5;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next3 = null;
                }
                com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet2 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next3;
                float yMin3 = iLineDataSet2 == null ? 0.0f : iLineDataSet2.getYMin();
                com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet3 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) daySetData.getDataSets());
                com.github.mikephil.charting.formatter.IFillFormatter fillFormatter = iLineDataSet3 == null ? null : iLineDataSet3.getFillFormatter();
                powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter minMaxFillFormatter = fillFormatter instanceof powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter ? (powerwatch.matrix.com.pwgen2android.shared.ui.charts.utils.MinMaxFillFormatter) fillFormatter : null;
                f2 = minMaxFillFormatter != null ? (minMaxFillFormatter.max + minMaxFillFormatter.min) / 2.0f : (yMax3 + yMin3) / 2.0f;
            }
            arrayList.add(java.lang.Float.valueOf(f2));
            i++;
            i2 = i3;
        }
        float[] floatArray = kotlin.collections.CollectionsKt.toFloatArray(arrayList);
        int i4 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0;
        int i5 = this.mYAxis.isDrawTopYLabelEntryEnabled() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
        this.mTrans.pointValuesToPixel(floatArray);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(16.0f));
        paint.setColor(-1);
        paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setTextSize(com.github.mikephil.charting.utils.Utils.convertDpToPixel(16.0f));
        paint2.setColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
        if (i4 >= i5) {
            return;
        }
        while (true) {
            int i6 = i4 + 1;
            powerwatch.matrix.com.pwgen2android.shared.ui.charts.DaySetData daySetData2 = this.lineDatas.get(i4);
            float[] fArr = new float[2];
            java.util.Iterator<T> it3 = daySetData2.getDataSets().iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    float xMax = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next).getXMax();
                    while (true) {
                        java.lang.Object next6 = it3.next();
                        float xMax2 = ((com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next6).getXMax();
                        if (java.lang.Float.compare(xMax, xMax2) < 0) {
                            xMax = xMax2;
                            next = next6;
                        }
                        if (!it3.hasNext()) {
                            break;
                        } else {
                            f = f;
                        }
                    }
                }
            } else {
                next = null;
            }
            com.github.mikephil.charting.interfaces.datasets.ILineDataSet iLineDataSet4 = (com.github.mikephil.charting.interfaces.datasets.ILineDataSet) next;
            fArr[0] = iLineDataSet4 == null ? 0.0f : iLineDataSet4.getXMax();
            fArr[1] = f;
            int iCalcTextWidth = com.github.mikephil.charting.utils.Utils.calcTextWidth(paint, daySetData2.getLabel());
            this.mTrans.pointValuesToPixel(fArr);
            java.lang.String formattedLabel = this.mYAxis.getFormattedLabel(i4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(formattedLabel, "mYAxis.getFormattedLabel(i)");
            java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) formattedLabel, new char[]{'\n'}, false, 0, 6, (java.lang.Object) null);
            android.graphics.Paint.FontMetrics fontMetrics = this.mAxisLabelPaint.getFontMetrics();
            float f3 = fontMetrics.descent - fontMetrics.ascent;
            float f4 = f;
            if (listSplit$default.size() > 1) {
                if (c != null) {
                    c.drawText((java.lang.String) listSplit$default.get(0), fixedPosition, floatArray[(i4 * 2) + 1] + offset + (f3 / 2), this.mAxisLabelPaint);
                }
                if (c != null) {
                    c.drawText((java.lang.String) listSplit$default.get(1), fixedPosition, (floatArray[(i4 * 2) + 1] + offset) - (f3 / 2), paint2);
                }
            } else {
                i5 = i5;
                if (c != null) {
                    c.drawText((java.lang.String) listSplit$default.get(0), fixedPosition, floatArray[(i4 * 2) + 1] + offset, this.mAxisLabelPaint);
                }
            }
            if (c != null) {
                c.drawText(daySetData2.getLabel(), (fArr[0] - iCalcTextWidth) - 30.0f, floatArray[(i4 * 2) + 1] + offset, paint);
            }
            if (i6 >= i5) {
                return;
            }
            i5 = i5;
            i4 = i6;
            f = f4;
        }
    }
}
