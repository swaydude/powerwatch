package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

/* JADX INFO: loaded from: classes2.dex */
public class Flags {
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> CLASS_KIND;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField DECLARES_DEFAULT_VALUE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_ANNOTATIONS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_CONSTANT;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_GETTER;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField HAS_SETTER;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_CONST;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_CROSSINLINE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_DATA;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_DELEGATED;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXPECT_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXPECT_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXPECT_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_ACCESSOR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_FUNCTION;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_EXTERNAL_PROPERTY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INFIX;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INLINE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INLINE_ACCESSOR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INLINE_CLASS;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_INNER;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_LATEINIT;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NEGATED;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NOINLINE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NOT_DEFAULT;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_NULL_CHECK_PREDICATE;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_OPERATOR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_SECONDARY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_SUSPEND;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_TAILREC;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_UNSIGNED;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField IS_VAR;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> MEMBER_KIND;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> MODALITY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField SUSPEND_TYPE = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
    public static final kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> VISIBILITY;

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "modality";
        } else if (i == 2) {
            objArr[0] = "kind";
        } else if (i == 5) {
            objArr[0] = "modality";
        } else if (i == 6) {
            objArr[0] = "memberKind";
        } else if (i == 8) {
            objArr[0] = "modality";
        } else if (i == 9) {
            objArr[0] = "memberKind";
        } else if (i != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanFirst = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
        HAS_ANNOTATIONS = booleanFlagFieldBooleanFirst;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> flagFieldAfter = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(booleanFlagFieldBooleanFirst, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.values());
        VISIBILITY = flagFieldAfter;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> flagFieldAfter2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(flagFieldAfter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.values());
        MODALITY = flagFieldAfter2;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> flagFieldAfter3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(flagFieldAfter2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.values());
        CLASS_KIND = flagFieldAfter3;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(flagFieldAfter3);
        IS_INNER = booleanFlagFieldBooleanAfter;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter);
        IS_DATA = booleanFlagFieldBooleanAfter2;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter2);
        IS_EXTERNAL_CLASS = booleanFlagFieldBooleanAfter3;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter3);
        IS_EXPECT_CLASS = booleanFlagFieldBooleanAfter4;
        IS_INLINE_CLASS = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter4);
        IS_SECONDARY = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(flagFieldAfter);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> flagFieldAfter4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.after(flagFieldAfter2, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.values());
        MEMBER_KIND = flagFieldAfter4;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(flagFieldAfter4);
        IS_OPERATOR = booleanFlagFieldBooleanAfter5;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter5);
        IS_INFIX = booleanFlagFieldBooleanAfter6;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter6);
        IS_INLINE = booleanFlagFieldBooleanAfter7;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter7);
        IS_TAILREC = booleanFlagFieldBooleanAfter8;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter8);
        IS_EXTERNAL_FUNCTION = booleanFlagFieldBooleanAfter9;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter9);
        IS_SUSPEND = booleanFlagFieldBooleanAfter10;
        IS_EXPECT_FUNCTION = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter10);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(flagFieldAfter4);
        IS_VAR = booleanFlagFieldBooleanAfter11;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter11);
        HAS_GETTER = booleanFlagFieldBooleanAfter12;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter12);
        HAS_SETTER = booleanFlagFieldBooleanAfter13;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter13);
        IS_CONST = booleanFlagFieldBooleanAfter14;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter15 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter14);
        IS_LATEINIT = booleanFlagFieldBooleanAfter15;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter15);
        HAS_CONSTANT = booleanFlagFieldBooleanAfter16;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter17 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter16);
        IS_EXTERNAL_PROPERTY = booleanFlagFieldBooleanAfter17;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter18 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter17);
        IS_DELEGATED = booleanFlagFieldBooleanAfter18;
        IS_EXPECT_PROPERTY = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter18);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter19 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanFirst);
        DECLARES_DEFAULT_VALUE = booleanFlagFieldBooleanAfter19;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter20 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter19);
        IS_CROSSINLINE = booleanFlagFieldBooleanAfter20;
        IS_NOINLINE = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter20);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter21 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(flagFieldAfter2);
        IS_NOT_DEFAULT = booleanFlagFieldBooleanAfter21;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanAfter22 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter21);
        IS_EXTERNAL_ACCESSOR = booleanFlagFieldBooleanAfter22;
        IS_INLINE_ACCESSOR = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanAfter22);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagFieldBooleanFirst2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
        IS_NEGATED = booleanFlagFieldBooleanFirst2;
        IS_NULL_CHECK_PREDICATE = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanAfter(booleanFlagFieldBooleanFirst2);
        IS_UNSIGNED = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField.booleanFirst();
    }

    public static int getAccessorFlags(boolean z, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility visibility, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (modality == null) {
            $$$reportNull$$$0(11);
        }
        return HAS_ANNOTATIONS.toFlags(java.lang.Boolean.valueOf(z)) | MODALITY.toFlags(modality) | VISIBILITY.toFlags(visibility) | IS_NOT_DEFAULT.toFlags(java.lang.Boolean.valueOf(z2)) | IS_EXTERNAL_ACCESSOR.toFlags(java.lang.Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(java.lang.Boolean.valueOf(z4));
    }

    public static abstract class FlagField<E> {
        public final int bitWidth;
        public final int offset;

        public abstract E get(int i);

        public abstract int toFlags(E e);

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/Internal$EnumLite;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<TE;>; */
        public static kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField after(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField flagField, kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite[] enumLiteArr) {
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.EnumLiteFlagField(flagField.offset + flagField.bitWidth, enumLiteArr);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFirst() {
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField(0);
        }

        public static kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanAfter(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<?> flagField) {
            return new kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField(flagField.offset + flagField.bitWidth);
        }

        private FlagField(int i, int i2) {
            this.offset = i;
            this.bitWidth = i2;
        }
    }

    public static class BooleanFlagField extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<java.lang.Boolean> {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        public BooleanFlagField(int i) {
            super(i, 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public java.lang.Boolean get(int i) {
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf((i & (1 << this.offset)) != 0);
            if (boolValueOf == null) {
                $$$reportNull$$$0(0);
            }
            return boolValueOf;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public int toFlags(java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.offset;
            }
            return 0;
        }
    }

    private static class EnumLiteFlagField<E extends kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite> extends kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<E> {
        private final E[] values;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public EnumLiteFlagField(int i, E[] eArr) {
            super(i, bitWidth(eArr));
            this.values = eArr;
        }

        private static <E> int bitWidth(E[] eArr) {
            if (eArr == null) {
                $$$reportNull$$$0(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new java.lang.IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public E get(int i) {
            int i2 = (i & (((1 << this.bitWidth) - 1) << this.offset)) >> this.offset;
            for (E e : this.values) {
                if (e.getNumber() == i2) {
                    return e;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public int toFlags(E e) {
            return e.getNumber() << this.offset;
        }
    }
}
