// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1648 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1648() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_PangoRendererClass._pango_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$1641.const$4.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "pango_renderer_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_layout",
        constants$1043.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_layout_line",
        constants$1043.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_glyphs",
        constants$1641.const$5
    );
}

