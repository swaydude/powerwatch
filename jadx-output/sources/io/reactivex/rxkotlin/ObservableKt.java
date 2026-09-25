package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: observable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000±\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u001c\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a^\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b\u001aF\u0010\r\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001aF\u0010\r\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000f0\u0006H\u0007\u001a*\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001a*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001aI\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u00012\u001a\b\u0004\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00140\bH\u0087\b\u001a*\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001aF\u0010\u0016\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a*\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001a#\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001aF\u0010\u0019\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\u0005H\u0005\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a(\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a'\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u001c\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001dH\u0002¢\u0006\u0002\u0010\u001e\u001aÇ\u0001\u0010\u001f\u001a\u0096\u0001\u0012D\u0012B\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e* \u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010$0! \u000e*J\u0012D\u0012B\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e* \u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010$0!\u0018\u00010 0 \"\b\b\u0000\u0010\"*\u00020\u0003\"\b\b\u0001\u0010#*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H#0%0\u0001H\u0007\u001a¸\u0002\u0010&\u001a\u0087\u0002\u0012|\u0012z\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0' \u000e*<\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0'\u0018\u00010$0! \u000e*\u0082\u0001\u0012|\u0012z\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0' \u000e*<\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H\"H\"\u0012(\u0012&\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H# \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u0001H#H#\u0018\u00010(0'\u0018\u00010$0!\u0018\u00010 0 \"\b\b\u0000\u0010\"*\u00020\u0003\"\b\b\u0001\u0010#*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u0002H#0%0\u0001H\u0007\u001a'\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050*H\u0007¢\u0006\u0002\u0010+\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020,0\u0001*\u00020-H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020.0\u0001*\u00020/H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002000\u0001*\u000201H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002020\u0001*\u000203H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002040\u0001*\u000205H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002060\u0001*\u000207H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002080\u0001*\u000209H\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020:0\u0001*\u00020;H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0006H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001dH\u0007\u001a\u0012\u0010)\u001a\b\u0012\u0004\u0012\u0002060\u0001*\u00020<H\u0007\u001a\"\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0014H\u0007\u001a^\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u0010>\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b¨\u0006?"}, d2 = {"cast", "Lio/reactivex/Observable;", "R", "", "combineLatest", "T", "", "combineFunction", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "args", "concatAll", "kotlin.jvm.PlatformType", "Lio/reactivex/ObservableSource;", "concatMapIterable", "flatMapIterable", "flatMapSequence", "body", "Lkotlin/sequences/Sequence;", "merge", "mergeAll", "mergeDelayError", "ofType", "switchLatest", "switchOnNext", "toIterable", "io/reactivex/rxkotlin/ObservableKt$toIterable$1", "", "(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/ObservableKt$toIterable$1;", "toMap", "Lio/reactivex/Single;", "", "A", "B", "", "Lkotlin/Pair;", "toMultimap", "", "", "toObservable", "", "([Ljava/lang/Object;)Lio/reactivex/Observable;", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "Lkotlin/ranges/IntProgression;", "zip", "zipFunction", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class ObservableKt {
    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Boolean> toObservable(boolean[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Byte> toObservable(byte[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Character> toObservable(char[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Short> toObservable(short[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Integer> toObservable(int[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Long> toObservable(long[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Float> toObservable(float[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Double> toObservable(double[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> toObservable(T[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Observable<T> observableFromArray = io.reactivex.Observable.fromArray(java.util.Arrays.copyOf(receiver, receiver.length));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableFromArray, "Observable.fromArray(*this)");
        return observableFromArray;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Observable<java.lang.Integer> toObservable(kotlin.ranges.IntProgression receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        if (receiver.getStep() != 1 || ((long) receiver.getLast()) - ((long) receiver.getFirst()) >= Integer.MAX_VALUE) {
            io.reactivex.Observable<java.lang.Integer> observableFromIterable = io.reactivex.Observable.fromIterable(receiver);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableFromIterable, "Observable.fromIterable(this)");
            return observableFromIterable;
        }
        io.reactivex.Observable<java.lang.Integer> observableRange = io.reactivex.Observable.range(receiver.getFirst(), java.lang.Math.max(0, (receiver.getLast() - receiver.getFirst()) + 1));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableRange, "Observable.range(first, …max(0, last - first + 1))");
        return observableRange;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> toObservable(java.util.Iterator<? extends T> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(toIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> toObservable(java.lang.Iterable<? extends T> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Observable<T> observableFromIterable = io.reactivex.Observable.fromIterable(receiver);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableFromIterable, "Observable.fromIterable(this)");
        return observableFromIterable;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> toObservable(kotlin.sequences.Sequence<? extends T> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toObservable(kotlin.sequences.SequencesKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> merge(java.lang.Iterable<? extends io.reactivex.Observable<? extends T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Observable<T> observableMerge = io.reactivex.Observable.merge(toObservable(receiver));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableMerge, "Observable.merge(this.toObservable())");
        return observableMerge;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> mergeDelayError(java.lang.Iterable<? extends io.reactivex.Observable<? extends T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Observable<T> observableMergeDelayError = io.reactivex.Observable.mergeDelayError(toObservable(receiver));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableMergeDelayError, "Observable.mergeDelayError(this.toObservable())");
        return observableMergeDelayError;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> flatMapIterable(io.reactivex.Observable<? extends java.lang.Iterable<? extends T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Observable<T> observable = (io.reactivex.Observable<T>) receiver.flatMapIterable(new io.reactivex.functions.Function<T, java.lang.Iterable<? extends U>>() { // from class: io.reactivex.rxkotlin.ObservableKt.flatMapIterable.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final java.lang.Iterable<T> apply(java.lang.Iterable<? extends T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observable, "flatMapIterable { it }");
        return observable;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> concatMapIterable(io.reactivex.Observable<? extends java.lang.Iterable<? extends T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Observable<T> observable = (io.reactivex.Observable<T>) receiver.concatMapIterable(new io.reactivex.functions.Function<T, java.lang.Iterable<? extends U>>() { // from class: io.reactivex.rxkotlin.ObservableKt.concatMapIterable.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final java.lang.Iterable<T> apply(java.lang.Iterable<? extends T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observable, "concatMapIterable { it }");
        return observable;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R> io.reactivex.Observable<R> flatMapSequence(io.reactivex.Observable<T> receiver, final kotlin.jvm.functions.Function1<? super T, ? extends kotlin.sequences.Sequence<? extends R>> body) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(body, "body");
        io.reactivex.Observable<R> observableFlatMap = receiver.flatMap(new io.reactivex.functions.Function<T, io.reactivex.ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.flatMapSequence.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Observable<R> apply(T it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return io.reactivex.rxkotlin.ObservableKt.toObservable((kotlin.sequences.Sequence) body.invoke(it));
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableFlatMap, "flatMap { body(it).toObservable() }");
        return observableFlatMap;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R> io.reactivex.Observable<R> combineLatest(java.lang.Iterable<? extends io.reactivex.Observable<T>> receiver, final kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> combineFunction) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(combineFunction, "combineFunction");
        io.reactivex.Observable<R> observableCombineLatest = io.reactivex.Observable.combineLatest(receiver, new io.reactivex.functions.Function<java.lang.Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt.combineLatest.1
            @Override // io.reactivex.functions.Function
            public final R apply(java.lang.Object[] it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                kotlin.jvm.functions.Function1 function1 = combineFunction;
                java.util.List listAsList = kotlin.collections.ArraysKt.asList(it);
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listAsList, 10));
                for (T t : listAsList) {
                    if (t == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…List().map { it as T }) }");
        return observableCombineLatest;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R> io.reactivex.Observable<R> zip(java.lang.Iterable<? extends io.reactivex.Observable<T>> receiver, final kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> zipFunction) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(zipFunction, "zipFunction");
        io.reactivex.Observable<R> observableZip = io.reactivex.Observable.zip(receiver, new io.reactivex.functions.Function<java.lang.Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt.zip.1
            @Override // io.reactivex.functions.Function
            public final R apply(java.lang.Object[] it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                kotlin.jvm.functions.Function1 function1 = zipFunction;
                java.util.List listAsList = kotlin.collections.ArraysKt.asList(it);
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listAsList, 10));
                for (T t : listAsList) {
                    if (t == null) {
                        throw new kotlin.TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(this) { z…List().map { it as T }) }");
        return observableZip;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    private static final <R> io.reactivex.Observable<R> cast(io.reactivex.Observable<?> observable) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "R");
        io.reactivex.Observable<R> observable2 = (io.reactivex.Observable<R>) observable.cast(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observable2, "cast(R::class.java)");
        return observable2;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    private static final <R> io.reactivex.Observable<R> ofType(io.reactivex.Observable<?> observable) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "R");
        io.reactivex.Observable<R> observable2 = (io.reactivex.Observable<R>) observable.ofType(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observable2, "ofType(R::class.java)");
        return observable2;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.ObservableKt$toIterable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: observable.kt */
    @kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"io/reactivex/rxkotlin/ObservableKt$toIterable$1", "", "iterator", "", "rxkotlin"}, k = 1, mv = {1, 1, 11})
    public static final class C00821<T> implements java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ java.util.Iterator receiver$0;

        C00821(java.util.Iterator<? extends T> it) {
            this.receiver$0 = it;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
            return this.receiver$0;
        }
    }

    private static final <T> io.reactivex.rxkotlin.ObservableKt.C00821 toIterable(java.util.Iterator<? extends T> it) {
        return new io.reactivex.rxkotlin.ObservableKt.C00821(it);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> mergeAll(io.reactivex.Observable<io.reactivex.Observable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Observable<T>) receiver.flatMap(new io.reactivex.functions.Function<T, io.reactivex.ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.mergeAll.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Observable<T> apply(io.reactivex.Observable<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> concatAll(io.reactivex.Observable<io.reactivex.Observable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Observable<T>) receiver.concatMap(new io.reactivex.functions.Function<T, io.reactivex.ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.concatAll.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Observable<T> apply(io.reactivex.Observable<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> switchLatest(io.reactivex.Observable<io.reactivex.Observable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Observable<T>) receiver.switchMap(new io.reactivex.functions.Function<T, io.reactivex.ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.switchLatest.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Observable<T> apply(io.reactivex.Observable<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> switchOnNext(io.reactivex.Observable<io.reactivex.Observable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Observable<T> observableSwitchOnNext = io.reactivex.Observable.switchOnNext(receiver);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(observableSwitchOnNext, "Observable.switchOnNext(this)");
        return observableSwitchOnNext;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <A, B> io.reactivex.Single<java.util.Map<A, B>> toMap(io.reactivex.Observable<kotlin.Pair<A, B>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Single<java.util.Map<A, B>>) receiver.toMap(new io.reactivex.functions.Function<T, K>() { // from class: io.reactivex.rxkotlin.ObservableKt.toMap.1
            /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final A apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getFirst();
            }
        }, new io.reactivex.functions.Function<T, V>() { // from class: io.reactivex.rxkotlin.ObservableKt.toMap.2
            /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final B apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getSecond();
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <A, B> io.reactivex.Single<java.util.Map<A, java.util.Collection<B>>> toMultimap(io.reactivex.Observable<kotlin.Pair<A, B>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Single<java.util.Map<A, java.util.Collection<B>>>) receiver.toMultimap(new io.reactivex.functions.Function<T, K>() { // from class: io.reactivex.rxkotlin.ObservableKt.toMultimap.1
            /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final A apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getFirst();
            }
        }, new io.reactivex.functions.Function<T, V>() { // from class: io.reactivex.rxkotlin.ObservableKt.toMultimap.2
            /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final B apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getSecond();
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Observable<T> concatAll(java.lang.Iterable<? extends io.reactivex.ObservableSource<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return io.reactivex.Observable.concat(receiver);
    }
}
