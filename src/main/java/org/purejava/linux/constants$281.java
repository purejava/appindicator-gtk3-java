// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$281 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$281() {}
    static final FunctionDescriptor g_rand_new_with_seed_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_rand_new_with_seed_array$MH = RuntimeHelper.downcallHandle(
        "g_rand_new_with_seed_array",
        constants$281.g_rand_new_with_seed_array$FUNC
    );
    static final FunctionDescriptor g_rand_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_rand_new$MH = RuntimeHelper.downcallHandle(
        "g_rand_new",
        constants$281.g_rand_new$FUNC
    );
    static final FunctionDescriptor g_rand_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rand_free$MH = RuntimeHelper.downcallHandle(
        "g_rand_free",
        constants$281.g_rand_free$FUNC
    );
    static final FunctionDescriptor g_rand_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rand_copy$MH = RuntimeHelper.downcallHandle(
        "g_rand_copy",
        constants$281.g_rand_copy$FUNC
    );
    static final FunctionDescriptor g_rand_set_seed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_rand_set_seed$MH = RuntimeHelper.downcallHandle(
        "g_rand_set_seed",
        constants$281.g_rand_set_seed$FUNC
    );
    static final FunctionDescriptor g_rand_set_seed_array$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_rand_set_seed_array$MH = RuntimeHelper.downcallHandle(
        "g_rand_set_seed_array",
        constants$281.g_rand_set_seed_array$FUNC
    );
}


