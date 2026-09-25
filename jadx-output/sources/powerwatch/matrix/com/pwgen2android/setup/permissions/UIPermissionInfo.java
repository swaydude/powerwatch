package powerwatch.matrix.com.pwgen2android.setup.permissions;

/* JADX INFO: compiled from: PermissionInfoRecyclerAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u000bHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006%"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/UIPermissionInfo;", "", "permissionType", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "description", "checked", "", "clickable", io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_ICON_KEY, "", "(Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;Ljava/lang/String;Ljava/lang/String;ZZI)V", "getChecked", "()Z", "setChecked", "(Z)V", "getClickable", "setClickable", "getDescription", "()Ljava/lang/String;", "getIcon", "()I", "getPermissionType", "()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UIPermissionInfo {
    private boolean checked;
    private boolean clickable;
    private final java.lang.String description;
    private final int icon;
    private final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission permissionType;
    private final java.lang.String title;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo copy$default(powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo uIPermissionInfo, powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission appPermission, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            appPermission = uIPermissionInfo.permissionType;
        }
        if ((i2 & 2) != 0) {
            str = uIPermissionInfo.title;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = uIPermissionInfo.description;
        }
        java.lang.String str4 = str2;
        if ((i2 & 8) != 0) {
            z = uIPermissionInfo.checked;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = uIPermissionInfo.clickable;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            i = uIPermissionInfo.icon;
        }
        return uIPermissionInfo.copy(appPermission, str3, str4, z3, z4, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission getPermissionType() {
        return this.permissionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo copy(powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission permissionType, java.lang.String title, java.lang.String description, boolean checked, boolean clickable, int icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        return new powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo(permissionType, title, description, checked, clickable, icon);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo uIPermissionInfo = (powerwatch.matrix.com.pwgen2android.setup.permissions.UIPermissionInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.permissionType, uIPermissionInfo.permissionType) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, uIPermissionInfo.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, uIPermissionInfo.description) && this.checked == uIPermissionInfo.checked && this.clickable == uIPermissionInfo.clickable && this.icon == uIPermissionInfo.icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.permissionType.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        boolean z = this.checked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.clickable;
        return ((i + (z2 ? 1 : z2)) * 31) + this.icon;
    }

    public java.lang.String toString() {
        return "UIPermissionInfo(permissionType=" + this.permissionType + ", title=" + this.title + ", description=" + this.description + ", checked=" + this.checked + ", clickable=" + this.clickable + ", icon=" + this.icon + ')';
    }

    public UIPermissionInfo(powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission permissionType, java.lang.String title, java.lang.String description, boolean z, boolean z2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        this.permissionType = permissionType;
        this.title = title;
        this.description = description;
        this.checked = z;
        this.clickable = z2;
        this.icon = i;
    }

    public /* synthetic */ UIPermissionInfo(powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission appPermission, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(appPermission, str, str2, z, (i2 & 16) != 0 ? true : z2, i);
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission getPermissionType() {
        return this.permissionType;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public final void setClickable(boolean z) {
        this.clickable = z;
    }
}
