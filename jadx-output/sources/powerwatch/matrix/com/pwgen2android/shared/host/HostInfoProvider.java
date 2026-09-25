package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: HostInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "", "hostInfo", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "fillAdditionalInfo", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface HostInfoProvider {
    powerwatch.matrix.com.pwgen2android.shared.host.Host hostInfo(boolean fillAdditionalInfo);

    /* JADX INFO: compiled from: HostInfoProvider.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.host.Host hostInfo$default(powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hostInfo");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return hostInfoProvider.hostInfo(z);
        }
    }
}
