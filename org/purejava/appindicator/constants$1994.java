// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1994 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1994() {}
    static final VarHandle const$0 = constants$1993.const$3.varHandle(MemoryLayout.PathElement.groupElement("width"));
    static final VarHandle const$1 = constants$1993.const$3.varHandle(MemoryLayout.PathElement.groupElement("height"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atk_rectangle_get_type",
        constants$3.const$5
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("add_focus_handler"),
        RuntimeHelper.POINTER.withName("contains"),
        RuntimeHelper.POINTER.withName("ref_accessible_at_point"),
        RuntimeHelper.POINTER.withName("get_extents"),
        RuntimeHelper.POINTER.withName("get_position"),
        RuntimeHelper.POINTER.withName("get_size"),
        RuntimeHelper.POINTER.withName("grab_focus"),
        RuntimeHelper.POINTER.withName("remove_focus_handler"),
        RuntimeHelper.POINTER.withName("set_extents"),
        RuntimeHelper.POINTER.withName("set_position"),
        RuntimeHelper.POINTER.withName("set_size"),
        RuntimeHelper.POINTER.withName("get_layer"),
        RuntimeHelper.POINTER.withName("get_mdi_zorder"),
        RuntimeHelper.POINTER.withName("bounds_changed"),
        RuntimeHelper.POINTER.withName("get_alpha"),
        RuntimeHelper.POINTER.withName("scroll_to"),
        RuntimeHelper.POINTER.withName("scroll_to_point")
    ).withName("_AtkComponentIface");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkComponentIface.add_focus_handler.class, "apply", constants$9.const$0);
    static final VarHandle const$5 = constants$1994.const$3.varHandle(MemoryLayout.PathElement.groupElement("add_focus_handler"));
}


