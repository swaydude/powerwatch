package powerwatch.matrix.com.pwgen2android.shared.ui.views;

/* JADX INFO: compiled from: MultiSelectionSpinner.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010&\u001a\u00020\u0012H\u0002J \u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u000200H\u0016J\u0019\u00101\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u00102J\u0014\u00101\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015J\u0019\u00103\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\u00102J\u0010\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u0016H\u0016J\u000e\u00103\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u000205J\u0014\u00103\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010%¨\u00066"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/views/MultiSelectionSpinner;", "Landroid/widget/Spinner;", "Landroid/content/DialogInterface$OnMultiChoiceClickListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "closeSpinnerListener", "Lkotlin/Function0;", "", "getCloseSpinnerListener", "()Lkotlin/jvm/functions/Function0;", "setCloseSpinnerListener", "(Lkotlin/jvm/functions/Function0;)V", "items", "", "", "[Ljava/lang/String;", "selectedIndices", "", "", "getSelectedIndices", "()Ljava/util/List;", "selectedItemsAsString", "getSelectedItemsAsString", "()Ljava/lang/String;", "selectedStrings", "getSelectedStrings", "selection", "", "simpleAdapter", "Landroid/widget/ArrayAdapter;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "getTitle", "setTitle", "(Ljava/lang/String;)V", "buildSelectedItemString", "onClick", "dialog", "Landroid/content/DialogInterface;", "which", "isChecked", "", "performClick", "setAdapter", "adapter", "Landroid/widget/SpinnerAdapter;", "setItems", "([Ljava/lang/String;)V", "setSelection", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MultiSelectionSpinner extends android.widget.Spinner implements android.content.DialogInterface.OnMultiChoiceClickListener {
    private kotlin.jvm.functions.Function0<kotlin.Unit> closeSpinnerListener;
    private java.lang.String[] items;
    private boolean[] selection;
    private android.widget.ArrayAdapter<java.lang.String> simpleAdapter;
    private java.lang.String title;

    public void _$_clearFindViewByIdCache() {
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCloseSpinnerListener() {
        return this.closeSpinnerListener;
    }

    public final void setCloseSpinnerListener(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.closeSpinnerListener = function0;
    }

    public final java.util.List<java.lang.String> getSelectedStrings() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = this.items.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.selection[i]) {
                    linkedList.add(this.items[i]);
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return linkedList;
    }

    public final java.util.List<java.lang.Integer> getSelectedIndices() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = this.items.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.selection[i]) {
                    linkedList.add(java.lang.Integer.valueOf(i));
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return linkedList;
    }

    public final java.lang.String getSelectedItemsAsString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = this.items.length - 1;
        if (length >= 0) {
            int i = 0;
            boolean z = false;
            while (true) {
                int i2 = i + 1;
                if (this.selection[i]) {
                    if (z) {
                        sb.append(", ");
                    }
                    sb.append(this.items[i]);
                    z = true;
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectionSpinner(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.items = new java.lang.String[0];
        this.selection = new boolean[0];
        this.title = "";
        android.widget.ArrayAdapter<java.lang.String> arrayAdapter = new android.widget.ArrayAdapter<>(context, android.R.layout.simple_spinner_item);
        this.simpleAdapter = arrayAdapter;
        super.setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectionSpinner(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.items = new java.lang.String[0];
        this.selection = new boolean[0];
        this.title = "";
        android.widget.ArrayAdapter<java.lang.String> arrayAdapter = new android.widget.ArrayAdapter<>(context, android.R.layout.simple_spinner_item);
        this.simpleAdapter = arrayAdapter;
        super.setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(android.content.DialogInterface dialog, int which, boolean isChecked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialog, "dialog");
        boolean[] zArr = this.selection;
        if (which < zArr.length) {
            zArr[which] = isChecked;
            this.simpleAdapter.clear();
            this.simpleAdapter.add(buildSelectedItemString());
            return;
        }
        throw new java.lang.IllegalArgumentException("Argument 'which' is out of bounds.");
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(getContext());
        builder.setMultiChoiceItems(this.items, this.selection, this);
        builder.setCancelable(false);
        builder.setTitle(this.title);
        builder.setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() { // from class: powerwatch.matrix.com.pwgen2android.shared.ui.views.-$$Lambda$MultiSelectionSpinner$jvoidrf2Pn52tw66KahZTDtV4bA
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner.m3516performClick$lambda0(this.f$0, dialogInterface, i);
            }
        });
        builder.show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: performClick$lambda-0, reason: not valid java name */
    public static final void m3516performClick$lambda0(powerwatch.matrix.com.pwgen2android.shared.ui.views.MultiSelectionSpinner this$0, android.content.DialogInterface dialogInterface, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.functions.Function0<kotlin.Unit> closeSpinnerListener = this$0.getCloseSpinnerListener();
        if (closeSpinnerListener == null) {
            return;
        }
        closeSpinnerListener.invoke();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.SpinnerAdapter adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        throw new java.lang.RuntimeException("setAdapter is not supported by MultiSelectSpinner.");
    }

    public final void setItems(java.lang.String[] items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.selection = new boolean[items.length];
        this.simpleAdapter.clear();
        this.simpleAdapter.add(this.items[0]);
        java.util.Arrays.fill(this.selection, false);
    }

    public final void setItems(java.util.List<java.lang.String> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        java.lang.Object[] array = items.toArray(new java.lang.String[0]);
        java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        java.lang.String[] strArr = (java.lang.String[]) array;
        this.items = strArr;
        this.selection = new boolean[strArr.length];
        this.simpleAdapter.clear();
        java.lang.String[] strArr2 = this.items;
        if (strArr2.length == 0) {
            return;
        }
        this.simpleAdapter.add((java.lang.String) kotlin.collections.ArraysKt.first(strArr2));
        java.util.Arrays.fill(this.selection, false);
    }

    public final void setSelection(java.lang.String[] selection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selection, "selection");
        int length = selection.length;
        int i = 0;
        while (i < length) {
            java.lang.String str = selection[i];
            i++;
            int length2 = this.items.length - 1;
            if (length2 >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.items[i2], str)) {
                        this.selection[i2] = true;
                    }
                    if (i3 > length2) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
        }
    }

    public final void setSelection(java.util.List<java.lang.String> selection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selection, "selection");
        int length = this.selection.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.selection[i] = false;
                if (i2 > length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        for (java.lang.String str : selection) {
            int length2 = this.items.length - 1;
            if (length2 >= 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.items[i3], str)) {
                        this.selection[i3] = true;
                    }
                    if (i4 > length2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
            }
        }
        this.simpleAdapter.clear();
        this.simpleAdapter.add(buildSelectedItemString());
    }

    @Override // android.widget.AbsSpinner, android.widget.AdapterView
    public void setSelection(int index) {
        int length = this.selection.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.selection[i] = false;
                if (i2 > length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (index >= 0) {
            boolean[] zArr = this.selection;
            if (index < zArr.length) {
                zArr[index] = true;
                this.simpleAdapter.clear();
                this.simpleAdapter.add(buildSelectedItemString());
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Index " + index + " is out of bounds.");
    }

    public final void setSelection(int[] selectedIndices) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedIndices, "selectedIndices");
        int length = this.selection.length - 1;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                this.selection[i2] = false;
                if (i3 > length) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        int length2 = selectedIndices.length;
        while (i < length2) {
            int i4 = selectedIndices[i];
            i++;
            if (i4 >= 0) {
                boolean[] zArr = this.selection;
                if (i4 < zArr.length) {
                    zArr[i4] = true;
                }
            }
            throw new java.lang.IllegalArgumentException("Index " + i4 + " is out of bounds.");
        }
        this.simpleAdapter.clear();
        this.simpleAdapter.add(buildSelectedItemString());
    }

    private final java.lang.String buildSelectedItemString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = this.items.length - 1;
        if (length >= 0) {
            int i = 0;
            boolean z = false;
            while (true) {
                int i2 = i + 1;
                if (this.selection[i]) {
                    if (z) {
                        sb.append(", ");
                    }
                    sb.append(this.items[i]);
                    z = true;
                }
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
