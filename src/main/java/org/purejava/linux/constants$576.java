// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$576 {

    static final FunctionDescriptor isatty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle isatty$MH = RuntimeHelper.downcallHandle(
        "isatty",
        constants$576.isatty$FUNC
    );
    static final FunctionDescriptor ttyslot$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle ttyslot$MH = RuntimeHelper.downcallHandle(
        "ttyslot",
        constants$576.ttyslot$FUNC
    );
    static final FunctionDescriptor link$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle link$MH = RuntimeHelper.downcallHandle(
        "link",
        constants$576.link$FUNC
    );
    static final FunctionDescriptor linkat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle linkat$MH = RuntimeHelper.downcallHandle(
        "linkat",
        constants$576.linkat$FUNC
    );
    static final FunctionDescriptor symlink$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle symlink$MH = RuntimeHelper.downcallHandle(
        "symlink",
        constants$576.symlink$FUNC
    );
    static final FunctionDescriptor readlink$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle readlink$MH = RuntimeHelper.downcallHandle(
        "readlink",
        constants$576.readlink$FUNC
    );
}


