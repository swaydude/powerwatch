package powerwatch.matrix.com.pwgen2android.sdk.channels;

/* JADX INFO: compiled from: BleStreamCommunicationChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\u0016J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001J\t\u0010\f\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\r\u001a\u00020\u0011H\u0096\u0001J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u0096\u0001J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u001a\u001a\u00020\u000bH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "communicationChannel", "initialStream", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;)V", "close", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "eventData", "Lio/reactivex/Observable;", "", "open", "characteristic", "Ljava/util/UUID;", "read", "Lio/reactivex/Single;", "", "receivedData", "refresh", "", "requestMTU", "", "mtu", "resubscribeCharacteristics", "send", "data", "sendEvent", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BleStreamCommunicationChannel implements powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel {
    private final powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel;
    private final powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream initialStream;

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> eventData() {
        return this.communicationChannel.eventData();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open() {
        return this.communicationChannel.open();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open(java.util.UUID characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        return this.communicationChannel.open(characteristic);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> read(java.lang.String characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        return this.communicationChannel.read(characteristic);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public void refresh() {
        this.communicationChannel.refresh();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<java.lang.Integer> requestMTU(int mtu) {
        return this.communicationChannel.requestMTU(mtu);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable resubscribeCharacteristics() {
        return this.communicationChannel.resubscribeCharacteristics();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> sendEvent(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return this.communicationChannel.sendEvent(data);
    }

    public BleStreamCommunicationChannel(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel, powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream initialStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicationChannel, "communicationChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialStream, "initialStream");
        this.communicationChannel = communicationChannel;
        this.initialStream = initialStream;
    }

    public /* synthetic */ BleStreamCommunicationChannel(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel, powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStreamImpl channelStreamImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicationChannel, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStreamImpl(0, 1, null) : channelStreamImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> receivedData() {
        io.reactivex.Observable<byte[]> observableMerge = io.reactivex.Observable.merge(this.communicationChannel.receivedData().scan(this.initialStream, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BleStreamCommunicationChannel$Qe0rYjX7ZKEjbX1lOblqI8SHkS8
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel.m2212receivedData$lambda0((powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream) obj, (byte[]) obj2);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BleStreamCommunicationChannel$DiSX2I4tDljnsvDhj8IRGpIdhmE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel.m2213receivedData$lambda1((powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BleStreamCommunicationChannel$fl1LeQhqQpuxJAT6m3G3wGqQbtU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel.m2214receivedData$lambda2((java.util.List) obj);
            }
        }), this.communicationChannel.eventData());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(\n                communicationChannel.receivedData()\n                        .scan(initialStream) { accumulator, data ->\n\n                            accumulator.clearMessages()\n                            accumulator.appendData(data)\n                            accumulator.extractMessages()\n\n                            accumulator\n                        }\n                        .map { it.getMessageList().toList() }\n                        .flatMap { Observable.fromIterable(it) },\n                communicationChannel.eventData()\n        )");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: receivedData$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream m2212receivedData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream accumulator, byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accumulator, "accumulator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        accumulator.clearMessages();
        accumulator.appendData(data);
        accumulator.extractMessages();
        return accumulator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: receivedData$lambda-1, reason: not valid java name */
    public static final java.util.List m2213receivedData$lambda1(powerwatch.matrix.com.pwgen2android.sdk.channels.stream.ChannelStream it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.CollectionsKt.toList(it.getMessageList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: receivedData$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2214receivedData$lambda2(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.fromIterable(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> send(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Single<byte[]> map = io.reactivex.Observable.fromIterable(kotlin.collections.CollectionsKt.chunked(kotlin.collections.ArraysKt.toMutableList(data), 20)).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BleStreamCommunicationChannel$qIHc3vlNMGFNvDbSXDTPGKkfguM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel.m2215send$lambda3((java.util.List) obj);
            }
        }).concatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BleStreamCommunicationChannel$WL3jlI0WZ_07TdSQLJO8azO78Lk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel.m2216send$lambda4(this.f$0, (byte[]) obj);
            }
        }).toList().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BleStreamCommunicationChannel$hZOiK2YhOSa0oKTMAzRrnShxNvs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel.m2217send$lambda6((java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "fromIterable(\n                data.toMutableList()\n                        .chunked(20))\n                .map {\n                    it.toByteArray()\n                }\n                .concatMap {\n                    communicationChannel.send(it).toObservable()\n                }\n                .toList()\n                .map {\n                    it.map { array -> array.toMutableList() }\n                            .flatten()\n                            .toByteArray()\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: send$lambda-3, reason: not valid java name */
    public static final byte[] m2215send$lambda3(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.collections.CollectionsKt.toByteArray(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: send$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2216send$lambda4(powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.communicationChannel.send(it).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: send$lambda-6, reason: not valid java name */
    public static final byte[] m2217send$lambda6(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.util.List<byte[]> list = it;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (byte[] array : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "array");
            arrayList.add(kotlin.collections.ArraysKt.toMutableList(array));
        }
        return kotlin.collections.CollectionsKt.toByteArray(kotlin.collections.CollectionsKt.flatten(arrayList));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable close() {
        return io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BleStreamCommunicationChannel$H6uSNUFUMhC2OiOqN4HAZnpBk8o
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel.m2211close$lambda7(this.f$0);
            }
        }).andThen(this.communicationChannel.close());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: close$lambda-7, reason: not valid java name */
    public static final void m2211close$lambda7(powerwatch.matrix.com.pwgen2android.sdk.channels.BleStreamCommunicationChannel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.initialStream.destroy();
    }
}
