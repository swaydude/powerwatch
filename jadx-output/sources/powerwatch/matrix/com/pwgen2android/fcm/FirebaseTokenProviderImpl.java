package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: FirebaseTokenProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00070\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/FirebaseTokenProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "token", "Lio/reactivex/Observable;", "", "getToken", "()Lio/reactivex/Observable;", "tokenSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FirebaseTokenProviderImpl implements powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider {
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> tokenSubject;

    public FirebaseTokenProviderImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        io.reactivex.subjects.BehaviorSubject<java.lang.String> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<String>()");
        this.tokenSubject = behaviorSubjectCreate;
        com.google.firebase.iid.FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: powerwatch.matrix.com.pwgen2android.fcm.-$$Lambda$FirebaseTokenProviderImpl$hv0Tq4tGyAuaW3qhcOA81rEMHJc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                powerwatch.matrix.com.pwgen2android.fcm.FirebaseTokenProviderImpl.m1426_init_$lambda0(this.f$0, task);
            }
        });
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(context).registerReceiver(new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.fcm.FirebaseTokenProviderImpl.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                java.lang.String stringExtra = intent.getStringExtra(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_TOKEN);
                if (stringExtra != null) {
                    powerwatch.matrix.com.pwgen2android.fcm.FirebaseTokenProviderImpl.this.tokenSubject.onNext(stringExtra);
                }
            }
        }, new android.content.IntentFilter(powerwatch.matrix.com.pwgen2android.fcm.FCMKeysKt.FIREBASE_TOKEN_REFRESHED_ACTION));
    }

    @Override // powerwatch.matrix.com.pwgen2android.fcm.PushMessagingTokenProvider
    public io.reactivex.Observable<java.lang.String> getToken() {
        return this.tokenSubject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m1426_init_$lambda0(powerwatch.matrix.com.pwgen2android.fcm.FirebaseTokenProviderImpl this$0, com.google.android.gms.tasks.Task task) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            com.google.firebase.iid.InstanceIdResult instanceIdResult = (com.google.firebase.iid.InstanceIdResult) task.getResult();
            java.lang.String token = instanceIdResult == null ? null : instanceIdResult.getToken();
            if (token != null) {
                this$0.tokenSubject.onNext(token);
            }
        }
    }
}
