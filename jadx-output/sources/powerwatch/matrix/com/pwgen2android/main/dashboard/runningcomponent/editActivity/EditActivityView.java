package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity;

/* JADX INFO: compiled from: EditUserActivityViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/EditActivityView;", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "type", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "notes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLocation", "()Ljava/lang/String;", "getName", "getNotes", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class EditActivityView {
    private final java.lang.String location;
    private final java.lang.String name;
    private final java.lang.String notes;
    private final java.lang.String type;

    public EditActivityView() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView copy$default(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView editActivityView, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = editActivityView.name;
        }
        if ((i & 2) != 0) {
            str2 = editActivityView.type;
        }
        if ((i & 4) != 0) {
            str3 = editActivityView.location;
        }
        if ((i & 8) != 0) {
            str4 = editActivityView.notes;
        }
        return editActivityView.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getNotes() {
        return this.notes;
    }

    public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView copy(java.lang.String name, java.lang.String type, java.lang.String location, java.lang.String notes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notes, "notes");
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView(name, type, location, notes);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView editActivityView = (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditActivityView) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, editActivityView.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, editActivityView.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.location, editActivityView.location) && kotlin.jvm.internal.Intrinsics.areEqual(this.notes, editActivityView.notes);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.location.hashCode()) * 31) + this.notes.hashCode();
    }

    public java.lang.String toString() {
        return "EditActivityView(name=" + this.name + ", type=" + this.type + ", location=" + this.location + ", notes=" + this.notes + ')';
    }

    public EditActivityView(java.lang.String name, java.lang.String type, java.lang.String location, java.lang.String notes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notes, "notes");
        this.name = name;
        this.type = type;
        this.location = location;
        this.notes = notes;
    }

    public /* synthetic */ EditActivityView(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getLocation() {
        return this.location;
    }

    public final java.lang.String getNotes() {
        return this.notes;
    }
}
