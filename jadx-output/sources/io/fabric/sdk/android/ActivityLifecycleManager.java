package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityLifecycleManager {
    private final android.app.Application application;
    private io.fabric.sdk.android.ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper callbacksWrapper;

    public static abstract class Callbacks {
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        public void onActivityDestroyed(android.app.Activity activity) {
        }

        public void onActivityPaused(android.app.Activity activity) {
        }

        public void onActivityResumed(android.app.Activity activity) {
        }

        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        public void onActivityStarted(android.app.Activity activity) {
        }

        public void onActivityStopped(android.app.Activity activity) {
        }
    }

    public ActivityLifecycleManager(android.content.Context context) {
        android.app.Application application = (android.app.Application) context.getApplicationContext();
        this.application = application;
        if (android.os.Build.VERSION.SDK_INT >= 14) {
            this.callbacksWrapper = new io.fabric.sdk.android.ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper(application);
        }
    }

    public boolean registerCallbacks(io.fabric.sdk.android.ActivityLifecycleManager.Callbacks callbacks) {
        io.fabric.sdk.android.ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper activityLifecycleCallbacksWrapper = this.callbacksWrapper;
        return activityLifecycleCallbacksWrapper != null && activityLifecycleCallbacksWrapper.registerLifecycleCallbacks(callbacks);
    }

    public void resetCallbacks() {
        io.fabric.sdk.android.ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper activityLifecycleCallbacksWrapper = this.callbacksWrapper;
        if (activityLifecycleCallbacksWrapper != null) {
            activityLifecycleCallbacksWrapper.clearCallbacks();
        }
    }

    private static class ActivityLifecycleCallbacksWrapper {
        private final android.app.Application application;
        private final java.util.Set<android.app.Application.ActivityLifecycleCallbacks> registeredCallbacks = new java.util.HashSet();

        ActivityLifecycleCallbacksWrapper(android.app.Application application) {
            this.application = application;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallbacks() {
            java.util.Iterator<android.app.Application.ActivityLifecycleCallbacks> it = this.registeredCallbacks.iterator();
            while (it.hasNext()) {
                this.application.unregisterActivityLifecycleCallbacks(it.next());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean registerLifecycleCallbacks(final io.fabric.sdk.android.ActivityLifecycleManager.Callbacks callbacks) {
            if (this.application == null) {
                return false;
            }
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new android.app.Application.ActivityLifecycleCallbacks() { // from class: io.fabric.sdk.android.ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
                    callbacks.onActivityCreated(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(android.app.Activity activity) {
                    callbacks.onActivityStarted(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(android.app.Activity activity) {
                    callbacks.onActivityResumed(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(android.app.Activity activity) {
                    callbacks.onActivityPaused(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(android.app.Activity activity) {
                    callbacks.onActivityStopped(activity);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
                    callbacks.onActivitySaveInstanceState(activity, bundle);
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(android.app.Activity activity) {
                    callbacks.onActivityDestroyed(activity);
                }
            };
            this.application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            this.registeredCallbacks.add(activityLifecycleCallbacks);
            return true;
        }
    }
}
