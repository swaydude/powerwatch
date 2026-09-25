package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KotlinBuiltIns {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final kotlin.reflect.jvm.internal.impl.name.FqName ANNOTATION_PACKAGE_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.Name BUILTINS_MODULE_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName BUILT_INS_PACKAGE_FQ_NAME;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> BUILT_INS_PACKAGE_FQ_NAMES;
    public static final kotlin.reflect.jvm.internal.impl.name.Name BUILT_INS_PACKAGE_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName COLLECTIONS_PACKAGE_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FqNames FQ_NAMES;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName RANGES_PACKAGE_FQ_NAME;
    public static final kotlin.reflect.jvm.internal.impl.name.FqName TEXT_PACKAGE_FQ_NAME;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> builtInClassesByName;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor>> builtInPackagesImportedByDefault;
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl builtInsModule;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives> primitives;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 81:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                i2 = 2;
                break;
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 81:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 71:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 8:
            case 9:
            case 76:
            case 77:
            case 85:
            case 92:
            case 99:
            case 103:
            case 104:
            case 136:
            case 137:
            case 139:
            case 147:
            case 148:
            case 149:
                objArr[0] = "descriptor";
                break;
            case 11:
            case 94:
            case 96:
            case 98:
            case 100:
            case 102:
            case 126:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 15:
            case 16:
            case 52:
            case 84:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 93:
            case 95:
            case 101:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case kotlinx.coroutines.scheduling.WorkQueueKt.MASK /* 127 */:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 138:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 151:
                objArr[0] = "type";
                break;
            case 45:
                objArr[0] = "classSimpleName";
                break;
            case 66:
                objArr[0] = "arrayType";
                break;
            case 70:
                objArr[0] = "notNullArrayType";
                break;
            case 72:
            case 152:
                objArr[0] = "primitiveType";
                break;
            case 74:
                objArr[0] = "kotlinType";
                break;
            case 75:
                objArr[0] = "arrayFqName";
                break;
            case 78:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 81:
                objArr[0] = "argument";
                break;
            case 97:
                objArr[0] = "typeConstructor";
                break;
            case 108:
                objArr[0] = "classDescriptor";
                break;
            case powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax /* 150 */:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 81:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 17:
                objArr[1] = "getFunctionName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKClass";
                break;
            case 20:
                objArr[1] = "getKDeclarationContainer";
                break;
            case 21:
                objArr[1] = "getKCallable";
                break;
            case 22:
                objArr[1] = "getKProperty";
                break;
            case 23:
                objArr[1] = "getKProperty0";
                break;
            case 24:
                objArr[1] = "getKProperty1";
                break;
            case 25:
                objArr[1] = "getKProperty2";
                break;
            case 26:
                objArr[1] = "getKMutableProperty0";
                break;
            case 27:
                objArr[1] = "getKMutableProperty1";
                break;
            case 28:
                objArr[1] = "getKMutableProperty2";
                break;
            case 29:
                objArr[1] = "getIterator";
                break;
            case 30:
                objArr[1] = "getIterable";
                break;
            case 31:
                objArr[1] = "getMutableIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterator";
                break;
            case 33:
                objArr[1] = "getCollection";
                break;
            case 34:
                objArr[1] = "getMutableCollection";
                break;
            case 35:
                objArr[1] = "getList";
                break;
            case 36:
                objArr[1] = "getMutableList";
                break;
            case 37:
                objArr[1] = "getSet";
                break;
            case 38:
                objArr[1] = "getMutableSet";
                break;
            case 39:
                objArr[1] = "getMap";
                break;
            case 40:
                objArr[1] = "getMutableMap";
                break;
            case 41:
                objArr[1] = "getMapEntry";
                break;
            case 42:
                objArr[1] = "getMutableMapEntry";
                break;
            case 43:
                objArr[1] = "getListIterator";
                break;
            case 44:
                objArr[1] = "getMutableListIterator";
                break;
            case 46:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 47:
                objArr[1] = "getNothingType";
                break;
            case 48:
                objArr[1] = "getNullableNothingType";
                break;
            case 49:
                objArr[1] = "getAnyType";
                break;
            case 50:
                objArr[1] = "getNullableAnyType";
                break;
            case 51:
                objArr[1] = "getDefaultBound";
                break;
            case 53:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 54:
                objArr[1] = "getNumberType";
                break;
            case 55:
                objArr[1] = "getByteType";
                break;
            case 56:
                objArr[1] = "getShortType";
                break;
            case 57:
                objArr[1] = "getIntType";
                break;
            case 58:
                objArr[1] = "getLongType";
                break;
            case 59:
                objArr[1] = "getFloatType";
                break;
            case 60:
                objArr[1] = "getDoubleType";
                break;
            case 61:
                objArr[1] = "getCharType";
                break;
            case 62:
                objArr[1] = "getBooleanType";
                break;
            case 63:
                objArr[1] = "getUnitType";
                break;
            case 64:
                objArr[1] = "getStringType";
                break;
            case 65:
                objArr[1] = "getIterableType";
                break;
            case 67:
            case 68:
            case 69:
                objArr[1] = "getArrayElementType";
                break;
            case 73:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 80:
                objArr[1] = "getArrayType";
                break;
            case 82:
                objArr[1] = "getEnumType";
                break;
            case 83:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 13:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 15:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 16:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 45:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 52:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 66:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
            case 71:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 72:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 75:
            case 87:
                objArr[2] = "isPrimitiveArray";
                break;
            case 76:
            case 89:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
                objArr[2] = "getArrayType";
                break;
            case 81:
                objArr[2] = "getEnumType";
                break;
            case 84:
                objArr[2] = "isArray";
                break;
            case 85:
            case 86:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 88:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 90:
                objArr[2] = "isPrimitiveType";
                break;
            case 91:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 92:
                objArr[2] = "isPrimitiveClass";
                break;
            case 93:
            case 94:
            case 95:
            case 96:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 97:
            case 98:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 99:
            case 100:
                objArr[2] = "classFqNameEquals";
                break;
            case 101:
            case 102:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 103:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 104:
            case 105:
                objArr[2] = "isAny";
                break;
            case 106:
            case 108:
                objArr[2] = "isBoolean";
                break;
            case 107:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 109:
                objArr[2] = "isNumber";
                break;
            case 110:
                objArr[2] = "isChar";
                break;
            case 111:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 112:
                objArr[2] = "isInt";
                break;
            case 113:
                objArr[2] = "isByte";
                break;
            case 114:
                objArr[2] = "isLong";
                break;
            case 115:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 116:
                objArr[2] = "isShort";
                break;
            case 117:
                objArr[2] = "isFloat";
                break;
            case 118:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 119:
                objArr[2] = "isDouble";
                break;
            case 120:
                objArr[2] = "isUByte";
                break;
            case 121:
                objArr[2] = "isUShort";
                break;
            case 122:
                objArr[2] = "isUInt";
                break;
            case 123:
                objArr[2] = "isULong";
                break;
            case 124:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 125:
            case 126:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case kotlinx.coroutines.scheduling.WorkQueueKt.MASK /* 127 */:
                objArr[2] = "isNothing";
                break;
            case 128:
                objArr[2] = "isNullableNothing";
                break;
            case 129:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 130:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 131:
                objArr[2] = "isNullableAny";
                break;
            case 132:
                objArr[2] = "isDefaultBound";
                break;
            case 133:
                objArr[2] = "isUnit";
                break;
            case 134:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 135:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 136:
                objArr[2] = "isMemberOfAny";
                break;
            case 137:
            case 138:
                objArr[2] = "isEnum";
                break;
            case 139:
            case 140:
                objArr[2] = "isComparable";
                break;
            case 141:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 142:
                objArr[2] = "isListOrNullableList";
                break;
            case 143:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 144:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 145:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 146:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 147:
                objArr[2] = "isKClass";
                break;
            case 148:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 149:
                objArr[2] = "isCloneable";
                break;
            case powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax /* 150 */:
                objArr[2] = "isDeprecated";
                break;
            case 151:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            case 152:
                objArr[2] = "getPrimitiveFqName";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 82:
            case 83:
                throw new java.lang.IllegalStateException(str2);
            case 8:
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 45:
            case 52:
            case 66:
            case 70:
            case 71:
            case 72:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 81:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("kotlin");
        BUILT_INS_PACKAGE_NAME = nameIdentifier;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.name.FqName.topLevel(nameIdentifier);
        BUILT_INS_PACKAGE_FQ_NAME = fqName;
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild = fqName.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier("annotation"));
        ANNOTATION_PACKAGE_FQ_NAME = fqNameChild;
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild2 = fqName.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier("collections"));
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameChild2;
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild3 = fqName.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier("ranges"));
        RANGES_PACKAGE_FQ_NAME = fqNameChild3;
        TEXT_PACKAGE_FQ_NAME = fqName.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier("text"));
        BUILT_INS_PACKAGE_FQ_NAMES = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.name.FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild, kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME(), fqName.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier("internal")), kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE});
        FQ_NAMES = new kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FqNames();
        BUILTINS_MODULE_NAME = kotlin.reflect.jvm.internal.impl.name.Name.special("<built-ins module>");
    }

    protected KotlinBuiltIns(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
        if (storageManager == null) {
            $$$reportNull$$$0(0);
        }
        this.storageManager = storageManager;
        this.builtInPackagesImportedByDefault = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            @Override // kotlin.jvm.functions.Function0
            public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor> invoke() {
                return java.util.Arrays.asList(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.builtInsModule.getPackage(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.builtInsModule.getPackage(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.COLLECTIONS_PACKAGE_FQ_NAME), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.builtInsModule.getPackage(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.RANGES_PACKAGE_FQ_NAME), kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.builtInsModule.getPackage(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.ANNOTATION_PACKAGE_FQ_NAME));
            }
        });
        this.primitives = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.2
            @Override // kotlin.jvm.functions.Function0
            public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives invoke() {
                java.util.EnumMap enumMap = new java.util.EnumMap(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.class);
                java.util.HashMap map = new java.util.HashMap();
                java.util.HashMap map2 = new java.util.HashMap();
                for (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType : kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values()) {
                    kotlin.reflect.jvm.internal.impl.types.SimpleType builtInTypeByClassName = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getTypeName().asString());
                    kotlin.reflect.jvm.internal.impl.types.SimpleType builtInTypeByClassName2 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInTypeByClassName(primitiveType.getArrayTypeName().asString());
                    enumMap.put(primitiveType, builtInTypeByClassName2);
                    map.put(builtInTypeByClassName, builtInTypeByClassName2);
                    map2.put(builtInTypeByClassName2, builtInTypeByClassName);
                }
                return new kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.Primitives(enumMap, map, map2);
            }
        });
        this.builtInClassesByName = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.3
            @Override // kotlin.jvm.functions.Function1
            public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor invoke(kotlin.reflect.jvm.internal.impl.name.Name name) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.getBuiltInsPackageScope().mo1270getContributedClassifier(name, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
                if (contributedClassifier == null) {
                    throw new java.lang.AssertionError("Built-in class " + kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(name) + " is not found");
                }
                if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                    throw new java.lang.AssertionError("Must be a class descriptor " + name + ", but was " + contributedClassifier);
                }
                return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
            }
        });
    }

    protected void createBuiltInsModule(boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.storageManager, this, null);
        this.builtInsModule = moduleDescriptorImpl;
        moduleDescriptorImpl.initialize(kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.storageManager, this.builtInsModule, getClassDescriptorFactories(), getPlatformDependentDeclarationFilter(), getAdditionalClassPartsProvider(), z));
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl2 = this.builtInsModule;
        moduleDescriptorImpl2.setDependencies(moduleDescriptorImpl2);
    }

    public void setBuiltInsModule(final kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            $$$reportNull$$$0(1);
        }
        this.storageManager.compute(new kotlin.jvm.functions.Function0<java.lang.Void>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.4
            @Override // kotlin.jvm.functions.Function0
            public java.lang.Void invoke() {
                if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.builtInsModule != null) {
                    throw new java.lang.AssertionError("Built-ins module is already set: " + kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.builtInsModule + " (attempting to reset to " + moduleDescriptorImpl + ")");
                }
                kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.this.builtInsModule = moduleDescriptorImpl;
                return null;
            }
        });
    }

    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None none = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider.None.INSTANCE;
        if (none == null) {
            $$$reportNull$$$0(2);
        }
        return none;
    }

    protected kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent == null) {
            $$$reportNull$$$0(3);
        }
        return noPlatformDependent;
    }

    protected java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory> getClassDescriptorFactories() {
        java.util.List listSingletonList = java.util.Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory(this.storageManager, this.builtInsModule));
        if (listSingletonList == null) {
            $$$reportNull$$$0(4);
        }
        return listSingletonList;
    }

    protected kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = this.storageManager;
        if (storageManager == null) {
            $$$reportNull$$$0(5);
        }
        return storageManager;
    }

    private static class Primitives {
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType> kotlinArrayTypeToPrimitiveKotlinType;
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType> primitiveKotlinTypeToKotlinArrayType;
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.types.SimpleType> primitiveTypeToArrayKotlinType;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private Primitives(java.util.Map<kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, kotlin.reflect.jvm.internal.impl.types.SimpleType> map, java.util.Map<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType> map2, java.util.Map<kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType> map3) {
            if (map == null) {
                $$$reportNull$$$0(0);
            }
            if (map2 == null) {
                $$$reportNull$$$0(1);
            }
            if (map3 == null) {
                $$$reportNull$$$0(2);
            }
            this.primitiveTypeToArrayKotlinType = map;
            this.primitiveKotlinTypeToKotlinArrayType = map2;
            this.kotlinArrayTypeToPrimitiveKotlinType = map3;
        }
    }

    public static class FqNames {
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> arrayClassFqNameToPrimitiveType;
        public final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType> fqNameToPrimitiveType;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kCallable;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kClass;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kDeclarationContainer;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kMutableProperty0;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kMutableProperty1;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kMutableProperty2;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kMutablePropertyFqName;
        public final kotlin.reflect.jvm.internal.impl.name.ClassId kProperty;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kProperty0;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kProperty1;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kProperty2;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe kPropertyFqName;
        public final kotlin.reflect.jvm.internal.impl.name.FqName map;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mapEntry;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableCollection;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableIterable;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableIterator;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableList;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableListIterator;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableMap;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableMapEntry;
        public final kotlin.reflect.jvm.internal.impl.name.FqName mutableSet;
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> primitiveArrayTypeShortNames;
        public final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> primitiveTypeShortNames;
        public final kotlin.reflect.jvm.internal.impl.name.ClassId uByte;
        public final kotlin.reflect.jvm.internal.impl.name.FqName uByteFqName;
        public final kotlin.reflect.jvm.internal.impl.name.ClassId uInt;
        public final kotlin.reflect.jvm.internal.impl.name.FqName uIntFqName;
        public final kotlin.reflect.jvm.internal.impl.name.ClassId uLong;
        public final kotlin.reflect.jvm.internal.impl.name.FqName uLongFqName;
        public final kotlin.reflect.jvm.internal.impl.name.ClassId uShort;
        public final kotlin.reflect.jvm.internal.impl.name.FqName uShortFqName;
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe any = fqNameUnsafe("Any");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe nothing = fqNameUnsafe("Nothing");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe cloneable = fqNameUnsafe("Cloneable");
        public final kotlin.reflect.jvm.internal.impl.name.FqName suppress = fqName("Suppress");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unit = fqNameUnsafe("Unit");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe charSequence = fqNameUnsafe("CharSequence");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe string = fqNameUnsafe("String");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe array = fqNameUnsafe("Array");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _boolean = fqNameUnsafe("Boolean");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _char = fqNameUnsafe("Char");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _byte = fqNameUnsafe("Byte");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _short = fqNameUnsafe("Short");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _int = fqNameUnsafe("Int");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _long = fqNameUnsafe("Long");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _float = fqNameUnsafe("Float");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _double = fqNameUnsafe("Double");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe number = fqNameUnsafe("Number");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe _enum = fqNameUnsafe("Enum");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe functionSupertype = fqNameUnsafe("Function");
        public final kotlin.reflect.jvm.internal.impl.name.FqName throwable = fqName("Throwable");
        public final kotlin.reflect.jvm.internal.impl.name.FqName comparable = fqName("Comparable");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe intRange = rangesFqName("IntRange");
        public final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe longRange = rangesFqName("LongRange");
        public final kotlin.reflect.jvm.internal.impl.name.FqName deprecated = fqName("Deprecated");
        public final kotlin.reflect.jvm.internal.impl.name.FqName deprecationLevel = fqName("DeprecationLevel");
        public final kotlin.reflect.jvm.internal.impl.name.FqName replaceWith = fqName("ReplaceWith");
        public final kotlin.reflect.jvm.internal.impl.name.FqName extensionFunctionType = fqName("ExtensionFunctionType");
        public final kotlin.reflect.jvm.internal.impl.name.FqName parameterName = fqName("ParameterName");
        public final kotlin.reflect.jvm.internal.impl.name.FqName annotation = fqName("Annotation");
        public final kotlin.reflect.jvm.internal.impl.name.FqName target = annotationName("Target");
        public final kotlin.reflect.jvm.internal.impl.name.FqName annotationTarget = annotationName("AnnotationTarget");
        public final kotlin.reflect.jvm.internal.impl.name.FqName annotationRetention = annotationName("AnnotationRetention");
        public final kotlin.reflect.jvm.internal.impl.name.FqName retention = annotationName("Retention");
        public final kotlin.reflect.jvm.internal.impl.name.FqName repeatable = annotationName("Repeatable");
        public final kotlin.reflect.jvm.internal.impl.name.FqName mustBeDocumented = annotationName("MustBeDocumented");
        public final kotlin.reflect.jvm.internal.impl.name.FqName unsafeVariance = fqName("UnsafeVariance");
        public final kotlin.reflect.jvm.internal.impl.name.FqName publishedApi = fqName("PublishedApi");
        public final kotlin.reflect.jvm.internal.impl.name.FqName iterator = collectionsFqName("Iterator");
        public final kotlin.reflect.jvm.internal.impl.name.FqName iterable = collectionsFqName("Iterable");
        public final kotlin.reflect.jvm.internal.impl.name.FqName collection = collectionsFqName("Collection");
        public final kotlin.reflect.jvm.internal.impl.name.FqName list = collectionsFqName("List");
        public final kotlin.reflect.jvm.internal.impl.name.FqName listIterator = collectionsFqName("ListIterator");
        public final kotlin.reflect.jvm.internal.impl.name.FqName set = collectionsFqName("Set");

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) ? 2 : 3];
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            } else {
                objArr[0] = "simpleName";
            }
            if (i == 1) {
                objArr[1] = "fqNameUnsafe";
            } else if (i == 3) {
                objArr[1] = "fqName";
            } else if (i == 5) {
                objArr[1] = "collectionsFqName";
            } else if (i == 7) {
                objArr[1] = "rangesFqName";
            } else if (i == 9) {
                objArr[1] = "reflect";
            } else if (i != 11) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$FqNames";
            } else {
                objArr[1] = "annotationName";
            }
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    break;
                case 2:
                    objArr[2] = "fqName";
                    break;
                case 4:
                    objArr[2] = "collectionsFqName";
                    break;
                case 6:
                    objArr[2] = "rangesFqName";
                    break;
                case 8:
                    objArr[2] = "reflect";
                    break;
                case 10:
                    objArr[2] = "annotationName";
                    break;
                default:
                    objArr[2] = "fqNameUnsafe";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        public FqNames() {
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameCollectionsFqName = collectionsFqName("Map");
            this.map = fqNameCollectionsFqName;
            this.mapEntry = fqNameCollectionsFqName.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier("Entry"));
            this.mutableIterator = collectionsFqName("MutableIterator");
            this.mutableIterable = collectionsFqName("MutableIterable");
            this.mutableCollection = collectionsFqName("MutableCollection");
            this.mutableList = collectionsFqName("MutableList");
            this.mutableListIterator = collectionsFqName("MutableListIterator");
            this.mutableSet = collectionsFqName("MutableSet");
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameCollectionsFqName2 = collectionsFqName("MutableMap");
            this.mutableMap = fqNameCollectionsFqName2;
            this.mutableMapEntry = fqNameCollectionsFqName2.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier("MutableEntry"));
            this.kClass = reflect("KClass");
            this.kCallable = reflect("KCallable");
            this.kProperty0 = reflect("KProperty0");
            this.kProperty1 = reflect("KProperty1");
            this.kProperty2 = reflect("KProperty2");
            this.kMutableProperty0 = reflect("KMutableProperty0");
            this.kMutableProperty1 = reflect("KMutableProperty1");
            this.kMutableProperty2 = reflect("KMutableProperty2");
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            this.kPropertyFqName = fqNameUnsafeReflect;
            this.kMutablePropertyFqName = reflect("KMutableProperty");
            this.kProperty = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqNameUnsafeReflect.toSafe());
            this.kDeclarationContainer = reflect("KDeclarationContainer");
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = fqName("UByte");
            this.uByteFqName = fqName;
            kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = fqName("UShort");
            this.uShortFqName = fqName2;
            kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = fqName("UInt");
            this.uIntFqName = fqName3;
            kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = fqName("ULong");
            this.uLongFqName = fqName4;
            this.uByte = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqName);
            this.uShort = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqName2);
            this.uInt = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqName3);
            this.uLong = kotlin.reflect.jvm.internal.impl.name.ClassId.topLevel(fqName4);
            this.primitiveTypeShortNames = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashSetWithExpectedSize(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values().length);
            this.primitiveArrayTypeShortNames = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashSetWithExpectedSize(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values().length);
            this.fqNameToPrimitiveType = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashMapWithExpectedSize(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values().length);
            this.arrayClassFqNameToPrimitiveType = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashMapWithExpectedSize(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values().length);
            for (kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType : kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values()) {
                this.primitiveTypeShortNames.add(primitiveType.getTypeName());
                this.primitiveArrayTypeShortNames.add(primitiveType.getArrayTypeName());
                this.fqNameToPrimitiveType.put(fqNameUnsafe(primitiveType.getTypeName().asString()), primitiveType);
                this.arrayClassFqNameToPrimitiveType.put(fqNameUnsafe(primitiveType.getArrayTypeName().asString()), primitiveType);
            }
        }

        private static kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = fqName(str).toUnsafe();
            if (unsafe == null) {
                $$$reportNull$$$0(1);
            }
            return unsafe;
        }

        private static kotlin.reflect.jvm.internal.impl.name.FqName fqName(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(2);
            }
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.BUILT_INS_PACKAGE_FQ_NAME.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str));
            if (fqNameChild == null) {
                $$$reportNull$$$0(3);
            }
            return fqNameChild;
        }

        private static kotlin.reflect.jvm.internal.impl.name.FqName collectionsFqName(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(4);
            }
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.COLLECTIONS_PACKAGE_FQ_NAME.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str));
            if (fqNameChild == null) {
                $$$reportNull$$$0(5);
            }
            return fqNameChild;
        }

        private static kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe rangesFqName(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(6);
            }
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.RANGES_PACKAGE_FQ_NAME.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str)).toUnsafe();
            if (unsafe == null) {
                $$$reportNull$$$0(7);
            }
            return unsafe;
        }

        private static kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe reflect(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(8);
            }
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe = kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypesKt.getKOTLIN_REFLECT_FQ_NAME().child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str)).toUnsafe();
            if (unsafe == null) {
                $$$reportNull$$$0(9);
            }
            return unsafe;
        }

        private static kotlin.reflect.jvm.internal.impl.name.FqName annotationName(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(10);
            }
            kotlin.reflect.jvm.internal.impl.name.FqName fqNameChild = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.ANNOTATION_PACKAGE_FQ_NAME.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str));
            if (fqNameChild == null) {
                $$$reportNull$$$0(11);
            }
            return fqNameChild;
        }
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl getBuiltInsModule() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl moduleDescriptorImpl = this.builtInsModule;
        if (moduleDescriptorImpl == null) {
            $$$reportNull$$$0(6);
        }
        return moduleDescriptorImpl;
    }

    public static boolean isBuiltIn(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(8);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor, kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment.class, false) != null;
    }

    public static boolean isUnderKotlinPackage(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(9);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                return ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getBuiltInsPackageScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this.builtInsModule.getPackage(BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope == null) {
            $$$reportNull$$$0(10);
        }
        return memberScope;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        if (fqName == null) {
            $$$reportNull$$$0(11);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorResolveClassByFqName = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.resolveClassByFqName(this.builtInsModule, fqName, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorResolveClassByFqName == null) {
            $$$reportNull$$$0(12);
        }
        return classDescriptorResolveClassByFqName;
    }

    private kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getBuiltInClassByName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(13);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorInvoke = this.builtInClassesByName.invoke(kotlin.reflect.jvm.internal.impl.name.Name.identifier(str));
        if (classDescriptorInvoke == null) {
            $$$reportNull$$$0(14);
        }
        return classDescriptorInvoke;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getAny() {
        return getBuiltInClassByName("Any");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getNothing() {
        return getBuiltInClassByName("Nothing");
    }

    private kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getPrimitiveClassDescriptor(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(15);
        }
        return getBuiltInClassByName(primitiveType.getTypeName().asString());
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getArray() {
        return getBuiltInClassByName("Array");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getNumber() {
        return getBuiltInClassByName("Number");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getUnit() {
        return getBuiltInClassByName("Unit");
    }

    public static java.lang.String getFunctionName(int i) {
        java.lang.String str = "Function" + i;
        if (str == null) {
            $$$reportNull$$$0(17);
        }
        return str;
    }

    public static kotlin.reflect.jvm.internal.impl.name.ClassId getFunctionClassId(int i) {
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(BUILT_INS_PACKAGE_FQ_NAME, kotlin.reflect.jvm.internal.impl.name.Name.identifier(getFunctionName(i)));
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getFunction(int i) {
        return getBuiltInClassByName(getFunctionName(i));
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getSuspendFunction(int i) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE.child(kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor.Kind.SuspendFunction.getClassNamePrefix() + i)));
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(18);
        }
        return builtInClassByFqName;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getString() {
        return getBuiltInClassByName("String");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getComparable() {
        return getBuiltInClassByName("Comparable");
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getKClass() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(FQ_NAMES.kClass.toSafe());
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(19);
        }
        return builtInClassByFqName;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getCollection() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(FQ_NAMES.collection);
        if (builtInClassByFqName == null) {
            $$$reportNull$$$0(33);
        }
        return builtInClassByFqName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kotlin.reflect.jvm.internal.impl.types.SimpleType getBuiltInTypeByClassName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(45);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getBuiltInClassByName(str).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(46);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNothingType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getNothing().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(47);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNullableNothingType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeMakeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(48);
        }
        return simpleTypeMakeNullableAsSpecified;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getAnyType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getAny().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(49);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNullableAnyType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeMakeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(50);
        }
        return simpleTypeMakeNullableAsSpecified;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDefaultBound() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = getNullableAnyType();
        if (nullableAnyType == null) {
            $$$reportNull$$$0(51);
        }
        return nullableAnyType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(52);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getPrimitiveClassDescriptor(primitiveType).getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(53);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getNumberType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getNumber().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(54);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getByteType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(55);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getShortType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(56);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getIntType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(57);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getLongType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(58);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getFloatType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(59);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getDoubleType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(60);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getCharType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(61);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getBooleanType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType primitiveKotlinType = getPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN);
        if (primitiveKotlinType == null) {
            $$$reportNull$$$0(62);
        }
        return primitiveKotlinType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getUnitType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getUnit().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(63);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getStringType() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = getString().getDefaultType();
        if (defaultType == null) {
            $$$reportNull$$$0(64);
        }
        return defaultType;
    }

    public kotlin.reflect.jvm.internal.impl.types.KotlinType getArrayElementType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType elementTypeForUnsignedArray;
        if (kotlinType == null) {
            $$$reportNull$$$0(66);
        }
        if (isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                throw new java.lang.IllegalStateException();
            }
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = kotlinType.getArguments().get(0).getType();
            if (type == null) {
                $$$reportNull$$$0(67);
            }
            return type;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinTypeMakeNotNullable = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(kotlinType);
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.primitives.invoke().kotlinArrayTypeToPrimitiveKotlinType.get(kotlinTypeMakeNotNullable);
        if (simpleType != null) {
            if (simpleType == null) {
                $$$reportNull$$$0(68);
            }
            return simpleType;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingModuleOrNull = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModuleOrNull(kotlinTypeMakeNotNullable);
        if (containingModuleOrNull != null && (elementTypeForUnsignedArray = getElementTypeForUnsignedArray(kotlinTypeMakeNotNullable, containingModuleOrNull)) != null) {
            if (elementTypeForUnsignedArray == null) {
                $$$reportNull$$$0(69);
            }
            return elementTypeForUnsignedArray;
        }
        throw new java.lang.IllegalStateException("not array: " + kotlinType);
    }

    private static kotlin.reflect.jvm.internal.impl.types.KotlinType getElementTypeForUnsignedArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        kotlin.reflect.jvm.internal.impl.name.ClassId unsignedClassIdByArrayClassId;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
        if (kotlinType == null) {
            $$$reportNull$$$0(70);
        }
        if (moduleDescriptor == null) {
            $$$reportNull$$$0(71);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        if (classifierDescriptorMo1268getDeclarationDescriptor == null || !kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.isShortNameOfUnsignedArray(classifierDescriptorMo1268getDeclarationDescriptor.getName()) || (classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classifierDescriptorMo1268getDeclarationDescriptor)) == null || (unsignedClassIdByArrayClassId = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.getUnsignedClassIdByArrayClassId(classId)) == null || (classDescriptorFindClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, unsignedClassIdByArrayClassId)) == null) {
            return null;
        }
        return classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getPrimitiveArrayKotlinType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(72);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.primitives.invoke().primitiveTypeToArrayKotlinType.get(primitiveType);
        if (simpleType == null) {
            $$$reportNull$$$0(73);
        }
        return simpleType;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getPrimitiveArrayKotlinTypeByPrimitiveKotlinType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingModuleOrNull;
        if (kotlinType == null) {
            $$$reportNull$$$0(74);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = this.primitives.invoke().primitiveKotlinTypeToKotlinArrayType.get(kotlinType);
        if (simpleType != null) {
            return simpleType;
        }
        if (!kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.isUnsignedType(kotlinType) || kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType) || (containingModuleOrNull = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModuleOrNull(kotlinType)) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(containingModuleOrNull, kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE.getUnsignedArrayClassIdByUnsignedClassId(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(kotlinType.getConstructor().mo1268getDeclarationDescriptor())));
        if (classDescriptorFindClassAcrossModuleDependencies == null) {
            return null;
        }
        return classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
    }

    public static boolean isPrimitiveArray(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(75);
        }
        return FQ_NAMES.arrayClassFqNameToPrimitiveType.get(fqNameUnsafe) != null;
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(76);
        }
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FqNames fqNames = FQ_NAMES;
        if (fqNames.primitiveTypeShortNames.contains(declarationDescriptor.getName())) {
            return fqNames.fqNameToPrimitiveType.get(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveArrayType(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(77);
        }
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FqNames fqNames = FQ_NAMES;
        if (fqNames.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName())) {
            return fqNames.arrayClassFqNameToPrimitiveType.get(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public kotlin.reflect.jvm.internal.impl.types.SimpleType getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance variance, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (variance == null) {
            $$$reportNull$$$0(78);
        }
        if (kotlinType == null) {
            $$$reportNull$$$0(79);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeSimpleNotNullType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleNotNullType(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), getArray(), java.util.Collections.singletonList(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(variance, kotlinType)));
        if (simpleTypeSimpleNotNullType == null) {
            $$$reportNull$$$0(80);
        }
        return simpleTypeSimpleNotNullType;
    }

    public static boolean isArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(84);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.array);
    }

    public static boolean isArrayOrPrimitiveArray(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(85);
        }
        return classFqNameEquals(classDescriptor, FQ_NAMES.array) || getPrimitiveArrayType(classDescriptor) != null;
    }

    public static boolean isPrimitiveArray(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(87);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        return (classifierDescriptorMo1268getDeclarationDescriptor == null || getPrimitiveArrayType(classifierDescriptorMo1268getDeclarationDescriptor) == null) ? false : true;
    }

    public static boolean isPrimitiveType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(90);
        }
        return !kotlinType.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(kotlinType);
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(91);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = kotlinType.getConstructor().mo1268getDeclarationDescriptor();
        return (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && isPrimitiveClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) classifierDescriptorMo1268getDeclarationDescriptor);
    }

    public static boolean isPrimitiveClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(92);
        }
        return getPrimitiveType(classDescriptor) != null;
    }

    private static boolean isConstructedFromGivenClass(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(93);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(94);
        }
        return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
    }

    public static boolean isTypeConstructorForGivenClass(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            $$$reportNull$$$0(97);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(98);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptorMo1268getDeclarationDescriptor = typeConstructor.mo1268getDeclarationDescriptor();
        return (classifierDescriptorMo1268getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && classFqNameEquals(classifierDescriptorMo1268getDeclarationDescriptor, fqNameUnsafe);
    }

    private static boolean classFqNameEquals(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            $$$reportNull$$$0(99);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(100);
        }
        return classifierDescriptor.getName().equals(fqNameUnsafe.shortName()) && fqNameUnsafe.equals(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(classifierDescriptor));
    }

    private static boolean isNotNullConstructedFromGivenClass(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(101);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(102);
        }
        return !kotlinType.isMarkedNullable() && isConstructedFromGivenClass(kotlinType, fqNameUnsafe);
    }

    public static boolean isSpecialClassWithNoSupertypes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(103);
        }
        kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.FqNames fqNames = FQ_NAMES;
        return classFqNameEquals(classDescriptor, fqNames.any) || classFqNameEquals(classDescriptor, fqNames.nothing);
    }

    public static boolean isAny(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(104);
        }
        return classFqNameEquals(classDescriptor, FQ_NAMES.any);
    }

    public static boolean isBoolean(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(106);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._boolean);
    }

    public static boolean isChar(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(110);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._char);
    }

    public static boolean isInt(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(112);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._int);
    }

    public static boolean isByte(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(113);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._byte);
    }

    public static boolean isLong(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(114);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._long);
    }

    public static boolean isShort(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(116);
        }
        return isConstructedFromGivenClassAndNotNullable(kotlinType, FQ_NAMES._short);
    }

    public static boolean isFloat(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(117);
        }
        return isFloatOrNullableFloat(kotlinType) && !kotlinType.isMarkedNullable();
    }

    public static boolean isFloatOrNullableFloat(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(118);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES._float);
    }

    public static boolean isDouble(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(119);
        }
        return isDoubleOrNullableDouble(kotlinType) && !kotlinType.isMarkedNullable();
    }

    public static boolean isDoubleOrNullableDouble(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(124);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES._double);
    }

    private static boolean isConstructedFromGivenClassAndNotNullable(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            $$$reportNull$$$0(125);
        }
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(126);
        }
        return isConstructedFromGivenClass(kotlinType, fqNameUnsafe) && !kotlinType.isMarkedNullable();
    }

    public static boolean isNothing(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(kotlinx.coroutines.scheduling.WorkQueueKt.MASK);
        }
        return isNothingOrNullableNothing(kotlinType) && !kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType);
    }

    public static boolean isNothingOrNullableNothing(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(129);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.nothing);
    }

    public static boolean isAnyOrNullableAny(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(130);
        }
        return isConstructedFromGivenClass(kotlinType, FQ_NAMES.any);
    }

    public static boolean isNullableAny(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(131);
        }
        return isAnyOrNullableAny(kotlinType) && kotlinType.isMarkedNullable();
    }

    public static boolean isDefaultBound(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(132);
        }
        return isNullableAny(kotlinType);
    }

    public static boolean isUnit(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        if (kotlinType == null) {
            $$$reportNull$$$0(133);
        }
        return isNotNullConstructedFromGivenClass(kotlinType, FQ_NAMES.unit);
    }

    public static boolean isString(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlinType != null && isNotNullConstructedFromGivenClass(kotlinType, FQ_NAMES.string);
    }

    public static boolean isKClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(147);
        }
        return classFqNameEquals(classDescriptor, FQ_NAMES.kClass);
    }

    public static boolean isDeprecated(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricWeightMax);
        }
        if (declarationDescriptor.getOriginal().getAnnotations().hasAnnotation(FQ_NAMES.deprecated)) {
            return true;
        }
        if (!(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) declarationDescriptor;
        boolean zIsVar = propertyDescriptor.isVar();
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        if (getter != null && isDeprecated(getter)) {
            if (!zIsVar) {
                return true;
            }
            if (setter != null && isDeprecated(setter)) {
                return true;
            }
        }
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.name.FqName getPrimitiveFqName(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType) {
        if (primitiveType == null) {
            $$$reportNull$$$0(152);
        }
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }
}
