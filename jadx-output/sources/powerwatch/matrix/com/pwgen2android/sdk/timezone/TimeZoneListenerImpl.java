package powerwatch.matrix.com.pwgen2android.sdk.timezone;

/* JADX INFO: compiled from: TimezoneListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListenerImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeZoneListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "timeZoneChangeSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;", "kotlin.jvm.PlatformType", "timeZoneReceiver", "Landroid/content/BroadcastReceiver;", "timeZoneChanged", "Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TimeZoneListenerImpl implements powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener {
    private final android.content.Context context;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason> timeZoneChangeSubject;
    private final android.content.BroadcastReceiver timeZoneReceiver;

    public TimeZoneListenerImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<ChangeReason>()");
        this.timeZoneChangeSubject = publishSubjectCreate;
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListenerImpl$timeZoneReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                if (kotlin.jvm.internal.Intrinsics.areEqual("android.intent.action.TIMEZONE_CHANGED", intent.getAction())) {
                    this.this$0.timeZoneChangeSubject.onNext(powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeZoneChange.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual("android.intent.action.TIME_SET", intent.getAction())) {
                    this.this$0.timeZoneChangeSubject.onNext(powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeChange.INSTANCE);
                }
            }
        };
        this.timeZoneReceiver = broadcastReceiver;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.timezone.TimeZoneListener
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason> timeZoneChanged() {
        return this.timeZoneChangeSubject;
    }
}
