package kotlin.sequences;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001ab\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e\u001a=\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0017\"\u0002H\u0002¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0002¢\u0006\u0002\b\u001c\u001a)\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001d0\u0001H\u0007¢\u0006\u0002\b\u001e\u001a\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0007\u001a@\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0'0&\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0&0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "flatMapIndexed", "R", "C", com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE, "transform", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "generateSequence", "", "nextFunction", "seedFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "shuffled", "random", "Lkotlin/random/Random;", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/sequences/SequencesKt")
public class SequencesKt__SequencesKt extends kotlin.sequences.SequencesKt__SequencesJVMKt {
    private static final <T> kotlin.sequences.Sequence<T> Sequence(final kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> function0) {
        return new kotlin.sequences.Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.Sequence.1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<T> iterator() {
                return (java.util.Iterator) function0.invoke();
            }
        };
    }

    public static final <T> kotlin.sequences.Sequence<T> asSequence(final java.util.Iterator<? extends T> asSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asSequence, "$this$asSequence");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public java.util.Iterator<T> iterator() {
                return asSequence;
            }
        });
    }

    public static final <T> kotlin.sequences.Sequence<T> sequenceOf(T... elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? kotlin.sequences.SequencesKt.emptySequence() : kotlin.collections.ArraysKt.asSequence(elements);
    }

    public static final <T> kotlin.sequences.Sequence<T> emptySequence() {
        return kotlin.sequences.EmptySequence.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> kotlin.sequences.Sequence<T> orEmpty(kotlin.sequences.Sequence<? extends T> sequence) {
        return sequence != 0 ? sequence : kotlin.sequences.SequencesKt.emptySequence();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    static final class C01441<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0 $defaultValue;
        final /* synthetic */ kotlin.sequences.Sequence $this_ifEmpty;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01441(kotlin.sequences.Sequence sequence, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$this_ifEmpty = sequence;
            this.$defaultValue = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> completion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "completion");
            kotlin.sequences.SequencesKt__SequencesKt.C01441 c01441 = new kotlin.sequences.SequencesKt__SequencesKt.C01441(this.$this_ifEmpty, this.$defaultValue, completion);
            c01441.L$0 = obj;
            return c01441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlin.sequences.SequencesKt__SequencesKt.C01441) create(obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
                java.util.Iterator<? extends T> it = this.$this_ifEmpty.iterator();
                if (it.hasNext()) {
                    this.label = 1;
                    if (sequenceScope.yieldAll(it, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    kotlin.sequences.Sequence<? extends T> sequence = (kotlin.sequences.Sequence) this.$defaultValue.invoke();
                    this.label = 2;
                    if (sequenceScope.yieldAll(sequence, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1 || i == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final <T> kotlin.sequences.Sequence<T> ifEmpty(kotlin.sequences.Sequence<? extends T> ifEmpty, kotlin.jvm.functions.Function0<? extends kotlin.sequences.Sequence<? extends T>> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ifEmpty, "$this$ifEmpty");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt.C01441(ifEmpty, defaultValue, null));
    }

    public static final <T> kotlin.sequences.Sequence<T> flatten(kotlin.sequences.Sequence<? extends kotlin.sequences.Sequence<? extends T>> flatten) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flatten, "$this$flatten");
        return flatten$SequencesKt__SequencesKt(flatten, new kotlin.jvm.functions.Function1<kotlin.sequences.Sequence<? extends T>, java.util.Iterator<? extends T>>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.flatten.1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Iterator<T> invoke(kotlin.sequences.Sequence<? extends T> it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return it.iterator();
            }
        });
    }

    public static final <T> kotlin.sequences.Sequence<T> flattenSequenceOfIterable(kotlin.sequences.Sequence<? extends java.lang.Iterable<? extends T>> flatten) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flatten, "$this$flatten");
        return flatten$SequencesKt__SequencesKt(flatten, new kotlin.jvm.functions.Function1<java.lang.Iterable<? extends T>, java.util.Iterator<? extends T>>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.flatten.2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Iterator<T> invoke(java.lang.Iterable<? extends T> it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return it.iterator();
            }
        });
    }

    private static final <T, R> kotlin.sequences.Sequence<R> flatten$SequencesKt__SequencesKt(kotlin.sequences.Sequence<? extends T> sequence, kotlin.jvm.functions.Function1<? super T, ? extends java.util.Iterator<? extends R>> function1) {
        if (sequence instanceof kotlin.sequences.TransformingSequence) {
            return ((kotlin.sequences.TransformingSequence) sequence).flatten$kotlin_stdlib(function1);
        }
        return new kotlin.sequences.FlatteningSequence(sequence, new kotlin.jvm.functions.Function1<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.flatten.3
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(T t) {
                return t;
            }
        }, function1);
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends T, ? extends R>> unzip) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unzip, "$this$unzip");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (kotlin.Pair<? extends T, ? extends R> pair : unzip) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
    }

    public static final <T> kotlin.sequences.Sequence<T> shuffled(kotlin.sequences.Sequence<? extends T> shuffled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shuffled, "$this$shuffled");
        return kotlin.sequences.SequencesKt.shuffled(shuffled, kotlin.random.Random.INSTANCE);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$shuffled$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
    static final class C01451<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.random.Random $random;
        final /* synthetic */ kotlin.sequences.Sequence $this_shuffled;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01451(kotlin.sequences.Sequence sequence, kotlin.random.Random random, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$this_shuffled = sequence;
            this.$random = random;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> completion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "completion");
            kotlin.sequences.SequencesKt__SequencesKt.C01451 c01451 = new kotlin.sequences.SequencesKt__SequencesKt.C01451(this.$this_shuffled, this.$random, completion);
            c01451.L$0 = obj;
            return c01451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlin.sequences.SequencesKt__SequencesKt.C01451) create(obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            java.util.List mutableList;
            kotlin.sequences.SequenceScope sequenceScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
                mutableList = kotlin.sequences.SequencesKt.toMutableList(this.$this_shuffled);
                sequenceScope = sequenceScope2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableList = (java.util.List) this.L$1;
                kotlin.sequences.SequenceScope sequenceScope3 = (kotlin.sequences.SequenceScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                sequenceScope = sequenceScope3;
            }
            while (!mutableList.isEmpty()) {
                int iNextInt = this.$random.nextInt(mutableList.size());
                java.lang.Object objRemoveLast = kotlin.collections.CollectionsKt.removeLast(mutableList);
                if (iNextInt < mutableList.size()) {
                    objRemoveLast = mutableList.set(iNextInt, objRemoveLast);
                }
                this.L$0 = sequenceScope;
                this.L$1 = mutableList;
                this.label = 1;
                if (sequenceScope.yield(objRemoveLast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final <T> kotlin.sequences.Sequence<T> shuffled(kotlin.sequences.Sequence<? extends T> shuffled, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shuffled, "$this$shuffled");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt.C01451(shuffled, random, null));
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "C", "R", "Lkotlin/sequences/SequenceScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 5, 1})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {}, l = {332}, m = "invokeSuspend", n = {}, s = {})
    static final class C01401<R> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1 $iterator;
        final /* synthetic */ kotlin.sequences.Sequence $source;
        final /* synthetic */ kotlin.jvm.functions.Function2 $transform;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01401(kotlin.sequences.Sequence sequence, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.$source = sequence;
            this.$transform = function2;
            this.$iterator = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> completion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "completion");
            kotlin.sequences.SequencesKt__SequencesKt.C01401 c01401 = new kotlin.sequences.SequencesKt__SequencesKt.C01401(this.$source, this.$transform, this.$iterator, completion);
            c01401.L$0 = obj;
            return c01401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlin.sequences.SequencesKt__SequencesKt.C01401) create(obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            int i;
            java.util.Iterator it;
            kotlin.sequences.SequenceScope sequenceScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
                i = 0;
                it = this.$source.iterator();
                sequenceScope = sequenceScope2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                it = (java.util.Iterator) this.L$1;
                sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.functions.Function2 function2 = this.$transform;
                int i3 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.util.Iterator it2 = (java.util.Iterator) this.$iterator.invoke(function2.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i), next));
                this.L$0 = sequenceScope;
                this.L$1 = it;
                this.I$0 = i3;
                this.label = 1;
                if (sequenceScope.yieldAll(it2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final <T, C, R> kotlin.sequences.Sequence<R> flatMapIndexed(kotlin.sequences.Sequence<? extends T> source, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends C> transform, kotlin.jvm.functions.Function1<? super C, ? extends java.util.Iterator<? extends R>> iterator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "transform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterator, "iterator");
        return kotlin.sequences.SequencesKt.sequence(new kotlin.sequences.SequencesKt__SequencesKt.C01401(source, transform, iterator, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlin.sequences.Sequence<T> constrainOnce(kotlin.sequences.Sequence<? extends T> constrainOnce) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constrainOnce, "$this$constrainOnce");
        return constrainOnce instanceof kotlin.sequences.ConstrainedOnceSequence ? constrainOnce : new kotlin.sequences.ConstrainedOnceSequence(constrainOnce);
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(final kotlin.jvm.functions.Function0<? extends T> nextFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return kotlin.sequences.SequencesKt.constrainOnce(new kotlin.sequences.GeneratorSequence(nextFunction, new kotlin.jvm.functions.Function1<T, T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.generateSequence.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final T invoke(T it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return (T) nextFunction.invoke();
            }
        }));
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(final T t, kotlin.jvm.functions.Function1<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        if (t == null) {
            return kotlin.sequences.EmptySequence.INSTANCE;
        }
        return new kotlin.sequences.GeneratorSequence(new kotlin.jvm.functions.Function0<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt.generateSequence.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) t;
            }
        }, nextFunction);
    }

    public static final <T> kotlin.sequences.Sequence<T> generateSequence(kotlin.jvm.functions.Function0<? extends T> seedFunction, kotlin.jvm.functions.Function1<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new kotlin.sequences.GeneratorSequence(seedFunction, nextFunction);
    }
}
