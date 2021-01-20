package a.m;

import a.m.d;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class o extends Fragment {
    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void a(d.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof i) {
            ((i) activity).a().d(aVar);
        } else if (activity instanceof g) {
            d a2 = ((g) activity).a();
            if (a2 instanceof h) {
                ((h) a2).d(aVar);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(d.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(d.a.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        a(d.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        a(d.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        a(d.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(d.a.ON_STOP);
    }
}
