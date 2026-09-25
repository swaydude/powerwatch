package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: loaded from: classes2.dex */
public interface SignaturePropagator {
    public static final kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator DO_NOTHING = new kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.1
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD;
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature resolvePropagatedSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2) {
            if (javaMethod == null) {
                $$$reportNull$$$0(0);
            }
            if (classDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            if (kotlinType == null) {
                $$$reportNull$$$0(2);
            }
            if (list == null) {
                $$$reportNull$$$0(3);
            }
            if (list2 == null) {
                $$$reportNull$$$0(4);
            }
            return new kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature(kotlinType, kotlinType2, list, list2, java.util.Collections.emptyList(), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public void reportSignatureErrors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.List<java.lang.String> list) {
            if (callableMemberDescriptor == null) {
                $$$reportNull$$$0(5);
            }
            if (list == null) {
                $$$reportNull$$$0(6);
            }
            throw new java.lang.UnsupportedOperationException("Should not be called");
        }
    };

    void reportSignatureErrors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.List<java.lang.String> list);

    kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator.PropagatedSignature resolvePropagatedSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2);

    public static class PropagatedSignature {
        private final boolean hasStableParameterNames;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType receiverType;
        private final kotlin.reflect.jvm.internal.impl.types.KotlinType returnType;
        private final java.util.List<java.lang.String> signatureErrors;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        public PropagatedSignature(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2, java.util.List<java.lang.String> list3, boolean z) {
            if (kotlinType == null) {
                $$$reportNull$$$0(0);
            }
            if (list == null) {
                $$$reportNull$$$0(1);
            }
            if (list2 == null) {
                $$$reportNull$$$0(2);
            }
            if (list3 == null) {
                $$$reportNull$$$0(3);
            }
            this.returnType = kotlinType;
            this.receiverType = kotlinType2;
            this.valueParameters = list;
            this.typeParameters = list2;
            this.signatureErrors = list3;
            this.hasStableParameterNames = z;
        }

        public kotlin.reflect.jvm.internal.impl.types.KotlinType getReturnType() {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.returnType;
            if (kotlinType == null) {
                $$$reportNull$$$0(4);
            }
            return kotlinType;
        }

        public kotlin.reflect.jvm.internal.impl.types.KotlinType getReceiverType() {
            return this.receiverType;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> getValueParameters() {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = this.valueParameters;
            if (list == null) {
                $$$reportNull$$$0(5);
            }
            return list;
        }

        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getTypeParameters() {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = this.typeParameters;
            if (list == null) {
                $$$reportNull$$$0(6);
            }
            return list;
        }

        public boolean hasStableParameterNames() {
            return this.hasStableParameterNames;
        }

        public java.util.List<java.lang.String> getErrors() {
            java.util.List<java.lang.String> list = this.signatureErrors;
            if (list == null) {
                $$$reportNull$$$0(7);
            }
            return list;
        }
    }
}
