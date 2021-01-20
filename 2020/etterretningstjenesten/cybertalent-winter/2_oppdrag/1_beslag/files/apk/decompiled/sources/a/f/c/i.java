package a.f.c;

import a.f.b.i.d;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class i extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f408b;

    /* renamed from: c  reason: collision with root package name */
    public View f409c;
    public int d;

    public void a() {
        if (this.f409c != null) {
            ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f409c.getLayoutParams();
            aVar2.l0.X = 0;
            d.a j = aVar.l0.j();
            d.a aVar3 = d.a.FIXED;
            if (j != aVar3) {
                aVar.l0.B(aVar2.l0.o());
            }
            if (aVar.l0.n() != aVar3) {
                aVar.l0.w(aVar2.l0.i());
            }
            aVar2.l0.X = 8;
        }
    }

    public View getContent() {
        return this.f409c;
    }

    public int getEmptyVisibility() {
        return this.d;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f408b != i) {
            View view = this.f409c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.a) this.f409c.getLayoutParams()).a0 = false;
                this.f409c = null;
            }
            this.f408b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.d = i;
    }
}
