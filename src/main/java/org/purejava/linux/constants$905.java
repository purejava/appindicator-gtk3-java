// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$905 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$905() {}
    static final FunctionDescriptor pango_gravity_get_for_script$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_gravity_get_for_script$MH = RuntimeHelper.downcallHandle(
        "pango_gravity_get_for_script",
        constants$905.pango_gravity_get_for_script$FUNC
    );
    static final FunctionDescriptor pango_gravity_get_for_script_and_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_gravity_get_for_script_and_width$MH = RuntimeHelper.downcallHandle(
        "pango_gravity_get_for_script_and_width",
        constants$905.pango_gravity_get_for_script_and_width$FUNC
    );
    static final FunctionDescriptor pango_bidi_type_for_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_bidi_type_for_unichar$MH = RuntimeHelper.downcallHandle(
        "pango_bidi_type_for_unichar",
        constants$905.pango_bidi_type_for_unichar$FUNC
    );
    static final FunctionDescriptor pango_unichar_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_unichar_direction$MH = RuntimeHelper.downcallHandle(
        "pango_unichar_direction",
        constants$905.pango_unichar_direction$FUNC
    );
    static final FunctionDescriptor pango_find_base_dir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_find_base_dir$MH = RuntimeHelper.downcallHandle(
        "pango_find_base_dir",
        constants$905.pango_find_base_dir$FUNC
    );
    static final FunctionDescriptor pango_get_mirror_char$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_get_mirror_char$MH = RuntimeHelper.downcallHandle(
        "pango_get_mirror_char",
        constants$905.pango_get_mirror_char$FUNC
    );
}


