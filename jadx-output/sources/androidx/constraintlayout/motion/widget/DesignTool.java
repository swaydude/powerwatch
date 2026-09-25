package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class DesignTool implements androidx.constraintlayout.motion.widget.ProxyInterface {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "DesignTool";
    static final java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> allAttributes;
    static final java.util.HashMap<java.lang.String, java.lang.String> allMargins;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;

    public DesignTool(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    static {
        java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> map = new java.util.HashMap<>();
        allAttributes = map;
        java.util.HashMap<java.lang.String, java.lang.String> map2 = new java.util.HashMap<>();
        allMargins = map2;
        map.put(android.util.Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(android.util.Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(android.util.Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(android.util.Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(android.util.Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(android.util.Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(android.util.Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(android.util.Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(android.util.Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(android.util.Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(android.util.Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(android.util.Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(android.util.Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    private static int GetPxFromDp(int i, java.lang.String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((java.lang.Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i) / 160.0f);
    }

    private static void Connect(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> map, int i2, int i3) {
        java.lang.String str = allAttributes.get(android.util.Pair.create(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        java.lang.String str2 = map.get(str);
        if (str2 != null) {
            java.lang.String str3 = allMargins.get(str);
            constraintSet.connect(view.getId(), i2, java.lang.Integer.parseInt(str2), i3, str3 != null ? GetPxFromDp(i, map.get(str3)) : 0);
        }
    }

    private static void SetBias(androidx.constraintlayout.widget.ConstraintSet constraintSet, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> map, int i) {
        java.lang.String str = map.get(i == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i == 0) {
                constraintSet.setHorizontalBias(view.getId(), java.lang.Float.parseFloat(str));
            } else if (i == 1) {
                constraintSet.setVerticalBias(view.getId(), java.lang.Float.parseFloat(str));
            }
        }
    }

    private static void SetDimensions(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> map, int i2) {
        java.lang.String str = map.get(i2 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iGetPxFromDp = str.equalsIgnoreCase("wrap_content") ? -2 : GetPxFromDp(i, str);
            if (i2 == 0) {
                constraintSet.constrainWidth(view.getId(), iGetPxFromDp);
            } else {
                constraintSet.constrainHeight(view.getId(), iGetPxFromDp);
            }
        }
    }

    private static void SetAbsolutePositions(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> map) {
        java.lang.String str = map.get("layout_editor_absoluteX");
        if (str != null) {
            constraintSet.setEditorAbsoluteX(view.getId(), GetPxFromDp(i, str));
        }
        java.lang.String str2 = map.get("layout_editor_absoluteY");
        if (str2 != null) {
            constraintSet.setEditorAbsoluteY(view.getId(), GetPxFromDp(i, str2));
        }
    }

    public int getAnimationPath(java.lang.Object obj, float[] fArr) {
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        int duration = this.mMotionLayout.mScene.getDuration() / 16;
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildPath(fArr, duration);
        return duration;
    }

    public void getAnimationRectangles(java.lang.Object obj, float[] fArr) {
        if (this.mMotionLayout.mScene == null) {
            return;
        }
        int duration = this.mMotionLayout.mScene.getDuration() / 16;
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return;
        }
        motionController.buildRectangles(fArr, duration);
    }

    public int getAnimationKeyFames(java.lang.Object obj, float[] fArr) {
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        int duration = this.mMotionLayout.mScene.getDuration() / 16;
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.buildKeyFrames(fArr, null);
        return duration;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setToolPosition(float f) {
        this.mMotionLayout.mIndirectTransition = true;
        this.mMotionLayout.setProgress(f);
        this.mMotionLayout.evaluate(false);
        for (int i = 0; i < this.mMotionLayout.getChildCount(); i++) {
            android.view.View childAt = this.mMotionLayout.getChildAt(i);
            if (childAt instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
                ((androidx.constraintlayout.motion.widget.MotionLayout) childAt).setProgress(f);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public long getTransitionTimeMs() {
        return this.mMotionLayout.getTransitionTimeMs();
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public float getKeyFramePosition(java.lang.Object obj, int i, float f, float f2) {
        return this.mMotionLayout.mFrameArrayList.get((android.view.View) obj).getKeyFrameParameter(i, f, f2);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setKeyFrame(java.lang.Object obj, int i, java.lang.String str, java.lang.Object obj2) {
        if (this.mMotionLayout.mScene != null) {
            this.mMotionLayout.mScene.setKeyframe((android.view.View) obj, i, str, obj2);
            this.mMotionLayout.mTransitionGoalPosition = i / 100.0f;
            this.mMotionLayout.mTransitionLastPosition = 0.0f;
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.evaluate(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public boolean setKeyFramePosition(java.lang.Object obj, int i, int i2, float f, float f2) {
        if (this.mMotionLayout.mScene == null) {
            return false;
        }
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        float f3 = this.mMotionLayout.mTransitionPosition;
        if (motionController == null) {
            return false;
        }
        android.view.View view = (android.view.View) obj;
        if (!this.mMotionLayout.mScene.hasKeyFramePosition(view, 30)) {
            return false;
        }
        float keyFrameParameter = motionController.getKeyFrameParameter(2, f, f2);
        float keyFrameParameter2 = motionController.getKeyFrameParameter(5, f, f2);
        this.mMotionLayout.mScene.setKeyframe(view, 30, "motion:percentX", java.lang.Float.valueOf(keyFrameParameter));
        this.mMotionLayout.mScene.setKeyframe(view, 30, "motion:percentY", java.lang.Float.valueOf(keyFrameParameter2));
        this.mMotionLayout.rebuildScene();
        this.mMotionLayout.evaluate(true);
        this.mMotionLayout.invalidate();
        return true;
    }

    public void setViewDebug(java.lang.Object obj, int i) {
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(obj);
        if (motionController != null) {
            motionController.setDrawPath(i);
            this.mMotionLayout.invalidate();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public int designAccess(int i, java.lang.String str, java.lang.Object obj, float[] fArr, int i2, float[] fArr2, int i3) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        android.view.View view = (android.view.View) obj;
        if (i == 0) {
            motionController = null;
        } else if (this.mMotionLayout.mScene == null || view == null || (motionController = this.mMotionLayout.mFrameArrayList.get(view)) == null) {
            return -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            int duration = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildPath(fArr2, duration);
            return duration;
        }
        if (i == 2) {
            int duration2 = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildKeyFrames(fArr2, null);
            return duration2;
        }
        if (i != 3) {
            return -1;
        }
        int duration3 = this.mMotionLayout.mScene.getDuration() / 16;
        return motionController.getAttributeValues(str, fArr2, i3);
    }

    public java.lang.Object getKeyframe(int i, int i2, int i3) {
        if (this.mMotionLayout.mScene == null) {
            return null;
        }
        return this.mMotionLayout.mScene.getKeyFrame(this.mMotionLayout.getContext(), i, i2, i3);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public java.lang.Object getKeyframeAtLocation(java.lang.Object obj, float f, float f2) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        android.view.View view = (android.view.View) obj;
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        if (view == null || (motionController = this.mMotionLayout.mFrameArrayList.get(view)) == null) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        return motionController.getPositionKeyframe(viewGroup.getWidth(), viewGroup.getHeight(), f, f2);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public java.lang.Boolean getPositionKeyframe(java.lang.Object obj, java.lang.Object obj2, float f, float f2, java.lang.String[] strArr, float[] fArr) {
        if (obj instanceof androidx.constraintlayout.motion.widget.KeyPositionBase) {
            android.view.View view = (android.view.View) obj2;
            this.mMotionLayout.mFrameArrayList.get(view).positionKeyframe(view, (androidx.constraintlayout.motion.widget.KeyPositionBase) obj, f, f2, strArr, fArr);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
            return true;
        }
        return false;
    }

    public void setKeyframe(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj instanceof androidx.constraintlayout.motion.widget.Key) {
            ((androidx.constraintlayout.motion.widget.Key) obj).setValue(str, obj2);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setAttributes(int i, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        java.util.HashMap map = (java.util.HashMap) obj2;
        android.content.Context context = this.mMotionLayout.getContext();
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mMotionLayout.mScene.getConstraintSet(context.getResources().getIdentifier(str, "id", context.getPackageName()));
        if (constraintSet == null) {
            return;
        }
        constraintSet.clear(view.getId());
        SetDimensions(i, constraintSet, view, map, 0);
        SetDimensions(i, constraintSet, view, map, 1);
        Connect(i, constraintSet, view, map, 6, 6);
        Connect(i, constraintSet, view, map, 6, 7);
        Connect(i, constraintSet, view, map, 7, 7);
        Connect(i, constraintSet, view, map, 7, 6);
        Connect(i, constraintSet, view, map, 1, 1);
        Connect(i, constraintSet, view, map, 1, 2);
        Connect(i, constraintSet, view, map, 2, 2);
        Connect(i, constraintSet, view, map, 2, 1);
        Connect(i, constraintSet, view, map, 3, 3);
        Connect(i, constraintSet, view, map, 3, 4);
        Connect(i, constraintSet, view, map, 4, 3);
        Connect(i, constraintSet, view, map, 4, 4);
        Connect(i, constraintSet, view, map, 5, 5);
        SetBias(constraintSet, view, map, 0);
        SetBias(constraintSet, view, map, 1);
        SetAbsolutePositions(i, constraintSet, view, map);
        this.mMotionLayout.mTransitionLastPosition = -1.0f;
        this.mMotionLayout.rebuildScene();
    }
}
