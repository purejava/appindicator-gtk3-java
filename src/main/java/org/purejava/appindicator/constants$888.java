// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$888 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$888() {}
    static final FunctionDescriptor hb_buffer_serialize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_serialize$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_serialize",
        constants$888.hb_buffer_serialize$FUNC
    );
    static final FunctionDescriptor hb_buffer_deserialize_glyphs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_deserialize_glyphs$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_deserialize_glyphs",
        constants$888.hb_buffer_deserialize_glyphs$FUNC
    );
    static final FunctionDescriptor hb_buffer_deserialize_unicode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_deserialize_unicode$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_deserialize_unicode",
        constants$888.hb_buffer_deserialize_unicode$FUNC
    );
    static final FunctionDescriptor hb_buffer_diff$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_diff$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_diff",
        constants$888.hb_buffer_diff$FUNC
    );
    static final FunctionDescriptor hb_buffer_message_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor hb_buffer_message_func_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_message_func_t_UP$MH = RuntimeHelper.upcallHandle(hb_buffer_message_func_t.class, "apply", constants$888.hb_buffer_message_func_t_UP$FUNC);
    static final FunctionDescriptor hb_buffer_message_func_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_message_func_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$888.hb_buffer_message_func_t_DOWN$FUNC
    );
}


