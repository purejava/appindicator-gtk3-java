// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1178 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1178() {}
    static final FunctionDescriptor gdk_keyboard_grab$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyboard_grab$MH = RuntimeHelper.downcallHandle(
        "gdk_keyboard_grab",
        constants$1178.gdk_keyboard_grab$FUNC
    );
    static final FunctionDescriptor gdk_pointer_ungrab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pointer_ungrab$MH = RuntimeHelper.downcallHandle(
        "gdk_pointer_ungrab",
        constants$1178.gdk_pointer_ungrab$FUNC
    );
    static final FunctionDescriptor gdk_keyboard_ungrab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyboard_ungrab$MH = RuntimeHelper.downcallHandle(
        "gdk_keyboard_ungrab",
        constants$1178.gdk_keyboard_ungrab$FUNC
    );
    static final FunctionDescriptor gdk_pointer_is_grabbed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_pointer_is_grabbed$MH = RuntimeHelper.downcallHandle(
        "gdk_pointer_is_grabbed",
        constants$1178.gdk_pointer_is_grabbed$FUNC
    );
    static final FunctionDescriptor gdk_screen_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_screen_width$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_width",
        constants$1178.gdk_screen_width$FUNC
    );
    static final FunctionDescriptor gdk_screen_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_screen_height$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_height",
        constants$1178.gdk_screen_height$FUNC
    );
}


