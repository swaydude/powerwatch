package com.bugfender.sdk;

/* JADX INFO: loaded from: classes.dex */
public class e2 extends com.bugfender.sdk.n {
    private android.view.View e;

    private class a implements android.widget.SeekBar.OnSeekBarChangeListener {
        private final android.widget.SeekBar.OnSeekBarChangeListener a;

        public a(android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
            this.a = onSeekBarChangeListener;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            com.bugfender.sdk.e2.this.a("OnProgressChanged in SeekBar with { id: " + seekBar.getId() + ", progress: " + seekBar.getProgress() + " }");
            android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
            android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
            android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }
    }

    public e2(com.bugfender.sdk.k1 k1Var, boolean z, boolean z2) {
        super(k1Var, z, z2);
    }

    @Override // com.bugfender.sdk.n, com.bugfender.sdk.f3
    public void a() {
        ((android.widget.SeekBar) this.e).setOnSeekBarChangeListener(null);
        this.e = null;
        super.a();
    }

    @Override // com.bugfender.sdk.f3
    public <T extends android.view.View> void a(T t) {
        this.e = t;
        ((android.widget.SeekBar) t).setOnSeekBarChangeListener(new com.bugfender.sdk.e2.a(com.bugfender.sdk.c1.d(t)));
    }
}
