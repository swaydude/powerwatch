package powerwatch.matrix.com.pwgen2android.setup.biometrics;

/* JADX INFO: compiled from: BiometricsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"position", "", "view", "Lcom/super_rabbit/wheel_picker/WheelPicker;", "value", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class BiometricsViewModelKt {
    @androidx.databinding.BindingAdapter({"android:wheelPosition"})
    public static final void position(com.super_rabbit.wheel_picker.WheelPicker view, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        view.scrollToValue(value);
    }
}
