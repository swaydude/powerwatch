package powerwatch.matrix.com.pwgen2android.fcm.messages;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MessageEnvelope implements android.os.Parcelable {
    protected java.lang.String mMessageType;

    public java.lang.String getMessageType() {
        return this.mMessageType;
    }

    public void setMessageType(java.lang.String mMessageType) {
        this.mMessageType = mMessageType;
    }
}
