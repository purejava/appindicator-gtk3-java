// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$77 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$77() {}
    static final FunctionDescriptor sigpending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigpending$MH = RuntimeHelper.downcallHandle(
        "sigpending",
        constants$77.sigpending$FUNC
    );
    static final FunctionDescriptor sigwait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigwait$MH = RuntimeHelper.downcallHandle(
        "sigwait",
        constants$77.sigwait$FUNC
    );
    static final FunctionDescriptor sigwaitinfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigwaitinfo$MH = RuntimeHelper.downcallHandle(
        "sigwaitinfo",
        constants$77.sigwaitinfo$FUNC
    );
    static final FunctionDescriptor sigtimedwait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigtimedwait$MH = RuntimeHelper.downcallHandle(
        "sigtimedwait",
        constants$77.sigtimedwait$FUNC
    );
    static final FunctionDescriptor sigqueue$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("sival_int"),
            Constants$root.C_POINTER$LAYOUT.withName("sival_ptr")
        ).withName("sigval")
    );
    static final MethodHandle sigqueue$MH = RuntimeHelper.downcallHandle(
        "sigqueue",
        constants$77.sigqueue$FUNC
    );
    static final FunctionDescriptor sigreturn$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigreturn$MH = RuntimeHelper.downcallHandle(
        "sigreturn",
        constants$77.sigreturn$FUNC
    );
}

