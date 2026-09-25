package com.github.mikephil.charting.animation;

/* JADX INFO: loaded from: classes.dex */
public class Easing {

    public enum EasingOption {
        Linear,
        EaseInQuad,
        EaseOutQuad,
        EaseInOutQuad,
        EaseInCubic,
        EaseOutCubic,
        EaseInOutCubic,
        EaseInQuart,
        EaseOutQuart,
        EaseInOutQuart,
        EaseInSine,
        EaseOutSine,
        EaseInOutSine,
        EaseInExpo,
        EaseOutExpo,
        EaseInOutExpo,
        EaseInCirc,
        EaseOutCirc,
        EaseInOutCirc,
        EaseInElastic,
        EaseOutElastic,
        EaseInOutElastic,
        EaseInBack,
        EaseOutBack,
        EaseInOutBack,
        EaseInBounce,
        EaseOutBounce,
        EaseInOutBounce
    }

    public static com.github.mikephil.charting.animation.EasingFunction getEasingFunctionFromOption(com.github.mikephil.charting.animation.Easing.EasingOption easingOption) {
        switch (easingOption) {
            case EaseInQuad:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInQuad;
            case EaseOutQuad:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutQuad;
            case EaseInOutQuad:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutQuad;
            case EaseInCubic:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInCubic;
            case EaseOutCubic:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutCubic;
            case EaseInOutCubic:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutCubic;
            case EaseInQuart:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInQuart;
            case EaseOutQuart:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutQuart;
            case EaseInOutQuart:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutQuart;
            case EaseInSine:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInSine;
            case EaseOutSine:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutSine;
            case EaseInOutSine:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutSine;
            case EaseInExpo:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInExpo;
            case EaseOutExpo:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutExpo;
            case EaseInOutExpo:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutExpo;
            case EaseInCirc:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInCirc;
            case EaseOutCirc:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutCirc;
            case EaseInOutCirc:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutCirc;
            case EaseInElastic:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInElastic;
            case EaseOutElastic:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutElastic;
            case EaseInOutElastic:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutElastic;
            case EaseInBack:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInBack;
            case EaseOutBack:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutBack;
            case EaseInOutBack:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutBack;
            case EaseInBounce:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInBounce;
            case EaseOutBounce:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutBounce;
            case EaseInOutBounce:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInOutBounce;
            default:
                return com.github.mikephil.charting.animation.Easing.EasingFunctions.Linear;
        }
    }

