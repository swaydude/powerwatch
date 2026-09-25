package mapsdkvi.com.gdi.bgl.android.java;

/* JADX INFO: loaded from: classes2.dex */
public class EnvDrawText {
    private static final java.lang.String a = "EnvDrawText";
    public static boolean bBmpChange = false;
    public static android.graphics.Bitmap bmp;
    public static int[] buffer;
    public static android.util.SparseArray<mapsdkvi.com.gdi.bgl.android.java.a> fontCache;

    private static android.graphics.Paint.Align a(int i) {
        if (1 == i) {
            return android.graphics.Paint.Align.LEFT;
        }
        return 2 == i ? android.graphics.Paint.Align.RIGHT : android.graphics.Paint.Align.CENTER;
    }

    public static synchronized int[] drawText(java.lang.String str, int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7) {
        android.graphics.Typeface typefaceCreate;
        int i8;
        int iPow;
        int i9;
        int i10;
        android.graphics.Bitmap bitmapCreateBitmap;
        int i11;
        int i12;
        int i13;
        int iCeil;
        android.graphics.Paint.FontMetrics fontMetrics;
        int desiredWidth;
        android.graphics.Canvas canvas;
        android.graphics.Bitmap bitmap;
        android.text.TextPaint textPaint;
        android.util.SparseArray<mapsdkvi.com.gdi.bgl.android.java.a> sparseArray;
        mapsdkvi.com.gdi.bgl.android.java.a aVar;
        android.graphics.Canvas canvas2 = new android.graphics.Canvas();
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        java.lang.String phoneType = com.baidu.mapapi.common.SysOSUtil.getPhoneType();
        int i14 = (phoneType == null || !phoneType.equals("vivo X3L")) ? i2 : 0;
        textPaint2.reset();
        textPaint2.setSubpixelText(true);
        textPaint2.setAntiAlias(true);
        float f = i;
        textPaint2.setTextSize(f);
        textPaint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        if (i14 != 1) {
            typefaceCreate = i14 != 2 ? android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0) : android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 2);
        } else {
            typefaceCreate = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1);
        }
        textPaint2.setTypeface(typefaceCreate);
        if (i6 != 0) {
            textPaint2.setStrokeWidth(i6);
            textPaint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            textPaint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            textPaint2.setStyle(android.graphics.Paint.Style.STROKE);
        }
        textPaint2.setSubpixelText(true);
        textPaint2.setAntiAlias(true);
        if (i14 != 0 && (sparseArray = fontCache) != null && (aVar = sparseArray.get(i14)) != null) {
            textPaint2.setTypeface(aVar.a);
        }
        textPaint2.setTextSize(f);
        int iIndexOf = str.indexOf(92, 0);
        if (iIndexOf == -1) {
            android.graphics.Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
            int desiredWidth2 = (int) (((double) android.text.Layout.getDesiredWidth(str, 0, str.length(), textPaint2)) + 0.5d);
            iCeil = (int) java.lang.Math.ceil(fontMetrics2.descent - fontMetrics2.ascent);
            iArr[0] = desiredWidth2;
            iArr[1] = iCeil;
            if (iArr.length == 4) {
                desiredWidth2 = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(desiredWidth2) / java.lang.Math.log(2.0d)));
                iCeil = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(iCeil) / java.lang.Math.log(2.0d)));
            }
            if (desiredWidth2 == 0 && iCeil == 0) {
                iCeil = 0;
                i13 = 0;
            } else {
                i13 = desiredWidth2;
            }
            if (iArr.length == 4) {
                iArr[2] = i13;
                iArr[3] = iCeil;
            }
            if (i13 <= 0 || iCeil <= 0) {
                canvas = canvas2;
                bitmap = null;
            } else {
                android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(i13, iCeil, android.graphics.Bitmap.Config.ARGB_8888);
                if (bitmapCreateBitmap2 == null) {
                    return new int[0];
                }
                canvas = canvas2;
                canvas.setBitmap(bitmapCreateBitmap2);
                bitmap = bitmapCreateBitmap2;
            }
            if ((i5 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0) {
                canvas.drawColor(androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
            } else {
                canvas.drawColor(i5);
            }
            if (i6 != 0) {
                textPaint = textPaint2;
                textPaint.setStrokeWidth(i6);
                textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                textPaint.setStyle(android.graphics.Paint.Style.STROKE);
                textPaint.setColor(i4);
                canvas.drawText(str, 0.0f, 0.0f - fontMetrics2.ascent, textPaint);
            } else {
                textPaint = textPaint2;
            }
            textPaint.setStyle(android.graphics.Paint.Style.FILL);
            textPaint.setColor(i3);
            canvas.drawText(str, 0.0f, 0.0f - fontMetrics2.ascent, textPaint);
            bitmapCreateBitmap = bitmap;
        } else {
            int i15 = iIndexOf + 1;
            int iMeasureText = (int) textPaint2.measureText(str.substring(0, iIndexOf));
            int i16 = 92;
            int i17 = 2;
            while (true) {
                int iIndexOf2 = str.indexOf(i16, i15);
                if (iIndexOf2 <= 0) {
                    break;
                }
                int iMeasureText2 = (int) textPaint2.measureText(str.substring(i15, iIndexOf2));
                if (iMeasureText2 > iMeasureText) {
                    iMeasureText = iMeasureText2;
                }
                i15 = iIndexOf2 + 1;
                i17++;
                i16 = 92;
            }
            if (i15 != str.length() && (desiredWidth = (int) (((double) android.text.Layout.getDesiredWidth(str.substring(i15, str.length()), textPaint2)) + 0.5d)) > iMeasureText) {
                iMeasureText = desiredWidth;
            }
            android.graphics.Paint.FontMetrics fontMetrics3 = textPaint2.getFontMetrics();
            int iCeil2 = (int) java.lang.Math.ceil(fontMetrics3.descent - fontMetrics3.ascent);
            int i18 = iCeil2 * i17;
            iArr[0] = iMeasureText;
            iArr[1] = i18;
            if (iArr.length == 4) {
                int iPow2 = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(iMeasureText) / java.lang.Math.log(2.0d)));
                iPow = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(i18) / java.lang.Math.log(2.0d)));
                i8 = iPow2;
            } else {
                i8 = iMeasureText;
                iPow = i18;
            }
            if (i8 == 0 && iPow == 0) {
                i10 = 0;
                i9 = 0;
            } else {
                i9 = iPow;
                i10 = i8;
            }
            if (iArr.length == 4) {
                iArr[2] = i10;
                iArr[3] = i9;
            }
            if (i10 <= 0 || i9 <= 0) {
                bitmapCreateBitmap = null;
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i10, i9, android.graphics.Bitmap.Config.ARGB_8888);
                if (bitmapCreateBitmap == null) {
                    return new int[0];
                }
                canvas2.setBitmap(bitmapCreateBitmap);
            }
            if ((i5 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0) {
                canvas2.drawColor(androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
            } else {
                canvas2.drawColor(i5);
            }
            textPaint2.setTextAlign(a(i7));
            if (i7 == 1) {
                i12 = 0;
                i11 = 0;
            } else if (i7 == 2) {
                i11 = 0;
                i12 = iArr[0];
            } else {
                i11 = 0;
                i12 = iArr[0] / 2;
            }
            int i19 = 0;
            int i20 = 92;
            while (true) {
                int iIndexOf3 = str.indexOf(i20, i11);
                if (iIndexOf3 <= 0) {
                    break;
                }
                java.lang.String strSubstring = str.substring(i11, iIndexOf3);
                textPaint2.measureText(strSubstring);
                int i21 = iIndexOf3 + 1;
                if (i6 != 0) {
                    textPaint2.setStrokeWidth(i6);
                    textPaint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                    textPaint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                    textPaint2.setStyle(android.graphics.Paint.Style.STROKE);
                    textPaint2.setColor(i4);
                    fontMetrics = fontMetrics3;
                    canvas2.drawText(strSubstring, i12, (i19 * iCeil2) - fontMetrics.ascent, textPaint2);
                } else {
                    fontMetrics = fontMetrics3;
                }
                textPaint2.setStyle(android.graphics.Paint.Style.FILL);
                textPaint2.setColor(i3);
                canvas2.drawText(strSubstring, i12, (i19 * iCeil2) - fontMetrics.ascent, textPaint2);
                i19++;
                fontMetrics3 = fontMetrics;
                i11 = i21;
                i9 = i9;
                i20 = 92;
                i10 = i10;
            }
            int i22 = i10;
            int i23 = i9;
            android.graphics.Paint.FontMetrics fontMetrics4 = fontMetrics3;
            if (i11 != str.length()) {
                java.lang.String strSubstring2 = str.substring(i11, str.length());
                android.text.Layout.getDesiredWidth(strSubstring2, textPaint2);
                if (i6 != 0) {
                    textPaint2.setStrokeWidth(i6);
                    textPaint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                    textPaint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                    textPaint2.setStyle(android.graphics.Paint.Style.STROKE);
                    textPaint2.setColor(i4);
                    canvas2.drawText(strSubstring2, i12, (i19 * iCeil2) - fontMetrics4.ascent, textPaint2);
                }
                textPaint2.setStyle(android.graphics.Paint.Style.FILL);
                textPaint2.setColor(i3);
                canvas2.drawText(strSubstring2, i12, (i19 * iCeil2) - fontMetrics4.ascent, textPaint2);
            }
            i13 = i22;
            iCeil = i23;
        }
        int[] iArr2 = new int[i13 * iCeil];
        if (bitmapCreateBitmap != null) {
            bitmapCreateBitmap.copyPixelsToBuffer(java.nio.IntBuffer.wrap(iArr2));
        }
        if (bitmapCreateBitmap != null && !bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        return iArr2;
    }

    public static android.graphics.Bitmap drawTextAlpha(java.lang.String str, int i, int i2, int i3) {
        android.graphics.Typeface typefaceCreate;
        int desiredWidth;
        android.graphics.Canvas canvas = new android.graphics.Canvas();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        java.lang.String phoneType = com.baidu.mapapi.common.SysOSUtil.getPhoneType();
        int i4 = 0;
        int i5 = (phoneType == null || !phoneType.equals("vivo X3L")) ? i2 : 0;
        textPaint.reset();
        textPaint.setSubpixelText(false);
        textPaint.setAntiAlias(false);
        textPaint.setTextSize(i);
        int i6 = 2;
        if (i5 != 1) {
            typefaceCreate = i5 != 2 ? android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0) : android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 2);
        } else {
            typefaceCreate = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1);
        }
        textPaint.setTypeface(typefaceCreate);
        float f = (i3 * 1.3f) + 0.5f;
        int i7 = 92;
        int iIndexOf = str.indexOf(92, 0);
        android.graphics.Bitmap bitmapCreateBitmap = null;
        if (iIndexOf == -1) {
            android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            int desiredWidth2 = (int) (android.text.Layout.getDesiredWidth(str, 0, str.length(), textPaint) + f);
            int iCeil = (int) java.lang.Math.ceil(fontMetrics.descent - fontMetrics.ascent);
            if (desiredWidth2 > 0 && iCeil > 0) {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(desiredWidth2, iCeil, android.graphics.Bitmap.Config.ALPHA_8);
                if (bitmapCreateBitmap == null) {
                    return bitmapCreateBitmap;
                }
                bitmapCreateBitmap.eraseColor(0);
                canvas.setBitmap(bitmapCreateBitmap);
            }
            textPaint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawText(str, f * 0.5f, 0.0f - fontMetrics.ascent, textPaint);
        } else {
            int i8 = iIndexOf + 1;
            int desiredWidth3 = (int) (((double) android.text.Layout.getDesiredWidth(str.substring(0, iIndexOf), textPaint)) + 0.5d);
            while (true) {
                int iIndexOf2 = str.indexOf(i7, i8);
                if (iIndexOf2 <= 0) {
                    break;
                }
                int desiredWidth4 = (int) (((double) android.text.Layout.getDesiredWidth(str.substring(i8, iIndexOf2), textPaint)) + 0.5d);
                if (desiredWidth4 > desiredWidth3) {
                    desiredWidth3 = desiredWidth4;
                }
                i8 = iIndexOf2 + 1;
                i6++;
                i7 = 92;
            }
            if (i8 != str.length() && (desiredWidth = (int) (((double) android.text.Layout.getDesiredWidth(str.substring(i8, str.length()), textPaint)) + 0.5d)) > desiredWidth3) {
                desiredWidth3 = desiredWidth;
            }
            android.graphics.Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            int iCeil2 = (int) java.lang.Math.ceil(fontMetrics2.descent - fontMetrics2.ascent);
            int i9 = desiredWidth3 + i3;
            int i10 = i6 * iCeil2;
            if (i9 > 0 && i10 > 0) {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i9, i10, android.graphics.Bitmap.Config.ALPHA_8);
                if (bitmapCreateBitmap == null) {
                    return bitmapCreateBitmap;
                }
                bitmapCreateBitmap.eraseColor(0);
                canvas.setBitmap(bitmapCreateBitmap);
            }
            textPaint.setTextAlign(a(3));
            float f2 = i9 - (f * 0.5f);
            int i11 = 0;
            while (true) {
                int iIndexOf3 = str.indexOf(92, i4);
                if (iIndexOf3 <= 0) {
                    break;
                }
                java.lang.String strSubstring = str.substring(i4, iIndexOf3);
                android.text.Layout.getDesiredWidth(strSubstring, textPaint);
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                canvas.drawText(strSubstring, f2, (i11 * iCeil2) - fontMetrics2.ascent, textPaint);
                i11++;
                i4 = iIndexOf3 + 1;
            }
            if (i4 != str.length()) {
                java.lang.String strSubstring2 = str.substring(i4, str.length());
                android.text.Layout.getDesiredWidth(strSubstring2, textPaint);
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                canvas.drawText(strSubstring2, f2, (i11 * iCeil2) - fontMetrics2.ascent, textPaint);
            }
        }
        return bitmapCreateBitmap;
    }

    public static synchronized android.graphics.Bitmap drawTextExt(java.lang.String str, int i, int i2, int[] iArr, int i3, int i4, int i5, int i6, int i7) {
        android.graphics.Typeface typefaceCreate;
        android.graphics.Bitmap bitmapCreateBitmap;
        int i8;
        int i9;
        android.graphics.Bitmap bitmapCreateBitmap2;
        int desiredWidth;
        android.graphics.Canvas canvas = new android.graphics.Canvas();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        java.lang.String phoneType = com.baidu.mapapi.common.SysOSUtil.getPhoneType();
        int i10 = 0;
        int i11 = (phoneType == null || !phoneType.equals("vivo X3L")) ? i2 : 0;
        textPaint.reset();
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(i);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        if (i11 != 1) {
            typefaceCreate = i11 != 2 ? android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0) : android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 2);
        } else {
            typefaceCreate = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1);
        }
        textPaint.setTypeface(typefaceCreate);
        if (i6 != 0) {
            textPaint.setStrokeWidth(i6);
            textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            textPaint.setStyle(android.graphics.Paint.Style.STROKE);
        }
        int iIndexOf = str.indexOf(92, 0);
        if (iIndexOf == -1) {
            android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            int desiredWidth2 = (int) (((double) android.text.Layout.getDesiredWidth(str, 0, str.length(), textPaint)) + 0.5d);
            int iCeil = (int) java.lang.Math.ceil(fontMetrics.descent - fontMetrics.ascent);
            iArr[0] = desiredWidth2;
            iArr[1] = iCeil;
            if (iArr.length == 4) {
                desiredWidth2 = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(desiredWidth2) / java.lang.Math.log(2.0d)));
                iCeil = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(iCeil) / java.lang.Math.log(2.0d)));
            }
            if (desiredWidth2 == 0 && iCeil == 0) {
                iCeil = 0;
            } else {
                i10 = desiredWidth2;
            }
            if (iArr.length == 4) {
                iArr[2] = i10;
                iArr[3] = iCeil;
            }
            if (i10 <= 0 || iCeil <= 0) {
                bitmapCreateBitmap2 = null;
            } else {
                bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(i10, iCeil, android.graphics.Bitmap.Config.ARGB_8888);
                if (bitmapCreateBitmap2 == null) {
                    return bitmapCreateBitmap2;
                }
                canvas.setBitmap(bitmapCreateBitmap2);
            }
            if ((i5 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0) {
                canvas.drawColor(androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
            } else {
                canvas.drawColor(i5);
            }
            if (i6 != 0) {
                textPaint.setStrokeWidth(i6);
                textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                textPaint.setStyle(android.graphics.Paint.Style.STROKE);
                textPaint.setColor(i4);
                canvas.drawText(str, 0.0f, 0.0f - fontMetrics.ascent, textPaint);
            }
            textPaint.setStyle(android.graphics.Paint.Style.FILL);
            textPaint.setColor(i3);
            canvas.drawText(str, 0.0f, 0.0f - fontMetrics.ascent, textPaint);
        } else {
            int i12 = iIndexOf + 1;
            int desiredWidth3 = (int) (((double) android.text.Layout.getDesiredWidth(str.substring(0, iIndexOf), textPaint)) + 0.5d);
            int i13 = 2;
            while (true) {
                int iIndexOf2 = str.indexOf(92, i12);
                if (iIndexOf2 <= 0) {
                    break;
                }
                int desiredWidth4 = (int) (((double) android.text.Layout.getDesiredWidth(str.substring(i12, iIndexOf2), textPaint)) + 0.5d);
                if (desiredWidth4 > desiredWidth3) {
                    desiredWidth3 = desiredWidth4;
                }
                i12 = iIndexOf2 + 1;
                i13++;
            }
            if (i12 != str.length() && (desiredWidth = (int) (((double) android.text.Layout.getDesiredWidth(str.substring(i12, str.length()), textPaint)) + 0.5d)) > desiredWidth3) {
                desiredWidth3 = desiredWidth;
            }
            android.graphics.Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            int iCeil2 = (int) java.lang.Math.ceil(fontMetrics2.descent - fontMetrics2.ascent);
            int iPow = i13 * iCeil2;
            iArr[0] = desiredWidth3;
            iArr[1] = iPow;
            if (iArr.length == 4) {
                desiredWidth3 = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(desiredWidth3) / java.lang.Math.log(2.0d)));
                iPow = (int) java.lang.Math.pow(2.0d, (int) java.lang.Math.ceil(java.lang.Math.log(iPow) / java.lang.Math.log(2.0d)));
            }
            if (desiredWidth3 == 0 && iPow == 0) {
                desiredWidth3 = 0;
                iPow = 0;
            }
            if (iArr.length == 4) {
                iArr[2] = desiredWidth3;
                iArr[3] = iPow;
            }
            if (desiredWidth3 <= 0 || iPow <= 0) {
                bitmapCreateBitmap = null;
            } else {
                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(desiredWidth3, iPow, android.graphics.Bitmap.Config.ARGB_8888);
                if (bitmapCreateBitmap == null) {
                    return bitmapCreateBitmap;
                }
                canvas.setBitmap(bitmapCreateBitmap);
            }
            if ((i5 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0) {
                canvas.drawColor(androidx.core.view.ViewCompat.MEASURED_SIZE_MASK);
            } else {
                canvas.drawColor(i5);
            }
            textPaint.setTextAlign(a(i7));
            if (i7 == 1) {
                i9 = 0;
                i8 = 0;
            } else {
                i8 = 0;
                i9 = i7 == 2 ? iArr[0] : iArr[0] / 2;
            }
            int i14 = 92;
            int i15 = 0;
            while (true) {
                int iIndexOf3 = str.indexOf(i14, i15);
                if (iIndexOf3 <= 0) {
                    break;
                }
                java.lang.String strSubstring = str.substring(i15, iIndexOf3);
                android.text.Layout.getDesiredWidth(strSubstring, textPaint);
                i15 = iIndexOf3 + 1;
                if (i6 != 0) {
                    textPaint.setStrokeWidth(i6);
                    textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                    textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                    textPaint.setStyle(android.graphics.Paint.Style.STROKE);
                    textPaint.setColor(i4);
                    canvas.drawText(strSubstring, i9, (i8 * iCeil2) - fontMetrics2.ascent, textPaint);
                }
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                textPaint.setColor(i3);
                canvas.drawText(strSubstring, i9, (i8 * iCeil2) - fontMetrics2.ascent, textPaint);
                i8++;
                bitmapCreateBitmap = bitmapCreateBitmap;
                i14 = 92;
            }
            android.graphics.Bitmap bitmap = bitmapCreateBitmap;
            if (i15 != str.length()) {
                java.lang.String strSubstring2 = str.substring(i15, str.length());
                android.text.Layout.getDesiredWidth(strSubstring2, textPaint);
                if (i6 != 0) {
                    textPaint.setStrokeWidth(i6);
                    textPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                    textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                    textPaint.setStyle(android.graphics.Paint.Style.STROKE);
                    textPaint.setColor(i4);
                    canvas.drawText(strSubstring2, i9, (i8 * iCeil2) - fontMetrics2.ascent, textPaint);
                }
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                textPaint.setColor(i3);
                canvas.drawText(strSubstring2, i9, (i8 * iCeil2) - fontMetrics2.ascent, textPaint);
            }
            bitmapCreateBitmap2 = bitmap;
        }
        return bitmapCreateBitmap2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[PHI: r2
      0x0025: PHI (r2v1 int) = (r2v0 int), (r2v5 int) binds: [B:7:0x0019, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public static short[] getTextSize(java.lang.String str, int i, int i2) {
        android.graphics.Typeface typefaceCreate;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        android.text.TextPaint textPaint = new android.text.TextPaint();
        int i3 = 1;
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(i);
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                typefaceCreate = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
            } else {
                typefaceCreate = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i3);
            }
        } else {
            typefaceCreate = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i3);
        }
        textPaint.setTypeface(typefaceCreate);
        short[] sArr = new short[length];
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            sArr[i4] = (short) (((double) android.text.Layout.getDesiredWidth(str, 0, i5, textPaint)) + 0.5d);
            i4 = i5;
        }
        return sArr;
    }

    public static float[] getTextSizeExt(java.lang.String str, int i, int i2) {
        android.graphics.Typeface typefaceCreate;
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setSubpixelText(true);
        paint.setAntiAlias(true);
        paint.setTextSize(i);
        if (i2 != 1) {
            typefaceCreate = i2 != 2 ? android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0) : android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 2);
        } else {
            typefaceCreate = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1);
        }
        paint.setTypeface(typefaceCreate);
        return new float[]{paint.measureText(str), paint.descent() - paint.ascent()};
    }

    public static synchronized void registFontCache(int i, android.graphics.Typeface typeface) {
        if (i == 0 || typeface == null) {
            return;
        }
        if (fontCache == null) {
            fontCache = new android.util.SparseArray<>();
        }
        mapsdkvi.com.gdi.bgl.android.java.a aVar = fontCache.get(i);
        if (aVar == null) {
            mapsdkvi.com.gdi.bgl.android.java.a aVar2 = new mapsdkvi.com.gdi.bgl.android.java.a();
            aVar2.a = typeface;
            aVar2.b++;
            fontCache.put(i, aVar2);
        } else {
            aVar.b++;
        }
    }

    public static synchronized void removeFontCache(int i) {
        mapsdkvi.com.gdi.bgl.android.java.a aVar = fontCache.get(i);
        if (aVar == null) {
            return;
        }
        aVar.b--;
        if (aVar.b == 0) {
            fontCache.remove(i);
        }
    }
}
