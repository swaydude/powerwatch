package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    public static final java.lang.String BETA_APP_PACKAGE_NAME = "io.crash.air";
    private final int id;

    DeliveryMechanism(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return java.lang.Integer.toString(this.id);
    }

    public static io.fabric.sdk.android.services.common.DeliveryMechanism determineFrom(java.lang.String str) {
        if (BETA_APP_PACKAGE_NAME.equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }
}
