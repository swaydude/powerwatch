package powerwatch.matrix.com.pwgen2android.sdk.channels.stream;

/* JADX INFO: compiled from: ChannelStream.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;", "", "appendData", "", "data", "", "clearMessages", "destroy", "extractMessages", "getMessageList", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ChannelStream {
    void appendData(byte[] data);

    void clearMessages();

    void destroy();

    void extractMessages();

    java.util.List<byte[]> getMessageList();
}
