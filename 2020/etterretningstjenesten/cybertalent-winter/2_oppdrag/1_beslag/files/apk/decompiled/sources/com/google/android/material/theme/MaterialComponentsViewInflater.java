package com.google.android.material.theme;

import a.b.c.n;
import a.b.g.f;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import b.b.a.a.f.a;

@Keep
public class MaterialComponentsViewInflater extends n {
    @Override // a.b.c.n
    public f createButton(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}
