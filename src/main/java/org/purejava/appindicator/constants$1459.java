// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1459 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1459() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$1243.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(hb_color_line_get_extend_func_t.class, "apply", constants$12.const$2);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("data"),
        RuntimeHelper.POINTER.withName("get_color_stops"),
        RuntimeHelper.POINTER.withName("get_color_stops_user_data"),
        RuntimeHelper.POINTER.withName("get_extend"),
        RuntimeHelper.POINTER.withName("get_extend_user_data"),
        RuntimeHelper.POINTER.withName("reserved0"),
        RuntimeHelper.POINTER.withName("reserved1"),
        RuntimeHelper.POINTER.withName("reserved2"),
        RuntimeHelper.POINTER.withName("reserved3"),
        RuntimeHelper.POINTER.withName("reserved5"),
        RuntimeHelper.POINTER.withName("reserved6"),
        RuntimeHelper.POINTER.withName("reserved7"),
        RuntimeHelper.POINTER.withName("reserved8")
    ).withName("hb_color_line_t");
    static final VarHandle const$3 = constants$1459.const$2.varHandle(MemoryLayout.PathElement.groupElement("data"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(hb_color_line_t.get_color_stops.class, "apply", constants$1243.const$0);
    static final VarHandle const$5 = constants$1459.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_color_stops"));
}


