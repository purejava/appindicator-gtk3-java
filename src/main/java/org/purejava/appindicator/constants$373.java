// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$373 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$373() {}
    static final FunctionDescriptor pthread_setspecific$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setspecific$MH = RuntimeHelper.downcallHandle(
        "pthread_setspecific",
        constants$373.pthread_setspecific$FUNC
    );
    static final FunctionDescriptor pthread_getcpuclockid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_getcpuclockid$MH = RuntimeHelper.downcallHandle(
        "pthread_getcpuclockid",
        constants$373.pthread_getcpuclockid$FUNC
    );
    static final FunctionDescriptor pthread_atfork$__prepare$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor pthread_atfork$__prepare_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__prepare_UP$MH = RuntimeHelper.upcallHandle(pthread_atfork$__prepare.class, "apply", constants$373.pthread_atfork$__prepare_UP$FUNC);
    static final FunctionDescriptor pthread_atfork$__prepare_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__prepare_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$373.pthread_atfork$__prepare_DOWN$FUNC
    );
    static final FunctionDescriptor pthread_atfork$__parent$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor pthread_atfork$__parent_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__parent_UP$MH = RuntimeHelper.upcallHandle(pthread_atfork$__parent.class, "apply", constants$373.pthread_atfork$__parent_UP$FUNC);
    static final FunctionDescriptor pthread_atfork$__parent_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle pthread_atfork$__parent_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$373.pthread_atfork$__parent_DOWN$FUNC
    );
}


