// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
final class constants$282 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$282() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_main_context_invoke$function.class, "apply", constants$10.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_main_context_invoke",
        constants$14.const$3
    );
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("g_timeout_funcs", constants$260.const$1);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("g_child_watch_funcs", constants$260.const$1);
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("g_idle_funcs", constants$260.const$1);
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("g_unix_signal_funcs", constants$260.const$1);
}

