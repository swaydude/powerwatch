package powerwatch.matrix.com.pwgen2android.ota;

/* JADX INFO: loaded from: classes2.dex */
public interface OTACommunicator {
    io.reactivex.Observable<byte[]> receivedData();

    void sendMessage(java.lang.String deviceId, byte[] data);
}
