package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: ProtocolCreator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001b\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003HÆ\u0003J%\u0010\n\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;", "", "services", "", "Ljava/util/UUID;", "", "(Ljava/util/Map;)V", "getServices", "()Ljava/util/Map;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class BleCreatorConfig {
    private final java.util.Map<java.util.UUID, java.util.Set<java.util.UUID>> services;

    /* JADX WARN: Multi-variable type inference failed */
    public BleCreatorConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig bleCreatorConfig, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = bleCreatorConfig.services;
        }
        return bleCreatorConfig.copy(map);
    }

    public final java.util.Map<java.util.UUID, java.util.Set<java.util.UUID>> component1() {
        return this.services;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig copy(java.util.Map<java.util.UUID, ? extends java.util.Set<java.util.UUID>> services) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(services, "services");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig(services);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.services, ((powerwatch.matrix.com.pwgen2android.sdk.protocol.BleCreatorConfig) other).services);
    }

    public int hashCode() {
        return this.services.hashCode();
    }

    public java.lang.String toString() {
        return "BleCreatorConfig(services=" + this.services + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleCreatorConfig(java.util.Map<java.util.UUID, ? extends java.util.Set<java.util.UUID>> services) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(services, "services");
        this.services = services;
    }

    public /* synthetic */ BleCreatorConfig(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.util.UUID, java.util.Set<java.util.UUID>> getServices() {
        return this.services;
    }
}
