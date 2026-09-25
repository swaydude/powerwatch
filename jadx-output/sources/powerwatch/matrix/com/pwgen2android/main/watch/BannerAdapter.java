package powerwatch.matrix.com.pwgen2android.main.watch;

/* JADX INFO: compiled from: BannerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/BannerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BannerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdapter(androidx.fragment.app.FragmentManager fm) {
        super(fm, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "fm");
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public androidx.fragment.app.Fragment getItem(int position) {
        return powerwatch.matrix.com.pwgen2android.main.watch.BannerFragment.INSTANCE.newInstance();
    }
}
