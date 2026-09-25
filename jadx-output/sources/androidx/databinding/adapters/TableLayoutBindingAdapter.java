package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class TableLayoutBindingAdapter {
    private static final int MAX_COLUMNS = 20;
    private static java.util.regex.Pattern sColumnPattern = java.util.regex.Pattern.compile("\\s*,\\s*");

    public static void setCollapseColumns(android.widget.TableLayout tableLayout, java.lang.CharSequence charSequence) {
        android.util.SparseBooleanArray columns = parseColumns(charSequence);
        for (int i = 0; i < 20; i++) {
            boolean z = columns.get(i, false);
            if (z != tableLayout.isColumnCollapsed(i)) {
                tableLayout.setColumnCollapsed(i, z);
            }
        }
    }

    public static void setShrinkColumns(android.widget.TableLayout tableLayout, java.lang.CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        android.util.SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = columns.keyAt(i);
            boolean zValueAt = columns.valueAt(i);
            if (zValueAt) {
                tableLayout.setColumnShrinkable(iKeyAt, zValueAt);
            }
        }
    }

    public static void setStretchColumns(android.widget.TableLayout tableLayout, java.lang.CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        android.util.SparseBooleanArray columns = parseColumns(charSequence);
        int size = columns.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = columns.keyAt(i);
            boolean zValueAt = columns.valueAt(i);
            if (zValueAt) {
                tableLayout.setColumnStretchable(iKeyAt, zValueAt);
            }
        }
    }

    private static android.util.SparseBooleanArray parseColumns(java.lang.CharSequence charSequence) {
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (java.lang.String str : sColumnPattern.split(charSequence)) {
            try {
                int i = java.lang.Integer.parseInt(str);
                if (i >= 0) {
                    sparseBooleanArray.put(i, true);
                }
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }
}
