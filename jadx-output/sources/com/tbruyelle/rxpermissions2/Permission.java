package com.tbruyelle.rxpermissions2;

/* JADX INFO: loaded from: classes2.dex */
public class Permission {
    public final boolean granted;
    public final java.lang.String name;
    public final boolean shouldShowRequestPermissionRationale;

    public Permission(java.lang.String str, boolean z) {
        this(str, z, false);
    }

    public Permission(java.lang.String str, boolean z, boolean z2) {
        this.name = str;
        this.granted = z;
        this.shouldShowRequestPermissionRationale = z2;
    }

    public Permission(java.util.List<com.tbruyelle.rxpermissions2.Permission> list) {
        this.name = combineName(list);
        this.granted = combineGranted(list).booleanValue();
        this.shouldShowRequestPermissionRationale = combineShouldShowRequestPermissionRationale(list).booleanValue();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tbruyelle.rxpermissions2.Permission permission = (com.tbruyelle.rxpermissions2.Permission) obj;
        if (this.granted == permission.granted && this.shouldShowRequestPermissionRationale == permission.shouldShowRequestPermissionRationale) {
            return this.name.equals(permission.name);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + (this.granted ? 1 : 0)) * 31) + (this.shouldShowRequestPermissionRationale ? 1 : 0);
    }

    public java.lang.String toString() {
        return "Permission{name='" + this.name + "', granted=" + this.granted + ", shouldShowRequestPermissionRationale=" + this.shouldShowRequestPermissionRationale + '}';
    }

    private java.lang.String combineName(java.util.List<com.tbruyelle.rxpermissions2.Permission> list) {
        return ((java.lang.StringBuilder) io.reactivex.Observable.fromIterable(list).map(new io.reactivex.functions.Function<com.tbruyelle.rxpermissions2.Permission, java.lang.String>() { // from class: com.tbruyelle.rxpermissions2.Permission.2
            @Override // io.reactivex.functions.Function
            public java.lang.String apply(com.tbruyelle.rxpermissions2.Permission permission) throws java.lang.Exception {
                return permission.name;
            }
        }).collectInto(new java.lang.StringBuilder(), new io.reactivex.functions.BiConsumer<java.lang.StringBuilder, java.lang.String>() { // from class: com.tbruyelle.rxpermissions2.Permission.1
            @Override // io.reactivex.functions.BiConsumer
            public void accept(java.lang.StringBuilder sb, java.lang.String str) throws java.lang.Exception {
                if (sb.length() == 0) {
                    sb.append(str);
                } else {
                    sb.append(", ");
                    sb.append(str);
                }
            }
        }).blockingGet()).toString();
    }

    private java.lang.Boolean combineGranted(java.util.List<com.tbruyelle.rxpermissions2.Permission> list) {
        return io.reactivex.Observable.fromIterable(list).all(new io.reactivex.functions.Predicate<com.tbruyelle.rxpermissions2.Permission>() { // from class: com.tbruyelle.rxpermissions2.Permission.3
            @Override // io.reactivex.functions.Predicate
            public boolean test(com.tbruyelle.rxpermissions2.Permission permission) throws java.lang.Exception {
                return permission.granted;
            }
        }).blockingGet();
    }

    private java.lang.Boolean combineShouldShowRequestPermissionRationale(java.util.List<com.tbruyelle.rxpermissions2.Permission> list) {
        return io.reactivex.Observable.fromIterable(list).any(new io.reactivex.functions.Predicate<com.tbruyelle.rxpermissions2.Permission>() { // from class: com.tbruyelle.rxpermissions2.Permission.4
            @Override // io.reactivex.functions.Predicate
            public boolean test(com.tbruyelle.rxpermissions2.Permission permission) throws java.lang.Exception {
                return permission.shouldShowRequestPermissionRationale;
            }
        }).blockingGet();
    }
}
