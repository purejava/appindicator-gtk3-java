// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$381 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$381() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_set_print_handler",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "g_printerr",
        constants$13.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_set_printerr_handler$func.class, "apply", constants$13.const$1);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_set_printerr_handler$return.class, "apply", constants$13.const$1);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_set_printerr_handler",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(GOptionArgFunc.class, "apply", constants$34.const$5);
}

