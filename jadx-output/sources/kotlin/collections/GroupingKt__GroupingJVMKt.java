package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: GroupingJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001aZ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00072\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", "V", "f", "Lkotlin/Function1;", "", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/GroupingKt")
public class GroupingKt__GroupingJVMKt {
    public static final <T, K> java.util.Map<K, java.lang.Integer> eachCount(kotlin.collections.Grouping<T, ? extends K> eachCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eachCount, "$this$eachCount");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<T> itSourceIterator = eachCount.sourceIterator();
        while (itSourceIterator.hasNext()) {
            K kKeyOf = eachCount.keyOf(itSourceIterator.next());
            java.lang.Object intRef = linkedHashMap.get(kKeyOf);
            if (intRef == null && !linkedHashMap.containsKey(kKeyOf)) {
                intRef = new kotlin.jvm.internal.Ref.IntRef();
            }
            kotlin.jvm.internal.Ref.IntRef intRef2 = (kotlin.jvm.internal.Ref.IntRef) intRef;
            intRef2.element++;
            linkedHashMap.put(kKeyOf, intRef2);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.util.Objects.requireNonNull(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            kotlin.jvm.internal.TypeIntrinsics.asMutableMapEntry(entry).setValue(java.lang.Integer.valueOf(((kotlin.jvm.internal.Ref.IntRef) entry.getValue()).element));
        }
        return kotlin.jvm.internal.TypeIntrinsics.asMutableMap(linkedHashMap);
    }

    private static final <K, V, R> java.util.Map<K, R> mapValuesInPlace(java.util.Map<K, V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.util.Objects.requireNonNull(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K, R>");
            kotlin.jvm.internal.TypeIntrinsics.asMutableMapEntry(entry).setValue(function1.invoke(entry));
        }
        java.util.Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, R>");
        return kotlin.jvm.internal.TypeIntrinsics.asMutableMap(map);
    }
}
