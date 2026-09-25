package kotlin.reflect.jvm.internal.impl.load.java.components;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorResolverUtils {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 15 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 15 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
            case 11:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 7:
            case 12:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 8:
            case 13:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 9:
            case 14:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 10:
            case 16:
            default:
                objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 17:
                objArr[0] = "annotationClass";
                break;
            case 18:
                objArr[0] = "member";
                break;
            case 19:
            case 20:
                objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD;
                break;
        }
        if (i != 15) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "resolveOverrides";
                break;
            case 15:
                break;
            case 16:
            case 17:
                objArr[2] = "getAnnotationParameterByName";
                break;
            case 18:
                objArr[2] = "isObjectMethodInInterface";
                break;
            case 19:
                objArr[2] = "isObjectMethod";
                break;
            case 20:
                objArr[2] = "isMethodWithOneObjectParameter";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 15) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> resolveOverridesForNonStaticMembers(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<D> collection, java.util.Collection<D> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter) {
        if (name == null) {
            $$$reportNull$$$0(0);
        }
        if (collection == null) {
            $$$reportNull$$$0(1);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(2);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(3);
        }
        if (errorReporter == null) {
            $$$reportNull$$$0(4);
        }
        return resolveOverrides(name, collection, collection2, classDescriptor, errorReporter, false);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> resolveOverridesForStaticMembers(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<D> collection, java.util.Collection<D> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter) {
        if (name == null) {
            $$$reportNull$$$0(5);
        }
        if (collection == null) {
            $$$reportNull$$$0(6);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(7);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(8);
        }
        if (errorReporter == null) {
            $$$reportNull$$$0(9);
        }
        return resolveOverrides(name, collection, collection2, classDescriptor, errorReporter, true);
    }

    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> resolveOverrides(kotlin.reflect.jvm.internal.impl.name.Name name, java.util.Collection<D> collection, java.util.Collection<D> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, final boolean z) {
        if (name == null) {
            $$$reportNull$$$0(10);
        }
        if (collection == null) {
            $$$reportNull$$$0(11);
        }
        if (collection2 == null) {
            $$$reportNull$$$0(12);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (errorReporter == null) {
            $$$reportNull$$$0(14);
        }
        final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.generateOverridesInFunctionGroup(name, collection, collection2, classDescriptor, new kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.1
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i == 2) {
                    objArr[0] = "fromCurrent";
                } else if (i == 3) {
                    objArr[0] = "member";
                } else if (i != 4) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "overridden";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "setOverriddenDescriptors";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            public void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                if (callableMemberDescriptor2 == null) {
                    $$$reportNull$$$0(2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    $$$reportNull$$$0(0);
                }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.1.1
                    private static /* synthetic */ void $$$reportNull$$$0(int i) {
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                        if (callableMemberDescriptor2 == null) {
                            $$$reportNull$$$0(0);
                        }
                        errorReporter.reportCannotInferVisibility(callableMemberDescriptor2);
                        return kotlin.Unit.INSTANCE;
                    }
                });
                linkedHashSet.add(callableMemberDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public void setOverriddenDescriptors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection3) {
                if (callableMemberDescriptor == null) {
                    $$$reportNull$$$0(3);
                }
                if (collection3 == null) {
                    $$$reportNull$$$0(4);
                }
                if (!z || callableMemberDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    super.setOverriddenDescriptors(callableMemberDescriptor, collection3);
                }
            }
        });
        return linkedHashSet;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getAnnotationParameterByName(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (name == null) {
            $$$reportNull$$$0(16);
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(17);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : constructors.iterator().next().getValueParameters()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    public static boolean isObjectMethodInInterface(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember javaMember) {
        if (javaMember == null) {
            $$$reportNull$$$0(18);
        }
        return javaMember.getContainingClass().isInterface() && (javaMember instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) && isObjectMethod((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod) javaMember);
    }

    private static boolean isObjectMethod(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod) {
        if (javaMethod == null) {
            $$$reportNull$$$0(19);
        }
        java.lang.String strAsString = javaMethod.getName().asString();
        if (strAsString.equals("toString") || strAsString.equals("hashCode")) {
            return javaMethod.getValueParameters().isEmpty();
        }
        if (strAsString.equals("equals")) {
            return isMethodWithOneObjectParameter(javaMethod);
        }
        return false;
    }

    private static boolean isMethodWithOneObjectParameter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod) {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName;
        if (javaMethod == null) {
            $$$reportNull$$$0(20);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> valueParameters = javaMethod.getValueParameters();
        if (valueParameters.size() == 1) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType type = valueParameters.get(0).getType();
            if (type instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) {
                kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier classifier = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) type).getClassifier();
                return (classifier instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) && (fqName = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) classifier).getFqName()) != null && fqName.asString().equals("java.lang.Object");
            }
        }
        return false;
    }
}
