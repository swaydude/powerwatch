package com.google.android.gms.common.internal.safeparcel;

/* JADX INFO: loaded from: classes.dex */
public interface SafeParcelable extends android.os.Parcelable {
    public static final java.lang.String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface Class {
        java.lang.String creator();

        boolean validate() default false;
    }

    public @interface Constructor {
    }

    public @interface Field {
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Indicator {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Param {
        int id();
    }

    public @interface Reserved {
        int[] value();
    }

    public @interface VersionField {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
