// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3083 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3083() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("origin"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            MemoryLayout.sequenceLayout(2, MemoryLayout.unionLayout(
                JAVA_INT.withName("v_int"),
                JAVA_INT.withName("v_uint"),
                JAVA_LONG.withName("v_long"),
                JAVA_LONG.withName("v_ulong"),
                JAVA_LONG.withName("v_int64"),
                JAVA_LONG.withName("v_uint64"),
                JAVA_FLOAT.withName("v_float"),
                JAVA_DOUBLE.withName("v_double"),
                RuntimeHelper.POINTER.withName("v_pointer")
            ).withName("")).withName("data")
        ).withName("value")
    ).withName("_GtkSettingsValue");
    static final VarHandle const$1 = constants$3083.const$0.varHandle(MemoryLayout.PathElement.groupElement("origin"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_settings_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_settings_get_default",
        constants$35.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_settings_get_for_screen",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_settings_install_property",
        constants$13.const$1
    );
}


