// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1915 {

    static final FunctionDescriptor gtk_overlay_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_overlay_new$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_new",
        constants$1915.gtk_overlay_new$FUNC
    );
    static final FunctionDescriptor gtk_overlay_add_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_overlay_add_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_add_overlay",
        constants$1915.gtk_overlay_add_overlay$FUNC
    );
    static final FunctionDescriptor gtk_overlay_reorder_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_overlay_reorder_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_reorder_overlay",
        constants$1915.gtk_overlay_reorder_overlay$FUNC
    );
    static final FunctionDescriptor gtk_overlay_get_overlay_pass_through$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_overlay_get_overlay_pass_through$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_get_overlay_pass_through",
        constants$1915.gtk_overlay_get_overlay_pass_through$FUNC
    );
    static final FunctionDescriptor gtk_overlay_set_overlay_pass_through$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_overlay_set_overlay_pass_through$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_set_overlay_pass_through",
        constants$1915.gtk_overlay_set_overlay_pass_through$FUNC
    );
    static final FunctionDescriptor gtk_pad_controller_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_pad_controller_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_pad_controller_get_type",
        constants$1915.gtk_pad_controller_get_type$FUNC
    );
}

