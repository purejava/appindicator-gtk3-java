// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1228 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1228() {}
    static final FunctionDescriptor atk_range_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_range_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_range_get_type",
        constants$1228.atk_range_get_type$FUNC
    );
    static final FunctionDescriptor atk_range_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_range_copy$MH = RuntimeHelper.downcallHandle(
        "atk_range_copy",
        constants$1228.atk_range_copy$FUNC
    );
    static final FunctionDescriptor atk_range_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_range_free$MH = RuntimeHelper.downcallHandle(
        "atk_range_free",
        constants$1228.atk_range_free$FUNC
    );
    static final FunctionDescriptor atk_range_get_lower_limit$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_range_get_lower_limit$MH = RuntimeHelper.downcallHandle(
        "atk_range_get_lower_limit",
        constants$1228.atk_range_get_lower_limit$FUNC
    );
    static final FunctionDescriptor atk_range_get_upper_limit$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_range_get_upper_limit$MH = RuntimeHelper.downcallHandle(
        "atk_range_get_upper_limit",
        constants$1228.atk_range_get_upper_limit$FUNC
    );
    static final FunctionDescriptor atk_range_get_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_range_get_description$MH = RuntimeHelper.downcallHandle(
        "atk_range_get_description",
        constants$1228.atk_range_get_description$FUNC
    );
}


