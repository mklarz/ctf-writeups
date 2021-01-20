package a.m;

import java.util.concurrent.atomic.AtomicReference;

public abstract class d {

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public d() {
        new AtomicReference();
    }

    public abstract void a(f fVar);
}
