package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* JADX INFO: loaded from: classes2.dex */
public class JvmClassName {
    private kotlin.reflect.jvm.internal.impl.name.FqName fqName;
    private final java.lang.String internalName;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byInternalName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(0);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName(str);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byClassId(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        if (classId == null) {
            $$$reportNull$$$0(1);
        }
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName = classId.getPackageFqName();
        java.lang.String strReplace = classId.getRelativeClassName().asString().replace('.', kotlin.text.Typography.dollar);
        if (packageFqName.isRoot()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName(strReplace);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName(packageFqName.asString().replace('.', '/') + "/" + strReplace);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName byFqNameWithoutInnerClasses(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (fqName == null) {
            $$$reportNull$$$0(2);
        }
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName jvmClassName = new kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName(fqName.asString().replace('.', '/'));
        jvmClassName.fqName = fqName;
        return jvmClassName;
    }

    private JvmClassName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(5);
        }
        this.internalName = str;
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new kotlin.reflect.jvm.internal.impl.name.FqName(this.internalName.replace('/', '.'));
    }

    public kotlin.reflect.jvm.internal.impl.name.FqName getPackageFqName() {
        int iLastIndexOf = this.internalName.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.name.FqName.ROOT;
            if (fqName == null) {
                $$$reportNull$$$0(7);
            }
            return fqName;
        }
        return new kotlin.reflect.jvm.internal.impl.name.FqName(this.internalName.substring(0, iLastIndexOf).replace('/', '.'));
    }

    public java.lang.String getInternalName() {
        java.lang.String str = this.internalName;
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        return str;
    }

    public java.lang.String toString() {
        return this.internalName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.internalName.equals(((kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName) obj).internalName);
    }

    public int hashCode() {
        return this.internalName.hashCode();
    }
}
