package androidx.databinding.adapters;

/* JADX INFO: loaded from: classes.dex */
public class TextViewBindingAdapter {
    public static final int DECIMAL = 5;
    public static final int INTEGER = 1;
    public static final int SIGNED = 3;
    private static final java.lang.String TAG = "TextViewBindingAdapters";

    public interface AfterTextChanged {
        void afterTextChanged(android.text.Editable editable);
    }

    public interface BeforeTextChanged {
        void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3);
    }

    public interface OnTextChanged {
        void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3);
    }

    public static void setText(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        java.lang.CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof android.text.Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!haveContentsChanged(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static java.lang.String getTextString(android.widget.TextView textView) {
        return textView.getText().toString();
    }

    public static void setAutoText(android.widget.TextView textView, boolean z) {
        android.text.method.KeyListener keyListener = textView.getKeyListener();
        android.text.method.TextKeyListener.Capitalize capitalize = android.text.method.TextKeyListener.Capitalize.NONE;
        int inputType = keyListener != null ? keyListener.getInputType() : 0;
        if ((inputType & 4096) != 0) {
            capitalize = android.text.method.TextKeyListener.Capitalize.CHARACTERS;
        } else if ((inputType & 8192) != 0) {
            capitalize = android.text.method.TextKeyListener.Capitalize.WORDS;
        } else if ((inputType & 16384) != 0) {
            capitalize = android.text.method.TextKeyListener.Capitalize.SENTENCES;
        }
        textView.setKeyListener(android.text.method.TextKeyListener.getInstance(z, capitalize));
    }

    public static void setCapitalize(android.widget.TextView textView, android.text.method.TextKeyListener.Capitalize capitalize) {
        textView.setKeyListener(android.text.method.TextKeyListener.getInstance((textView.getKeyListener().getInputType() & 32768) != 0, capitalize));
    }

    public static void setBufferType(android.widget.TextView textView, android.widget.TextView.BufferType bufferType) {
        textView.setText(textView.getText(), bufferType);
    }

    public static void setDigits(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            textView.setKeyListener(android.text.method.DigitsKeyListener.getInstance(charSequence.toString()));
        } else if (textView.getKeyListener() instanceof android.text.method.DigitsKeyListener) {
            textView.setKeyListener(null);
        }
    }

    public static void setNumeric(android.widget.TextView textView, int i) {
        textView.setKeyListener(android.text.method.DigitsKeyListener.getInstance((i & 3) != 0, (i & 5) != 0));
    }

    public static void setPhoneNumber(android.widget.TextView textView, boolean z) {
        if (z) {
            textView.setKeyListener(android.text.method.DialerKeyListener.getInstance());
        } else if (textView.getKeyListener() instanceof android.text.method.DialerKeyListener) {
            textView.setKeyListener(null);
        }
    }

    private static void setIntrinsicBounds(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    public static void setDrawableBottom(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        setIntrinsicBounds(drawable);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], drawable);
    }

    public static void setDrawableLeft(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        setIntrinsicBounds(drawable);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    public static void setDrawableRight(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        setIntrinsicBounds(drawable);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawable, compoundDrawables[3]);
    }

    public static void setDrawableTop(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        setIntrinsicBounds(drawable);
        android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
        textView.setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    public static void setDrawableStart(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 17) {
            setDrawableLeft(textView, drawable);
            return;
        }
        setIntrinsicBounds(drawable);
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(drawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public static void setDrawableEnd(android.widget.TextView textView, android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT < 17) {
            setDrawableRight(textView, drawable);
            return;
        }
        setIntrinsicBounds(drawable);
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], drawable, compoundDrawablesRelative[3]);
    }

    public static void setImeActionLabel(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        textView.setImeActionLabel(charSequence, textView.getImeActionId());
    }

    public static void setImeActionLabel(android.widget.TextView textView, int i) {
        textView.setImeActionLabel(textView.getImeActionLabel(), i);
    }

    public static void setInputMethod(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        try {
            textView.setKeyListener((android.text.method.KeyListener) java.lang.Class.forName(charSequence.toString()).newInstance());
        } catch (java.lang.ClassNotFoundException e) {
            android.util.Log.e(TAG, "Could not create input method: " + ((java.lang.Object) charSequence), e);
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.e(TAG, "Could not create input method: " + ((java.lang.Object) charSequence), e2);
        } catch (java.lang.InstantiationException e3) {
            android.util.Log.e(TAG, "Could not create input method: " + ((java.lang.Object) charSequence), e3);
        }
    }

    public static void setLineSpacingExtra(android.widget.TextView textView, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            textView.setLineSpacing(f, textView.getLineSpacingMultiplier());
        } else {
            textView.setLineSpacing(f, 1.0f);
        }
    }

    public static void setLineSpacingMultiplier(android.widget.TextView textView, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            textView.setLineSpacing(textView.getLineSpacingExtra(), f);
        } else {
            textView.setLineSpacing(0.0f, f);
        }
    }

    public static void setMaxLength(android.widget.TextView textView, int i) {
        boolean z;
        android.text.InputFilter[] filters = textView.getFilters();
        if (filters == null) {
            filters = new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i)};
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= filters.length) {
                    z = false;
                    break;
                }
                android.text.InputFilter inputFilter = filters[i2];
                if (inputFilter instanceof android.text.InputFilter.LengthFilter) {
                    if (android.os.Build.VERSION.SDK_INT < 21 || ((android.text.InputFilter.LengthFilter) inputFilter).getMax() != i) {
                        filters[i2] = new android.text.InputFilter.LengthFilter(i);
                    }
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                int length = filters.length + 1;
                android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[length];
                java.lang.System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                inputFilterArr[length - 1] = new android.text.InputFilter.LengthFilter(i);
                filters = inputFilterArr;
            }
        }
        textView.setFilters(filters);
    }

    public static void setPassword(android.widget.TextView textView, boolean z) {
        if (z) {
            textView.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        } else if (textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) {
            textView.setTransformationMethod(null);
        }
    }

    public static void setShadowColor(android.widget.TextView textView, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
        }
    }

    public static void setShadowDx(android.widget.TextView textView, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            int shadowColor = textView.getShadowColor();
            textView.setShadowLayer(textView.getShadowRadius(), f, textView.getShadowDy(), shadowColor);
        }
    }

    public static void setShadowDy(android.widget.TextView textView, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            int shadowColor = textView.getShadowColor();
            textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), f, shadowColor);
        }
    }

    public static void setShadowRadius(android.widget.TextView textView, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 16) {
            textView.setShadowLayer(f, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
        }
    }

    public static void setTextSize(android.widget.TextView textView, float f) {
        textView.setTextSize(0, f);
    }

    private static boolean haveContentsChanged(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void setTextWatcher(android.widget.TextView textView, final androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged, final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged, final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged, final androidx.databinding.InverseBindingListener inverseBindingListener) {
        android.text.TextWatcher textWatcher = (beforeTextChanged == null && afterTextChanged == null && onTextChanged == null && inverseBindingListener == null) ? null : new android.text.TextWatcher() { // from class: androidx.databinding.adapters.TextViewBindingAdapter.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
                androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged beforeTextChanged2 = beforeTextChanged;
                if (beforeTextChanged2 != null) {
                    beforeTextChanged2.beforeTextChanged(charSequence, i, i2, i3);
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
                androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged onTextChanged2 = onTextChanged;
                if (onTextChanged2 != null) {
                    onTextChanged2.onTextChanged(charSequence, i, i2, i3);
                }
                androidx.databinding.InverseBindingListener inverseBindingListener2 = inverseBindingListener;
                if (inverseBindingListener2 != null) {
                    inverseBindingListener2.onChange();
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged afterTextChanged2 = afterTextChanged;
                if (afterTextChanged2 != null) {
                    afterTextChanged2.afterTextChanged(editable);
                }
            }
        };
        android.text.TextWatcher textWatcher2 = (android.text.TextWatcher) androidx.databinding.adapters.ListenerUtil.trackListener(textView, textWatcher, androidx.databinding.library.baseAdapters.R.id.textWatcher);
        if (textWatcher2 != null) {
            textView.removeTextChangedListener(textWatcher2);
        }
        if (textWatcher != null) {
            textView.addTextChangedListener(textWatcher);
        }
    }
}
