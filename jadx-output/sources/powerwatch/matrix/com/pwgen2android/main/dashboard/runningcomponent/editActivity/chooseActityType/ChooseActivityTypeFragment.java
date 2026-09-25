package powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType;

/* JADX INFO: compiled from: ChooseActivityTypeFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChooseActivityTypeFragment extends androidx.fragment.app.Fragment {
    private static final java.lang.String ACTIVITY_TYPES_DATA = "activityTypes";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment.Companion(null);

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "inflater");
        android.view.View viewInflate = inflater.inflate(powerwatch.matrix.com.pwgen2android.R.layout.fragment_choose_activity, container, false);
        powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar mainToolbar = viewInflate == null ? null : (powerwatch.matrix.com.pwgen2android.shared.ui.MainToolbar) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.main_toolbar);
        android.os.Bundle arguments = getArguments();
        final java.util.ArrayList parcelableArrayList = arguments != null ? arguments.getParcelableArrayList(ACTIVITY_TYPES_DATA) : null;
        if (parcelableArrayList == null) {
            throw new java.lang.IllegalArgumentException("List of activity types must be provided!");
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) viewInflate.findViewById(powerwatch.matrix.com.pwgen2android.R.id.activity_type_list);
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseItemRecyclerAdapter chooseItemRecyclerAdapter = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseItemRecyclerAdapter(parcelableArrayList, context, false, 4, null);
        chooseItemRecyclerAdapter.setClickListener(new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment.onCreateView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Integer num) {
                invoke(num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(int i) {
                int i2 = 0;
                for (java.lang.Object obj : parcelableArrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    ((powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView) obj).setChecked(i2 == i);
                    i2 = i3;
                }
                chooseItemRecyclerAdapter.notifyDataSetChanged();
            }
        });
        recyclerView.setAdapter(chooseItemRecyclerAdapter);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (mainToolbar != null) {
            java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.edit_activity_screen_title);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.edit_activity_screen_title)");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.title(mainToolbar, string);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.hideRightButton(mainToolbar);
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonText(mainToolbar, "");
            powerwatch.matrix.com.pwgen2android.shared.extensions.ToolbarViewExtensionsKt.backButtonClickListener(mainToolbar, new android.view.View.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.-$$Lambda$ChooseActivityTypeFragment$NB147vdJ0ISkEUt1urjoVb7k6p8
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment.m1890onCreateView$lambda1(this.f$0, chooseItemRecyclerAdapter, view);
                }
            });
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1890onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment this$0, powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseItemRecyclerAdapter adapter, android.view.View view) {
        java.lang.Object next;
        android.os.Bundle arguments;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "$adapter");
        androidx.fragment.app.FragmentManager fragmentManager = this$0.getFragmentManager();
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager == null ? null : fragmentManager.findFragmentByTag(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.class).getSimpleName());
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment editUserActivityFragment = fragmentFindFragmentByTag instanceof powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment ? (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment) fragmentFindFragmentByTag : null;
        java.util.Iterator<T> it = adapter.getItems().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView) next).getChecked());
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView uIChooseItemView = (powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView) next;
        java.lang.String name = uIChooseItemView != null ? uIChooseItemView.getName() : null;
        if (editUserActivityFragment != null && (arguments = editUserActivityFragment.getArguments()) != null) {
            arguments.putString(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.EditUserActivityFragment.SELECTED_ACTIVITY_TYPE, name);
        }
        androidx.fragment.app.FragmentManager fragmentManager2 = this$0.getFragmentManager();
        if (fragmentManager2 == null) {
            return;
        }
        fragmentManager2.popBackStack();
    }

    /* JADX INFO: compiled from: ChooseActivityTypeFragment.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment$Companion;", "", "()V", "ACTIVITY_TYPES_DATA", "", "newInstance", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/ChooseActivityTypeFragment;", powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment.ACTIVITY_TYPES_DATA, "Ljava/util/ArrayList;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;", "Lkotlin/collections/ArrayList;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment newInstance(java.util.ArrayList<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> activityTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTypes, "activityTypes");
            powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment chooseActivityTypeFragment = new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.ChooseActivityTypeFragment.ACTIVITY_TYPES_DATA, activityTypes);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            chooseActivityTypeFragment.setArguments(bundle);
            return chooseActivityTypeFragment;
        }
    }
}
