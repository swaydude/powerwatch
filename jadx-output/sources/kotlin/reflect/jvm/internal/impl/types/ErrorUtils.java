package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes2.dex */
public class ErrorUtils {
    private static final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor ERROR_PROPERTY;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> ERROR_PROPERTY_GROUP;
    private static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor ERROR_MODULE = new kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor() { // from class: kotlin.reflect.jvm.internal.impl.types.ErrorUtils.1
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? 2 : 3];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
                    break;
                case 2:
                case 7:
                    objArr[0] = "fqName";
                    break;
                case 3:
                    objArr[0] = "nameFilter";
                    break;
                case 10:
                    objArr[0] = "visitor";
                    break;
                case 11:
                    objArr[0] = "targetModule";
                    break;
                default:
                    objArr[0] = "capability";
                    break;
            }
            if (i == 1) {
                objArr[1] = "getAnnotations";
            } else if (i == 4) {
                objArr[1] = "getSubPackagesOf";
            } else if (i == 5) {
                objArr[1] = "getName";
            } else if (i == 6) {
                objArr[1] = "getStableName";
            } else if (i == 8) {
                objArr[1] = "getAllDependencyModules";
            } else if (i == 9) {
                objArr[1] = "getExpectedByModules";
            } else if (i == 12) {
                objArr[1] = "getOriginal";
            } else if (i != 13) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
            } else {
                objArr[1] = "getBuiltIns";
            }
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 12:
                case 13:
                    break;
                case 2:
                case 3:
                    objArr[2] = "getSubPackagesOf";
                    break;
                case 7:
                    objArr[2] = "getPackage";
                    break;
                case 10:
                    objArr[2] = "accept";
                    break;
                case 11:
                    objArr[2] = "shouldSeeInternalsOf";
                    break;
                default:
                    objArr[2] = "getCapability";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 4 && i != 5 && i != 6 && i != 8 && i != 9 && i != 12 && i != 13) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
        public <R, D> R accept(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
            if (declarationDescriptorVisitor != null) {
                return null;
            }
            $$$reportNull$$$0(10);
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
        public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getContainingDeclaration() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
        public kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getOriginal() {
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        public boolean shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
            if (moduleDescriptor != null) {
                return false;
            }
            $$$reportNull$$$0(11);
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations empty = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
            if (empty == null) {
                $$$reportNull$$$0(1);
            }
            return empty;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
            if (fqName == null) {
                $$$reportNull$$$0(2);
            }
            if (function1 == null) {
                $$$reportNull$$$0(3);
            }
            java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
            if (listEmptyList == null) {
                $$$reportNull$$$0(4);
            }
            return listEmptyList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
        public kotlin.reflect.jvm.internal.impl.name.Name getName() {
            kotlin.reflect.jvm.internal.impl.name.Name nameSpecial = kotlin.reflect.jvm.internal.impl.name.Name.special("<ERROR MODULE>");
            if (nameSpecial == null) {
                $$$reportNull$$$0(5);
            }
            return nameSpecial;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        public kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getPackage(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            if (fqName == null) {
                $$$reportNull$$$0(7);
            }
            throw new java.lang.IllegalStateException("Should not be called!");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor
        public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
            kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns defaultBuiltIns = kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns.getInstance();
            if (defaultBuiltIns == null) {
                $$$reportNull$$$0(13);
            }
            return defaultBuiltIns;
        }
    };
    private static final kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorClassDescriptor ERROR_CLASS = new kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorClassDescriptor(kotlin.reflect.jvm.internal.impl.name.Name.special("<ERROR CLASS>"));
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES = createErrorType("<LOOP IN SUPERTYPES>");
    private static final kotlin.reflect.jvm.internal.impl.types.KotlinType ERROR_PROPERTY_TYPE = createErrorType("<ERROR PROPERTY TYPE>");

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 4 || i == 6 || i == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 6 || i == 19) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 11:
            case 15:
                objArr[0] = "debugMessage";
                break;
            case 4:
            case 6:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
                break;
            case 5:
                objArr[0] = "ownerScope";
                break;
            case 8:
            case 9:
            case 16:
            case 17:
                objArr[0] = "debugName";
                break;
            case 10:
                objArr[0] = "typeConstructor";
                break;
            case 12:
            case 14:
                objArr[0] = "arguments";
                break;
            case 13:
                objArr[0] = "presentableName";
                break;
            case 18:
                objArr[0] = "errorClass";
                break;
            case 20:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        if (i == 4) {
            objArr[1] = "createErrorProperty";
        } else if (i == 6) {
            objArr[1] = "createErrorFunction";
        } else if (i != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        } else {
            objArr[1] = "getErrorModule";
        }
        switch (i) {
            case 1:
                objArr[2] = "createErrorClass";
                break;
            case 2:
            case 3:
                objArr[2] = "createErrorScope";
                break;
            case 4:
            case 6:
            case 19:
                break;
            case 5:
                objArr[2] = "createErrorFunction";
                break;
            case 7:
                objArr[2] = "createErrorType";
                break;
            case 8:
                objArr[2] = "createErrorTypeWithCustomDebugName";
                break;
            case 9:
            case 10:
                objArr[2] = "createErrorTypeWithCustomConstructor";
                break;
            case 11:
            case 12:
                objArr[2] = "createErrorTypeWithArguments";
                break;
            case 13:
            case 14:
                objArr[2] = "createUnresolvedType";
                break;
            case 15:
                objArr[2] = "createErrorTypeConstructor";
                break;
            case 16:
            case 17:
            case 18:
                objArr[2] = "createErrorTypeConstructorWithCustomDebugName";
                break;
            case 20:
                objArr[2] = "createUninferredParameterType";
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 6 && i != 19) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl propertyDescriptorImplCreateErrorProperty = createErrorProperty();
        ERROR_PROPERTY = propertyDescriptorImplCreateErrorProperty;
        ERROR_PROPERTY_GROUP = java.util.Collections.singleton(propertyDescriptorImplCreateErrorProperty);
    }

    public static class ErrorScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
        private final java.lang.String debugMessage;

        /* JADX WARN: Code duplicated, block: B:13:0x0019  */
        /* JADX WARN: Code duplicated, block: B:7:0x000d  */
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str;
            int i2;
            if (i != 7 && i != 18) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 7 && i != 18) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        i2 = 2;
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            } else {
                i2 = 2;
            }
            java.lang.Object[] objArr = new java.lang.Object[i2];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION;
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            if (i == 7) {
                objArr[1] = "getContributedVariables";
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = "getContributedFunctions";
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
                        break;
                }
            } else {
                objArr[1] = "getContributedDescriptors";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 7 && i != 18) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        throw new java.lang.IllegalArgumentException(str2);
                }
            }
            throw new java.lang.IllegalStateException(str2);
        }

        private ErrorScope(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            this.debugMessage = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* JADX INFO: renamed from: getContributedClassifier */
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(1);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(2);
            }
            return kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorClass(name.asString());
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(5);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(6);
            }
            java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> set = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ERROR_PROPERTY_GROUP;
            if (set == null) {
                $$$reportNull$$$0(7);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(8);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(9);
            }
            java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> setSingleton = java.util.Collections.singleton(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorFunction(this));
            if (setSingleton == null) {
                $$$reportNull$$$0(10);
            }
            return setSingleton;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> setEmptySet = java.util.Collections.emptySet();
            if (setEmptySet == null) {
                $$$reportNull$$$0(11);
            }
            return setEmptySet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> setEmptySet = java.util.Collections.emptySet();
            if (setEmptySet == null) {
                $$$reportNull$$$0(12);
            }
            return setEmptySet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
            if (descriptorKindFilter == null) {
                $$$reportNull$$$0(16);
            }
            if (function1 == null) {
                $$$reportNull$$$0(17);
            }
            java.util.List listEmptyList = java.util.Collections.emptyList();
            if (listEmptyList == null) {
                $$$reportNull$$$0(18);
            }
            return listEmptyList;
        }

        public java.lang.String toString() {
            return "ErrorScope{" + this.debugMessage + '}';
        }
    }

    private static class ThrowingScope implements kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope {
        private final java.lang.String debugMessage;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION;
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY;
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private ThrowingScope(java.lang.String str) {
            if (str == null) {
                $$$reportNull$$$0(0);
            }
            this.debugMessage = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        /* JADX INFO: renamed from: getContributedClassifier */
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1270getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(1);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(2);
            }
            throw new java.lang.IllegalStateException(this.debugMessage + ", required name: " + name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(5);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(6);
            }
            throw new java.lang.IllegalStateException(this.debugMessage + ", required name: " + name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name == null) {
                $$$reportNull$$$0(7);
            }
            if (lookupLocation == null) {
                $$$reportNull$$$0(8);
            }
            throw new java.lang.IllegalStateException(this.debugMessage + ", required name: " + name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
            if (descriptorKindFilter == null) {
                $$$reportNull$$$0(9);
            }
            if (function1 == null) {
                $$$reportNull$$$0(10);
            }
            throw new java.lang.IllegalStateException(this.debugMessage);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
            throw new java.lang.IllegalStateException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
            throw new java.lang.IllegalStateException();
        }

        public java.lang.String toString() {
            return "ThrowingScope{" + this.debugMessage + '}';
        }
    }

    private static class ErrorClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 2 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 4 || i == 6) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 4:
                case 6:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 5:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
            }
            if (i == 2) {
                objArr[1] = "substitute";
            } else if (i == 4 || i == 6) {
                objArr[1] = "getMemberScope";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            }
            switch (i) {
                case 1:
                    objArr[2] = "substitute";
                    break;
                case 2:
                case 4:
                case 6:
                    break;
                case 3:
                case 5:
                    objArr[2] = "getMemberScope";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 2 && i != 4 && i != 6) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor) {
            if (typeSubstitutor == null) {
                $$$reportNull$$$0(1);
            }
            return this;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorClassDescriptor(kotlin.reflect.jvm.internal.impl.name.Name name) {
            super(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.getErrorModule(), name, kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS, java.util.Collections.emptyList(), kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.NO_LOCKS);
            if (name == null) {
                $$$reportNull$$$0(0);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl classConstructorDescriptorImplCreate = kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl.create(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), true, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE);
            classConstructorDescriptorImplCreate.initialize(java.util.Collections.emptyList(), kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.INTERNAL);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateErrorScope = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorScope(getName().asString());
            classConstructorDescriptorImplCreate.setReturnType(new kotlin.reflect.jvm.internal.impl.types.ErrorType(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorTypeConstructorWithCustomDebugName("<ERROR>", this), memberScopeCreateErrorScope));
            initialize(memberScopeCreateErrorScope, java.util.Collections.singleton(classConstructorDescriptorImplCreate), classConstructorDescriptorImplCreate);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
        public java.lang.String toString() {
            return getName().asString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                $$$reportNull$$$0(5);
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScopeCreateErrorScope = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorScope("Error scope for class " + getName() + " with arguments: " + typeSubstitution);
            if (memberScopeCreateErrorScope == null) {
                $$$reportNull$$$0(6);
            }
            return memberScopeCreateErrorScope;
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createErrorClass(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        return new kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorClassDescriptor(kotlin.reflect.jvm.internal.impl.name.Name.special("<ERROR CLASS: " + str + ">"));
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createErrorScope(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(2);
        }
        return createErrorScope(str, false);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope createErrorScope(java.lang.String str, boolean z) {
        if (str == null) {
            $$$reportNull$$$0(3);
        }
        if (z) {
            return new kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ThrowingScope(str);
        }
        return new kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorScope(str);
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl createErrorProperty() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl propertyDescriptorImplCreate = kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.create(ERROR_CLASS, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC, true, kotlin.reflect.jvm.internal.impl.name.Name.special("<ERROR PROPERTY>"), kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false, false, false, false, false, false);
        propertyDescriptorImplCreate.setType(ERROR_PROPERTY_TYPE, java.util.Collections.emptyList(), null, null);
        if (propertyDescriptorImplCreate == null) {
            $$$reportNull$$$0(4);
        }
        return propertyDescriptorImplCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor createErrorFunction(kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorScope errorScope) {
        if (errorScope == null) {
            $$$reportNull$$$0(5);
        }
        kotlin.reflect.jvm.internal.impl.types.error.ErrorSimpleFunctionDescriptorImpl errorSimpleFunctionDescriptorImpl = new kotlin.reflect.jvm.internal.impl.types.error.ErrorSimpleFunctionDescriptorImpl(ERROR_CLASS, errorScope);
        errorSimpleFunctionDescriptorImpl.initialize((kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) null, java.util.Collections.emptyList(), java.util.Collections.emptyList(), (kotlin.reflect.jvm.internal.impl.types.KotlinType) createErrorType("<ERROR FUNCTION RETURN TYPE>"), kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN, kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PUBLIC);
        return errorSimpleFunctionDescriptorImpl;
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType createErrorType(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        return createErrorTypeWithArguments(str, java.util.Collections.emptyList());
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType createErrorTypeWithCustomDebugName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(8);
        }
        return createErrorTypeWithCustomConstructor(str, createErrorTypeConstructorWithCustomDebugName(str));
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType createErrorTypeWithCustomConstructor(java.lang.String str, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
        if (str == null) {
            $$$reportNull$$$0(9);
        }
        if (typeConstructor == null) {
            $$$reportNull$$$0(10);
        }
        return new kotlin.reflect.jvm.internal.impl.types.ErrorType(typeConstructor, createErrorScope(str));
    }

    public static kotlin.reflect.jvm.internal.impl.types.SimpleType createErrorTypeWithArguments(java.lang.String str, java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        if (list == null) {
            $$$reportNull$$$0(12);
        }
        return new kotlin.reflect.jvm.internal.impl.types.ErrorType(createErrorTypeConstructor(str), createErrorScope(str), list, false);
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeConstructor createErrorTypeConstructor(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(15);
        }
        return createErrorTypeConstructorWithCustomDebugName("[ERROR : " + str + "]", ERROR_CLASS);
    }

    public static kotlin.reflect.jvm.internal.impl.types.TypeConstructor createErrorTypeConstructorWithCustomDebugName(java.lang.String str) {
        if (str == null) {
            $$$reportNull$$$0(16);
        }
        return createErrorTypeConstructorWithCustomDebugName(str, ERROR_CLASS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static kotlin.reflect.jvm.internal.impl.types.TypeConstructor createErrorTypeConstructorWithCustomDebugName(final java.lang.String str, final kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorClassDescriptor errorClassDescriptor) {
        if (str == null) {
            $$$reportNull$$$0(17);
        }
        if (errorClassDescriptor == null) {
            $$$reportNull$$$0(18);
        }
        return new kotlin.reflect.jvm.internal.impl.types.TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.types.ErrorUtils.2
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$2";
                if (i == 1) {
                    objArr[1] = "getSupertypes";
                } else if (i != 2) {
                    objArr[1] = "getParameters";
                } else {
                    objArr[1] = "getBuiltIns";
                }
                throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean isDenotable() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                if (listEmptyList == null) {
                    $$$reportNull$$$0(0);
                }
                return listEmptyList;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getSupertypes */
            public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes() {
                java.util.List listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                if (listEmptyList == null) {
                    $$$reportNull$$$0(1);
                }
                return listEmptyList;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getDeclarationDescriptor */
            public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1268getDeclarationDescriptor() {
                return errorClassDescriptor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
                kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns defaultBuiltIns = kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns.getInstance();
                if (defaultBuiltIns == null) {
                    $$$reportNull$$$0(2);
                }
                return defaultBuiltIns;
            }

            public java.lang.String toString() {
                return str;
            }
        };
    }

    public static boolean isError(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            return false;
        }
        return isErrorClass(declarationDescriptor) || isErrorClass(declarationDescriptor.getContainingDeclaration()) || declarationDescriptor == ERROR_MODULE;
    }

    private static boolean isErrorClass(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.types.ErrorUtils.ErrorClassDescriptor;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getErrorModule() {
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor = ERROR_MODULE;
        if (moduleDescriptor == null) {
            $$$reportNull$$$0(19);
        }
        return moduleDescriptor;
    }

    public static boolean isUninferredParameter(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return kotlinType != null && (kotlinType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.ErrorUtils.UninferredParameterTypeConstructor);
    }

    public static class UninferredParameterTypeConstructor implements kotlin.reflect.jvm.internal.impl.types.TypeConstructor {
        private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor errorTypeConstructor;
        private final kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[0] = "descriptor";
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor getTypeParameterDescriptor() {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = this.typeParameterDescriptor;
            if (typeParameterDescriptor == null) {
                $$$reportNull$$$0(1);
            }
            return typeParameterDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getParameters() {
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = this.errorTypeConstructor.getParameters();
            if (parameters == null) {
                $$$reportNull$$$0(2);
            }
            return parameters;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getSupertypes */
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> mo1269getSupertypes() {
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collectionMo1269getSupertypes = this.errorTypeConstructor.mo1269getSupertypes();
            if (collectionMo1269getSupertypes == null) {
                $$$reportNull$$$0(3);
            }
            return collectionMo1269getSupertypes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return this.errorTypeConstructor.isDenotable();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo1268getDeclarationDescriptor() {
            return this.errorTypeConstructor.mo1268getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns() {
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns builtIns = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(this.typeParameterDescriptor);
            if (builtIns == null) {
                $$$reportNull$$$0(4);
            }
            return builtIns;
        }
    }
}
