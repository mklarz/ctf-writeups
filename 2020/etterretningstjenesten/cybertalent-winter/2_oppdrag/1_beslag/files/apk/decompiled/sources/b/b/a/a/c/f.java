package b.b.a.a.c;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class f implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f1001a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f1002b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f1003c = new Matrix();

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f1001a);
        matrix2.getValues(this.f1002b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f1002b;
            float f2 = fArr[i];
            float[] fArr2 = this.f1001a;
            fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
        }
        this.f1003c.setValues(this.f1002b);
        return this.f1003c;
    }
}
