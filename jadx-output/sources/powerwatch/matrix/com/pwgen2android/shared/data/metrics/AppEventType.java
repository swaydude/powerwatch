package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: AppEvents.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;", "", "eventType", "", "(Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "LoginEvent", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType$LoginEvent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AppEventType {
    private final java.lang.String eventType;

    public /* synthetic */ AppEventType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: AppEvents.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType$LoginEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEventType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LoginEvent extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEventType {
        public static final powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEventType.LoginEvent INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEventType.LoginEvent();

        private LoginEvent() {
            super("LOGIN", null);
        }
    }

    private AppEventType(java.lang.String str) {
        this.eventType = str;
    }

    public final java.lang.String getEventType() {
        return this.eventType;
    }
}
