// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1816 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1816() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_get_current_timings",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_get_refresh_info",
        constants$679.const$5
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("title"),
        JAVA_INT.withName("event_mask"),
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        JAVA_INT.withName("wclass"),
        RuntimeHelper.POINTER.withName("visual"),
        JAVA_INT.withName("window_type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("cursor"),
        RuntimeHelper.POINTER.withName("wmclass_name"),
        RuntimeHelper.POINTER.withName("wmclass_class"),
        JAVA_INT.withName("override_redirect"),
        JAVA_INT.withName("type_hint")
    ).withName("_GdkWindowAttr");
    static final VarHandle const$3 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("title"));
    static final VarHandle const$4 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("event_mask"));
    static final VarHandle const$5 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("x"));
}


