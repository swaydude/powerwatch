package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: loaded from: classes2.dex */
public class Visibilities {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility DEFAULT_VISIBILITY;

    @java.lang.Deprecated
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue FALSE_IF_PROTECTED;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility INHERITED;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility INTERNAL;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility INVISIBLE_FAKE;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.Visibility> INVISIBLE_FROM_OTHER_MODULES;
    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue IRRELEVANT_RECEIVER;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility LOCAL;
    private static final kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper MODULE_VISIBILITY_HELPER;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.Visibility, java.lang.Integer> ORDERED_VISIBILITIES;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility PRIVATE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility PRIVATE_TO_THIS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility PROTECTED;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility PUBLIC;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.Visibility UNKNOWN;

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                    objArr[0] = "visibility";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities";
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        boolean z = false;
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("private", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.1
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "what";
                } else if (i != 2) {
                    objArr[0] = "descriptor";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "isVisible";
                } else {
                    objArr[2] = "hasContainingSourceFile";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            private boolean hasContainingSourceFile(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(0);
                }
                return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingSourceFile(declarationDescriptor) != kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == 0) {
                    $$$reportNull$$$0(1);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(2);
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility) && hasContainingSourceFile(declarationDescriptor)) {
                    return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                if (declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters containingDeclaration = ((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                    if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSealedClass(containingDeclaration) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(containingDeclaration) && (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) && kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor)) {
                        return true;
                    }
                }
                while (declarationDescriptorWithVisibility != 0) {
                    declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                    if (((declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && !kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor)) {
                        break;
                    }
                }
                if (declarationDescriptorWithVisibility == 0) {
                    return false;
                }
                while (declarationDescriptor != null) {
                    if (declarationDescriptorWithVisibility == declarationDescriptor) {
                        return true;
                    }
                    if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                        return (declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptorWithVisibility).getFqName().equals(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName()) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility);
                    }
                    declarationDescriptor = declarationDescriptor.getContainingDeclaration();
                }
                return false;
            }
        };
        PRIVATE = visibility;
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2 = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("private_to_this", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.2
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$2";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public java.lang.String getDisplayName() {
                return "private/*private to this*/";
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor parentOfType;
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                if (kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                    if (receiverValue == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.ALWAYS_SUITABLE_RECEIVER) {
                        return true;
                    }
                    if (receiverValue != kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.IRRELEVANT_RECEIVER && (parentOfType = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class)) != null && (receiverValue instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver)) {
                        return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                    }
                }
                return false;
            }
        };
        PRIVATE_TO_THIS = visibility2;
        boolean z2 = true;
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility3 = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("protected", z2) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.3
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "whatDeclaration";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "fromClass";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$3";
                if (i == 2 || i == 3) {
                    objArr[2] = "doesReceiverFitForProtectedVisibility";
                } else {
                    objArr[2] = "isVisible";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor;
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class);
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class, false);
                if (classDescriptor3 == null) {
                    return false;
                }
                if (classDescriptor2 != null && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(classDescriptor2) && (classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(classDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class)) != null && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubclass(classDescriptor3, classDescriptor)) {
                    return true;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class);
                if (classDescriptor4 == null) {
                    return false;
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubclass(classDescriptor3, classDescriptor4) && doesReceiverFitForProtectedVisibility(receiverValue, declarationDescriptorWithVisibilityUnwrapFakeOverrideToAnyDeclaration, classDescriptor3)) {
                    return true;
                }
                return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.getContainingDeclaration());
            }

            private boolean doesReceiverFitForProtectedVisibility(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(2);
                }
                if (classDescriptor == null) {
                    $$$reportNull$$$0(3);
                }
                if (receiverValue == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.FALSE_IF_PROTECTED) {
                    return false;
                }
                if (!(declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) || receiverValue == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue == kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.IRRELEVANT_RECEIVER || receiverValue == null) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.types.KotlinType thisType = receiverValue instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue ? ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue) receiverValue).getThisType() : receiverValue.getType();
                return kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubtypeOfClass(thisType, classDescriptor) || kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(thisType);
            }
        };
        PROTECTED = visibility3;
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility4 = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("internal", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.4
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$4";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                    return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.MODULE_VISIBILITY_HELPER.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                return false;
            }
        };
        INTERNAL = visibility4;
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility5 = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("public", z2) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.5
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$5";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return true;
            }
        };
        PUBLIC = visibility5;
        kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility6 = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility(com.google.android.gms.common.internal.ImagesContract.LOCAL, z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.6
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$6";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                throw new java.lang.IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        };
        LOCAL = visibility6;
        INHERITED = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("inherited", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.7
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$7";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                throw new java.lang.IllegalStateException("Visibility is unknown yet");
            }
        };
        INVISIBLE_FAKE = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("invisible_fake", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.8
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$8";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return false;
            }
        };
        UNKNOWN = new kotlin.reflect.jvm.internal.impl.descriptors.Visibility("unknown", z) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.9
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$9";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
            public boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return false;
            }
        };
        INVISIBLE_FROM_OTHER_MODULES = java.util.Collections.unmodifiableSet(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.Visibility[]{visibility, visibility2, visibility4, visibility6}));
        java.util.HashMap mapNewHashMapWithExpectedSize = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashMapWithExpectedSize(4);
        mapNewHashMapWithExpectedSize.put(visibility2, 0);
        mapNewHashMapWithExpectedSize.put(visibility, 0);
        mapNewHashMapWithExpectedSize.put(visibility4, 1);
        mapNewHashMapWithExpectedSize.put(visibility3, 1);
        mapNewHashMapWithExpectedSize.put(visibility5, 2);
        ORDERED_VISIBILITIES = java.util.Collections.unmodifiableMap(mapNewHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = visibility5;
        IRRELEVANT_RECEIVER = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.10
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        ALWAYS_SUITABLE_RECEIVER = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.11
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        FALSE_IF_PROTECTED = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.12
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        java.util.Iterator it = java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.class, kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.class.getClassLoader()).iterator();
        MODULE_VISIBILITY_HELPER = it.hasNext() ? (kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper) it.next() : kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY.INSTANCE;
    }

    public static boolean isVisibleIgnoringReceiver(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(2);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(3);
        }
        return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor) == null;
    }

    public static boolean inSameFile(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(6);
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(7);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile containingSourceFile = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility findInvisibleMember(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityFindInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(8);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(9);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityFindInvisibleMember = findInvisibleMember(receiverValue, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityFindInvisibleMember;
    }

    static java.lang.Integer compareLocal(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (visibility2 == null) {
            $$$reportNull$$$0(11);
        }
        if (visibility == visibility2) {
            return 0;
        }
        java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.Visibility, java.lang.Integer> map = ORDERED_VISIBILITIES;
        java.lang.Integer num = map.get(visibility);
        java.lang.Integer num2 = map.get(visibility2);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return java.lang.Integer.valueOf(num.intValue() - num2.intValue());
    }

    public static java.lang.Integer compare(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility, kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility2) {
        if (visibility == null) {
            $$$reportNull$$$0(12);
        }
        if (visibility2 == null) {
            $$$reportNull$$$0(13);
        }
        java.lang.Integer numCompareTo = visibility.compareTo(visibility2);
        if (numCompareTo != null) {
            return numCompareTo;
        }
        java.lang.Integer numCompareTo2 = visibility2.compareTo(visibility);
        if (numCompareTo2 != null) {
            return java.lang.Integer.valueOf(-numCompareTo2.intValue());
        }
        return null;
    }

    public static boolean isPrivate(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        if (visibility == null) {
            $$$reportNull$$$0(14);
        }
        return visibility == PRIVATE || visibility == PRIVATE_TO_THIS;
    }
}
