package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
final class Utils {
    private static final java.io.FilenameFilter ALL_FILES_FILTER = new java.io.FilenameFilter() { // from class: com.crashlytics.android.core.Utils.1
        @Override // java.io.FilenameFilter
        public boolean accept(java.io.File file, java.lang.String str) {
            return true;
        }
    };

    private Utils() {
    }

    static int capFileCount(java.io.File file, int i, java.util.Comparator<java.io.File> comparator) {
        return capFileCount(file, ALL_FILES_FILTER, i, comparator);
    }

    static int capFileCount(java.io.File file, java.io.FilenameFilter filenameFilter, int i, java.util.Comparator<java.io.File> comparator) {
        java.io.File[] fileArrListFiles = file.listFiles(filenameFilter);
        if (fileArrListFiles == null) {
            return 0;
        }
        int length = fileArrListFiles.length;
        java.util.Arrays.sort(fileArrListFiles, comparator);
        for (java.io.File file2 : fileArrListFiles) {
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
        }
        return length;
    }
}
