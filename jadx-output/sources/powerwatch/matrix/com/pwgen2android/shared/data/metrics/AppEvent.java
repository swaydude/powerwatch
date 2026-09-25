package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: AppEvents.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/AppEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/HostEvent;", "eventType", "", "eventDetails", "username", "host", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "date", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;J)V", "getDate", "()J", "getHost", "()Lpowerwatch/matrix/com/pwgen2android/shared/host/Host;", "getUsername", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AppEvent extends powerwatch.matrix.com.pwgen2android.shared.data.metrics.HostEvent {
    private final long date;

    @com.google.gson.annotations.SerializedName("eventDetails")
    private final java.lang.String eventDetails;

    @com.google.gson.annotations.SerializedName("eventType")
    private final java.lang.String eventType;
    private final powerwatch.matrix.com.pwgen2android.shared.host.Host host;
    private final java.lang.String username;

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final java.lang.String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final java.lang.String getEventDetails() {
        return this.eventDetails;
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent copy$default(powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent appEvent, java.lang.String str, java.lang.String str2, java.lang.String str3, powerwatch.matrix.com.pwgen2android.shared.host.Host host, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = appEvent.eventType;
        }
        if ((i & 2) != 0) {
            str2 = appEvent.eventDetails;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = appEvent.username;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            host = appEvent.host;
        }
        powerwatch.matrix.com.pwgen2android.shared.host.Host host2 = host;
        if ((i & 16) != 0) {
            j = appEvent.date;
        }
        return appEvent.copy(str, str4, str5, host2, j);
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.host.Host getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent copy(java.lang.String eventType, java.lang.String eventDetails, java.lang.String username, powerwatch.matrix.com.pwgen2android.shared.host.Host host, long date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDetails, "eventDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        return new powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent(eventType, eventDetails, username, host, date);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent appEvent = (powerwatch.matrix.com.pwgen2android.shared.data.metrics.AppEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.eventType, appEvent.eventType) && kotlin.jvm.internal.Intrinsics.areEqual(this.eventDetails, appEvent.eventDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.username, appEvent.username) && kotlin.jvm.internal.Intrinsics.areEqual(this.host, appEvent.host) && this.date == appEvent.date;
    }

    public int hashCode() {
        return (((((((this.eventType.hashCode() * 31) + this.eventDetails.hashCode()) * 31) + this.username.hashCode()) * 31) + this.host.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.date);
    }

    public java.lang.String toString() {
        return "AppEvent(eventType=" + this.eventType + ", eventDetails=" + this.eventDetails + ", username=" + this.username + ", host=" + this.host + ", date=" + this.date + ')';
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.Host getHost() {
        return this.host;
    }

    public final long getDate() {
        return this.date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppEvent(java.lang.String eventType, java.lang.String eventDetails, java.lang.String username, powerwatch.matrix.com.pwgen2android.shared.host.Host host, long j) {
        super(username, host, j);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventDetails, "eventDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        this.eventType = eventType;
        this.eventDetails = eventDetails;
        this.username = username;
        this.host = host;
        this.date = j;
    }
}
