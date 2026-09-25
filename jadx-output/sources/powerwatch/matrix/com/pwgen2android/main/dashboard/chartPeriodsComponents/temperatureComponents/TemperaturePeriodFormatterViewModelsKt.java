package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents;

/* JADX INFO: compiled from: TemperaturePeriodFormatterViewModels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u001a\u001c\u0010\u0005\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"buildEntries", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/CandleChartEntryData;", "combinedTemperature", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureDataContainer;", "buildHeaderValues", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/temperatureComponents/TemperatureHeaderValues;", "format", "", "convertDataTemperature", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class TemperaturePeriodFormatterViewModelsKt {
    public static final java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> convertDataTemperature(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> combinedTemperature, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedTemperature, "combinedTemperature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> list = combinedTemperature;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer : list) {
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer(userPrefsUtils.getValue(java.lang.Float.valueOf((temperatureDataContainer.getMin() > 255.0f ? temperatureDataContainer.getMin() - 512 : temperatureDataContainer.getMin()) / 4.0f), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE).getFirst().floatValue(), userPrefsUtils.getValue(java.lang.Float.valueOf((temperatureDataContainer.getAvg() > 255.0f ? temperatureDataContainer.getAvg() - 512 : temperatureDataContainer.getAvg()) / 4.0f), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE).getFirst().floatValue(), userPrefsUtils.getValue(java.lang.Float.valueOf((temperatureDataContainer.getMax() > 255.0f ? temperatureDataContainer.getMax() - 512 : temperatureDataContainer.getMax()) / 4.0f), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.TEMPERATURE.INSTANCE).getFirst().floatValue(), temperatureDataContainer.isArtificialData(), temperatureDataContainer.getValid(), temperatureDataContainer.getMalformedContainer()));
        }
        return arrayList;
    }

    public static final java.util.List<powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData> buildEntries(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> combinedTemperature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedTemperature, "combinedTemperature");
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> list = combinedTemperature;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer temperatureDataContainer = (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj;
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.ui.charts.CandleChartEntryData(i, temperatureDataContainer.getMax(), temperatureDataContainer.getMin(), temperatureDataContainer.getMax(), temperatureDataContainer.getMin(), temperatureDataContainer.getMalformed()));
            i = i2;
        }
        return arrayList;
    }

    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues buildHeaderValues(java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> combinedTemperature, java.lang.String format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedTemperature, "combinedTemperature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer> list = combinedTemperature;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj).getValid()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) it.next()).getAvg()));
        }
        double dAverageOfFloat = kotlin.collections.CollectionsKt.averageOfFloat(arrayList3);
        float f = java.lang.Double.isNaN(dAverageOfFloat) ? 0.0f : (float) dAverageOfFloat;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj2).getValid()) {
                arrayList4.add(obj2);
            }
        }
        java.util.ArrayList arrayList5 = arrayList4;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        java.util.Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) it2.next()).getMin()));
        }
        java.lang.Float fMinOrNull = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList6);
        float fFloatValue = fMinOrNull == null ? 0.0f : fMinOrNull.floatValue();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) obj3).getValid()) {
                arrayList7.add(obj3);
            }
        }
        java.util.ArrayList arrayList8 = arrayList7;
        java.util.ArrayList arrayList9 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList8, 10));
        java.util.Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            arrayList9.add(java.lang.Float.valueOf(((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureDataContainer) it3.next()).getMax()));
        }
        java.lang.Float fMaxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) arrayList9);
        float fFloatValue2 = fMaxOrNull != null ? fMaxOrNull.floatValue() : 0.0f;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(kotlin.jvm.internal.Intrinsics.stringPlus("%.2f", format), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(fFloatValue)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
        sb.append(str);
        sb.append(" - ");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str2 = java.lang.String.format(kotlin.jvm.internal.Intrinsics.stringPlus("%.2f", format), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(fFloatValue2)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str3 = java.lang.String.format(kotlin.jvm.internal.Intrinsics.stringPlus("%.2f", format), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.temperatureComponents.TemperatureHeaderValues(str3, string);
    }
}
