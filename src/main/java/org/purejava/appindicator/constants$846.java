// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$846 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$846() {}
    static final FunctionDescriptor hb_set_union$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_union$MH = RuntimeHelper.downcallHandle(
        "hb_set_union",
        constants$846.hb_set_union$FUNC
    );
    static final FunctionDescriptor hb_set_intersect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_intersect$MH = RuntimeHelper.downcallHandle(
        "hb_set_intersect",
        constants$846.hb_set_intersect$FUNC
    );
    static final FunctionDescriptor hb_set_subtract$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_subtract$MH = RuntimeHelper.downcallHandle(
        "hb_set_subtract",
        constants$846.hb_set_subtract$FUNC
    );
    static final FunctionDescriptor hb_set_symmetric_difference$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_symmetric_difference$MH = RuntimeHelper.downcallHandle(
        "hb_set_symmetric_difference",
        constants$846.hb_set_symmetric_difference$FUNC
    );
    static final FunctionDescriptor hb_set_get_population$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_get_population$MH = RuntimeHelper.downcallHandle(
        "hb_set_get_population",
        constants$846.hb_set_get_population$FUNC
    );
    static final FunctionDescriptor hb_set_get_min$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_set_get_min$MH = RuntimeHelper.downcallHandle(
        "hb_set_get_min",
        constants$846.hb_set_get_min$FUNC
    );
}


