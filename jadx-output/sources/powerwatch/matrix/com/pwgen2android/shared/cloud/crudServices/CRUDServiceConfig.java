package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "", "getEndpoint", "", "addEndpoint", "updateEndpoint", "getAllEndpoint", "deleteEndpoint", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddEndpoint", "()Ljava/lang/String;", "getDeleteEndpoint", "getGetAllEndpoint", "getGetEndpoint", "getUpdateEndpoint", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CRUDServiceConfig {
    private final java.lang.String addEndpoint;
    private final java.lang.String deleteEndpoint;
    private final java.lang.String getAllEndpoint;
    private final java.lang.String getEndpoint;
    private final java.lang.String updateEndpoint;

    public CRUDServiceConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig cRUDServiceConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cRUDServiceConfig.getEndpoint;
        }
        if ((i & 2) != 0) {
            str2 = cRUDServiceConfig.addEndpoint;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cRUDServiceConfig.updateEndpoint;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cRUDServiceConfig.getAllEndpoint;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cRUDServiceConfig.deleteEndpoint;
        }
        return cRUDServiceConfig.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getGetEndpoint() {
        return this.getEndpoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getAddEndpoint() {
        return this.addEndpoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getUpdateEndpoint() {
        return this.updateEndpoint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getGetAllEndpoint() {
        return this.getAllEndpoint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getDeleteEndpoint() {
        return this.deleteEndpoint;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig copy(java.lang.String getEndpoint, java.lang.String addEndpoint, java.lang.String updateEndpoint, java.lang.String getAllEndpoint, java.lang.String deleteEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEndpoint, "getEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEndpoint, "addEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateEndpoint, "updateEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllEndpoint, "getAllEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteEndpoint, "deleteEndpoint");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig(getEndpoint, addEndpoint, updateEndpoint, getAllEndpoint, deleteEndpoint);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig cRUDServiceConfig = (powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getEndpoint, cRUDServiceConfig.getEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.addEndpoint, cRUDServiceConfig.addEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateEndpoint, cRUDServiceConfig.updateEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.getAllEndpoint, cRUDServiceConfig.getAllEndpoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.deleteEndpoint, cRUDServiceConfig.deleteEndpoint);
    }

    public int hashCode() {
        return (((((((this.getEndpoint.hashCode() * 31) + this.addEndpoint.hashCode()) * 31) + this.updateEndpoint.hashCode()) * 31) + this.getAllEndpoint.hashCode()) * 31) + this.deleteEndpoint.hashCode();
    }

    public java.lang.String toString() {
        return "CRUDServiceConfig(getEndpoint=" + this.getEndpoint + ", addEndpoint=" + this.addEndpoint + ", updateEndpoint=" + this.updateEndpoint + ", getAllEndpoint=" + this.getAllEndpoint + ", deleteEndpoint=" + this.deleteEndpoint + ')';
    }

    public CRUDServiceConfig(java.lang.String getEndpoint, java.lang.String addEndpoint, java.lang.String updateEndpoint, java.lang.String getAllEndpoint, java.lang.String deleteEndpoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEndpoint, "getEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEndpoint, "addEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateEndpoint, "updateEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAllEndpoint, "getAllEndpoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteEndpoint, "deleteEndpoint");
        this.getEndpoint = getEndpoint;
        this.addEndpoint = addEndpoint;
        this.updateEndpoint = updateEndpoint;
        this.getAllEndpoint = getAllEndpoint;
        this.deleteEndpoint = deleteEndpoint;
    }

    public /* synthetic */ CRUDServiceConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public final java.lang.String getGetEndpoint() {
        return this.getEndpoint;
    }

    public final java.lang.String getAddEndpoint() {
        return this.addEndpoint;
    }

    public final java.lang.String getUpdateEndpoint() {
        return this.updateEndpoint;
    }

    public final java.lang.String getGetAllEndpoint() {
        return this.getAllEndpoint;
    }

    public final java.lang.String getDeleteEndpoint() {
        return this.deleteEndpoint;
    }
}
