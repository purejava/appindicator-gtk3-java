// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$154 {

    static final FunctionDescriptor GHookFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFunc$MH = RuntimeHelper.downcallHandle(
        constants$154.GHookFunc$FUNC
    );
    static final FunctionDescriptor GHookCheckFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckFunc$MH = RuntimeHelper.downcallHandle(
        constants$154.GHookCheckFunc$FUNC
    );
    static final FunctionDescriptor GHookFinalizeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFinalizeFunc$MH = RuntimeHelper.downcallHandle(
        constants$154.GHookFinalizeFunc$FUNC
    );
}


