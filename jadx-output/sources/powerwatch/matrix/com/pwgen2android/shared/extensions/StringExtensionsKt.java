package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"convertToCamelCase", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class StringExtensionsKt {
    public static final java.lang.String convertToCamelCase(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.util.List listSplit$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (java.lang.String str2 : arrayList2) {
            java.util.Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            java.lang.String lowerCase = str2.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            arrayList3.add(lowerCase);
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(kotlin.text.StringsKt.capitalize((java.lang.String) it.next()));
        }
        java.util.Iterator it2 = arrayList5.iterator();
        if (!it2.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it2.next();
        while (it2.hasNext()) {
            next = ((java.lang.String) next) + ' ' + ((java.lang.String) it2.next()) + ' ';
        }
        java.lang.String str3 = (java.lang.String) next;
        java.util.Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.CharSequence");
        return kotlin.text.StringsKt.trim((java.lang.CharSequence) str3).toString();
    }
}
