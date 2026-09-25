package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000¹\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0002\b\u0003*\u00015\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001aF\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00020\u00050\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001ad\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\b0\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003\"\b\b\u0002\u0010\t*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0001H\u0007\u001a^\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\f2)\b\u0004\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00060\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00020\u000eH\u0087\b\u001aF\u0010\u0013\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0001H\u0007\u001aF\u0010\u0013\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00150\fH\u0007\u001aI\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u00012\u001a\b\u0004\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00180\u000eH\u0087\b\u001a*\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u00010\fH\u0007\u001aF\u0010\u001a\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0001H\u0007\u001a*\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\u00010\fH\u0007\u001a#\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001aF\u0010\u001d\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H\u0006H\u0006\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0001H\u0007\u001a(\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0001H\u0007\u001a'\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060 H\u0007¢\u0006\u0002\u0010!\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\"0\u0001*\u00020#H\u0007\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020$0\u0001*\u00020%H\u0007\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020&0\u0001*\u00020'H\u0007\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020(0\u0001*\u00020)H\u0007\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020*0\u0001*\u00020+H\u0007\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020,0\u0001*\u00020-H\u0007\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020.0\u0001*\u00020/H\u0007\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002000\u0001*\u000201H\u0007\u001a\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\fH\u0007\u001a \u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u000602\u001a\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020,0\u0001*\u000203H\u0007\u001a \u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u0018\u001a'\u00104\u001a\b\u0012\u0004\u0012\u0002H\u000605\"\b\b\u0000\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u000602H\u0002¢\u0006\u0002\u00106\u001aÇ\u0001\u00107\u001a\u0096\u0001\u0012D\u0012B\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H; \u0014* \u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H;\u0018\u00010<09 \u0014*J\u0012D\u0012B\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H; \u0014* \u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H;\u0018\u00010<09\u0018\u00010808\"\b\b\u0000\u0010:*\u00020\u0003\"\b\b\u0001\u0010;*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u0002H;0\u00050\u0001H\u0007\u001a¸\u0002\u0010=\u001a\u0087\u0002\u0012|\u0012z\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H; \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H;\u0018\u00010?0> \u0014*<\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H; \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H;\u0018\u00010?0>\u0018\u00010<09 \u0014*\u0082\u0001\u0012|\u0012z\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H; \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H;\u0018\u00010?0> \u0014*<\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H:H:\u0012(\u0012&\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H; \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u0001H;H;\u0018\u00010?0>\u0018\u00010<09\u0018\u00010808\"\b\b\u0000\u0010:*\u00020\u0003\"\b\b\u0001\u0010;*\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u0002H;0\u00050\u0001H\u0007\u001a^\u0010@\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\f2)\b\u0004\u0010A\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00060\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\u00020\u000eH\u0087\b¨\u0006B"}, d2 = {"cast", "Lio/reactivex/Flowable;", "R", "", "combineLatest", "Lkotlin/Pair;", "T", "flowable", "Lkotlin/Triple;", "U", "flowable1", "flowable2", "", "combineFunction", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "args", "concatAll", "kotlin.jvm.PlatformType", "Lorg/reactivestreams/Publisher;", "flatMapSequence", "body", "Lkotlin/sequences/Sequence;", "merge", "mergeAll", "mergeDelayError", "ofType", "switchLatest", "switchOnNext", "toFlowable", "", "([Ljava/lang/Object;)Lio/reactivex/Flowable;", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "Lkotlin/ranges/IntProgression;", "toIterable", "io/reactivex/rxkotlin/FlowableKt$toIterable$1", "(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;", "toMap", "Lio/reactivex/Single;", "", "A", "B", "", "toMultimap", "", "", "zip", "zipFunction", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class FlowableKt {
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Boolean> toFlowable(boolean[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Byte> toFlowable(byte[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Character> toFlowable(char[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Short> toFlowable(short[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Integer> toFlowable(int[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Long> toFlowable(long[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Float> toFlowable(float[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Double> toFlowable(double[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.collections.ArraysKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> toFlowable(T[] receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Flowable<T> flowableFromArray = io.reactivex.Flowable.fromArray(java.util.Arrays.copyOf(receiver, receiver.length));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableFromArray, "Flowable.fromArray(*this)");
        return flowableFromArray;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.Flowable<java.lang.Integer> toFlowable(kotlin.ranges.IntProgression receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        if (receiver.getStep() != 1 || ((long) receiver.getLast()) - ((long) receiver.getFirst()) >= Integer.MAX_VALUE) {
            io.reactivex.Flowable<java.lang.Integer> flowableFromIterable = io.reactivex.Flowable.fromIterable(receiver);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableFromIterable, "Flowable.fromIterable(this)");
            return flowableFromIterable;
        }
        io.reactivex.Flowable<java.lang.Integer> flowableRange = io.reactivex.Flowable.range(receiver.getFirst(), java.lang.Math.max(0, (receiver.getLast() - receiver.getFirst()) + 1));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableRange, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return flowableRange;
    }

    public static final <T> io.reactivex.Flowable<T> toFlowable(java.util.Iterator<? extends T> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(toIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> toFlowable(java.lang.Iterable<? extends T> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Flowable<T> flowableFromIterable = io.reactivex.Flowable.fromIterable(receiver);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableFromIterable, "Flowable.fromIterable(this)");
        return flowableFromIterable;
    }

    public static final <T> io.reactivex.Flowable<T> toFlowable(kotlin.sequences.Sequence<? extends T> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return toFlowable(kotlin.sequences.SequencesKt.asIterable(receiver));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> merge(java.lang.Iterable<? extends io.reactivex.Flowable<? extends T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Flowable<T> flowableMerge = io.reactivex.Flowable.merge(toFlowable(receiver));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableMerge, "Flowable.merge(this.toFlowable())");
        return flowableMerge;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> mergeDelayError(java.lang.Iterable<? extends io.reactivex.Flowable<? extends T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Flowable<T> flowableMergeDelayError = io.reactivex.Flowable.mergeDelayError(toFlowable(receiver));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableMergeDelayError, "Flowable.mergeDelayError(this.toFlowable())");
        return flowableMergeDelayError;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R> io.reactivex.Flowable<R> flatMapSequence(io.reactivex.Flowable<T> receiver, final kotlin.jvm.functions.Function1<? super T, ? extends kotlin.sequences.Sequence<? extends R>> body) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(body, "body");
        io.reactivex.Flowable<R> flowableFlatMap = receiver.flatMap(new io.reactivex.functions.Function<T, org.reactivestreams.Publisher<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.flatMapSequence.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Flowable<R> apply(T it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return io.reactivex.rxkotlin.FlowableKt.toFlowable((kotlin.sequences.Sequence) body.invoke(it));
            }
        });
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableFlatMap, "flatMap { body(it).toFlowable() }");
        return flowableFlatMap;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R> io.reactivex.Flowable<R> combineLatest(java.lang.Iterable<? extends io.reactivex.Flowable<T>> receiver, final kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> combineFunction) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(combineFunction, "combineFunction");
        io.reactivex.Flowable<R> flowableCombineLatest = io.reactivex.Flowable.combineLatest(receiver, new io.reactivex.functions.Function<java.lang.Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt.combineLatest.1
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
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…List().map { it as T }) }");
        return flowableCombineLatest;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R> io.reactivex.Flowable<R> zip(java.lang.Iterable<? extends io.reactivex.Flowable<T>> receiver, final kotlin.jvm.functions.Function1<? super java.util.List<? extends T>, ? extends R> zipFunction) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(zipFunction, "zipFunction");
        io.reactivex.Flowable<R> flowableZip = io.reactivex.Flowable.zip(receiver, new io.reactivex.functions.Function<java.lang.Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt.zip.1
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
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableZip, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return flowableZip;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    private static final <R> io.reactivex.Flowable<R> cast(io.reactivex.Flowable<?> flowable) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "R");
        io.reactivex.Flowable<R> flowable2 = (io.reactivex.Flowable<R>) flowable.cast(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowable2, "cast(R::class.java)");
        return flowable2;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.PASS_THROUGH)
    @io.reactivex.annotations.CheckReturnValue
    private static final <R> io.reactivex.Flowable<R> ofType(io.reactivex.Flowable<?> flowable) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "R");
        io.reactivex.Flowable<R> flowable2 = (io.reactivex.Flowable<R>) flowable.ofType(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowable2, "ofType(R::class.java)");
        return flowable2;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.FlowableKt$toIterable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: flowable.kt */
    @kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"io/reactivex/rxkotlin/FlowableKt$toIterable$1", "", "iterator", "", "rxkotlin"}, k = 1, mv = {1, 1, 11})
    public static final class C00571<T> implements java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {
        final /* synthetic */ java.util.Iterator receiver$0;

        C00571(java.util.Iterator<? extends T> it) {
            this.receiver$0 = it;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
            return this.receiver$0;
        }
    }

    private static final <T> io.reactivex.rxkotlin.FlowableKt.C00571 toIterable(java.util.Iterator<? extends T> it) {
        return new io.reactivex.rxkotlin.FlowableKt.C00571(it);
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.FlowableKt$combineLatest$2, reason: invalid class name */
    /* JADX INFO: compiled from: flowable.kt */
    @kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0015\u0010\u0005\u001a\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u0011H\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "R", "", "p1", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "first", "p2", "second", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 1, 11})
    static final class AnonymousClass2<R, T> extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function2<T, R, kotlin.Pair<? extends T, ? extends R>> {
        public static final io.reactivex.rxkotlin.FlowableKt.AnonymousClass2 INSTANCE = new io.reactivex.rxkotlin.FlowableKt.AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final java.lang.String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Pair.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final java.lang.String getSignature() {
            return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public final kotlin.Pair<T, R> invoke(T p1, R p2) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p2, "p2");
            return new kotlin.Pair<>(p1, p2);
        }
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R> io.reactivex.Flowable<kotlin.Pair<T, R>> combineLatest(io.reactivex.Flowable<T> receiver, io.reactivex.Flowable<R> flowable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flowable, "flowable");
        io.reactivex.Flowable<T> flowable2 = receiver;
        io.reactivex.Flowable<R> flowable3 = flowable;
        final io.reactivex.rxkotlin.FlowableKt.AnonymousClass2 anonymousClass2 = io.reactivex.rxkotlin.FlowableKt.AnonymousClass2.INSTANCE;
        java.lang.Object obj = anonymousClass2;
        if (anonymousClass2 != null) {
            obj = new io.reactivex.functions.BiFunction() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_BiFunction$0
                /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
                @Override // io.reactivex.functions.BiFunction
                public final /* synthetic */ R apply(T1 t1, T2 t2) {
                    return anonymousClass2.invoke(t1, t2);
                }
            };
        }
        io.reactivex.Flowable<kotlin.Pair<T, R>> flowableCombineLatest = io.reactivex.Flowable.combineLatest(flowable2, flowable3, (io.reactivex.functions.BiFunction) obj);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return flowableCombineLatest;
    }

    /* JADX INFO: Add missing generic type declarations: [R, T, U] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.FlowableKt$combineLatest$3, reason: invalid class name */
    /* JADX INFO: compiled from: flowable.kt */
    @kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0015\u0010\u0006\u001a\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u0011H\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "T", "R", "U", "", "p1", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "first", "p2", "second", "p3", "third", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, k = 3, mv = {1, 1, 11})
    static final class AnonymousClass3<R, T, U> extends kotlin.jvm.internal.FunctionReference implements kotlin.jvm.functions.Function3<T, R, U, kotlin.Triple<? extends T, ? extends R, ? extends U>> {
        public static final io.reactivex.rxkotlin.FlowableKt.AnonymousClass3 INSTANCE = new io.reactivex.rxkotlin.FlowableKt.AnonymousClass3();

        AnonymousClass3() {
            super(3);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final java.lang.String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final kotlin.reflect.KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Triple.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final java.lang.String getSignature() {
            return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
        }

        @Override // kotlin.jvm.functions.Function3
        public final kotlin.Triple<T, R, U> invoke(T p1, R p2, U p3) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p1, "p1");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p2, "p2");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(p3, "p3");
            return new kotlin.Triple<>(p1, p2, p3);
        }
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T, R, U> io.reactivex.Flowable<kotlin.Triple<T, R, U>> combineLatest(io.reactivex.Flowable<T> receiver, io.reactivex.Flowable<R> flowable1, io.reactivex.Flowable<U> flowable2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flowable1, "flowable1");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(flowable2, "flowable2");
        io.reactivex.Flowable<T> flowable = receiver;
        io.reactivex.Flowable<R> flowable3 = flowable1;
        io.reactivex.Flowable<U> flowable4 = flowable2;
        final io.reactivex.rxkotlin.FlowableKt.AnonymousClass3 anonymousClass3 = io.reactivex.rxkotlin.FlowableKt.AnonymousClass3.INSTANCE;
        java.lang.Object obj = anonymousClass3;
        if (anonymousClass3 != null) {
            obj = new io.reactivex.functions.Function3() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_Function3$0
                /* JADX WARN: Type inference failed for: r2v1, types: [R, java.lang.Object] */
                @Override // io.reactivex.functions.Function3
                public final /* synthetic */ R apply(T1 t1, T2 t2, T3 t3) {
                    return anonymousClass3.invoke(t1, t2, t3);
                }
            };
        }
        io.reactivex.Flowable<kotlin.Triple<T, R, U>> flowableCombineLatest = io.reactivex.Flowable.combineLatest(flowable, flowable3, flowable4, (io.reactivex.functions.Function3) obj);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return flowableCombineLatest;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> mergeAll(io.reactivex.Flowable<io.reactivex.Flowable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Flowable<T>) receiver.flatMap(new io.reactivex.functions.Function<T, org.reactivestreams.Publisher<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.mergeAll.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Flowable<T> apply(io.reactivex.Flowable<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> concatAll(io.reactivex.Flowable<io.reactivex.Flowable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Flowable<T>) receiver.concatMap(new io.reactivex.functions.Function<T, org.reactivestreams.Publisher<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.concatAll.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Flowable<T> apply(io.reactivex.Flowable<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> switchLatest(io.reactivex.Flowable<io.reactivex.Flowable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Flowable<T>) receiver.switchMap(new io.reactivex.functions.Function<T, org.reactivestreams.Publisher<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.switchLatest.1
            @Override // io.reactivex.functions.Function
            public final io.reactivex.Flowable<T> apply(io.reactivex.Flowable<T> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it;
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> switchOnNext(io.reactivex.Flowable<io.reactivex.Flowable<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        io.reactivex.Flowable<T> flowableSwitchOnNext = io.reactivex.Flowable.switchOnNext(receiver);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(flowableSwitchOnNext, "Flowable.switchOnNext(this)");
        return flowableSwitchOnNext;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static final <A, B> io.reactivex.Single<java.util.Map<A, B>> toMap(io.reactivex.Flowable<kotlin.Pair<A, B>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Single<java.util.Map<A, B>>) receiver.toMap(new io.reactivex.functions.Function<T, K>() { // from class: io.reactivex.rxkotlin.FlowableKt.toMap.1
            /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final A apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getFirst();
            }
        }, new io.reactivex.functions.Function<T, V>() { // from class: io.reactivex.rxkotlin.FlowableKt.toMap.2
            /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final B apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getSecond();
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static final <A, B> io.reactivex.Single<java.util.Map<A, java.util.Collection<B>>> toMultimap(io.reactivex.Flowable<kotlin.Pair<A, B>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return (io.reactivex.Single<java.util.Map<A, java.util.Collection<B>>>) receiver.toMultimap(new io.reactivex.functions.Function<T, K>() { // from class: io.reactivex.rxkotlin.FlowableKt.toMultimap.1
            /* JADX WARN: Type inference failed for: r2v1, types: [A, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final A apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getFirst();
            }
        }, new io.reactivex.functions.Function<T, V>() { // from class: io.reactivex.rxkotlin.FlowableKt.toMultimap.2
            /* JADX WARN: Type inference failed for: r2v1, types: [B, java.lang.Object] */
            @Override // io.reactivex.functions.Function
            public final B apply(kotlin.Pair<? extends A, ? extends B> it) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
                return it.getSecond();
            }
        });
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.Flowable<T> concatAll(java.lang.Iterable<? extends org.reactivestreams.Publisher<T>> receiver) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        return io.reactivex.Flowable.concat(receiver);
    }
}
