// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1337 {

    static final FunctionDescriptor gdk_keymap_map_virtual_modifiers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_keymap_map_virtual_modifiers$MH = RuntimeHelper.downcallHandle(
        "gdk_keymap_map_virtual_modifiers",
        constants$1337.gdk_keymap_map_virtual_modifiers$FUNC
    );
    static final FunctionDescriptor gdk_keymap_get_modifier_mask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keymap_get_modifier_mask$MH = RuntimeHelper.downcallHandle(
        "gdk_keymap_get_modifier_mask",
        constants$1337.gdk_keymap_get_modifier_mask$FUNC
    );
    static final FunctionDescriptor gdk_keyval_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyval_name$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_name",
        constants$1337.gdk_keyval_name$FUNC
    );
    static final FunctionDescriptor gdk_keyval_from_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_keyval_from_name$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_from_name",
        constants$1337.gdk_keyval_from_name$FUNC
    );
    static final FunctionDescriptor gdk_keyval_convert_case$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_keyval_convert_case$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_convert_case",
        constants$1337.gdk_keyval_convert_case$FUNC
    );
    static final FunctionDescriptor gdk_keyval_to_upper$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyval_to_upper$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_to_upper",
        constants$1337.gdk_keyval_to_upper$FUNC
    );
}


