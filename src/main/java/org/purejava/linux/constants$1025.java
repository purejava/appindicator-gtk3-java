// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1025 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1025() {}
    static final FunctionDescriptor cairo_append_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_append_path$MH = RuntimeHelper.downcallHandle(
        "cairo_append_path",
        constants$1025.cairo_append_path$FUNC
    );
    static final FunctionDescriptor cairo_path_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_path_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_path_destroy",
        constants$1025.cairo_path_destroy$FUNC
    );
    static final FunctionDescriptor cairo_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_status$MH = RuntimeHelper.downcallHandle(
        "cairo_status",
        constants$1025.cairo_status$FUNC
    );
    static final FunctionDescriptor cairo_status_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_status_to_string$MH = RuntimeHelper.downcallHandle(
        "cairo_status_to_string",
        constants$1025.cairo_status_to_string$FUNC
    );
    static final FunctionDescriptor cairo_device_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_reference$MH = RuntimeHelper.downcallHandle(
        "cairo_device_reference",
        constants$1025.cairo_device_reference$FUNC
    );
    static final FunctionDescriptor cairo_device_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_get_type$MH = RuntimeHelper.downcallHandle(
        "cairo_device_get_type",
        constants$1025.cairo_device_get_type$FUNC
    );
}


