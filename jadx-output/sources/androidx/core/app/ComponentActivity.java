package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {
    private androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> mExtraDataMap = new androidx.collection.SimpleArrayMap<>();
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);

    public static class ExtraData {
    }

    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData extraData) {
        this.mExtraDataMap.put((java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>) extraData.getClass(), extraData);
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.ReportFragment.injectIfNeededIn(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        this.mLifecycleRegistry.markState(androidx.lifecycle.Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(java.lang.Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        android.view.View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(this, decorView, this, keyEvent);
        }
        return true;
    }
}
