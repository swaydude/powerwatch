package powerwatch.matrix.com.pwgen2android.shared.ui.carouserView;

/* JADX INFO: compiled from: CarouselItemFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment;", "Landroidx/fragment/app/Fragment;", "()V", "imageArray", "", "screenHeight", "", "screenWidth", "getWidthAndHeight", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CarouselItemFragment extends androidx.fragment.app.Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselItemFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselItemFragment.Companion(null);
    private static final java.lang.String POSITON = "position";
    private static final java.lang.String SCALE = "scale";
    private final int[] imageArray = {powerwatch.matrix.com.pwgen2android.R.mipmap.watch1, powerwatch.matrix.com.pwgen2android.R.mipmap.watch2, powerwatch.matrix.com.pwgen2android.R.mipmap.watch3};
    private int screenHeight;
    private int screenWidth;

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWidthAndHeight();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (container == null) {
            return null;
        }
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.carousel_container, container, false);
        java.util.Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate;
        android.os.Bundle arguments = getArguments();
        int i = arguments == null ? 2 : arguments.getInt(POSITON);
        android.os.Bundle arguments2 = getArguments();
        float f = arguments2 == null ? 1.0f : arguments2.getFloat(SCALE);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.screenWidth / 2, this.screenHeight / 2);
        powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselLinearLayout carouselLinearLayout = (powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselLinearLayout) linearLayout.findViewById(powerwatch.matrix.com.pwgen2android.R.id.root_container);
        android.widget.ImageView imageView = (android.widget.ImageView) carouselLinearLayout.findViewById(powerwatch.matrix.com.pwgen2android.R.id.pagerImg);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(this.imageArray[i]);
        carouselLinearLayout.setScaleBoth(f);
        return linearLayout;
    }

    private final void getWidthAndHeight() {
        android.view.Display defaultDisplay;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        androidx.fragment.app.FragmentActivity activity = getActivity();
        android.view.WindowManager windowManager = activity == null ? null : activity.getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        this.screenHeight = displayMetrics.heightPixels;
        this.screenWidth = displayMetrics.widthPixels;
    }

    /* JADX INFO: compiled from: CarouselItemFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselItemFragment$Companion;", "", "()V", "POSITON", "", "SCALE", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "pos", "", "scale", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.fragment.app.Fragment newInstance(android.content.Context context, int pos, float scale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselItemFragment.POSITON, pos);
            bundle.putFloat(powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselItemFragment.SCALE, scale);
            androidx.fragment.app.Fragment fragmentInstantiate = androidx.fragment.app.Fragment.instantiate(context, powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselItemFragment.class.getName(), bundle);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "instantiate(context, CarouselItemFragment::class.java.name, b)");
            return fragmentInstantiate;
        }
    }
}
