package com.baidu.mapapi.search.sug;

/* JADX INFO: loaded from: classes.dex */
public class SuggestionResult extends com.baidu.mapapi.search.core.SearchResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.sug.SuggestionResult> CREATOR = new com.baidu.mapapi.search.sug.a();
    private java.util.ArrayList<com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo> a;

    public static class SuggestionInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo> CREATOR = new com.baidu.mapapi.search.sug.b();
        public java.lang.String address;
        public java.lang.String city;
        public java.lang.String district;
        public java.lang.String key;
        public java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> poiChildrenInfoList;
        public com.baidu.mapapi.model.LatLng pt;
        public java.lang.String tag;
        public java.lang.String uid;

        public SuggestionInfo() {
        }

        protected SuggestionInfo(android.os.Parcel parcel) {
            this.key = parcel.readString();
            this.city = parcel.readString();
            this.district = parcel.readString();
            this.pt = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
            this.uid = parcel.readString();
            this.tag = parcel.readString();
            this.address = parcel.readString();
            this.poiChildrenInfoList = parcel.createTypedArrayList(com.baidu.mapapi.search.core.PoiChildrenInfo.CREATOR);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String getAddress() {
            return this.address;
        }

        public java.lang.String getCity() {
            return this.city;
        }

        public java.lang.String getDistrict() {
            return this.district;
        }

        public java.lang.String getKey() {
            return this.key;
        }

        public java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> getPoiChildrenInfoList() {
            return this.poiChildrenInfoList;
        }

        public com.baidu.mapapi.model.LatLng getPt() {
            return this.pt;
        }

        public java.lang.String getTag() {
            return this.tag;
        }

        public java.lang.String getUid() {
            return this.uid;
        }

        public void setAddress(java.lang.String str) {
            this.address = str;
        }

        public void setCity(java.lang.String str) {
            this.city = str;
        }

        public void setDistrict(java.lang.String str) {
            this.district = str;
        }

        public void setKey(java.lang.String str) {
            this.key = str;
        }

        public void setPoiChildrenInfoList(java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> list) {
            this.poiChildrenInfoList = list;
        }

        public void setPt(com.baidu.mapapi.model.LatLng latLng) {
            this.pt = latLng;
        }

        public void setTag(java.lang.String str) {
            this.tag = str;
        }

        public void setUid(java.lang.String str) {
            this.uid = str;
        }

        public java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SuggestionInfo: ");
            stringBuffer.append("key = ");
            stringBuffer.append(this.key);
            stringBuffer.append("; city = ");
            stringBuffer.append(this.city);
            stringBuffer.append("; district = ");
            stringBuffer.append(this.district);
            stringBuffer.append("; pt = ");
            com.baidu.mapapi.model.LatLng latLng = this.pt;
            if (latLng != null) {
                stringBuffer.append(latLng.toString());
            } else {
                stringBuffer.append("null");
            }
            stringBuffer.append("; uid = ");
            stringBuffer.append(this.uid);
            stringBuffer.append("; tag = ");
            stringBuffer.append(this.tag);
            stringBuffer.append("; address = ");
            stringBuffer.append(this.address);
            stringBuffer.append("; childrenInfo = ");
            java.util.List<com.baidu.mapapi.search.core.PoiChildrenInfo> list = this.poiChildrenInfoList;
            if (list == null || list.isEmpty()) {
                stringBuffer.append("null");
            } else {
                for (int i = 0; i < this.poiChildrenInfoList.size(); i++) {
                    stringBuffer.append(" ");
                    stringBuffer.append(i);
                    stringBuffer.append(" ");
                    com.baidu.mapapi.search.core.PoiChildrenInfo poiChildrenInfo = this.poiChildrenInfoList.get(i);
                    if (poiChildrenInfo == null) {
                        stringBuffer.append("null");
                    } else {
                        stringBuffer.append(poiChildrenInfo.toString());
                    }
                }
            }
            return stringBuffer.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeString(this.city);
            parcel.writeString(this.district);
            parcel.writeParcelable(this.pt, i);
            parcel.writeString(this.uid);
            parcel.writeString(this.tag);
            parcel.writeString(this.address);
            parcel.writeTypedList(this.poiChildrenInfoList);
        }
    }

    public SuggestionResult() {
    }

    protected SuggestionResult(android.os.Parcel parcel) {
        this.a = parcel.readArrayList(com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo.class.getClassLoader());
    }

    public SuggestionResult(com.baidu.mapapi.search.core.SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.util.List<com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo> getAllSuggestions() {
        return this.a;
    }

    public void setSuggestionInfo(java.util.ArrayList<com.baidu.mapapi.search.sug.SuggestionResult.SuggestionInfo> arrayList) {
        this.a = arrayList;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
