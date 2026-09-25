package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: RealtimeDataParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeDataParser;", "", "()V", "extractData", "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "byteArray", "", "extractInt", "", "data", "", "", "signed", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RealtimeDataParser {
    public final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData extractData(byte[] byteArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        java.util.List listChunked = kotlin.collections.CollectionsKt.chunked(kotlin.collections.ArraysKt.toMutableList(byteArray), 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listChunked.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.util.List) next).size() >= 4) {
                arrayList.add(next);
            }
        }
        powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData = new powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData(0, 0, 0, 0.0f, 0, 0, 0L, 0.0f, 0.0f, null, 1023, null);
        java.util.ArrayList<java.util.List> arrayList2 = arrayList;
        java.util.ArrayList<kotlin.Pair> arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (java.util.List list : arrayList2) {
            java.util.List listReversed = kotlin.collections.CollectionsKt.reversed(list);
            arrayList3.add(new kotlin.Pair(listReversed.get(0), listReversed.subList(1, list.size())));
        }
        for (kotlin.Pair pair : arrayList3) {
            byte bByteValue = ((java.lang.Number) pair.getFirst()).byteValue();
            java.util.List<java.lang.Byte> list2 = (java.util.List) pair.getSecond();
            if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSteps.INSTANCE.getValue()) {
                realtimeWatchData.setTotalSteps(extractInt$default(this, list2, false, 2, null));
            } else if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalCurrentCaloriesActive.INSTANCE.getValue()) {
                realtimeWatchData.setTotalActiveCalories((int) (extractInt$default(this, list2, false, 2, null) / 1000));
            } else if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSleep.INSTANCE.getValue()) {
                realtimeWatchData.setTotalSleep(extractInt$default(this, list2, false, 2, null));
            } else if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalDistance.INSTANCE.getValue()) {
                realtimeWatchData.setTotalDistance(extractInt$default(this, list2, false, 2, null) / 1000);
            } else if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalThermalPower.INSTANCE.getValue()) {
                realtimeWatchData.setTotalThermalPower(extractInt$default(this, list2, false, 2, null));
            } else if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSolarPower.INSTANCE.getValue()) {
                realtimeWatchData.setTotalSolarPower(extractInt$default(this, list2, false, 2, null));
            } else if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.TotalSkinTemp.INSTANCE.getValue()) {
                realtimeWatchData.setSkinTemp(extractInt(list2, true));
            } else if (bByteValue == powerwatch.matrix.com.pwgen2android.sdk.HSMTable.BatteryPercentage.INSTANCE.getValue()) {
                realtimeWatchData.setBatteryPercent(extractInt$default(this, list2, false, 2, null));
            }
        }
        return realtimeWatchData;
    }

    static /* synthetic */ int extractInt$default(powerwatch.matrix.com.pwgen2android.sdk.RealtimeDataParser realtimeDataParser, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return realtimeDataParser.extractInt(list, z);
    }

    private final int extractInt(java.util.List<java.lang.Byte> data, boolean signed) {
        if (data.isEmpty()) {
            return 0;
        }
        java.nio.ByteBuffer byteBufferPut = java.nio.ByteBuffer.allocate(4).put((byte) 0).put(kotlin.collections.CollectionsKt.toByteArray(data));
        byteBufferPut.rewind();
        double dPow = byteBufferPut.getInt();
        if (signed && dPow > java.lang.Math.pow(2.0d, 23) - ((double) 1)) {
            dPow -= java.lang.Math.pow(2.0d, 24.0d);
        }
        return (int) dPow;
    }
}
