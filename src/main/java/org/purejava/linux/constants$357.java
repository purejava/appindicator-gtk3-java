// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$357 {

    static final FunctionDescriptor pthread_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_cancel$MH = RuntimeHelper.downcallHandle(
        "pthread_cancel",
        constants$357.pthread_cancel$FUNC
    );
    static final FunctionDescriptor pthread_testcancel$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_testcancel$MH = RuntimeHelper.downcallHandle(
        "pthread_testcancel",
        constants$357.pthread_testcancel$FUNC
    );
    static final FunctionDescriptor __pthread_register_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_register_cancel$MH = RuntimeHelper.downcallHandle(
        "__pthread_register_cancel",
        constants$357.__pthread_register_cancel$FUNC
    );
    static final FunctionDescriptor __pthread_unregister_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_unregister_cancel$MH = RuntimeHelper.downcallHandle(
        "__pthread_unregister_cancel",
        constants$357.__pthread_unregister_cancel$FUNC
    );
    static final FunctionDescriptor __pthread_unwind_next$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __pthread_unwind_next$MH = RuntimeHelper.downcallHandle(
        "__pthread_unwind_next",
        constants$357.__pthread_unwind_next$FUNC
    );
    static final FunctionDescriptor __sigsetjmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __sigsetjmp$MH = RuntimeHelper.downcallHandle(
        "__sigsetjmp",
        constants$357.__sigsetjmp$FUNC
    );
}


