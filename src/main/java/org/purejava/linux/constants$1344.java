// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1344 {

    static final FunctionDescriptor gdk_pango_layout_line_get_clip_region$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pango_layout_line_get_clip_region$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_layout_line_get_clip_region",
        constants$1344.gdk_pango_layout_line_get_clip_region$FUNC
    );
    static final FunctionDescriptor gdk_pango_layout_get_clip_region$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pango_layout_get_clip_region$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_layout_get_clip_region",
        constants$1344.gdk_pango_layout_get_clip_region$FUNC
    );
    static final FunctionDescriptor gdk_atom_intern$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_atom_intern$MH = RuntimeHelper.downcallHandle(
        "gdk_atom_intern",
        constants$1344.gdk_atom_intern$FUNC
    );
    static final FunctionDescriptor gdk_atom_intern_static_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_atom_intern_static_string$MH = RuntimeHelper.downcallHandle(
        "gdk_atom_intern_static_string",
        constants$1344.gdk_atom_intern_static_string$FUNC
    );
    static final FunctionDescriptor gdk_atom_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_atom_name$MH = RuntimeHelper.downcallHandle(
        "gdk_atom_name",
        constants$1344.gdk_atom_name$FUNC
    );
    static final FunctionDescriptor gdk_property_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_property_get$MH = RuntimeHelper.downcallHandle(
        "gdk_property_get",
        constants$1344.gdk_property_get$FUNC
    );
}


