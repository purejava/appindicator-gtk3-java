// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1229 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1229() {}
    static final FunctionDescriptor atk_range_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_range_new$MH = RuntimeHelper.downcallHandle(
        "atk_range_new",
        constants$1229.atk_range_new$FUNC
    );
    static final FunctionDescriptor atk_registry_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_registry_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_registry_get_type",
        constants$1229.atk_registry_get_type$FUNC
    );
    static final FunctionDescriptor atk_registry_set_factory_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle atk_registry_set_factory_type$MH = RuntimeHelper.downcallHandle(
        "atk_registry_set_factory_type",
        constants$1229.atk_registry_set_factory_type$FUNC
    );
    static final FunctionDescriptor atk_registry_get_factory_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle atk_registry_get_factory_type$MH = RuntimeHelper.downcallHandle(
        "atk_registry_get_factory_type",
        constants$1229.atk_registry_get_factory_type$FUNC
    );
    static final FunctionDescriptor atk_registry_get_factory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle atk_registry_get_factory$MH = RuntimeHelper.downcallHandle(
        "atk_registry_get_factory",
        constants$1229.atk_registry_get_factory$FUNC
    );
    static final FunctionDescriptor atk_get_default_registry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle atk_get_default_registry$MH = RuntimeHelper.downcallHandle(
        "atk_get_default_registry",
        constants$1229.atk_get_default_registry$FUNC
    );
}


