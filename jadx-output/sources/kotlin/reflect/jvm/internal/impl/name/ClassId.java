package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassId {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean local;
    private final kotlin.reflect.jvm.internal.impl.name.FqName packageFqName;
    private final kotlin.reflect.jvm.internal.impl.name.FqName relativeClassName;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i == 13 || i == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 5 && i != 6 && i != 7 && i != 9 && i != 13 && i != 14) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static kotlin.reflect.jvm.internal.impl.name.ClassId topLevel(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (fqName == null) {
            $$$reportNull$$$0(0);
        }
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(fqName.parent(), fqName.shortName());
    }

    public ClassId(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.FqName fqName2, boolean z) {
        if (fqName == null) {
            $$$reportNull$$$0(1);
        }
        if (fqName2 == null) {
            $$$reportNull$$$0(2);
        }
        this.packageFqName = fqName;
        this.relativeClassName = fqName2;
        this.local = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.Name name) {
        this(fqName, kotlin.reflect.jvm.internal.impl.name.FqName.topLevel(name), false);
        if (fqName == null) {
            $$$reportNull$$$0(3);
        }
        if (name == null) {
            $$$reportNull$$$0(4);
        }
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getPackageFqName() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.packageFqName;
        if (fqName == null) {
            $$$reportNull$$$0(5);
        }
        return fqName;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getRelativeClassName() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.relativeClassName;
        if (fqName == null) {
            $$$reportNull$$$0(6);
        }
        return fqName;
    }

    public kotlin.reflect.jvm.internal.impl.name.Name getShortClassName() {
        kotlin.reflect.jvm.internal.impl.name.Name nameShortName = this.relativeClassName.shortName();
        if (nameShortName == null) {
            $$$reportNull$$$0(7);
        }
        return nameShortName;
    }

    public boolean isLocal() {
        return this.local;
    }

    public kotlin.reflect.jvm.internal.impl.name.ClassId createNestedClassId(kotlin.reflect.jvm.internal.impl.name.Name name) {
        if (name == null) {
            $$$reportNull$$$0(8);
        }
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(getPackageFqName(), this.relativeClassName.child(name), this.local);
    }

    public kotlin.reflect.jvm.internal.impl.name.ClassId getOuterClassId() {
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameParent = this.relativeClassName.parent();
        if (fqNameParent.isRoot()) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(getPackageFqName(), fqNameParent, this.local);
    }

    public boolean isNestedClass() {
        return !this.relativeClassName.parent().isRoot();
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName() {
        if (this.packageFqName.isRoot()) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = this.relativeClassName;
            if (fqName == null) {
                $$$reportNull$$$0(9);
            }
            return fqName;
        }
        return new kotlin.reflect.jvm.internal.impl.name.FqName(this.packageFqName.asString() + "." + this.relativeClassName.asString());
    }

    public static kotlin.reflect.jvm.internal.impl.name.ClassId fromString(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        return fromString(str, false);
    }

    public static kotlin.reflect.jvm.internal.impl.name.ClassId fromString(java.lang.String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(12);
        }
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(new kotlin.reflect.jvm.internal.impl.name.FqName(kotlin.text.StringsKt.substringBeforeLast(str, '/', "").replace('/', '.')), new kotlin.reflect.jvm.internal.impl.name.FqName(kotlin.text.StringsKt.substringAfterLast(str, '/', str)), z);
    }

    public java.lang.String asString() {
        if (this.packageFqName.isRoot()) {
            java.lang.String strAsString = this.relativeClassName.asString();
            if (strAsString == null) {
                $$$reportNull$$$0(13);
            }
            return strAsString;
        }
        java.lang.String str = this.packageFqName.asString().replace('.', '/') + "/" + this.relativeClassName.asString();
        if (str == null) {
            $$$reportNull$$$0(14);
        }
        return str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = (kotlin.reflect.jvm.internal.impl.name.ClassId) obj;
        return this.packageFqName.equals(classId.packageFqName) && this.relativeClassName.equals(classId.relativeClassName) && this.local == classId.local;
    }

    public int hashCode() {
        return (((this.packageFqName.hashCode() * 31) + this.relativeClassName.hashCode()) * 31) + java.lang.Boolean.valueOf(this.local).hashCode();
    }

    public java.lang.String toString() {
        if (!this.packageFqName.isRoot()) {
            return asString();
        }
        return "/" + asString();
    }
}
