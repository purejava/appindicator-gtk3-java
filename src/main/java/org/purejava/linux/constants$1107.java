// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1107 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1107() {}
    static final FunctionDescriptor gdk_seat_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_display$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_display",
        constants$1107.gdk_seat_get_display$FUNC
    );
    static final FunctionDescriptor gdk_seat_get_capabilities$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_capabilities$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_capabilities",
        constants$1107.gdk_seat_get_capabilities$FUNC
    );
    static final FunctionDescriptor gdk_seat_get_slaves$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_seat_get_slaves$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_slaves",
        constants$1107.gdk_seat_get_slaves$FUNC
    );
    static final FunctionDescriptor gdk_seat_get_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_pointer$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_pointer",
        constants$1107.gdk_seat_get_pointer$FUNC
    );
    static final FunctionDescriptor gdk_seat_get_keyboard$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_keyboard$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_keyboard",
        constants$1107.gdk_seat_get_keyboard$FUNC
    );
    static final FunctionDescriptor gdk_rectangle_intersect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rectangle_intersect$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_intersect",
        constants$1107.gdk_rectangle_intersect$FUNC
    );
}


