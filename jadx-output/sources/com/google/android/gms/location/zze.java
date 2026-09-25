package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
final class zze implements java.util.Comparator<com.google.android.gms.location.ActivityTransition> {
    zze() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.location.ActivityTransition activityTransition, com.google.android.gms.location.ActivityTransition activityTransition2) {
        com.google.android.gms.location.ActivityTransition activityTransition3 = activityTransition;
        com.google.android.gms.location.ActivityTransition activityTransition4 = activityTransition2;
        int activityType = activityTransition3.getActivityType();
        int activityType2 = activityTransition4.getActivityType();
        if (activityType != activityType2) {
            return activityType < activityType2 ? -1 : 1;
        }
        int transitionType = activityTransition3.getTransitionType();
        int transitionType2 = activityTransition4.getTransitionType();
        if (transitionType == transitionType2) {
            return 0;
        }
        return transitionType < transitionType2 ? -1 : 1;
    }
}
