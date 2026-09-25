package kotlin.comparisons;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aZ\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a>\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aZ\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001aA\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u001aR\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001aR\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001ap\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\u0087\bø\u0001\u0000\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "thenDescending", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/comparisons/ComparisonsKt")
public class ComparisonsKt__ComparisonsKt {
    public static final <T> int compareValuesBy(T t, T t2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... selectors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (!(selectors.length > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, selectors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t, T t2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[] function1Arr) {
        for (kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1 : function1Arr) {
            int iCompareValues = kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
            if (iCompareValues != 0) {
                return iCompareValues;
            }
        }
        return 0;
    }

    private static final <T> int compareValuesBy(T t, T t2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        return kotlin.comparisons.ComparisonsKt.compareValues(function1.invoke(t), function1.invoke(t2));
    }

    private static final <T, K> int compareValuesBy(T t, T t2, java.util.Comparator<? super K> comparator, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        return comparator.compare(function1.invoke(t), function1.invoke(t2));
    }

    public static final <T extends java.lang.Comparable<?>> int compareValues(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static final <T> java.util.Comparator<T> compareBy(final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>... selectors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (!(selectors.length > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareValuesByImpl$ComparisonsKt__ComparisonsKt(t, t2, selectors);
            }
        };
    }

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2, reason: invalid class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2<T> implements java.util.Comparator<T> {
        final /* synthetic */ kotlin.jvm.functions.Function1 $selector;

        public AnonymousClass2(kotlin.jvm.functions.Function1 function1) {
            this.$selector = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) this.$selector.invoke(t), (java.lang.Comparable) this.$selector.invoke(t2));
        }
    }

    private static final <T> java.util.Comparator<T> compareBy(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        return new kotlin.comparisons.ComparisonsKt__ComparisonsKt.AnonymousClass2(function1);
    }

    private static final <T, K> java.util.Comparator<T> compareBy(final java.util.Comparator<? super K> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareBy.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return comparator.compare(function1.invoke(t), function1.invoke(t2));
            }
        };
    }

    /* JADX INFO: renamed from: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Comparisons.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 5, 1})
    public static final class C01031<T> implements java.util.Comparator<T> {
        final /* synthetic */ kotlin.jvm.functions.Function1 $selector;

        public C01031(kotlin.jvm.functions.Function1 function1) {
            this.$selector = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) this.$selector.invoke(t2), (java.lang.Comparable) this.$selector.invoke(t));
        }
    }

    private static final <T> java.util.Comparator<T> compareByDescending(kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        return new kotlin.comparisons.ComparisonsKt__ComparisonsKt.C01031(function1);
    }

    private static final <T, K> java.util.Comparator<T> compareByDescending(final java.util.Comparator<? super K> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.compareByDescending.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return comparator.compare(function1.invoke(t2), function1.invoke(t));
            }
        };
    }

    private static final <T> java.util.Comparator<T> thenBy(final java.util.Comparator<T> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) function1.invoke(t), (java.lang.Comparable) function1.invoke(t2));
            }
        };
    }

    private static final <T, K> java.util.Comparator<T> thenBy(final java.util.Comparator<T> comparator, final java.util.Comparator<? super K> comparator2, final kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenBy.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : comparator2.compare(function1.invoke(t), function1.invoke(t2));
            }
        };
    }

    private static final <T> java.util.Comparator<T> thenByDescending(final java.util.Comparator<T> comparator, final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>> function1) {
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) function1.invoke(t2), (java.lang.Comparable) function1.invoke(t));
            }
        };
    }

    private static final <T, K> java.util.Comparator<T> thenByDescending(final java.util.Comparator<T> comparator, final java.util.Comparator<? super K> comparator2, final kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenByDescending.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : comparator2.compare(function1.invoke(t2), function1.invoke(t));
            }
        };
    }

    private static final <T> java.util.Comparator<T> thenComparator(final java.util.Comparator<T> comparator, final kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Integer> function2) {
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenComparator.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : ((java.lang.Number) function2.invoke(t, t2)).intValue();
            }
        };
    }

    public static final <T> java.util.Comparator<T> then(final java.util.Comparator<T> then, final java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(then, "$this$then");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.then.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = then.compare(t, t2);
                return iCompare != 0 ? iCompare : comparator.compare(t, t2);
            }
        };
    }

    public static final <T> java.util.Comparator<T> thenDescending(final java.util.Comparator<T> thenDescending, final java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thenDescending, "$this$thenDescending");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.thenDescending.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = thenDescending.compare(t, t2);
                return iCompare != 0 ? iCompare : comparator.compare(t2, t);
            }
        };
    }

    public static final <T> java.util.Comparator<T> nullsFirst(final java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.nullsFirst.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                if (t == t2) {
                    return 0;
                }
                if (t == null) {
                    return -1;
                }
                if (t2 == null) {
                    return 1;
                }
                return comparator.compare(t, t2);
            }
        };
    }

    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> nullsFirst() {
        return kotlin.comparisons.ComparisonsKt.nullsFirst(kotlin.comparisons.ComparisonsKt.naturalOrder());
    }

    public static final <T> java.util.Comparator<T> nullsLast(final java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new java.util.Comparator<T>() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt.nullsLast.1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                if (t == t2) {
                    return 0;
                }
                if (t == null) {
                    return 1;
                }
                if (t2 == null) {
                    return -1;
                }
                return comparator.compare(t, t2);
            }
        };
    }

    private static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> nullsLast() {
        return kotlin.comparisons.ComparisonsKt.nullsLast(kotlin.comparisons.ComparisonsKt.naturalOrder());
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> naturalOrder() {
        kotlin.comparisons.NaturalOrderComparator naturalOrderComparator = kotlin.comparisons.NaturalOrderComparator.INSTANCE;
        java.util.Objects.requireNonNull(naturalOrderComparator, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        return naturalOrderComparator;
    }

    public static final <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> reverseOrder() {
        kotlin.comparisons.ReverseOrderComparator reverseOrderComparator = kotlin.comparisons.ReverseOrderComparator.INSTANCE;
        java.util.Objects.requireNonNull(reverseOrderComparator, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        return reverseOrderComparator;
    }

    public static final <T> java.util.Comparator<T> reversed(java.util.Comparator<T> reversed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reversed, "$this$reversed");
        if (reversed instanceof kotlin.comparisons.ReversedComparator) {
            return ((kotlin.comparisons.ReversedComparator) reversed).getComparator();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(reversed, kotlin.comparisons.NaturalOrderComparator.INSTANCE)) {
            kotlin.comparisons.ReverseOrderComparator reverseOrderComparator = kotlin.comparisons.ReverseOrderComparator.INSTANCE;
            java.util.Objects.requireNonNull(reverseOrderComparator, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            return reverseOrderComparator;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(reversed, kotlin.comparisons.ReverseOrderComparator.INSTANCE)) {
            return new kotlin.comparisons.ReversedComparator(reversed);
        }
        kotlin.comparisons.NaturalOrderComparator naturalOrderComparator = kotlin.comparisons.NaturalOrderComparator.INSTANCE;
        java.util.Objects.requireNonNull(naturalOrderComparator, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        return naturalOrderComparator;
    }
}
