// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$361 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$361() {}
    static final FunctionDescriptor pthread_setcanceltype$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setcanceltype$MH = RuntimeHelper.downcallHandle(
        "pthread_setcanceltype",
        constants$361.pthread_setcanceltype$FUNC
    );
    static final FunctionDescriptor pthread_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_cancel$MH = RuntimeHelper.downcallHandle(
        "pthread_cancel",
        constants$361.pthread_cancel$FUNC
    );
    static final FunctionDescriptor pthread_testcancel$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_testcancel$MH = RuntimeHelper.downcallHandle(
        "pthread_testcancel",
        constants$361.pthread_testcancel$FUNC
    );
    static final FunctionDescriptor __pthread_register_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_register_cancel$MH = RuntimeHelper.downcallHandle(
        "__pthread_register_cancel",
        constants$361.__pthread_register_cancel$FUNC
    );
    static final FunctionDescriptor __pthread_unregister_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_unregister_cancel$MH = RuntimeHelper.downcallHandle(
        "__pthread_unregister_cancel",
        constants$361.__pthread_unregister_cancel$FUNC
    );
    static final FunctionDescriptor __pthread_unwind_next$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_unwind_next$MH = RuntimeHelper.downcallHandle(
        "__pthread_unwind_next",
        constants$361.__pthread_unwind_next$FUNC
    );
}


