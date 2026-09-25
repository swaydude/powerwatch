package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class ViewGroupBindingAdapter {

    public interface OnAnimationEnd {
        void onAnimationEnd(android.view.animation.Animation animation);
    }

    public interface OnAnimationRepeat {
        void onAnimationRepeat(android.view.animation.Animation animation);
    }

    public interface OnAnimationStart {
        void onAnimationStart(android.view.animation.Animation animation);
    }

    public interface OnChildViewAdded {
        void onChildViewAdded(android.view.View view, android.view.View view2);
    }

    public interface OnChildViewRemoved {
        void onChildViewRemoved(android.view.View view, android.view.View view2);
    }

    public static void setAnimateLayoutChanges(android.view.ViewGroup viewGroup, boolean z) {
        if (z) {
            viewGroup.setLayoutTransition(new android.animation.LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    public static void setListener(android.view.ViewGroup viewGroup, final androidx.databinding.adapters.ViewGroupBindingAdapter.OnChildViewAdded onChildViewAdded, final androidx.databinding.adapters.ViewGroupBindingAdapter.OnChildViewRemoved onChildViewRemoved) {
        if (onChildViewAdded == null && onChildViewRemoved == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new android.view.ViewGroup.OnHierarchyChangeListener() { // from class: androidx.databinding.adapters.ViewGroupBindingAdapter.1
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(android.view.View view, android.view.View view2) {
                    androidx.databinding.adapters.ViewGroupBindingAdapter.OnChildViewAdded onChildViewAdded2 = onChildViewAdded;
                    if (onChildViewAdded2 != null) {
                        onChildViewAdded2.onChildViewAdded(view, view2);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(android.view.View view, android.view.View view2) {
                    androidx.databinding.adapters.ViewGroupBindingAdapter.OnChildViewRemoved onChildViewRemoved2 = onChildViewRemoved;
                    if (onChildViewRemoved2 != null) {
                        onChildViewRemoved2.onChildViewRemoved(view, view2);
                    }
                }
            });
        }
    }

    public static void setListener(android.view.ViewGroup viewGroup, final androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationStart onAnimationStart, final androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationEnd onAnimationEnd, final androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationRepeat onAnimationRepeat) {
        if (onAnimationStart == null && onAnimationEnd == null && onAnimationRepeat == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new android.view.animation.Animation.AnimationListener() { // from class: androidx.databinding.adapters.ViewGroupBindingAdapter.2
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(android.view.animation.Animation animation) {
                    androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationStart onAnimationStart2 = onAnimationStart;
                    if (onAnimationStart2 != null) {
                        onAnimationStart2.onAnimationStart(animation);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(android.view.animation.Animation animation) {
                    androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationEnd onAnimationEnd2 = onAnimationEnd;
                    if (onAnimationEnd2 != null) {
                        onAnimationEnd2.onAnimationEnd(animation);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(android.view.animation.Animation animation) {
                    androidx.databinding.adapters.ViewGroupBindingAdapter.OnAnimationRepeat onAnimationRepeat2 = onAnimationRepeat;
                    if (onAnimationRepeat2 != null) {
                        onAnimationRepeat2.onAnimationRepeat(animation);
                    }
                }
            });
        }
    }
}
