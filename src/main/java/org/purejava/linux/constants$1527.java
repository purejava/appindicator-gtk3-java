// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1527 {

    static final FunctionDescriptor gtk_label_set_justify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_set_justify$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_justify",
        constants$1527.gtk_label_set_justify$FUNC
    );
    static final FunctionDescriptor gtk_label_get_justify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_justify$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_justify",
        constants$1527.gtk_label_get_justify$FUNC
    );
    static final FunctionDescriptor gtk_label_set_ellipsize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_set_ellipsize$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_ellipsize",
        constants$1527.gtk_label_set_ellipsize$FUNC
    );
    static final FunctionDescriptor gtk_label_get_ellipsize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_ellipsize$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_ellipsize",
        constants$1527.gtk_label_get_ellipsize$FUNC
    );
    static final FunctionDescriptor gtk_label_set_width_chars$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_set_width_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_width_chars",
        constants$1527.gtk_label_set_width_chars$FUNC
    );
    static final FunctionDescriptor gtk_label_get_width_chars$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_width_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_width_chars",
        constants$1527.gtk_label_get_width_chars$FUNC
    );
}

