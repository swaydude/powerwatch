package powerwatch.matrix.com.pwgen2android.shared.ui.carouserView;

/* JADX INFO: compiled from: CarouselPagerAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0016J \u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "pagerID", "", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "scale", "", "getCount", "getFragmentTag", "", "position", "getItem", "Landroidx/fragment/app/Fragment;", "getRootView", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselLinearLayout;", "onPageScrollStateChanged", "", "state", "onPageScrolled", "positionOffset", "positionOffsetPixels", "onPageSelected", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CarouselPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    private final android.content.Context context;
    private final androidx.fragment.app.FragmentManager fragmentManager;
    private final int pagerID;
    private float scale;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselPagerAdapter.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselPagerAdapter.Companion(null);
    private static final float BIG_SCALE = 1.0f;
    private static final float SMALL_SCALE = 0.7f;
    private static final float DIFF_SCALE = 1.0f - 0.7f;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 3;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselPagerAdapter(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.pagerID = i;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public androidx.fragment.app.Fragment getItem(int position) {
        float f;
        try {
            if (position == 1) {
                f = BIG_SCALE;
            } else {
                f = SMALL_SCALE;
            }
            this.scale = f;
            position %= 3;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselItemFragment.INSTANCE.newInstance(this.context, position, this.scale);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        boolean z = false;
        if (0.0f <= positionOffset && positionOffset <= 1.0f) {
            z = true;
        }
        if (z) {
            try {
                powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselLinearLayout rootView = getRootView(position);
                powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselLinearLayout rootView2 = getRootView(position + 1);
                float f = BIG_SCALE;
                float f2 = DIFF_SCALE;
                rootView.setScaleBoth(f - (f2 * positionOffset));
                rootView2.setScaleBoth(SMALL_SCALE + (f2 * positionOffset));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselLinearLayout getRootView(int position) {
        android.view.View view;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.fragmentManager.findFragmentByTag(getFragmentTag(position));
        powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselLinearLayout carouselLinearLayout = null;
        if (fragmentFindFragmentByTag != null && (view = fragmentFindFragmentByTag.getView()) != null) {
            carouselLinearLayout = (powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselLinearLayout) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.root_container);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(carouselLinearLayout);
        return carouselLinearLayout;
    }

    private final java.lang.String getFragmentTag(int position) {
        return "android:switcher:" + this.pagerID + ':' + position;
    }

    /* JADX INFO: compiled from: CarouselPagerAdapter.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/carouserView/CarouselPagerAdapter$Companion;", "", "()V", "BIG_SCALE", "", "getBIG_SCALE", "()F", "DIFF_SCALE", "getDIFF_SCALE", "SMALL_SCALE", "getSMALL_SCALE", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final float getBIG_SCALE() {
            return powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselPagerAdapter.BIG_SCALE;
        }

        public final float getSMALL_SCALE() {
            return powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselPagerAdapter.SMALL_SCALE;
        }

        public final float getDIFF_SCALE() {
            return powerwatch.matrix.com.pwgen2android.shared.ui.carouserView.CarouselPagerAdapter.DIFF_SCALE;
        }
    }
}
