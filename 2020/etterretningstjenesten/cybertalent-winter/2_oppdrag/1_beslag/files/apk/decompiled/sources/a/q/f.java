package a.q;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class f implements TypeEvaluator<Rect> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left;
        int i2 = i + ((int) (((float) (rect4.left - i)) * f));
        int i3 = rect3.top;
        int i4 = i3 + ((int) (((float) (rect4.top - i3)) * f));
        int i5 = rect3.right;
        int i6 = rect3.bottom;
        return new Rect(i2, i4, i5 + ((int) (((float) (rect4.right - i5)) * f)), i6 + ((int) (((float) (rect4.bottom - i6)) * f)));
    }
}
