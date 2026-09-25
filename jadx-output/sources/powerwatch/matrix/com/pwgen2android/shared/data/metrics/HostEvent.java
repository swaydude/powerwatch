package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: AppEvents.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;", "", "username", "", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "generatedDate", "", "(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class HostEvent {

    @com.google.gson.annotations.SerializedName("generatedDate")
    private final long generatedDate;

    @com.google.gson.annotations.SerializedName("host")
    private final powerwatch.matrix.com.pwgen2android.shared.host.Host host;

    @com.google.gson.annotations.SerializedName("username")
    private final java.lang.String username;

    public HostEvent(java.lang.String username, powerwatch.matrix.com.pwgen2android.shared.host.Host host, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        this.username = username;
        this.host = host;
        this.generatedDate = j;
    }
}
