// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1608 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1608() {}
    static final VarHandle const$0 = constants$1607.const$2.varHandle(MemoryLayout.PathElement.groupElement("scripts"));
    static final VarHandle const$1 = constants$1607.const$2.varHandle(MemoryLayout.PathElement.groupElement("n_scripts"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "script_engine_list",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "script_engine_init",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "script_engine_exit",
        constants$7.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "script_engine_create",
        constants$5.const$2
    );
}

