package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelResponse extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.SafeParcelResponse> CREATOR = new com.google.android.gms.common.server.response.zap();
    private final java.lang.String mClassName;
    private final int zali;
    private final com.google.android.gms.common.server.response.zaj zaqn;
    private final android.os.Parcel zarp;
    private final int zarq;
    private int zarr;
    private int zars;

    public SafeParcelResponse(com.google.android.gms.common.server.response.zaj zajVar, java.lang.String str) {
        this.zali = 1;
        this.zarp = android.os.Parcel.obtain();
        this.zarq = 0;
        this.zaqn = (com.google.android.gms.common.server.response.zaj) com.google.android.gms.common.internal.Preconditions.checkNotNull(zajVar);
        this.mClassName = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zarr = 0;
    }

    private SafeParcelResponse(com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable, com.google.android.gms.common.server.response.zaj zajVar, java.lang.String str) {
        this.zali = 1;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        this.zarp = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.zarq = 1;
        this.zaqn = (com.google.android.gms.common.server.response.zaj) com.google.android.gms.common.internal.Preconditions.checkNotNull(zajVar);
        this.mClassName = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zarr = 2;
    }

    public static <T extends com.google.android.gms.common.server.response.FastJsonResponse & com.google.android.gms.common.internal.safeparcel.SafeParcelable> com.google.android.gms.common.server.response.SafeParcelResponse from(T t) {
        java.lang.String canonicalName = t.getClass().getCanonicalName();
        com.google.android.gms.common.server.response.zaj zajVar = new com.google.android.gms.common.server.response.zaj(t.getClass());
        zaa(zajVar, t);
        zajVar.zacq();
        zajVar.zacp();
        return new com.google.android.gms.common.server.response.SafeParcelResponse(t, zajVar, canonicalName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zaa(com.google.android.gms.common.server.response.zaj zajVar, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) {
        java.lang.Class<?> cls = fastJsonResponse.getClass();
        if (zajVar.zaa(cls)) {
            return;
        }
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zajVar.zaa(cls, fieldMappings);
        java.util.Iterator<java.lang.String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            java.lang.Class<? extends com.google.android.gms.common.server.response.FastJsonResponse> cls2 = field.zaql;
            if (cls2 != null) {
                try {
                    zaa(zajVar, cls2.newInstance());
                } catch (java.lang.IllegalAccessException e) {
                    java.lang.String strValueOf = java.lang.String.valueOf(field.zaql.getCanonicalName());
                    throw new java.lang.IllegalStateException(strValueOf.length() != 0 ? "Could not access object of type ".concat(strValueOf) : new java.lang.String("Could not access object of type "), e);
                } catch (java.lang.InstantiationException e2) {
                    java.lang.String strValueOf2 = java.lang.String.valueOf(field.zaql.getCanonicalName());
                    throw new java.lang.IllegalStateException(strValueOf2.length() != 0 ? "Could not instantiate an object of type ".concat(strValueOf2) : new java.lang.String("Could not instantiate an object of type "), e2);
                }
            }
        }
    }

    SafeParcelResponse(int i, android.os.Parcel parcel, com.google.android.gms.common.server.response.zaj zajVar) {
        this.zali = i;
        this.zarp = (android.os.Parcel) com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        this.zarq = 2;
        this.zaqn = zajVar;
        if (zajVar == null) {
            this.mClassName = null;
        } else {
            this.mClassName = zajVar.zacr();
        }
        this.zarr = 2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.server.response.zaj zajVar;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(parcel, 2, zacs(), false);
        int i2 = this.zarq;
        if (i2 == 0) {
            zajVar = null;
        } else if (i2 == 1 || i2 == 2) {
            zajVar = this.zaqn;
        } else {
            int i3 = this.zarq;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i3);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, zajVar, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private final android.os.Parcel zacs() {
        int i = this.zarr;
        if (i == 0) {
            this.zars = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(this.zarp);
        } else {
            if (i == 1) {
            }
            return this.zarp;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(this.zarp, this.zars);
        this.zarr = 2;
        return this.zarp;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
        com.google.android.gms.common.server.response.zaj zajVar = this.zaqn;
        if (zajVar == null) {
            return null;
        }
        return zajVar.zai(this.mClassName);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.Object getValueObject(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isPrimitiveFieldSet(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    private final void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field) {
        if (!(field.zaqk != -1)) {
            throw new java.lang.IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        android.os.Parcel parcel = this.zarp;
        if (parcel == null) {
            throw new java.lang.IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.zarr;
        if (i == 0) {
            this.zars = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            this.zarr = 1;
        } else if (i != 1) {
            if (i == 2) {
                throw new java.lang.IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
            throw new java.lang.IllegalStateException("Unknown parse state in SafeParcelResponse.");
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(this.zarp, field.getSafeParcelableFieldId(), i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
        zab(field);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = arrayList.get(i).intValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(this.zarp, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.math.BigInteger bigInteger) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigInteger(this.zarp, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.math.BigInteger> arrayList) {
        zab(field);
        int size = arrayList.size();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = arrayList.get(i);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigIntegerArray(this.zarp, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, long j) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(this.zarp, field.getSafeParcelableFieldId(), j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zac(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
        zab(field);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = arrayList.get(i).longValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongArray(this.zarp, field.getSafeParcelableFieldId(), jArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, float f) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(this.zarp, field.getSafeParcelableFieldId(), f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Float> arrayList) {
        zab(field);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList.get(i).floatValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(this.zarp, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, double d) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(this.zarp, field.getSafeParcelableFieldId(), d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zae(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Double> arrayList) {
        zab(field);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).doubleValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleArray(this.zarp, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(this.zarp, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.math.BigDecimal> arrayList) {
        zab(field);
        int size = arrayList.size();
        java.math.BigDecimal[] bigDecimalArr = new java.math.BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = arrayList.get(i);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimalArray(this.zarp, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, boolean z) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(this.zarp, field.getSafeParcelableFieldId(), z);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zag(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.Boolean> arrayList) {
        zab(field);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = arrayList.get(i).booleanValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(this.zarp, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(this.zarp, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        zab(field);
        int size = arrayList.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(this.zarp, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(this.zarp, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        zab(field);
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str2 : map.keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(this.zarp, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, T t) {
        zab(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(this.zarp, field.getSafeParcelableFieldId(), ((com.google.android.gms.common.server.response.SafeParcelResponse) t).zacs(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        zab(field);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.size();
        java.util.ArrayList<T> arrayList3 = arrayList;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            T t = arrayList3.get(i);
            i++;
            arrayList2.add(((com.google.android.gms.common.server.response.SafeParcelResponse) t).zacs());
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelList(this.zarp, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.String toString() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaqn, "Cannot convert to JSON on client side.");
        android.os.Parcel parcelZacs = zacs();
        parcelZacs.setDataPosition(0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        zaa(sb, this.zaqn.zai(this.mClassName), parcelZacs);
        return sb.toString();
    }

    private final void zaa(java.lang.StringBuilder sb, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map, android.os.Parcel parcel) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (java.util.Map.Entry<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().getSafeParcelableFieldId(), entry);
        }
        sb.append('{');
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            java.util.Map.Entry entry2 = (java.util.Map.Entry) sparseArray.get(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                java.lang.String str = (java.lang.String) entry2.getKey();
                com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = (com.google.android.gms.common.server.response.FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.zacl()) {
                    switch (field.zaqh) {
                        case 0:
                            zab(sb, field, zab(field, java.lang.Integer.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header))));
                            break;
                        case 1:
                            zab(sb, field, zab(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(parcel, header)));
                            break;
                        case 2:
                            zab(sb, field, zab(field, java.lang.Long.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header))));
                            break;
                        case 3:
                            zab(sb, field, zab(field, java.lang.Float.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header))));
                            break;
                        case 4:
                            zab(sb, field, zab(field, java.lang.Double.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header))));
                            break;
                        case 5:
                            zab(sb, field, zab(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(parcel, header)));
                            break;
                        case 6:
                            zab(sb, field, zab(field, java.lang.Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header))));
                            break;
                        case 7:
                            zab(sb, field, zab(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header)));
                            break;
                        case 8:
                        case 9:
                            zab(sb, field, zab(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header)));
                            break;
                        case 10:
                            android.os.Bundle bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                            java.util.HashMap map2 = new java.util.HashMap();
                            for (java.lang.String str2 : bundleCreateBundle.keySet()) {
                                map2.put(str2, bundleCreateBundle.getString(str2));
                            }
                            zab(sb, field, zab(field, map2));
                            break;
                        case 11:
                            throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            int i = field.zaqh;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(36);
                            sb2.append("Unknown field out type = ");
                            sb2.append(i);
                            throw new java.lang.IllegalArgumentException(sb2.toString());
                    }
                } else if (field.zaqi) {
                    sb.append("[");
                    switch (field.zaqh) {
                        case 0:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header));
                            break;
                        case 1:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(parcel, header));
                            break;
                        case 2:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(parcel, header));
                            break;
                        case 3:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(parcel, header));
                            break;
                        case 4:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(parcel, header));
                            break;
                        case 5:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(parcel, header));
                            break;
                        case 6:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(parcel, header));
                            break;
                        case 7:
                            com.google.android.gms.common.util.ArrayUtils.writeStringArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, header));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new java.lang.UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            android.os.Parcel[] parcelArrCreateParcelArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(parcel, header);
                            int length = parcelArrCreateParcelArray.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                parcelArrCreateParcelArray[i2].setDataPosition(0);
                                zaa(sb, field.zaco(), parcelArrCreateParcelArray[i2]);
                            }
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.zaqh) {
                        case 0:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header));
                            break;
                        case 1:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(parcel, header));
                            break;
                        case 2:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header));
                            break;
                        case 3:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header));
                            break;
                        case 4:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header));
                            break;
                        case 5:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(parcel, header));
                            break;
                        case 6:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header));
                            break;
                        case 7:
                            java.lang.String strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.JsonUtils.escapeString(strCreateString));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encode(bArrCreateByteArray));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrCreateByteArray2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(bArrCreateByteArray2));
                            sb.append("\"");
                            break;
                        case 10:
                            android.os.Bundle bundleCreateBundle2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                            java.util.Set<java.lang.String> setKeySet = bundleCreateBundle2.keySet();
                            setKeySet.size();
                            sb.append("{");
                            boolean z2 = true;
                            for (java.lang.String str3 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\"");
                                sb.append(":");
                                sb.append("\"");
                                sb.append(com.google.android.gms.common.util.JsonUtils.escapeString(bundleCreateBundle2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            android.os.Parcel parcelCreateParcel = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(parcel, header);
                            parcelCreateParcel.setDataPosition(0);
                            zaa(sb, field.zaco(), parcelCreateParcel);
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(37);
            sb3.append("Overread allowed size end=");
            sb3.append(iValidateObjectHeader);
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(sb3.toString(), parcel);
        }
        sb.append('}');
    }

    private final void zab(java.lang.StringBuilder sb, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.Object obj) {
        if (field.zaqg) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                zaa(sb, field.zaqf, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        zaa(sb, field.zaqf, obj);
    }

    private static void zaa(java.lang.StringBuilder sb, int i, java.lang.Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.JsonUtils.escapeString(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                com.google.android.gms.common.util.MapUtils.writeStringMapToJson(sb, (java.util.HashMap) obj);
                return;
            case 11:
                throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
            default:
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(26);
                sb2.append("Unknown type = ");
                sb2.append(i);
                throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }
}
