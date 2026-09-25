package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: loaded from: classes2.dex */
public final class FqName {
    public static final kotlin.reflect.jvm.internal.impl.name.FqName ROOT = new kotlin.reflect.jvm.internal.impl.name.FqName("");
    private final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName;
    private transient kotlin.reflect.jvm.internal.impl.name.FqName parent;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new java.lang.IllegalStateException(str2);
            case 8:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public FqName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        this.fqName = new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(str, this);
    }

    public FqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(2);
        }
        this.fqName = fqNameUnsafe;
    }

    private FqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(3);
        }
        this.fqName = fqNameUnsafe;
        this.parent = fqName;
    }

    public java.lang.String asString() {
        java.lang.String strAsString = this.fqName.asString();
        if (strAsString == null) {
            $$$reportNull$$$0(4);
        }
        return strAsString;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe toUnsafe() {
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = this.fqName;
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(5);
        }
        return fqNameUnsafe;
    }

    public boolean isRoot() {
        return this.fqName.isRoot();
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName parent() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.parent;
        if (fqName != null) {
            if (fqName == null) {
                $$$reportNull$$$0(6);
            }
            return fqName;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root");
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName(this.fqName.parent());
        this.parent = fqName2;
        if (fqName2 == null) {
            $$$reportNull$$$0(7);
        }
        return fqName2;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName child(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null) {
            $$$reportNull$$$0(8);
        }
        return new kotlin.reflect.jvm.internal.impl.name.FqName(this.fqName.child(name), this);
    }

    public kotlin.reflect.jvm.internal.impl.name.Name shortName() {
        kotlin.reflect.jvm.internal.impl.name.Name nameShortName = this.fqName.shortName();
        if (nameShortName == null) {
            $$$reportNull$$$0(9);
        }
        return nameShortName;
    }

    public kotlin.reflect.jvm.internal.impl.name.Name shortNameOrSpecial() {
        kotlin.reflect.jvm.internal.impl.name.Name nameShortNameOrSpecial = this.fqName.shortNameOrSpecial();
        if (nameShortNameOrSpecial == null) {
            $$$reportNull$$$0(10);
        }
        return nameShortNameOrSpecial;
    }

    public java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments() {
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> listPathSegments = this.fqName.pathSegments();
        if (listPathSegments == null) {
            $$$reportNull$$$0(11);
        }
        return listPathSegments;
    }

    public boolean startsWith(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null) {
            $$$reportNull$$$0(12);
        }
        return this.fqName.startsWith(name);
    }

    public static kotlin.reflect.jvm.internal.impl.name.FqName topLevel(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null) {
            $$$reportNull$$$0(13);
        }
        return new kotlin.reflect.jvm.internal.impl.name.FqName(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe.topLevel(name));
    }

    public java.lang.String toString() {
        return this.fqName.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlin.reflect.jvm.internal.impl.name.FqName) && this.fqName.equals(((kotlin.reflect.jvm.internal.impl.name.FqName) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }
}
