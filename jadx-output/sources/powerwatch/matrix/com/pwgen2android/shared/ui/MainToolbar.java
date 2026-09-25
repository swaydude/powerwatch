package powerwatch.matrix.com.pwgen2android.shared.ui;

/* JADX INFO: compiled from: toolbars.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/MainToolbar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rightButton", "Landroid/widget/TextView;", "getRightButton", "()Landroid/widget/TextView;", "rightButton$delegate", "Lkotlin/Lazy;", "rightProgress", "Landroid/widget/ProgressBar;", "getRightProgress", "()Landroid/widget/ProgressBar;", "rightProgress$delegate", "hideRightProgress", "", "showRightProgress", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MainToolbar extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: rightButton$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy rightButton;

    /* JADX INFO: renamed from: rightProgress$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy rightProgress;

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainToolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.rightButton = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.widget.TextView>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar$rightButton$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.widget.TextView invoke() {
                return (android.widget.TextView) this.this$0.findViewById(powerwatch.matrix.com.pwgen2android.R.id.right_button);
            }
        });
        this.rightProgress = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<android.widget.ProgressBar>() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar$rightProgress$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final android.widget.ProgressBar invoke() {
                return (android.widget.ProgressBar) this.this$0.findViewById(powerwatch.matrix.com.pwgen2android.R.id.right_progress);
            }
        });
    }

    private final android.widget.TextView getRightButton() {
        java.lang.Object value = this.rightButton.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "<get-rightButton>(...)");
        return (android.widget.TextView) value;
    }

    private final android.widget.ProgressBar getRightProgress() {
        java.lang.Object value = this.rightProgress.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "<get-rightProgress>(...)");
        return (android.widget.ProgressBar) value;
    }

    public final void showRightProgress() {
        getRightButton().setVisibility(8);
        getRightProgress().setVisibility(0);
    }

    public final void hideRightProgress() {
        getRightButton().setVisibility(0);
        getRightProgress().setVisibility(8);
    }
}
