// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$329 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$329() {}
    static final FunctionDescriptor g_trash_stack_push$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_trash_stack_push$MH = RuntimeHelper.downcallHandle(
        "g_trash_stack_push",
        constants$329.g_trash_stack_push$FUNC
    );
    static final FunctionDescriptor g_trash_stack_pop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_trash_stack_pop$MH = RuntimeHelper.downcallHandle(
        "g_trash_stack_pop",
        constants$329.g_trash_stack_pop$FUNC
    );
    static final FunctionDescriptor g_trash_stack_peek$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_trash_stack_peek$MH = RuntimeHelper.downcallHandle(
        "g_trash_stack_peek",
        constants$329.g_trash_stack_peek$FUNC
    );
    static final FunctionDescriptor g_trash_stack_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_trash_stack_height$MH = RuntimeHelper.downcallHandle(
        "g_trash_stack_height",
        constants$329.g_trash_stack_height$FUNC
    );
    static final FunctionDescriptor GTraverseFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GTraverseFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTraverseFunc_UP$MH = RuntimeHelper.upcallHandle(GTraverseFunc.class, "apply", constants$329.GTraverseFunc_UP$FUNC);
    static final FunctionDescriptor GTraverseFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTraverseFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$329.GTraverseFunc_DOWN$FUNC
    );
}


