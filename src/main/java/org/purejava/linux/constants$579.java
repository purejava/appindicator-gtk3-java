// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$579 {

    static final  OfInt opterr$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle opterr$VH = constants$579.opterr$LAYOUT.varHandle();
    static final MemorySegment opterr$SEGMENT = RuntimeHelper.lookupGlobalVariable("opterr", constants$579.opterr$LAYOUT);
    static final  OfInt optopt$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle optopt$VH = constants$579.optopt$LAYOUT.varHandle();
    static final MemorySegment optopt$SEGMENT = RuntimeHelper.lookupGlobalVariable("optopt", constants$579.optopt$LAYOUT);
    static final FunctionDescriptor getopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getopt$MH = RuntimeHelper.downcallHandle(
        "getopt",
        constants$579.getopt$FUNC
    );
    static final FunctionDescriptor gethostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gethostname$MH = RuntimeHelper.downcallHandle(
        "gethostname",
        constants$579.gethostname$FUNC
    );
    static final FunctionDescriptor sethostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle sethostname$MH = RuntimeHelper.downcallHandle(
        "sethostname",
        constants$579.sethostname$FUNC
    );
    static final FunctionDescriptor sethostid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle sethostid$MH = RuntimeHelper.downcallHandle(
        "sethostid",
        constants$579.sethostid$FUNC
    );
}


