// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$529 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$529() {}
    static final FunctionDescriptor setregid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setregid$MH = RuntimeHelper.downcallHandle(
        "setregid",
        constants$529.setregid$FUNC
    );
    static final FunctionDescriptor setegid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle setegid$MH = RuntimeHelper.downcallHandle(
        "setegid",
        constants$529.setegid$FUNC
    );
    static final FunctionDescriptor fork$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle fork$MH = RuntimeHelper.downcallHandle(
        "fork",
        constants$529.fork$FUNC
    );
    static final FunctionDescriptor vfork$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle vfork$MH = RuntimeHelper.downcallHandle(
        "vfork",
        constants$529.vfork$FUNC
    );
    static final FunctionDescriptor ttyname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle ttyname$MH = RuntimeHelper.downcallHandle(
        "ttyname",
        constants$529.ttyname$FUNC
    );
    static final FunctionDescriptor ttyname_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ttyname_r$MH = RuntimeHelper.downcallHandle(
        "ttyname_r",
        constants$529.ttyname_r$FUNC
    );
}


