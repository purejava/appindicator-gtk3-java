// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$886 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$886() {}
    static final FunctionDescriptor hb_buffer_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_append$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_append",
        constants$886.hb_buffer_append$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_length$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_length",
        constants$886.hb_buffer_set_length$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_length$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_length",
        constants$886.hb_buffer_get_length$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_glyph_infos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_glyph_infos$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_glyph_infos",
        constants$886.hb_buffer_get_glyph_infos$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_glyph_positions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_glyph_positions$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_glyph_positions",
        constants$886.hb_buffer_get_glyph_positions$FUNC
    );
    static final FunctionDescriptor hb_buffer_has_positions$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_has_positions$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_has_positions",
        constants$886.hb_buffer_has_positions$FUNC
    );
}


