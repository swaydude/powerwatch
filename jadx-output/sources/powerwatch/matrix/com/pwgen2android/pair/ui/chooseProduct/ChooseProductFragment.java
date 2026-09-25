package powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct;

/* JADX INFO: compiled from: ChooseProductFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentChooseProductBinding;", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;", "()V", "chooseProductViewModel", "getChooseProductViewModel", "()Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;", "chooseProductViewModel$delegate", "Lkotlin/Lazy;", "productsViewPager", "Landroidx/viewpager/widget/ViewPager;", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "getBindingVariable", "", "getViewModel", "layoutRes", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "WatchPagerAdapter", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChooseProductFragment extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentChooseProductBinding, powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.Companion(null);

    /* JADX INFO: renamed from: chooseProductViewModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy chooseProductViewModel;
    private androidx.viewpager.widget.ViewPager productsViewPager;
    private com.tbruyelle.rxpermissions2.RxPermissions rxPermissions;

    @kotlin.jvm.JvmStatic
    public static final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int layoutRes() {
        return powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_product;
    }

    public ChooseProductFragment() {
        final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment chooseProductFragment = this;
        final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = new kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment$chooseProductViewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final org.koin.core.parameter.DefinitionParameters invoke() {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = this.this$0.getActivity();
                androidx.fragment.app.FragmentActivity activity = this.this$0.getActivity();
                objArr[1] = activity == null ? null : activity.getSupportFragmentManager();
                objArr[2] = this.this$0;
                return org.koin.core.parameter.DefinitionParametersKt.parametersOf(objArr);
            }
        };
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        this.chooseProductViewModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.LifecycleOwnerExtKt.getViewModel(chooseProductFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel.class), qualifier, function0);
            }
        });
    }

    private final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel getChooseProductViewModel() {
        return (powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel) this.chooseProductViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductViewModel getViewModel() {
        return getChooseProductViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        android.widget.Button button;
        android.widget.Button button2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        setRootView(super.onCreateView(inflater, container, savedInstanceState));
        this.rxPermissions = new com.tbruyelle.rxpermissions2.RxPermissions(requireActivity());
        getChooseProductViewModel().setBtRequestCallback(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.onCreateView.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                android.widget.Toast.makeText(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.this.requireContext(), powerwatch.matrix.com.pwgen2android.R.string.enable_bt_permission, 1).show();
            }
        });
        android.view.View rootView = getRootView();
        if (rootView != null && (button2 = (android.widget.Button) rootView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.back_button)) != null) {
            button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductFragment$t-KTIO4yALYX1QVq3sR28a5zYcQ
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.m2024onCreateView$lambda0(this.f$0, view);
                }
            });
        }
        android.view.View rootView2 = getRootView();
        android.widget.RadioGroup radioGroup = rootView2 == null ? null : (android.widget.RadioGroup) rootView2.findViewById(powerwatch.matrix.com.pwgen2android.R.id.radio_group);
        kotlin.jvm.internal.Intrinsics.checkNotNull(radioGroup);
        android.view.View rootView3 = getRootView();
        androidx.viewpager.widget.ViewPager viewPager = rootView3 == null ? null : (androidx.viewpager.widget.ViewPager) rootView3.findViewById(powerwatch.matrix.com.pwgen2android.R.id.products_view_pager);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewPager);
        this.productsViewPager = viewPager;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.WatchPagerAdapter watchPagerAdapter = new powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.WatchPagerAdapter(childFragmentManager, radioGroup);
        androidx.viewpager.widget.ViewPager viewPager2 = this.productsViewPager;
        if (viewPager2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("productsViewPager");
            throw null;
        }
        viewPager2.setAdapter(watchPagerAdapter);
        androidx.viewpager.widget.ViewPager viewPager3 = this.productsViewPager;
        if (viewPager3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("productsViewPager");
            throw null;
        }
        viewPager3.addOnPageChangeListener(watchPagerAdapter);
        android.view.View rootView4 = getRootView();
        android.widget.TextView textView = rootView4 != null ? (android.widget.TextView) rootView4.findViewById(powerwatch.matrix.com.pwgen2android.R.id.screen_title) : null;
        if (textView != null) {
            textView.setText(getString(powerwatch.matrix.com.pwgen2android.R.string.choose_product_screen_title));
        }
        android.view.View rootView5 = getRootView();
        if (rootView5 != null && (button = (android.widget.Button) rootView5.findViewById(powerwatch.matrix.com.pwgen2android.R.id.button_choose_watch)) != null) {
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.-$$Lambda$ChooseProductFragment$GbPEVCmyWMVnAxJL20jKrODQ0N0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.m2025onCreateView$lambda2(watchPagerAdapter, this, view);
                }
            });
        }
        return getRootView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2024onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getChooseProductViewModel().onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m2025onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.WatchPagerAdapter pagerAdapter, powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment this$0, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagerAdapter, "$pagerAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.List<powerwatch.matrix.com.pwgen2android.shared.WatchProduct> products = pagerAdapter.getProducts();
        androidx.viewpager.widget.ViewPager viewPager = this$0.productsViewPager;
        if (viewPager == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("productsViewPager");
            throw null;
        }
        int currentItem = viewPager.getCurrentItem();
        this$0.getChooseProductViewModel().onProductChosen((currentItem < 0 || currentItem > kotlin.collections.CollectionsKt.getLastIndex(products)) ? powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatch2.INSTANCE : products.get(currentItem));
    }

    /* JADX INFO: compiled from: ChooseProductFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J \u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$WatchPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "fm", "Landroidx/fragment/app/FragmentManager;", "radioGroup", "Landroid/widget/RadioGroup;", "(Landroidx/fragment/app/FragmentManager;Landroid/widget/RadioGroup;)V", "products", "", "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "onPageScrollStateChanged", "", "state", "onPageScrolled", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WatchPagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        private java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.WatchProduct> products;
        private final android.widget.RadioGroup radioGroup;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int state) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WatchPagerAdapter(androidx.fragment.app.FragmentManager fm, android.widget.RadioGroup radioGroup) {
            super(fm, 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "fm");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(radioGroup, "radioGroup");
            this.radioGroup = radioGroup;
            this.products = kotlin.collections.CollectionsKt.listOf(powerwatch.matrix.com.pwgen2android.shared.WatchProduct.PowerWatch2.INSTANCE);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            android.widget.RadioGroup radioGroup = this.radioGroup;
            radioGroup.check(radioGroup.getChildAt(position).getId());
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.products.size();
        }

        public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.WatchProduct> getProducts() {
            return this.products;
        }

        public final void setProducts(java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.WatchProduct> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.products = list;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public androidx.fragment.app.Fragment getItem(int position) {
            return powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.WatchProductFragment.INSTANCE.newInstance(this.products.get(position));
        }
    }

    /* JADX INFO: compiled from: ChooseProductFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment$Companion;", "", "()V", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductFragment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment newInstance() {
            return new powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment();
        }
    }
}
