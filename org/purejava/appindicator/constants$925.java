// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$925 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$925() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_flush",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_add_interface",
        constants$13.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_remove_interface",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_remove_interface_by_name",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_set_object_path",
        constants$13.const$4
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GDBusProxy");
}

