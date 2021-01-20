package a.q;

import android.view.View;
import no.cybertalent.liberatortoolkit.R;

public class x {
    public float a(View view) {
        Float f = (Float) view.getTag(R.id.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }
}
