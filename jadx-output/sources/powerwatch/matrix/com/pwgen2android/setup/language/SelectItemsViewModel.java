package powerwatch.matrix.com.pwgen2android.setup.language;

/* JADX INFO: compiled from: SelectItemsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020#J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0004H\u0016J\u000e\u0010-\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0004R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00060\u00060\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006."}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/language/SelectItemsViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "settingsDisplayValueLoader", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;", "itemExecutorDelegate", "Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "savePreferencesViewModel", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/language/SettingsDisplayValueLoader;Lpowerwatch/matrix/com/pwgen2android/setup/language/ItemExecutorDelegate;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "activeValue", "", "getActiveValue", "()Ljava/lang/Byte;", "setActiveValue", "(Ljava/lang/Byte;)V", "Ljava/lang/Byte;", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "items", "Landroidx/databinding/ObservableField;", "", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;", "getItems", "()Landroidx/databinding/ObservableField;", "showSaveProgress", "", "getShowSaveProgress", "type", "Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;", "getType", "()Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;", "setType", "(Lpowerwatch/matrix/com/pwgen2android/setup/language/SupportedType;)V", "loadItems", "onBackClicked", "", "onCreateView", "context", "onSaveClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SelectItemsViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private java.lang.Byte activeValue;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate itemExecutorDelegate;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView>> items;
    private final powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader;
    private powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-2, reason: not valid java name */
    public static final void m2902onSaveClicked$lambda2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-3, reason: not valid java name */
    public static final void m2903onSaveClicked$lambda3(java.lang.Throwable th) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    public /* synthetic */ SelectItemsViewModel(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader, powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate itemExecutorDelegate, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl savePreferencesViewModelImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, settingsDisplayValueLoader, itemExecutorDelegate, communicator, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModelImpl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectItemsViewModel(android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader, powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate itemExecutorDelegate, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDisplayValueLoader, "settingsDisplayValueLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemExecutorDelegate, "itemExecutorDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.settingsDisplayValueLoader = settingsDisplayValueLoader;
        this.itemExecutorDelegate = itemExecutorDelegate;
        this.communicator = communicator;
        this.$$delegate_0 = savePreferencesViewModel;
        this.items = new androidx.databinding.ObservableField<>(kotlin.collections.CollectionsKt.emptyList());
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
    }

    public final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView>> getItems() {
        return this.items;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.language.SupportedType getType() {
        return this.type;
    }

    public final void setType(powerwatch.matrix.com.pwgen2android.setup.language.SupportedType supportedType) {
        this.type = supportedType;
    }

    public final java.lang.Byte getActiveValue() {
        return this.activeValue;
    }

    public final void setActiveValue(java.lang.Byte b) {
        this.activeValue = b;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView>> observableField = this.items;
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType supportedType = this.type;
        kotlin.jvm.internal.Intrinsics.checkNotNull(supportedType);
        observableField.set(loadItems(supportedType));
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> loadItems(powerwatch.matrix.com.pwgen2android.setup.language.SupportedType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        powerwatch.matrix.com.pwgen2android.setup.language.SettingsDisplayValueLoader settingsDisplayValueLoader = this.settingsDisplayValueLoader;
        android.content.Context activityContext = getActivityContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activityContext);
        java.lang.Byte b = this.activeValue;
        kotlin.jvm.internal.Intrinsics.checkNotNull(b);
        return settingsDisplayValueLoader.loadItems(activityContext, type, b.byteValue());
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onSaveClicked(android.content.Context context) {
        int iNextIndex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> list = this.items.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.ListIterator<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            } else if (listIterator.previous().getChecked()) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        getShowSaveProgress().set(true);
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this.communicator.defaultConnectedDevice();
        if ((deviceInfoDefaultConnectedDevice == null ? null : deviceInfoDefaultConnectedDevice.getUid()) == null) {
            getShowSaveProgress().set(false);
            onBackClicked();
            return;
        }
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.setup.language.ItemExecutorDelegate itemExecutorDelegate = this.itemExecutorDelegate;
        powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND dnd = this.type;
        if (dnd == null) {
            dnd = powerwatch.matrix.com.pwgen2android.setup.language.SupportedType.DND.INSTANCE;
        }
        compositeDisposable.add(itemExecutorDelegate.executeItem(new powerwatch.matrix.com.pwgen2android.setup.language.ExecuteItem(iNextIndex, dnd)).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$SelectItemsViewModel$D00RxMyrhxNfNpIbKBNU1WgKPos
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel.m2901onSaveClicked$lambda1(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$SelectItemsViewModel$FnkQkMWUFrWxpKw7lRbHZ8L4aXo
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel.m2902onSaveClicked$lambda2();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$SelectItemsViewModel$5T2kUT3JbCYD95U1I7Mdoze1BC8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel.m2903onSaveClicked$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-1, reason: not valid java name */
    public static final void m2901onSaveClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.language.SelectItemsViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShowSaveProgress().set(false);
        this$0.onBackClicked();
    }
}
