// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$563 {

    static final FunctionDescriptor g_content_type_get_symbolic_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_content_type_get_symbolic_icon$MH = RuntimeHelper.downcallHandle(
        "g_content_type_get_symbolic_icon",
        constants$563.g_content_type_get_symbolic_icon$FUNC
    );
    static final FunctionDescriptor g_content_type_get_generic_icon_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_content_type_get_generic_icon_name$MH = RuntimeHelper.downcallHandle(
        "g_content_type_get_generic_icon_name",
        constants$563.g_content_type_get_generic_icon_name$FUNC
    );
    static final FunctionDescriptor g_content_type_can_be_executable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_content_type_can_be_executable$MH = RuntimeHelper.downcallHandle(
        "g_content_type_can_be_executable",
        constants$563.g_content_type_can_be_executable$FUNC
    );
    static final FunctionDescriptor g_content_type_from_mime_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_content_type_from_mime_type$MH = RuntimeHelper.downcallHandle(
        "g_content_type_from_mime_type",
        constants$563.g_content_type_from_mime_type$FUNC
    );
    static final FunctionDescriptor g_content_type_guess$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_content_type_guess$MH = RuntimeHelper.downcallHandle(
        "g_content_type_guess",
        constants$563.g_content_type_guess$FUNC
    );
    static final FunctionDescriptor g_content_type_guess_for_tree$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_content_type_guess_for_tree$MH = RuntimeHelper.downcallHandle(
        "g_content_type_guess_for_tree",
        constants$563.g_content_type_guess_for_tree$FUNC
    );
}

