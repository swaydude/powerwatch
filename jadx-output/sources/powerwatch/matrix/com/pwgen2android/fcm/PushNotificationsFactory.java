package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: PushNotificationsFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/PushNotificationsFactory;", "Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;", "context", "Landroid/content/Context;", "contentExtractor", "Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;", "messageSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/google/firebase/messaging/RemoteMessage;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;Lio/reactivex/subjects/PublishSubject;)V", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PushNotificationsFactory extends powerwatch.matrix.com.pwgen2android.fcm.PushRemoteMessageFactory {
    private static final java.lang.String TAG = powerwatch.matrix.com.pwgen2android.fcm.PushNotificationsFactory.class.getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.fcm.FCMContentExtractor contentExtractor;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PushNotificationsFactory(android.content.Context context, powerwatch.matrix.com.pwgen2android.fcm.FCMContentExtractor fCMContentExtractor, io.reactivex.subjects.PublishSubject publishSubject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        fCMContentExtractor = (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.fcm.FCMContentExtractorImpl() : fCMContentExtractor;
        if ((i & 4) != 0) {
            publishSubject = io.reactivex.subjects.PublishSubject.create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubject, "create()");
        }
        this(context, fCMContentExtractor, publishSubject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsFactory(android.content.Context context, powerwatch.matrix.com.pwgen2android.fcm.FCMContentExtractor contentExtractor, io.reactivex.subjects.PublishSubject<com.google.firebase.messaging.RemoteMessage> messageSubject) {
        super(messageSubject);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentExtractor, "contentExtractor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageSubject, "messageSubject");
        this.contentExtractor = contentExtractor;
        android.util.Log.d(TAG, "PushNotificationsFactory initialized..");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_MESSAGE_ARRIVED_ACTION);
        intentFilter.setPriority(-999);
        context.registerReceiver(new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.fcm.PushNotificationsFactory.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            }
        }, intentFilter);
    }
}
