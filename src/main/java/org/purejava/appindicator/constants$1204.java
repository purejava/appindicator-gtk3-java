// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1204 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1204() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_notification_set_default_action",
        constants$13.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandleVariadic(
        "g_notification_set_default_action_and_target",
        constants$14.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_notification_set_default_action_and_target_value",
        constants$14.const$3
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GPermission");
    static final VarHandle const$4 = constants$1204.const$3.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                JAVA_LONG.withName("g_type")
            ).withName("g_type_class"),
            RuntimeHelper.POINTER.withName("construct_properties"),
            RuntimeHelper.POINTER.withName("constructor"),
            RuntimeHelper.POINTER.withName("set_property"),
            RuntimeHelper.POINTER.withName("get_property"),
            RuntimeHelper.POINTER.withName("dispose"),
            RuntimeHelper.POINTER.withName("finalize"),
            RuntimeHelper.POINTER.withName("dispatch_properties_changed"),
            RuntimeHelper.POINTER.withName("notify"),
            RuntimeHelper.POINTER.withName("constructed"),
            JAVA_LONG.withName("flags"),
            JAVA_LONG.withName("n_construct_properties"),
            RuntimeHelper.POINTER.withName("pspecs"),
            JAVA_LONG.withName("n_pspecs"),
            MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("pdummy")
        ).withName("parent_class"),
        RuntimeHelper.POINTER.withName("acquire"),
        RuntimeHelper.POINTER.withName("acquire_async"),
        RuntimeHelper.POINTER.withName("acquire_finish"),
        RuntimeHelper.POINTER.withName("release"),
        RuntimeHelper.POINTER.withName("release_async"),
        RuntimeHelper.POINTER.withName("release_finish"),
        MemoryLayout.sequenceLayout(16, RuntimeHelper.POINTER).withName("reserved")
    ).withName("_GPermissionClass");
}


