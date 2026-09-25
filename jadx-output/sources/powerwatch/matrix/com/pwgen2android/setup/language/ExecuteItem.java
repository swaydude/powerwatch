package powerwatch.matrix.com.pwgen2android.setup.language;

/* JADX INFO: compiled from: ItemExecutorDelegate.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/language/ExecuteItem;", "", "id", "", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;", "(ILpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)V", "getId", "()I", "getType", "()Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ExecuteItem {
    private final int id;
    private final powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem copy$default(powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem executeItem, int i, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType supportedType, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = executeItem.id;
        }
        if ((i2 & 2) != 0) {
            supportedType = executeItem.type;
        }
        return executeItem.copy(i, supportedType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.setup.language.SupportedType getType() {
        return this.type;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem copy(int id, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return new powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem(id, type);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem executeItem = (powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem) other;
        return this.id == executeItem.id && kotlin.jvm.internal.Intrinsics.areEqual(this.type, executeItem.type);
    }

    public int hashCode() {
        return (this.id * 31) + this.type.hashCode();
    }

    public java.lang.String toString() {
        return "ExecuteItem(id=" + this.id + ", type=" + this.type + ')';
    }

    public ExecuteItem(int i, powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.id = i;
        this.type = type;
    }

    public final int getId() {
        return this.id;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.language.SupportedType getType() {
        return this.type;
    }
}
