// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1407 {

    static final FunctionDescriptor atk_registry_get_factory_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle atk_registry_get_factory_type$MH = RuntimeHelper.downcallHandle(
        "atk_registry_get_factory_type",
        constants$1407.atk_registry_get_factory_type$FUNC
    );
    static final FunctionDescriptor atk_registry_get_factory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle atk_registry_get_factory$MH = RuntimeHelper.downcallHandle(
        "atk_registry_get_factory",
        constants$1407.atk_registry_get_factory$FUNC
    );
    static final FunctionDescriptor atk_get_default_registry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle atk_get_default_registry$MH = RuntimeHelper.downcallHandle(
        "atk_get_default_registry",
        constants$1407.atk_get_default_registry$FUNC
    );
    static final FunctionDescriptor atk_relation_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_relation_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_relation_get_type",
        constants$1407.atk_relation_get_type$FUNC
    );
    static final FunctionDescriptor atk_relation_type_register$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_type_register$MH = RuntimeHelper.downcallHandle(
        "atk_relation_type_register",
        constants$1407.atk_relation_type_register$FUNC
    );
    static final FunctionDescriptor atk_relation_type_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_relation_type_get_name$MH = RuntimeHelper.downcallHandle(
        "atk_relation_type_get_name",
        constants$1407.atk_relation_type_get_name$FUNC
    );
}

