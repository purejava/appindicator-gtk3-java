// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$578 {

    static final FunctionDescriptor tcsetpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tcsetpgrp$MH = RuntimeHelper.downcallHandle(
        "tcsetpgrp",
        constants$578.tcsetpgrp$FUNC
    );
    static final FunctionDescriptor getlogin$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle getlogin$MH = RuntimeHelper.downcallHandle(
        "getlogin",
        constants$578.getlogin$FUNC
    );
    static final FunctionDescriptor getlogin_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getlogin_r$MH = RuntimeHelper.downcallHandle(
        "getlogin_r",
        constants$578.getlogin_r$FUNC
    );
    static final FunctionDescriptor setlogin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setlogin$MH = RuntimeHelper.downcallHandle(
        "setlogin",
        constants$578.setlogin$FUNC
    );
    static final  OfAddress optarg$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle optarg$VH = constants$578.optarg$LAYOUT.varHandle();
    static final MemorySegment optarg$SEGMENT = RuntimeHelper.lookupGlobalVariable("optarg", constants$578.optarg$LAYOUT);
    static final  OfInt optind$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle optind$VH = constants$578.optind$LAYOUT.varHandle();
    static final MemorySegment optind$SEGMENT = RuntimeHelper.lookupGlobalVariable("optind", constants$578.optind$LAYOUT);
}


