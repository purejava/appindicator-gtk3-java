// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1225 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1225() {}
    static final FunctionDescriptor atk_image_get_image_locale$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_image_get_image_locale$MH = RuntimeHelper.downcallHandle(
        "atk_image_get_image_locale",
        constants$1225.atk_image_get_image_locale$FUNC
    );
    static final OfAddress atk_misc_instance$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle atk_misc_instance$VH = constants$1225.atk_misc_instance$LAYOUT.varHandle();
    static final MemorySegment atk_misc_instance$SEGMENT = RuntimeHelper.lookupGlobalVariable("atk_misc_instance", constants$1225.atk_misc_instance$LAYOUT);
    static final FunctionDescriptor atk_misc_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_misc_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_misc_get_type",
        constants$1225.atk_misc_get_type$FUNC
    );
    static final FunctionDescriptor atk_misc_threads_enter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_misc_threads_enter$MH = RuntimeHelper.downcallHandle(
        "atk_misc_threads_enter",
        constants$1225.atk_misc_threads_enter$FUNC
    );
    static final FunctionDescriptor atk_misc_threads_leave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_misc_threads_leave$MH = RuntimeHelper.downcallHandle(
        "atk_misc_threads_leave",
        constants$1225.atk_misc_threads_leave$FUNC
    );
    static final FunctionDescriptor atk_misc_get_instance$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle atk_misc_get_instance$MH = RuntimeHelper.downcallHandle(
        "atk_misc_get_instance",
        constants$1225.atk_misc_get_instance$FUNC
    );
}


