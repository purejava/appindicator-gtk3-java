// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$909 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$909() {}
    static final FunctionDescriptor pango_font_description_get_stretch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_get_stretch$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_get_stretch",
        constants$909.pango_font_description_get_stretch$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_description_set_size$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_size",
        constants$909.pango_font_description_set_size$FUNC
    );
    static final FunctionDescriptor pango_font_description_get_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_get_size$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_get_size",
        constants$909.pango_font_description_get_size$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_absolute_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_font_description_set_absolute_size$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_absolute_size",
        constants$909.pango_font_description_set_absolute_size$FUNC
    );
    static final FunctionDescriptor pango_font_description_get_size_is_absolute$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_get_size_is_absolute$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_get_size_is_absolute",
        constants$909.pango_font_description_get_size_is_absolute$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_gravity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_description_set_gravity$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_gravity",
        constants$909.pango_font_description_set_gravity$FUNC
    );
}


