package powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents;

/* JADX INFO: compiled from: BasePeriodsChartFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H$J*\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0002J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\bH\u0014J\u0016\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH$J\u0016\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH$J\u0016\u0010 \u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH$J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\"\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016R2\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0007j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;", "VIEWMODEL", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BaseChartPeriodsViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseFragment;", "Lpowerwatch/matrix/com/pwgen2android/databinding/FragmentActivityPeriodsBinding;", "()V", "fragmentMap", "Ljava/util/HashMap;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/charts/ChartFragment;", "Lkotlin/collections/HashMap;", "pager", "Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/LockableViewPager;", "configureToolbar", "", "rootView", "Landroid/view/View;", "fillHeader", "header", "Landroid/widget/LinearLayout;", "values", "", "Lkotlin/Pair;", "", "fillValue", "value", "viewID", "getBindingVariable", "getDayFragmentInstance", "config", "", "getMonthFragmentInstance", "getWeekFragmentInstance", "hideValue", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "PedometerPeriodPagerAdapter", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BasePeriodsChartFragment<VIEWMODEL extends powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel<?, ?, ?>> extends powerwatch.matrix.com.pwgen2android.shared.BaseFragment<powerwatch.matrix.com.pwgen2android.databinding.FragmentActivityPeriodsBinding, VIEWMODEL> {
    private final java.util.HashMap<java.lang.Integer, powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?>> fragmentMap = new java.util.HashMap<>();
    private powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager pager;

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    protected abstract void configureToolbar(android.view.View rootView);

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment
    protected int getBindingVariable() {
        return 1;
    }

    protected abstract powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> getDayFragmentInstance(java.lang.Object config);

    protected abstract powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> getMonthFragmentInstance(java.lang.Object config);

    protected abstract powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> getWeekFragmentInstance(java.lang.Object config);

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel access$getViewModel(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment basePeriodsChartFragment) {
        return (powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BaseChartPeriodsViewModel) basePeriodsChartFragment.getViewModel();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        final android.view.View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        kotlin.jvm.internal.Intrinsics.checkNotNull(viewOnCreateView);
        android.view.View viewFindViewById = viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.chart_pager);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.chart_pager)");
        powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager = (powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager) viewFindViewById;
        this.pager = lockableViewPager;
        if (lockableViewPager != null) {
            lockableViewPager.setSwipeLocked(true);
            powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager2 = this.pager;
            if (lockableViewPager2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("pager");
                throw null;
            }
            lockableViewPager2.setSwipeDetected(new kotlin.jvm.functions.Function1<powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection, kotlin.Unit>(this) { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.onCreateView.1
                final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection swipeDirection) {
                    invoke2(swipeDirection);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection swipeDirection) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swipeDirection, "swipeDirection");
                    if (swipeDirection instanceof powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection.SwipeRight) {
                        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).onPreviousItemClicked();
                    } else if (swipeDirection instanceof powerwatch.matrix.com.pwgen2android.shared.ui.views.SwipeDirection.SwipeLeft) {
                        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).onNextItemClicked();
                    }
                }
            });
            configureToolbar(viewOnCreateView);
            powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager3 = this.pager;
            if (lockableViewPager3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("pager");
                throw null;
            }
            lockableViewPager3.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener(this) { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.onCreateView.2
                final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> this$0;

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int state) {
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                {
                    this.this$0 = this;
                }

                @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                public void onPageSelected(int position) {
                    if (position == 0) {
                        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).onDayPeriodSelected();
                    } else if (position == 1) {
                        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).onWeekPeriodSelected();
                    } else {
                        if (position != 2) {
                            return;
                        }
                        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).onMonthPeriodSelected();
                    }
                }
            });
            getViewModel().getCurrentPeriodsConfiguration().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback(this) { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.onCreateView.3
                final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    kotlin.Triple triple = (kotlin.Triple) powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).getCurrentPeriodsConfiguration().get();
                    if (triple != null) {
                        if (!((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap.isEmpty()) {
                            powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment chartFragment = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment) ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap.get(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()));
                            powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment chartFragment2 = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment) ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap.get(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()));
                            powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment chartFragment3 = (powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment) ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap.get(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()));
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.header_layout);
                            if (linearLayout != null) {
                                powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> basePeriodsChartFragment = this.this$0;
                                java.lang.Integer num = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(basePeriodsChartFragment).getCurrentPeriodType().get();
                                kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                                if (num.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()) {
                                    basePeriodsChartFragment.fillHeader(linearLayout, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getFirst()).getHeaderValues());
                                } else {
                                    if (num.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()) {
                                        basePeriodsChartFragment.fillHeader(linearLayout, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getSecond()).getHeaderValues());
                                    } else {
                                        if (num.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()) {
                                            basePeriodsChartFragment.fillHeader(linearLayout, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getThird()).getHeaderValues());
                                        }
                                    }
                                }
                            }
                            if (chartFragment != null) {
                                chartFragment.setConfig(triple.getFirst());
                            }
                            if (chartFragment2 != null) {
                                chartFragment2.setConfig(triple.getSecond());
                            }
                            if (chartFragment3 == null) {
                                return;
                            }
                            chartFragment3.setConfig(triple.getThird());
                            return;
                        }
                        powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> dayFragmentInstance = this.this$0.getDayFragmentInstance(triple.getFirst());
                        powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> weekFragmentInstance = this.this$0.getWeekFragmentInstance(triple.getSecond());
                        powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartFragment<?> monthFragmentInstance = this.this$0.getMonthFragmentInstance(triple.getThird());
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewOnCreateView.findViewById(powerwatch.matrix.com.pwgen2android.R.id.header_layout);
                        if (linearLayout2 != null) {
                            powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> basePeriodsChartFragment2 = this.this$0;
                            java.lang.Integer num2 = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(basePeriodsChartFragment2).getCurrentPeriodType().get();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
                            if (num2.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()) {
                                basePeriodsChartFragment2.fillHeader(linearLayout2, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getFirst()).getHeaderValues());
                            } else {
                                if (num2.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()) {
                                    basePeriodsChartFragment2.fillHeader(linearLayout2, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getSecond()).getHeaderValues());
                                } else {
                                    if (num2.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()) {
                                        basePeriodsChartFragment2.fillHeader(linearLayout2, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getThird()).getHeaderValues());
                                    }
                                }
                            }
                        }
                        ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()), dayFragmentInstance);
                        ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()), weekFragmentInstance);
                        ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap.put(java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()), monthFragmentInstance);
                        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> basePeriodsChartFragment3 = this.this$0;
                        androidx.fragment.app.FragmentManager fragmentManager = basePeriodsChartFragment3.getFragmentManager();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(fragmentManager);
                        powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.PedometerPeriodPagerAdapter pedometerPeriodPagerAdapter = new powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.PedometerPeriodPagerAdapter(basePeriodsChartFragment3, fragmentManager, ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).fragmentMap);
                        powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager4 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).pager;
                        if (lockableViewPager4 != null) {
                            lockableViewPager4.setAdapter(pedometerPeriodPagerAdapter);
                        } else {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("pager");
                            throw null;
                        }
                    }
                }
            });
            getViewModel().getCurrentPeriodType().addOnPropertyChangedCallback(new androidx.databinding.Observable.OnPropertyChangedCallback(this) { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.onCreateView.4
                final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.databinding.Observable.OnPropertyChangedCallback
                public void onPropertyChanged(androidx.databinding.Observable sender, int propertyId) {
                    java.lang.Integer num = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).getCurrentPeriodType().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(num);
                    int iIntValue = num.intValue();
                    powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager4 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).pager;
                    if (lockableViewPager4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("pager");
                        throw null;
                    }
                    if (lockableViewPager4.getAdapter() != null) {
                        powerwatch.matrix.com.pwgen2android.shared.ui.views.LockableViewPager lockableViewPager5 = ((powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment) this.this$0).pager;
                        if (lockableViewPager5 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("pager");
                            throw null;
                        }
                        lockableViewPager5.setCurrentItem(iIntValue);
                    }
                    kotlin.Triple triple = (kotlin.Triple) powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(this.this$0).getCurrentPeriodsConfiguration().get();
                    if (triple == null) {
                        return;
                    }
                    android.view.View view = viewOnCreateView;
                    powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> basePeriodsChartFragment = this.this$0;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(powerwatch.matrix.com.pwgen2android.R.id.header_layout);
                    if (linearLayout == null) {
                        return;
                    }
                    java.lang.Integer num2 = powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment.access$getViewModel(basePeriodsChartFragment).getCurrentPeriodType().get();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
                    if (num2.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()) {
                        basePeriodsChartFragment.fillHeader(linearLayout, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getFirst()).getHeaderValues());
                        return;
                    }
                    if (num2.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()) {
                        basePeriodsChartFragment.fillHeader(linearLayout, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getSecond()).getHeaderValues());
                        return;
                    }
                    if (num2.intValue() == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal()) {
                        basePeriodsChartFragment.fillHeader(linearLayout, ((powerwatch.matrix.com.pwgen2android.shared.ui.charts.BaseChartConfig) triple.getThird()).getHeaderValues());
                    }
                }
            });
            VIEWMODEL viewModel = getViewModel();
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(context);
            viewModel.onCreateView(context);
            return viewOnCreateView;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("pager");
        throw null;
    }

    private final void fillValue(java.lang.String value, int viewID, android.view.View rootView) {
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(viewID);
        textView.setText(value);
        textView.setVisibility(0);
    }

    private final void hideValue(int viewID, android.view.View rootView) {
        ((android.widget.TextView) rootView.findViewById(viewID)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillHeader(android.widget.LinearLayout header, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> values) {
        android.widget.LinearLayout linearLayout = header;
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.first_header_value_title, linearLayout);
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.first_header_value_text, linearLayout);
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.second_header_value_title, linearLayout);
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.second_header_value_text, linearLayout);
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.third_header_value_title, linearLayout);
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.third_header_value_text, linearLayout);
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_title, linearLayout);
        hideValue(powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_text, linearLayout);
        int i = 0;
        for (java.lang.Object obj : values) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            if (i == 0) {
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.first_header_value_title, linearLayout);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.first_header_value_text, linearLayout);
            } else if (i == 1) {
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.second_header_value_title, linearLayout);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.second_header_value_text, linearLayout);
            } else if (i == 2) {
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.third_header_value_title, linearLayout);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.third_header_value_text, linearLayout);
            } else if (i == 3) {
                fillValue((java.lang.String) pair.getFirst(), powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_title, linearLayout);
                fillValue((java.lang.String) pair.getSecond(), powerwatch.matrix.com.pwgen2android.R.id.fourth_header_value_text, linearLayout);
            }
            i = i2;
        }
    }

    /* JADX INFO: compiled from: BasePeriodsChartFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment$PedometerPeriodPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "", "Landroidx/fragment/app/Fragment;", "(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/chartPeriodsComponents/BasePeriodsChartFragment;Landroidx/fragment/app/FragmentManager;Ljava/util/Map;)V", "getCount", "getItem", "position", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private final class PedometerPeriodPagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
        private final java.util.Map<java.lang.Integer, androidx.fragment.app.Fragment> fragments;
        final /* synthetic */ powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment<VIEWMODEL> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PedometerPeriodPagerAdapter(powerwatch.matrix.com.pwgen2android.main.dashboard.chartPeriodsComponents.BasePeriodsChartFragment this$0, androidx.fragment.app.FragmentManager fm, java.util.Map<java.lang.Integer, ? extends androidx.fragment.app.Fragment> fragments) {
            super(fm);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fm, "fm");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragments, "fragments");
            this.this$0 = this$0;
            this.fragments = fragments;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.fragments.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public androidx.fragment.app.Fragment getItem(int position) {
            if (position == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()) {
                return (androidx.fragment.app.Fragment) kotlin.collections.MapsKt.getValue(this.fragments, java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.DAY.ordinal()));
            }
            if (position == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()) {
                return (androidx.fragment.app.Fragment) kotlin.collections.MapsKt.getValue(this.fragments, java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.WEEK.ordinal()));
            }
            return position == powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal() ? (androidx.fragment.app.Fragment) kotlin.collections.MapsKt.getValue(this.fragments, java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.shared.ui.charts.ChartPeriodMode.MONTH.ordinal())) : (androidx.fragment.app.Fragment) kotlin.collections.MapsKt.getValue(this.fragments, 0);
        }
    }
}
