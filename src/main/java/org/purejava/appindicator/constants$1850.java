// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$1850 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1850() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gdk_window_invalidate_rect",
        constants$164.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_window_invalidate_region",
        constants$164.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(GdkWindowChildFunc.class, "apply", constants$9.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(gdk_window_invalidate_maybe_recurse$child_func.class, "apply", constants$9.const$0);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gdk_window_invalidate_maybe_recurse",
        constants$42.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gdk_window_get_update_area",
        constants$5.const$2
    );
}

