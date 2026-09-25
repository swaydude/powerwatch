package com.baidu.mapapi.map;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDescriptorFactory {
    static final /* synthetic */ boolean a = true;
    private static final java.lang.String b = "BaiduMapSDK-" + com.baidu.mapapi.map.BitmapDescriptorFactory.class.getSimpleName();

    public static com.baidu.mapapi.map.BitmapDescriptor fromAsset(java.lang.String str) {
        android.content.Context context = com.baidu.mapapi.BMapManager.getContext();
        if (context == null) {
            return null;
        }
        try {
            android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a(str, context);
            com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(bitmapA);
            if (!a && bitmapA == null) {
                throw new java.lang.AssertionError();
            }
            bitmapA.recycle();
            return bitmapDescriptorFromBitmap;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #0 {Exception -> 0x0063, blocks: (B:5:0x0008, B:8:0x000f, B:10:0x0017, B:11:0x0031, B:16:0x005a, B:18:0x005f, B:14:0x003a, B:15:0x0055), top: B:23:0x0008 }] */
    public static com.baidu.mapapi.map.BitmapDescriptor fromAssetWithDpi(java.lang.String str) {
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap;
        android.graphics.Bitmap bitmapCreateBitmap;
        android.content.Context context = com.baidu.mapapi.BMapManager.getContext();
        if (context == null) {
            return null;
        }
        try {
            android.graphics.Bitmap bitmapA = com.baidu.mapsdkplatform.comapi.commonutils.a.a(str, context);
            if (bitmapA == null) {
                return null;
            }
            int densityDpi = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
            if (densityDpi <= 480) {
                if (densityDpi > 320) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.postScale(1.5f, 1.5f);
                    bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true);
                } else {
                    bitmapDescriptorFromBitmap = fromBitmap(bitmapA);
                    bitmapCreateBitmap = null;
                }
                bitmapA.recycle();
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                return bitmapDescriptorFromBitmap;
            }
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            matrix2.postScale(2.0f, 2.0f);
            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix2, true);
            bitmapDescriptorFromBitmap = fromBitmap(bitmapCreateBitmap);
            bitmapA.recycle();
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            return bitmapDescriptorFromBitmap;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromBitmap(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new com.baidu.mapapi.map.BitmapDescriptor(bitmap);
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromFile(java.lang.String str) {
        android.content.Context context;
        java.lang.String str2;
        java.lang.String str3;
        if (str == null || str.equals("") || (context = com.baidu.mapapi.BMapManager.getContext()) == null) {
            return null;
        }
        try {
            java.io.FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStreamOpenFileInput);
            fileInputStreamOpenFileInput.close();
            if (bitmapDecodeStream != null) {
                com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                return bitmapDescriptorFromBitmap;
            }
        } catch (java.io.FileNotFoundException e) {
            e = e;
            str2 = b;
            str3 = "FileNotFoundException happened";
            android.util.Log.e(str2, str3, e);
        } catch (java.io.IOException e2) {
            e = e2;
            str2 = b;
            str3 = "IOException happened";
            android.util.Log.e(str2, str3, e);
        }
        return null;
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromFileWithDpi(java.lang.String str, int i) {
        android.content.Context context;
        java.lang.String str2;
        java.lang.String str3;
        if (str == null || str.equals("") || (context = com.baidu.mapapi.BMapManager.getContext()) == null) {
            return null;
        }
        try {
            java.io.FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStreamOpenFileInput);
            fileInputStreamOpenFileInput.close();
            if (bitmapDecodeStream != null) {
                if (i <= 0) {
                    i = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
                }
                bitmapDecodeStream.setDensity(i);
                com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                return bitmapDescriptorFromBitmap;
            }
        } catch (java.io.FileNotFoundException e) {
            e = e;
            str2 = b;
            str3 = "FileNotFoundException happened";
            android.util.Log.e(str2, str3, e);
        } catch (java.io.IOException e2) {
            e = e2;
            str2 = b;
            str3 = "IOException happened";
            android.util.Log.e(str2, str3, e);
        }
        return null;
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromPath(java.lang.String str) {
        android.graphics.Bitmap bitmapDecodeFile;
        if (android.text.TextUtils.isEmpty(str) || (bitmapDecodeFile = android.graphics.BitmapFactory.decodeFile(str)) == null) {
            return null;
        }
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(bitmapDecodeFile);
        bitmapDecodeFile.recycle();
        return bitmapDescriptorFromBitmap;
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromPathWithDpi(java.lang.String str, int i) {
        android.graphics.Bitmap bitmapDecodeFile;
        if (android.text.TextUtils.isEmpty(str) || (bitmapDecodeFile = android.graphics.BitmapFactory.decodeFile(str)) == null) {
            return null;
        }
        if (i <= 0) {
            i = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        }
        bitmapDecodeFile.setDensity(i);
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(bitmapDecodeFile);
        bitmapDecodeFile.recycle();
        return bitmapDescriptorFromBitmap;
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromResource(int i) {
        android.graphics.Bitmap bitmapDecodeResource;
        android.content.Context context = com.baidu.mapapi.BMapManager.getContext();
        if (context == null || (bitmapDecodeResource = android.graphics.BitmapFactory.decodeResource(context.getResources(), i)) == null) {
            return null;
        }
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(bitmapDecodeResource);
        bitmapDecodeResource.recycle();
        return bitmapDescriptorFromBitmap;
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromResourceWithDpi(int i, int i2) {
        android.graphics.Bitmap bitmapDecodeResource;
        android.content.Context context = com.baidu.mapapi.BMapManager.getContext();
        if (context == null || (bitmapDecodeResource = android.graphics.BitmapFactory.decodeResource(context.getResources(), i)) == null) {
            return null;
        }
        if (i2 <= 0) {
            i2 = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        }
        bitmapDecodeResource.setDensity(i2);
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(bitmapDecodeResource);
        bitmapDecodeResource.recycle();
        return bitmapDescriptorFromBitmap;
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromView(android.view.View view) {
        if (view == null) {
            return null;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        android.graphics.Bitmap drawingCache = view.getDrawingCache();
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(drawingCache);
        if (drawingCache != null) {
            drawingCache.recycle();
        }
        view.destroyDrawingCache();
        return bitmapDescriptorFromBitmap;
    }

    public static com.baidu.mapapi.map.BitmapDescriptor fromViewWithDpi(android.view.View view, int i) {
        if (view == null) {
            return null;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        android.graphics.Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            android.util.Log.e(b, "Get bitmap failed");
            return null;
        }
        if (i <= 0) {
            i = com.baidu.mapapi.common.SysOSUtil.getDensityDpi();
        }
        drawingCache.setDensity(i);
        com.baidu.mapapi.map.BitmapDescriptor bitmapDescriptorFromBitmap = fromBitmap(drawingCache);
        if (drawingCache != null) {
            drawingCache.recycle();
        }
        view.destroyDrawingCache();
        return bitmapDescriptorFromBitmap;
    }
}
