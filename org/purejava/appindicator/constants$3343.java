// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3343 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3343() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_tooltip_text",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_tooltip_markup",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_x11_window_id",
        constants$10.const$5
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
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("fg"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("bg"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("light"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("dark"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("mid"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("text"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("base"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("_GdkColor")).withName("text_aa"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("black"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("pixel"),
            JAVA_SHORT.withName("red"),
            JAVA_SHORT.withName("green"),
            JAVA_SHORT.withName("blue"),
            MemoryLayout.paddingLayout(2)
        ).withName("white"),
        RuntimeHelper.POINTER.withName("font_desc"),
        JAVA_INT.withName("xthickness"),
        JAVA_INT.withName("ythickness"),
        MemoryLayout.sequenceLayout(5, RuntimeHelper.POINTER).withName("background"),
        JAVA_INT.withName("attach_count"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("visual"),
        RuntimeHelper.POINTER.withName("private_font_desc"),
        RuntimeHelper.POINTER.withName("rc_style"),
        RuntimeHelper.POINTER.withName("styles"),
        RuntimeHelper.POINTER.withName("property_cache"),
        RuntimeHelper.POINTER.withName("icon_factories")
    ).withName("_GtkStyle");
    static final VarHandle const$4 = constants$3343.const$3.varHandle(MemoryLayout.PathElement.groupElement("font_desc"));
    static final VarHandle const$5 = constants$3343.const$3.varHandle(MemoryLayout.PathElement.groupElement("xthickness"));
}


