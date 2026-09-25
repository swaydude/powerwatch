package powerwatch.matrix.com.pwgen2android.report.ui.bridge;

/* JADX INFO: compiled from: ReportIssueViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0017\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u0001¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/ui/bridge/Envelope;", "", "envelopeType", "", "payload", "(Ljava/lang/String;Ljava/lang/Object;)V", "getEnvelopeType", "()Ljava/lang/String;", "getPayload", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "extractPayload", "T", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Envelope {
    private final java.lang.String envelopeType;
    private final java.lang.Object payload;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope copy$default(powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope envelope, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = envelope.envelopeType;
        }
        if ((i & 2) != 0) {
            obj = envelope.payload;
        }
        return envelope.copy(str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getEnvelopeType() {
        return this.envelopeType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Object getPayload() {
        return this.payload;
    }

    public final powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope copy(java.lang.String envelopeType, java.lang.Object payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(envelopeType, "envelopeType");
        return new powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope(envelopeType, payload);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope envelope = (powerwatch.matrix.com.pwgen2android.report.ui.bridge.Envelope) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.envelopeType, envelope.envelopeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.payload, envelope.payload);
    }

    public int hashCode() {
        int iHashCode = this.envelopeType.hashCode() * 31;
        java.lang.Object obj = this.payload;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "Envelope(envelopeType=" + this.envelopeType + ", payload=" + this.payload + ')';
    }

    public Envelope(java.lang.String envelopeType, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(envelopeType, "envelopeType");
        this.envelopeType = envelopeType;
        this.payload = obj;
    }

    public /* synthetic */ Envelope(java.lang.String str, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj);
    }

    public final java.lang.String getEnvelopeType() {
        return this.envelopeType;
    }

    public final java.lang.Object getPayload() {
        return this.payload;
    }

    public final <T> T extractPayload() {
        T t = (T) this.payload;
        if (t != null) {
            return t;
        }
        return null;
    }
}