    private static class EasingFunctions {
        public static final com.github.mikephil.charting.animation.EasingFunction Linear = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.1
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInQuad = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.2
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutQuad = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.3
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (-f) * (f - 2.0f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutQuad = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.4
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < 1.0f) {
                    return 0.5f * f2 * f2;
                }
                float f3 = f2 - 1.0f;
                return ((f3 * (f3 - 2.0f)) - 1.0f) * (-0.5f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInCubic = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.5
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutCubic = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.6
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2) + 1.0f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutCubic = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.7
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < 1.0f) {
                    return 0.5f * f2 * f2 * f2;
                }
                float f3 = f2 - 2.0f;
                return ((f3 * f3 * f3) + 2.0f) * 0.5f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInQuart = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.8
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutQuart = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.9
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return -((((f2 * f2) * f2) * f2) - 1.0f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutQuart = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.10
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < 1.0f) {
                    return 0.5f * f2 * f2 * f2 * f2;
                }
                float f3 = f2 - 2.0f;
                return ((((f3 * f3) * f3) * f3) - 2.0f) * (-0.5f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInSine = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.11
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (-((float) java.lang.Math.cos(((double) f) * 1.5707963267948966d))) + 1.0f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutSine = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.12
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (float) java.lang.Math.sin(((double) f) * 1.5707963267948966d);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutSine = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.13
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return (((float) java.lang.Math.cos(((double) f) * 3.141592653589793d)) - 1.0f) * (-0.5f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInExpo = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.14
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                return (float) java.lang.Math.pow(2.0d, (f - 1.0f) * 10.0f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutExpo = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.15
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                if (f == 1.0f) {
                    return 1.0f;
                }
                return -((float) java.lang.Math.pow(2.0d, (f + 1.0f) * (-10.0f)));
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutExpo = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.16
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float fPow;
                if (f == 0.0f) {
                    return 0.0f;
                }
                if (f == 1.0f) {
                    return 1.0f;
                }
                float f2 = f / 0.5f;
                if (f2 < 1.0f) {
                    fPow = (float) java.lang.Math.pow(2.0d, (f2 - 1.0f) * 10.0f);
                } else {
                    fPow = (-((float) java.lang.Math.pow(2.0d, (f2 - 1.0f) * (-10.0f)))) + 2.0f;
                }
                return fPow * 0.5f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInCirc = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.17
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return -(((float) java.lang.Math.sqrt(1.0f - (f * f))) - 1.0f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutCirc = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.18
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (float) java.lang.Math.sqrt(1.0f - (f2 * f2));
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutCirc = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.19
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float fSqrt;
                float f2 = 0.5f;
                float f3 = f / 0.5f;
                if (f3 < 1.0f) {
                    f2 = -0.5f;
                    fSqrt = ((float) java.lang.Math.sqrt(1.0f - (f3 * f3))) - 1.0f;
                } else {
                    float f4 = f3 - 2.0f;
                    fSqrt = ((float) java.lang.Math.sqrt(1.0f - (f4 * f4))) + 1.0f;
                }
                return fSqrt * f2;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInElastic = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.20
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                if (f == 1.0f) {
                    return 1.0f;
                }
                float f2 = f - 1.0f;
                return -(((float) java.lang.Math.pow(2.0d, 10.0f * f2)) * ((float) java.lang.Math.sin((((double) (f2 - (0.047746483f * ((float) java.lang.Math.asin(1.0d))))) * 6.283185307179586d) / ((double) 0.3f))));
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutElastic = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.21
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                if (f == 1.0f) {
                    return 1.0f;
                }
                return (((float) java.lang.Math.pow(2.0d, (-10.0f) * f)) * ((float) java.lang.Math.sin((((double) (f - (0.047746483f * ((float) java.lang.Math.asin(1.0d))))) * 6.283185307179586d) / ((double) 0.3f)))) + 1.0f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutElastic = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.22
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                if (f == 0.0f) {
                    return 0.0f;
                }
                float f2 = f / 0.5f;
                if (f2 == 2.0f) {
                    return 1.0f;
                }
                float fAsin = 0.07161973f * ((float) java.lang.Math.asin(1.0d));
                if (f2 < 1.0f) {
                    float f3 = f2 - 1.0f;
                    return ((float) java.lang.Math.pow(2.0d, 10.0f * f3)) * ((float) java.lang.Math.sin((((double) ((f3 * 1.0f) - fAsin)) * 6.283185307179586d) / ((double) 0.45000002f))) * (-0.5f);
                }
                float f4 = f2 - 1.0f;
                return (((float) java.lang.Math.pow(2.0d, (-10.0f) * f4)) * ((float) java.lang.Math.sin((((double) ((f4 * 1.0f) - fAsin)) * 6.283185307179586d) / ((double) 0.45000002f))) * 0.5f) + 1.0f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInBack = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.23
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * ((f * 2.70158f) - 1.70158f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutBack = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.24
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * ((f2 * 2.70158f) + 1.70158f)) + 1.0f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutBack = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.25
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f / 0.5f;
                if (f2 < 1.0f) {
                    return f2 * f2 * ((3.5949094f * f2) - 2.5949094f) * 0.5f;
                }
                float f3 = f2 - 2.0f;
                return ((f3 * f3 * ((3.5949094f * f3) + 2.5949094f)) + 2.0f) * 0.5f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInBounce = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.26
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return 1.0f - com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutBounce.getInterpolation(1.0f - f);
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseOutBounce = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.27
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f2 = f - 0.54545456f;
                    return (7.5625f * f2 * f2) + 0.75f;
                }
                if (f < 0.90909094f) {
                    float f3 = f - 0.8181818f;
                    return (7.5625f * f3 * f3) + 0.9375f;
                }
                float f4 = f - 0.95454544f;
                return (7.5625f * f4 * f4) + 0.984375f;
            }
        };
        public static final com.github.mikephil.charting.animation.EasingFunction EaseInOutBounce = new com.github.mikephil.charting.animation.EasingFunction() { // from class: com.github.mikephil.charting.animation.Easing.EasingFunctions.28
            @Override // com.github.mikephil.charting.animation.EasingFunction, android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                if (f < 0.5f) {
                    return com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseInBounce.getInterpolation(f * 2.0f) * 0.5f;
                }
                return (com.github.mikephil.charting.animation.Easing.EasingFunctions.EaseOutBounce.getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
            }
        };

        private EasingFunctions() {
        }
    }
}
