package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX INFO: compiled from: ProtoEnumFlags.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoEnumFlags {
    public static final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags INSTANCE = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags();

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.DECLARATION.ordinal()] = 1;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.DELEGATION.ordinal()] = 3;
            iArr[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind.SYNTHESIZED.ordinal()] = 4;
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            iArr2[kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.FINAL.ordinal()] = 1;
            iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.OPEN.ordinal()] = 2;
            iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.ABSTRACT.ordinal()] = 3;
            iArr3[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality.SEALED.ordinal()] = 4;
            int[] iArr4 = new int[kotlin.reflect.jvm.internal.impl.descriptors.Modality.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL.ordinal()] = 1;
            iArr4[kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN.ordinal()] = 2;
            iArr4[kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT.ordinal()] = 3;
            iArr4[kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED.ordinal()] = 4;
            int[] iArr5 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.values().length];
            $EnumSwitchMapping$4 = iArr5;
            iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            iArr5[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            int[] iArr6 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.values().length];
            $EnumSwitchMapping$5 = iArr6;
            iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.CLASS.ordinal()] = 1;
            iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.INTERFACE.ordinal()] = 2;
            iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_CLASS.ordinal()] = 3;
            iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.OBJECT.ordinal()] = 6;
            iArr6[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            int[] iArr7 = new int[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.values().length];
            $EnumSwitchMapping$6 = iArr7;
            iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS.ordinal()] = 1;
            iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE.ordinal()] = 2;
            iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS.ordinal()] = 3;
            iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY.ordinal()] = 4;
            iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr7[kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT.ordinal()] = 6;
            int[] iArr8 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.values().length];
            $EnumSwitchMapping$7 = iArr8;
            iArr8[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            iArr8[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            iArr8[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            int[] iArr9 = new int[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.values().length];
            $EnumSwitchMapping$8 = iArr9;
            iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            iArr9[kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
        }
    }

    private ProtoEnumFlags() {
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind memberKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind memberKind) {
        if (memberKind != null) {
            int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$0[memberKind.ordinal()];
            if (i == 1) {
                return kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION;
            }
            if (i == 2) {
                return kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
            }
            if (i == 3) {
                return kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DELEGATION;
            }
            if (i == 4) {
                return kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED;
            }
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.Modality modality(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality modality) {
        if (modality != null) {
            int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$2[modality.ordinal()];
            if (i == 1) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
            }
            if (i == 2) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
            }
            if (i == 3) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
            }
            if (i == 4) {
                return kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED;
            }
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    public final kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility visibility) {
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2;
        if (visibility != null) {
            switch (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$4[visibility.ordinal()]) {
                case 1:
                    visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INTERNAL;
                    break;
                case 2:
                    visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE;
                    break;
                case 3:
                    visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE_TO_THIS;
                    break;
                case 4:
                    visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PROTECTED;
                    break;
                case 5:
                    visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC;
                    break;
                case 6:
                    visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.LOCAL;
                    break;
                default:
                    visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE;
                    break;
            }
        } else {
            visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE;
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(visibility2, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
        return visibility2;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind kind) {
        if (kind != null) {
            switch (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$5[kind.ordinal()]) {
                case 1:
                    return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
                case 2:
                    return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE;
                case 3:
                    return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
                case 4:
                    return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY;
                case 5:
                    return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS;
                case 6:
                case 7:
                    return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT;
            }
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
    }

    public final kotlin.reflect.jvm.internal.impl.types.Variance variance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Variance variance) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(variance, "variance");
        int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$7[variance.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final kotlin.reflect.jvm.internal.impl.types.Variance variance(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Projection projection) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(projection, "projection");
        int i = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.WhenMappings.$EnumSwitchMapping$8[projection.ordinal()];
        if (i == 1) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }
}
