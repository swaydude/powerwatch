package com.google.firebase.components;

/* JADX INFO: compiled from: com.google.firebase:firebase-components@@16.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class Dependency {
    private final java.lang.Class<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(java.lang.Class<?> cls, int i, int i2) {
        this.anInterface = (java.lang.Class) com.google.firebase.components.Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.type = i;
        this.injection = i2;
    }

    public static com.google.firebase.components.Dependency optional(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 0, 0);
    }

    public static com.google.firebase.components.Dependency required(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 1, 0);
    }

    public static com.google.firebase.components.Dependency setOf(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 2, 0);
    }

    public static com.google.firebase.components.Dependency optionalProvider(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 0, 1);
    }

    public static com.google.firebase.components.Dependency requiredProvider(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 1, 1);
    }

    public static com.google.firebase.components.Dependency setOfProvider(java.lang.Class<?> cls) {
        return new com.google.firebase.components.Dependency(cls, 2, 1);
    }

    public java.lang.Class<?> getInterface() {
        return this.anInterface;
    }

    public boolean isRequired() {
        return this.type == 1;
    }

    public boolean isSet() {
        return this.type == 2;
    }

    public boolean isDirectInjection() {
        return this.injection == 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.firebase.components.Dependency)) {
            return false;
        }
        com.google.firebase.components.Dependency dependency = (com.google.firebase.components.Dependency) obj;
        return this.anInterface == dependency.anInterface && this.type == dependency.type && this.injection == dependency.injection;
    }

    public int hashCode() {
        return ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.injection;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency{anInterface=");
        sb.append(this.anInterface);
        sb.append(", type=");
        int i = this.type;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", direct=");
        sb.append(this.injection == 0);
        sb.append("}");
        return sb.toString();
    }
}
