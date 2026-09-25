package com.baidu.mapapi.search.route;

/* JADX INFO: loaded from: classes.dex */
public final class MassTransitRouteLine extends com.baidu.mapapi.search.core.RouteLine<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteLine> CREATOR = new com.baidu.mapapi.search.route.i();
    private java.lang.String b;
    private double c;
    private java.util.List<com.baidu.mapapi.search.core.PriceInfo> d;
    private java.util.List<java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep>> e;

    public static class TransitStep extends com.baidu.mapapi.search.core.RouteStep implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep> CREATOR = new com.baidu.mapapi.search.route.j();
        private java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition> d;
        private com.baidu.mapapi.model.LatLng e;
        private com.baidu.mapapi.model.LatLng f;
        private com.baidu.mapapi.search.core.n g;
        private com.baidu.mapapi.search.core.PlaneInfo h;
        private com.baidu.mapapi.search.core.CoachInfo i;
        private com.baidu.mapapi.search.core.BusInfo j;
        private com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType k;
        private java.lang.String l;
        private java.lang.String m;

        public enum StepVehicleInfoType {
            ESTEP_TRAIN(1),
            ESTEP_PLANE(2),
            ESTEP_BUS(3),
            ESTEP_DRIVING(4),
            ESTEP_WALK(5),
            ESTEP_COACH(6);

            private int a;

            StepVehicleInfoType(int i) {
                this.a = 0;
                this.a = i;
            }

            public int getInt() {
                return this.a;
            }
        }

        public static class TrafficCondition implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition> CREATOR = new com.baidu.mapapi.search.route.k();
            private int a;
            private int b;

            public TrafficCondition() {
            }

            protected TrafficCondition(android.os.Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public int getTrafficGeoCnt() {
                return this.b;
            }

            public int getTrafficStatus() {
                return this.a;
            }

            public void setTrafficGeoCnt(int i) {
                this.b = i;
            }

            public void setTrafficStatus(int i) {
                this.a = i;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
            }
        }

        public TransitStep() {
        }

        protected TransitStep(android.os.Parcel parcel) {
            com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType stepVehicleInfoType;
            super(parcel);
            this.d = parcel.createTypedArrayList(com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition.CREATOR);
            this.e = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
            this.f = (com.baidu.mapapi.model.LatLng) parcel.readParcelable(com.baidu.mapapi.model.LatLng.class.getClassLoader());
            this.g = (com.baidu.mapapi.search.core.n) parcel.readParcelable(com.baidu.mapapi.search.core.n.class.getClassLoader());
            this.h = (com.baidu.mapapi.search.core.PlaneInfo) parcel.readParcelable(com.baidu.mapapi.search.core.PlaneInfo.class.getClassLoader());
            this.i = (com.baidu.mapapi.search.core.CoachInfo) parcel.readParcelable(com.baidu.mapapi.search.core.CoachInfo.class.getClassLoader());
            this.j = (com.baidu.mapapi.search.core.BusInfo) parcel.readParcelable(com.baidu.mapapi.search.core.BusInfo.class.getClassLoader());
            switch (parcel.readInt()) {
                case 1:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_TRAIN;
                    break;
                case 2:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_PLANE;
                    break;
                case 3:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_BUS;
                    break;
                case 4:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_DRIVING;
                    break;
                case 5:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_WALK;
                    break;
                case 6:
                    stepVehicleInfoType = com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType.ESTEP_COACH;
                    break;
                default:
                    this.l = parcel.readString();
                    this.m = parcel.readString();
            }
            this.k = stepVehicleInfoType;
            this.l = parcel.readString();
            this.m = parcel.readString();
        }

        private java.util.List<com.baidu.mapapi.model.LatLng> a(java.lang.String str) {
            java.lang.String[] strArrSplit;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArrSplit2 = str.split(";");
            if (strArrSplit2 != null) {
                for (int i = 0; i < strArrSplit2.length; i++) {
                    if (strArrSplit2[i] != null && strArrSplit2[i] != "" && (strArrSplit = strArrSplit2[i].split(",")) != null && strArrSplit[1] != "" && strArrSplit[0] != "") {
                        com.baidu.mapapi.model.LatLng latLng = new com.baidu.mapapi.model.LatLng(java.lang.Double.parseDouble(strArrSplit[1]), java.lang.Double.parseDouble(strArrSplit[0]));
                        if (com.baidu.mapapi.SDKInitializer.getCoordType() == com.baidu.mapapi.CoordType.GCJ02) {
                            latLng = com.baidu.mapsdkplatform.comapi.util.CoordTrans.baiduToGcj(latLng);
                        }
                        arrayList.add(latLng);
                    }
                }
            }
            return arrayList;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public com.baidu.mapapi.search.core.BusInfo getBusInfo() {
            return this.j;
        }

        public com.baidu.mapapi.search.core.CoachInfo getCoachInfo() {
            return this.i;
        }

        public com.baidu.mapapi.model.LatLng getEndLocation() {
            return this.f;
        }

        public java.lang.String getInstructions() {
            return this.l;
        }

        public com.baidu.mapapi.search.core.PlaneInfo getPlaneInfo() {
            return this.h;
        }

        public com.baidu.mapapi.model.LatLng getStartLocation() {
            return this.e;
        }

        public java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition> getTrafficConditions() {
            return this.d;
        }

        public com.baidu.mapapi.search.core.n getTrainInfo() {
            return this.g;
        }

        public com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType getVehileType() {
            return this.k;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep
        public java.util.List<com.baidu.mapapi.model.LatLng> getWayPoints() {
            if (this.mWayPoints == null) {
                this.mWayPoints = a(this.m);
            }
            return this.mWayPoints;
        }

        public void setBusInfo(com.baidu.mapapi.search.core.BusInfo busInfo) {
            this.j = busInfo;
        }

        public void setCoachInfo(com.baidu.mapapi.search.core.CoachInfo coachInfo) {
            this.i = coachInfo;
        }

        public void setEndLocation(com.baidu.mapapi.model.LatLng latLng) {
            this.f = latLng;
        }

        public void setInstructions(java.lang.String str) {
            this.l = str;
        }

        public void setPathString(java.lang.String str) {
            this.m = str;
        }

        public void setPlaneInfo(com.baidu.mapapi.search.core.PlaneInfo planeInfo) {
            this.h = planeInfo;
        }

        public void setStartLocation(com.baidu.mapapi.model.LatLng latLng) {
            this.e = latLng;
        }

        public void setTrafficConditions(java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.TrafficCondition> list) {
            this.d = list;
        }

        public void setTrainInfo(com.baidu.mapapi.search.core.n nVar) {
            this.g = nVar;
        }

        public void setVehileType(com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.StepVehicleInfoType stepVehicleInfoType) {
            this.k = stepVehicleInfoType;
        }

        @Override // com.baidu.mapapi.search.core.RouteStep, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeTypedList(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeParcelable(this.f, i);
            parcel.writeParcelable(this.g, i);
            parcel.writeParcelable(this.h, i);
            parcel.writeParcelable(this.i, i);
            parcel.writeParcelable(this.j, i);
            parcel.writeInt(this.k.getInt());
            parcel.writeString(this.l);
            parcel.writeString(this.m);
        }
    }

    public MassTransitRouteLine() {
        this.e = null;
    }

    protected MassTransitRouteLine(android.os.Parcel parcel) {
        super(parcel);
        this.e = null;
        int i = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readDouble();
        this.d = parcel.createTypedArrayList(com.baidu.mapapi.search.core.PriceInfo.CREATOR);
        if (i > 0) {
            this.e = new java.util.ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                this.e.add(parcel.createTypedArrayList(com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep.CREATOR));
            }
        }
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getArriveTime() {
        return this.b;
    }

    public java.util.List<java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep>> getNewSteps() {
        return this.e;
    }

    public double getPrice() {
        return this.c;
    }

    public java.util.List<com.baidu.mapapi.search.core.PriceInfo> getPriceInfo() {
        return this.d;
    }

    public void setArriveTime(java.lang.String str) {
        this.b = str;
    }

    public void setNewSteps(java.util.List<java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep>> list) {
        this.e = list;
    }

    public void setPrice(double d) {
        this.c = d;
    }

    public void setPriceInfo(java.util.List<com.baidu.mapapi.search.core.PriceInfo> list) {
        this.d = list;
    }

    @Override // com.baidu.mapapi.search.core.RouteLine, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        java.util.List<java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep>> list = this.e;
        parcel.writeInt(list == null ? 0 : list.size());
        parcel.writeString(this.b);
        parcel.writeDouble(this.c);
        parcel.writeTypedList(this.d);
        java.util.Iterator<java.util.List<com.baidu.mapapi.search.route.MassTransitRouteLine.TransitStep>> it = this.e.iterator();
        while (it.hasNext()) {
            parcel.writeTypedList(it.next());
        }
    }
}
