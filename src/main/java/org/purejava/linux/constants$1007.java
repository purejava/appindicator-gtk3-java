// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1007 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1007() {}
    static final FunctionDescriptor cairo_clip_preserve$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_clip_preserve$MH = RuntimeHelper.downcallHandle(
        "cairo_clip_preserve",
        constants$1007.cairo_clip_preserve$FUNC
    );
    static final FunctionDescriptor cairo_clip_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_clip_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_clip_extents",
        constants$1007.cairo_clip_extents$FUNC
    );
    static final FunctionDescriptor cairo_copy_clip_rectangle_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_copy_clip_rectangle_list$MH = RuntimeHelper.downcallHandle(
        "cairo_copy_clip_rectangle_list",
        constants$1007.cairo_copy_clip_rectangle_list$FUNC
    );
    static final FunctionDescriptor cairo_rectangle_list_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_rectangle_list_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_rectangle_list_destroy",
        constants$1007.cairo_rectangle_list_destroy$FUNC
    );
    static final FunctionDescriptor cairo_tag_begin$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_tag_begin$MH = RuntimeHelper.downcallHandle(
        "cairo_tag_begin",
        constants$1007.cairo_tag_begin$FUNC
    );
    static final FunctionDescriptor cairo_tag_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_tag_end$MH = RuntimeHelper.downcallHandle(
        "cairo_tag_end",
        constants$1007.cairo_tag_end$FUNC
    );
}


