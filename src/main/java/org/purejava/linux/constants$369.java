// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$369 {

    static final FunctionDescriptor pthread_getcpuclockid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_getcpuclockid$MH = RuntimeHelper.downcallHandle(
        "pthread_getcpuclockid",
        constants$369.pthread_getcpuclockid$FUNC
    );
    static final FunctionDescriptor pthread_atfork$__prepare$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__prepare$MH = RuntimeHelper.downcallHandle(
        constants$369.pthread_atfork$__prepare$FUNC
    );
    static final FunctionDescriptor pthread_atfork$__parent$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__parent$MH = RuntimeHelper.downcallHandle(
        constants$369.pthread_atfork$__parent$FUNC
    );
    static final FunctionDescriptor pthread_atfork$__child$FUNC = FunctionDescriptor.ofVoid();
}

