package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: FirebaseMessagingService.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "refreshedToken", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        android.util.Log.d(powerwatch.matrix.com.pwgen2android.fcm.FirebaseMessagingService.class.getSimpleName(), "Push message received from the cloud...");
        android.content.Intent intent = new android.content.Intent(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_MESSAGE_ARRIVED_ACTION);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_MESSAGE, remoteMessage);
        intent.putExtras(bundle);
        sendOrderedBroadcast(intent, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(java.lang.String refreshedToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshedToken, "refreshedToken");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Firebase OnNewToken called, received token.", null, 2, null);
        android.content.Intent intent = new android.content.Intent(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_TOKEN_REFRESHED_ACTION);
        intent.putExtra(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_TOKEN, refreshedToken);
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }
}
