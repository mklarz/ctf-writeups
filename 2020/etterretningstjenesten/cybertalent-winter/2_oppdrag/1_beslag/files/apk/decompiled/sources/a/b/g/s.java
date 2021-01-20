package a.b.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import no.cybertalent.liberatortoolkit.R;

public class s extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    public final q f216b;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        s0.a(this, getContext());
        q qVar = new q(this);
        this.f216b = qVar;
        qVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f216b.f206b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
