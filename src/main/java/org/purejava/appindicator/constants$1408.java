// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1408 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1408() {}
    static final VarHandle const$0 = constants$1401.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_symbolic_icon"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_volume_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_volume_get_name",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_volume_get_icon",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_volume_get_symbolic_icon",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_volume_get_uuid",
        constants$5.const$2
    );
}

