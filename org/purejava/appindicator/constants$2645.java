// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2645 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2645() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_widget_new",
        constants$35.const$2
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_hsv_to_rgb",
        constants$2645.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_rgb_to_hsv",
        constants$2645.const$1
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
            ).withName("parent_instance"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GtkComboBoxText");
    static final VarHandle const$5 = constants$2645.const$4.varHandle(MemoryLayout.PathElement.groupElement("priv"));
}

