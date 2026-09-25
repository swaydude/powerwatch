package okhttp3.internal.http;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpDate {
    private static final java.text.DateFormat[] BROWSER_COMPATIBLE_DATE_FORMATS;
    private static final java.lang.String[] BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
    public static final long MAX_DATE = 253402300799999L;
    private static final java.lang.ThreadLocal<java.text.DateFormat> STANDARD_DATE_FORMAT = new java.lang.ThreadLocal<java.text.DateFormat>() { // from class: okhttp3.internal.http.HttpDate.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.text.DateFormat initialValue() {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(okhttp3.internal.Util.UTC);
            return simpleDateFormat;
        }
    };

    static {
        java.lang.String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS = strArr;
        BROWSER_COMPATIBLE_DATE_FORMATS = new java.text.DateFormat[strArr.length];
    }

    public static java.util.Date parse(java.lang.String str) {
        if (str.length() == 0) {
            return null;
        }
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        java.util.Date date = STANDARD_DATE_FORMAT.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        java.lang.String[] strArr = BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                java.text.DateFormat[] dateFormatArr = BROWSER_COMPATIBLE_DATE_FORMATS;
                java.text.DateFormat simpleDateFormat = dateFormatArr[i];
                if (simpleDateFormat == null) {
                    simpleDateFormat = new java.text.SimpleDateFormat(BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS[i], java.util.Locale.US);
                    simpleDateFormat.setTimeZone(okhttp3.internal.Util.UTC);
                    dateFormatArr[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                java.util.Date date2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }

    public static java.lang.String format(java.util.Date date) {
        return STANDARD_DATE_FORMAT.get().format(date);
    }

    private HttpDate() {
    }
}
