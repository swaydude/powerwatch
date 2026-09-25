package powerwatch.matrix.com.pwgen2android.ota;

/* JADX INFO: loaded from: classes2.dex */
public interface AmotaCallback {
    void connectingToDevice();

    void otaFailed(java.lang.String detail);

    void otaProcessStarted();

    void otaStarted();

    void otaSuccess();

    void progressUpdate(int progress);

    void sendFwDataState(boolean state);

    void sendVerifyState(boolean state);
}
