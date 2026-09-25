package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: PushRemoteMessageFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;", "", "messageSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/google/firebase/messaging/RemoteMessage;", "(Lio/reactivex/subjects/PublishSubject;)V", "getMessageSubject", "()Lio/reactivex/subjects/PublishSubject;", "priorityList", "", "", "getMessage", "Lio/reactivex/Observable;", "priority", "Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class PushRemoteMessageFactory {
    private final io.reactivex.subjects.PublishSubject<com.google.firebase.messaging.RemoteMessage> messageSubject;
    private final java.util.Set<java.lang.Integer> priorityList;

    public PushRemoteMessageFactory(io.reactivex.subjects.PublishSubject<com.google.firebase.messaging.RemoteMessage> messageSubject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSubject, "messageSubject");
        this.messageSubject = messageSubject;
        this.priorityList = new java.util.LinkedHashSet();
    }

    protected final io.reactivex.subjects.PublishSubject<com.google.firebase.messaging.RemoteMessage> getMessageSubject() {
        return this.messageSubject;
    }

    public static /* synthetic */ io.reactivex.Observable getMessage$default(powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory pushRemoteMessageFactory, powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority messageReceiverPriority, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessage");
        }
        if ((i & 1) != 0) {
            messageReceiverPriority = powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority.Medium.INSTANCE;
        }
        return pushRemoteMessageFactory.getMessage(messageReceiverPriority);
    }

    public final io.reactivex.Observable<com.google.firebase.messaging.RemoteMessage> getMessage(final powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority priority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
        io.reactivex.Observable<com.google.firebase.messaging.RemoteMessage> observableFilter = this.messageSubject.doOnSubscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.fcm.-$$Lambda$PushRemoteMessageFactory$LJQG9_v6vd6neiLWt92s6ZeIL5k
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory.m1427getMessage$lambda0(this.f$0, priority, (io.reactivex.disposables.Disposable) obj);
            }
        }).doOnDispose(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.fcm.-$$Lambda$PushRemoteMessageFactory$Z3VvId8MbQh3yeUAx6WXtj_nYzc
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory.m1428getMessage$lambda1(this.f$0, priority);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.fcm.-$$Lambda$PushRemoteMessageFactory$2rXjLMJkStWUOwLJOF6LNLjniQc
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory.m1429getMessage$lambda2(this.f$0, priority, (com.google.firebase.messaging.RemoteMessage) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "messageSubject\n            .doOnSubscribe {\n                priorityList.add(priority.value)\n            }\n            .doOnDispose {\n                priorityList.remove(priority.value)\n            }\n            .filter {\n                priorityList.isEmpty() || priorityList.maxOrNull()!! <= priority.value\n            }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMessage$lambda-0, reason: not valid java name */
    public static final void m1427getMessage$lambda0(powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory this$0, powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority priority, io.reactivex.disposables.Disposable disposable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "$priority");
        this$0.priorityList.add(java.lang.Integer.valueOf(priority.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMessage$lambda-1, reason: not valid java name */
    public static final void m1428getMessage$lambda1(powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory this$0, powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority priority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "$priority");
        this$0.priorityList.remove(java.lang.Integer.valueOf(priority.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getMessage$lambda-2, reason: not valid java name */
    public static final boolean m1429getMessage$lambda2(powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory this$0, powerwatch.matrix.com.pwgen2android.fcm.MessageReceiverPriority priority, com.google.firebase.messaging.RemoteMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "$priority");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (!this$0.priorityList.isEmpty()) {
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) this$0.priorityList);
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            if (num.intValue() > priority.getValue()) {
                return false;
            }
        }
        return true;
    }
}
