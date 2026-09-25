package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a\u001d\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a@\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00100\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u00150\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE, "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__IterablesKt extends kotlin.collections.CollectionsKt__CollectionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__IterablesKt$Iterable$1, reason: invalid class name */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> implements java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ kotlin.jvm.functions.Function0 $iterator;

        public AnonymousClass1(kotlin.jvm.functions.Function0 function0) {
            this.$iterator = function0;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
            return (java.util.Iterator) this.$iterator.invoke();
        }
    }

    private static final <T> java.lang.Iterable<T> Iterable(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> function0) {
        return new kotlin.collections.CollectionsKt__IterablesKt.AnonymousClass1(function0);
    }

    public static final <T> java.lang.Integer collectionSizeOrNull(java.lang.Iterable<? extends T> collectionSizeOrNull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionSizeOrNull, "$this$collectionSizeOrNull");
        if (collectionSizeOrNull instanceof java.util.Collection) {
            return java.lang.Integer.valueOf(((java.util.Collection) collectionSizeOrNull).size());
        }
        return null;
    }

    public static final <T> int collectionSizeOrDefault(java.lang.Iterable<? extends T> collectionSizeOrDefault, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionSizeOrDefault, "$this$collectionSizeOrDefault");
        return collectionSizeOrDefault instanceof java.util.Collection ? ((java.util.Collection) collectionSizeOrDefault).size() : i;
    }

    private static final <T> boolean safeToConvertToSet$CollectionsKt__IterablesKt(java.util.Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof java.util.ArrayList);
    }

    public static final <T> java.util.Collection<T> convertToSetForSetOperationWith(java.lang.Iterable<? extends T> convertToSetForSetOperationWith, java.lang.Iterable<? extends T> source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertToSetForSetOperationWith, "$this$convertToSetForSetOperationWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        if (convertToSetForSetOperationWith instanceof java.util.Set) {
            return (java.util.Collection) convertToSetForSetOperationWith;
        }
        if (convertToSetForSetOperationWith instanceof java.util.Collection) {
            if ((source instanceof java.util.Collection) && ((java.util.Collection) source).size() < 2) {
                return (java.util.Collection) convertToSetForSetOperationWith;
            }
            java.util.Collection<T> collection = (java.util.Collection) convertToSetForSetOperationWith;
            return safeToConvertToSet$CollectionsKt__IterablesKt(collection) ? kotlin.collections.CollectionsKt.toHashSet(convertToSetForSetOperationWith) : collection;
        }
        return kotlin.collections.CollectionsKt.toHashSet(convertToSetForSetOperationWith);
    }

    public static final <T> java.util.Collection<T> convertToSetForSetOperation(java.lang.Iterable<? extends T> convertToSetForSetOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertToSetForSetOperation, "$this$convertToSetForSetOperation");
        if (convertToSetForSetOperation instanceof java.util.Set) {
            return (java.util.Collection) convertToSetForSetOperation;
        }
        if (!(convertToSetForSetOperation instanceof java.util.Collection)) {
            return kotlin.collections.CollectionsKt.toHashSet(convertToSetForSetOperation);
        }
        java.util.Collection<T> collection = (java.util.Collection) convertToSetForSetOperation;
        return safeToConvertToSet$CollectionsKt__IterablesKt(collection) ? kotlin.collections.CollectionsKt.toHashSet(convertToSetForSetOperation) : collection;
    }

    public static final <T> java.util.List<T> flatten(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> flatten) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flatten, "$this$flatten");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends java.lang.Iterable<? extends T>> it = flatten.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(java.lang.Iterable<? extends kotlin.Pair<? extends T, ? extends R>> unzip) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unzip, "$this$unzip");
        int iCollectionSizeOrDefault = kotlin.collections.CollectionsKt.collectionSizeOrDefault(unzip, 10);
        java.util.ArrayList arrayList = new java.util.ArrayList(iCollectionSizeOrDefault);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(iCollectionSizeOrDefault);
        for (kotlin.Pair<? extends T, ? extends R> pair : unzip) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
    }
}
