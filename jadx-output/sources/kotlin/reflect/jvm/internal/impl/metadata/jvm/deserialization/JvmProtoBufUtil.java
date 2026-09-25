package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* JADX INFO: compiled from: JvmProtoBufUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBufUtil {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite EXTENSION_REGISTRY;
    public static final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil INSTANCE = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil();

    static {
        kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLiteNewInstance = kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite.newInstance();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(extensionRegistryLiteNewInstance, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        EXTENSION_REGISTRY = extensionRegistryLiteNewInstance;
    }

    private JvmProtoBufUtil() {
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> readClassDataFrom(java.lang.String[] data, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(strings, "strings");
        byte[] bArrDecodeBytes = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decodeBytes(data);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bArrDecodeBytes, "BitEncoding.decodeBytes(data)");
        return readClassDataFrom(bArrDecodeBytes, strings);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class> readClassDataFrom(byte[] bytes, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(bytes, "bytes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(strings, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        return new kotlin.Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strings), kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> readPackageDataFrom(java.lang.String[] data, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(strings, "strings");
        byte[] bArrDecodeBytes = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decodeBytes(data);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bArrDecodeBytes, "BitEncoding.decodeBytes(data)");
        return readPackageDataFrom(bArrDecodeBytes, strings);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package> readPackageDataFrom(byte[] bytes, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(bytes, "bytes");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(strings, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
        return new kotlin.Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strings), kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function> readFunctionDataFrom(java.lang.String[] data, java.lang.String[] strings) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(data, "data");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(strings, "strings");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding.decodeBytes(data));
        return new kotlin.Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strings), kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver readNameResolver(java.io.InputStream inputStream, java.lang.String[] strArr) throws java.io.IOException {
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes delimitedFrom = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, EXTENSION_REGISTRY);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(delimitedFrom, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver(delimitedFrom, strArr);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method getJvmMethodSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.methodSignature;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.methodSignature");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(proto, generatedExtension);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? proto.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature != null && jvmMethodSignature.hasDesc()) {
            string = nameResolver.getString(jvmMethodSignature.getDesc());
        } else {
            java.util.List listListOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(proto, typeTable));
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list = valueParameterList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter it : list) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                arrayList.add(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(it, typeTable));
            }
            java.util.List listPlus = kotlin.collections.CollectionsKt.plus((java.util.Collection) listListOfNotNull, (java.lang.Iterable) arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listPlus, 10));
            java.util.Iterator it2 = listPlus.iterator();
            while (it2.hasNext()) {
                java.lang.String strMapTypeDefault = INSTANCE.mapTypeDefault((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) it2.next(), nameResolver);
                if (strMapTypeDefault == null) {
                    return null;
                }
                arrayList2.add(strMapTypeDefault);
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.lang.String strMapTypeDefault2 = mapTypeDefault(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(proto, typeTable), nameResolver);
            if (strMapTypeDefault2 == null) {
                return null;
            }
            string = kotlin.collections.CollectionsKt.joinToString$default(arrayList3, "", "(", ")", 0, null, null, 56, null) + strMapTypeDefault2;
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method(nameResolver.getString(name), string);
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method getJvmConstructorSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor proto, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable) {
        java.lang.String strJoinToString$default;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(nameResolver, "nameResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeTable, "typeTable");
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.constructorSignature;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(generatedExtension, "JvmProtoBuf.constructorSignature");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(proto, generatedExtension);
        java.lang.String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature != null && jvmMethodSignature.hasDesc()) {
            strJoinToString$default = nameResolver.getString(jvmMethodSignature.getDesc());
        } else {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(valueParameterList, "proto.valueParameterList");
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> list = valueParameterList;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter it : list) {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                java.lang.String strMapTypeDefault = jvmProtoBufUtil.mapTypeDefault(kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(it, typeTable), nameResolver);
                if (strMapTypeDefault == null) {
                    return null;
                }
                arrayList.add(strMapTypeDefault);
            }
            strJoinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", "(", ")V", 0, null, null, 56, null);
        }
        return new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method(string, strJoinToString$default);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field getJvmFieldSignature$default(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil jvmProtoBufUtil, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x005d: IF  (r4v2 java.lang.String) != (null java.lang.String)  -> B:22:0x005f A[HIDDEN]
          (r4v2 java.lang.String) from 0x005f: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:21:0x005d, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r4, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r5, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            r0 = r4
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage r0 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) r0
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature
            java.lang.String r2 = "JvmProtoBuf.propertySignature"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r0, r1)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r0
            r1 = 0
            if (r0 == 0) goto L69
            boolean r2 = r0.hasField()
            if (r2 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = r0.getField()
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 != 0) goto L33
            if (r7 == 0) goto L33
            return r1
        L33:
            if (r0 == 0) goto L40
            boolean r7 = r0.hasName()
            if (r7 == 0) goto L40
            int r7 = r0.getName()
            goto L44
        L40:
            int r7 = r4.getName()
        L44:
            if (r0 == 0) goto L55
            boolean r2 = r0.hasDesc()
            if (r2 == 0) goto L55
            int r4 = r0.getDesc()
            java.lang.String r4 = r5.getString(r4)
            goto L5f
        L55:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(r4, r6)
            java.lang.String r4 = r3.mapTypeDefault(r4, r5)
            if (r4 == 0) goto L69
        L5f:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field");
    }

    private final java.lang.String mapTypeDefault(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver) {
        if (type.hasClassName()) {
            return kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName()));
        }
        return null;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isMovedFromInterfaceCompanion(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property proto) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(proto, "proto");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField is_moved_from_interface_companion = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        java.lang.Object extension = proto.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.flags);
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(extension, "proto.getExtension(JvmProtoBuf.flags)");
        java.lang.Boolean bool = is_moved_from_interface_companion.get(((java.lang.Number) extension).intValue());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bool, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return bool.booleanValue();
    }
}
