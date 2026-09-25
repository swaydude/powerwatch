package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class FieldSet<FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> {
    private static final kotlin.reflect.jvm.internal.impl.protobuf.FieldSet DEFAULT_INSTANCE = new kotlin.reflect.jvm.internal.impl.protobuf.FieldSet(true);
    private boolean isImmutable;
    private boolean hasLazyField = false;
    private final kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> fields = kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap.newFieldMap(16);

    public interface FieldDescriptorLite<T extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<T>> extends java.lang.Comparable<T> {
        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType getLiteJavaType();

        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType getLiteType();

        int getNumber();

        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder internalMergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
    }

    private FieldSet(boolean z) {
        makeImmutable();
    }

    public static <T extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<T>> kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<T> newFieldSet() {
        return new kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<>();
    }

    public static <T extends kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<T>> kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType> clone() {
        kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType> fieldSetNewFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            fieldSetNewFieldSet.setField((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            fieldSetNewFieldSet.setField((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetNewFieldSet.hasLazyField = this.hasLazyField;
        return fieldSetNewFieldSet;
    }

    public java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> iterator() {
        if (this.hasLazyField) {
            return new kotlin.reflect.jvm.internal.impl.protobuf.LazyField.LazyIterator(this.fields.entrySet().iterator());
        }
        return this.fields.entrySet().iterator();
    }

    public boolean hasField(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(fielddescriptortype) != null;
    }

    public java.lang.Object getField(FieldDescriptorType fielddescriptortype) {
        java.lang.Object obj = this.fields.get(fielddescriptortype);
        return obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField ? ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue() : obj;
    }

    public void setField(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        if (fielddescriptortype.isRepeated()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        } else {
            verifyType(fielddescriptortype.getLiteType(), obj);
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put(fielddescriptortype, obj);
    }

    public int getRepeatedFieldCount(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(fielddescriptortype);
        if (field == null) {
            return 0;
        }
        return ((java.util.List) field).size();
    }

    public java.lang.Object getRepeatedField(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            throw new java.lang.IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        java.lang.Object field = getField(fielddescriptortype);
        if (field == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return ((java.util.List) field).get(i);
    }

    public void addRepeatedField(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        java.util.List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            throw new java.lang.IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(fielddescriptortype.getLiteType(), obj);
        java.lang.Object field = getField(fielddescriptortype);
        if (field == null) {
            arrayList = new java.util.ArrayList();
            this.fields.put(fielddescriptortype, arrayList);
        } else {
            arrayList = (java.util.List) field;
        }
        arrayList.add(obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    private static void verifyType(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        java.util.Objects.requireNonNull(obj);
        boolean z = true;
        boolean z2 = false;
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                z2 = obj instanceof java.lang.Integer;
                break;
            case 2:
                z2 = obj instanceof java.lang.Long;
                break;
            case 3:
                z2 = obj instanceof java.lang.Float;
                break;
            case 4:
                z2 = obj instanceof java.lang.Double;
                break;
            case 5:
                z2 = obj instanceof java.lang.Boolean;
                break;
            case 6:
                z2 = obj instanceof java.lang.String;
                break;
            case 7:
                if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case 8:
                if (!(obj instanceof java.lang.Integer) && !(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite)) {
                    z = false;
                }
                z2 = z;
                break;
            case 9:
                if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) && !(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField)) {
                    z = false;
                }
                z2 = z;
                break;
        }
        if (!z2) {
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private boolean isInitialized(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE) {
            if (key.isRepeated()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (value instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) {
                    if (!((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    static int getWireFormatForFieldType(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public void mergeFrom(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<FieldDescriptorType> fieldSet) {
        for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        java.util.Iterator it = fieldSet.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((java.util.Map.Entry) it.next());
        }
    }

    private java.lang.Object cloneIfMutable(java.lang.Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private void mergeFromField(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            value = ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) value).getValue();
        }
        if (key.isRepeated()) {
            java.lang.Object field = getField(key);
            if (field == null) {
                field = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put(key, field);
            return;
        }
        if (key.getLiteJavaType() == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE) {
            java.lang.Object field2 = getField(key);
            if (field2 == null) {
                this.fields.put(key, cloneIfMutable(value));
                return;
            } else {
                this.fields.put(key, key.internalMergeFrom(((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) field2).toBuilder(), (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) value).build());
                return;
            }
        }
        this.fields.put(key, cloneIfMutable(value));
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    public static java.lang.Object readPrimitiveField(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, boolean z) throws java.io.IOException {
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return java.lang.Double.valueOf(codedInputStream.readDouble());
            case 2:
                return java.lang.Float.valueOf(codedInputStream.readFloat());
            case 3:
                return java.lang.Long.valueOf(codedInputStream.readInt64());
            case 4:
                return java.lang.Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return java.lang.Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return java.lang.Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return java.lang.Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return java.lang.Boolean.valueOf(codedInputStream.readBool());
            case 9:
                if (z) {
                    return codedInputStream.readStringRequireUtf8();
                }
                return codedInputStream.readString();
            case 10:
                return codedInputStream.readBytes();
            case 11:
                return java.lang.Integer.valueOf(codedInputStream.readUInt32());
            case 12:
                return java.lang.Integer.valueOf(codedInputStream.readSFixed32());
            case 13:
                return java.lang.Long.valueOf(codedInputStream.readSFixed64());
            case 14:
                return java.lang.Integer.valueOf(codedInputStream.readSInt32());
            case 15:
                return java.lang.Long.valueOf(codedInputStream.readSInt64());
            case 16:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new java.lang.IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static void writeElement(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) throws java.io.IOException {
        if (fieldType == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    private static void writeElementNoTag(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) throws java.io.IOException {
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeStringNoTag((java.lang.String) obj);
                break;
            case 10:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
                    codedOutputStream.writeBytesNoTag((kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj);
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                }
                break;
            case 11:
                codedOutputStream.writeUInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.writeSFixed32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.writeSFixed64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.writeSInt32NoTag(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSInt64NoTag(((java.lang.Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeGroupNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
                break;
            case 17:
                codedOutputStream.writeMessageNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
                break;
            case 18:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) {
                    codedOutputStream.writeEnumNoTag(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) obj).getNumber());
                } else {
                    codedOutputStream.writeEnumNoTag(((java.lang.Integer) obj).intValue());
                }
                break;
        }
    }

    public static void writeField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            java.util.List list = (java.util.List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int iComputeElementSizeNoTag = 0;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it.next());
                }
                codedOutputStream.writeRawVarint32(iComputeElementSizeNoTag);
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    writeElementNoTag(codedOutputStream, liteType, it2.next());
                }
                return;
            }
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it3.next());
            }
            return;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
            writeElement(codedOutputStream, liteType, number, ((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj);
        }
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            java.util.Map.Entry<K, java.lang.Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        java.util.Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    private static int computeElementSize(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, int i, java.lang.Object obj) {
        int iComputeTagSize = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeTagSize(i);
        if (fieldType == kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return iComputeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    private static int computeElementSizeNoTag(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType fieldType, java.lang.Object obj) {
        switch (kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeDoubleSizeNoTag(((java.lang.Double) obj).doubleValue());
            case 2:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFloatSizeNoTag(((java.lang.Float) obj).floatValue());
            case 3:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 4:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeUInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 5:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 6:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 7:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 8:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBoolSizeNoTag(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeStringSizeNoTag((java.lang.String) obj);
            case 10:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString) {
                    return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeBytesSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.ByteString) obj);
                }
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 11:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeUInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 12:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSFixed32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 13:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSFixed64SizeNoTag(((java.lang.Long) obj).longValue());
            case 14:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSInt32SizeNoTag(((java.lang.Integer) obj).intValue());
            case 15:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeSInt64SizeNoTag(((java.lang.Long) obj).longValue());
            case 16:
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeGroupSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
            case 17:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField) {
                    return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.LazyField) obj);
                }
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeMessageSizeNoTag((kotlin.reflect.jvm.internal.impl.protobuf.MessageLite) obj);
            case 18:
                if (obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) {
                    return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSizeNoTag(((kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite) obj).getNumber());
                }
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeEnumSizeNoTag(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite<?> fieldDescriptorLite, java.lang.Object obj) {
        kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            int iComputeElementSize = 0;
            if (fieldDescriptorLite.isPacked()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    iComputeElementSize += computeElementSizeNoTag(liteType, it.next());
                }
                return kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeTagSize(number) + iComputeElementSize + kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.computeRawVarint32Size(iComputeElementSize);
            }
            java.util.Iterator it2 = ((java.util.List) obj).iterator();
            while (it2.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it2.next());
            }
            return iComputeElementSize;
        }
        return computeElementSize(liteType, number, obj);
    }
}
