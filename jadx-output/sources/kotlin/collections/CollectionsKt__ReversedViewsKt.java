package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__ReversedViewsKt extends kotlin.collections.CollectionsKt__MutableCollectionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> list, int i) {
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (i >= 0 && lastIndex >= i) {
            return kotlin.collections.CollectionsKt.getLastIndex(list) - i;
        }
        throw new java.lang.IndexOutOfBoundsException("Element index " + i + " must be in range [" + new kotlin.ranges.IntRange(0, kotlin.collections.CollectionsKt.getLastIndex(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> list, int i) {
        int size = list.size();
        if (i >= 0 && size >= i) {
            return list.size() - i;
        }
        throw new java.lang.IndexOutOfBoundsException("Position index " + i + " must be in range [" + new kotlin.ranges.IntRange(0, list.size()) + "].");
    }

    public static final <T> java.util.List<T> asReversed(java.util.List<? extends T> asReversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asReversed, "$this$asReversed");
        return new kotlin.collections.ReversedListReadOnly(asReversed);
    }

    public static final <T> java.util.List<T> asReversedMutable(java.util.List<T> asReversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asReversed, "$this$asReversed");
        return new kotlin.collections.ReversedList(asReversed);
    }
}
