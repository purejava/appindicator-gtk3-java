// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1030 {

    static final FunctionDescriptor hb_buffer_set_content_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_content_type$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_content_type",
        constants$1030.hb_buffer_set_content_type$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_content_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_content_type$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_content_type",
        constants$1030.hb_buffer_get_content_type$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_unicode_funcs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_set_unicode_funcs$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_unicode_funcs",
        constants$1030.hb_buffer_set_unicode_funcs$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_unicode_funcs$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_unicode_funcs$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_unicode_funcs",
        constants$1030.hb_buffer_get_unicode_funcs$FUNC
    );
    static final FunctionDescriptor hb_buffer_set_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_direction$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_direction",
        constants$1030.hb_buffer_set_direction$FUNC
    );
    static final FunctionDescriptor hb_buffer_get_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_direction$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_direction",
        constants$1030.hb_buffer_get_direction$FUNC
    );
}


