package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface FieldConverter<I, O> {
        O convert(I i);

        I convertBack(O o);

        int zach();

        int zaci();
    }

    public abstract java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings();

    protected abstract java.lang.Object getValueObject(java.lang.String str);

    protected abstract boolean isPrimitiveFieldSet(java.lang.String str);

    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        if (field.zaqh == 11) {
            if (field.zaqi) {
                java.lang.String str = field.zaqj;
                throw new java.lang.UnsupportedOperationException("Concrete type arrays not supported");
            }
            java.lang.String str2 = field.zaqj;
            throw new java.lang.UnsupportedOperationException("Concrete types not supported");
        }
        return isPrimitiveFieldSet(field.zaqj);
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class Field<I, O> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.zai CREATOR = new com.google.android.gms.common.server.response.zai();
        private final int zali;
        protected final int zaqf;
        protected final boolean zaqg;
        protected final int zaqh;
        protected final boolean zaqi;
        protected final java.lang.String zaqj;
        protected final int zaqk;
        protected final java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> zaql;
        private final java.lang.String zaqm;
        private com.google.android.gms.common.server.response.zaj zaqn;
        private com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> zaqo;

        Field(int i, int i2, boolean z, int i3, boolean z2, java.lang.String str, int i4, java.lang.String str2, com.google.android.gms.common.server.converter.zab zabVar) {
            this.zali = i;
            this.zaqf = i2;
            this.zaqg = z;
            this.zaqh = i3;
            this.zaqi = z2;
            this.zaqj = str;
            this.zaqk = i4;
            if (str2 == null) {
                this.zaql = null;
                this.zaqm = null;
            } else {
                this.zaql = com.google.android.gms.common.server.response.SafeParcelResponse.class;
                this.zaqm = str2;
            }
            if (zabVar == null) {
                this.zaqo = null;
            } else {
                this.zaqo = (com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O>) zabVar.zacg();
            }
        }

        private Field(int i, boolean z, int i2, boolean z2, java.lang.String str, int i3, java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> fieldConverter) {
            this.zali = 1;
            this.zaqf = i;
            this.zaqg = z;
            this.zaqh = i2;
            this.zaqi = z2;
            this.zaqj = str;
            this.zaqk = i3;
            this.zaql = cls;
            if (cls == null) {
                this.zaqm = null;
            } else {
                this.zaqm = cls.getCanonicalName();
            }
            this.zaqo = fieldConverter;
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> zacj() {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(this.zali, this.zaqf, this.zaqg, this.zaqh, this.zaqi, this.zaqj, this.zaqk, this.zaqm, zacm());
        }

        public int getSafeParcelableFieldId() {
            return this.zaqk;
        }

        private final java.lang.String zack() {
            java.lang.String str = this.zaqm;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final boolean zacl() {
            return this.zaqo != null;
        }

        public final void zaa(com.google.android.gms.common.server.response.zaj zajVar) {
            this.zaqn = zajVar;
        }

        private final com.google.android.gms.common.server.converter.zab zacm() {
            com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> fieldConverter = this.zaqo;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zab.zaa(fieldConverter);
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse zacn() throws java.lang.IllegalAccessException, java.lang.InstantiationException {
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls = this.zaql;
            if (cls == com.google.android.gms.common.server.response.SafeParcelResponse.class) {
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaqn, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new com.google.android.gms.common.server.response.SafeParcelResponse(this.zaqn, this.zaqm);
            }
            return cls.newInstance();
        }

        public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zaco() {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaqm);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaqn);
            return this.zaqn.zai(this.zaqm);
        }

        public final O convert(I i) {
            return this.zaqo.convert(i);
        }

        public final I convertBack(O o) {
            return this.zaqo.convertBack(o);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, java.lang.Integer> forInteger(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(0, false, 0, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, java.lang.Long> forLong(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(2, false, 2, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, java.lang.Float> forFloat(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(3, false, 3, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, java.lang.Double> forDouble(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(4, false, 4, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, java.lang.Boolean> forBoolean(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(6, false, 6, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, java.lang.String> forString(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(7, false, 7, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> forStrings(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(7, true, 7, true, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], byte[]> forBase64(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(8, false, 8, false, str, i, null, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> forStringMap(java.lang.String str, int i) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(10, false, 10, false, str, i, null, null);
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<T, T> forConcreteType(java.lang.String str, int i, java.lang.Class<T> cls) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(11, false, 11, false, str, i, cls, null);
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> forConcreteTypeArray(java.lang.String str, int i, java.lang.Class<T> cls) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field<>(11, true, 11, true, str, i, cls, null);
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field withConverter(java.lang.String str, int i, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> fieldConverter, boolean z) {
            return new com.google.android.gms.common.server.response.FastJsonResponse.Field(fieldConverter.zach(), z, fieldConverter.zaci(), false, str, i, null, fieldConverter);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zaqf);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zaqg);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zaqh);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zaqi);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zaqj, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, zack(), false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, zacm(), i, false);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        public java.lang.String toString() {
            com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("versionCode", java.lang.Integer.valueOf(this.zali)).add("typeIn", java.lang.Integer.valueOf(this.zaqf)).add("typeInArray", java.lang.Boolean.valueOf(this.zaqg)).add("typeOut", java.lang.Integer.valueOf(this.zaqh)).add("typeOutArray", java.lang.Boolean.valueOf(this.zaqi)).add("outputFieldName", this.zaqj).add("safeParcelFieldId", java.lang.Integer.valueOf(this.zaqk)).add("concreteTypeName", zack());
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls = this.zaql;
            if (cls != null) {
                toStringHelperAdd.add("concreteType.class", cls.getCanonicalName());
            }
            com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<I, O> fieldConverter = this.zaqo;
            if (fieldConverter != null) {
                toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd.toString();
        }
    }

    private final <I, O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> field, I i) {
        java.lang.String str = field.zaqj;
        O oConvert = field.convert(i);
        switch (field.zaqh) {
            case 0:
                if (zaa(str, oConvert)) {
                    setIntegerInternal(field, str, ((java.lang.Integer) oConvert).intValue());
                    return;
                }
                return;
            case 1:
                zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>) field, str, (java.math.BigInteger) oConvert);
                return;
            case 2:
                if (zaa(str, oConvert)) {
                    setLongInternal(field, str, ((java.lang.Long) oConvert).longValue());
                    return;
                }
                return;
            case 3:
            default:
                int i2 = field.zaqh;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i2);
                throw new java.lang.IllegalStateException(sb.toString());
            case 4:
                if (zaa(str, oConvert)) {
                    zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>) field, str, ((java.lang.Double) oConvert).doubleValue());
                    return;
                }
                return;
            case 5:
                zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>) field, str, (java.math.BigDecimal) oConvert);
                return;
            case 6:
                if (zaa(str, oConvert)) {
                    setBooleanInternal(field, str, ((java.lang.Boolean) oConvert).booleanValue());
                    return;
                }
                return;
            case 7:
                setStringInternal(field, str, (java.lang.String) oConvert);
                return;
            case 8:
            case 9:
                if (zaa(str, oConvert)) {
                    setDecodedBytesInternal(field, str, (byte[]) oConvert);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static <O, I> I zab(com.google.android.gms.common.server.response.FastJsonResponse.Field<I, O> field, java.lang.Object obj) {
        return ((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null ? field.convertBack(obj) : obj;
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, O> field, int i) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, java.lang.Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zaqj, i);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Integer>, O> field, java.util.ArrayList<java.lang.Integer> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            zaa(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.math.BigInteger, O> field, java.math.BigInteger bigInteger) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, bigInteger);
        } else {
            zaa(field, field.zaqj, bigInteger);
        }
    }

    public final <O> void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.math.BigInteger>, O> field, java.util.ArrayList<java.math.BigInteger> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            zab(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, O> field, long j) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, java.lang.Long.valueOf(j));
        } else {
            setLongInternal(field, field.zaqj, j);
        }
    }

    public final <O> void zac(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Long>, O> field, java.util.ArrayList<java.lang.Long> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            zac(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, O> field, float f) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, java.lang.Float.valueOf(f));
        } else {
            zaa((com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>) field, field.zaqj, f);
        }
    }

    public final <O> void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Float>, O> field, java.util.ArrayList<java.lang.Float> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            zad(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, O> field, double d) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, java.lang.Double.valueOf(d));
        } else {
            zaa(field, field.zaqj, d);
        }
    }

    public final <O> void zae(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Double>, O> field, java.util.ArrayList<java.lang.Double> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            zae(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.math.BigDecimal, O> field, java.math.BigDecimal bigDecimal) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, bigDecimal);
        } else {
            zaa(field, field.zaqj, bigDecimal);
        }
    }

    public final <O> void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.math.BigDecimal>, O> field, java.util.ArrayList<java.math.BigDecimal> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            zaf(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, O> field, boolean z) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, java.lang.Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zaqj, z);
        }
    }

    public final <O> void zag(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.Boolean>, O> field, java.util.ArrayList<java.lang.Boolean> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            zag(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, O> field, java.lang.String str) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, str);
        } else {
            setStringInternal(field, field.zaqj, str);
        }
    }

    public final <O> void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, O> field, java.util.ArrayList<java.lang.String> arrayList) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, arrayList);
        } else {
            setStringsInternal(field, field.zaqj, arrayList);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], O> field, byte[] bArr) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zaqj, bArr);
        }
    }

    public final <O> void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.Map<java.lang.String, java.lang.String>, O> field, java.util.Map<java.lang.String, java.lang.String> map) {
        if (((com.google.android.gms.common.server.response.FastJsonResponse.Field) field).zaqo != null) {
            zaa(field, map);
        } else {
            setStringMapInternal(field, field.zaqj, map);
        }
    }

    protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i) {
        throw new java.lang.UnsupportedOperationException("Integer not supported");
    }

    protected void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
        throw new java.lang.UnsupportedOperationException("Integer list not supported");
    }

    protected void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.math.BigInteger bigInteger) {
        throw new java.lang.UnsupportedOperationException("BigInteger not supported");
    }

    protected void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.math.BigInteger> arrayList) {
        throw new java.lang.UnsupportedOperationException("BigInteger list not supported");
    }

    protected void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, long j) {
        throw new java.lang.UnsupportedOperationException("Long not supported");
    }

    protected void zac(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
        throw new java.lang.UnsupportedOperationException("Long list not supported");
    }

    protected void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, float f) {
        throw new java.lang.UnsupportedOperationException("Float not supported");
    }

    protected void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Float> arrayList) {
        throw new java.lang.UnsupportedOperationException("Float list not supported");
    }

    protected void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, double d) {
        throw new java.lang.UnsupportedOperationException("Double not supported");
    }

    protected void zae(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Double> arrayList) {
        throw new java.lang.UnsupportedOperationException("Double list not supported");
    }

    protected void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        throw new java.lang.UnsupportedOperationException("BigDecimal not supported");
    }

    protected void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.math.BigDecimal> arrayList) {
        throw new java.lang.UnsupportedOperationException("BigDecimal list not supported");
    }

    protected void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, boolean z) {
        throw new java.lang.UnsupportedOperationException("Boolean not supported");
    }

    protected void zag(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList) {
        throw new java.lang.UnsupportedOperationException("Boolean list not supported");
    }

    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException("String not supported");
    }

    protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        throw new java.lang.UnsupportedOperationException("String list not supported");
    }

    protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        throw new java.lang.UnsupportedOperationException("byte[] not supported");
    }

    protected void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        throw new java.lang.UnsupportedOperationException("String map not supported");
    }

    private static <O> boolean zaa(java.lang.String str, O o) {
        if (o != null) {
            return true;
        }
        if (!android.util.Log.isLoggable("FastJsonResponse", 6)) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 58);
        sb.append("Output field (");
        sb.append(str);
        sb.append(") has a null value, but expected a primitive");
        android.util.Log.e("FastJsonResponse", sb.toString());
        return false;
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, T t) {
        throw new java.lang.UnsupportedOperationException("Concrete type not supported");
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        throw new java.lang.UnsupportedOperationException("Concrete type array not supported");
    }

    public java.lang.String toString() {
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = getFieldMappings();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        for (java.lang.String str : fieldMappings.keySet()) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                java.lang.Object objZab = zab(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objZab == null) {
                    sb.append("null");
                } else {
                    switch (field.zaqh) {
                        case 8:
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encode((byte[]) objZab));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe((byte[]) objZab));
                            sb.append("\"");
                            break;
                        case 10:
                            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(sb, (java.util.HashMap) objZab);
                            break;
                        default:
                            if (field.zaqg) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) objZab;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    java.lang.Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaa(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                zaa(sb, field, objZab);
                            }
                            break;
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    protected java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        java.lang.String str = field.zaqj;
        if (field.zaql != null) {
            com.google.android.gms.common.internal.Preconditions.checkState(getValueObject(field.zaqj) == null, "Concrete field shouldn't be value object: %s", field.zaqj);
            boolean z = field.zaqi;
            try {
                char upperCase = java.lang.Character.toUpperCase(str.charAt(0));
                java.lang.String strSubstring = str.substring(1);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strSubstring).length() + 4);
                sb.append("get");
                sb.append(upperCase);
                sb.append(strSubstring);
                return getClass().getMethod(sb.toString(), new java.lang.Class[0]).invoke(this, new java.lang.Object[0]);
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        return getValueObject(field.zaqj);
    }

    private static void zaa(java.lang.StringBuilder sb, com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.Object obj) {
        if (field.zaqf == 11) {
            sb.append(field.zaql.cast(obj).toString());
        } else {
            if (field.zaqf == 7) {
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.JsonUtils.escapeString((java.lang.String) obj));
                sb.append("\"");
                return;
            }
            sb.append(obj);
        }
    }
}
