package powerwatch.matrix.com.pwgen2android.sdk.connection;

/* JADX INFO: compiled from: Connection.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0016J\u0016\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001cH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;", "protocol", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;", "communicationChannel", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "technologyType", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V", "connectionInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;", "getConnectionInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;", "setConnectionInfo", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "output", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "sendingSubject", "close", "Lio/reactivex/Completable;", "messageOutput", "Lio/reactivex/Observable;", "open", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;", "kotlin.jvm.PlatformType", "refresh", "", "resubscribeCharacteristics", "sendMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ConnectionImpl implements powerwatch.matrix.com.pwgen2android.sdk.connection.Connection {
    private powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel;
    private powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo;
    private final io.reactivex.disposables.CompositeDisposable disposable;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> output;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol protocol;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> sendingSubject;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    public static final void m2265_init_$lambda4(java.lang.Throwable th) {
    }

    public ConnectionImpl(powerwatch.matrix.com.pwgen2android.sdk.protocol.Protocol protocol, powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType technologyType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "protocol");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicationChannel, "communicationChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technologyType, "technologyType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.protocol = protocol;
        this.communicationChannel = communicationChannel;
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.disposable = compositeDisposable;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create()");
        this.output = publishSubjectCreate;
        this.connectionInfo = new powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo(technologyType, protocolType);
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create()");
        this.sendingSubject = publishSubjectCreate2;
        compositeDisposable.add(publishSubjectCreate2.concatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$eHL0jCD8RtnjdOVXvlXMGLBb8i0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2264_init_$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$v8IgTTMD5IteRTkmg8Wz5suDzK4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2265_init_$lambda4((java.lang.Throwable) obj);
            }
        }).retry().subscribe());
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public io.reactivex.Completable resubscribeCharacteristics() {
        return this.protocol.resubscribe();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public void setConnectionInfo(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionInfo, "<set-?>");
        this.connectionInfo = connectionInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2264_init_$lambda3(final powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0, final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage sendingMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendingMessage, "sendingMessage");
        return this$0.protocol.sendMessage(sendingMessage.getProtocolMessage()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$cDz3kYYSr19sSBVO1mpjeOoi3CI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2268lambda3$lambda0(sendingMessage, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2269lambda3$lambda1((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$Es6ckCyGVIdRrMfIXBjNcALgP4g
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2270lambda3$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-3$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage m2268lambda3$lambda0(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage sendingMessage, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendingMessage, "$sendingMessage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage.copy$default(sendingMessage, null, it, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-3$lambda-1, reason: not valid java name */
    public static final boolean m2269lambda3$lambda1(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolMessage().getMessageType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.RESPONSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lambda-3$lambda-2, reason: not valid java name */
    public static final void m2270lambda3$lambda2(powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.output.onNext(communicationMessage);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo> open() {
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo> singleDefault = this.protocol.connectToChannel(this.communicationChannel).andThen(io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$5_zddjwIbfoYiz7d2kJaTS2uTyg
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2271open$lambda8(this.f$0, completableEmitter);
            }
        })).toSingleDefault(new powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo(false, 1, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDefault, "protocol.connectToChannel(communicationChannel)\n            .andThen(Completable.create {\n                disposable.add(protocol.messageOutput()\n                        .map {\n                            CommunicationMessage(uid = \"1\", protocolMessage = it,\n                                    protocolType = connectionInfo.protocolType,\n                                    technologyType = connectionInfo.technologyType)\n                        }\n                        .subscribe(\n                                { message -> output.onNext(message) },\n                                { error -> output.onError(error) }\n                        ))\n                it.onComplete()\n            })\n            .toSingleDefault(InitInfo())");
        return singleDefault;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-8, reason: not valid java name */
    public static final void m2271open$lambda8(final powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0, io.reactivex.CompletableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.disposable.add(this$0.protocol.messageOutput().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$nKyGMfKLJUDfh8CQyXSTP1xHnYo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2272open$lambda8$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$KNv7-z0ID9KcJb71fYrlwsfDVf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2273open$lambda8$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$s2fv0skdvwLsRMCVT6Hd8ZB7uH0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2274open$lambda8$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-8$lambda-5, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage m2272open$lambda8$lambda5(powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage("1", it, this$0.getConnectionInfo().getTechnologyType(), this$0.getConnectionInfo().getProtocolType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-8$lambda-6, reason: not valid java name */
    public static final void m2273open$lambda8$lambda6(powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.output.onNext(communicationMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-8$lambda-7, reason: not valid java name */
    public static final void m2274open$lambda8$lambda7(powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.output.onError(th);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public void refresh() {
        this.communicationChannel.refresh();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public io.reactivex.Completable close() {
        io.reactivex.Completable completableAndThen = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$sd76yF2EOloyDoLBh1CHLBvyTys
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2266close$lambda9(this.f$0);
            }
        }).andThen(this.protocol.close());
        kotlin.jvm.internal.Intrinsics.checkNotNull(completableAndThen);
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: close$lambda-9, reason: not valid java name */
    public static final void m2266close$lambda9(powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.disposable.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOutput() {
        return this.output;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.connection.Connection
    public io.reactivex.Completable sendMessage(final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.connection.-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl.m2275sendMessage$lambda10(this.f$0, message, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create {\n                sendingSubject.onNext(message)\n                it.onComplete()\n            }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-10, reason: not valid java name */
    public static final void m2275sendMessage$lambda10(powerwatch.matrix.com.pwgen2android.sdk.connection.ConnectionImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message, io.reactivex.CompletableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.sendingSubject.onNext(message);
        it.onComplete();
    }
}
