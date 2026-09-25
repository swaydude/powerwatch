package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: PushMessagingFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;", "Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;", "context", "Landroid/content/Context;", "messageSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/google/firebase/messaging/RemoteMessage;", "(Landroid/content/Context;Lio/reactivex/subjects/PublishSubject;)V", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PushMessagingFactory extends powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory {
    private static final java.lang.String TAG = powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory.class.getSimpleName();

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PushMessagingFactory(android.content.Context context, io.reactivex.subjects.PublishSubject publishSubject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            publishSubject = io.reactivex.subjects.PublishSubject.create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubject, "create()");
        }
        this(context, publishSubject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushMessagingFactory(android.content.Context context, io.reactivex.subjects.PublishSubject<com.google.firebase.messaging.RemoteMessage> messageSubject) {
        super(messageSubject);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSubject, "messageSubject");
        android.util.Log.d(TAG, "PushNotificationsFactory initialized..");
        context.registerReceiver(new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                android.os.Bundle extras = intent.getExtras();
                com.google.firebase.messaging.RemoteMessage remoteMessage = extras == null ? null : (com.google.firebase.messaging.RemoteMessage) extras.getParcelable(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_MESSAGE);
                if (remoteMessage != null) {
                    powerwatch.matrix.com.pwgen2android.fcm.PushMessagingFactory.this.getMessageSubject().onNext(remoteMessage);
                }
            }
        }, new android.content.IntentFilter(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_MESSAGE_ARRIVED_ACTION));
    }
}
