package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: NavigationExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a0\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u001a \u0010\u000f\u001a\u00020\u0006*\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n\u001a\n\u0010\u0012\u001a\u00020\u0004*\u00020\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0006*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\f\u001a\u0014\u0010\u0019\u001a\u00020\u0006*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a\u0014\u0010\u001a\u001a\u00020\u0006*\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a\n\u0010\u001b\u001a\u00020\u0006*\u00020\u0007¨\u0006\u001c"}, d2 = {"getFragmentsToPush", "", "Landroidx/fragment/app/Fragment;", "className", "", "addFragment", "", "Landroidx/fragment/app/FragmentManager;", "fragment", "fragmentContainer", "", "toBackStack", "", "animation", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;", "fillBackStack", "fragments", "containerID", "getNavigation", "Landroid/content/Intent;", "goToMainActivity", "Landroid/app/Activity;", "navigateToFragment", "Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;", "clearStack", "goToPairingActivity", "goToSetupActivity", "popBackStackAllowingStateLoss", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class NavigationExtensionsKt {
    public static /* synthetic */ void addFragment$default(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, int i, boolean z, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType navigationType, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            navigationType = powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Default.INSTANCE;
        }
        addFragment(fragmentManager, fragment, i, z, navigationType);
    }

    public static final void addFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, int i, boolean z, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType navigationType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.fragment.app.Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(i);
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        if (navigationType != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(navigationType, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Default.INSTANCE)) {
                fragmentTransactionBeginTransaction.setTransition(4097);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(navigationType, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE)) {
                fragmentTransactionBeginTransaction.setCustomAnimations(powerwatch.matrix.com.pwgen2android.R.anim.enter_from_right, powerwatch.matrix.com.pwgen2android.R.anim.exit_to_left, powerwatch.matrix.com.pwgen2android.R.anim.enter_from_left, powerwatch.matrix.com.pwgen2android.R.anim.exit_to_right);
            }
        }
        if (fragmentFindFragmentById == null) {
            fragmentTransactionBeginTransaction.add(i, fragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(fragment.getClass()).getSimpleName());
        } else {
            fragmentTransactionBeginTransaction.replace(i, fragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(fragment.getClass()).getSimpleName());
        }
        if (z) {
            fragmentTransactionBeginTransaction.addToBackStack(null);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static final void fillBackStack(androidx.fragment.app.FragmentManager fragmentManager, java.util.List<? extends androidx.fragment.app.Fragment> fragments, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragments, "fragments");
        int size = fragments.size();
        int i2 = 0;
        for (java.lang.Object obj : fragments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
            if (i2 == fragments.size() - 1) {
                addFragment$default(fragmentManager, fragment, i, size != 1, null, 8, null);
            } else if (i2 == 0) {
                addFragment(fragmentManager, fragment, i, false, null);
            } else {
                addFragment(fragmentManager, fragment, i, true, null);
            }
            i2 = i3;
        }
    }

    public static final java.util.List<androidx.fragment.app.Fragment> getFragmentsToPush(java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        if (kotlin.jvm.internal.Intrinsics.areEqual(className, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment.class).getSimpleName())) {
            return kotlin.collections.CollectionsKt.listOf(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment.INSTANCE.newInstance());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(className, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment.class).getSimpleName())) {
            return kotlin.collections.CollectionsKt.listOf(powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment.INSTANCE.newInstance());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(className, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.class).getSimpleName())) {
            return kotlin.collections.CollectionsKt.listOf(powerwatch.matrix.com.pwgen2android.main.dashboard.calendar.CalendarFragment.INSTANCE.newInstance());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(className, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenFragment.class).getSimpleName())) {
            return kotlin.collections.CollectionsKt.listOf(powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenFragment.INSTANCE.newInstance());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(className, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.class).getSimpleName())) {
            return kotlin.collections.CollectionsKt.listOf(powerwatch.matrix.com.pwgen2android.pair.ui.chooseProduct.ChooseProductFragment.INSTANCE.newInstance());
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static /* synthetic */ void goToSetupActivity$default(android.app.Activity activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment navigationFragment, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navigationFragment = powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.None.INSTANCE;
        }
        goToSetupActivity(activity, navigationFragment);
    }

    public static final void goToSetupActivity(android.app.Activity activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment navigateToFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigateToFragment, "navigateToFragment");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.setup.SetupActivity.class);
        intent.putExtra("navigateTo", navigateToFragment.getClassName());
        activity.startActivity(intent);
    }

    public static /* synthetic */ void goToMainActivity$default(android.app.Activity activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment navigationFragment, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navigationFragment = powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.None.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        goToMainActivity(activity, navigationFragment, z);
    }

    public static final void goToMainActivity(android.app.Activity activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment navigateToFragment, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigateToFragment, "navigateToFragment");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.main.MainActivity.class);
        if (z) {
            intent.addFlags(67108864);
        }
        intent.putExtra("navigateTo", navigateToFragment.getClassName());
        activity.startActivity(intent);
    }

    public static /* synthetic */ void goToPairingActivity$default(android.app.Activity activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment navigationFragment, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            navigationFragment = powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.None.INSTANCE;
        }
        goToPairingActivity(activity, navigationFragment);
    }

    public static final void goToPairingActivity(android.app.Activity activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment navigateToFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigateToFragment, "navigateToFragment");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.pair.PairingActivity.class);
        intent.putExtra("navigateTo", navigateToFragment.getClassName());
        activity.startActivity(intent);
    }

    public static final java.lang.String getNavigation(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
        java.lang.String stringExtra = intent.getStringExtra("navigateTo");
        return stringExtra == null ? powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.None.INSTANCE.getClassName() : stringExtra;
    }

    public static final void popBackStackAllowingStateLoss(androidx.fragment.app.FragmentManager fragmentManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        try {
            fragmentManager.popBackStack();
        } catch (java.lang.IllegalStateException unused) {
        }
    }
}
