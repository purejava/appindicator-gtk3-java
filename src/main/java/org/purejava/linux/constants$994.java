// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$994 {

    static final FunctionDescriptor hb_unicode_funcs_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_create$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_create",
        constants$994.hb_unicode_funcs_create$FUNC
    );
    static final FunctionDescriptor hb_unicode_funcs_get_empty$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_unicode_funcs_get_empty$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_get_empty",
        constants$994.hb_unicode_funcs_get_empty$FUNC
    );
    static final FunctionDescriptor hb_unicode_funcs_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_reference$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_reference",
        constants$994.hb_unicode_funcs_reference$FUNC
    );
    static final FunctionDescriptor hb_unicode_funcs_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_destroy$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_destroy",
        constants$994.hb_unicode_funcs_destroy$FUNC
    );
    static final FunctionDescriptor hb_unicode_funcs_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_set_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_set_user_data",
        constants$994.hb_unicode_funcs_set_user_data$FUNC
    );
    static final FunctionDescriptor hb_unicode_funcs_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_get_user_data",
        constants$994.hb_unicode_funcs_get_user_data$FUNC
    );
}

