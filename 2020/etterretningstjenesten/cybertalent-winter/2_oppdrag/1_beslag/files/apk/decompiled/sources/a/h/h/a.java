package a.h.h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

public class a implements Spannable {

    /* renamed from: a.h.h.a$a  reason: collision with other inner class name */
    public static final class C0012a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f492a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f493b;

        /* renamed from: c  reason: collision with root package name */
        public final int f494c;
        public final int d;

        public C0012a(PrecomputedText.Params params) {
            this.f492a = params.getTextPaint();
            this.f493b = params.getTextDirection();
            this.f494c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        public C0012a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f492a = textPaint;
            this.f493b = textDirectionHeuristic;
            this.f494c = i;
            this.d = i2;
        }

        public boolean a(C0012a aVar) {
            if (this.f494c != aVar.f494c || this.d != aVar.d || this.f492a.getTextSize() != aVar.f492a.getTextSize() || this.f492a.getTextScaleX() != aVar.f492a.getTextScaleX() || this.f492a.getTextSkewX() != aVar.f492a.getTextSkewX() || this.f492a.getLetterSpacing() != aVar.f492a.getLetterSpacing() || !TextUtils.equals(this.f492a.getFontFeatureSettings(), aVar.f492a.getFontFeatureSettings()) || this.f492a.getFlags() != aVar.f492a.getFlags() || !this.f492a.getTextLocales().equals(aVar.f492a.getTextLocales())) {
                return false;
            }
            if (this.f492a.getTypeface() == null) {
                if (aVar.f492a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f492a.getTypeface().equals(aVar.f492a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0012a)) {
                return false;
            }
            C0012a aVar = (C0012a) obj;
            return a(aVar) && this.f493b == aVar.f493b;
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.f492a.getTextSize()), Float.valueOf(this.f492a.getTextScaleX()), Float.valueOf(this.f492a.getTextSkewX()), Float.valueOf(this.f492a.getLetterSpacing()), Integer.valueOf(this.f492a.getFlags()), this.f492a.getTextLocales(), this.f492a.getTypeface(), Boolean.valueOf(this.f492a.isElegantTextHeight()), this.f493b, Integer.valueOf(this.f494c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder d2 = b.a.a.a.a.d("textSize=");
            d2.append(this.f492a.getTextSize());
            sb.append(d2.toString());
            sb.append(", textScaleX=" + this.f492a.getTextScaleX());
            sb.append(", textSkewX=" + this.f492a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f492a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f492a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f492a.getTextLocales());
            sb.append(", typeface=" + this.f492a.getTypeface());
            sb.append(", variationSettings=" + this.f492a.getFontVariationSettings());
            sb.append(", textDir=" + this.f493b);
            sb.append(", breakStrategy=" + this.f494c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }
    }

    public char charAt(int i) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i4 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
