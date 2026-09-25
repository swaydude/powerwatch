package kotlinx.coroutines.channels;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt"}, k = 4, mv = {1, 1, 13})
public final class ChannelsKt {
    public static final java.lang.String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final <E> java.lang.Object all(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.all(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.any(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object any(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.any(receiveChannel, function1, continuation);
    }

    public static final <E, K, V> java.lang.Object associate(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, ? extends kotlin.Pair<? extends K, ? extends V>> function1, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends V>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associate(receiveChannel, function1, continuation);
    }

    public static final <E, K> java.lang.Object associateBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends E>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateBy(receiveChannel, function1, continuation);
    }

    public static final <E, K, V> java.lang.Object associateBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.jvm.functions.Function1<? super E, ? extends V> function2, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends V>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateBy(receiveChannel, function1, function2, continuation);
    }

    public static final <E, K, M extends java.util.Map<? super K, ? super E>> java.lang.Object associateByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, M m, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.coroutines.Continuation<? super M> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateByTo(receiveChannel, m, function1, continuation);
    }

    public static final <E, K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object associateByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, M m, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.jvm.functions.Function1<? super E, ? extends V> function2, kotlin.coroutines.Continuation<? super M> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateByTo(receiveChannel, m, function1, function2, continuation);
    }

    public static final <E, K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object associateTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, M m, kotlin.jvm.functions.Function1<? super E, ? extends kotlin.Pair<? extends K, ? extends V>> function1, kotlin.coroutines.Continuation<? super M> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.associateTo(receiveChannel, m, function1, continuation);
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        return (R) kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consume(broadcastChannel, function1);
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        return (R) kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consume(receiveChannel, function1);
    }

    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(broadcastChannel, function1, continuation);
    }

    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object consumeEachIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super kotlin.collections.IndexedValue<? extends E>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEachIndexed(receiveChannel, function1, continuation);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumes(kotlinx.coroutines.channels.ReceiveChannel<?> receiveChannel) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumes(receiveChannel);
    }

    public static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> consumesAll(kotlinx.coroutines.channels.ReceiveChannel<?>... receiveChannelArr) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumesAll(receiveChannelArr);
    }

    public static final <E> java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.count(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object count(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.count(receiveChannel, function1, continuation);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> distinct(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.distinct(receiveChannel);
    }

    public static final <E, K> kotlinx.coroutines.channels.ReceiveChannel<E> distinctBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.distinctBy(receiveChannel, coroutineContext, function2);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> drop(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.drop(receiveChannel, i, coroutineContext);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> dropWhile(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.dropWhile(receiveChannel, coroutineContext, function2);
    }

    public static final <E> java.lang.Object elementAt(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, int i, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.elementAt(receiveChannel, i, continuation);
    }

    public static final <E> java.lang.Object elementAtOrElse(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends E> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.elementAtOrElse(receiveChannel, i, function1, continuation);
    }

    public static final <E> java.lang.Object elementAtOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, int i, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.elementAtOrNull(receiveChannel, i, continuation);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filter(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filter(receiveChannel, coroutineContext, function2);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterIndexed(receiveChannel, coroutineContext, function3);
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, java.lang.Boolean> function2, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterIndexedTo(receiveChannel, c, function2, continuation);
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, java.lang.Boolean> function2, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterIndexedTo(receiveChannel, c, function2, continuation);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNot(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNot(receiveChannel, coroutineContext, function2);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> filterNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotNull(receiveChannel);
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotNullTo(receiveChannel, c, continuation);
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotNullTo(receiveChannel, c, continuation);
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterNotTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotTo(receiveChannel, c, function1, continuation);
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterNotTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterNotTo(receiveChannel, c, function1, continuation);
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object filterTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterTo(receiveChannel, c, function1, continuation);
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object filterTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.filterTo(receiveChannel, c, function1, continuation);
    }

    public static final <E> java.lang.Object find(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.find(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object findLast(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.findLast(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.first(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object first(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.first(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.firstOrNull(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object firstOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.firstOrNull(receiveChannel, function1, continuation);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> flatMap(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.flatMap(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> java.lang.Object fold(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, R r, kotlin.jvm.functions.Function2<? super R, ? super E, ? extends R> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.fold(receiveChannel, r, function2, continuation);
    }

    public static final <E, R> java.lang.Object foldIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, R r, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super E, ? extends R> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.foldIndexed(receiveChannel, r, function3, continuation);
    }

    public static final <E, K> java.lang.Object groupBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends java.util.List<? extends E>>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupBy(receiveChannel, function1, continuation);
    }

    public static final <E, K, V> java.lang.Object groupBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.jvm.functions.Function1<? super E, ? extends V> function2, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends java.util.List<? extends V>>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupBy(receiveChannel, function1, function2, continuation);
    }

    public static final <E, K, M extends java.util.Map<? super K, java.util.List<E>>> java.lang.Object groupByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, M m, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.coroutines.Continuation<? super M> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupByTo(receiveChannel, m, function1, continuation);
    }

    public static final <E, K, V, M extends java.util.Map<? super K, java.util.List<V>>> java.lang.Object groupByTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, M m, kotlin.jvm.functions.Function1<? super E, ? extends K> function1, kotlin.jvm.functions.Function1<? super E, ? extends V> function2, kotlin.coroutines.Continuation<? super M> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.groupByTo(receiveChannel, m, function1, function2, continuation);
    }

    public static final <E> java.lang.Object indexOf(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, E e, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOf(receiveChannel, e, continuation);
    }

    public static final <E> java.lang.Object indexOfFirst(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOfFirst(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object indexOfLast(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.indexOfLast(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.last(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object last(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.last(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object lastIndexOf(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, E e, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.lastIndexOf(receiveChannel, e, continuation);
    }

    public static final <E> java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.lastOrNull(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object lastOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.lastOrNull(receiveChannel, function1, continuation);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> map(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.map(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexed(receiveChannel, coroutineContext, function3);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapIndexedNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedNotNull(receiveChannel, coroutineContext, function3);
    }

    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapIndexedNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> function2, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedNotNullTo(receiveChannel, c, function2, continuation);
    }

    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapIndexedNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> function2, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedNotNullTo(receiveChannel, c, function2, continuation);
    }

    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> function2, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedTo(receiveChannel, c, function2, continuation);
    }

    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapIndexedTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends R> function2, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapIndexedTo(receiveChannel, c, function2, continuation);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<R> mapNotNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapNotNull(receiveChannel, coroutineContext, function2);
    }

    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, ? extends R> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapNotNullTo(receiveChannel, c, function1, continuation);
    }

    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapNotNullTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, ? extends R> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapNotNullTo(receiveChannel, c, function1, continuation);
    }

    public static final <E, R, C extends java.util.Collection<? super R>> java.lang.Object mapTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, ? extends R> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapTo(receiveChannel, c, function1, continuation);
    }

    public static final <E, R, C extends kotlinx.coroutines.channels.SendChannel<? super R>> java.lang.Object mapTo(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.jvm.functions.Function1<? super E, ? extends R> function1, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.mapTo(receiveChannel, c, function1, continuation);
    }

    public static final <E, R extends java.lang.Comparable<? super R>> java.lang.Object maxBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, ? extends R> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.maxBy(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object maxWith(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, java.util.Comparator<? super E> comparator, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.maxWith(receiveChannel, comparator, continuation);
    }

    public static final <E, R extends java.lang.Comparable<? super R>> java.lang.Object minBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, ? extends R> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.minBy(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object minWith(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, java.util.Comparator<? super E> comparator, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.minWith(receiveChannel, comparator, continuation);
    }

    public static final <E> java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.none(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object none(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.none(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object partition(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<? extends E>, ? extends java.util.List<? extends E>>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.partition(receiveChannel, function1, continuation);
    }

    public static final <S, E extends S> java.lang.Object reduce(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super S, ? super E, ? extends S> function2, kotlin.coroutines.Continuation<? super S> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.reduce(receiveChannel, function2, continuation);
    }

    public static final <S, E extends S> java.lang.Object reduceIndexed(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super S, ? super E, ? extends S> function3, kotlin.coroutines.Continuation<? super S> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.reduceIndexed(receiveChannel, function3, continuation);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> requireNoNulls(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.requireNoNulls(receiveChannel);
    }

    public static final <E> void sendBlocking(kotlinx.coroutines.channels.SendChannel<? super E> sendChannel, E e) throws java.lang.InterruptedException {
        kotlinx.coroutines.channels.ChannelsKt__ChannelsKt.sendBlocking(sendChannel, e);
    }

    public static final <E> java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.single(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object single(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.single(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.singleOrNull(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object singleOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.singleOrNull(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object sumBy(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Integer> function1, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.sumBy(receiveChannel, function1, continuation);
    }

    public static final <E> java.lang.Object sumByDouble(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, java.lang.Double> function1, kotlin.coroutines.Continuation<? super java.lang.Double> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.sumByDouble(receiveChannel, function1, continuation);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> take(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, int i, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.take(receiveChannel, i, coroutineContext);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<E> takeWhile(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.takeWhile(receiveChannel, coroutineContext, function2);
    }

    public static final <E, C extends kotlinx.coroutines.channels.SendChannel<? super E>> java.lang.Object toChannel(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toChannel(receiveChannel, c, continuation);
    }

    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object toCollection(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, C c, kotlin.coroutines.Continuation<? super C> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toCollection(receiveChannel, c, continuation);
    }

    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toList(receiveChannel, continuation);
    }

    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> receiveChannel, M m, kotlin.coroutines.Continuation<? super M> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toMap(receiveChannel, m, continuation);
    }

    public static final <K, V> java.lang.Object toMap(kotlinx.coroutines.channels.ReceiveChannel<? extends kotlin.Pair<? extends K, ? extends V>> receiveChannel, kotlin.coroutines.Continuation<? super java.util.Map<K, ? extends V>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toMap(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object toMutableList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.List<E>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toMutableList(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object toMutableSet(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.Set<E>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toMutableSet(receiveChannel, continuation);
    }

    public static final <E> java.lang.Object toSet(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.Set<? extends E>> continuation) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toSet(receiveChannel, continuation);
    }

    public static final <E> kotlinx.coroutines.channels.ReceiveChannel<kotlin.collections.IndexedValue<E>> withIndex(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.withIndex(receiveChannel, coroutineContext);
    }

    public static final <E, R> kotlinx.coroutines.channels.ReceiveChannel<kotlin.Pair<E, R>> zip(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.zip(receiveChannel, receiveChannel2);
    }

    public static final <E, R, V> kotlinx.coroutines.channels.ReceiveChannel<V> zip(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel2, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> function2) {
        return kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.zip(receiveChannel, receiveChannel2, coroutineContext, function2);
    }
}
