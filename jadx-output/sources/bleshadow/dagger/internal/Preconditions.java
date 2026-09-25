package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T reference) {
        java.util.Objects.requireNonNull(reference);
        return reference;
    }

    public static <T> T checkNotNull(T reference, java.lang.String errorMessage) {
        java.util.Objects.requireNonNull(reference, errorMessage);
        return reference;
    }

    public static <T> T checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object errorMessageArg) {
        java.lang.String strValueOf;
        if (reference != null) {
            return reference;
        }
        if (!errorMessageTemplate.contains("%s")) {
            throw new java.lang.IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (errorMessageTemplate.indexOf("%s") != errorMessageTemplate.lastIndexOf("%s")) {
            throw new java.lang.IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
        if (errorMessageArg instanceof java.lang.Class) {
            strValueOf = ((java.lang.Class) errorMessageArg).getCanonicalName();
        } else {
            strValueOf = java.lang.String.valueOf(errorMessageArg);
        }
        throw new java.lang.NullPointerException(errorMessageTemplate.replace("%s", strValueOf));
    }

    private Preconditions() {
    }
}
