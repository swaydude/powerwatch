package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control;

/* JADX INFO: compiled from: ControlViewViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"setImageUri", "", "view", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "id", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ControlViewViewModelKt {
    @androidx.databinding.BindingAdapter({"android:floatingIcon"})
    public static final void setImageUri(com.google.android.material.floatingactionbutton.FloatingActionButton view, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        view.setImageResource(i);
    }
}
