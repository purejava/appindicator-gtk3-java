// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$736 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$736() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_app_info_monitor_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_app_info_monitor_get",
        constants$35.const$2
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GApplication");
    static final VarHandle const$3 = constants$736.const$2.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("startup"),
        RuntimeHelper.POINTER.withName("activate"),
        RuntimeHelper.POINTER.withName("open"),
        RuntimeHelper.POINTER.withName("command_line"),
        RuntimeHelper.POINTER.withName("local_command_line"),
        RuntimeHelper.POINTER.withName("before_emit"),
        RuntimeHelper.POINTER.withName("after_emit"),
        RuntimeHelper.POINTER.withName("add_platform_data"),
        RuntimeHelper.POINTER.withName("quit_mainloop"),
        RuntimeHelper.POINTER.withName("run_mainloop"),
        RuntimeHelper.POINTER.withName("shutdown"),
        RuntimeHelper.POINTER.withName("dbus_register"),
        RuntimeHelper.POINTER.withName("dbus_unregister"),
        RuntimeHelper.POINTER.withName("handle_local_options"),
        RuntimeHelper.POINTER.withName("name_lost"),
        MemoryLayout.sequenceLayout(7, RuntimeHelper.POINTER).withName("padding")
    ).withName("_GApplicationClass");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GApplicationClass.startup.class, "apply", constants$13.const$1);
}

