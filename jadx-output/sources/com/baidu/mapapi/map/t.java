package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
class t implements com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks {
    final /* synthetic */ com.baidu.mapapi.map.SwipeDismissView a;

    t(com.baidu.mapapi.map.SwipeDismissView swipeDismissView) {
        this.a = swipeDismissView;
    }

    @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
    public boolean canDismiss(java.lang.Object obj) {
        return true;
    }

    @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
    public void onDismiss(android.view.View view, java.lang.Object obj) {
        if (this.a.a == null) {
            return;
        }
        this.a.a.onDismiss();
    }

    @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
    public void onNotify() {
        if (this.a.a == null) {
            return;
        }
        this.a.a.onNotify();
    }
}
