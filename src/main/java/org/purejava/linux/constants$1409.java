// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1409 {

    static final FunctionDescriptor atk_relation_set_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_relation_set_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_get_type",
        constants$1409.atk_relation_set_get_type$FUNC
    );
    static final FunctionDescriptor atk_relation_set_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle atk_relation_set_new$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_new",
        constants$1409.atk_relation_set_new$FUNC
    );
    static final FunctionDescriptor atk_relation_set_contains$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_relation_set_contains$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_contains",
        constants$1409.atk_relation_set_contains$FUNC
    );
    static final FunctionDescriptor atk_relation_set_contains_target$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_set_contains_target$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_contains_target",
        constants$1409.atk_relation_set_contains_target$FUNC
    );
    static final FunctionDescriptor atk_relation_set_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_set_remove$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_remove",
        constants$1409.atk_relation_set_remove$FUNC
    );
    static final FunctionDescriptor atk_relation_set_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_set_add$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_add",
        constants$1409.atk_relation_set_add$FUNC
    );
}

