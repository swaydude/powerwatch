package kotlin.reflect.jvm.internal.impl.load.java;

/* JADX INFO: loaded from: classes2.dex */
public class JavaVisibilities {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility PACKAGE_VISIBILITY = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("package", false) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.1
        /* JADX WARN: Code duplicated, block: B:20:0x002e  */
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 3 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 3 || i == 5) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "visibility";
            } else if (i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else if (i == 4) {
                objArr[0] = "classDescriptor";
            } else if (i != 5) {
                objArr[0] = "what";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            }
            if (i == 3) {
                objArr[1] = "normalize";
            } else if (i != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
            } else {
                objArr[1] = "effectiveVisibility";
            }
            if (i == 2) {
                objArr[2] = "compareTo";
            } else if (i != 3) {
                if (i == 4) {
                    objArr[2] = "effectiveVisibility";
                } else if (i != 5) {
                    objArr[2] = "isVisible";
                }
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 3 && i != 5) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public java.lang.String getDisplayName() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                $$$reportNull$$$0(0);
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.areInSamePackage(declarationDescriptorWithVisibility, declarationDescriptor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        protected java.lang.Integer compareTo(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
            if (visibility == null) {
                $$$reportNull$$$0(2);
            }
            if (this == visibility) {
                return 0;
            }
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.isPrivate(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PROTECTED;
            if (visibility == null) {
                $$$reportNull$$$0(3);
            }
            return visibility;
        }
    };
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility PROTECTED_AND_PACKAGE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility PROTECTED_STATIC_VISIBILITY;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "first";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "second";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities";
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        boolean z = true;
        PROTECTED_STATIC_VISIBILITY = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("protected_static", z) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.2
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
                java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 3 : 2];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i != 2) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
                }
                if (i != 2) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
                } else {
                    objArr[1] = "normalize";
                }
                if (i != 2) {
                    objArr[2] = "isVisible";
                }
                java.lang.String str2 = java.lang.String.format(str, objArr);
                if (i == 2) {
                    throw new java.lang.IllegalStateException(str2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public java.lang.String getDisplayName() {
                return "protected/*protected static*/";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.isVisibleForProtectedAndPackage(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PROTECTED;
                if (visibility == null) {
                    $$$reportNull$$$0(2);
                }
                return visibility;
            }
        };
        PROTECTED_AND_PACKAGE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("protected_and_package", z) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.3
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
                java.lang.Object[] objArr = new java.lang.Object[i != 3 ? 3 : 2];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "visibility";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
                }
                if (i != 3) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
                } else {
                    objArr[1] = "normalize";
                }
                if (i == 2) {
                    objArr[2] = "compareTo";
                } else if (i != 3) {
                    objArr[2] = "isVisible";
                }
                java.lang.String str2 = java.lang.String.format(str, objArr);
                if (i == 3) {
                    throw new java.lang.IllegalStateException(str2);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public java.lang.String getDisplayName() {
                return "protected/*protected and package*/";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities.isVisibleForProtectedAndPackage(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            protected java.lang.Integer compareTo(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
                if (visibility == null) {
                    $$$reportNull$$$0(2);
                }
                if (this == visibility) {
                    return 0;
                }
                if (visibility == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INTERNAL) {
                    return null;
                }
                return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.isPrivate(visibility) ? 1 : -1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public kotlin.reflect.jvm.internal.impl.descriptors.Visibility normalize() {
                kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PROTECTED;
                if (visibility == null) {
                    $$$reportNull$$$0(3);
                }
                return visibility;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVisibleForProtectedAndPackage(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(0);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
        }
        if (areInSamePackage(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areInSamePackage(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(3);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor.class, false);
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) ? false : true;
    }
}
