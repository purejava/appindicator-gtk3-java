// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$153 {

    static final FunctionDescriptor GHookFindFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFindFunc$MH = RuntimeHelper.downcallHandle(
        constants$153.GHookFindFunc$FUNC
    );
    static final FunctionDescriptor GHookMarshaller$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookMarshaller$MH = RuntimeHelper.downcallHandle(
        constants$153.GHookMarshaller$FUNC
    );
    static final FunctionDescriptor GHookCheckMarshaller$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckMarshaller$MH = RuntimeHelper.downcallHandle(
        constants$153.GHookCheckMarshaller$FUNC
    );
}

