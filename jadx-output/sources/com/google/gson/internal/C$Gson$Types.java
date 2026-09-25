package com.google.gson.internal;

/* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C$Gson$Types {
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = new java.lang.reflect.Type[0];

    private C$Gson$Types() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
        return new com.google.gson.internal.C$Gson$Types.ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type type) {
        return new com.google.gson.internal.C$Gson$Types.GenericArrayTypeImpl(type);
    }

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type type) {
        return new com.google.gson.internal.C$Gson$Types.WildcardTypeImpl(type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getUpperBounds() : new java.lang.reflect.Type[]{type}, EMPTY_TYPE_ARRAY);
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type type) {
        return new com.google.gson.internal.C$Gson$Types.WildcardTypeImpl(new java.lang.reflect.Type[]{java.lang.Object.class}, type instanceof java.lang.reflect.WildcardType ? ((java.lang.reflect.WildcardType) type).getLowerBounds() : new java.lang.reflect.Type[]{type});
    }

    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type type) {
        java.lang.reflect.Type genericArrayTypeImpl;
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                genericArrayTypeImpl = cls;
                genericArrayTypeImpl = new com.google.gson.internal.C$Gson$Types.GenericArrayTypeImpl(canonicalize(cls.getComponentType()));
            }
            genericArrayTypeImpl = cls;
            return genericArrayTypeImpl;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            return new com.google.gson.internal.C$Gson$Types.ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return new com.google.gson.internal.C$Gson$Types.GenericArrayTypeImpl(((java.lang.reflect.GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return type;
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        return new com.google.gson.internal.C$Gson$Types.WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            return (java.lang.Class) type;
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) type).getRawType();
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(rawType instanceof java.lang.Class);
            return (java.lang.Class) rawType;
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return java.lang.reflect.Array.newInstance(getRawType(((java.lang.reflect.GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof java.lang.reflect.TypeVariable) {
            return java.lang.Object.class;
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            return getRawType(((java.lang.reflect.WildcardType) type).getUpperBounds()[0]);
        }
        throw new java.lang.IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean equals(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof java.lang.Class) {
            return type.equals(type2);
        }
        if (type instanceof java.lang.reflect.ParameterizedType) {
            if (!(type2 instanceof java.lang.reflect.ParameterizedType)) {
                return false;
            }
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
            java.lang.reflect.ParameterizedType parameterizedType2 = (java.lang.reflect.ParameterizedType) type2;
            return equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && java.util.Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof java.lang.reflect.GenericArrayType) {
            if (type2 instanceof java.lang.reflect.GenericArrayType) {
                return equals(((java.lang.reflect.GenericArrayType) type).getGenericComponentType(), ((java.lang.reflect.GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof java.lang.reflect.WildcardType) {
            if (!(type2 instanceof java.lang.reflect.WildcardType)) {
                return false;
            }
            java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
            java.lang.reflect.WildcardType wildcardType2 = (java.lang.reflect.WildcardType) type2;
            return java.util.Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && java.util.Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof java.lang.reflect.TypeVariable) || !(type2 instanceof java.lang.reflect.TypeVariable)) {
            return false;
        }
        java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type;
        java.lang.reflect.TypeVariable typeVariable2 = (java.lang.reflect.TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static int hashCodeOrZero(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static java.lang.String typeToString(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != java.lang.Object.class) {
                java.lang.Class<? super java.lang.Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static java.lang.reflect.Type getSupertype(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        com.google.gson.internal.C$Gson$Preconditions.checkArgument(cls2.isAssignableFrom(cls));
        return resolve(type, cls, getGenericSupertype(type, cls, cls2));
    }

    public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type type) {
        if (type instanceof java.lang.reflect.GenericArrayType) {
            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        }
        return ((java.lang.Class) type).getComponentType();
    }

    public static java.lang.reflect.Type getCollectionElementType(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        java.lang.reflect.Type supertype = getSupertype(type, cls, java.util.Collection.class);
        if (supertype instanceof java.lang.reflect.WildcardType) {
            supertype = ((java.lang.reflect.WildcardType) supertype).getUpperBounds()[0];
        }
        if (supertype instanceof java.lang.reflect.ParameterizedType) {
            return ((java.lang.reflect.ParameterizedType) supertype).getActualTypeArguments()[0];
        }
        return java.lang.Object.class;
    }

    public static java.lang.reflect.Type[] getMapKeyAndValueTypes(java.lang.reflect.Type type, java.lang.Class<?> cls) {
        if (type == java.util.Properties.class) {
            return new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        }
        java.lang.reflect.Type supertype = getSupertype(type, cls, java.util.Map.class);
        return supertype instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) supertype).getActualTypeArguments() : new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2) {
        return resolve(type, cls, type2, new java.util.HashSet());
    }

    private static java.lang.reflect.Type resolve(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.Type type2, java.util.Collection<java.lang.reflect.TypeVariable> collection) {
        java.lang.reflect.Type type3;
        java.lang.reflect.WildcardType wildcardType;
        while (type2 instanceof java.lang.reflect.TypeVariable) {
            java.lang.reflect.TypeVariable typeVariable = (java.lang.reflect.TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = resolveTypeVariable(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof java.lang.Class) {
            java.lang.Class cls2 = (java.lang.Class) type2;
            if (cls2.isArray()) {
                java.lang.Class<?> componentType = cls2.getComponentType();
                java.lang.reflect.Type typeResolve = resolve(type, cls, componentType, collection);
                return componentType == typeResolve ? cls2 : arrayOf(typeResolve);
            }
        }
        if (type2 instanceof java.lang.reflect.GenericArrayType) {
            java.lang.reflect.GenericArrayType genericArrayType = (java.lang.reflect.GenericArrayType) type2;
            java.lang.reflect.Type genericComponentType = genericArrayType.getGenericComponentType();
            java.lang.reflect.Type typeResolve2 = resolve(type, cls, genericComponentType, collection);
            return genericComponentType == typeResolve2 ? genericArrayType : arrayOf(typeResolve2);
        }
        if (type2 instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type2;
            java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
            java.lang.reflect.Type typeResolve3 = resolve(type, cls, ownerType, collection);
            boolean z = typeResolve3 != ownerType;
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                java.lang.reflect.Type typeResolve4 = resolve(type, cls, actualTypeArguments[i], collection);
                if (typeResolve4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (java.lang.reflect.Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeResolve4;
                }
            }
            return z ? newParameterizedTypeWithOwner(typeResolve3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof java.lang.reflect.WildcardType) {
            wildcardType = (java.lang.reflect.WildcardType) type2;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                java.lang.reflect.Type typeResolve5 = resolve(type, cls, lowerBounds[0], collection);
                if (typeResolve5 != lowerBounds[0]) {
                    type3 = type2;
                    type3 = wildcardType;
                    return supertypeOf(typeResolve5);
                }
            } else if (upperBounds.length == 1) {
                type3 = type2;
                type3 = wildcardType;
                java.lang.reflect.Type typeResolve6 = resolve(type, cls, upperBounds[0], collection);
                type3 = wildcardType;
                if (typeResolve6 != upperBounds[0]) {
                    return subtypeOf(typeResolve6);
                }
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }

    static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type type, java.lang.Class<?> cls, java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.Class<?> clsDeclaringClassOf = declaringClassOf(typeVariable);
        if (clsDeclaringClassOf == null) {
            return typeVariable;
        }
        java.lang.reflect.Type genericSupertype = getGenericSupertype(type, cls, clsDeclaringClassOf);
        if (!(genericSupertype instanceof java.lang.reflect.ParameterizedType)) {
            return typeVariable;
        }
        return ((java.lang.reflect.ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(clsDeclaringClassOf.getTypeParameters(), typeVariable)];
    }

    private static int indexOf(java.lang.Object[] objArr, java.lang.Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> typeVariable) {
        java.lang.reflect.GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof java.lang.Class) {
            return (java.lang.Class) genericDeclaration;
        }
        return null;
    }

    static void checkNotPrimitive(java.lang.reflect.Type type) {
        com.google.gson.internal.C$Gson$Preconditions.checkArgument(((type instanceof java.lang.Class) && ((java.lang.Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(java.lang.reflect.Type type, java.lang.reflect.Type type2, java.lang.reflect.Type... typeArr) {
            if (type2 instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type2;
                boolean z = true;
                boolean z2 = java.lang.reflect.Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(z);
            }
            this.ownerType = type == null ? null : com.google.gson.internal.C$Gson$Types.canonicalize(type);
            this.rawType = com.google.gson.internal.C$Gson$Types.canonicalize(type2);
            java.lang.reflect.Type[] typeArr2 = (java.lang.reflect.Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(this.typeArguments[i]);
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(this.typeArguments[i]);
                java.lang.reflect.Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = com.google.gson.internal.C$Gson$Types.canonicalize(typeArr3[i]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
            return (java.lang.reflect.Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getOwnerType() {
            return this.ownerType;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.ParameterizedType) && com.google.gson.internal.C$Gson$Types.equals(this, (java.lang.reflect.ParameterizedType) obj);
        }

        public int hashCode() {
            return (java.util.Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ com.google.gson.internal.C$Gson$Types.hashCodeOrZero(this.ownerType);
        }

        public java.lang.String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return com.google.gson.internal.C$Gson$Types.typeToString(this.rawType);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder((length + 1) * 30);
            sb.append(com.google.gson.internal.C$Gson$Types.typeToString(this.rawType));
            sb.append("<");
            sb.append(com.google.gson.internal.C$Gson$Types.typeToString(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(com.google.gson.internal.C$Gson$Types.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type type) {
            this.componentType = com.google.gson.internal.C$Gson$Types.canonicalize(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
            return this.componentType;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.GenericArrayType) && com.google.gson.internal.C$Gson$Types.equals(this, (java.lang.reflect.GenericArrayType) obj);
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public java.lang.String toString() {
            return com.google.gson.internal.C$Gson$Types.typeToString(this.componentType) + "[]";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        public WildcardTypeImpl(java.lang.reflect.Type[] typeArr, java.lang.reflect.Type[] typeArr2) {
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(typeArr.length == 1);
            if (typeArr2.length == 1) {
                com.google.gson.internal.C$Gson$Preconditions.checkNotNull(typeArr2[0]);
                com.google.gson.internal.C$Gson$Types.checkNotPrimitive(typeArr2[0]);
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(typeArr[0] == java.lang.Object.class);
                this.lowerBound = com.google.gson.internal.C$Gson$Types.canonicalize(typeArr2[0]);
                this.upperBound = java.lang.Object.class;
                return;
            }
            com.google.gson.internal.C$Gson$Preconditions.checkNotNull(typeArr[0]);
            com.google.gson.internal.C$Gson$Types.checkNotPrimitive(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = com.google.gson.internal.C$Gson$Types.canonicalize(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
            return new java.lang.reflect.Type[]{this.upperBound};
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
            java.lang.reflect.Type type = this.lowerBound;
            return type != null ? new java.lang.reflect.Type[]{type} : com.google.gson.internal.C$Gson$Types.EMPTY_TYPE_ARRAY;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof java.lang.reflect.WildcardType) && com.google.gson.internal.C$Gson$Types.equals(this, (java.lang.reflect.WildcardType) obj);
        }

        public int hashCode() {
            java.lang.reflect.Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public java.lang.String toString() {
            if (this.lowerBound != null) {
                return "? super " + com.google.gson.internal.C$Gson$Types.typeToString(this.lowerBound);
            }
            if (this.upperBound == java.lang.Object.class) {
                return "?";
            }
            return "? extends " + com.google.gson.internal.C$Gson$Types.typeToString(this.upperBound);
        }
    }
}
