package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerInput.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "Lorg/koin/core/KoinComponent;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Loggable extends org.koin.core.KoinComponent {

    /* JADX INFO: compiled from: PWLoggerInput.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static org.koin.core.Koin getKoin(powerwatch.matrix.com.pwgen2android.shared.logger.Loggable loggable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggable, "this");
            return org.koin.core.KoinComponent.DefaultImpls.getKoin(loggable);
        }
    }
}
