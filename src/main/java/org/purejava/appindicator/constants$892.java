// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$892 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$892() {}
    static final FunctionDescriptor hb_map_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_map_reference$MH = RuntimeHelper.downcallHandle(
        "hb_map_reference",
        constants$892.hb_map_reference$FUNC
    );
    static final FunctionDescriptor hb_map_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_map_destroy$MH = RuntimeHelper.downcallHandle(
        "hb_map_destroy",
        constants$892.hb_map_destroy$FUNC
    );
    static final FunctionDescriptor hb_map_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_map_set_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_map_set_user_data",
        constants$892.hb_map_set_user_data$FUNC
    );
    static final FunctionDescriptor hb_map_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_map_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_map_get_user_data",
        constants$892.hb_map_get_user_data$FUNC
    );
    static final FunctionDescriptor hb_map_allocation_successful$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_map_allocation_successful$MH = RuntimeHelper.downcallHandle(
        "hb_map_allocation_successful",
        constants$892.hb_map_allocation_successful$FUNC
    );
    static final FunctionDescriptor hb_map_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_map_copy$MH = RuntimeHelper.downcallHandle(
        "hb_map_copy",
        constants$892.hb_map_copy$FUNC
    );
}


