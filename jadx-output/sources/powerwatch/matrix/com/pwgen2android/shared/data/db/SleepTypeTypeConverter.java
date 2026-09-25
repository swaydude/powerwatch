package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: TypeConverters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/SleepTypeTypeConverter;", "", "()V", "fromSleepType", "", "sleepType", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;", "toSleepType", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SleepTypeTypeConverter {
    public final java.lang.String fromSleepType(powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        java.lang.String strName = sleepType.name();
        java.util.Objects.requireNonNull(strName, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = strName.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType toSleepType(java.lang.String sleepType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepType, "sleepType");
        return powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.valueOf(sleepType);
    }
}
