// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1720 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1720() {}
    static final VarHandle const$0 = constants$1719.const$4.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final VarHandle const$1 = constants$1719.const$4.varHandle(MemoryLayout.PathElement.groupElement("num_data"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "cairo_copy_path",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "cairo_copy_path_flat",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "cairo_append_path",
        constants$13.const$4
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "cairo_path_destroy",
        constants$13.const$1
    );
}


