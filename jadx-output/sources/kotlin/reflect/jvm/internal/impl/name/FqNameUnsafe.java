package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: loaded from: classes2.dex */
public final class FqNameUnsafe {
    private static final kotlin.reflect.jvm.internal.impl.name.Name ROOT_NAME = kotlin.reflect.jvm.internal.impl.name.Name.special("<root>");
    private static final java.util.regex.Pattern SPLIT_BY_DOTS = java.util.regex.Pattern.compile("\\.");
    private static final kotlin.jvm.functions.Function1<java.lang.String, kotlin.reflect.jvm.internal.impl.name.Name> STRING_TO_NAME = new kotlin.jvm.functions.Function1<java.lang.String, kotlin.reflect.jvm.internal.impl.name.Name>() { // from class: kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe.1
        @Override // kotlin.jvm.functions.Function1
        public kotlin.reflect.jvm.internal.impl.name.Name invoke(java.lang.String str) {
            return kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(str);
        }
    };
    private final java.lang.String fqName;
    private transient kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe parent;
    private transient kotlin.reflect.jvm.internal.impl.name.FqName safe;
    private transient kotlin.reflect.jvm.internal.impl.name.Name shortName;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new java.lang.IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    FqNameUnsafe(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        if (fqName == null) {
            $$$reportNull$$$0(1);
        }
        this.fqName = str;
        this.safe = fqName;
    }

    public FqNameUnsafe(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        this.fqName = str;
    }

    private FqNameUnsafe(java.lang.String str, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        this.fqName = str;
        this.parent = fqNameUnsafe;
        this.shortName = name;
    }

    private void compute() {
        int iLastIndexOf = this.fqName.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.shortName = kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(this.fqName.substring(iLastIndexOf + 1));
            this.parent = new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(this.fqName.substring(0, iLastIndexOf));
        } else {
            this.shortName = kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(this.fqName);
            this.parent = kotlin.reflect.jvm.internal.impl.name.FqName.ROOT.toUnsafe();
        }
    }

    public java.lang.String asString() {
        java.lang.String str = this.fqName;
        if (str == null) {
            $$$reportNull$$$0(4);
        }
        return str;
    }

    public boolean isSafe() {
        return this.safe != null || asString().indexOf(60) < 0;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName toSafe() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.safe;
        if (fqName != null) {
            if (fqName == null) {
                $$$reportNull$$$0(5);
            }
            return fqName;
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = new kotlin.reflect.jvm.internal.impl.name.FqName(this);
        this.safe = fqName2;
        if (fqName2 == null) {
            $$$reportNull$$$0(6);
        }
        return fqName2;
    }

    public boolean isRoot() {
        return this.fqName.isEmpty();
    }

    public kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe parent() {
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = this.parent;
        if (fqNameUnsafe != null) {
            if (fqNameUnsafe == null) {
                $$$reportNull$$$0(7);
            }
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root");
        }
        compute();
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe2 = this.parent;
        if (fqNameUnsafe2 == null) {
            $$$reportNull$$$0(8);
        }
        return fqNameUnsafe2;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe child(kotlin.reflect.jvm.internal.impl.name.Name name) {
        java.lang.String strAsString;
        if (name == null) {
            $$$reportNull$$$0(9);
        }
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.fqName + "." + name.asString();
        }
        return new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(strAsString, this, name);
    }

    public kotlin.reflect.jvm.internal.impl.name.Name shortName() {
        kotlin.reflect.jvm.internal.impl.name.Name name = this.shortName;
        if (name != null) {
            if (name == null) {
                $$$reportNull$$$0(10);
            }
            return name;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root");
        }
        compute();
        kotlin.reflect.jvm.internal.impl.name.Name name2 = this.shortName;
        if (name2 == null) {
            $$$reportNull$$$0(11);
        }
        return name2;
    }

    public kotlin.reflect.jvm.internal.impl.name.Name shortNameOrSpecial() {
        if (isRoot()) {
            kotlin.reflect.jvm.internal.impl.name.Name name = ROOT_NAME;
            if (name == null) {
                $$$reportNull$$$0(12);
            }
            return name;
        }
        kotlin.reflect.jvm.internal.impl.name.Name nameShortName = shortName();
        if (nameShortName == null) {
            $$$reportNull$$$0(13);
        }
        return nameShortName;
    }

    public java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments() {
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> listEmptyList = isRoot() ? java.util.Collections.emptyList() : kotlin.collections.ArraysKt.map(SPLIT_BY_DOTS.split(this.fqName), STRING_TO_NAME);
        if (listEmptyList == null) {
            $$$reportNull$$$0(14);
        }
        return listEmptyList;
    }

    public boolean startsWith(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null) {
            $$$reportNull$$$0(15);
        }
        int iIndexOf = this.fqName.indexOf(46);
        if (isRoot()) {
            return false;
        }
        java.lang.String str = this.fqName;
        java.lang.String strAsString = name.asString();
        if (iIndexOf == -1) {
            iIndexOf = this.fqName.length();
        }
        return str.regionMatches(0, strAsString, 0, iIndexOf);
    }

    public static kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe topLevel(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null) {
            $$$reportNull$$$0(16);
        }
        return new kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe(name.asString(), kotlin.reflect.jvm.internal.impl.name.FqName.ROOT.toUnsafe(), name);
    }

    public java.lang.String toString() {
        java.lang.String strAsString = isRoot() ? ROOT_NAME.asString() : this.fqName;
        if (strAsString == null) {
            $$$reportNull$$$0(17);
        }
        return strAsString;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe) && this.fqName.equals(((kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }
}
