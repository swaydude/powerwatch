package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: FCMContentExtractor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/FCMContentExtractor;", "", "extractContentData", "", "messageBodyData", "", "extractNotificationBody", "extractNotificationTitle", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface FCMContentExtractor {
    java.lang.String extractContentData(java.util.Map<java.lang.String, java.lang.String> messageBodyData);

    java.lang.String extractNotificationBody(java.util.Map<java.lang.String, java.lang.String> messageBodyData);

    java.lang.String extractNotificationTitle(java.util.Map<java.lang.String, java.lang.String> messageBodyData);
}
