package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: DataFormatter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen1DataFormatter;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataFormatter;", "()V", "formatFwVersion", "", "firmwareVersionBytes", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen1DataFormatter implements powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataFormatter {
    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataFormatter
    public java.lang.String formatFwVersion(byte[] firmwareVersionBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersionBytes, "firmwareVersionBytes");
        java.lang.String str = new java.lang.String(firmwareVersionBytes, kotlin.text.Charsets.UTF_8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        java.lang.String strSubstring = str.substring(0, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        java.lang.String strSubstring2 = str.substring(2, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        java.lang.String strStringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(strSubstring2, strSubstring);
        int i2 = 0;
        while (i2 < strStringPlus.length()) {
            int i3 = i2 + 2;
            int iMin = java.lang.Math.min(i3, strStringPlus.length());
            java.util.Objects.requireNonNull(strStringPlus, "null cannot be cast to non-null type java.lang.String");
            java.lang.String strSubstring3 = strStringPlus.substring(i2, iMin);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(strSubstring3);
            i2 = i3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = (i2 / 2) - 1;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = i + 1;
                java.lang.Object obj = arrayList.get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "list[i]");
                java.lang.String str2 = (java.lang.String) obj;
                int i6 = java.lang.Integer.parseInt(str2, 16);
                if (i6 > 9) {
                    sb.append(i6);
                } else {
                    sb.append(str2);
                }
                if (i < i4) {
                    sb.append(".");
                }
                if (i5 > size) {
                    break;
                }
                i = i5;
            }
        }
        return sb.toString();
    }
}
