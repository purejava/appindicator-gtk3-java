// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3052 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3052() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_scale_get_layout",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_scale_get_layout_offsets",
        constants$14.const$3
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_scale_add_mark",
        constants$3052.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_scale_clear_marks",
        constants$13.const$1
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                RuntimeHelper.POINTER.withName("g_class")
                            ).withName("g_type_instance"),
                            JAVA_INT.withName("ref_count"),
                            MemoryLayout.paddingLayout(4),
                            RuntimeHelper.POINTER.withName("qdata")
                        ).withName("parent_instance"),
                        RuntimeHelper.POINTER.withName("priv")
                    ).withName("widget"),
                    RuntimeHelper.POINTER.withName("priv")
                ).withName("container"),
                RuntimeHelper.POINTER.withName("priv")
            ).withName("bin"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkScaleButton");
}


