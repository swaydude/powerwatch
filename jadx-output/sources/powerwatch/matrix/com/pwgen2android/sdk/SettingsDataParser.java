package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: SettingsDataParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsDataParser;", "", "()V", "extractData", "Lpowerwatch/matrix/com/pwgen2android/sdk/SettingsData;", "byteArray", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SettingsDataParser {
    public final powerwatch.matrix.com.pwgen2android.sdk.SettingsData extractData(byte[] byteArray) {
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
        powerwatch.matrix.com.pwgen2android.sdk.SettingsData settingsData = new powerwatch.matrix.com.pwgen2android.sdk.SettingsData(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2097151, null);
        java.util.ArrayList<java.util.List> arrayList2 = arrayList;
        java.util.ArrayList<kotlin.Pair> arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (java.util.List list : arrayList2) {
            java.util.List listReversed = kotlin.collections.CollectionsKt.reversed(list);
            arrayList3.add(new kotlin.Pair(listReversed.get(0), listReversed.subList(1, list.size())));
        }
        for (kotlin.Pair pair : arrayList3) {
            byte bByteValue = ((java.lang.Number) pair.getFirst()).byteValue();
            java.util.List<java.lang.Byte> list2 = (java.util.List) pair.getSecond();
            if (powerwatch.matrix.com.pwgen2android.sdk.SettingTable.INSTANCE.getArray().keySet().contains(java.lang.Integer.valueOf(bByteValue))) {
                kotlin.jvm.functions.Function2<powerwatch.matrix.com.pwgen2android.sdk.SettingsData, java.util.List<java.lang.Byte>, kotlin.Unit> function2 = powerwatch.matrix.com.pwgen2android.sdk.SettingTable.INSTANCE.getArray().get(java.lang.Integer.valueOf(bByteValue));
                kotlin.jvm.internal.Intrinsics.checkNotNull(function2);
                function2.invoke(settingsData, list2);
            }
        }
        return settingsData;
    }
}
