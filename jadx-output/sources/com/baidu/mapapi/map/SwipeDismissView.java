package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissView extends android.widget.RelativeLayout {
    com.baidu.mapapi.map.WearMapView.OnDismissCallback a;

    public SwipeDismissView(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.view.View view) {
        super(context, attributeSet, i);
        this.a = null;
        a(context, view);
    }

    public SwipeDismissView(android.content.Context context, android.util.AttributeSet attributeSet, android.view.View view) {
        super(context, attributeSet);
        this.a = null;
        a(context, view);
    }

    public SwipeDismissView(android.content.Context context, android.view.View view) {
        super(context);
        this.a = null;
        a(context, view);
    }

    void a(android.content.Context context, android.view.View view) {
        setOnTouchListener(new com.baidu.mapapi.map.SwipeDismissTouchListener(view, new java.lang.Object(), new com.baidu.mapapi.map.t(this)));
    }

    public void setCallback(com.baidu.mapapi.map.WearMapView.OnDismissCallback onDismissCallback) {
        this.a = onDismissCallback;
    }
}
