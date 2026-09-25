package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control;

/* JADX INFO: compiled from: ControlViewViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\n\u0010\u0012\u001a\u00020\u0010*\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/control/ControlViewViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "runningAnimator", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;", "(Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimator;)V", "buttonIcon", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getButtonIcon", "()Landroidx/databinding/ObservableField;", "currentProgress", "getCurrentProgress", "isPlaying", "", "onAnimationFinished", "", "reset", "onPlayClicked", "Landroid/view/View;", "onProgressChanged", "Landroid/widget/SeekBar;", "progressValue", "fromUser", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ControlViewViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final androidx.databinding.ObservableField<java.lang.Integer> buttonIcon;
    private final androidx.databinding.ObservableField<java.lang.Integer> currentProgress;
    private boolean isPlaying;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPlayClicked$lambda-1, reason: not valid java name */
    public static final void m1866onPlayClicked$lambda1(java.lang.Throwable th) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlViewViewModel(powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningAnimator, "runningAnimator");
        this.runningAnimator = runningAnimator;
        this.currentProgress = new androidx.databinding.ObservableField<>(0);
        this.buttonIcon = new androidx.databinding.ObservableField<>(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.drawable.play));
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getCurrentProgress() {
        return this.currentProgress;
    }

    public final androidx.databinding.ObservableField<java.lang.Integer> getButtonIcon() {
        return this.buttonIcon;
    }

    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seekBar, "<this>");
        if (z) {
            this.currentProgress.set(java.lang.Integer.valueOf(i));
            android.util.Log.d("ProgressValue: ", java.lang.String.valueOf(i));
            if (this.isPlaying) {
                powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator = this.runningAnimator;
                java.lang.Integer num = this.currentProgress.get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                runningAnimator.start(num.intValue());
            }
        }
    }

    public final void onPlayClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        boolean z = !this.isPlaying;
        this.isPlaying = z;
        if (z) {
            this.buttonIcon.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.drawable.pause));
            getCompositeDisposable().add(this.runningAnimator.runningAnimationEvents().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.-$$Lambda$ControlViewViewModel$s8XFIVobYy_Ifmmzf0W1zY7uA9M
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel.m1865onPlayClicked$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.-$$Lambda$ControlViewViewModel$dWreEuV-JpOAwJj9VOK5oLejpmA
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel.m1866onPlayClicked$lambda1((java.lang.Throwable) obj);
                }
            }));
            powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimator runningAnimator = this.runningAnimator;
            java.lang.Integer num = this.currentProgress.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            runningAnimator.start(num.intValue());
            return;
        }
        this.buttonIcon.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.drawable.play));
        this.runningAnimator.pause();
        getCompositeDisposable().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPlayClicked$lambda-0, reason: not valid java name */
    public static final void m1865onPlayClicked$lambda0(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.control.ControlViewViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.ui.MapAnimationData mapAnimationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        int progress = mapAnimationData.getProgress();
        this$0.getCurrentProgress().set(java.lang.Integer.valueOf(progress));
        if (progress >= 100) {
            this$0.onAnimationFinished();
        }
    }

    private final void onAnimationFinished() {
        this.currentProgress.set(0);
        this.buttonIcon.set(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.R.drawable.play));
        this.isPlaying = false;
    }

    public final void reset() {
        onAnimationFinished();
    }
}
