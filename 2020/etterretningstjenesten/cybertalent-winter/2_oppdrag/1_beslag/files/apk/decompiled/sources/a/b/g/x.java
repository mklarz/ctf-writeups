package a.b.g;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public TextView f237a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f238b;

    public x(TextView textView) {
        this.f237a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f238b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f237a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }
}
